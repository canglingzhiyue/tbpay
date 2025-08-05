package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.ae;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public interface tca extends ae {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1840148484);
        }

        public static void a(tca tcaVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b523571", new Object[]{tcaVar, page});
                return;
            }
            q.d(page, "page");
            ae.b.a(tcaVar, page);
        }

        public static void b(tca tcaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eeaa4c47", new Object[]{tcaVar});
            } else {
                ae.b.a(tcaVar);
            }
        }
    }

    void a(boolean z);

    boolean a(int i);

    boolean a(int i, String str);

    boolean a(String str, double d);

    boolean b(int i);

    rnc e();

    boolean j();
}
