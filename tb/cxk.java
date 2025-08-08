package tb;

import android.content.Context;
import android.content.res.Resources;
import mtopsdk.common.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
class cxk implements cxe {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26585a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cxk(Context context, String str) {
        this.f26585a = context;
        this.b = str;
    }

    private static String a(String str) {
        try {
            return "agc_" + cwz.a(a(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static byte[] a(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }

    @Override // tb.cxe
    public String a(String str, String str2) {
        int identifier;
        String a2 = a(str);
        if (!StringUtils.isEmpty(a2) && (identifier = this.f26585a.getResources().getIdentifier(a2, "string", this.b)) != 0) {
            try {
                return this.f26585a.getResources().getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return str2;
            }
        }
        return str2;
    }
}
