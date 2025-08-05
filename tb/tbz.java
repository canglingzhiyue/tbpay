package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface tbz extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(631067358);
        }

        public static void a(tbz tbzVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a36b4b51", new Object[]{tbzVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(tbzVar, instance);
        }
    }

    List<tcb> a();
}
