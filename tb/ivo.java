package tb;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class ivo implements PartnerRecyclerView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f29337a;
    private final RecyclerView b;
    private int c;
    private int d;
    private int f;
    private final b h;
    private final float e = 1.5f;
    private boolean g = false;

    /* loaded from: classes6.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private static Field f29340a;
        private static Field b;

        static {
            kge.a(-1221766568);
        }

        public a(Context context, int i, RecyclerView recyclerView) {
            super(context, i);
            try {
                if (f29340a == null) {
                    f29340a = RecyclerView.SmoothScroller.class.getDeclaredField("mRecyclerView");
                    b = RecyclerView.SmoothScroller.class.getDeclaredField("mLayoutManager");
                    f29340a.setAccessible(true);
                    b.setAccessible(true);
                }
                f29340a.set(this, recyclerView);
                b.set(this, recyclerView.getLayoutManager());
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(boolean z);
    }

    static {
        kge.a(1412568699);
        kge.a(1834057933);
    }

    public static /* synthetic */ int a(ivo ivoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e00eb700", new Object[]{ivoVar, new Integer(i)})).intValue();
        }
        ivoVar.f = i;
        return i;
    }

    public static /* synthetic */ void a(ivo ivoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7412b6", new Object[]{ivoVar});
        } else {
            ivoVar.b();
        }
    }

    public static /* synthetic */ boolean b(ivo ivoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcf7193b", new Object[]{ivoVar})).booleanValue() : ivoVar.g;
    }

    public ivo(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        this.b = recyclerView;
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.ivo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else {
                    ivo.a(ivo.this);
                }
            }
        });
        b();
        ((PartnerRecyclerView) recyclerView).setLayoutCompleteListener(this);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.ivo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (!ivo.b(ivo.this)) {
                    return;
                }
                ivo.a(ivo.this, i2);
            }
        });
        if (adapter instanceof b) {
            this.h = (b) adapter;
        } else {
            this.h = null;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = this.b.getMeasuredHeight();
        this.c = (int) (this.d * 1.5f);
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.f29337a;
        if (cVar == null) {
            return;
        }
        b(c.a(cVar), c.b(this.f29337a), c.c(this.f29337a));
        this.f29337a = null;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = 0;
        this.g = true;
        if (i != 0) {
            this.b.scrollBy(0, i);
        }
        this.g = false;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = this.c;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b.getLayoutManager();
        if (staggeredGridLayoutManager == null) {
            return;
        }
        View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i);
        if (findViewByPosition != null) {
            b(i, i2, i3);
            return;
        }
        a(true);
        PointF computeScrollVectorForPosition = staggeredGridLayoutManager.computeScrollVectorForPosition(i);
        int ceil = (int) Math.ceil((i4 * 1.0f) / this.b.getMeasuredHeight());
        boolean z = computeScrollVectorForPosition == null || computeScrollVectorForPosition.y < 0.0f;
        int measuredHeight = z ? -this.b.getMeasuredHeight() : this.b.getMeasuredHeight();
        View view = findViewByPosition;
        int i5 = 0;
        for (int i6 = 0; i6 < ceil; i6++) {
            a(measuredHeight);
            i5 += this.f;
            view = staggeredGridLayoutManager.findViewByPosition(i);
            if (view != null) {
                break;
            }
        }
        int i7 = i4 + 1;
        if (view != null) {
            a aVar = new a(this.b.getContext(), i2, this.b);
            int calculateDyToMakeVisible = aVar.calculateDyToMakeVisible(view, aVar.getVerticalSnapPreference());
            if (!z || i2 > 0) {
                a(-calculateDyToMakeVisible);
                int i8 = this.f;
                a(-i8);
                calculateDyToMakeVisible = -i8;
            }
            i7 = calculateDyToMakeVisible - i5;
        }
        a(-i5);
        a(false);
        a(staggeredGridLayoutManager, Math.abs(i7) > i4, z, i, i2, i4, i3);
    }

    private void a(StaggeredGridLayoutManager staggeredGridLayoutManager, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158f6329", new Object[]{this, staggeredGridLayoutManager, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (z) {
            this.f29337a = new c(i, i2, i4);
            if (z2) {
                i3 = -i3;
            }
            staggeredGridLayoutManager.scrollToPositionWithOffset(i, i3 + i2);
        } else {
            b(i, i2, i4);
        }
    }

    private void b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfaa61a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        d dVar = new d(this.b.getContext(), i2 - i3);
        dVar.setTargetPosition(i);
        if (this.b.getLayoutManager() == null) {
            return;
        }
        this.b.startNestedScroll(2, 1);
        this.b.getLayoutManager().startSmoothScroll(dVar);
    }

    /* loaded from: classes6.dex */
    public static class d extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f29342a;

        static {
            kge.a(29669749);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -1154160711) {
                return new Integer(super.calculateDyToMakeVisible((View) objArr[0], ((Number) objArr[1]).intValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
            }
            return -1;
        }

        public d(Context context, int i) {
            super(context);
            this.f29342a = i;
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i)})).intValue() : super.calculateDyToMakeVisible(view, i) + this.f29342a;
        }
    }

    /* loaded from: classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f29341a;
        private final int b;
        private final int c;

        static {
            kge.a(141972516);
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20901e0a", new Object[]{cVar})).intValue() : cVar.f29341a;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a6b884b", new Object[]{cVar})).intValue() : cVar.b;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d446f28c", new Object[]{cVar})).intValue() : cVar.c;
        }

        public c(int i, int i2, int i3) {
            this.f29341a = i;
            this.b = i2;
            this.c = i3;
        }
    }
}
