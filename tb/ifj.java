package tb;

import android.content.Context;
import android.util.Base64;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alipay.android.phone.iifaa.did.common.security.crypto.CryptoImpl;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class ifj {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ifj f28991a;
    public Context b;
    public ifk c = new a();
    public CryptoImpl d = new CryptoImpl();

    /* loaded from: classes2.dex */
    public class a implements ifk {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String a(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                tb.ifj r0 = tb.ifj.this
                android.content.Context r0 = r0.b
                java.lang.String r5 = r4.c(r5, r6)
                byte[] r5 = r5.getBytes()
                r6 = 0
                if (r5 != 0) goto L10
                goto L34
            L10:
                if (r0 == 0) goto L34
                com.alibaba.wireless.security.open.SecurityGuardManager r1 = com.alibaba.wireless.security.open.SecurityGuardManager.getInstance(r0)     // Catch: com.alibaba.wireless.security.open.SecException -> L34
                r2 = 0
                java.lang.String r3 = "com.alipay.android.iot.security.framework.storage.RFS"
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)
                java.lang.String r5 = android.util.Base64.encodeToString(r5, r2)
                java.lang.String r5 = r0.getString(r5, r6)
                if (r5 == 0) goto L34
                com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent r0 = r1.getDynamicDataEncryptComp()     // Catch: com.alibaba.wireless.security.open.SecException -> L34
                byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: com.alibaba.wireless.security.open.SecException -> L34
                byte[] r5 = r0.dynamicDecryptByteArray(r5)     // Catch: com.alibaba.wireless.security.open.SecException -> L34
                goto L35
            L34:
                r5 = r6
            L35:
                if (r5 != 0) goto L38
                goto L3d
            L38:
                java.lang.String r6 = new java.lang.String
                r6.<init>(r5)
            L3d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ifj.a.a(java.lang.String, java.lang.String):java.lang.String");
        }

        public boolean a(String str, String str2, String str3) {
            Context context = ifj.this.b;
            byte[] bytes = c(str, str2).getBytes();
            byte[] bytes2 = str3.getBytes();
            if (bytes == null || bytes2 == null || context == null) {
                return false;
            }
            try {
                context.getSharedPreferences("com.alipay.android.iot.security.framework.storage.RFS", 0).edit().putString(Base64.encodeToString(bytes, 0), Base64.encodeToString(SecurityGuardManager.getInstance(context).getDynamicDataEncryptComp().dynamicEncryptByteArray(bytes2), 0)).apply();
                return true;
            } catch (SecException unused) {
                return false;
            }
        }

        public boolean b(String str, String str2) {
            Context context = ifj.this.b;
            byte[] bytes = c(str, str2).getBytes();
            if (context == null) {
                return false;
            }
            context.getSharedPreferences("com.alipay.android.iot.security.framework.storage.RFS", 0).edit().remove(Base64.encodeToString(bytes, 0)).apply();
            return true;
        }

        public final String c(String str, String str2) {
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
                return Base64.encodeToString(mac.doFinal(str2.getBytes()), 0);
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                return str + str2;
            }
        }
    }

    public static ifj a() {
        if (f28991a == null) {
            synchronized (ifj.class) {
                if (f28991a == null) {
                    f28991a = new ifj();
                }
            }
        }
        return f28991a;
    }

    public boolean b() {
        if (ihq.a().a("iifaa_did_security")) {
            return true;
        }
        ihz c = ihq.a().c("iifaa_did_security");
        if (c.g()) {
            iqh.a().b("DIDSecurityCore", "loadDIDSecuritySO success!");
        } else {
            iqh.a().c("DIDSecurityCore", "loadDIDSecuritySO failed!");
        }
        return c.g();
    }
}
