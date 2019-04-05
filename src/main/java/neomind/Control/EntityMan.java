/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package neomind.Control;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gonra
 */
public final class EntityMan {
    private static EntityManagerFactory emt = Persistence.createEntityManagerFactory("FornecedorDBPU");;
    
    public EntityMan()
    {
                 
    }  

    public static EntityManagerFactory getInstance()
    {
        return emt;
    }
    
}
