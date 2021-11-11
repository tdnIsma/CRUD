/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author Isma
 */
public class ServicosFactory {

    private static final HospitalServicos hospitalServicos = new HospitalServicos();

    public static HospitalServicos getHospitalServicos() {
        return hospitalServicos;
    }

}
