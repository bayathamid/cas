
package org.apereo.cas;

import org.apereo.cas.gauth.credential.CouchDbGoogleAuthenticatorTokenCredentialRepositoryTests;
import org.apereo.cas.gauth.token.GoogleAuthenticatorCouchDbTokenRepositoryTests;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@SelectClasses({
    GoogleAuthenticatorCouchDbTokenRepositoryTests.class,
    CouchDbGoogleAuthenticatorTokenCredentialRepositoryTests.class
})
public class AllTestsSuite {
}