package tb;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.jsbridge.WidgetOpenJsBridge;
import com.taobao.desktop.widget.jsbridge.WidgetServerJsBridge;
import com.taobao.desktop.widget.jsbridge.WidgetServiceJsBridge;
import com.taobao.desktop.widget.manager.d;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import java.util.HashMap;

/* loaded from: classes.dex */
public class kib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile kib f30091a;
    private Application b;

    static {
        kge.a(-1613724042);
    }

    public static /* synthetic */ Application a(kib kibVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("437c7163", new Object[]{kibVar}) : kibVar.b;
    }

    public static kib a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kib) ipChange.ipc$dispatch("f06deda", new Object[0]);
        }
        if (f30091a == null) {
            synchronized (kib.class) {
                if (f30091a == null) {
                    f30091a = new kib();
                }
            }
        }
        return f30091a;
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.b;
    }

    public static void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            khm.a().a(application, hashMap);
            khb.a().a(application, hashMap);
            kie.a().execute(new Runnable() { // from class: tb.kib.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.a(application).b((String) null);
                    }
                }
            });
            Object obj = hashMap.get("launchStartTime");
            if (obj != null) {
                a.a().a(MonitorType.WIDGET_RENDER_STATE, new a.C0652a().e("widget_render_init").a(System.currentTimeMillis() - ((Long) obj).longValue()));
            }
            tez.a();
        } catch (Exception e) {
            kif.a("DesktopWidgetInit error: " + e.getMessage());
        }
    }

    public void b(Application application, final HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
            return;
        }
        try {
            this.b = application;
            khm.a().a(application);
            khb.a().a(application);
            c();
            d.a(this.b);
            a(this.b);
            q.a(WidgetOpenJsBridge.CLASSNAME_WIDGET_OPEN, (Class<? extends e>) WidgetOpenJsBridge.class);
            q.a(WidgetServiceJsBridge.CLASSNAME_WIDGET_SERVICE, (Class<? extends e>) WidgetServiceJsBridge.class);
            q.a(WidgetServerJsBridge.CLASSNAME_WIDGET_CLIENT_PASS, (Class<? extends e>) WidgetServerJsBridge.class);
            khr.a(this.b).a();
            kie.a().execute(new Runnable() { // from class: tb.kib.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        new khq().a(kib.a(kib.this).getApplicationContext(), hashMap);
                    }
                }
            });
        } catch (Throwable th) {
            kif.a("DesktopWidgetInit init error: " + th.getMessage());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            int initialize = SecurityGuardManager.getInitializer().initialize(this.b);
            kif.a("SecurityGuardManager_initResult: " + initialize);
        } catch (SecException e) {
            kif.a("SecurityGuardManager_init_error code is: " + e.getErrorCode());
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            if (kid.b(context)) {
                return;
            }
            kii.a(context, WidgetTaoGoldReceiver.class.getName());
            kii.a(context, WidgetStandardMiuiReceiver.class.getName());
            kii.a(context, WidgetCombineMiuiReceiver.class.getName());
        } catch (Throwable th) {
            kif.a("setMiuiWidgetEnable: " + th.getMessage());
        }
    }
}
