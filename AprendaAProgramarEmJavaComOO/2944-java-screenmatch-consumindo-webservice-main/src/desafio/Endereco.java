package desafio;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    @SerializedName("CEP")
    private String cep;

    @SerializedName("Logradouro")
    private String logradouro;

    @SerializedName("Complemento")
    private String complemento;

    @SerializedName("Unidade")
    private String unidade;

    @SerializedName("Bairro")
    private String bairro;

    @SerializedName("Localidade")
    private String localidade;

    @SerializedName("UF")
    private String uf;

    @SerializedName("Estado")
    private String estado;

    @SerializedName("Regiao")
    private String regiao;

    @SerializedName("IBGE")
    private String ibge;

    @SerializedName("Gia")
    private String gia;

    @SerializedName("DDD")
    private String ddd;

    @SerializedName("Siafi")
    private String siafi;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}
