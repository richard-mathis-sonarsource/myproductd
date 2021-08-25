package com.mathiric.myproductd;

import com.mathiric.common.UserSession;

public class Rspec5164 implements UserSession {

    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public UserSession get() {
        UserSession session = DELEGATE.get();
        return session;
    }

    public void set(UserSession session) {
        DELEGATE.set(session);
    }

    public void incorrectCleanup() {
        DELEGATE.set(null); // Noncompliant
    }

    // some other methods without a call to DELEGATE.remove()
}
