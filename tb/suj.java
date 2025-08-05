package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.extension.page.ae;
import com.taobao.themis.kernel.extension.page.tab.TabSwitchSource;
import com.taobao.themis.kernel.extension.page.tab.b;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.t;

/* loaded from: classes9.dex */
public interface suj extends ae {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-661317312);
        }

        public static /* synthetic */ boolean a(suj sujVar, int i, TabSwitchSource tabSwitchSource, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("31c2204b", new Object[]{sujVar, new Integer(i), tabSwitchSource, new Integer(i2), obj})).booleanValue();
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchTo");
            }
            if ((i2 & 2) != 0) {
                tabSwitchSource = null;
            }
            return sujVar.a(i, tabSwitchSource);
        }
    }

    int a(ITMSPage iTMSPage);

    ITMSPage a(int i);

    void a();

    void a(b bVar);

    void a(ruw<? super Integer, ? super String, t> ruwVar);

    boolean a(int i, int i2);

    boolean a(int i, TabSwitchSource tabSwitchSource);

    boolean a(int i, TabBarItem tabBarItem);

    boolean a(int i, String str);

    boolean a(TabBar tabBar);

    boolean a(String str);

    boolean b(int i);

    boolean b(int i, TabBarItem tabBarItem);

    boolean c(int i);

    void e();

    void f();

    View g();

    c h();

    int j();
}
