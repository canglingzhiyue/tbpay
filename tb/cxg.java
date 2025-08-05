package tb;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
class cxg implements cxh {

    /* renamed from: a  reason: collision with root package name */
    private SecretKey f26583a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cxg(String str, String str2, String str3, String str4) throws InvalidKeySpecException, NoSuchAlgorithmException, IllegalArgumentException {
        if (str == null || str2 == null || str3 == null || str4 == null) {
            return;
        }
        this.f26583a = cxj.a(cwz.a(str), cwz.a(str2), cwz.a(str3), cwz.a(str4), 5000);
    }

    @Override // tb.cxh
    public String a(String str, String str2) {
        SecretKey secretKey = this.f26583a;
        if (secretKey == null) {
            return str;
        }
        try {
            return new String(cxj.a(secretKey, cwz.a(str)), "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
            return str2;
        }
    }
}
