package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.f;
import java.util.Map;

/* loaded from: classes.dex */
public class huv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        huw.b().c("uikit_navigation_extern_cache", str);
        return true;
    }

    public Map<String, f> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : hus.a(huw.b().b("uikit_navigation_extern_cache", null));
    }
}
