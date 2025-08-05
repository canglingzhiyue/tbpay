package com.taobao.android.monitor.adaptor;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tlog.adapter.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, Map<String, Object> map) {
        String num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df32b29", new Object[]{context, map})).booleanValue();
        }
        if (map != null && !map.isEmpty()) {
            Integer num2 = (Integer) a(map, "feedbackId", Integer.class, (Object) null);
            if (num2 == null) {
                num = (String) a(map, "feedbackId", String.class, (Object) null);
            } else {
                num = num2.toString();
            }
            String str = (String) a(map, "bizType", String.class, "FEEDBACK");
            if (TextUtils.isEmpty(str)) {
                str = "FEEDBACK";
            }
            String str2 = (String) a(map, "bizCode", String.class, "taobao4android_feedback_21646297");
            if (TextUtils.isEmpty(str2)) {
                str2 = "taobao4android_feedback_21646297";
            }
            HashMap hashMap = new HashMap(3);
            if (num != null) {
                hashMap.put("feedbackId", num);
            }
            String str3 = (String) a(map, "title", String.class, (Object) null);
            if (str3 != null) {
                hashMap.put("title", str3);
            }
            String str4 = (String) a(map, "content", String.class, (Object) null);
            if (str4 != null) {
                hashMap.put("content", str4);
            }
            a(context, num, str3, str4);
            String.format("FeedbackID: %s, Title: %s, Content: %s, Type: %s, Code: %s", num, str3, str4, str, str2);
            d.a(context, str, str2, hashMap);
            return true;
        }
        TLog.loge("applicationmonitor_adaptor", "reportFullstrace", "param is null or empty!");
        return false;
    }

    private static <T> T a(Map<String, Object> map, String str, Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("833baba0", new Object[]{map, str, cls, t});
        }
        if (!map.containsKey(str)) {
            return null;
        }
        T t2 = (T) map.get(str);
        if (t2 != null && cls.isInstance(t2)) {
            return t2;
        }
        String str2 = "wrong data type for key" + str + ":" + t2;
        return t;
    }

    private static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        try {
            Intent intent = new Intent("com.taobao.android.diagnose.action.feedback");
            intent.putExtra("feedbackID", str);
            intent.putExtra("title", str2);
            intent.putExtra("content", str3);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
