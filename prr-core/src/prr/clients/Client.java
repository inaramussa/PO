package prr.clients;
import java.io.*;
import java.util.*;
import prr.terminals.*;
import prr.Network;

public class Client implements Serializable {
    private static final long serialVersionUID = 202208091753L;

    

    private String _key;
    private String _name;
    private String _taxId;
    private String _notif;
    private Double _payments;
    private Double _debts;
    private int _numberOfTerminals;
    

    public Client(String key, String name, String taxId){
        _key = key;
        _name = name;
        _taxId = taxId;
        _notif = "YES";
        _payments = 0.0;
        _debts = 0.0;
        _numberOfTerminals = 0;
        
       
    }
    public String getKey() { return _key; }
    public void setKey(String key) { _key = key; } 
    public String getName() { return _name; }
    public void setName(String name) { _name = name; }
    public String getTaxId(){ return _taxId; }
    public void setTaxId(String taxId) { _taxId = taxId; }
    public int getNumbOfTerminals(){ return _numberOfTerminals;}
    public void setNumberOfTerminals(int numberOfTerminals) { _numberOfTerminals = numberOfTerminals; }

    
    


    public String toString() {
        return "CLIENT" + "|" + getKey() + "|" + getName() + "|" + getTaxId() + "|" + "NORMAL" + "|" + _notif +"|"+ _numberOfTerminals  + "|" + (int)Math.round(_payments) + "|" + (int)Math.round(_debts);
        
    }

}
