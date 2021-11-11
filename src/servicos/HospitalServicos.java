/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.HospitalDAO;
import java.sql.SQLException;
import modelo.HospitalVO;

/**
 *
 * @author Isma
 */
public class HospitalServicos {

    public void cadastrarProduto(HospitalVO hVO) throws SQLException {

        HospitalDAO hDAO = DAOFactory.getHospitalDAO();

        hDAO.cadastrarHospital(hVO);
    }

    public void filtrar(Long id) throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        hDAO.filtrar(id);
    }

    public void buscar() throws SQLException {

        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        hDAO.buscarHospital();

    }

    public void deletarHospital(long idhospital) throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        hDAO.deletarHospital(idhospital);
    }

}
