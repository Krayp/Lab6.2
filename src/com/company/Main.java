package com.company;

class fclass1 {

    public static void main(String[] args) {
        fclass2 test = new fclass2("Шевченко", 25);
        test.displayInfo();
    }

}

class fclass2 {
    protected String street;
    private int number;

    protected fclass2(String street, int number) {
        this.street = street;
        this.number = number;
    }

    protected void displayInfo() {
        System.out.println("Улица: " + street + "\nНомер: " + number);
    }
}