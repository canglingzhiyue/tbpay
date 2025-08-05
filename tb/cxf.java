package tb;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public class cxf implements cxh {

    /* renamed from: a  reason: collision with root package name */
    private final cxe f26582a;
    private SecretKey b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cxf(cxe cxeVar) {
        this.f26582a = cxeVar;
        a();
    }

    private SecretKey a() {
        try {
            String a2 = this.f26582a.a("/code/code1", null);
            String a3 = this.f26582a.a("/code/code2", null);
            String a4 = this.f26582a.a("/code/code3", null);
            String a5 = this.f26582a.a("/code/code4", null);
            if (a2 != null && a3 != null && a4 != null && a5 != null) {
                this.b = cxj.a(cwz.a(a2), cwz.a(a3), cwz.a(a4), cwz.a(a5), 10000);
            }
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
            Log.e("ExclamationMark", "Exception when reading the 'K&I' for 'Config'.");
            this.b = null;
        }
        return this.b;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str);
    }

    static String b(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("ExclamationMark", "getRawString exception");
            return "";
        }
    }

    @Override // tb.cxh
    public String a(String str, String str2) {
        String str3;
        if (this.b == null) {
            str3 = "mKey is null, return default value";
        } else if (!a(str)) {
            return str2;
        } else {
            try {
                return new String(cxj.a(this.b, cwz.a(b(str))), "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused) {
                str3 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
            }
        }
        Log.e("ExclamationMark", str3);
        return str2;
    }
}
