package com.taobao.android.behavir.util;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import tb.dsj;
import tb.kge;

/* loaded from: classes.dex */
public class UtUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHANGED_UPP_EVENT_ID = 19998;
    public static final int MAX_SAMPLING = 100;
    public static final int MIN_SAMPLING = 0;
    public static final String UPP_ARG_1 = "upp_track";
    public static final int UPP_EVENT_ID = 19999;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9148a;

    static {
        kge.a(-2074980380);
        f9148a = null;
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{str, str2, str3, jSONObject});
            return;
        }
        int j = a.b.j();
        if (j <= 0) {
            TLog.logd("UtUtils", "upp track sampling is zero.");
            return;
        }
        if (com.taobao.android.behavix.utils.d.a()) {
            j = 100;
        }
        if (j == 100) {
            a(str, a(), UPP_ARG_1, str2, str3, jSONObject);
        } else if (TextUtils.isEmpty(dsj.f26943a)) {
        } else {
            if (f9148a == null) {
                try {
                    if (Long.parseLong(dsj.f26943a) % 100 >= j) {
                        z = false;
                    }
                    f9148a = Boolean.valueOf(z);
                } catch (Throwable th) {
                    TLog.loge("UtUtils", "parse user id error.", th);
                }
            }
            Boolean bool = f9148a;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            a(str, a(), UPP_ARG_1, str2, str3, jSONObject);
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9fe4a1", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
            return;
        }
        if (i2 == 19999) {
            i2 = a();
        }
        TBS.Ext.commitEvent(str, i2, str2, str3, str4, a(jSONObject));
        TLog.loge("UCP", "commitEvent", str, str2, str3, str4, com.taobao.android.behavix.utils.d.b() ? JSON.toJSONString(jSONObject) : "");
    }

    public static void commitEventForCpp(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d861677d", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(str5) && !"null".equals(str5)) {
            try {
                jSONObject = JSON.parseObject(str5);
            } catch (Throwable unused) {
            }
        }
        a(str, i, str2, str3, str4, jSONObject);
    }

    public static void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c357439", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        int a2 = i == 19999 ? a() : i;
        if (com.taobao.android.behavix.utils.d.b()) {
            TLog.loge("UCP", "commitEvent", str, str2, str3, str4, str5);
        }
        TBS.Ext.commitEvent(str, a2, str2, str3, str4, str5);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (!a.b.n()) {
            return 19999;
        }
        return CHANGED_UPP_EVENT_ID;
    }

    public static void a(String str, Map<String, ?> map, Map<String, ?> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{str, map, map2});
        } else if (Build.VERSION.SDK_INT <= 29) {
        } else {
            String str2 = "";
            String a2 = map == null ? str2 : a(JSON.toJSONString(map));
            if (map2 != null) {
                str2 = String.valueOf(g.a(map2));
            }
            a(str, a2, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (Build.VERSION.SDK_INT <= 28 || !com.taobao.android.behavix.behavixswitch.a.a("enableCasuallyLog", true)) {
        } else {
            if (!TextUtils.isEmpty(str3)) {
                str3 = "args=" + str3;
            }
            a("UCP", 19999, TLogTracker.SCENE_EXCEPTION, str, str2, str3);
        }
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 19 || str.length() < 3000) {
            return str;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            Deflater deflater = new Deflater(1);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
            deflaterOutputStream.write(str.getBytes());
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            deflater.end();
            return "Deflater:" + Base64.encodeToString(byteArray, 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
