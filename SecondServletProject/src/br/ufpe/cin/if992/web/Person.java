package br.ufpe.cin.if992.web;

/**
 *
 * @author viniciusgarcia
 */
class Person {
    private String name = "Jack Bauer";
    private String address = "Recife";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
