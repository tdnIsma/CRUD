/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.HospitalVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Isma
 */
public class HospitalDAO {

    public void cadastrarHospital(HospitalVO hVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {

            String sql;

            sql = "insert into hospital(nome,telefone,endereco,cnpj,acessibilidade,horarioatendimento)"
                    + "values('" + hVO.getNome() + "','" + hVO.getTelefone() + "','" + hVO.getEndereco() + "','" + hVO.getCnpj()
                    + "','" + hVO.getAcessibilidade() + "','" + hVO.getHorarioatendimento() + "')";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir no banco de dados! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }

    }

    public void buscarHospital() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {

            String sql;

            sql = "select * from hospital";

            ResultSet resultSet = stat.executeQuery(sql);

            while (resultSet.next()) {

                String nome = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");
                String endereco = resultSet.getString("endereco");
                String cnpj = resultSet.getString("cnpj");
                String acessibilidade = resultSet.getString("acessibilidade");
                String horarioatendimento = resultSet.getString("horarioatendimento");

                System.out.println("-".repeat(30));

                System.out.println("Nome: " + nome);
                System.out.println("Telefone: " + telefone);
                System.out.println("Endereço: " + endereco);
                System.out.println("Cnpj: " + cnpj);
                System.out.println("Acessibilidade: " + acessibilidade);
                System.out.println("Horario de atendimento: " + horarioatendimento);

            }

        } catch (SQLException se) {
            throw new SQLException("Erro no banco de dados " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public void filtrar(long cond_query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            
            sql = "select * from hospital where idhospital = " + cond_query;
            
            ResultSet resultSet = stat.executeQuery(sql);


            while (resultSet.next()) {

                int id = resultSet.getInt("idhospital");
                String nome = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");
                String endereco = resultSet.getString("endereco");
                String cnpj = resultSet.getString("cnpj");
                String acessibilidade = resultSet.getString("acessibilidade");
                String horarioatendimento = resultSet.getString("horarioatendimento");

                System.out.println("-".repeat(30)); 

                System.out.println("Id: " + id); 
                System.out.println("Nome: " + nome);
                System.out.println("Telefone: " + telefone);
                System.out.println("Endereço: " + endereco);
                System.out.println("Cnpj: " + cnpj);
                System.out.println("Acessibilidade: " + acessibilidade);
                System.out.println("Horario de atendimento: " + horarioatendimento);

            }

        } catch (SQLException se) {
            throw new SQLException("Erro ao acessar o bd " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
    
        public void deletarHospital(long idHospital) throws SQLException {

        Connection con = ConexaoBanco.getConexao();

        Statement stat = con.createStatement();
        try {
            String sql;

            sql = "delete from hospital where idhospital=" + idHospital;
            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar hospital! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }
    
}
