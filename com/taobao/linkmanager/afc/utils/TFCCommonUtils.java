package com.taobao.linkmanager.afc.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Looper;
import android.taobao.safemode.k;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.android.speed.TBSpeed;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.themis.kernel.i;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.bzj;
import tb.kge;
import tb.kog;

/* loaded from: classes.dex */
public class TFCCommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f17681a;
    public static String b;
    private static String c;

    /* loaded from: classes7.dex */
    public enum FlowType {
        SHARE(1, "afc_share"),
        MESSAGE(2, "afc_message"),
        LINK(3, "afc_link"),
        LAUNCH(4, "afc_launch");
        
        private int code;
        private String descs;

        FlowType(int i, String str) {
            this.code = i;
            this.descs = str;
        }

        public static String getDesc(int i) {
            FlowType[] values;
            for (FlowType flowType : values()) {
                if (flowType.code == i) {
                    return flowType.descs;
                }
            }
            return null;
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : c;
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        c = str;
        return str;
    }

    public static /* synthetic */ String d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context}) : e(context);
    }

    static {
        kge.a(805697331);
        f17681a = "linkAhead";
        b = "mainBlock";
        c = "";
    }

    public static AfcCustomSdk.Environment a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AfcCustomSdk.Environment) ipChange.ipc$dispatch("d5668d23", new Object[]{hashMap});
        }
        if (hashMap == null || hashMap.size() == 0) {
            return AfcCustomSdk.Environment.PRE;
        }
        if (((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue() == 0) {
            return AfcCustomSdk.Environment.ONLINE;
        }
        return AfcCustomSdk.Environment.PRE;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            Nav.from(context).toUri("http://m.taobao.com/index.htm");
        }
    }

    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{str, str2, hashMap});
        } else if (str == null || !str.contains(i.KEY_AFC_LINK)) {
        } else {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("jumpUrl", str2);
            hashMap.put("originUrl", str);
            com.taobao.flowcustoms.afc.utils.b.a(19999, "302_flow_track_url", "", "", hashMap);
        }
    }

    public static String a(FlowType flowType, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5227edc3", new Object[]{flowType, str, map});
        }
        AfcUtils.FlowType flowType2 = AfcUtils.FlowType.LINK;
        if (StringUtils.equals("afc_share", flowType.descs)) {
            flowType2 = AfcUtils.FlowType.SHARE;
        } else if (StringUtils.equals("afc_message", flowType.descs)) {
            flowType2 = AfcUtils.FlowType.MESSAGE;
        } else if (StringUtils.equals("afc_link", flowType.descs)) {
            flowType2 = AfcUtils.FlowType.LINK;
        } else if (StringUtils.equals("afc_launch", flowType.descs)) {
            flowType2 = AfcUtils.FlowType.LAUNCH;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === handleFlowParams === 调用类型：" + flowType2);
        return AfcUtils.a(flowType2, str, map);
    }

    public static boolean a(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6be04985", new Object[]{application, str})).booleanValue() : TBSpeed.isSpeedEdition(application, str);
    }

    public static boolean a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edfc5550", new Object[]{kVar})).booleanValue() : (kVar == null || kVar.e == null || kVar.e.getData() == null || kVar.d == null) ? false : true;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (!a(application, f17681a) || !a(LauncherRuntime.d())) {
        } else {
            TbFcLinkInit.instance().linkAhead = true;
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === isH5Landing: 传入URL为空，返回false");
            return false;
        }
        String decode = URLDecoder.decode(str, "utf-8");
        Map<String, String> a2 = com.taobao.flowcustoms.afc.utils.f.a(context).a("flow_customs_in_local");
        if (a2.size() != 0 && a2.containsKey("isH5Land")) {
            String str2 = a2.get("isH5Land");
            if (!StringUtils.isEmpty(str2)) {
                for (String str3 : Arrays.asList(str2.split(","))) {
                    if (decode.contains(str3)) {
                        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === isH5Landing: 当前URL是h5落地页，匹配到URL为：" + str3);
                        return true;
                    }
                }
            }
            return false;
        }
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === isH5Landing: 取到的配置为空或者配置不包含isH5Landing，返回false");
        return false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return "";
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("h5Url");
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === getH5URL === h5Url=" + queryParameter);
            if (StringUtils.isEmpty(queryParameter)) {
                return "";
            }
            Uri parse2 = Uri.parse(queryParameter);
            if (d.c()) {
                String queryParameter2 = parse.getQueryParameter("afc_route");
                String queryParameter3 = parse2.getQueryParameter("preFetch");
                if ("1".equals(queryParameter2) || "1".equals(queryParameter3)) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === getH5URL === preFetch=" + queryParameter3);
                    return queryParameter;
                }
            }
            if (d.b()) {
                String queryParameter4 = parse2.getQueryParameter("preFetch");
                if ("1".equals(queryParameter4)) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === getH5URL === preFetch=" + queryParameter4);
                    return queryParameter;
                }
            }
            String queryParameter5 = parse2.getQueryParameter(RVStartParams.KEY_URL_SHORT);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === getH5URL === hcUrl=" + queryParameter5);
            return queryParameter5;
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TFCCommonUtils === getH5URL === error " + th);
            return "";
        }
    }

    public static String b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String str = (String) com.taobao.flowcustoms.afc.utils.f.a(context).b("afc_oaid", "");
        c = str;
        if (!StringUtils.isEmpty(str)) {
            Thread thread = new Thread(new Runnable() { // from class: com.taobao.linkmanager.afc.utils.TFCCommonUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String d = TFCCommonUtils.d(context);
                    if (StringUtils.isEmpty(d) || StringUtils.equals(d, TFCCommonUtils.b())) {
                        return;
                    }
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === 异步获取到的oaid和本地不一致，缓存最新的到本地 " + d);
                    com.taobao.flowcustoms.afc.utils.f.a(context).a("afc_oaid", d);
                }
            });
            thread.setName("TFCCommon.getOaid1");
            thread.start();
            return c;
        }
        final g gVar = new g();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Thread thread2 = new Thread(new Runnable() { // from class: com.taobao.linkmanager.afc.utils.TFCCommonUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TFCCommonUtils.b(TFCCommonUtils.d(context));
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === 单独子线程获取的oaid= " + TFCCommonUtils.b());
                    gVar.a(TFCCommonUtils.b());
                }
            });
            thread2.setName("TFCCommon.getOaid2");
            thread2.start();
            try {
                c = (String) gVar.get(1000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                c = "";
            }
        } else {
            c = e(context);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === 海关子线程获取的oaid= " + c);
        }
        return c;
    }

    private static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        try {
            String a2 = bzj.a(context);
            if (StringUtils.isEmpty(a2)) {
                return "";
            }
            com.taobao.flowcustoms.afc.utils.f.a(context).a("afc_oaid", a2);
            return a2;
        } catch (Throwable th) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === 获取OAID异常= " + th.getMessage());
            return "";
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (StringUtils.isEmpty(str2)) {
            return str.trim();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, str3);
        return a(str, hashMap);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (map == null || map.size() == 0) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === appendParams === 参数map为空，返回原始URL=" + str);
            return str.trim();
        } else if (Boolean.parseBoolean(kog.a().a("parseRouterUrl", "false"))) {
            try {
                return b(str, map);
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        } else {
            try {
                StringBuilder sb = new StringBuilder();
                for (String str2 : map.keySet()) {
                    if (!StringUtils.isEmpty(map.get(str2))) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(map.get(str2));
                        sb.append("&");
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                String trim = str.trim();
                int length = trim.length();
                int indexOf = trim.indexOf("?");
                if (indexOf < 0) {
                    str = trim + "?" + sb.toString();
                } else if (length - 1 == indexOf) {
                    str = trim + sb.toString();
                } else {
                    str = trim + "&" + sb.toString();
                }
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === appendParams === 拼接成的URL=" + str);
                return str;
            } catch (Exception e2) {
                com.taobao.flowcustoms.afc.utils.c.a("linkx", "TFCCommonUtils === appendParams === 拼接url异常：" + e2);
                return str;
            }
        }
    }

    private static String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e314d2e", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, map.get(str2));
        }
        buildUpon.build();
        return buildUpon.toString();
    }

    public static boolean b(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76721b1a", new Object[]{application})).booleanValue() : application != null && !StringUtils.isEmpty(Login.getEncryptLoginToken(application));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.linkmanager.afc.utils.TFCCommonUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            java.lang.String r10 = "a6ba28c2"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L15:
            r0 = 0
            java.lang.String r1 = "content://com.huawei.appmarket.commondata/item/3"
            android.net.Uri r4 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r5 = 0
            java.lang.String r6 = "com.taobao.taobao"
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            if (r10 == 0) goto L35
            r10.moveToFirst()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5d
            java.lang.String r0 = r10.getString(r2)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L5d
            goto L35
        L33:
            r1 = move-exception
            goto L42
        L35:
            if (r10 == 0) goto L5c
        L37:
            r10.close()
            goto L5c
        L3b:
            r10 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L5e
        L40:
            r1 = move-exception
            r10 = r0
        L42:
            java.lang.String r2 = "linkx"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "TFCCommonUtils === getTrackId: 获取渠道信息异常："
            r3.append(r4)     // Catch: java.lang.Throwable -> L5d
            r3.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            com.taobao.flowcustoms.afc.utils.c.a(r2, r1)     // Catch: java.lang.Throwable -> L5d
            if (r10 == 0) goto L5c
            goto L37
        L5c:
            return r0
        L5d:
            r0 = move-exception
        L5e:
            if (r10 == 0) goto L63
            r10.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.utils.TFCCommonUtils.c(android.content.Context):java.lang.String");
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return StringUtils.isEmpty(Login.getLoginToken()) ^ true ? Login.checkSessionValid() ? "login" : "sessionInvalid" : "unLogin";
        } catch (Throwable unused) {
            com.taobao.flowcustoms.afc.utils.c.b("linkx", "TFCCommonUtils.getLoginStatus.error.");
            return "error";
        }
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public static float b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue() : f / Resources.getSystem().getDisplayMetrics().density;
    }
}
