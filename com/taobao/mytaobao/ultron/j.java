package com.taobao.mytaobao.ultron;

import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.ui.component.WXBasicComponentType;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001a\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J(\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0018\u00010\u0018R\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/mytaobao/ultron/MTBLayoutManagerV2;", "Landroid/support/v7/widget/LinearLayoutManager;", "Lcom/taobao/mytaobao/ultron/IMtbLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "mCanScrollVertically", "mSkipNextScroll", "addView", "", "child", "Landroid/view/View;", "index", "canScrollVertically", "considerTraceExp", "removeView", "removeViewAt", "scrollVerticallyBy", "dy", WXBasicComponentType.RECYCLER, "Landroid/support/v7/widget/RecyclerView$Recycler;", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "setCanScrollVertically", "enable", "setSkipNextScroll", "skipNextScroll", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class j extends LinearLayoutManager implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18525a;
    private boolean b;

    static {
        kge.a(90713469);
        kge.a(-239635176);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -602204034:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 514551467:
                return new Boolean(super.canScrollVertically());
            case 1273305472:
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i, boolean z) {
        super(context, i, z);
        q.c(context, "context");
        this.b = true;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        if (this.f18525a) {
            this.f18525a = false;
            return 0;
        }
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // com.taobao.mytaobao.ultron.i
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f18525a = z;
        }
    }

    @Override // com.taobao.mytaobao.ultron.i
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return super.canScrollVertically();
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        a(view, i);
        try {
            super.addView(view, i);
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 addView: " + th);
            throw th;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (!com.taobao.mytaobao.base.c.u()) {
            super.removeView(view);
        } else {
            if (!q.a(Looper.getMainLooper(), Looper.myLooper())) {
                StringBuilder sb = new StringBuilder();
                sb.append("MTBLayoutManagerV2 error: 子线程removeView, view=");
                sb.append(view != null ? view.toString() : null);
                sb.append(", thread=");
                Thread currentThread = Thread.currentThread();
                q.a((Object) currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                TLog.loge("mtbMainLink", sb.toString());
            }
            try {
                super.removeView(view);
            } catch (Throwable th) {
                TLog.loge("mtbMainLink", "MTBLayoutManagerV2 removeView: child=" + view + " exp=" + th);
                throw th;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
        } else if (!com.taobao.mytaobao.base.c.u()) {
            super.removeViewAt(i);
        } else {
            if (!q.a(Looper.getMainLooper(), Looper.myLooper())) {
                StringBuilder sb = new StringBuilder();
                sb.append("MTBLayoutManagerV2 error: 子线程removeViewAt, index=");
                sb.append(i);
                sb.append(", thread=");
                Thread currentThread = Thread.currentThread();
                q.a((Object) currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                TLog.loge("mtbMainLink", sb.toString());
            }
            try {
                super.removeViewAt(i);
            } catch (Throwable th) {
                TLog.loge("mtbMainLink", "MTBLayoutManagerV2 removeViewAt: index=" + i + ' ' + th);
                throw th;
            }
        }
    }

    private final void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        try {
            if (!com.taobao.mytaobao.base.c.u()) {
                return;
            }
            String str = null;
            if (!q.a(Looper.getMainLooper(), Looper.myLooper())) {
                StringBuilder sb = new StringBuilder();
                sb.append("MTBLayoutManagerV2 error: 子线程addView, view=");
                sb.append(view != null ? view.toString() : null);
                sb.append(", thread=");
                Thread currentThread = Thread.currentThread();
                q.a((Object) currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                TLog.loge("mtbMainLink", sb.toString());
            }
            ViewParent parent = view != null ? view.getParent() : null;
            if (!(parent instanceof RecyclerView)) {
                parent = null;
            }
            RecyclerView recyclerView = (RecyclerView) parent;
            if (recyclerView == null || recyclerView.indexOfChild(view) != -1) {
                return;
            }
            recyclerView.removeView(view);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MTBLayoutManagerV2 异常addView， child=");
            if (view != null) {
                str = view.toString();
            }
            sb2.append(str);
            sb2.append(", index=");
            sb2.append(i);
            sb2.append(", thread=");
            Thread currentThread2 = Thread.currentThread();
            q.a((Object) currentThread2, "Thread.currentThread()");
            sb2.append(currentThread2.getName());
            TLog.loge("mtbMainLink", sb2.toString());
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "MTBLayoutManagerV2 considerTraceExp: " + th);
        }
    }
}
