package impl;

import contract.IVisitable;
import contract.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable{
    private String name;
    private List<Commande> commandes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void accept(IVisitor visitor){
        for(Commande o : commandes){
            o.accept(visitor);
        }
    }

    public void addCommande (Commande o){
        this.commandes.add(o);
    }

    public Client(String name) {
        this.name = name;
    }
}
