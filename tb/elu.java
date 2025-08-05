package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class elu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, elt> f27422a;

    static {
        kge.a(357523235);
        f27422a = new ConcurrentHashMap();
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.TTDetailHeaderPicPresenterManager");
    }

    public static elt a(q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elt) ipChange.ipc$dispatch("ed56047e", new Object[]{qVar, str});
        }
        if (f27422a.containsKey(str)) {
            return f27422a.get(str);
        }
        elt eltVar = new elt(qVar);
        f27422a.put(str, eltVar);
        return eltVar;
    }

    public static elt a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elt) ipChange.ipc$dispatch("7c6edb07", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return f27422a.get(str);
        }
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f27422a.remove(str);
        }
    }
}
