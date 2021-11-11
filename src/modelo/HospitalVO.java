/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Isma
 */
public class HospitalVO {
    
    private long idHospital;
    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;
    private String acessibilidade;
    private String horarioatendimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public String getHorarioatendimento() {
        return horarioatendimento;
    }

    public void setHorarioatendimento(String horarioatendimento) {
        this.horarioatendimento = horarioatendimento;
    }

    public long getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(long idHospital) {
        this.idHospital = idHospital;
    }
 
    
    
}
