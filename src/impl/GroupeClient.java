package impl;

import contract.IVisitor;

public class GroupeClient {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor){

    }

    public void addClient (Client c){

    }

    public GroupeClient(String name) {
        this.name = name;
    }
}
