package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import java.util.Map;

/* loaded from: classes4.dex */
public class dyl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN = "main";
    public static final String MODE = "mode";
    public static final String PRELOAD = "preload";

    /* renamed from: a  reason: collision with root package name */
    private String f27109a = "default";

    static {
        kge.a(262365355);
    }

    public dyl() {
        emu.a("com.taobao.android.detail.core.detail.controller.RequestDataOrderController");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            this.f27109a = str;
        }
    }

    private String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map}) : (map == null || !"preload".equals(map.get("mode"))) ? "main" : "preload";
    }

    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        synchronized (this) {
            String b = b(map);
            String a2 = l.a("RequestDataOrderController");
            i.a(a2, "tempMode:" + b);
            if ("preload".equals(b) && "main".equals(this.f27109a)) {
                return false;
            }
            this.f27109a = b;
            return true;
        }
    }

    public static dyl a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyl) ipChange.ipc$dispatch("a750e49c", new Object[]{detailCoreActivity});
        }
        if (detailCoreActivity != null && detailCoreActivity.y() != null) {
            return detailCoreActivity.y().b();
        }
        return null;
    }
}
