package tb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.alibaba.ariver.kernel.RVEvents;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.k;
import com.taobao.tao.navigation.d;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import com.taobao.tao.navigation.h;

/* loaded from: classes7.dex */
public class muk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MYTAOBAO_TAB_INDEX = 4;

    static {
        kge.a(-232537464);
    }

    public static void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e5bd0c", new Object[]{hVar});
        } else if (hVar == null) {
        } else {
            e.a(4, hVar);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            e.a(new d() { // from class: tb.muk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.navigation.d
                public void onTabChanged(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                    } else if (i != 4 || e.c() == null || e.c().getCurrentFragment() == null) {
                        c.x = "tab" + i;
                    } else {
                        Fragment currentFragment = e.c().getCurrentFragment();
                        if (currentFragment instanceof TBBaseFragment) {
                            if (!(currentFragment instanceof MyTaobaoFragment)) {
                                return;
                            }
                            nwv.a(RVEvents.TAB_CLICK);
                            ((MyTaobaoFragment) currentFragment).preloadMtb((Activity) e.c().getContext());
                            nwv.a();
                            return;
                        }
                        g b = e.b(4);
                        b.d("com.taobao.mytaobao.homepage.MyTaobaoFragment");
                        b.a((Bundle) null);
                        e.a(4, b);
                        TBMainHost.a();
                        k a2 = TBMainHost.a(currentFragment.getActivity());
                        if (a2 == null) {
                            return;
                        }
                        a2.restoreTabHost();
                    }
                }
            });
        }
    }
}
