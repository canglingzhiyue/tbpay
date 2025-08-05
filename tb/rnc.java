package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.titlebar.b;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public interface rnc {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1639692644);
        }

        public static void a(rnc rncVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd597fd1", new Object[]{rncVar});
            }
        }

        public static void a(rnc rncVar, e error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2f261b7", new Object[]{rncVar, error});
            } else {
                q.d(error, "error");
            }
        }

        public static void b(rnc rncVar, e error) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f928cb8", new Object[]{rncVar, error});
            } else {
                q.d(error, "error");
            }
        }
    }

    b a();

    void a(View view);

    void a(e eVar);

    void a(String str);

    void a(boolean z);

    void attachPage(ITMSPage iTMSPage);

    void b(e eVar);

    void dZ_();

    View getView();
}
