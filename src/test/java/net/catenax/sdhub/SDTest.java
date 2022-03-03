package net.catenax.sdhub;

import net.catenax.sdhub.service.DidResolver;
import net.catenax.sdhub.service.VerifierService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SDTest {

    private String sdUrl = "https://catalog.demo.supplytree.org/api/user/5673c857d0/selfdescription";

    @Autowired
    VerifierService verifierService;

    @Autowired
    DidResolver didResolver;
/*
    @Test
    public void validateSDTest() throws JsonLDException, GeneralSecurityException, IOException {
        var vp = WebClient.create(sdUrl)
                .get()
                .header("no-cache", Boolean.toString(true))
                .accept(new MediaType("application", "did+ld+json"))
                .retrieve()
                .bodyToMono(VerifiablePresentation.class)
                .block();
        var verifier = verifiableCredentialService.createVerifier(vp);
        Assert.assertNotNull(verifier);
        Assert.assertTrue(verifier.verifier().verify(vp));
        System.out.printf("VP is authentic and signed by %s\n", verifier.controller());
        var vc = vp.getVerifiableCredential();
        verifier = verifiableCredentialService.createVerifier(vc);
        Assert.assertNotNull(verifier);
        Assert.assertTrue(verifier.verifier().verify(vc));
        System.out.println(vc.getCredentialSubject().toJson(true));
        System.out.printf("VC is authentic and signed by %s\n", verifier.controller());
    }

 */
}
