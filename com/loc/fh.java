package com.loc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import java.util.ArrayList;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class fh {

    /* renamed from: a  reason: collision with root package name */
    Hashtable<String, ArrayList<a>> f7791a = new Hashtable<>();
    private long i = 0;
    private boolean j = false;
    private String k = "2.0.201501131131".replace(".", "");
    private String l = null;
    boolean b = true;
    long c = 0;
    String d = null;
    fa e = null;
    private String m = null;
    private long n = 0;
    boolean f = true;
    boolean g = true;
    String h = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ew f7792a = null;
        private String b = null;

        protected a() {
        }

        public final ew a() {
            return this.f7792a;
        }

        public final void a(ew ewVar) {
            this.f7792a = ewVar;
        }

        public final void a(String str) {
            this.b = TextUtils.isEmpty(str) ? null : str.replace("##", "#");
        }

        public final String b() {
            return this.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: Throwable -> 0x0097, TryCatch #0 {Throwable -> 0x0097, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0013, B:10:0x001b, B:12:0x0023, B:14:0x0031, B:18:0x0049, B:20:0x0053, B:22:0x0065, B:25:0x0070, B:27:0x0074, B:29:0x007c, B:30:0x0088, B:32:0x008e, B:33:0x0092, B:16:0x0043), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.ew a(java.lang.String r5, java.lang.StringBuilder r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "cgiwifi"
            boolean r1 = r5.contains(r1)     // Catch: java.lang.Throwable -> L97
            if (r1 != 0) goto L43
            java.lang.String r1 = "wifi"
            boolean r1 = r5.contains(r1)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L13
            goto L43
        L13:
            java.lang.String r6 = "cgi"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L41
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L41
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L97
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L97
            if (r6 <= 0) goto L41
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L97
            r1 = 0
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L97
            com.loc.fh$a r6 = (com.loc.fh.a) r6     // Catch: java.lang.Throwable -> L97
            goto L47
        L41:
            r6 = r0
            goto L47
        L43:
            com.loc.fh$a r6 = r4.a(r6, r5)     // Catch: java.lang.Throwable -> L97
        L47:
            if (r6 == 0) goto L9f
            com.loc.ew r1 = r6.a()     // Catch: java.lang.Throwable -> L97
            boolean r1 = com.loc.fy.a(r1)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L9f
            com.loc.ew r1 = r6.a()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "mem"
            r1.e(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r6.b()     // Catch: java.lang.Throwable -> L97
            r1.h(r2)     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L88
            long r2 = r1.getTime()     // Catch: java.lang.Throwable -> L97
            boolean r7 = com.loc.fq.a(r2)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L70
            goto L88
        L70:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r7 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L9f
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r7 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            boolean r7 = r7.containsKey(r5)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L9f
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r7 = r4.f7791a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r5 = r7.get(r5)     // Catch: java.lang.Throwable -> L97
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L97
            r5.remove(r6)     // Catch: java.lang.Throwable -> L97
            goto L9f
        L88:
            boolean r5 = com.loc.fy.a(r1)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L92
            r5 = 0
            r4.c = r5     // Catch: java.lang.Throwable -> L97
        L92:
            r5 = 4
            r1.setLocationType(r5)     // Catch: java.lang.Throwable -> L97
            return r1
        L97:
            r5 = move-exception
            java.lang.String r6 = "Cache"
            java.lang.String r7 = "get1"
            com.loc.fr.a(r5, r6, r7)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(java.lang.String, java.lang.StringBuilder, boolean):com.loc.ew");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        r16 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.fh.a a(java.lang.StringBuilder r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(java.lang.StringBuilder, java.lang.String):com.loc.fh$a");
    }

    private String a(String str, StringBuilder sb, Context context) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            this.l = fy.l(context);
            if (str.contains("&")) {
                str = str.substring(0, str.indexOf("&"));
            }
            String substring = str.substring(str.lastIndexOf("#") + 1);
            if (substring.equals("cgi")) {
                jSONObject.put("cgi", str.substring(0, str.length() - 12));
            } else if (!TextUtils.isEmpty(sb) && sb.indexOf(",access") != -1) {
                jSONObject.put("cgi", str.substring(0, str.length() - (substring.length() + 9)));
                String[] split = sb.toString().split(",access");
                jSONObject.put("mmac", split[0].contains("#") ? split[0].substring(split[0].lastIndexOf("#") + 1) : split[0]);
            }
            return p.b(fg.a(jSONObject.toString().getBytes("UTF-8"), this.l));
        } catch (Throwable unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void a(android.content.Context r20, java.lang.String r21, boolean r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(android.content.Context, java.lang.String, boolean):void");
    }

    private void a(String str, AMapLocation aMapLocation, StringBuilder sb, Context context) throws Exception {
        if (context == null) {
            return;
        }
        if (this.l == null) {
            this.l = fy.l(context);
        }
        String a2 = a(str, sb, context);
        StringBuilder sb2 = new StringBuilder();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = context.openOrCreateDatabase("hmdb", 0, null);
            sb2.append("CREATE TABLE IF NOT EXISTS hist");
            sb2.append(this.k);
            sb2.append(" (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);");
            sQLiteDatabase.execSQL(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append("REPLACE INTO ");
            sb2.append("hist");
            sb2.append(this.k);
            sb2.append(" VALUES (?, ?, ?, ?)");
            Object[] objArr = new Object[4];
            objArr[0] = a2;
            byte[] a3 = fg.a(sb.toString().getBytes("UTF-8"), this.l);
            objArr[1] = a3;
            objArr[2] = fg.a(aMapLocation.toStr().getBytes("UTF-8"), this.l);
            objArr[3] = Long.valueOf(aMapLocation.getTime());
            for (int i = 1; i < 3; i++) {
                objArr[i] = p.b((byte[]) objArr[i]);
            }
            sQLiteDatabase.execSQL(sb2.toString(), objArr);
            sb2.delete(0, sb2.length());
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                fr.a(th, DXMonitorConstant.DX_MONITOR_DB, "updateHist");
                sb2.delete(0, sb2.length());
                if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                    return;
                }
                sQLiteDatabase.close();
            } finally {
                sb2.delete(0, sb2.length());
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    private static void a(String str, Hashtable<String, String> hashtable) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hashtable.clear();
        for (String str2 : str.split("#")) {
            if (!TextUtils.isEmpty(str2) && !str2.contains("|")) {
                hashtable.put(str2, "");
            }
        }
    }

    private boolean a(ew ewVar, boolean z) {
        if (!a(z)) {
            return false;
        }
        return ewVar == null || fq.a(ewVar.getTime()) || z;
    }

    private static boolean a(String str, ew ewVar) {
        if (TextUtils.isEmpty(str) || !fy.a(ewVar) || str.startsWith("#")) {
            return false;
        }
        return str.contains("network");
    }

    private static boolean a(String str, StringBuilder sb) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(sb) || !str.contains(",access") || sb.indexOf(",access") == -1) {
            return false;
        }
        String[] split = str.split(",access");
        String substring = split[0].contains("#") ? split[0].substring(split[0].lastIndexOf("#") + 1) : split[0];
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        String sb2 = sb.toString();
        return sb2.contains(substring + ",access");
    }

    private boolean a(boolean z) {
        if (fq.e() || z) {
            return this.b || fq.f() || z;
        }
        return false;
    }

    private static double[] a(double[] dArr, double[] dArr2) {
        double[] dArr3 = new double[3];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dArr.length; i3++) {
            d2 += dArr[i3] * dArr[i3];
            d3 += dArr2[i3] * dArr2[i3];
            d += dArr[i3] * dArr2[i3];
            if (dArr2[i3] == 1.0d) {
                i2++;
                if (dArr[i3] == 1.0d) {
                    i++;
                }
            }
        }
        dArr3[0] = d / (Math.sqrt(d2) * Math.sqrt(d3));
        double d4 = i;
        dArr3[1] = (d4 * 1.0d) / i2;
        dArr3[2] = d4;
        for (int i4 = 0; i4 < 2; i4++) {
            if (dArr3[i4] > 1.0d) {
                dArr3[i4] = 1.0d;
            }
        }
        return dArr3;
    }

    private boolean b() {
        long b = fy.b();
        long j = this.i;
        long j2 = b - j;
        if (j == 0) {
            return false;
        }
        return this.f7791a.size() > 360 || j2 > AuthenticatorCache.MAX_CACHE_TIME;
    }

    private void c() {
        this.i = 0L;
        if (!this.f7791a.isEmpty()) {
            this.f7791a.clear();
        }
        this.j = false;
    }

    private void c(Context context) throws Exception {
        if (context == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
            if (!fy.a(openOrCreateDatabase, "hist")) {
                if (openOrCreateDatabase == null || !openOrCreateDatabase.isOpen()) {
                    return;
                }
                openOrCreateDatabase.close();
                return;
            }
            String[] strArr = {String.valueOf(fy.a() - AuthenticatorCache.MAX_CACHE_TIME)};
            openOrCreateDatabase.delete("hist" + this.k, "time<?", strArr);
            if (openOrCreateDatabase == null || !openOrCreateDatabase.isOpen()) {
                return;
            }
            openOrCreateDatabase.close();
        } catch (Throwable th) {
            try {
                fr.a(th, DXMonitorConstant.DX_MONITOR_DB, "clearHist p2");
                if (sQLiteDatabase == null) {
                    return;
                }
            } finally {
                if (0 != 0 && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            }
        }
    }

    public final ew a(Context context, String str, StringBuilder sb, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str) && fq.e()) {
            String str2 = str + "&" + this.f + "&" + this.g + "&" + this.h;
            if (str2.contains("gps") || !fq.e() || sb == null) {
                return null;
            }
            if (b()) {
                c();
                return null;
            }
            if (z && !this.j) {
                try {
                    String a2 = a(str2, sb, context);
                    c();
                    a(context, a2, z2);
                } catch (Throwable unused) {
                }
            }
            if (!this.f7791a.isEmpty()) {
                return a(str2, sb, z2);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0 A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da A[Catch: Throwable -> 0x00f2, TryCatch #0 {Throwable -> 0x00f2, blocks: (B:5:0x000f, B:7:0x0015, B:17:0x002b, B:27:0x004d, B:31:0x0055, B:33:0x0065, B:45:0x008a, B:47:0x0093, B:49:0x0097, B:51:0x009f, B:53:0x00aa, B:63:0x00cb, B:66:0x00da, B:75:0x00eb, B:54:0x00ae, B:55:0x00b2, B:56:0x00b7, B:58:0x00bb, B:59:0x00c0, B:46:0x0091, B:39:0x0077, B:41:0x007d, B:9:0x0019, B:11:0x001d), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.fb r16, boolean r17, com.loc.ew r18, com.loc.ff r19, java.lang.StringBuilder r20, java.lang.String r21, android.content.Context r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(com.loc.fb, boolean, com.loc.ew, com.loc.ff, java.lang.StringBuilder, java.lang.String, android.content.Context, boolean):com.loc.ew");
    }

    public final void a() {
        this.c = 0L;
        this.d = null;
    }

    public final void a(Context context) {
        if (this.j) {
            return;
        }
        try {
            c();
            a(context, (String) null, false);
        } catch (Throwable th) {
            fr.a(th, "Cache", "loadDB");
        }
        this.j = true;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.g = aMapLocationClientOption.isNeedAddress();
        this.f = aMapLocationClientOption.isOffset();
        this.b = aMapLocationClientOption.isLocationCacheEnable();
        this.h = String.valueOf(aMapLocationClientOption.getGeoLanguage());
    }

    public final void a(fa faVar) {
        this.e = faVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(String str, StringBuilder sb, ew ewVar, Context context, boolean z) {
        try {
            if (!fy.a(ewVar)) {
                return;
            }
            String str2 = str + "&" + ewVar.isOffset() + "&" + ewVar.i() + "&" + ewVar.j();
            if (!a(str2, ewVar) || ewVar.e().equals("mem") || ewVar.e().equals("file") || ewVar.e().equals("wifioff") || "-3".equals(ewVar.d())) {
                return;
            }
            if (b()) {
                c();
            }
            JSONObject f = ewVar.f();
            if (fy.a(f, "offpct")) {
                f.remove("offpct");
                ewVar.a(f);
            }
            if (str2.contains("wifi")) {
                if (TextUtils.isEmpty(sb)) {
                    return;
                }
                if (ewVar.getAccuracy() >= 300.0f) {
                    int i = 0;
                    for (String str3 : sb.toString().split("#")) {
                        if (str3.contains(",")) {
                            i++;
                        }
                    }
                    if (i >= 8) {
                        return;
                    }
                } else if (ewVar.getAccuracy() <= 3.0f) {
                    return;
                }
                if (str2.contains("cgiwifi") && !TextUtils.isEmpty(ewVar.g())) {
                    String replace = str2.replace("cgiwifi", "cgi");
                    ew h = ewVar.h();
                    if (fy.a(h)) {
                        a(replace, new StringBuilder(), h, context, true);
                    }
                }
            } else if (str2.contains("cgi") && ((sb != null && sb.indexOf(",") != -1) || "4".equals(ewVar.d()))) {
                return;
            }
            ew a2 = a(str2, sb, false);
            if (fy.a(a2) && a2.toStr().equals(ewVar.toStr(3))) {
                return;
            }
            this.i = fy.b();
            a aVar = new a();
            aVar.a(ewVar);
            aVar.a(TextUtils.isEmpty(sb) ? null : sb.toString());
            if (this.f7791a.containsKey(str2)) {
                this.f7791a.get(str2).add(aVar);
            } else {
                ArrayList<a> arrayList = new ArrayList<>();
                arrayList.add(aVar);
                this.f7791a.put(str2, arrayList);
            }
            if (!z) {
                return;
            }
            a(str2, ewVar, sb, context);
        } catch (Throwable th) {
            fr.a(th, "Cache", "add");
        }
    }

    public final void b(Context context) {
        try {
            c();
            c(context);
            this.j = false;
            this.d = null;
            this.n = 0L;
        } catch (Throwable th) {
            fr.a(th, "Cache", "destroy part");
        }
    }
}
