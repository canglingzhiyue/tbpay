package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes7.dex */
public class noo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-381878067);
    }

    public static void a(Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
        } else if (map == null || map2 == null) {
            q.b("GlobalParamsUtil", "fillGlobalParams:targetParams或originalParams为空");
        } else {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (TextUtils.isEmpty(key)) {
                    q.b("GlobalParamsUtil", "fillGlobalParams:key为空");
                } else if (!key.startsWith(noa.GLOBAL_PARAM_PREFIX)) {
                    q.b("GlobalParamsUtil", "fillGlobalParams:非全局参数");
                } else {
                    if (value == null) {
                        value = "";
                    }
                    map.put(key, value);
                }
            }
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null) {
            q.b("GlobalParamsUtil", "replaceGlobalParams:params为空");
        } else {
            for (String str : new HashSet(map.keySet())) {
                if (!TextUtils.isEmpty(str) && str.startsWith(noa.GLOBAL_PARAM_PREFIX)) {
                    if (2 >= str.length()) {
                        q.b("GlobalParamsUtil", "replaceGlobalParams:参数前缀位置超长");
                    } else {
                        String substring = str.substring(2);
                        if (TextUtils.isEmpty(substring)) {
                            q.b("GlobalParamsUtil", "replaceGlobalParams:realParams为空");
                        } else {
                            String remove = map.remove(str);
                            if (TextUtils.isEmpty(remove)) {
                                q.b("GlobalParamsUtil", "replaceGlobalParams:value为空");
                            } else {
                                map.put(substring, remove);
                                q.a("GlobalParamsUtil", "真实参数：" + substring + " " + remove);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return map.get(noa.GLOBAL_PARAM_PREFIX + str);
    }
}
