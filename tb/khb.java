package tb;

import android.app.Application;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.api.WVCalendarPlugin;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.jsbridge.WVFloatWindowPlugin;
import com.taobao.pexode.d;
import com.taobao.pexode.decoder.a;
import com.taobao.pexode.decoder.f;
import java.util.HashMap;

/* loaded from: classes.dex */
public class khb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile khb f30067a;
    private Application b;
    private boolean c = false;

    static {
        kge.a(475413988);
    }

    public static khb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khb) ipChange.ipc$dispatch("f06db19", new Object[0]);
        }
        if (f30067a == null) {
            synchronized (khb.class) {
                if (f30067a == null) {
                    f30067a = new khb();
                }
            }
        }
        return f30067a;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.b;
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        Object obj = hashMap.get("isDebuggable");
        if (obj instanceof Boolean) {
            this.c = ((Boolean) obj).booleanValue();
        }
        kgz.a(this.c);
        try {
            d.a(new f());
            d.a(new a());
            d.a(application);
        } catch (Throwable th) {
            kgz.a("DesktopChannelInit.init.error", th);
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.b = application;
        q.a(WVCalendarPlugin.WV_CALENDAR_PLUGIN, (Class<? extends e>) WVCalendarPlugin.class);
        q.a(WVFloatWindowPlugin.WV_PLUGIN, (Class<? extends e>) WVFloatWindowPlugin.class);
    }
}
