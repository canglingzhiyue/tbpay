package com.taobao.android.mediapick.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.g;
import tb.hso;
import tb.kge;

/* loaded from: classes6.dex */
public class MRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g mPickClient;

    static {
        kge.a(746906947);
    }

    public static /* synthetic */ Object ipc$super(MRecyclerView mRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1696676907:
                super.scrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public MRecyclerView(Context context, g gVar) {
        super(context);
        this.mPickClient = gVar;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            hso f = this.mPickClient.f();
            f.b(g.TAG, "MRecyclerView.draw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            hso f = this.mPickClient.f();
            f.b(g.TAG, "MRecyclerView.onDraw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            hso f = this.mPickClient.f();
            f.b(g.TAG, "MRecyclerView.dispatchDraw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void scrollBy(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65213c2b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.scrollBy(i, i2);
        } catch (Throwable th) {
            th.printStackTrace();
            hso f = this.mPickClient.f();
            f.b(g.TAG, "MRecyclerView.scrollBy exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public g f14244a;
        public boolean b;

        static {
            kge.a(980330802);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -574012007) {
                if (hashCode == 514551467) {
                    return new Boolean(super.canScrollVertically());
                }
                if (hashCode != 1626618577) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            }
            return new Boolean(super.canScrollHorizontally());
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public b(Context context, int i, boolean z, g gVar) {
            super(context, i, z);
            this.b = true;
            this.f14244a = gVar;
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                return;
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                hso f = this.f14244a.f();
                f.b(g.TAG, "MLinearLayoutManager.onLayoutChildren exception. e:" + Log.getStackTraceString(e));
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue() : this.b && super.canScrollHorizontally();
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.b && super.canScrollVertically();
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends GridLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public g f14243a;
        public boolean b;

        static {
            kge.a(-1541773391);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -574012007) {
                if (hashCode == 514551467) {
                    return new Boolean(super.canScrollVertically());
                }
                if (hashCode != 1626618577) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            }
            return new Boolean(super.canScrollHorizontally());
        }

        @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public a(Context context, int i, g gVar) {
            super(context, i);
            this.b = true;
            this.f14243a = gVar;
        }

        @Override // android.support.v7.widget.GridLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                return;
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                hso f = this.f14243a.f();
                f.b(g.TAG, "MGridLayoutManager.onLayoutChildren exception. e:" + Log.getStackTraceString(e));
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue() : this.b && super.canScrollHorizontally();
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : this.b && super.canScrollVertically();
        }
    }
}
