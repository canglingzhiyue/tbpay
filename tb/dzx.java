package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;

/* loaded from: classes4.dex */
public class dzx implements dzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1342766083);
        kge.a(172549613);
    }

    public dzx() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.factory.impl.WidgetViewHolderFactory");
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
            case -1589392973:
                if (type.equals("bottom_bar_timing_shelves")) {
                    c = 2;
                    break;
                }
                break;
            case -963205637:
                if (type.equals("shop_info_item")) {
                    c = 3;
                    break;
                }
                break;
            case -892365596:
                if (type.equals("sys_button")) {
                    c = 0;
                    break;
                }
                break;
            case 339666105:
                if (type.equals("bottom_bar_icon")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new eak(activity);
        }
        if (c == 1) {
            return new dzz(activity);
        }
        if (c == 2) {
            return new eab(activity);
        }
        if (c == 3) {
            return new eaj(activity);
        }
        return null;
    }
}
