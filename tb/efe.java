package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.android.address.f;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.zcache.n;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.U4Engine;
import com.ut.device.UTDevice;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class efe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "address.AddressUtils";

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null && StringUtils.equals(variation.getValueAsString("false"), "true")) {
                z = true;
            }
            AdapterForTLog.loge(TAG, "getAddressEVOValue component:" + str + " module=" + str2 + " key=" + str3 + " value=" + z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return z;
    }

    public static boolean b(Activity activity) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        try {
            AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit");
            Intent intent = activity.getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                String queryParameter = data.getQueryParameter("bizIdentity");
                AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit bizIdentity:" + queryParameter);
                for (String str : b("address_h5edit_support_biz", "onehour_timing").split(";")) {
                    if (StringUtils.equals(str, queryParameter)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit error", e);
        }
        AdapterForTLog.logd(TAG, "isBizIdentityUseH5Edit false");
        return false;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            PositionInfo b = b.b(context);
            AdapterForTLog.loge(TAG, "H5EditWhiteList countryCode = " + b.countryCode);
            for (String str : b("address_h5edit_support_oversea_code", "").split(";")) {
                if (StringUtils.equals(str, b.countryCode)) {
                    return true;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "H5EditWhiteList error", e);
        }
        AdapterForTLog.logd(TAG, "H5EditWhiteList false");
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            PositionInfo c = b.c(context);
            AdapterForTLog.loge(TAG, "H5EditBlacklist countryCode = " + c.countryCode);
            for (String str : b("address_h5edit_unsupport_country_code", "").split(";")) {
                if (StringUtils.equals(str, c.countryCode)) {
                    return true;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "H5EditBlacklist error", e);
        }
        AdapterForTLog.logd(TAG, "H5EditBlacklist false");
        return false;
    }

    public static boolean a(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd3dccc3", new Object[]{positionInfo})).booleanValue();
        }
        AdapterForTLog.loge(TAG, "isOversea countryCode = " + positionInfo.countryCode);
        boolean a2 = b.a(positionInfo.editionCode);
        if ("MO".equals(positionInfo.countryCode) && a("MO_isNotForigen")) {
            return false;
        }
        if ("HK".equals(positionInfo.countryCode) && a("HK_isNotForigen")) {
            return false;
        }
        AdapterForTLog.logd(TAG, "isOversea " + a2);
        return a2;
    }

    public static boolean b(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7594b62", new Object[]{positionInfo})).booleanValue();
        }
        AdapterForTLog.loge(TAG, "isOversea countryCode = " + positionInfo.countryCode);
        boolean a2 = b.a(positionInfo.editionCode);
        try {
            for (String str : b("address_exclude_oversea_site", "").split(";")) {
                if (StringUtils.equals(str, positionInfo.countryCode)) {
                    return false;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isOversea error", e);
        }
        AdapterForTLog.logd(TAG, "isOversea " + a2);
        return a2;
    }

    public static boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{activity})).booleanValue();
        }
        boolean c = c("use_h5_containter");
        boolean a2 = a("useNewEditOrange");
        boolean a3 = a("AB_new_address_edit", "address_edit", "useNewEdit");
        int a4 = a();
        boolean z2 = a4 == 0 || a4 == 1;
        AdapterForTLog.logd(TAG, "isUseH5Edit orangeUseH5:" + c + "use_use_new_edit:" + a2 + " evoUseNewEdit:" + a3 + ",highLevel = " + z2);
        HashMap hashMap = new HashMap();
        hashMap.put("orangeUseH5", String.valueOf(c));
        hashMap.put("use_use_new_edit", String.valueOf(a2));
        hashMap.put("evoUseNewEdit", String.valueOf(a3));
        hashMap.put("deviceLevel", String.valueOf(a4));
        hashMap.put("highLevel", String.valueOf(z2));
        PositionInfo b = b.b(activity);
        PositionInfo c2 = b.c(activity);
        dof.a(19997, "startJudgeCanEnterNewEdit", null, null, null);
        hashMap.put("sitePositionInfo", b.countryCode);
        hashMap.put("ipPositionInfo", c2.countryCode);
        if (!c) {
            return false;
        }
        try {
            Language a5 = com.alibaba.ability.localization.b.a();
            AdapterForTLog.loge(TAG, "isUseH5Edit language = " + a5.getLanguage());
            z = !com.alibaba.ability.localization.b.b();
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isUseH5Edit language error", th);
        }
        String str = "1";
        if (!z && !(z = b(activity))) {
            boolean a6 = a(b);
            if (a6) {
                z = a((Context) activity);
                dof.a(19997, "supportOversea", gbk.TYPE_SELECTED, z ? str : "0", null);
            } else {
                boolean a7 = a("use_ip_judge_country");
                hashMap.put("useIpJudgeCountry", String.valueOf(a7));
                if (a7) {
                    a6 = a(c2);
                }
                if (a6) {
                    z = !b((Context) activity);
                    dof.a(19997, "supportOversea", c.IP, z ? str : "0", null);
                } else {
                    if ((a2 || a3) && (z2 || c("ignoreLevel"))) {
                        z = true;
                    }
                    dof.a(19997, "supportOversea", "ab", z ? str : "0", null);
                }
            }
        }
        if (!z) {
            str = "0";
        }
        dof.a(19997, "canEnterNewEdit", null, str, hashMap);
        return z;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        try {
            PositionInfo b = b.b(context);
            PositionInfo c = b.c(context);
            AdapterForTLog.loge(TAG, "appendH5UrlParams countryCode = " + b.countryCode + " ipPositionInfo:" + c.countryCode);
            boolean b2 = b(b);
            if (b2) {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(b2);
            } else if (a("use_ip_judge_country")) {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(b(c));
            } else {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(b2);
            }
            sb.append("&");
            sb.append("country");
            sb.append("=");
            sb.append(b.countryCode);
            sb.append("&");
            sb.append("ipCountry");
            sb.append("=");
            sb.append(c.countryCode);
            return c(str, sb.toString());
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isOverseaUnSupportByIP error", e);
            return sb.toString();
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2;
        }
        return str + "?" + str2;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            int a2 = akt.a();
            AdapterForTLog.loge(TAG, "deviceLevel = " + a2);
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        boolean a2 = a("list_optimize");
        boolean a3 = a("AB_new_address", "optimize", "client_optimze");
        AdapterForTLog.logd(TAG, "isAddressListOptimize open:" + a2 + " evoHit:" + a3);
        return a2 || a3;
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        boolean h = h();
        boolean d = d(context);
        hashMap.put("addressListNotCNForceWeex2", String.valueOf(h));
        hashMap.put("addressListOverseaSiteForceWeex2", String.valueOf(d));
        if (!h && !d) {
            boolean b = b();
            hashMap.put("addressListWeex2Url", String.valueOf(b));
            z = b ? ThemisConfig.a(str) : false;
        }
        dof.a("listWeex2", String.valueOf(z), str, hashMap);
        return z;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean c = c("support_use_new_list");
        boolean a2 = a("useNewListOrange");
        boolean a3 = a("AB_new_address", "address", "useNewList");
        AdapterForTLog.loge(TAG, "useNewList:" + a2 + " evoUseNewList:" + a3);
        if (c && (a2 || a3)) {
            z = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orangeUseH5", String.valueOf(c));
        hashMap.put("useNewList", String.valueOf(a2));
        hashMap.put("evoUseNewList", String.valueOf(a3));
        dof.a("isAddressListWeex2Url", String.valueOf(z), "", hashMap);
        return z;
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : (com.alibaba.ability.localization.b.b() ^ true) && c("not_cn_use_weex2_list");
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : b(b.b(context)) && a("oversea_site_use_weex2_list");
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            return !StringUtils.isEmpty(str) ? URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8") : "";
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "urlEncoded error", e);
            return "";
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        AdapterForTLog.loge(f.TAG, "address prefetch run");
        n.a(Arrays.asList(d().getString(f.SP_KEY_ADDRESS_ZCACHE_LIST, f.CONSTANT_ADDRESS_ZCACHE_LIST_DEFAULT).split(";")));
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        final int a2 = a("zcache_delay_ms", 30000);
        ayq.a(new Runnable() { // from class: tb.efe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AdapterForTLog.loge(f.TAG, "address prefetch delay:" + a2);
                efe.c();
            }
        }, a2);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (a("close_act_transparent")) {
        } else {
            if (Build.VERSION.SDK_INT == 26) {
                activity.setRequestedOrientation(-1);
            } else {
                activity.setRequestedOrientation(1);
            }
            activity.getWindow().setBackgroundDrawableResource(17170445);
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        try {
            return 2 == (U4Engine.isInited() ? WebView.getCoreType() : 2);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isSystemWebView fail", th);
            return false;
        }
    }

    public static SharedPreferences d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("9a13e8ff", new Object[0]) : f.a().getSharedPreferences(f.SP_FILE_NAME, 0);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("receiverAddressConfig", str, str2);
        AdapterForTLog.loge(TAG, "key:" + str + " defValue:" + str2 + " value:" + config);
        return config;
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(b(str, String.valueOf(i)));
        } catch (Throwable unused) {
            return i;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : b(str, -1);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : b(str, 10000);
    }

    public static boolean b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d253bf4", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            long hashCode = UTDevice.getUtdid(f.a()).hashCode();
            String userId = Login.getUserId();
            if (!StringUtils.isEmpty(userId)) {
                hashCode = Long.parseLong(userId);
            }
            int a2 = a(str, i);
            boolean z = hashCode % 10000 < ((long) a2);
            AdapterForTLog.loge(TAG, "key:" + str + " defValue:" + i + " configValue:" + a2 + " result:" + z);
            return z;
        } catch (Throwable unused) {
            return i >= 10000;
        }
    }
}
