package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.n;

/* loaded from: classes8.dex */
public class tkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-168044178);
    }

    public static final <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        try {
            return (T) JSONObject.parseObject(str, cls);
        } catch (Exception unused) {
            n.a("ParseUtils", "parseObject error text = " + str);
            return null;
        }
    }

    public static final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Exception unused) {
            n.a("ParseUtils", "parseObject error text = " + str);
            return null;
        }
    }
}
