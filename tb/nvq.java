package tb;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.prefork.a;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.c;
import java.lang.reflect.Field;

/* loaded from: classes8.dex */
public class nvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f31790a = new a(Globals.getApplication());

    static {
        kge.a(76100300);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (!e()) {
            e.e("PreRenderNativeView", "preRenderRootView 线程切换失败");
            return null;
        }
        FrameLayout a2 = new nvo().a(this.f31790a);
        c.a().a(a2);
        return a2;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        if (!e()) {
            e.e("PreRenderNativeView", "preRenderRocketView 线程切换失败");
            return null;
        }
        return new nvp().a(this.f31790a);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!e()) {
            e.e("PreRenderNativeView", "preRenderTheme 线程切换失败");
        } else {
            ovr.d().a(oqc.a().m());
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.f31790a.b(context);
        }
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this}) : this.f31790a.a();
    }

    private boolean e() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            return true;
        } catch (Throwable th) {
            e.a("PreRenderNativeView", "changeThreadToMainLooper", th);
            return false;
        }
    }
}
