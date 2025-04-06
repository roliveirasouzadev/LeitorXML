//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.2 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package br.inf.portalfiscal.nfe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grupo de informações do responsável técnico pelo sistema de emissão de DF-e
 * 
 * <p>Classe Java de TInfRespTec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="TInfRespTec">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *         <element name="xContato">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="email">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <whiteSpace value="preserve"/>
 *               <minLength value="6"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fone">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="preserve"/>
 *               <pattern value="[0-9]{6,14}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence minOccurs="0">
 *           <element name="idCSRT">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <whiteSpace value="preserve"/>
 *                 <pattern value="[0-9]{2}"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="hashCSRT">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                 <length value="20"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInfRespTec", propOrder = {
    "cnpj",
    "xContato",
    "email",
    "fone",
    "idCSRT",
    "hashCSRT"
})
public class TInfRespTec {

    @XmlElement(name = "CNPJ", required = true)
    protected String cnpj;
    @XmlElement(required = true)
    protected String xContato;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String fone;
    protected String idCSRT;
    protected byte[] hashCSRT;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade xContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXContato() {
        return xContato;
    }

    /**
     * Define o valor da propriedade xContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXContato(String value) {
        this.xContato = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade fone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFone() {
        return fone;
    }

    /**
     * Define o valor da propriedade fone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFone(String value) {
        this.fone = value;
    }

    /**
     * Obtém o valor da propriedade idCSRT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCSRT() {
        return idCSRT;
    }

    /**
     * Define o valor da propriedade idCSRT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCSRT(String value) {
        this.idCSRT = value;
    }

    /**
     * Obtém o valor da propriedade hashCSRT.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHashCSRT() {
        return hashCSRT;
    }

    /**
     * Define o valor da propriedade hashCSRT.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHashCSRT(byte[] value) {
        this.hashCSRT = value;
    }

}
