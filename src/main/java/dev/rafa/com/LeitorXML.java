package dev.rafa.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import br.inf.portalfiscal.nfe.TNfeProc;

/**
 * Classe principal para leitura e impressão de dados de uma NF-e a partir de um arquivo XML.
 * O caminho do arquivo é passado via argumentos: -xml <arquivo> -dir <diretorio>.
 */
public class LeitorXML {

	/**
	 * Método principal que interpreta os argumentos e chama o método para processar o XML.
	 * @param args Argumentos: -xml <arquivo.xml> -dir <diretório>
	 */
	public static void main(String[] args) {
		String arquivoXML = "";
		String dirOrigem = "";
		boolean xml = false;
		boolean dir = false;

		// Processa os argumentos passados via linha de comando
		for (String arg : args) {
			if (arg.equals("-xml")) {
				xml = true;
				continue;
			}
			if (xml) {
				xml = false;
				arquivoXML = arg;
				continue;
			}
			if (arg.equals("-dir")) {
				dir = true;
				continue;
			}
			if (dir) {
				dir = false;
				dirOrigem = arg;
			}
		}

		// Monta o caminho completo do arquivo
		String arquivoOrigem = dirOrigem + "\\" + arquivoXML;
		// Lê e processa o XML
		TNfeProc nfe = lerNfeJAXB(arquivoOrigem);

		if (nfe != null) {
			System.out.println("NF-e " + nfe.getNFe().getInfNFe().getIde().getNNF() + " processada com sucesso!");
		}
	}

	/**
	 * Lê e converte o XML da NF-e em objeto Java usando JAXB.
	 * @param caminhoArquivo Caminho absoluto do arquivo XML.
	 * @return Objeto TNfeProc correspondente à NF-e lida.
	 */
	private static TNfeProc lerNfeJAXB(String caminhoArquivo) {
		try {
			// Lê o arquivo XML
			File nfeArquivoXML = new File(caminhoArquivo);
			InputStream inputStream = new FileInputStream(nfeArquivoXML);

			// Inicializa o contexto JAXB com a classe raiz TNfeProc
			JAXBContext jaxbContext = JAXBContext.newInstance(TNfeProc.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// Realiza o unmarshal corretamente usando JAXBElement
			JAXBElement<TNfeProc> elemento = jaxbUnmarshaller.unmarshal(new StreamSource(inputStream), TNfeProc.class);
			return elemento.getValue();
		} catch (Exception e) {
			System.err.println("Erro ao processar o XML da NF-e:");
			e.printStackTrace();
			return null;
		}
	}
}
