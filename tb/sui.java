package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;

/* loaded from: classes9.dex */
public interface sui extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1766608461);
        }

        public static void a(sui suiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff73b731", new Object[]{suiVar});
            } else {
                g.a.a(suiVar);
            }
        }
    }

    ITMSPage a();

    int b();
}
