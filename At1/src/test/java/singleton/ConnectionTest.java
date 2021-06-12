/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class ConnectionTest {
    
    public ConnectionTest() {
    }

    @org.junit.jupiter.api.Test
    public void testServer() {
        String expResult = "localhost";
        Connection.getInstance().setServer(expResult);
        String result = Connection.getInstance().getServer();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testDatabase() {
        String expResult = "LPDatabase";
        Connection.getInstance().setDatabase(expResult);
        String result = Connection.getInstance().getDatabase();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testPort() {
        String expResult = "8080";
        Connection.getInstance().setPort(expResult);
        String result = Connection.getInstance().getPort();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testUser() {
        String expResult = "root";
        Connection.getInstance().setUser(expResult);
        String result = Connection.getInstance().getUser();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testPass() {
        String expResult = "123";
        Connection.getInstance().setPass(expResult);
        String result = Connection.getInstance().getPass();
        assertEquals(expResult, result);
    }    
}
