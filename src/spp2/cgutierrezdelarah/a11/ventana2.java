/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a11;
import java.awt.*;
/**
 *
 * @author cecigutierrez
 */
public class ventana2 extends Frame{

    private final Button btnNorte,btnSur,btnEste,btnOeste,btnCentro;
  
    @SuppressWarnings("OverridableMethodCallInConstructor")
    
public ventana2 (){
        super("Ventana 2");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("Soy el botón norte");
        add (btnNorte,BorderLayout.NORTH);
        
        btnSur = new Button ("Soy el botón sur");
        add (btnSur,BorderLayout.SOUTH);
        
        btnEste = new Button ("Soy el botón este");
        add (btnEste,BorderLayout.EAST);
        
        btnOeste = new Button ("Soy el botón oeste");
        add (btnOeste,BorderLayout.WEST);
        
        btnCentro = new Button ("Soy el botón centro");
        add (btnCentro,BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);
    
    }
    
}
    

