package com.highlapp.restserver.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@RestController
public class ServerController {
    private static final Logger log = LoggerFactory.getLogger(ServerController.class);

    @RequestMapping(value = "/resource", produces = {MediaType.APPLICATION_XML})
    public String getFile() {
        String initialString = "<u018:U018 xmlns:u018=\"http://ec.europa.eu/eessi/ns/4_0/U018\" xmlns:xd=\"http://www.w3.org/2000/09/xmldsig#\" sedGVer=\"3\" sedPackage=\"string\" sedVer=\"3\">\n" +
                "  <!--Optional:-->\n" +
                "  <LocalCaseNumbers>\n" +
                "    <!--Zero or more repetitions:-->\n" +
                "    <LocalCaseNumber>\n" +
                "      <country>\n" +
                "        <value>PL</value>\n" +
                "      </country>\n" +
                "      <caseNumber>string</caseNumber>\n" +
                "    </LocalCaseNumber>\n" +
                "  </LocalCaseNumbers>\n" +
                "  <Person>\n" +
                "    <PersonIdentification>\n" +
                "      <familyName>string</familyName>\n" +
                "      <forename>string</forename>\n" +
                "      <dateBirth>2008-09-29</dateBirth>\n" +
                "      <sex>\n" +
                "        <value>02</value>\n" +
                "      </sex>\n" +
                "      <!--Optional:-->\n" +
                "      <familyNameAtBirth>string</familyNameAtBirth>\n" +
                "      <!--Optional:-->\n" +
                "      <forenameAtBirth>string</forenameAtBirth>\n" +
                "      <!--Optional:-->\n" +
                "      <PINPersonInEachInstitution>\n" +
                "        <!--1 or more repetitions:-->\n" +
                "        <PersonalIdentificationNumber>\n" +
                "          <country>\n" +
                "            <value>PL</value>\n" +
                "          </country>\n" +
                "          <personalIdentificationNumber>string</personalIdentificationNumber>\n" +
                "          <!--Optional:-->\n" +
                "          <sector>\n" +
                "            <value>01</value>\n" +
                "          </sector>\n" +
                "        </PersonalIdentificationNumber>\n" +
                "      </PINPersonInEachInstitution>\n" +
                "      <!--Optional:-->\n" +
                "      <IfPINNotProvidedForEveryInstitutionPleaseProvide>\n" +
                "        <!--Optional:-->\n" +
                "        <PlaceBirth>\n" +
                "          <town>string</town>\n" +
                "          <!--Optional:-->\n" +
                "          <region>string</region>\n" +
                "          <country>\n" +
                "            <value>PL</value>\n" +
                "          </country>\n" +
                "        </PlaceBirth>\n" +
                "        <!--Optional:-->\n" +
                "        <fatherFamilyNameAtBirth>string</fatherFamilyNameAtBirth>\n" +
                "        <!--Optional:-->\n" +
                "        <forenameFather>string</forenameFather>\n" +
                "        <!--Optional:-->\n" +
                "        <motherFamilyNameAtBirth>string</motherFamilyNameAtBirth>\n" +
                "        <!--Optional:-->\n" +
                "        <forenameMother>string</forenameMother>\n" +
                "      </IfPINNotProvidedForEveryInstitutionPleaseProvide>\n" +
                "    </PersonIdentification>\n" +
                "    <!--Optional:-->\n" +
                "    <AdditionalInformationPerson>\n" +
                "      <!--Optional:-->\n" +
                "      <nationality>\n" +
                "        <!--1 or more repetitions:-->\n" +
                "        <value>PL</value>\n" +
                "      </nationality>\n" +
                "    </AdditionalInformationPerson>\n" +
                "  </Person>\n" +
                "  <ReferencePeriod>\n" +
                "    <!--You have a CHOICE of the next 2 items at this level-->\n" +
                "    <FixedPeriod>\n" +
                "      <startDate>2014-09-19</startDate>\n" +
                "      <endDate>2006-08-19+02:00</endDate>\n" +
                "    </FixedPeriod>\n" +
                "  </ReferencePeriod>\n" +
                "<ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\" Id=\"id-47f58580f132e20606499e8987cab7f2\"><ds:SignedInfo><ds:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/><ds:SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"/><ds:Reference Id=\"r-id-1\" Type=\"\" URI=\"\"><ds:Transforms><ds:Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><ds:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/></ds:Transforms><ds:DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><ds:DigestValue>CkB5Yl3lJ/SkRq3CE/3eJ9V/WMkrX2JIGP4nhon9zk8=</ds:DigestValue></ds:Reference><ds:Reference Type=\"http://uri.etsi.org/01903#SignedProperties\" URI=\"#xades-id-47f58580f132e20606499e8987cab7f2\"><ds:Transforms><ds:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/></ds:Transforms><ds:DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><ds:DigestValue>lZlSaO/m9AJOVbZFtU9DprM6tGkMHOj8HpyXIUvE9m0=</ds:DigestValue></ds:Reference></ds:SignedInfo><ds:SignatureValue Id=\"value-id-47f58580f132e20606499e8987cab7f2\">Nj33ny8CLj1Y8DPbAtIUGQ1nwn+NrLvNWvDpsPdilL9FWX34FdjNFZGDK6UnUQsuc2R49S3HVD5ELNA5Wg5rM9gBvCcCerxhGCaSHEI3DymYZ4cnQ2/nSHbKjSaATcsHJ69Y3QzCXOg8o5x9u5QP7I8SZ04NxG/rBBqObs8Hbo5xxyGE4qN2SHqEfWmtk4KUNmmkGpjeFc1nnhKTjfD3sibatK+oJzEASDV427rncReiK4Q1CWvtr7cjMDc+jwuBUOXk5YvM74PCxVraRe72f9EhN7BcCkv9dz5/PON7XX0VhicOX8rtI3Twaee3zTqsieuRYIqDBLfHgVn/OJLlfw==</ds:SignatureValue><ds:KeyInfo><ds:X509Data><ds:X509Certificate>MIIFrTCCBJWgAwIBAgIQPZmYoLbMKYS61YoeA2P2ljANBgkqhkiG9w0BAQsFADCBijELMAkGA1UEBhMCUEwxIjAgBgNVBAoMGVVuaXpldG8gVGVjaG5vbG9naWVzIFMuQS4xJzAlBgNVBAsMHkNlcnR1bSBDZXJ0aWZpY2F0aW9uIEF1dGhvcml0eTEuMCwGA1UEAwwlQ2VydHVtIERpZ2l0YWwgSWRlbnRpZmljYXRpb24gQ0EgU0hBMjAeFw0xODA3MDQwNzMzMzlaFw0yMDA3MDMwNzMzMzlaMIHMMQswCQYDVQQGEwJQTDE7MDkGA1UECgwyTUlOSVNURVJTVFdPIFJPRFpJTlksIFBSQUNZIEkgUE9MSVRZS0kgU1BPxYFFQ1pORUoxCzAJBgNVBAsMAkRJMREwDwYDVQQHDAhXYXJzemF3YTEUMBIGA1UECAwLbWF6b3dpZWNraWUxGzAZBgNVBAMMEk1pY2hhxYIgRMSFYnJvd3NraTEtMCsGCSqGSIb3DQEJARYebWljaGFsLmRhYnJvd3NraUBtcnBpcHMuZ292LnBsMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu9YwP3ffXbkqGmYLDDbD3kULZsyyvQiIxSFtl7ASyo4wjSyqCLecHqxJp0Nu1khMPaWwwGjK6vnN0HuIA4tU9TfPAjhaRIeUqYL7LzoB4qB3X3jX5X7asqcr5cRIBoW10QywHNaDg7wIOYSWERKOJCGY+JAIA/SLdukqMjffrNd7DEmgtbYTBpT+m+4rkjyjvqIy78qsSuBC2bIzmuJhquSQ4nUVO/EacLSMltOf1lmkoiUwuVz8YxqKqhn1zxUF4AIVBUKE0+p2sKn9+3Z0mJmsbE7ocZu3Ohm5VOB/f16jbCuuZcQFVZN0WB9Psznb2wZ/HvTQNwO0ikoCh/unwQIDAQABo4IByTCCAcUwDAYDVR0TAQH/BAIwADAyBgNVHR8EKzApMCegJaAjhiFodHRwOi8vY3JsLmNlcnR1bS5wbC9kaWNhc2hhMi5jcmwwcQYIKwYBBQUHAQEEZTBjMCsGCCsGAQUFBzABhh9odHRwOi8vZGljYXNoYTIub2NzcC1jZXJ0dW0uY29tMDQGCCsGAQUFBzAChihodHRwOi8vcmVwb3NpdG9yeS5jZXJ0dW0ucGwvZGljYXNoYTIuY2VyMB8GA1UdIwQYMBaAFD/KWOrxyQl+bjPBI61OrT49bEWnMB0GA1UdDgQWBBQ+vDFT2jXE01ct8ccYZ8RMwjvk3jAdBgNVHRIEFjAUgRJkaWNhc2hhMkBjZXJ0dW0ucGwwDgYDVR0PAQH/BAQDAgTwMEIGA1UdIAQ7MDkwNwYMKoRoAYb2dwIFAQYOMCcwJQYIKwYBBQUHAgEWGWh0dHBzOi8vd3d3LmNlcnR1bS5wbC9DUFMwHQYDVR0lBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMEMBEGCWCGSAGG+EIBAQQEAwIFoDApBgNVHREEIjAggR5taWNoYWwuZGFicm93c2tpQG1ycGlwcy5nb3YucGwwDQYJKoZIhvcNAQELBQADggEBAAHmLxSG2BRdKfeR+XsXQ1PMUi1axxaJe2d2EO0/lQvVD70SSXn2+NvbSkaDZ630DdjUr5RR2IF+8+kogTwjROPJ8sLZhHgpe36Dr+EgNmY6Ygpp78E4fGwCSpcCLPkD/bKSZCn2doHhj+oHOOEvXS4WuPTM+J0yx+VKvcUDTd9jNopMbg+B61f2aI07EZJGaemxx84B1e96kXdcyyp0p7pyybmazGMsMxNNcEduSE3SpJMgCnNG5W/DskuGTXFWjqWvfypKKAuFuOaxdnXRnaJtDBO7B02AupD++CAZpokXRKIBX49th+FJrDCoeMrAwp82RjVIQrIrRyYTJFHo2uw=</ds:X509Certificate></ds:X509Data></ds:KeyInfo><ds:Object><xades:QualifyingProperties xmlns:xades=\"http://uri.etsi.org/01903/v1.3.2#\" Target=\"#id-47f58580f132e20606499e8987cab7f2\"><xades:SignedProperties Id=\"xades-id-47f58580f132e20606499e8987cab7f2\"><xades:SignedSignatureProperties><xades:SigningTime>2018-09-07T11:13:05Z</xades:SigningTime><xades:SigningCertificate><xades:Cert><xades:CertDigest><ds:DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><ds:DigestValue>y93SVdkxB6C+szlBLILh4VMztKAiN46s3yahb9LjRHI=</ds:DigestValue></xades:CertDigest><xades:IssuerSerial><ds:X509IssuerName>CN=Certum Digital Identification CA SHA2,OU=Certum Certification Authority,O=Unizeto Technologies S.A.,C=PL</ds:X509IssuerName><ds:X509SerialNumber>81880424821574542930640872331968509590</ds:X509SerialNumber></xades:IssuerSerial></xades:Cert></xades:SigningCertificate></xades:SignedSignatureProperties><xades:SignedDataObjectProperties><xades:DataObjectFormat ObjectReference=\"#r-id-1\"><xades:MimeType>application/octet-stream</xades:MimeType></xades:DataObjectFormat></xades:SignedDataObjectProperties></xades:SignedProperties></xades:QualifyingProperties></ds:Object></ds:Signature></u018:U018>";
        return initialString;
    }
}
