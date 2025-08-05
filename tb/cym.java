package tb;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes4.dex */
public class cym implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        X509Certificate x509Certificate;
        try {
            String str2 = "verify: certificate is : " + x509Certificate.getSubjectDN().getName();
            cyo.a(str, (X509Certificate) sSLSession.getPeerCertificates()[0], true);
            return true;
        } catch (SSLException e) {
            cyu.c("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
