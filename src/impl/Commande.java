package impl;

import contract.IVisitor;

public class Commande implements IVisitor{

    private String name;
    private String ligneName;

    public String getLigneName() {
        return ligneName;
    }

    public void setLigneName(String ligneName) {
        this.ligneName = ligneName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor){

    }

    public void addLigne (Ligne l){

    }

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, String ligneName) {
        this.name = name;
        this.ligneName = ligneName;
    }

    public void visit(Client c){

    }

    public void visit(Commande o){

    }

    public void visit (Ligne l){

    }

    public void afficherCommandes(){

    }
}
