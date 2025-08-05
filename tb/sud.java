package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public interface sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1850831282);
        }

        public static void a(sud sudVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("928fe1b", new Object[]{sudVar, instance});
            } else {
                q.d(instance, "instance");
            }
        }

        public static void b(sud sudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edf477d7", new Object[]{sudVar});
            }
        }
    }

    void a(f fVar);

    void bQ_();
}
