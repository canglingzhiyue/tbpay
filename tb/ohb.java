package tb;

import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final View f32051a;
    private ViewTreeObserver b;
    private final Runnable c;

    static {
        kge.a(-675501153);
        kge.a(-1854242693);
        kge.a(-1859085092);
    }

    private ohb(View view, Runnable runnable) {
        this.f32051a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static ohb a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ohb) ipChange.ipc$dispatch("2bab9415", new Object[]{view, runnable});
        }
        ohb ohbVar = new ohb(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(ohbVar);
        view.addOnAttachStateChangeListener(ohbVar);
        return ohbVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
        }
        a();
        this.c.run();
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.f32051a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f32051a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        } else {
            this.b = view.getViewTreeObserver();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
        } else {
            a();
        }
    }
}
