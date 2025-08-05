package com.alibaba.android.ultron.ext.vlayout.extend;

import android.support.v4.util.ArrayMap;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ViewLifeCycleHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayMap<View, STATUS> f2646a;
    private VirtualLayoutManager b;
    private int c;

    /* loaded from: classes2.dex */
    public enum STATUS {
        APPEARING,
        APPEARED,
        DISAPPEARING,
        DISAPPEARED
    }

    static {
        kge.a(-618663179);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (this.c == 0) {
                this.c = childAt.getContext().getResources().getDisplayMetrics().heightPixels;
            }
            if (this.b.i() == 1) {
                if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && f(childAt)) {
                    g(childAt);
                } else if (childAt.getTop() <= this.c && childAt.getBottom() >= this.c && b(childAt)) {
                    c(childAt);
                }
            } else if (childAt.getTop() <= 0 && childAt.getBottom() >= 0 && b(childAt)) {
                c(childAt);
            } else if (childAt.getTop() <= this.c && childAt.getBottom() >= this.c && f(childAt)) {
                g(childAt);
            }
            if (childAt.getTop() >= 0 && childAt.getBottom() <= this.c) {
                if (b(childAt)) {
                    c(childAt);
                } else if (d(childAt)) {
                    e(childAt);
                }
            } else if (childAt.getBottom() <= 0 || childAt.getTop() >= this.c) {
                if (f(childAt)) {
                    g(childAt);
                } else if (h(childAt)) {
                    i(childAt);
                }
            }
        }
    }

    private STATUS a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (STATUS) ipChange.ipc$dispatch("5351207a", new Object[]{this, view});
        }
        if (!this.f2646a.containsKey(view)) {
            this.f2646a.put(view, STATUS.DISAPPEARED);
            return STATUS.DISAPPEARED;
        }
        return this.f2646a.get(view);
    }

    private void a(View view, STATUS status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b05cb8", new Object[]{this, view, status});
        } else {
            this.f2646a.put(view, status);
        }
    }

    private boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : a(view) == STATUS.DISAPPEARED;
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (a(view) == STATUS.APPEARING) {
        } else {
            a(view, STATUS.APPEARING);
        }
    }

    private boolean d(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8906900b", new Object[]{this, view})).booleanValue() : a(view) == STATUS.APPEARING;
    }

    private void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else if (a(view) == STATUS.APPEARED) {
        } else {
            a(view, STATUS.APPEARED);
        }
    }

    private boolean f(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8109adc9", new Object[]{this, view})).booleanValue() : a(view) == STATUS.APPEARED;
    }

    private void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0b3ca4", new Object[]{this, view});
        } else if (a(view) == STATUS.DISAPPEARING) {
        } else {
            a(view, STATUS.DISAPPEARING);
        }
    }

    private boolean h(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("790ccb87", new Object[]{this, view})).booleanValue() : a(view) == STATUS.DISAPPEARING;
    }

    private void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750e5a62", new Object[]{this, view});
        } else if (a(view) == STATUS.DISAPPEARED) {
        } else {
            a(view, STATUS.DISAPPEARED);
        }
    }
}
