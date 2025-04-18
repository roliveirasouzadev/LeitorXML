//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v4.0.2 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
//


package br.inf.portalfiscal.nfe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do Local de Retirada ou Entrega // 24/10/08 - tamanho mínimo // v2.0
 * 
 * <p>Classe Java de TLocal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="TLocal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *           <element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
 *         </choice>
 *         <element name="xNome" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="xLgr">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="nro">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="xCpl" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="xBairro">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="cMun" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
 *         <element name="xMun">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
 *         <element name="CEP" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="preserve"/>
 *               <pattern value="[0-9]{8}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="cPais" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="preserve"/>
 *               <pattern value="[0-9]{1,4}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="xPais" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <maxLength value="60"/>
 *               <minLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fone" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <whiteSpace value="preserve"/>
 *               <pattern value="[0-9]{6,14}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="email" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               <whiteSpace value="preserve"/>
 *               <minLength value="1"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIe" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLocal", propOrder = {
    "cnpj",
    "cpf",
    "xNome",
    "xLgr",
    "nro",
    "xCpl",
    "xBairro",
    "cMun",
    "xMun",
    "uf",
    "cep",
    "cPais",
    "xPais",
    "fone",
    "email",
    "ie"
})
public class TLocal {

    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "CPF")
    protected String cpf;
    protected String xNome;
    @XmlElement(required = true)
    protected String xLgr;
    @XmlElement(required = true)
    protected String nro;
    protected String xCpl;
    @XmlElement(required = true)
    protected String xBairro;
    @XmlElement(required = true)
    protected String cMun;
    @XmlElement(required = true)
    protected String xMun;
    @XmlElement(name = "UF", required = true)
    @XmlSchemaType(name = "string")
    protected TUf uf;
    @XmlElement(name = "CEP")
    protected String cep;
    protected String cPais;
    protected String xPais;
    protected String fone;
    protected String email;
    @XmlElement(name = "IE")
    protected String ie;

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
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade xNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNome() {
        return xNome;
    }

    /**
     * Define o valor da propriedade xNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNome(String value) {
        this.xNome = value;
    }

    /**
     * Obtém o valor da propriedade xLgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXLgr() {
        return xLgr;
    }

    /**
     * Define o valor da propriedade xLgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXLgr(String value) {
        this.xLgr = value;
    }

    /**
     * Obtém o valor da propriedade nro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNro() {
        return nro;
    }

    /**
     * Define o valor da propriedade nro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNro(String value) {
        this.nro = value;
    }

    /**
     * Obtém o valor da propriedade xCpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCpl() {
        return xCpl;
    }

    /**
     * Define o valor da propriedade xCpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCpl(String value) {
        this.xCpl = value;
    }

    /**
     * Obtém o valor da propriedade xBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXBairro() {
        return xBairro;
    }

    /**
     * Define o valor da propriedade xBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXBairro(String value) {
        this.xBairro = value;
    }

    /**
     * Obtém o valor da propriedade cMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMun() {
        return cMun;
    }

    /**
     * Define o valor da propriedade cMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMun(String value) {
        this.cMun = value;
    }

    /**
     * Obtém o valor da propriedade xMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMun() {
        return xMun;
    }

    /**
     * Define o valor da propriedade xMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMun(String value) {
        this.xMun = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUF(TUf value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEP() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEP(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade cPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPais() {
        return cPais;
    }

    /**
     * Define o valor da propriedade cPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPais(String value) {
        this.cPais = value;
    }

    /**
     * Obtém o valor da propriedade xPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPais() {
        return xPais;
    }

    /**
     * Define o valor da propriedade xPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPais(String value) {
        this.xPais = value;
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
     * Obtém o valor da propriedade ie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIE() {
        return ie;
    }

    /**
     * Define o valor da propriedade ie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIE(String value) {
        this.ie = value;
    }

}
