package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public final class ebu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-983223168);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.helper.UIUtil");
    }

    public static int a(Context context, double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f87d1", new Object[]{context, new Double(d)})).intValue() : (int) ((d * context.getResources().getDisplayMetrics().density) + 0.5d);
    }
}
