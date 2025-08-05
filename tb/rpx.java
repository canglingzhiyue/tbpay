package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class rpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33315a;
    private String b;
    private Object c = null;
    private Object d = null;
    private Class e = null;
    private Field f = null;
    private Field g = null;
    private Field h = null;
    private Method i = null;
    private int j = 3;
    private boolean k = false;

    static {
        kge.a(-1516661374);
    }

    public rpx(String str, String str2) {
        this.f33315a = null;
        this.b = "";
        this.f33315a = str;
        this.b = str2;
    }

    public String a(String str) {
        String str2;
        Class cls;
        apr.b("SecuritySDK", "toBeSignedStr", str);
        if (!this.k) {
            a();
        }
        if (this.f33315a == null) {
            apr.b("SecuritySDK", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            if (this.c != null && (cls = this.e) != null && this.f != null && this.g != null && this.h != null && this.i != null && this.d != null) {
                try {
                    Object newInstance = cls.newInstance();
                    this.f.set(newInstance, this.f33315a);
                    ((Map) this.g.get(newInstance)).put("INPUT", str);
                    this.h.set(newInstance, Integer.valueOf(this.j));
                    str2 = (String) this.i.invoke(this.d, newInstance, this.b);
                } catch (Exception e) {
                    apr.b("SecuritySDK", e, new Object[0]);
                }
                apr.b("SecuritySDK", "lSignedStr", str2);
                return str2;
            }
            apr.c("SecuritySDK", "UTSecurityThridRequestAuthentication.getSign s_securityGuardManagerObj", this.c, "s_securityGuardParamContextClz", this.e, "s_securityGuardParamContext_appKey", this.f, "s_securityGuardParamContext_paramMap", this.g, "s_securityGuardParamContext_requestType", this.h, "s_signRequestMethod", this.i);
            str2 = null;
            apr.b("SecuritySDK", "lSignedStr", str2);
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: Throwable -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:21:0x00ab, B:15:0x004a, B:17:0x005a), top: B:31:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.k     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L7
            monitor-exit(r9)
            return
        L7:
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = "com.alibaba.wireless.security.open.SecurityGuardManager"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L44
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r5 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L44
            tb.aob r6 = tb.aob.a()     // Catch: java.lang.Throwable -> L44
            android.content.Context r6 = r6.k()     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L44
            r7[r3] = r6     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r5.invoke(r0, r7)     // Catch: java.lang.Throwable -> L44
            r9.c = r0     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "getSecureSignatureComp"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r0 = r4.getMethod(r0, r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r9.c     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.invoke(r5, r6)     // Catch: java.lang.Throwable -> L44
            r9.d = r0     // Catch: java.lang.Throwable -> L44
            goto L58
        L44:
            r0 = move-exception
            goto L4a
        L46:
            r4 = move-exception
            r8 = r4
            r4 = r0
            r0 = r8
        L4a:
            java.lang.String r5 = "SecuritySDK"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = "initSecurityCheck"
            r6[r3] = r7     // Catch: java.lang.Throwable -> Laf
            r6[r2] = r0     // Catch: java.lang.Throwable -> Laf
            tb.apr.c(r5, r6)     // Catch: java.lang.Throwable -> Laf
        L58:
            if (r4 == 0) goto Lab
            java.lang.String r0 = "com.alibaba.wireless.security.open.SecurityGuardParamContext"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L9c
            r9.e = r0     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r0 = r9.e     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "appKey"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L9c
            r9.f = r0     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r0 = r9.e     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "paramMap"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L9c
            r9.g = r0     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r0 = r9.e     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "requestType"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L9c
            r9.h = r0     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "signRequest"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r6 = r9.e     // Catch: java.lang.Throwable -> L9c
            r5[r3] = r6     // Catch: java.lang.Throwable -> L9c
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L9c
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L9c
            r9.i = r0     // Catch: java.lang.Throwable -> L9c
            goto Lab
        L9c:
            r0 = move-exception
            java.lang.String r4 = "SecuritySDK"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "initSecurityCheck"
            r1[r3] = r5     // Catch: java.lang.Throwable -> Laf
            r1[r2] = r0     // Catch: java.lang.Throwable -> Laf
            tb.apr.c(r4, r1)     // Catch: java.lang.Throwable -> Laf
        Lab:
            r9.k = r2     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r9)
            return
        Laf:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rpx.a():void");
    }
}
