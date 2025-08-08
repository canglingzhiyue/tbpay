package com.mobile.auth;

import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import tb.riy;

/* loaded from: classes4.dex */
public final class OOO00Oo {
    public static boolean O000000o = false;
    public static boolean O00000Oo = false;
    private static final HostnameVerifier O00000o0 = new HostnameVerifier() { // from class: com.mobile.auth.OOO00Oo.1
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class O000000o implements HostnameVerifier {
        O000000o() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            try {
                if (!StringUtils.isEmpty(str) && sSLSession != null && OOO.O000000o(str)) {
                    try {
                        String name = ((X509Certificate) sSLSession.getPeerCertificates()[0]).getSubjectDN().getName();
                        OOO0o0.O00000o0("subjectName = ".concat(String.valueOf(name)));
                        return OOO.O000000o(name);
                    } catch (SSLPeerUnverifiedException e) {
                        e.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return false;
            }
        }
    }

    private static String O000000o(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e) {
                    e = e;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    String str = new String(byteArrayOutputStream.toByteArray());
                    try {
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Exception unused2) {
                    }
                    return str;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String O000000o(String str) {
        try {
            if (!str.contains(":")) {
                return str;
            }
            return riy.ARRAY_START_STR + str + riy.ARRAY_END_STR;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[Catch: Exception -> 0x0223, all -> 0x0225, TryCatch #3 {, blocks: (B:21:0x0054, B:24:0x005a, B:26:0x0060, B:27:0x0068, B:32:0x0085, B:34:0x008c, B:36:0x0090, B:42:0x00a4, B:44:0x00a8, B:46:0x00d2, B:48:0x00dc, B:49:0x00e4, B:51:0x00ea, B:52:0x00fd, B:55:0x0147, B:57:0x0160, B:62:0x0185, B:64:0x01c2, B:66:0x01ca, B:68:0x01cf, B:70:0x01e5, B:72:0x01fb, B:80:0x022b, B:81:0x0235, B:83:0x0260, B:85:0x0266, B:88:0x0274, B:90:0x027e, B:94:0x028b, B:96:0x02a6, B:98:0x02aa, B:100:0x02b2, B:101:0x02c0, B:103:0x02c5, B:105:0x02cd, B:107:0x02e9, B:109:0x0305, B:40:0x009d), top: B:124:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: Exception -> 0x0223, all -> 0x0225, TryCatch #3 {, blocks: (B:21:0x0054, B:24:0x005a, B:26:0x0060, B:27:0x0068, B:32:0x0085, B:34:0x008c, B:36:0x0090, B:42:0x00a4, B:44:0x00a8, B:46:0x00d2, B:48:0x00dc, B:49:0x00e4, B:51:0x00ea, B:52:0x00fd, B:55:0x0147, B:57:0x0160, B:62:0x0185, B:64:0x01c2, B:66:0x01ca, B:68:0x01cf, B:70:0x01e5, B:72:0x01fb, B:80:0x022b, B:81:0x0235, B:83:0x0260, B:85:0x0266, B:88:0x0274, B:90:0x027e, B:94:0x028b, B:96:0x02a6, B:98:0x02aa, B:100:0x02b2, B:101:0x02c0, B:103:0x02c5, B:105:0x02cd, B:107:0x02e9, B:109:0x0305, B:40:0x009d), top: B:124:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147 A[Catch: Exception -> 0x0223, all -> 0x0225, TRY_ENTER, TryCatch #3 {, blocks: (B:21:0x0054, B:24:0x005a, B:26:0x0060, B:27:0x0068, B:32:0x0085, B:34:0x008c, B:36:0x0090, B:42:0x00a4, B:44:0x00a8, B:46:0x00d2, B:48:0x00dc, B:49:0x00e4, B:51:0x00ea, B:52:0x00fd, B:55:0x0147, B:57:0x0160, B:62:0x0185, B:64:0x01c2, B:66:0x01ca, B:68:0x01cf, B:70:0x01e5, B:72:0x01fb, B:80:0x022b, B:81:0x0235, B:83:0x0260, B:85:0x0266, B:88:0x0274, B:90:0x027e, B:94:0x028b, B:96:0x02a6, B:98:0x02aa, B:100:0x02b2, B:101:0x02c0, B:103:0x02c5, B:105:0x02cd, B:107:0x02e9, B:109:0x0305, B:40:0x009d), top: B:124:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260 A[Catch: all -> 0x0225, TryCatch #3 {, blocks: (B:21:0x0054, B:24:0x005a, B:26:0x0060, B:27:0x0068, B:32:0x0085, B:34:0x008c, B:36:0x0090, B:42:0x00a4, B:44:0x00a8, B:46:0x00d2, B:48:0x00dc, B:49:0x00e4, B:51:0x00ea, B:52:0x00fd, B:55:0x0147, B:57:0x0160, B:62:0x0185, B:64:0x01c2, B:66:0x01ca, B:68:0x01cf, B:70:0x01e5, B:72:0x01fb, B:80:0x022b, B:81:0x0235, B:83:0x0260, B:85:0x0266, B:88:0x0274, B:90:0x027e, B:94:0x028b, B:96:0x02a6, B:98:0x02aa, B:100:0x02b2, B:101:0x02c0, B:103:0x02c5, B:105:0x02cd, B:107:0x02e9, B:109:0x0305, B:40:0x009d), top: B:124:0x0054 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String O000000o(android.content.Context r20, java.lang.String r21, java.util.HashMap<java.lang.String, java.lang.String> r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OOO00Oo.O000000o(android.content.Context, java.lang.String, java.util.HashMap, java.lang.Object):java.lang.String");
    }
}
