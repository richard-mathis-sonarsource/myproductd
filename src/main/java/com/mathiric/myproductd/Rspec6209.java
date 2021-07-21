package com.mathiric.myproductd;

import java.io.*;

record Rspec6209() implements Serializable {

    @Serial
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // Noncompliant

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException { // Noncompliant

    }
}