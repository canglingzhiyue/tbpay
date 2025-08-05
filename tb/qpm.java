package tb;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.titlebar.b;

/* loaded from: classes9.dex */
public interface qpm {
    Activity getCurrentActivity();

    Fragment getCurrentFragment();

    FragmentManager getCurrentFragmentManager();

    rnc getPageContainer();

    b getTitleBar();

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(404016064);
        }

        public static FragmentManager a(qpm qpmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FragmentManager) ipChange.ipc$dispatch("a3bc221d", new Object[]{qpmVar});
            }
            return null;
        }

        public static b b(qpm qpmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ac00bdbb", new Object[]{qpmVar});
            }
            rnc pageContainer = qpmVar.getPageContainer();
            if (pageContainer == null) {
                return null;
            }
            return pageContainer.a();
        }
    }
}
