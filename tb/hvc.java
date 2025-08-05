package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.ak;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes6.dex */
public final class hvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hvc INSTANCE;

    static {
        kge.a(1217428595);
        INSTANCE = new hvc();
    }

    private hvc() {
    }

    @JvmStatic
    public static final void a(String str, DinamicXEngine dxEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80597663", new Object[]{str, dxEngine});
            return;
        }
        q.d(dxEngine, "dxEngine");
        if (str == null) {
            return;
        }
        Iterator<T> it = huz.INSTANCE.a(str).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            h hVar = (h) pair.component2();
            Long e = n.e((String) pair.component1());
            if (e != null) {
                dxEngine.a(e.longValue(), hVar);
            }
        }
        Iterator<T> it2 = hvb.INSTANCE.a(str).iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            ak akVar = (ak) pair2.component2();
            Long e2 = n.e((String) pair2.component1());
            if (e2 != null) {
                dxEngine.a(e2.longValue(), akVar);
            }
        }
        Iterator<T> it3 = hva.INSTANCE.a(str).iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            fuf fufVar = (fuf) pair3.component2();
            Long e3 = n.e((String) pair3.component1());
            if (e3 != null) {
                dxEngine.a(e3.longValue(), fufVar);
            }
        }
    }
}
