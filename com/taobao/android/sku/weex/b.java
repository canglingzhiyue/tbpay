package com.taobao.android.sku.weex;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.sku.utils.o;
import com.taobao.login4android.api.Login;
import com.ut.mini.UTAnalytics;
import tb.kge;
import tb.mly;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1865279505);
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : str == null ? str2 : str;
    }

    public static String a(Context context) {
        PositionInfo b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : (context == null || (b = com.taobao.android.editionswitcher.b.b(context)) == null) ? "" : a(b.countryCode, "");
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DispatchConstants.LONGTITUDE, (Object) "");
        jSONObject.put(DispatchConstants.LATITUDE, (Object) "");
        jSONObject.put("provinceDivisionCode", (Object) "");
        jSONObject.put("cityDivisionCode", (Object) "");
        jSONObject.put("areaDivisionCode", (Object) "");
        jSONObject.put("townDivisionCode", (Object) "");
        if (context == null) {
            return jSONObject.toJSONString();
        }
        RecommendedAddress a2 = com.taobao.android.address.b.a(context, "tb_purchase");
        if (a2 != null && a2.recommendedAddress != null) {
            jSONObject.put(DispatchConstants.LONGTITUDE, (Object) a(a2.recommendedAddress.lng, ""));
            jSONObject.put(DispatchConstants.LATITUDE, (Object) a(a2.recommendedAddress.lat, ""));
            jSONObject.put("provinceDivisionCode", (Object) a(a2.recommendedAddress.provinceDivisionCode, ""));
            jSONObject.put("cityDivisionCode", (Object) a(a2.recommendedAddress.cityDivisionCode, ""));
            jSONObject.put("areaDivisionCode", (Object) a(a2.recommendedAddress.areaDivisionCode, ""));
            jSONObject.put("townDivisionCode", (Object) a(a2.recommendedAddress.townDivisionCode, ""));
        }
        return jSONObject.toJSONString();
    }

    public static String c(Context context) {
        APSecuritySdk aPSecuritySdk;
        APSecuritySdk.TokenResult tokenResult;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : (context == null || (aPSecuritySdk = APSecuritySdk.getInstance(context.getApplicationContext())) == null || (tokenResult = aPSecuritySdk.getTokenResult()) == null) ? "" : a(tokenResult.apdidToken, "");
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context}) : a(Login.getSid(), "");
    }

    public static String e(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            try {
                return a(context.getResources().getConfiguration().locale.toString(), "");
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (TextUtils.isEmpty(globalProperty)) {
                return "";
            }
            String[] split = globalProperty.split(mly.UNESCAPED_SEPARATOR);
            if (split.length < 4) {
                return "";
            }
            String str = split[2];
            return str.length() <= 50 ? str : "";
        } catch (Throwable th) {
            o.b("getWeChatShareIdentifier: " + th.toString());
            return "";
        }
    }
}
