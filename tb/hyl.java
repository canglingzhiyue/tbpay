package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-708741884);
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
            return JSONObject.parseObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
