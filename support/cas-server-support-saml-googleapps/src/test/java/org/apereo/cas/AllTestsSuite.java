package org.apereo.cas;

import org.apereo.cas.support.saml.authentication.GoogleAppsSamlAuthenticationRequestTests;
import org.apereo.cas.support.saml.authentication.GoogleSaml20ObjectBuilderTests;
import org.apereo.cas.support.saml.authentication.principal.GoogleAccountsServiceFactoryTests;
import org.apereo.cas.support.saml.authentication.principal.GoogleAccountsServiceTests;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite to run all SAML tests.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    GoogleAppsSamlAuthenticationRequestTests.class,
    GoogleAccountsServiceTests.class,
    GoogleAccountsServiceFactoryTests.class,
    GoogleSaml20ObjectBuilderTests.class
})
@Slf4j
public class AllTestsSuite {
}
