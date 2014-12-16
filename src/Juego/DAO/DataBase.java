/***********************************************
 * Autor: Miguel Angel Lopez Fernandez
 * Autor: Manuel Alejandro Mena Salazar
 * Autor: Luis Carlos Montalvo
 * Código: 1326691 -1329107 - 1329088
 * Fecha: 14-dic-2014
 * Nombre del Archivo: ConnectionConf.java
 * Plan: Ingeniería de Sistemas - 3743
 * Institución Educativa: Universidad del Valle
 * **********************************************/
package Juego.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBase {
    private ConnectionConf connectionConf;
    private ManejoUsuario manejoUsuario;
    private ManejoPuntuacion manejoPuntuacion;
    Connection connection;

    public DataBase(){
        connectionConf = new ConnectionConf();
        connection = connectionConf.conectar();
        manejoPuntuacion = new ManejoPuntuacion(connection);
        manejoUsuario = new ManejoUsuario(connection);
    }



    public ManejoUsuario getUsuaro(){
        return manejoUsuario;
    }

    public ManejoPuntuacion getPuntuacion(){
        return manejoPuntuacion;
    }

}
