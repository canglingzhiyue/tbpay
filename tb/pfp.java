package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.d;
import java.util.Map;

/* loaded from: classes7.dex */
public class pfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1224407290);
    }

    public static pph a(Context context, Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pph) ipChange.ipc$dispatch("963eeb8e", new Object[]{context, handler}) : new pph(context, handler);
    }

    public static Map<String, Integer> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        Map<String, Integer> b = d.a().b();
        kgz.b("FloatWindowTrigger.getAllWindowStatus=%s", b);
        return b;
    }
}
