package com.taobao.message.notification.util;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.constans.NotifyConstants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ParseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237413903);
    }

    public static Map<String, String> parseBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f169b7b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            String string = parseObject.getString("title");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            hashMap.put("title", string);
            String string2 = parseObject.getString(RemoteMessageConst.Notification.TICKER);
            if (TextUtils.isEmpty(string2)) {
                string2 = string;
            }
            hashMap.put(RemoteMessageConst.Notification.TICKER, string2);
            String string3 = parseObject.getString("text");
            if (!TextUtils.isEmpty(string3)) {
                string = string3;
            }
            hashMap.put("text", string);
            String string4 = parseObject.getString(RemoteMessageConst.Notification.SOUND);
            if (!TextUtils.isEmpty(string4)) {
                hashMap.put(RemoteMessageConst.Notification.SOUND, string4);
            }
            hashMap.put("url", parseObject.getString("url"));
            JSONObject jSONObject = parseObject.getJSONObject(Constants.KEY_EXTS);
            if (jSONObject != null) {
                hashMap.put("view_type", parseViewTypeFromJson(jSONObject));
                hashMap.put("id", parseOfficalIdFromJson(jSONObject));
                hashMap.put(Constants.KEY_EXTS, jSONObject.toString());
                hashMap.put("m-icon", jSONObject.getString("m-icon"));
                String string5 = jSONObject.getString("wmc_source_id");
                if (!TextUtils.isEmpty(string5)) {
                    hashMap.put("wmc_source_id", string5);
                }
                String string6 = jSONObject.getString("nav_source_id");
                if (!TextUtils.isEmpty(string6)) {
                    hashMap.put("nav_source_id", string6);
                }
                String string7 = jSONObject.getString(d.BUNDLE_BUSINESS_JUMP_URL);
                if (!TextUtils.isEmpty(string7)) {
                    hashMap.put(d.BUNDLE_BUSINESS_JUMP_URL, string7);
                }
                String string8 = jSONObject.getString("msg_type_id");
                if (!TextUtils.isEmpty(string8)) {
                    hashMap.put("msg_type_id", string8);
                }
                String string9 = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                if (!TextUtils.isEmpty(string9)) {
                    hashMap.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, string9);
                }
                String string10 = jSONObject.getString("messageId");
                if (!TextUtils.isEmpty(string10)) {
                    hashMap.put("messageId", string10);
                }
                String string11 = jSONObject.getString("templateId");
                if (!TextUtils.isEmpty(string11)) {
                    hashMap.put("templateId", string11);
                }
                String string12 = jSONObject.getString("bizType");
                if (!TextUtils.isEmpty(string12)) {
                    hashMap.put("bizType", string12);
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String parseViewTypeFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7966e9b", new Object[]{jSONObject}) : (jSONObject == null || !jSONObject.containsKey("view_type")) ? "0" : jSONObject.getString("view_type");
    }

    private static String parseOfficalIdFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fb404545", new Object[]{jSONObject}) : (jSONObject == null || !jSONObject.containsKey("id")) ? "" : jSONObject.getString("id");
    }

    public static String urlSplicingFromParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("994148b4", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(NotifyConstants.NOTIFY_URL_KEY_COMEFROM, "push");
        return buildUpon.build().toString();
    }
}
