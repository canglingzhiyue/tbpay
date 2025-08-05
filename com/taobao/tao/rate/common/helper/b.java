package com.taobao.tao.rate.common.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.kge;
import tb.ris;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RATE_DETAIL_V2_PAGE_I18N_URL = "https://web.m.taobao.com/app/mtb-guang/ugc/evaluation/detail?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&rateId=";
    public static final String RATE_DETAIL_V2_PAGE_URL = "https://h5.m.taobao.com/tnode/index.htm?tnode=page_ratedetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue&rateId=";

    static {
        kge.a(-547867783);
    }

    public static void a(StringBuilder sb, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6664ae8d", new Object[]{sb, jSONObject});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = jSONObject.get(str);
                    if (!(obj instanceof String)) {
                        obj = String.valueOf(obj);
                    }
                    sb.append("&");
                    sb.append(str);
                    sb.append("=");
                    sb.append(obj);
                }
            }
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return str;
        }
        int indexOf = str.indexOf("?");
        try {
            if (indexOf < 0) {
                str = str + "?";
            } else if (indexOf < str.length() - 1) {
                str = str + "&";
            }
            return str + "xRatePublishSuccessParams=" + URLEncoder.encode(jSONObject.toJSONString(), "UTF-8");
        } catch (Exception e) {
            Log.e("TradeRateUtils", "Url encode error:" + e.getMessage());
            return str;
        }
    }

    public static void a(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381e885a", new Object[]{context, jSONObject, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("value", jSONObject);
        hashMap.put("evt", str);
        new ris(context, str, null).a(hashMap);
    }

    public static Intent a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("667f488b", new Object[]{jSONObject});
        }
        Intent intent = new Intent("RateSuccess");
        if (jSONObject == null) {
            return intent;
        }
        for (String str : jSONObject.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                Object obj = jSONObject.get(str);
                intent.putExtra(str, obj instanceof String ? (String) obj : String.valueOf(obj));
            }
        }
        return intent;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "rateSucessPageUrl", "https://web.m.taobao.com/app/mtb-guang/comment-success/home?wh_weex=true&weex_mode=dom&disableNav=YES&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&spm=w-a2141.12310610&orderId=");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : OrangeConfig.getInstance().getConfig("tb_ratedisplay_Android", "rateSucessOldPageUrl", "https://market.m.taobao.com/app/mtb/app-comment-success-tnode/main2021?wh_weex=true&wx_navbar_transparent=true&spm=w-a2141.12310610&orderId=");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "rate_success_jump_url", "https://web.m.taobao.com/app/mtb-guang/comment-success/home?wh_weex=true&weex_mode=dom&disableNav=YES&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&spm=w-a2141.12310610");
    }

    public static Boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("3a0effa8", new Object[0]) : Boolean.valueOf(OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "enableSuccessJumpUrl", "false"));
    }

    public static Boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("844098e9", new Object[0]) : Boolean.valueOf(OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "enable_publish_success_jump", "false"));
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "rate_detail_v2_page_url", RATE_DETAIL_V2_PAGE_URL);
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : OrangeConfig.getInstance().getConfig("tb_ratepublish_android", "rate_detail_v2_page_i18n_url", RATE_DETAIL_V2_PAGE_I18N_URL);
    }
}
