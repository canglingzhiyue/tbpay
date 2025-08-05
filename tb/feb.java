package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.a;
import com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.b;
import com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.d;

/* loaded from: classes5.dex */
public class feb implements dzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1004910413);
        kge.a(172549613);
    }

    public feb() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBWidgetViewHolderFactory");
    }

    @Override // tb.dzr
    public c<? extends epi> a(Activity activity, epi epiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6c9bcdc5", new Object[]{this, activity, epiVar});
        }
        if (activity == null || epiVar == null) {
            return null;
        }
        String type = epiVar.getType();
        char c = 65535;
        switch (type.hashCode()) {
            case -1906976470:
                if (type.equals("bottom_bar_presale")) {
                    c = 3;
                    break;
                }
                break;
            case 261060933:
                if (type.equals("bottom_bar_remind")) {
                    c = 1;
                    break;
                }
                break;
            case 606371237:
                if (type.equals("bottom_bar_sm_cart")) {
                    c = 2;
                    break;
                }
                break;
            case 1534974683:
                if (type.equals("bottom_bar_fav")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new a(activity);
        }
        if (c == 1) {
            return new com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.c(activity);
        }
        if (c == 2) {
            return new d(activity);
        }
        if (c == 3) {
            return new b(activity);
        }
        return null;
    }
}
