package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface toa extends hij, sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1655090941);
        }

        public static void a(toa toaVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa99a97", new Object[]{toaVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(toaVar, instance);
        }

        public static void b(toa toaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef536653", new Object[]{toaVar});
            } else {
                sud.a.b(toaVar);
            }
        }
    }

    shc a();

    void a(shc shcVar);
}
