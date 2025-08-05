package tb;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class byx {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26192a;
    private String b;
    private String c;
    private byte[] d = null;

    static {
        kge.a(1184217106);
    }

    public byx(String str, String str2, boolean z) {
        this.f26192a = false;
        this.b = null;
        this.c = null;
        this.b = str;
        this.c = str2;
        this.f26192a = z;
    }

    public static String a(byte[] bArr, byte[] bArr2) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return bze.a(mac.doFinal(bArr2));
    }

    private byte[] a() {
        if (this.d == null) {
            this.d = bzf.a(new byte[]{66, 37, 42, -119, 118, -104, -30, 4, -95, 15, -26, -12, -75, -102, 71, 23, -3, -120, -1, -57, 42, 99, -16, -101, 103, -74, 93, -114, 112, -26, -24, -24});
        }
        return this.d;
    }

    public String a(String str) {
        String str2;
        if (this.b == null || (str2 = this.c) == null) {
            bzd.c("There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            try {
                return this.f26192a ? a(str2.getBytes(), str.getBytes()) : a(a(), str.getBytes());
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
