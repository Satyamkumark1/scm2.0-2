package com.scm.scm20.entities;

/**
 * Enum representing authentication providers for users.
 * Can be used to distinguish between self-registered and OAuth users.
 */
public enum Providers {

    /** Registered via Google OAuth */
    GOOGLE,
    /** Registered via the application's own registration */
    SELF,
    /** Registered via GitHub OAuth */
    GITHUB
}
