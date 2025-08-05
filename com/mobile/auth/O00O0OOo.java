package com.mobile.auth;

import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import java.io.Closeable;
import java.io.IOException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class O00O0OOo implements O00O0Oo0 {
    private static O00Oo0o0 O000000o;

    private String O000000o() {
        return b.f6471a[0] + "." + b.f6471a[2] + "." + b.f6471a[4] + "." + b.f6471a[6];
    }

    private void O000000o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized SSLSocketFactory O000000o(O00Oo0 o00Oo0, a aVar) {
        if (o00Oo0 instanceof O00Oo00) {
            O00Oo0o0 o00Oo0o0 = new O00Oo0o0(HttpsURLConnection.getDefaultSSLSocketFactory(), aVar);
            if (O000000o == null) {
                O000000o = o00Oo0o0;
            }
            return o00Oo0o0;
        }
        if (O000000o == null) {
            O000000o = new O00Oo0o0(HttpsURLConnection.getDefaultSSLSocketFactory(), aVar);
        }
        return O000000o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|2|3|(2:148|(30:150|8|(1:10)(1:147)|11|12|13|(3:15|(5:18|19|20|21|16)|78)|80|(1:(1:87)(1:88))|89|(1:91)|92|93|(3:95|97|98)(1:141)|99|100|101|102|103|104|(2:105|(1:107)(1:108))|109|110|(1:112)|113|(1:115)(1:124)|116|(2:122|123)|49|50))|7|8|(0)(0)|11|12|13|(0)|80|(2:82|(0)(0))|89|(0)|92|93|(0)(0)|99|100|101|102|103|104|(3:105|(0)(0)|107)|109|110|(0)|113|(0)(0)|116|(1:118)|122|123|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ce, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cf, code lost:
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d3, code lost:
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d5, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d6, code lost:
        r2 = r14;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01da, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
        r2 = r14;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01eb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f2, code lost:
        r18 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0242 A[Catch: all -> 0x02aa, TryCatch #2 {all -> 0x02aa, blocks: (B:98:0x0208, B:102:0x023e, B:104:0x0242, B:106:0x024a, B:108:0x0252), top: B:143:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x01f8, Exception -> 0x0201, TryCatch #9 {Exception -> 0x0201, all -> 0x01f8, blocks: (B:3:0x0030, B:5:0x0045, B:11:0x005f, B:13:0x0065, B:14:0x0073, B:15:0x0076, B:7:0x0049, B:9:0x0053), top: B:153:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x016d A[EDGE_INSN: B:158:0x016d->B:50:0x016d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[Catch: all -> 0x01f8, Exception -> 0x0201, TRY_LEAVE, TryCatch #9 {Exception -> 0x0201, all -> 0x01f8, blocks: (B:3:0x0030, B:5:0x0045, B:11:0x005f, B:13:0x0065, B:14:0x0073, B:15:0x0076, B:7:0x0049, B:9:0x0053), top: B:153:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[Catch: all -> 0x01eb, Exception -> 0x01f1, TryCatch #12 {Exception -> 0x01f1, all -> 0x01eb, blocks: (B:17:0x0081, B:19:0x0087, B:20:0x008f, B:22:0x0095), top: B:147:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: all -> 0x01e7, Exception -> 0x01e9, TryCatch #13 {Exception -> 0x01e9, all -> 0x01e7, blocks: (B:24:0x00a3, B:25:0x00ad, B:27:0x00b3, B:29:0x00b7, B:32:0x00bd, B:33:0x00f9, B:34:0x0103, B:36:0x0125, B:37:0x012e, B:40:0x0139), top: B:145:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[Catch: all -> 0x01e7, Exception -> 0x01e9, TryCatch #13 {Exception -> 0x01e9, all -> 0x01e7, blocks: (B:24:0x00a3, B:25:0x00ad, B:27:0x00b3, B:29:0x00b7, B:32:0x00bd, B:33:0x00f9, B:34:0x0103, B:36:0x0125, B:37:0x012e, B:40:0x0139), top: B:145:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125 A[Catch: all -> 0x01e7, Exception -> 0x01e9, TryCatch #13 {Exception -> 0x01e9, all -> 0x01e7, blocks: (B:24:0x00a3, B:25:0x00ad, B:27:0x00b3, B:29:0x00b7, B:32:0x00bd, B:33:0x00f9, B:34:0x0103, B:36:0x0125, B:37:0x012e, B:40:0x0139), top: B:145:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139 A[Catch: all -> 0x01e7, Exception -> 0x01e9, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x01e9, all -> 0x01e7, blocks: (B:24:0x00a3, B:25:0x00ad, B:27:0x00b3, B:29:0x00b7, B:32:0x00bd, B:33:0x00f9, B:34:0x0103, B:36:0x0125, B:37:0x012e, B:40:0x0139), top: B:145:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015f A[Catch: all -> 0x01ce, Exception -> 0x01d2, LOOP:1: B:47:0x0159->B:49:0x015f, LOOP_END, TryCatch #11 {Exception -> 0x01d2, all -> 0x01ce, blocks: (B:46:0x0157, B:47:0x0159, B:49:0x015f, B:50:0x016d), top: B:149:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    @Override // com.mobile.auth.O00O0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O000000o(com.mobile.auth.O00OoOO0 r20, com.mobile.auth.O00o0 r21, com.cmic.sso.sdk.a r22) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O0OOo.O000000o(com.mobile.auth.O00OoOO0, com.mobile.auth.O00o0, com.cmic.sso.sdk.a):void");
    }
}
