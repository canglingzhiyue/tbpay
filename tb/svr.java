package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface svr extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1845703291);
        }

        public static void a(svr svrVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9a4384e", new Object[]{svrVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(svrVar, instance);
        }

        public static void b(svr svrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee08ec8a", new Object[]{svrVar});
            } else {
                sud.a.b(svrVar);
            }
        }
    }

    Float a();

    Float b();
}
