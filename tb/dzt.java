package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;

/* loaded from: classes4.dex */
public class dzt implements dzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1580004221);
        kge.a(-1249320359);
    }

    public dzt() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.factory.impl.BottomBarViewHolderFactory");
    }

    @Override // tb.dzr
    public c<? extends egq> a(Activity activity, egq egqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e978434", new Object[]{this, activity, egqVar});
        }
        String type = egqVar.getType();
        char c = 65535;
        int hashCode = type.hashCode();
        if (hashCode != -1589392973) {
            if (hashCode != -489091441) {
                if (hashCode == 381277935 && type.equals("bottom_bar_seckill")) {
                    c = 0;
                }
            } else if (type.equals("bottom_bar_hotspot")) {
                c = 1;
            }
        } else if (type.equals("bottom_bar_timing_shelves")) {
            c = 2;
        }
        if (c == 0) {
            return new eaa(activity);
        }
        if (c == 1) {
            return new eaa(activity);
        }
        if (c == 2) {
            return new eaa(activity);
        }
        return new eaa(activity);
    }
}
