package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.model.CustomizeToken;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import com.nirvana.tools.jsoner.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import tb.czn;
import tb.czp;

/* loaded from: classes4.dex */
public class TokenGenerator {
    private OO0oO O000000o;
    private SystemManager O00000Oo;
    private VendorSdkInfoManager O00000o0;

    public TokenGenerator(OO0oO oO0oO, SystemManager systemManager, VendorSdkInfoManager vendorSdkInfoManager) {
        this.O000000o = oO0oO;
        this.O00000Oo = systemManager;
        this.O00000o0 = vendorSdkInfoManager;
    }

    private String assembleCustomizeToken(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            try {
                String packageName = PackageUtils.getPackageName(context);
                CustomizeToken customizeToken = new CustomizeToken();
                HashMap hashMap = new HashMap(3);
                hashMap.put("token", str2);
                hashMap.put("appid", str3);
                hashMap.put("appkey", str4);
                customizeToken.setEncryptToken(AESUtils.encryptString2Base64(new JSONObject(hashMap).toString(), str, packageName));
                customizeToken.setKey(EncryptUtils.encrpytAESKey(str6, str));
                customizeToken.setVendorName(str5);
                if (Constant.VENDOR_CUCC.equals(str5)) {
                    customizeToken.setVendorName(Constant.VENDOR_CUXZ);
                } else {
                    customizeToken.setVendorName(str5);
                }
                return czn.a.a(a.a(customizeToken, (List<Field>) null).toString().getBytes());
            } catch (Exception e) {
                this.O000000o.O00000o(czp.a(e));
                return null;
            }
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

    private String generateCsrf(String str) {
        try {
            try {
                return czn.a(str, this.O00000Oo.O000000o() + this.O00000Oo.O00000Oo());
            } catch (Exception e) {
                this.O000000o.O00000o("Generate csrf failed!", czp.a(e));
                return "";
            }
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

    public String O000000o(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, String str7) {
        try {
            return assembleToken(context, null, null, null, str, str2, str3, z, str4, str5, str6, z2, str7);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String assembleToken(android.content.Context r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, java.lang.String r36) {
        /*
            r23 = this;
            r9 = r23
            r10 = 0
            java.lang.String r0 = ""
            if (r31 == 0) goto Le
            r4 = r29
            java.lang.String r0 = r9.generateCsrf(r4)     // Catch: java.lang.Throwable -> L7e
            goto L10
        Le:
            r4 = r29
        L10:
            r19 = r0
            r8 = 1
            r22 = 0
            if (r35 == 0) goto L2a
            java.lang.String r0 = "rpk"
            r2 = r24
            java.lang.String r0 = com.mobile.auth.gatewayauth.utils.O0000o00.O000000o(r2, r0)     // Catch: java.lang.Throwable -> L7e
            boolean r1 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L28
            r11 = r0
            r0 = 1
            goto L2e
        L28:
            r11 = r0
            goto L2d
        L2a:
            r2 = r24
            r11 = r10
        L2d:
            r0 = 0
        L2e:
            if (r0 != 0) goto L5a
            com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager r0 = r9.O00000o0     // Catch: java.io.UnsupportedEncodingException -> L57 java.lang.Throwable -> L7e
            java.lang.String r15 = r0.O00000o0()     // Catch: java.io.UnsupportedEncodingException -> L57 java.lang.Throwable -> L7e
            r20 = 1
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r16 = r28
            r17 = r29
            r18 = r30
            r21 = r36
            java.lang.String r0 = com.mobile.auth.gatewayauth.utils.EncryptUtils.encryptToken(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.io.UnsupportedEncodingException -> L57 java.lang.Throwable -> L7e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L57 java.lang.Throwable -> L7e
            java.lang.String r10 = tb.czn.a.a(r0)     // Catch: java.io.UnsupportedEncodingException -> L57 java.lang.Throwable -> L7e
            goto L7d
        L57:
            r0 = move-exception
            r12 = 1
            goto L70
        L5a:
            r1 = r23
            r2 = r24
            r3 = r28
            r4 = r29
            r5 = r32
            r6 = r33
            r7 = r34
            r12 = 1
            r8 = r11
            java.lang.String r10 = r1.assembleCustomizeToken(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.UnsupportedEncodingException -> L6f java.lang.Throwable -> L7e
            goto L7d
        L6f:
            r0 = move-exception
        L70:
            com.mobile.auth.OO0oO r1 = r9.O000000o     // Catch: java.lang.Throwable -> L7e
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = tb.czp.a(r0)     // Catch: java.lang.Throwable -> L7e
            r2[r22] = r0     // Catch: java.lang.Throwable -> L7e
            r1.O00000o(r2)     // Catch: java.lang.Throwable -> L7e
        L7d:
            return r10
        L7e:
            r0 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r0)     // Catch: java.lang.Throwable -> L83
            return r10
        L83:
            r0 = move-exception
            r1 = r0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.TokenGenerator.assembleToken(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):java.lang.String");
    }
}
