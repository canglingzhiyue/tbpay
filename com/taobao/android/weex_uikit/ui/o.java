package com.taobao.android.weex_uikit.ui;

import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class o implements ViewTreeObserver.OnScrollChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MUSView f16143a;
    private boolean b = false;
    private boolean c = true;

    static {
        kge.a(-2064973114);
        kge.a(-1249230565);
    }

    public o(MUSView mUSView) {
        this.f16143a = mUSView;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.c || this.b) {
        } else {
            this.b = true;
            this.f16143a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (this.b && !z) {
            this.f16143a.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.b = false;
        } else if (!z || this.b) {
        } else {
            this.b = true;
            this.f16143a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c || !this.b) {
        } else {
            this.f16143a.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.b = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
        } else if (!this.f16143a.isAttach) {
        } else {
            try {
                this.f16143a.performIncrementalMount();
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.a(e);
            }
        }
    }
}
