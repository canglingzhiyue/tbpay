package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface suc extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1821072059);
        }

        public static void a(suc sucVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80f8be3c", new Object[]{sucVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(sucVar, instance);
        }

        public static void b(suc sucVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edf40378", new Object[]{sucVar});
            } else {
                sud.a.b(sucVar);
            }
        }
    }

    void a();

    void b();

    void d();

    void dJ_();
}
