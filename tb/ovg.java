package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class ovg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(309878644);
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map != null && !map.isEmpty()) {
            String valueOf = String.valueOf(map.get("bizName"));
            String valueOf2 = String.valueOf(map.get("request_key"));
            if ("taobaolive_msoa".equals(valueOf)) {
                map.put("openFrom", "tblive");
                if (TextUtils.isEmpty(valueOf2)) {
                    map.put("request_key", "tblive");
                } else {
                    map.put("request_key", valueOf2 + ",tblive");
                }
            }
        }
        return map;
    }

    public static String b(Map<String, ? extends Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get("request_key")) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!TextUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&request_key=" + valueOf;
        }
        return null;
    }

    public static String c(Map<String, ? extends Object> map) {
        Object obj;
        String[] split;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{map});
        }
        if (map == null || map.isEmpty() || (obj = map.get(noa.KEY_MSOA_TRANS_KEY)) == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!TextUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            return str + "&transparent_key=" + valueOf;
        }
        return null;
    }
}
