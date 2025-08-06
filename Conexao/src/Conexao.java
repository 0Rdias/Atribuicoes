import java.sql.*;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/clientes";
    final private String user = "root";
    final private String senha = "1234";
    
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta() {
    boolean result = true;
    try {
    Class.forName(driver);
    conexao = DriverManager.getConnection(url,user,senha);
    JOptionPane.showMessageDialog(null,"Conexão estabelecida ", "mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
    }catch (ClassNotFoundException Driver){
        JOptionPane.showMessageDialog(null, "Driver não localizado" + Driver, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
        result = false;}catch (SQLException Fonte){
         JOptionPane.showMessageDialog(null, "Fonte de dados não localizada" + Fonte, "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
         result = false;
        } return result;
    }
   
    
    
           
        
    
    
   
   



