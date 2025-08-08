package tb;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class ezy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1003856504);
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map != null && !map.isEmpty()) {
            String valueOf = String.valueOf(map.get("bizName"));
            Object obj = map.get("request_key");
            if ("taobaolive_msoa".equals(valueOf)) {
                map.put("openFrom", "tblive");
                if (obj == null) {
                    map.put("request_key", "openFrom");
                } else {
                    map.put("request_key", obj.toString() + ",openFrom");
                }
            }
        }
        return map;
    }

    public static String b(Map<String, Object> map) {
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
        if (!StringUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!StringUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (StringUtils.isEmpty(str)) {
                return str;
            }
            return str + "&request_key=" + valueOf;
        }
        return null;
    }

    public static String c(Map<String, Object> map) {
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
        if (!StringUtils.isEmpty(valueOf) && (split = valueOf.split(",")) != null && split.length != 0) {
            String str = "";
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!StringUtils.isEmpty(obj3)) {
                        str = str + "&" + str2 + "=" + obj3;
                    }
                }
            }
            if (StringUtils.isEmpty(str)) {
                return str;
            }
            return str + "&transparent_key=" + valueOf;
        }
        return null;
    }

    public static void a(Map<String, Object> map, Bundle bundle) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9095b97", new Object[]{map, bundle});
        } else if (map != null && !map.isEmpty() && bundle != null && (obj = map.get(noa.KEY_MSOA_TRANS_KEY)) != null) {
            String valueOf = String.valueOf(obj);
            if (StringUtils.isEmpty(valueOf)) {
                return;
            }
            String[] split = valueOf.split(",");
            if (split == null || split.length == 0) {
                String str = "TRANSPARENT_KEY : value is not illegal,   it is = " + valueOf;
                return;
            }
            bundle.putString(noa.KEY_MSOA_TRANS_KEY, valueOf);
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && (obj2 = map.get(str2)) != null) {
                    String obj3 = obj2.toString();
                    if (!StringUtils.isEmpty(obj3)) {
                        bundle.putString(str2, obj3);
                    }
                }
            }
        }
    }
}
