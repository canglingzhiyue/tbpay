package tb;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.a;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.linkmanager.flowout.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class koh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "action";
    public static final String APPKEY = "appkey";
    public static final String COLDBOOT = "coldBoot";
    public static final String CURRENT_KEY = "currentAppKey";
    public static final String CURRENT_PACKAGE_NAME = "currentPN";
    public static final String H5_URL = "h5Url";
    public static final String JUMP_URL = "jumpUrl";
    public static final String LAUNCHTYPE = "launchType";
    public static final String LINK_MANAGER_SDK = "lmSDK";
    public static final String LINK_MANAGER_SDK_VERSION = "lmSDKV";
    public static final String MODULE = "module";
    public static final String SOURCE = "source";
    public static final String SOURCE_KEY = "sourceAppKey";
    public static final String SOURCE_PACKAGE_NAME = "sourcePN";
    public static final String SOURCE_SDK_VERSION = "sourceSDKV";
    public static final String SOURCE_VC = "sourceVC";
    public static final String TARGET_URL = "targetUrl";
    public static final String UNKNOWN = "unknown";
    public static final String USERID = "userid";

    static {
        kge.a(627126438);
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27330fdf", new Object[]{str, aVar});
        } else if (aVar == null) {
        } else {
            Map<String, String> a2 = a(aVar);
            a2.put("appkey", StringUtils.isEmpty(aVar.f17179a) ? "unknown" : aVar.f17179a);
            a2.put("action", StringUtils.isEmpty(aVar.e) ? "unknown" : aVar.e);
            String str2 = aou.module;
            if (StringUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            a2.put("module", str2);
            a2.put("h5Url", StringUtils.isEmpty(aVar.g) ? "unknown" : aVar.g);
            if (StringUtils.isEmpty(str)) {
                str = "unknown";
            }
            a2.put(c.VISA, str);
            b.a(b.APPLINK_GATEWAY, "", "", a2);
        }
    }

    public static Map<String, String> a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5fff970a", new Object[]{aVar});
        }
        HashMap hashMap = new HashMap();
        if (aVar == null) {
            return hashMap;
        }
        String str = "unknown";
        hashMap.put(SOURCE_PACKAGE_NAME, !StringUtils.isEmpty(a.b) ? a.b : str);
        hashMap.put(CURRENT_PACKAGE_NAME, AfcUtils.a(AfcCustomSdk.a().f17167a));
        hashMap.put("targetUrl", aVar.n != null ? aVar.n.toString() : str);
        hashMap.put("source", aVar.i == null ? str : aVar.i);
        hashMap.put("sourceAppKey", aVar.f17179a != null ? aVar.f17179a : str);
        hashMap.put(CURRENT_KEY, AfcCustomSdk.a().b != null ? AfcCustomSdk.a().b : str);
        String b = b(aVar);
        if (b == null) {
            b = str;
        }
        hashMap.put(SOURCE_VC, b);
        hashMap.put(LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
        hashMap.put(SOURCE_SDK_VERSION, aVar.d);
        hashMap.put("userid", StringUtils.isEmpty(aVar.B) ? str : aVar.B);
        hashMap.put(COLDBOOT, StringUtils.isEmpty(aVar.C) ? str : aVar.C);
        if (!StringUtils.isEmpty(aVar.D)) {
            str = aVar.D;
        }
        hashMap.put("launchType", str);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (android.text.StringUtils.isEmpty(r1) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "AfcDataManager === getVisa === visa=" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Intent r4) {
        /*
            java.lang.String r0 = "visa"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.koh.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L18
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r4
            java.lang.String r4 = "b1abe71b"
            java.lang.Object r4 = r1.ipc$dispatch(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L18:
            java.lang.String r1 = ""
            if (r4 != 0) goto L1d
            return r1
        L1d:
            java.lang.String r2 = r4.getDataString()     // Catch: java.lang.Throwable -> L3c
            boolean r3 = android.text.StringUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2f
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r2.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L3c
        L2f:
            boolean r2 = android.text.StringUtils.isEmpty(r1)
            if (r2 == 0) goto L47
        L35:
            java.lang.String r1 = r4.getStringExtra(r0)
            goto L47
        L3a:
            r2 = move-exception
            goto L5f
        L3c:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            boolean r2 = android.text.StringUtils.isEmpty(r1)
            if (r2 == 0) goto L47
            goto L35
        L47:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "AfcDataManager === getVisa === visa="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "linkx"
            com.taobao.flowcustoms.afc.utils.c.a(r0, r4)
            return r1
        L5f:
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 == 0) goto L68
            r4.getStringExtra(r0)
        L68:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.koh.a(android.content.Intent):java.lang.String");
    }

    public static String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a075e0a", new Object[]{aVar});
        }
        if (aVar.m == null) {
            return null;
        }
        return aVar.m.get(SOURCE_VC);
    }

    public static void a(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef60750b", new Object[]{application, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appkey", str);
        hashMap.put("fcSDKVersion", str2);
        hashMap.put("appVersion", AfcCustomSdk.a().c);
        hashMap.put(CURRENT_PACKAGE_NAME, AfcUtils.a(application));
        hashMap.put("dataFrom", LINK_MANAGER_SDK);
        b.a(b.ALIBC_FLOWCUSTOMS_INIT, "", "", hashMap);
    }
}
