package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface swd extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-356035460);
        }

        public static void a(swd swdVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d8761d", new Object[]{swdVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(swdVar, instance);
        }

        public static void b(swd swdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee10a6d9", new Object[]{swdVar});
            } else {
                sud.a.b(swdVar);
            }
        }
    }

    void a();
}
