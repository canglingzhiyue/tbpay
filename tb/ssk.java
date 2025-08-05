package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.d;
import com.taobao.login4android.api.Login;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class ssk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Map<String, Object>> f33885a = new ConcurrentHashMap(4);

    public static void a(String str, Object obj) {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (!d.a().b() || (userId = Login.getUserId()) == null) {
        } else {
            Map<String, Object> map = f33885a.get(userId);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                f33885a.put(userId, map);
            }
            map.put(str, obj);
        }
    }

    public static Object a(String str) {
        String userId;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        if (d.a().b() && (userId = Login.getUserId()) != null && (map = f33885a.get(userId)) != null) {
            return map.get(str);
        }
        return null;
    }

    public static Map<String, Object> a() {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        if (!d.a().b() || (userId = Login.getUserId()) == null) {
            return null;
        }
        return f33885a.get(userId);
    }
}
