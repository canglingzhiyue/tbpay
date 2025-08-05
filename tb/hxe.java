package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxe implements hzz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1445961485);
        kge.a(1144082749);
    }

    @Override // tb.hzz
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            bpp.a().commitSuccess(str, b("tagId", map), "1.0", "new_ultron_babel_order", "", map);
        } catch (Throwable unused) {
        }
    }

    @Override // tb.hzz
    public void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            bpp.a().commitFailure(str, str2, "1.0", "new_ultron_babel_order", "", map, str3, str4);
        } catch (Throwable unused) {
        }
    }

    private String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e314d2e", new Object[]{this, str, map});
        }
        if (map == null || !map.containsKey(str)) {
            return "";
        }
        map.remove(str);
        return map.get(str);
    }
}
