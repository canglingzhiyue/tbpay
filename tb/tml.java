package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public interface tml extends g, iva {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-427619663);
        }

        public static void a(tml tmlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b930e5", new Object[]{tmlVar});
            } else {
                g.a.a(tmlVar);
            }
        }

        public static void a(tml tmlVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c25590", new Object[]{tmlVar, page});
                return;
            }
            q.d(page, "page");
            g.a.a(tmlVar, page);
        }

        public static void c(tml tmlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddbf3de7", new Object[]{tmlVar});
            } else {
                g.a.c(tmlVar);
            }
        }
    }
}
