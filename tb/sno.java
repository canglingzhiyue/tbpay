package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.RoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.snd;
import tb.snk;
import tb.snr;

/* loaded from: classes5.dex */
public abstract class sno extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements snl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NO_TYPE = -1;
    public static final int TYPE_CACHE_VIDEO = -3;
    public static final int TYPE_LOADING = -2;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33742a;
    private List<com.taobao.android.fluid.framework.data.datamodel.a> f;
    private int g;
    private snp h;
    private RecyclerView j;
    private Handler l;
    private boolean n;
    private Message o;
    private int p;
    private hjk s;
    private krk t;
    private sor u;
    private final snk.a b = new snk.a();
    private final snr.a c = new snr.a();
    private final Set<snp> d = new HashSet();
    private final a e = new a();
    private final RecyclerView.OnScrollListener i = new RecyclerView.OnScrollListener() { // from class: tb.sno.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            spz.c("MultiRecyclerViewAdapter", "onScrollStateChanged/" + i);
            sno.a(sno.this, recyclerView, i);
        }
    };
    private int k = -1;
    private int m = -1;
    private boolean q = false;
    private int r = -1;

    static {
        kge.a(-1385290269);
        kge.a(-1199412766);
    }

    public static /* synthetic */ Object ipc$super(sno snoVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1324657775:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case -1079446313:
                super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
                return null;
            case -1066359532:
                super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
                return null;
            case -955520525:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1216347414:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1639821723:
                super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue(), (List) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(sno snoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3664292", new Object[]{snoVar, new Integer(i)})).intValue();
        }
        snoVar.p = i;
        return i;
    }

    public static /* synthetic */ Set a(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("f79e49d3", new Object[]{snoVar}) : snoVar.d;
    }

    public static /* synthetic */ void a(sno snoVar, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd71b31", new Object[]{snoVar, recyclerView, new Integer(i)});
        } else {
            snoVar.a(recyclerView, i);
        }
    }

    public static /* synthetic */ boolean a(sno snoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3668274", new Object[]{snoVar, new Boolean(z)})).booleanValue();
        }
        snoVar.q = z;
        return z;
    }

    public static /* synthetic */ int b(sno snoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5440c31", new Object[]{snoVar, new Integer(i)})).intValue();
        }
        snoVar.k = i;
        return i;
    }

    public static /* synthetic */ snp b(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snp) ipChange.ipc$dispatch("e50ac8ac", new Object[]{snoVar}) : snoVar.h;
    }

    public static /* synthetic */ boolean b(sno snoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5444c13", new Object[]{snoVar, new Boolean(z)})).booleanValue();
        }
        snoVar.n = z;
        return z;
    }

    public static /* synthetic */ int c(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dc19d9d9", new Object[]{snoVar})).intValue() : snoVar.r;
    }

    public static /* synthetic */ int c(sno snoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a721d5d0", new Object[]{snoVar, new Integer(i)})).intValue();
        }
        snoVar.m = i;
        return i;
    }

    public static /* synthetic */ int d(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca9ce05a", new Object[]{snoVar})).intValue() : snoVar.p;
    }

    public static /* synthetic */ void e(sno snoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91fe6e8", new Object[]{snoVar});
        } else {
            snoVar.h();
        }
    }

    public static /* synthetic */ boolean f(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7a2ed6d", new Object[]{snoVar})).booleanValue() : snoVar.q;
    }

    public static /* synthetic */ RecyclerView g(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7e8a919a", new Object[]{snoVar}) : snoVar.j;
    }

    public static /* synthetic */ int h(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84a8fa5e", new Object[]{snoVar})).intValue() : snoVar.f();
    }

    public static /* synthetic */ int i(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("732c00df", new Object[]{snoVar})).intValue() : snoVar.k;
    }

    public static /* synthetic */ Handler j(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("9b898e39", new Object[]{snoVar}) : snoVar.l;
    }

    public static /* synthetic */ int k(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50320de1", new Object[]{snoVar})).intValue() : snoVar.m;
    }

    public static /* synthetic */ boolean l(sno snoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eb51473", new Object[]{snoVar})).booleanValue() : snoVar.n;
    }

    public sno(FluidContext fluidContext) {
        this.f33742a = fluidContext;
        if (!snf.b()) {
            ((ILifecycleService) this.f33742a.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: tb.sno.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snd.a, tb.snd
                public void onResume() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                        return;
                    }
                    for (snp snpVar : sno.a(sno.this)) {
                        snpVar.f33749a.b();
                    }
                    if (sno.b(sno.this) == null) {
                        return;
                    }
                    sno.b(sno.this).f33749a.a();
                }
            });
        }
    }

    private void a(final RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 0) {
            if (son.u()) {
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: tb.sno.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                        } else {
                            sno.this.a(recyclerView);
                        }
                    }
                });
            } else {
                a(recyclerView);
            }
        } else if (i != 1 && i != 2) {
        } else {
            if (this.q && !son.x()) {
                return;
            }
            ihi.c();
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        int b = b(recyclerView);
        if (b == -1) {
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(b);
        if (!(findViewHolderForAdapterPosition instanceof snp)) {
            return;
        }
        if (!snf.b() && ((ILifecycleService) this.f33742a.getService(ILifecycleService.class)).getPageState() != 2) {
            this.h = (snp) findViewHolderForAdapterPosition;
        } else {
            ((snp) findViewHolderForAdapterPosition).f33749a.a();
        }
    }

    public int b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        return -1;
    }

    public List<com.taobao.android.fluid.framework.data.datamodel.a> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f;
    }

    public krk i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (krk) ipChange.ipc$dispatch("4c942cb2", new Object[]{this}) : this.t;
    }

    public sor k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("5bfb0ffe", new Object[]{this}) : this.u;
    }

    public void a(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff234182", new Object[]{this, sorVar});
        } else if (sorVar != null && sorVar.f33778a != null) {
            spz.c("MultiRecyclerViewAdapter", "setPreloadVideoData");
            this.u = sorVar;
            notifyDataSetChanged();
        } else {
            spz.c("MultiRecyclerViewAdapter", "clear PreloadVideoData");
            this.u = null;
            this.s = null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        spz.c("MultiRecyclerViewAdapter", "onCreateViewHolder viewType=" + i);
        if (i == -3) {
            ogh.a("onCreateViewHolderCachevideo");
            hjk hjkVar = new hjk(this.f33742a, new RoundCornerLayout(viewGroup.getContext()));
            this.s = hjkVar;
            this.s.a(this.u);
            ogh.b();
            return hjkVar;
        } else if (i == -2) {
            ogh.a("onCreateViewHolderLoadingview");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            krk krkVar = new krk(this.f33742a, frameLayout);
            this.t = krkVar;
            ogh.b();
            return krkVar;
        } else {
            ogh.a("onCreateViewHolder");
            psw a2 = a(i);
            snp snpVar = new snp(a2.b(viewGroup), a2, this, this.b, this.c);
            a2.onCreateView(a2, snpVar);
            ogh.b();
            return snpVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (b(i) || !(viewHolder instanceof snp)) {
        } else {
            snp snpVar = (snp) viewHolder;
            this.e.a(i, snpVar);
            spz.a("onBindViewHolder.bindData", "preload:" + i);
            snpVar.f33749a.a(this.f.get(i), i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bdb19b", new Object[]{this, viewHolder, new Integer(i), list});
        } else if (b(i) || !(viewHolder instanceof snp)) {
        } else {
            snp snpVar = (snp) viewHolder;
            this.e.a(i, snpVar);
            spz.a("onBindViewHolder.bindData", "preload:" + i);
            if (list.isEmpty()) {
                super.onBindViewHolder(snpVar, i, list);
                return;
            }
            snpVar.b.onBindData(snpVar.b, this.f.get(i), i, list);
            if (!((IQuickOpenService) this.f33742a.getService(IQuickOpenService.class)).isInQuickOpenMode() || !snpVar.f33749a.f33728a) {
                return;
            }
            snpVar.f33749a.f33728a = false;
            snpVar.f33749a.b();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0 && this.u != null) {
            return -3;
        }
        if (snf.d(this.f33742a) && d(i)) {
            return -2;
        }
        if (b(i)) {
            return -1;
        }
        this.g = i;
        return a(this.f.get(i), i);
    }

    private boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.u != null && i == 1) {
            return true;
        }
        return !ogv.a(this.f) && i == this.f.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (ogv.a(this.f)) {
            if (this.u == null) {
                return 0;
            }
            return (snf.d(this.f33742a) ? 1 : 0) + 1;
        }
        return this.f.size() + (snf.d(this.f33742a) ? 1 : 0);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        if (!snf.b()) {
            this.d.remove(viewHolder);
            if (this.h == viewHolder) {
                this.h = null;
            }
        }
        if (!(viewHolder instanceof snp)) {
            return;
        }
        ((snp) viewHolder).f33749a.g();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof krk) {
            int adapterPosition = viewHolder.getAdapterPosition();
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.j.findViewHolderForAdapterPosition(adapterPosition - 1);
            if (findViewHolderForAdapterPosition instanceof snp) {
                psw c2 = ((snp) findViewHolderForAdapterPosition).c();
                ((krk) viewHolder).a(c2);
                if (!sjt.c(this.f33742a)) {
                    c2.A().c().a(0.3f);
                    spz.c("MultiRecyclerViewAdapter", "footer attach to window, set last card(" + c2.w() + ") opacity 0.3 at position:" + adapterPosition);
                }
            }
            ((krk) viewHolder).b();
        } else if (!(viewHolder instanceof snp)) {
        } else {
            snp snpVar = (snp) viewHolder;
            if (!snf.b() && ((ILifecycleService) this.f33742a.getService(ILifecycleService.class)).getPageState() != 2) {
                this.d.add(snpVar);
            } else if (((IQuickOpenService) this.f33742a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
                snpVar.f33749a.f33728a = true;
            } else {
                snpVar.f33749a.b();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (!snf.b()) {
            this.d.remove(viewHolder);
            if (this.h == viewHolder) {
                this.h = null;
            }
        }
        if (viewHolder instanceof snp) {
            ((snp) viewHolder).f33749a.d();
        } else if (!(viewHolder instanceof krk)) {
        } else {
            krk krkVar = (krk) viewHolder;
            krkVar.c();
            psw a2 = krkVar.a();
            if (a2 == null) {
                spz.c("MultiRecyclerViewAdapter", "footer detach from window, opacity card is null");
                return;
            }
            if (sjt.c(this.f33742a)) {
                psw activeCard = ((ICardService) this.f33742a.getService(ICardService.class)).getActiveCard();
                if (activeCard != null) {
                    spz.c("MultiRecyclerViewAdapter", "footer detach from window, doCardSlideAlphaAnimation false");
                    activeCard.i(false);
                }
            } else {
                a2.A().c().a(1.0f);
                spz.c("MultiRecyclerViewAdapter", "footer detach from window, set card(" + a2.w() + ") opacity 1");
            }
            krkVar.a(null);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.j = recyclerView;
        if (recyclerView instanceof LockableRecycerView) {
            ((LockableRecycerView) recyclerView).setOnLayoutCompletedListener(new LockableRecycerView.b() { // from class: tb.sno.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        sno.this.a(recyclerView);
                    }
                }
            });
        }
        recyclerView.addOnScrollListener(this.i);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!son.v()) {
        } else {
            ihi.a((Activity) this.f33742a.getContext());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c070a514", new Object[]{this, recyclerView});
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        if (recyclerView instanceof LockableRecycerView) {
            ((LockableRecycerView) recyclerView).setOnLayoutCompletedListener(null);
        }
        recyclerView.removeOnScrollListener(this.i);
    }

    public sno a(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sno) ipChange.ipc$dispatch("fa619819", new Object[]{this, list});
        }
        this.f = list;
        return this;
    }

    public void a(snj snjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff118709", new Object[]{this, snjVar});
        } else {
            this.b.a(snjVar);
        }
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> list = this.f;
        return list == null || i < 0 || i >= list.size();
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!son.q()) {
        } else {
            try {
                g();
                if (this.r != i) {
                    this.p++;
                    spz.c(PerfConst.TAG_PERF_SMOOTH, "fastcount add: " + this.p + ", last: " + this.r + ", index: " + i);
                    this.r = i;
                    if (!this.l.hasMessages(10003)) {
                        h();
                    }
                }
                spz.c(PerfConst.TAG_PERF_SMOOTH, "onItemLoadFinish/index: " + i + ", loadType" + i2);
                int i3 = i2 == 1001 ? 10001 : 10002;
                this.l.removeMessages(i3);
                if (i3 == 10002) {
                    this.l.removeMessages(10001);
                }
                int b = b(i, i2);
                if (this.q) {
                    spz.c(PerfConst.TAG_PERF_SMOOTH, "hit fastFastScroll");
                    b = son.A();
                }
                Message obtain = Message.obtain(this.l, i3, i, i2, Integer.valueOf(i));
                if (c(i)) {
                    spz.c(PerfConst.TAG_PERF_SMOOTH, "checkAlead load true fastcount: " + this.p);
                } else if (getItemCount() <= i + 1) {
                    this.o = obtain;
                } else {
                    this.l.sendMessageDelayed(obtain, b);
                    this.o = null;
                }
            } catch (Exception e) {
                spz.c(PerfConst.TAG_PERF_SMOOTH, "notifyLoadFinishForPrefetch crash: " + e.getMessage());
                com.taobao.android.fluid.framework.performance.c.a("PerfSmoothRV_PRE_FAIL_EXCEPTION_NOTIFY", String.valueOf(i), e.getMessage(), null);
            }
        }
    }

    private int b(int i, int i2) {
        int y;
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1002) {
            y = son.B();
        } else {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 2) {
                y = son.y();
            } else {
                y = son.z();
            }
        }
        if (i == 0) {
            i3 = 2;
        }
        return y * i3;
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int f = f();
        if (f >= this.k) {
            int i2 = i + 1;
            if (i2 <= f) {
                spz.c(PerfConst.TAG_PERF_SMOOTH, "scroll next, next: " + i2 + ", active: " + f);
                return true;
            }
        } else {
            int i3 = i - 1;
            if (i3 >= f) {
                spz.c(PerfConst.TAG_PERF_SMOOTH, "scroll pre, next: " + i3 + ", active: " + f);
                return true;
            }
        }
        return false;
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int b = b(this.j);
        if (b != -1) {
            return b;
        }
        psw activeCard = ((ICardService) this.f33742a.getService(ICardService.class)).getActiveCard();
        if (activeCard == null) {
            return 0;
        }
        return activeCard.r();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.n = true;
        if (!son.q() || this.o == null || getItemCount() <= this.o.arg1 + 1) {
            return;
        }
        a(this.o.arg1, this.o.arg2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.l != null) {
        } else {
            this.l = new c(Looper.getMainLooper());
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.l.removeMessages(10003);
        Message obtain = Message.obtain();
        obtain.what = 10003;
        obtain.arg1 = this.r;
        this.l.sendMessageDelayed(obtain, 3000L);
    }

    /* loaded from: classes5.dex */
    public class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1534129662);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            switch (message.what) {
                case 10001:
                case 10002:
                    try {
                        b(message);
                        return;
                    } catch (Throwable th) {
                        spz.c(PerfConst.TAG_PERF_SMOOTH, "MSG_PRELOAD_CARD error, msg: " + th.getMessage());
                        return;
                    }
                case 10003:
                    a(message);
                    return;
                default:
                    return;
            }
        }

        private void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
                return;
            }
            if (sno.c(sno.this) == message.arg1) {
                sno.a(sno.this, false);
                sno.a(sno.this, 0);
                spz.c(PerfConst.TAG_PERF_SMOOTH, "fastcount reset , index: " + sno.c(sno.this));
            } else {
                if (sno.d(sno.this) >= 3) {
                    sno.a(sno.this, true);
                    spz.c(PerfConst.TAG_PERF_SMOOTH, "fastcount set true, count: " + sno.d(sno.this));
                } else {
                    sno.a(sno.this, false);
                    sno.a(sno.this, 0);
                    spz.c(PerfConst.TAG_PERF_SMOOTH, "fastcount set false, count: " + sno.d(sno.this));
                }
                sno.e(sno.this);
            }
            ihi.a(sno.f(sno.this));
        }

        private void b(Message message) {
            RecyclerView.Recycler recycler;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
            } else if (!(sno.g(sno.this) instanceof LockableRecycerView) || (recycler = ((LockableRecycerView) sno.g(sno.this)).getRecycler()) == null) {
            } else {
                int h = sno.h(sno.this);
                if (h >= sno.i(sno.this)) {
                    i = message.arg1 + 1;
                } else {
                    i = message.arg1 - 1;
                }
                sno.b(sno.this, h);
                int scrollState = sno.g(sno.this).getScrollState();
                if (scrollState == 0) {
                    ihi.b();
                } else {
                    ihi.a();
                }
                if (b(message, i, h, scrollState)) {
                    spz.c("MultiRecyclerViewAdapter", "RV_PRE");
                    sno.j(sno.this).removeMessages(10001);
                    sno.j(sno.this).removeMessages(10002);
                    View view = null;
                    try {
                        view = recycler.getViewForPosition(i);
                    } catch (Exception e) {
                        a(message, i, e);
                    }
                    if (view != null) {
                        a(message, view);
                        recycler.recycleView(view);
                        sno.c(sno.this, i);
                        spz.c(PerfConst.TAG_PERF_SMOOTH, "MSG_PRELOAD_CARD/recycle/" + i);
                        HashMap hashMap = new HashMap();
                        hashMap.put("fastScroll", String.valueOf(sno.f(sno.this)));
                        com.taobao.android.fluid.framework.performance.c.a("PerfSmoothRV_PRE_SUC", String.valueOf(message.arg1), String.valueOf(message.arg2), hashMap);
                    } else {
                        spz.c(PerfConst.TAG_PERF_SMOOTH, "prealod index: " + i + ", count: " + sno.this.getItemCount() + ", msg: item is null");
                    }
                    sno.b(sno.this, false);
                    return;
                }
                a(message, i, h, scrollState);
            }
        }

        private void a(Message message, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("477ea708", new Object[]{this, message, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            spz.c(PerfConst.TAG_PERF_SMOOTH, "MSG_PRELOAD_CARD/fail/state/" + i3 + ",index " + i);
            HashMap hashMap = new HashMap();
            hashMap.put("scroll_state", String.valueOf(i3));
            hashMap.put("nextPosition", String.valueOf(i));
            hashMap.put("activePosition", String.valueOf(i2));
            if (i != sno.k(sno.this)) {
                z = false;
            }
            hashMap.put("alreadLoad", String.valueOf(z));
            hashMap.put("fastScroll", String.valueOf(sno.f(sno.this)));
            com.taobao.android.fluid.framework.performance.c.a("PerfSmoothRV_PRE_FAIL_MISS", String.valueOf(message.arg1), String.valueOf(message.arg2), hashMap);
            if (message.arg1 != i2 || i3 != 0) {
                return;
            }
            spz.c(PerfConst.TAG_PERF_SMOOTH, "xiewei hit index:" + message.arg1 + ", type: " + message.arg2);
        }

        private void a(Message message, int i, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bd196de", new Object[]{this, message, new Integer(i), exc});
                return;
            }
            if (sno.l(sno.this)) {
                sno.j(sno.this).removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = message.what;
                obtain.arg1 = message.arg1;
                obtain.arg2 = message.arg2;
                sno.j(sno.this).sendMessageDelayed(obtain, son.E());
            }
            String str = "prealod index: " + i + ", finishType: " + message.arg2 + " , count: " + sno.this.getItemCount() + ", msg: " + exc.getMessage();
            spz.c(PerfConst.TAG_PERF_SMOOTH, str);
            com.taobao.android.fluid.framework.performance.c.a("PerfSmoothRV_PRE_FAIL_EXCEPTION", String.valueOf(message.arg1), str, null);
        }

        private void a(Message message, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c073d737", new Object[]{this, message, view});
                return;
            }
            RecyclerView.ViewHolder childViewHolder = sno.g(sno.this).getChildViewHolder(view);
            if (message.arg2 == 1002 && (childViewHolder instanceof snp)) {
                ((snp) childViewHolder).c().aq();
                return;
            }
            spz.c(PerfConst.TAG_PERF_SMOOTH, "preloadIdleData false " + message.arg2);
        }

        private boolean b(Message message, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("384fae6b", new Object[]{this, message, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            boolean z = i3 == 0 && i2 == message.arg1;
            boolean z2 = i != sno.k(sno.this);
            if (!z) {
                spz.c(PerfConst.TAG_PERF_SMOOTH, "indexStable state/" + i3 + ", pos: " + i2 + ", fastcount: " + sno.d(sno.this));
            }
            if (!z2) {
                spz.c(PerfConst.TAG_PERF_SMOOTH, "indexAlreadLoad state/" + i3 + ", pos: " + i2 + ", fastcount: " + sno.d(sno.this));
            }
            return z && i >= 0 && sno.this.getItemCount() > i && z2;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        krk krkVar = this.t;
        if (krkVar == null) {
            return false;
        }
        return krkVar.d();
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f33747a;
        public snp b;

        static {
            kge.a(-1005530966);
        }

        public void a(int i, snp snpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13548576", new Object[]{this, new Integer(i), snpVar});
                return;
            }
            this.f33747a = i;
            this.b = snpVar;
        }
    }
}
