package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface trm extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1407946671);
        }

        public static void a(trm trmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1001ac9", new Object[]{trmVar});
            } else {
                sud.a.b(trmVar);
            }
        }

        public static void a(trm trmVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9673cd0e", new Object[]{trmVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(trmVar, instance);
        }
    }
}
