//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.2 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package br.inf.portalfiscal.nfe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tipo Retorno do Pedido de Autorização da Nota Fiscal Eletrônica
 * 
 * <p>Classe Java de TRetEnviNFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="TRetEnviNFe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         <element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *         <element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *         <element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *         <element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *         <element name="dhRecbto" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
 *         <choice>
 *           <element name="infRec" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="nRec" type="{http://www.portalfiscal.inf.br/nfe}TRec"/>
 *                     <element name="tMed" type="{http://www.portalfiscal.inf.br/nfe}TMed"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="protNFe" type="{http://www.portalfiscal.inf.br/nfe}TProtNFe" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFe" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetEnviNFe", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "cuf",
    "dhRecbto",
    "infRec",
    "protNFe"
})
public class TRetEnviNFe {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String dhRecbto;
    protected TRetEnviNFe.InfRec infRec;
    protected TProtNFe protNFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade verAplic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Define o valor da propriedade verAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Obtém o valor da propriedade cStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Define o valor da propriedade cStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Obtém o valor da propriedade xMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Define o valor da propriedade xMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Obtém o valor da propriedade cuf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Define o valor da propriedade cuf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Obtém o valor da propriedade dhRecbto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhRecbto() {
        return dhRecbto;
    }

    /**
     * Define o valor da propriedade dhRecbto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhRecbto(String value) {
        this.dhRecbto = value;
    }

    /**
     * Obtém o valor da propriedade infRec.
     * 
     * @return
     *     possible object is
     *     {@link TRetEnviNFe.InfRec }
     *     
     */
    public TRetEnviNFe.InfRec getInfRec() {
        return infRec;
    }

    /**
     * Define o valor da propriedade infRec.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEnviNFe.InfRec }
     *     
     */
    public void setInfRec(TRetEnviNFe.InfRec value) {
        this.infRec = value;
    }

    /**
     * Obtém o valor da propriedade protNFe.
     * 
     * @return
     *     possible object is
     *     {@link TProtNFe }
     *     
     */
    public TProtNFe getProtNFe() {
        return protNFe;
    }

    /**
     * Define o valor da propriedade protNFe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtNFe }
     *     
     */
    public void setProtNFe(TProtNFe value) {
        this.protNFe = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="nRec" type="{http://www.portalfiscal.inf.br/nfe}TRec"/>
     *         <element name="tMed" type="{http://www.portalfiscal.inf.br/nfe}TMed"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nRec",
        "tMed"
    })
    public static class InfRec {

        @XmlElement(required = true)
        protected String nRec;
        @XmlElement(required = true)
        protected String tMed;

        /**
         * Obtém o valor da propriedade nRec.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNRec() {
            return nRec;
        }

        /**
         * Define o valor da propriedade nRec.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNRec(String value) {
            this.nRec = value;
        }

        /**
         * Obtém o valor da propriedade tMed.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTMed() {
            return tMed;
        }

        /**
         * Define o valor da propriedade tMed.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTMed(String value) {
            this.tMed = value;
        }

    }

}
