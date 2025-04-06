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
 * Tipo: Dados do IPI
 * 
 * <p>Classe Java de TIpi complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="TIpi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CNPJProd" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
 *         <element name="cSelo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <minLength value="1"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="qSelo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="preserve"/>
 *               <pattern value="[0-9]{1,12}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="cEnq">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <minLength value="1"/>
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="IPITrib">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="CST">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <whiteSpace value="preserve"/>
 *                           <enumeration value="00"/>
 *                           <enumeration value="49"/>
 *                           <enumeration value="50"/>
 *                           <enumeration value="99"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <choice>
 *                       <sequence>
 *                         <element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                         <element name="pIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
 *                       </sequence>
 *                       <sequence>
 *                         <element name="qUnid" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
 *                         <element name="vUnid" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
 *                       </sequence>
 *                     </choice>
 *                     <element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="IPINT">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="CST">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <whiteSpace value="preserve"/>
 *                           <enumeration value="01"/>
 *                           <enumeration value="02"/>
 *                           <enumeration value="03"/>
 *                           <enumeration value="04"/>
 *                           <enumeration value="05"/>
 *                           <enumeration value="51"/>
 *                           <enumeration value="52"/>
 *                           <enumeration value="53"/>
 *                           <enumeration value="54"/>
 *                           <enumeration value="55"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIpi", propOrder = {
    "cnpjProd",
    "cSelo",
    "qSelo",
    "cEnq",
    "ipiTrib",
    "ipint"
})
public class TIpi {

    @XmlElement(name = "CNPJProd")
    protected String cnpjProd;
    protected String cSelo;
    protected String qSelo;
    @XmlElement(required = true)
    protected String cEnq;
    @XmlElement(name = "IPITrib")
    protected TIpi.IPITrib ipiTrib;
    @XmlElement(name = "IPINT")
    protected TIpi.IPINT ipint;

    /**
     * Obtém o valor da propriedade cnpjProd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJProd() {
        return cnpjProd;
    }

    /**
     * Define o valor da propriedade cnpjProd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJProd(String value) {
        this.cnpjProd = value;
    }

    /**
     * Obtém o valor da propriedade cSelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSelo() {
        return cSelo;
    }

    /**
     * Define o valor da propriedade cSelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSelo(String value) {
        this.cSelo = value;
    }

    /**
     * Obtém o valor da propriedade qSelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQSelo() {
        return qSelo;
    }

    /**
     * Define o valor da propriedade qSelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQSelo(String value) {
        this.qSelo = value;
    }

    /**
     * Obtém o valor da propriedade cEnq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEnq() {
        return cEnq;
    }

    /**
     * Define o valor da propriedade cEnq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEnq(String value) {
        this.cEnq = value;
    }

    /**
     * Obtém o valor da propriedade ipiTrib.
     * 
     * @return
     *     possible object is
     *     {@link TIpi.IPITrib }
     *     
     */
    public TIpi.IPITrib getIPITrib() {
        return ipiTrib;
    }

    /**
     * Define o valor da propriedade ipiTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link TIpi.IPITrib }
     *     
     */
    public void setIPITrib(TIpi.IPITrib value) {
        this.ipiTrib = value;
    }

    /**
     * Obtém o valor da propriedade ipint.
     * 
     * @return
     *     possible object is
     *     {@link TIpi.IPINT }
     *     
     */
    public TIpi.IPINT getIPINT() {
        return ipint;
    }

    /**
     * Define o valor da propriedade ipint.
     * 
     * @param value
     *     allowed object is
     *     {@link TIpi.IPINT }
     *     
     */
    public void setIPINT(TIpi.IPINT value) {
        this.ipint = value;
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
     *         <element name="CST">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <whiteSpace value="preserve"/>
     *               <enumeration value="01"/>
     *               <enumeration value="02"/>
     *               <enumeration value="03"/>
     *               <enumeration value="04"/>
     *               <enumeration value="05"/>
     *               <enumeration value="51"/>
     *               <enumeration value="52"/>
     *               <enumeration value="53"/>
     *               <enumeration value="54"/>
     *               <enumeration value="55"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
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
        "cst"
    })
    public static class IPINT {

        @XmlElement(name = "CST", required = true)
        protected String cst;

        /**
         * Obtém o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

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
     *         <element name="CST">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <whiteSpace value="preserve"/>
     *               <enumeration value="00"/>
     *               <enumeration value="49"/>
     *               <enumeration value="50"/>
     *               <enumeration value="99"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <choice>
     *           <sequence>
     *             <element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
     *             <element name="pIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
     *           </sequence>
     *           <sequence>
     *             <element name="qUnid" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
     *             <element name="vUnid" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
     *           </sequence>
     *         </choice>
     *         <element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
        "cst",
        "vbc",
        "pipi",
        "qUnid",
        "vUnid",
        "vipi"
    })
    public static class IPITrib {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBC")
        protected String vbc;
        @XmlElement(name = "pIPI")
        protected String pipi;
        protected String qUnid;
        protected String vUnid;
        @XmlElement(name = "vIPI", required = true)
        protected String vipi;

        /**
         * Obtém o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade pipi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIPI() {
            return pipi;
        }

        /**
         * Define o valor da propriedade pipi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIPI(String value) {
            this.pipi = value;
        }

        /**
         * Obtém o valor da propriedade qUnid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUnid() {
            return qUnid;
        }

        /**
         * Define o valor da propriedade qUnid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUnid(String value) {
            this.qUnid = value;
        }

        /**
         * Obtém o valor da propriedade vUnid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVUnid() {
            return vUnid;
        }

        /**
         * Define o valor da propriedade vUnid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVUnid(String value) {
            this.vUnid = value;
        }

        /**
         * Obtém o valor da propriedade vipi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVIPI() {
            return vipi;
        }

        /**
         * Define o valor da propriedade vipi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVIPI(String value) {
            this.vipi = value;
        }

    }

}
