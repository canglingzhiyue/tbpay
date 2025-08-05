package com.taobao.family.globalbubble;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public abstract class b implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f17135a;
    private boolean b = false;

    public abstract void a(int i);

    public abstract void b(int i);

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        Rect rect = new Rect();
        try {
            this.f17135a.get().getWindowVisibleDisplayFrame(rect);
            int height = this.f17135a.get().getRootView().getHeight() - (rect.bottom - rect.top);
            if (height + (-400) > 0) {
                if (b()) {
                    return;
                }
                a(true);
                a(height);
            } else if (!b()) {
            } else {
                a(false);
                b(height);
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            this.f17135a = new WeakReference<>(activity.getWindow().getDecorView());
            if (this.f17135a.get() == null) {
                return;
            }
            this.f17135a.get().getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f17135a != null && this.f17135a.get() != null) {
            this.f17135a.get().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            this.f17135a = null;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
