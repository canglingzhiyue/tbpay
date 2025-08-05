package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1156753788);
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62e9ad64", new Object[]{obj});
        }
        try {
            return (JSONObject) JSONObject.toJSON(obj);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj});
        }
        try {
            return JSONObject.toJSONString(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
