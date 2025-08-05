package com.mobile.auth.gatewayauth.manager;

import com.mobile.auth.O0o000;
import com.mobile.auth.O0o0000;
import com.mobile.auth.OooOO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.VendorConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class O0000OOo {
    private SystemManager O000000o;
    private O000000o O00000Oo;
    private O000000o O00000o;
    private O000000o O00000o0;
    private O00000o O00000oO;

    public O0000OOo(SystemManager systemManager, O00000o o00000o) {
        this.O000000o = systemManager;
        this.O00000oO = o00000o;
        this.O00000Oo = new OooOO(this.O000000o.O00000oO(), this.O00000oO);
        this.O00000o0 = new O0o000(this.O000000o.O00000oO(), this.O00000oO);
        this.O00000o = new O0o0000(this.O000000o.O00000oO(), this.O00000oO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r0 == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r0 == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        return r6.O00000o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return r6.O00000o0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mobile.auth.gatewayauth.manager.O000000o O000000o(java.lang.String r7) {
        /*
            r6 = this;
            r0 = -1
            r1 = 0
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L45
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L2c
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L22
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L18
            goto L35
        L18:
            java.lang.String r2 = "cm_zyhl"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L35
            r0 = 0
            goto L35
        L22:
            java.lang.String r2 = "cu_xw"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L35
            r0 = 1
            goto L35
        L2c:
            java.lang.String r2 = "ct_sjl"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L35
            r0 = 2
        L35:
            if (r0 == 0) goto L42
            if (r0 == r5) goto L3f
            if (r0 == r4) goto L3c
            return r1
        L3c:
            com.mobile.auth.gatewayauth.manager.O000000o r7 = r6.O00000o     // Catch: java.lang.Throwable -> L45
            return r7
        L3f:
            com.mobile.auth.gatewayauth.manager.O000000o r7 = r6.O00000o0     // Catch: java.lang.Throwable -> L45
            return r7
        L42:
            com.mobile.auth.gatewayauth.manager.O000000o r7 = r6.O00000Oo     // Catch: java.lang.Throwable -> L45
            return r7
        L45:
            r7 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)     // Catch: java.lang.Throwable -> L4a
            return r1
        L4a:
            r7 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.manager.O0000OOo.O000000o(java.lang.String):com.mobile.auth.gatewayauth.manager.O000000o");
    }

    public List<O000000o> O000000o() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.O00000Oo);
            arrayList.add(this.O00000o0);
            arrayList.add(this.O00000o);
            return arrayList;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean O000000o(VendorSdkInfoManager vendorSdkInfoManager) {
        int i;
        try {
            VendorConfig O000000o = vendorSdkInfoManager.O000000o(1);
            VendorConfig O000000o2 = vendorSdkInfoManager.O000000o(2);
            VendorConfig O000000o3 = vendorSdkInfoManager.O000000o(3);
            if (O000000o != null) {
                this.O00000Oo.O000000o(O000000o.getVendorAccessId(), O000000o.getVendorAccessSecret());
                i = 1;
            } else {
                i = 0;
            }
            if (O000000o2 != null) {
                this.O00000o0.O000000o(O000000o2.getVendorAccessId(), O000000o2.getVendorAccessSecret());
                i++;
            }
            if (O000000o3 != null) {
                this.O00000o.O000000o(O000000o3.getVendorAccessId(), O000000o3.getVendorAccessSecret());
                i++;
            }
            return i == 3;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
