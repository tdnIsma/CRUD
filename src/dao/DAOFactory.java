/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Isma
 */
public class DAOFactory {

    private static final HospitalDAO hospitalDAO = new HospitalDAO();

    public static HospitalDAO getHospitalDAO() {
        return hospitalDAO;
    }

}
