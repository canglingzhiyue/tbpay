package com.loc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class fp {
    protected static String I;
    protected static String K;

    /* renamed from: a  reason: collision with root package name */
    public String f7799a = "1";
    protected short b = 0;
    protected String c = null;
    protected String d = null;
    protected String e = null;
    protected String f = null;
    protected String g = null;
    public String h = null;
    public String i = null;
    protected String j = null;
    protected String k = null;
    protected String l = null;
    protected String m = null;
    protected String n = null;
    protected String o = null;
    protected String p = null;
    protected String q = null;
    protected String r = null;
    protected String s = null;
    protected String t = null;
    protected String u = null;
    protected String v = null;
    protected String w = null;
    protected String x = null;
    protected String y = null;
    protected int z = 0;
    protected ArrayList<fa> A = new ArrayList<>();
    protected ArrayList<fa> B = new ArrayList<>();
    protected String C = null;
    protected String D = null;
    protected ArrayList<eg> E = new ArrayList<>();
    protected String F = null;
    protected String G = null;
    protected byte[] H = null;
    private byte[] Q = null;
    private int R = 0;
    protected String J = null;
    protected String L = null;
    protected String M = null;
    protected String N = null;
    protected int O = 0;
    private List<fc> S = null;
    private List<fa> T = Collections.synchronizedList(new ArrayList());
    final int P = 3;

    private static int a(String str, byte[] bArr, int i) {
        try {
        } catch (Throwable th) {
            fr.a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
        }
        if (TextUtils.isEmpty(str)) {
            bArr[i] = 0;
            return i + 1;
        }
        byte[] bytes = str.getBytes(Constants.DEFAULT_CHARSET);
        int length = bytes.length;
        if (length > 127) {
            length = 127;
        }
        bArr[i] = (byte) length;
        int i2 = i + 1;
        System.arraycopy(bytes, 0, bArr, i2, length);
        return i2 + length;
    }

    private static void a(fa faVar, List<fa> list) {
        if (faVar == null || list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(faVar);
            return;
        }
        long j = Long.MAX_VALUE;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= size) {
                i2 = i3;
                break;
            }
            fa faVar2 = list.get(i);
            if (faVar.c() == null || !faVar.c().equals(faVar2.c())) {
                j = Math.min(j, faVar2.t);
                if (j == faVar2.t) {
                    i3 = i;
                }
                i++;
            } else if (faVar.s != faVar2.s) {
                faVar2.t = faVar.t;
                faVar2.s = faVar.s;
            }
        }
        if (i2 < 0) {
            return;
        }
        if (size < 3) {
            list.add(faVar);
        } else if (faVar.t <= j || i2 >= size) {
        } else {
            list.remove(i2);
            list.add(faVar);
        }
    }

    private void a(ArrayList<fa> arrayList, ArrayList<fa> arrayList2) {
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<fa> it = arrayList2.iterator();
            while (it.hasNext()) {
                fa next = it.next();
                if (next.r && next.n) {
                    a(next, this.T);
                    return;
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        a(arrayList.get(0), this.T);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0.length != 6) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r7.split(r0)
            r1 = 6
            byte[] r2 = new byte[r1]
            r3 = 0
            if (r0 == 0) goto Lf
            int r4 = r0.length     // Catch: java.lang.Throwable -> L3e
            if (r4 == r1) goto L1b
        Lf:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L3e
            r4 = 0
        L12:
            if (r4 >= r1) goto L1b
            java.lang.String r5 = "0"
            r0[r4] = r5     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 + 1
            goto L12
        L1b:
            r1 = 0
        L1c:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L3e
            if (r1 >= r4) goto L54
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L3e
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L3e
            r5 = 2
            if (r4 <= r5) goto L30
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r4.substring(r3, r5)     // Catch: java.lang.Throwable -> L3e
            r0[r1] = r4     // Catch: java.lang.Throwable -> L3e
        L30:
            r4 = r0[r1]     // Catch: java.lang.Throwable -> L3e
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)     // Catch: java.lang.Throwable -> L3e
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L3e
            r2[r1] = r4     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            goto L1c
        L3e:
            r0 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "getMacBa "
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r1 = "Req"
            com.loc.fr.a(r0, r1, r7)
            java.lang.String r7 = "00:00:00:00:00:00"
            byte[] r2 = r6.a(r7)
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fp.a(java.lang.String):byte[]");
    }

    private void b() {
        String[] strArr = new String[27];
        strArr[0] = this.f7799a;
        strArr[1] = this.c;
        strArr[2] = this.d;
        strArr[3] = this.e;
        strArr[4] = this.f;
        strArr[5] = this.g;
        strArr[6] = this.h;
        strArr[7] = this.i;
        strArr[8] = this.l;
        strArr[9] = this.m;
        strArr[10] = this.n;
        strArr[11] = this.o;
        strArr[12] = this.p;
        strArr[13] = this.q;
        strArr[14] = this.r;
        strArr[15] = this.s;
        strArr[16] = this.t;
        strArr[17] = this.u;
        strArr[18] = this.v;
        strArr[19] = this.w;
        strArr[20] = this.x;
        strArr[21] = this.D;
        strArr[22] = this.F;
        strArr[23] = this.G;
        strArr[24] = I;
        strArr[25] = this.M;
        strArr[26] = this.N;
        for (int i = 0; i < 27; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                strArr[i] = "";
            }
        }
        if (TextUtils.isEmpty(this.j) || (!"0".equals(this.j) && !"2".equals(this.j))) {
            this.j = "0";
        }
        if (TextUtils.isEmpty(this.k) || (!"0".equals(this.k) && !"1".equals(this.k))) {
            this.k = "0";
        }
        if (TextUtils.isEmpty(this.y) || (!"1".equals(this.y) && !"2".equals(this.y))) {
            this.y = "0";
        }
        if (!fb.a(this.z)) {
            this.z = 0;
        }
        if (this.H == null) {
            this.H = new byte[0];
        }
    }

    public final void a(Context context, boolean z, boolean z2, fb fbVar, ff ffVar, ConnectivityManager connectivityManager, String str, fd fdVar) {
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        NetworkInfo networkInfo;
        String str5;
        String str6;
        ArrayList<eg> arrayList;
        int i;
        String f = l.f(context);
        int d = fy.d();
        this.J = str;
        this.S = null;
        if (!z2) {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        } else {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        }
        String str7 = str3;
        String str8 = str2;
        StringBuilder sb2 = new StringBuilder();
        int g = fbVar.g();
        int h = fbVar.h();
        TelephonyManager i2 = fbVar.i();
        ArrayList<fa> c = fbVar.c();
        ArrayList<fa> d2 = fbVar.d();
        ArrayList<eg> e = ffVar.e();
        String str9 = h == 2 ? "1" : "0";
        if (i2 != null) {
            if (TextUtils.isEmpty(fr.g)) {
                try {
                    fr.g = o.k();
                } catch (Throwable th) {
                    str4 = "1";
                    fr.a(th, "Aps", "getApsReq part4");
                }
            }
            str4 = "1";
            sb = sb2;
            if (TextUtils.isEmpty(fr.g) && Build.VERSION.SDK_INT < 29) {
                fr.g = "888888888888888";
            }
            if (TextUtils.isEmpty(fr.h)) {
                try {
                    fr.h = o.n();
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    fr.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(fr.h) && Build.VERSION.SDK_INT < 29) {
                fr.h = "888888888888888";
            }
        } else {
            sb = sb2;
            str4 = "1";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            fr.a(th3, "Aps", "getApsReq part");
            networkInfo = null;
        }
        boolean a2 = ffVar.a(connectivityManager);
        if (fy.a(networkInfo) != -1) {
            str5 = fy.a(context, i2);
            str6 = a2 ? "2" : str4;
        } else {
            str5 = "";
            str6 = str5;
        }
        if ((g & 4) != 4 || d2.isEmpty()) {
            this.B.clear();
        } else {
            this.B.clear();
            this.B.addAll(d2);
        }
        this.A.clear();
        this.A.addAll(c);
        StringBuilder sb3 = new StringBuilder();
        if (ffVar.k()) {
            if (a2) {
                WifiInfo m = ffVar.m();
                if (ff.a(m)) {
                    sb3.append(m.getBSSID());
                    sb3.append(",");
                    int rssi = m.getRssi();
                    if (rssi < -128 || rssi > 127) {
                        rssi = 0;
                    }
                    sb3.append(rssi);
                    sb3.append(",");
                    String ssid = m.getSSID();
                    try {
                        i = m.getSSID().getBytes("UTF-8").length;
                    } catch (Exception unused2) {
                        i = 32;
                    }
                    if (i >= 32) {
                        ssid = "unkwn";
                    }
                    sb3.append(ssid.replace("*", "."));
                }
            }
            if (e != null && (arrayList = this.E) != null) {
                arrayList.clear();
                this.E.addAll(e);
            }
        } else {
            ffVar.g();
            ArrayList<eg> arrayList2 = this.E;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.b = (short) 0;
        if (!z) {
            this.b = (short) (this.b | 2);
        }
        this.c = str8;
        this.d = str7;
        this.f = Build.MODEL;
        this.g = "android" + Build.VERSION.RELEASE;
        this.h = fy.b(context);
        this.i = str9;
        this.j = "0";
        this.k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = f;
        this.p = fr.g;
        this.q = fr.h;
        this.s = String.valueOf(d);
        this.t = fy.i(context);
        this.v = "6.2.0";
        this.w = null;
        this.u = "";
        this.x = str5;
        this.y = str6;
        this.z = g;
        this.C = fbVar.l();
        this.F = ff.p();
        this.D = sb3.toString();
        this.O = (int) ((fy.b() - ffVar.q()) / 1000);
        try {
            if (TextUtils.isEmpty(I)) {
                I = o.f(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(K)) {
                K = o.a(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.M)) {
                this.M = o.f();
            }
        } catch (Throwable unused5) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = o.e(context);
            }
        } catch (Throwable unused6) {
        }
        try {
            this.S = fdVar.a(this.B, this.E);
            a(this.A, this.B);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        sb.delete(0, sb.length());
        sb3.delete(0, sb3.length());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:12|13|14|(34:275|(1:277)(1:379)|278|(7:280|(1:282)(1:356)|283|(1:285)(1:355)|286|(1:288)(1:354)|289)(29:(11:358|(1:360)(1:378)|361|(1:363)(1:377)|364|(1:366)(1:376)|367|(1:369)(1:375)|370|(1:372)(1:374)|373)|291|(1:293)(1:353)|(1:295)|296|(1:298)(1:351)|299|(1:301)|302|(1:304)|305|(2:307|(1:309)(4:310|(11:312|(1:314)(1:345)|315|(1:317)(1:344)|318|(1:320)(1:343)|321|(1:323)|324|(8:326|(1:328)(1:338)|329|(1:331)|332|(1:334)|335|336)(2:339|340)|337)|346|347))(2:348|(1:350))|19|(15:23|24|25|26|(1:271)(4:29|(6:31|(3:88|(1:90)|91)(3:37|(3:39|(1:41)|42)(2:82|(3:84|(1:86)|87))|43)|44|(1:46)|47|(3:68|(1:79)(5:70|(1:72)|(1:74)|75|(3:77|63|64)(1:78))|65)(3:53|(6:57|(1:59)|(1:61)|62|63|64)|65))|92|93)|94|(1:270)(21:98|99|100|101|102|(1:104)|105|106|107|(12:264|(1:266)|110|(2:112|113)|115|116|(1:118)(7:232|(1:234)(1:263)|(1:236)|237|(11:239|240|241|242|243|(1:257)(1:245)|246|247|(1:256)|(2:252|253)(1:255)|254)|261|262)|119|120|121|(1:123)|(27:125|126|127|128|129|(1:131)|132|133|(3:222|223|224)|135|136|137|138|139|140|141|(1:143)(1:217)|144|(1:146)|147|(6:149|(1:151)(1:189)|152|(5:156|157|(9:160|(2:167|(6:169|(1:171)|172|173|174|175)(4:176|(3:178|(1:180)|181)|174|175))|182|(1:184)|185|173|174|175|158)|186|155)|154|155)|190|(4:192|(1:194)(1:210)|195|(3:197|(6:200|(1:202)|203|(2:205|206)(1:208)|207|198)|209))|211|(1:213)|214|215)(27:229|230|127|128|129|(0)|132|133|(0)|135|136|137|138|139|140|141|(0)(0)|144|(0)|147|(0)|190|(0)|211|(0)|214|215))|109|110|(0)|115|116|(0)(0)|119|120|121|(0)|(0)(0))|269|116|(0)(0)|119|120|121|(0)|(0)(0))|274|26|(0)|271|94|(1:96)|270|269|116|(0)(0)|119|120|121|(0)|(0)(0))|290|291|(0)(0)|(0)|295|296|(0)(0)|299|(0)|302|(0)|305|(0)(0)|19|(18:21|23|24|25|26|(0)|271|94|(0)|270|269|116|(0)(0)|119|120|121|(0)|(0)(0))|274|26|(0)|271|94|(0)|270|269|116|(0)(0)|119|120|121|(0)|(0)(0))(1:17)|18|19|(0)|274|26|(0)|271|94|(0)|270|269|116|(0)(0)|119|120|121|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x067f, code lost:
        if (r15 < (-128)) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06ed, code lost:
        r9[r11] = 0;
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05df A[Catch: Throwable -> 0x05ed, TRY_LEAVE, TryCatch #3 {Throwable -> 0x05ed, blocks: (B:209:0x0576, B:218:0x05ae, B:224:0x05c0, B:226:0x05df, B:211:0x058b, B:214:0x0598), top: B:365:0x0576 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06dc A[Catch: Throwable -> 0x06ed, TryCatch #2 {Throwable -> 0x06ed, blocks: (B:265:0x06ce, B:269:0x06dc, B:270:0x06e0), top: B:364:0x06ce }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06e0 A[Catch: Throwable -> 0x06ed, TRY_LEAVE, TryCatch #2 {Throwable -> 0x06ed, blocks: (B:265:0x06ce, B:269:0x06dc, B:270:0x06e0), top: B:364:0x06ce }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ff A[Catch: Throwable -> 0x071e, TryCatch #6 {Throwable -> 0x071e, blocks: (B:275:0x06f7, B:277:0x06ff, B:278:0x0709), top: B:371:0x06f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0710 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a() {
        /*
            Method dump skipped, instructions count: 2355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fp.a():byte[]");
    }
}
