package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class HWPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24293a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return i.m1688a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String a2 = i.a(context, e.ASSEMBLE_PUSH_HUAWEI, false);
        String a3 = af.a(context).a(au.UPLOAD_HUAWEI_TOKEN);
        return !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && "synced".equals(a3);
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f24293a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) {
        String string;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("pushMsg")) {
                            string = jSONObject.getString("pushMsg");
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d(e.toString());
            }
        }
        string = "";
        PushMessageReceiver a2 = i.a(context);
        if (a2 != null) {
            MiPushMessage a3 = i.a(string);
            if (a3.getExtra().containsKey("notify_effect")) {
                return;
            }
            a2.onNotificationMessageClicked(context, a3);
        }
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    str2 = jSONObject.getString("content");
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d(e.toString());
        }
        PushMessageReceiver a2 = i.a(context);
        if (a2 != null) {
            a2.onReceivePassThroughMessage(context, i.a(str2));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager a2 = f.a(context).a(e.ASSEMBLE_PUSH_HUAWEI);
        if (a2 != null) {
            a2.register();
        }
    }

    public static void reportError(String str, int i) {
        i.a(str, i);
    }

    public static synchronized void setConnectTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void setGetTokenTime(Context context) {
        synchronized (HWPushHelper.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
        }
    }

    public static void setNeedConnect(boolean z) {
        f24293a = z;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        synchronized (HWPushHelper.class) {
            return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1L)) > AuthenticatorCache.MAX_CACHE_TIME;
        }
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        synchronized (HWPushHelper.class) {
            return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
        }
    }

    public static void uploadToken(Context context, String str) {
        i.m1687a(context, e.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
