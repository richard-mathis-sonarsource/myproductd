package com.mathiric.myproductd;

import java.math.BigDecimal;

public class Rspec2111 {

    double d = 1.1;

    BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
    BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result

}
