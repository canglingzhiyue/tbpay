package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface tlf extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(78096118);
        }

        public static void a(tlf tlfVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea13a5ef", new Object[]{tlfVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(tlfVar, instance);
        }

        public static void b(tlf tlfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef2b65ab", new Object[]{tlfVar});
            } else {
                sud.a.b(tlfVar);
            }
        }
    }

    boolean a();
}
