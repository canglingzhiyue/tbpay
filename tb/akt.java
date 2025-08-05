package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class akt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_PEROID = "peroid";
    public static final String CONFIG_REPORT_PEROID = "reportPeroid";
    public static final String CONFIG_REPORT_RULES = "reportRules";
    public static final String CONFIG_SWITCH = "switch";
    public static final int DEVICE_LEVEL_0 = 0;
    public static final int DEVICE_LEVEL_1 = 1;
    public static final int DEVICE_LEVEL_2 = 2;
    public static final int DEVICE_LEVEL_CLOSE = -3;
    public static final int DEVICE_LEVEL_INNER_ERROR = -1;
    public static final int DEVICE_LEVEL_NOT_READY = -2;

    /* renamed from: a  reason: collision with root package name */
    private static akx f25409a;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        akx akxVar = f25409a;
        if (akxVar == null) {
            return -2;
        }
        return akxVar.a();
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[0])).floatValue();
        }
        akx akxVar = f25409a;
        if (akxVar == null) {
            return -2.0f;
        }
        return akxVar.b();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:6|(13:54|55|56|9|(3:11|(1:13)(1:15)|14)|16|(3:48|49|50)|18|19|20|(3:22|(3:25|(1:37)(2:33|34)|23)|40)(0)|41|(2:43|44)(1:45))|8|9|(0)|16|(0)|18|19|20|(0)(0)|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: Throwable -> 0x00cb, TryCatch #0 {Throwable -> 0x00cb, blocks: (B:27:0x0089, B:29:0x0091, B:30:0x0095, B:32:0x009b, B:34:0x00a5, B:36:0x00b1, B:38:0x00bb), top: B:46:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.util.HashMap<java.lang.String, java.lang.String> r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.akt.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            java.lang.String r8 = "656bbc4b"
            r0.ipc$dispatch(r8, r1)
            return
        L12:
            java.lang.String r0 = "peroid"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L35
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L31
            android.content.SharedPreferences$Editor r1 = tb.alg.b()     // Catch: java.lang.NumberFormatException -> L31
            java.lang.String r6 = "validperiod"
            r1.putLong(r6, r4)     // Catch: java.lang.NumberFormatException -> L31
            r1 = 1
            goto L36
        L31:
            r1 = move-exception
            r1.printStackTrace()
        L35:
            r1 = 0
        L36:
            java.lang.String r4 = "switch"
            java.lang.Object r5 = r8.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L5d
            java.lang.String r1 = "True"
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L55
            android.content.SharedPreferences$Editor r1 = tb.alg.b()
            r1.putBoolean(r4, r3)
            goto L5c
        L55:
            android.content.SharedPreferences$Editor r1 = tb.alg.b()
            r1.putBoolean(r4, r2)
        L5c:
            r1 = 1
        L5d:
            java.lang.String r2 = "reportPeroid"
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L80
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L7c
            android.content.SharedPreferences$Editor r2 = tb.alg.b()     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r4 = "report_validperiod"
            r2.putLong(r4, r6)     // Catch: java.lang.NumberFormatException -> L7c
            r1 = 1
            goto L80
        L7c:
            r2 = move-exception
            r2.printStackTrace()
        L80:
            java.lang.String r2 = "reportRules"
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class<com.ali.alihadeviceevaluator.model.ReportRule> r2 = com.ali.alihadeviceevaluator.model.ReportRule.class
            java.util.List r2 = com.alibaba.fastjson.JSONObject.parseArray(r8, r2)     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto Lcf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lcb
        L95:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto Lcf
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lcb
            com.ali.alihadeviceevaluator.model.ReportRule r4 = (com.ali.alihadeviceevaluator.model.ReportRule) r4     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lcb
            if (r6 == 0) goto L95
            java.lang.String r6 = r6.toUpperCase()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r4.brand     // Catch: java.lang.Throwable -> Lcb
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lcb
            if (r6 != 0) goto Lbb
            java.lang.String r6 = "*"
            java.lang.String r7 = r4.brand     // Catch: java.lang.Throwable -> Lcb
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lcb
            if (r6 == 0) goto L95
        Lbb:
            android.content.SharedPreferences$Editor r2 = tb.alg.b()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = "report_rule"
            java.lang.String r4 = com.alibaba.fastjson.JSONObject.toJSONString(r4)     // Catch: java.lang.Throwable -> Lcb
            r2.putString(r6, r4)     // Catch: java.lang.Throwable -> Lcb
            r1 = 1
            goto Lcf
        Lcb:
            r2 = move-exception
            r2.printStackTrace()
        Lcf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "effectConfig, strPeroid:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", switchOpen:"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = ", reportRuleStr: "
            r2.append(r0)
            r2.append(r8)
            r2.toString()
            if (r1 == 0) goto Lf8
            android.content.SharedPreferences$Editor r8 = tb.alg.b()
            r8.commit()
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.akt.a(java.util.HashMap):void");
    }

    public static void a(akx akxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e036628a", new Object[]{akxVar});
        } else {
            f25409a = akxVar;
        }
    }
}
