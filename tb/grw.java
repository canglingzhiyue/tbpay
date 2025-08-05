package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes5.dex */
public final class grw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f28422a;

    public grw(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f28422a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
        }
    }

    public void a() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(i.b.MEASURE_ONCREATE, new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void b() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void c() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void d() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void e() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(MessageID.onStop, new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void f() {
        Object obj = this.f28422a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(MessageID.onDestroy, new Class[0]).invoke(this.f28422a, new Object[0]);
        } catch (Exception unused) {
        }
    }
}
