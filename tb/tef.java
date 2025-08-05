package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class tef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(487892566);
    }

    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        pol a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(obj, str);
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        pol a2 = a();
        if (a2 == null) {
            return;
        }
        a2.a(obj);
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        pol a2 = a();
        if (a2 == null) {
            return;
        }
        a2.b(obj);
    }

    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        pol a2 = a();
        if (a2 == null) {
            return;
        }
        a2.c(obj);
    }

    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        pol a2 = a();
        if (obj == null || a2 == null) {
            return;
        }
        a2.a(obj, map);
    }

    public Map<String, String> d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7dcf57fc", new Object[]{this, obj});
        }
        pol a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.e(obj);
    }

    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity});
        }
        pol a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.a(activity);
    }

    private pol a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pol) ipChange.ipc$dispatch("f093c71", new Object[]{this}) : pmd.a().e();
    }
}
