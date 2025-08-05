package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.List;

/* loaded from: classes4.dex */
public class ead {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-921279047);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.desc.common.DescEventUtils");
    }

    public static void a(Context context, List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            return;
        }
        for (Event event : list) {
            if (event.getEventId() == eno.a(eny.class)) {
                f.a(context, event);
            }
        }
    }
}
