package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.sud;

/* loaded from: classes9.dex */
public interface thk extends sud {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1035066662);
        }

        public static void a(thk thkVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ba5f546", new Object[]{thkVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(thkVar, instance);
        }

        public static void b(thk thkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eef54d82", new Object[]{thkVar});
            } else {
                sud.a.b(thkVar);
            }
        }
    }

    shc a();

    void a(String str);

    void a(String str, long j);

    void a(String str, String str2);

    void a(shc shcVar);

    boolean b(String str);

    String c(String str);

    boolean d(String str);

    long e(String str);
}
