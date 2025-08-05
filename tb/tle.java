package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface tle extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1695640262);
        }

        public static void a(tle tleVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61e36610", new Object[]{tleVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(tleVar, instance);
        }

        public static void b(tle tleVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef2af14c", new Object[]{tleVar});
            } else {
                sud.a.b(tleVar);
            }
        }
    }
}
