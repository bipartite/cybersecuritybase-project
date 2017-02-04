/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.project.domain;

import javax.persistence.Entity;


import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author Yuuhaa
 */

@Entity 
public class Admins extends AbstractPersistable<Long>{
    

    private String name;
    private String password;
    
    public Admins(){
        
    }
    
    public void Admins(String name, String password) {
        this.name = name;
        this.password = password;       
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
}
