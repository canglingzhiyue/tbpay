package com.taobao.android.order.bundle.widget;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.List;
import java.util.Map;
import tb.bnn;
import tb.jvs;
import tb.kge;
import tb.mto;
import tb.nkj;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OffsetBodyWrapper f14599a;
    private OrderRecyclerView b;
    private Weex2ContainerFrameLayout c;
    private MUSDKInstance d;
    private boolean e = true;
    private boolean f = true;
    private int g = 0;
    private RecyclerView.OnFlingListener h = new RecyclerView.OnFlingListener() { // from class: com.taobao.android.order.bundle.widget.h.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.RecyclerView.OnFlingListener
        public boolean onFling(int i, int i2) {
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8af30028", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            int computeVerticalScrollRange = h.a(h.this) == null ? 0 : h.a(h.this).computeVerticalScrollRange();
            int computeVerticalScrollOffset = h.a(h.this) == null ? 0 : h.a(h.this).computeVerticalScrollOffset();
            if (i2 > 0 && (i3 = computeVerticalScrollOffset + i2) >= computeVerticalScrollRange) {
                h.a(h.this, i3 - computeVerticalScrollRange);
            }
            return false;
        }
    };
    private View.OnTouchListener i = new View.OnTouchListener() { // from class: com.taobao.android.order.bundle.widget.h.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getPointerCount() <= 1 && h.b(h.this) != null && h.c(h.this) != null) {
                boolean z = motionEvent.getAction() == 0;
                if (z) {
                    h.a(h.this, true);
                }
                if (h.b(h.this).getRenderView() == null || !(h.b(h.this).getRenderView().getParent() instanceof View)) {
                    return true;
                }
                View view2 = (View) h.b(h.this).getRenderView().getParent();
                if (z) {
                    h.a(h.this, false);
                }
                if (h.d(h.this)) {
                    return true;
                }
                view2.onTouchEvent(motionEvent);
            }
            return true;
        }
    };
    private RecyclerView.OnScrollListener j = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.order.bundle.widget.h.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (h.b(h.this) == null || i != 0) {
                return;
            }
            h.b(h.this).updateViewport();
            if (!h.b(h.this, 0)) {
                return;
            }
            h.b(h.this, true);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (h.b(h.this) == null) {
                h.e(h.this);
            }
            boolean b = h.b(h.this, i2);
            if (b) {
                recyclerView.scrollBy(0, i2);
                h.b(h.this, true);
            } else {
                h.b(h.this, false);
            }
            if (i2 <= 0 || !b || h.f(h.this) <= 0 || h.b(h.this) == null) {
                return;
            }
            h.b(h.this).scrollToDecelerate((int) (h.f(h.this) * 0.5f));
            h.a(h.this, 0);
        }
    };
    private jvs k = new jvs() { // from class: com.taobao.android.order.bundle.widget.h.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jvs
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null) {
            } else {
                try {
                    if (map.isEmpty()) {
                        return;
                    }
                    double doubleValue = ((Double) map.get("pixels")).doubleValue();
                    double doubleValue2 = ((Double) map.get("velocity")).doubleValue();
                    if (!TextUtils.equals((String) map.get("axis"), "vertical")) {
                        return;
                    }
                    if (doubleValue > mto.a.GEO_NOT_SUPPORT) {
                        h.b(h.this, false);
                    }
                    if (doubleValue2 <= 10.0d || h.a(h.this) == null) {
                        return;
                    }
                    h.a(h.this).fling(0, ((int) doubleValue2) * (-2));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    };

    /* renamed from: com.taobao.android.order.bundle.widget.h$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14604a = new int[Lifecycle.Event.values().length];

        static {
            try {
                f14604a[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14604a[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14604a[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14604a[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1274678582);
    }

    public static /* synthetic */ int a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7d23715", new Object[]{hVar, new Integer(i)})).intValue();
        }
        hVar.g = i;
        return i;
    }

    public static /* synthetic */ OrderRecyclerView a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderRecyclerView) ipChange.ipc$dispatch("54c21c20", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7d276f7", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.f = z;
        return z;
    }

    public static /* synthetic */ MUSDKInstance b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSDKInstance) ipChange.ipc$dispatch("d41743e8", new Object[]{hVar}) : hVar.d;
    }

    public static /* synthetic */ void b(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119d18d2", new Object[]{hVar, new Boolean(z)});
        } else {
            hVar.b(z);
        }
    }

    public static /* synthetic */ boolean b(h hVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("119cd905", new Object[]{hVar, new Integer(i)})).booleanValue() : hVar.a(i);
    }

    public static /* synthetic */ Weex2ContainerFrameLayout c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Weex2ContainerFrameLayout) ipChange.ipc$dispatch("9e49149b", new Object[]{hVar}) : hVar.c;
    }

    public static /* synthetic */ boolean d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25542ec8", new Object[]{hVar})).booleanValue() : hVar.f;
    }

    public static /* synthetic */ void e(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ace5505", new Object[]{hVar});
        } else {
            hVar.b();
        }
    }

    public static /* synthetic */ int f(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10487b39", new Object[]{hVar})).intValue() : hVar.g;
    }

    public h(OffsetBodyWrapper offsetBodyWrapper, OrderRecyclerView orderRecyclerView) {
        this.f14599a = offsetBodyWrapper;
        this.b = orderRecyclerView;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.registerOnFlingListener(this.h);
        this.b.registerOnTouchListener(this.i);
        this.b.addOnScrollListener(this.j);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Weex2ContainerFrameLayout weex2ContainerFrameLayout = this.c;
        return weex2ContainerFrameLayout != null && weex2ContainerFrameLayout.getTop() - i <= 0;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        OrderRecyclerView orderRecyclerView = this.b;
        if (orderRecyclerView == null || !(orderRecyclerView.getLayoutManager() instanceof com.taobao.android.order.bundle.widget.recycle.e) || this.d == null) {
            return;
        }
        if ((!this.b.getLayoutManager().canScrollVertically()) == z && !this.e) {
            return;
        }
        this.e = false;
        OffsetBodyWrapper offsetBodyWrapper = this.f14599a;
        if (offsetBodyWrapper != null) {
            offsetBodyWrapper.setInWeexContainer(z);
        }
        if (z) {
            this.d.setScrollEnabled(true);
            ((com.taobao.android.order.bundle.widget.recycle.e) this.b.getLayoutManager()).a(false);
            return;
        }
        this.d.setScrollEnabled(false);
        ((com.taobao.android.order.bundle.widget.recycle.e) this.b.getLayoutManager()).a(true);
    }

    private void b() {
        List<IDMComponent> a2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        OrderRecyclerView orderRecyclerView = this.b;
        if (orderRecyclerView == null || !(orderRecyclerView.getAdapter() instanceof nkj) || !(((nkj) this.b.getAdapter()).c() instanceof bnn) || (a2 = ((bnn) ((nkj) this.b.getAdapter()).c()).a()) == null || a2.isEmpty()) {
            return;
        }
        for (int size = a2.size() - 1; size >= 0; size--) {
            IDMComponent iDMComponent = a2.get(size);
            if (iDMComponent != null && iDMComponent.getContainerType().equals("weex2") && iDMComponent.getFields() != null && iDMComponent.getFields().getString("enableNestedScroll") != null && "true".equalsIgnoreCase(iDMComponent.getFields().getString("enableNestedScroll")) && (findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(size)) != null && (findViewHolderForAdapterPosition.itemView instanceof Weex2ContainerFrameLayout)) {
                this.c = (Weex2ContainerFrameLayout) findViewHolderForAdapterPosition.itemView;
                this.b.addWeexContainer(this.c);
                this.d = this.c.getMUSInstance();
                MUSDKInstance mUSDKInstance = this.d;
                if (mUSDKInstance != null) {
                    mUSDKInstance.setWeexScrollListener(this.k);
                }
            }
        }
    }

    public void a(Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b889b5", new Object[]{this, event});
        } else if (this.d == null) {
        } else {
            int i = AnonymousClass5.f14604a[event.ordinal()];
            if (i == 1) {
                this.d.onActivityStart();
            } else if (i == 2) {
                this.d.onActivityResume();
            } else if (i == 3) {
                this.d.onActivityPause();
            } else if (i != 4) {
            } else {
                this.d.onActivityStop();
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f14599a = null;
        OrderRecyclerView orderRecyclerView = this.b;
        if (orderRecyclerView != null) {
            orderRecyclerView.unregisterOnFlingListener();
            this.h = null;
            this.b.unregisterOnTouchListener();
            this.i = null;
            this.b.removeOnScrollListener(this.j);
            this.j = null;
            this.b.removeWeexContainer();
            this.b = null;
        }
        this.c = null;
        this.k = null;
        MUSDKInstance mUSDKInstance = this.d;
        if (mUSDKInstance != null && z) {
            mUSDKInstance.destroy();
        }
        this.d = null;
    }
}
