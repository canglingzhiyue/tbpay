package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.d;
import com.taobao.android.behavix.behavixswitch.f;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class drh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-135141985);
    }

    public static boolean a(dsp dspVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5c2057b", new Object[]{dspVar})).booleanValue();
        }
        if (dspVar == null) {
            return true;
        }
        List<dri> c = drg.a().c();
        List<dri> d = drg.a().d();
        return ((c == null || c.size() == 0) && (d == null || d.size() == 0)) || c(dspVar) || !b(dspVar);
    }

    private static boolean a(dsp dspVar, dri driVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("375fd970", new Object[]{dspVar, driVar})).booleanValue();
        }
        if (!TextUtils.equals(dspVar.e(), driVar.h())) {
            return false;
        }
        if (!d.a(driVar.b()) && d.a(driVar.b(), dspVar.a())) {
            return false;
        }
        if (!d.a(driVar.a()) && !d.a(driVar.a(), dspVar.a())) {
            return false;
        }
        if (!d.a(driVar.f()) && d.a(driVar.f(), dspVar.c())) {
            return false;
        }
        if (!d.a(driVar.e()) && !d.a(driVar.e(), dspVar.c())) {
            return false;
        }
        if (!d.a(driVar.d()) && d.a(driVar.d(), dspVar.b())) {
            return false;
        }
        if (!d.a(driVar.c()) && !d.a(driVar.c(), dspVar.b())) {
            return false;
        }
        if (!d.a(driVar.g())) {
            Map<String, List<f>> g = driVar.g();
            Map<String, Object> d = dspVar.d();
            if (d != null) {
                if (g.size() > d.size()) {
                    return false;
                }
                for (Map.Entry<String, List<f>> entry : g.entrySet()) {
                    List<f> value = entry.getValue();
                    if (!d.a(value) && !d.a(value, (String) d.get(entry.getKey()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean b(dsp dspVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4450bfc", new Object[]{dspVar})).booleanValue() : a(dspVar, drg.a().c());
    }

    private static boolean c(dsp dspVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2c8127d", new Object[]{dspVar})).booleanValue() : a(dspVar, drg.a().d());
    }

    private static boolean a(dsp dspVar, List<dri> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cfcc46c", new Object[]{dspVar, list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (dri driVar : list) {
            if (a(dspVar, driVar)) {
                return true;
            }
        }
        return false;
    }
}
