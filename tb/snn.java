package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.business.videocollection.poplayer.b;
import com.taobao.android.fluid.common.view.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.album.e;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.FullPageRefreshHeader;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.TNodeTBSwipeRefreshLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class snn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FluidContext b;
    private final IContainerService c;
    private final IDataService d;
    private final IMessageService e;
    private final IHostTNodeService f;
    private final ICollectionService g;
    private final snh i;
    private LockableRecycerView j;
    private LinearLayoutManager k;
    private sno l;
    private com.taobao.android.fluid.common.view.a m;
    private View n;
    private TBSwipeRefreshLayout o;
    private psw p;
    private Handler q;
    private long r;
    private boolean s;
    private boolean t;
    private esf v;
    private final Handler h = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public long f33730a = 0;
    private int u = FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("residueCount", 4);

    /* loaded from: classes5.dex */
    public interface a {
        int a(com.taobao.android.fluid.framework.data.datamodel.a aVar);
    }

    static {
        kge.a(-421460568);
    }

    public static /* synthetic */ LockableRecycerView a(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LockableRecycerView) ipChange.ipc$dispatch("c4a7c2bb", new Object[]{snnVar}) : snnVar.j;
    }

    public static /* synthetic */ String a(snn snnVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cd901f", new Object[]{snnVar, pswVar}) : snnVar.a(pswVar);
    }

    public static /* synthetic */ void a(snn snnVar, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfeefc37", new Object[]{snnVar, fluidContext});
        } else {
            snnVar.a(fluidContext);
        }
    }

    public static /* synthetic */ void a(snn snnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3586aef", new Object[]{snnVar, new Boolean(z)});
        } else {
            snnVar.e(z);
        }
    }

    public static /* synthetic */ FluidContext b(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("4b8b2f82", new Object[]{snnVar}) : snnVar.b;
    }

    public static /* synthetic */ psw b(snn snnVar, psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psw) ipChange.ipc$dispatch("bbf723d0", new Object[]{snnVar, pswVar});
        }
        snnVar.p = pswVar;
        return pswVar;
    }

    public static /* synthetic */ boolean b(snn snnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5363492", new Object[]{snnVar, new Boolean(z)})).booleanValue();
        }
        snnVar.s = z;
        return z;
    }

    public static /* synthetic */ snh c(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snh) ipChange.ipc$dispatch("37c7eb52", new Object[]{snnVar}) : snnVar.i;
    }

    public static /* synthetic */ boolean d(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca9c6c0c", new Object[]{snnVar})).booleanValue() : snnVar.o();
    }

    public static /* synthetic */ void e(snn snnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91f7289", new Object[]{snnVar});
        } else {
            snnVar.u();
        }
    }

    public static /* synthetic */ IDataService f(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDataService) ipChange.ipc$dispatch("5b459e1d", new Object[]{snnVar}) : snnVar.d;
    }

    public static /* synthetic */ Handler g(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b8c7355b", new Object[]{snnVar}) : snnVar.h;
    }

    public static /* synthetic */ int h(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("84a885ff", new Object[]{snnVar})).intValue() : snnVar.u;
    }

    public static /* synthetic */ void i(snn snnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732b8c8d", new Object[]{snnVar});
        } else {
            snnVar.n();
        }
    }

    public static /* synthetic */ TBSwipeRefreshLayout j(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("b9065ce3", new Object[]{snnVar}) : snnVar.o;
    }

    public static /* synthetic */ sno k(snn snnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sno) ipChange.ipc$dispatch("74d69f23", new Object[]{snnVar}) : snnVar.l;
    }

    public static /* synthetic */ void l(snn snnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb4a010", new Object[]{snnVar});
        } else {
            snnVar.m();
        }
    }

    public snn(FluidContext fluidContext, snh snhVar) {
        this.b = fluidContext;
        this.c = (IContainerService) Objects.requireNonNull(fluidContext.getService(IContainerService.class));
        this.d = (IDataService) Objects.requireNonNull(fluidContext.getService(IDataService.class));
        this.e = (IMessageService) Objects.requireNonNull(fluidContext.getService(IMessageService.class));
        this.f = (IHostTNodeService) Objects.requireNonNull(fluidContext.getService(IHostTNodeService.class));
        this.g = (ICollectionService) Objects.requireNonNull(fluidContext.getService(ICollectionService.class));
        this.i = snhVar;
        this.v = new esf(fluidContext);
        spz.c("ListRenderManager", "滑动 ResidueCount:" + this.u);
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
            return;
        }
        LockableRecycerView lockableRecycerView = this.j;
        if (lockableRecycerView == null) {
            return;
        }
        lockableRecycerView.addOnScrollListener(onScrollListener);
    }

    public psw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("f094cca", new Object[]{this}) : this.p;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (sjt.E()) {
            psw pswVar = this.p;
            if (pswVar == null) {
                return -1;
            }
            return pswVar.r();
        }
        sno snoVar = this.l;
        if (snoVar != null) {
            return snoVar.b(this.j);
        }
        return -1;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.n;
    }

    public LinearLayoutManager d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayoutManager) ipChange.ipc$dispatch("ac9f97b", new Object[]{this}) : this.k;
    }

    public sno e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sno) ipChange.ipc$dispatch("2dd12ba6", new Object[]{this}) : this.l;
    }

    public LockableRecycerView f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LockableRecycerView) ipChange.ipc$dispatch("9d10a653", new Object[]{this}) : this.j;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.t;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public boolean i() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.j.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (adapter = this.j.getAdapter()) == null) {
            return true;
        }
        int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        return findFirstCompletelyVisibleItemPosition >= 0 && findFirstCompletelyVisibleItemPosition >= adapter.getItemCount() - 1;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int currentMediaPosition = this.d.getCurrentMediaPosition();
        if (oeb.a("ShortVideo.enableRefreshForPublish", true) && i == currentMediaPosition) {
            if (!(a() instanceof psy)) {
                return;
            }
            snp G = ((psy) a()).G();
            int size = this.l.a().size();
            if (size <= i) {
                spz.c("ListRenderManager", "index out of array, index:" + i + " size: " + size);
                return;
            }
            G.a().b(this.l.a().get(i), i);
            return;
        }
        this.l.notifyItemChanged(i);
    }

    public void a(psw pswVar, boolean z) {
        com.taobao.android.fluid.framework.data.datamodel.a aVar;
        a.c a2;
        a.d E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dacc7d0", new Object[]{this, pswVar, new Boolean(z)});
        } else if (!(pswVar instanceof psy)) {
        } else {
            int adapterPosition = ((psy) pswVar).G().getAdapterPosition();
            if (z) {
                if (adapterPosition <= 0) {
                    return;
                }
            } else if (this.d.getMediaSetList().size() <= adapterPosition + 1) {
                return;
            }
            int i = z ? adapterPosition - 1 : adapterPosition + 1;
            if (i >= this.d.getMediaSetList().size() || (aVar = this.d.getMediaSetList().get(i)) == null || (a2 = aVar.a()) == null || !a2.z() || (E = a2.E()) == null) {
                return;
            }
            sin.a(E);
            String e = E.e();
            if (StringUtils.isEmpty(e)) {
                return;
            }
            FluidSDK.getImageAdapter().load(e, new com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable>() { // from class: tb.snn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.adapter.mtop.a
                public /* bridge */ /* synthetic */ void a(String str, BitmapDrawable bitmapDrawable) {
                }
            });
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            b(true);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b(false);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j.setAutoLock(true);
        int height = this.j.getHeight();
        if (this.b.getService(INativeCollectionPoplayerService.class) != null && ((INativeCollectionPoplayerService) this.b.getService(INativeCollectionPoplayerService.class)).checkDialogPopup(this.b)) {
            return;
        }
        LockableRecycerView lockableRecycerView = this.j;
        if (!z) {
            height = -height;
        }
        lockableRecycerView.smoothScrollBy(0, height);
        a(true);
        this.h.postDelayed(new Runnable() { // from class: tb.snn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    snn.a(snn.this).setAutoLock(false);
                }
            }
        }, 1000L);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.j.smoothScrollToPosition(i);
        } catch (Exception e) {
            FluidException.throwException(this.b, IFeedsListService.SCROLL_INVALID_TARGET_POSITION, e);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!o() || !sop.a().b().a() || this.q == null) {
        } else {
            a(this.b);
            spz.c("ListRenderManager", "PickPreloadControllerNew，removeUpScrollDelayMessage,用户向上滑动，清除延迟消息");
            this.q.removeCallbacksAndMessages(null);
            d(i);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.n = c(context);
        this.j = (LockableRecycerView) this.n.findViewById(R.id.v_mediaset_list);
        r();
        this.k = new LinearLayoutManager(context) { // from class: tb.snn.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode != -602204034) {
                    if (hashCode != 1626618577) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                }
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("dc1b187e", new Object[]{this, new Integer(i), recycler, state})).intValue();
                }
                try {
                    return super.scrollVerticallyBy(i, recycler, state);
                } catch (Exception e) {
                    FluidException.throwException(snn.b(snn.this), IFeedsListService.RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS, e);
                    return 0;
                }
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Exception e) {
                    FluidException.throwException(snn.b(snn.this), IFeedsListService.RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS, e);
                }
                if (snn.a(snn.this) == null) {
                    return;
                }
                snn.a(snn.this).setRecycler(recycler);
            }
        };
        this.k.setOrientation(1);
        this.j.setLayoutManager(this.k);
        this.j.setHasFixedSize(true);
        this.j.setItemViewCacheSize(1);
        if (son.q()) {
            spz.c(PerfConst.TAG_PERF_SMOOTH, "close RV default prefetch");
            this.j.getLayoutManager().setItemPrefetchEnabled(false);
        }
        d(context);
        s();
        this.l = new sno(this.b) { // from class: tb.snn.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.snl
            public int a(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("8180bd12", new Object[]{this, aVar, new Integer(i)})).intValue() : aVar.b(0);
            }

            @Override // tb.snl
            public psw a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (psw) ipChange2.ipc$dispatch("e6663637", new Object[]{this, new Integer(i)});
                }
                spz.c("ListRenderManager", "PickPreloadControllerNew，卡片type：" + i);
                if (i == 0) {
                    return new sii(snn.b(snn.this));
                }
                if (i == 1) {
                    return new com.taobao.android.fluid.framework.card.cards.album.a(snn.b(snn.this));
                }
                if (i == 2) {
                    return new sic(snn.b(snn.this));
                }
                if (i == 3) {
                    return new e(snn.b(snn.this));
                }
                if (i == 4) {
                    return new sib(snn.b(snn.this));
                }
                if (i == 5) {
                    return new com.taobao.android.fluid.framework.card.cards.web.a(snn.b(snn.this));
                }
                return null;
            }
        };
        this.l.a(this.d.getMediaSetList());
        p();
        this.j.setAdapter(this.l);
        this.m = new com.taobao.android.fluid.common.view.a();
        this.m.attachToRecyclerView(this.j);
        t();
    }

    public void a(sor sorVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff234182", new Object[]{this, sorVar});
        } else {
            this.l.a(sorVar);
        }
    }

    public void a(String str) {
        a.c a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            int i2 = -1;
            int size = this.d.getMediaSetList().size();
            while (true) {
                if (i < size) {
                    com.taobao.android.fluid.framework.data.datamodel.a aVar = this.d.getMediaSetList().get(i);
                    if (aVar != null && (a2 = aVar.a()) != null && str.equals(a2.g())) {
                        i2 = i;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (i2 >= 0) {
                this.j.scrollToPosition(i2);
            }
            this.g.scrollToIndexForPaging(str, i2);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.j.setAutoLock(z);
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j.setLocked(z);
        sni lockListListener = ((ISceneConfigService) this.b.getService(ISceneConfigService.class)).getLockListListener();
        if (lockListListener == null) {
            return;
        }
        lockListListener.a(z);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.p.G().getAdapterPosition() == 0) {
            spz.c("ListRenderManager", "PickPreloadControllerNew，播放下一坑数据");
            c(true);
            j();
            this.d.setAutoSlideForNextVideo(this.b);
            d(0);
        }
        a(this.b);
        c(false);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore");
        if (d() == null) {
            return;
        }
        if (this.d.getMediaSetList().isEmpty()) {
            spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore() return-- getMediaSetList().isEmpty()");
            return;
        }
        int itemCount = d().getItemCount();
        int findLastVisibleItemPosition = d().findLastVisibleItemPosition();
        spz.c("ListRenderManager", " checkToLoadMore totalItemCount=" + itemCount + " lastVisibleItem=" + findLastVisibleItemPosition + " first=" + d().findFirstVisibleItemPosition() + " isLoadingMore()=" + this.d.isLoadingMore());
        if (SystemClock.elapsedRealtime() - this.r > 500) {
            this.r = SystemClock.elapsedRealtime();
            psw pswVar = this.p;
            if (pswVar instanceof psy) {
                try {
                    int adapterPosition = ((psy) pswVar).G().getAdapterPosition();
                    int i = itemCount - 1;
                    if (adapterPosition == i && findLastVisibleItemPosition == i) {
                        HashMap hashMap = new HashMap(1);
                        hashMap.put("listSize", Integer.valueOf(itemCount));
                        hashMap.put("index", Integer.valueOf(adapterPosition));
                        spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable checkToLoadMore noData. totalItemCount=" + itemCount + " curPosition=" + adapterPosition);
                        ljq.a(this.p, "noData", (Map<String, Object>) null, hashMap);
                    }
                } catch (Exception e) {
                    spz.c("ListRenderManager", "e : " + e.getMessage());
                }
            }
        }
        if (this.d.isLoadingMore()) {
            return;
        }
        try {
            if (a(findLastVisibleItemPosition, this.b, this.d)) {
                return;
            }
        } catch (Exception e2) {
            spz.c("ListRenderManager", "e : " + e2.getMessage());
        }
        if ((itemCount - 1) - findLastVisibleItemPosition > this.u) {
            return;
        }
        this.d.postLoadDownRunnable();
    }

    private static boolean a(int i, FluidContext fluidContext, IDataService iDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c066c62", new Object[]{new Integer(i), fluidContext, iDataService})).booleanValue();
        }
        int i2 = i - (snf.d(fluidContext) ? 1 : 0);
        if (i2 < 0) {
            return false;
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        if ((obo.b(currentMediaSetData) || currentMediaSetData == null) && spj.b()) {
            spz.c("ListRenderManager", "collectionReqeustIntercept，mediaSetData" + currentMediaSetData);
            return true;
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> mediaSetList = iDataService.getMediaSetList();
        List<com.taobao.android.fluid.framework.data.datamodel.a> relatedCollectionData = iDataService.getRelatedCollectionData();
        int lastDataSequenceNumber = iDataService.getLastDataSequenceNumber();
        if (i2 < mediaSetList.size() && ((obo.a(mediaSetList.get(i2)) == lastDataSequenceNumber || obo.b(mediaSetList.get(i2))) && relatedCollectionData.size() > 0 && b.i())) {
            return true;
        }
        spz.c("ListRenderManager", "collectionReqeustIntercept, mediaSetData" + currentMediaSetData + " lastVisibleItem" + i2 + " lastDataSequenceNumber" + lastDataSequenceNumber + " relatedCollectionData" + relatedCollectionData.size() + "getSequenceNumber" + obo.a(mediaSetList.get(i2)));
        return false;
    }

    private View b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c13a4681", new Object[]{this, context});
        }
        LockableRecycerView lockableRecycerView = new LockableRecycerView(context);
        lockableRecycerView.setId(R.id.v_mediaset_list);
        return lockableRecycerView;
    }

    private View a(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aeef5834", new Object[]{this, context, view});
        }
        if (!snf.a(this.b)) {
            return view;
        }
        this.o = new TNodeTBSwipeRefreshLayout(context);
        this.o.setHeaderView(new FullPageRefreshHeader(context));
        this.o.addView(view);
        this.o.setTargetScrollWithLayout(false);
        this.o.setMaxPullDistance(ohd.b(context, 36));
        this.o.setCustomRefreshHeight(ohd.b(context, 36));
        this.o.enableSecondFloor(false);
        return this.o;
    }

    private View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb04e860", new Object[]{this, context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        View b = b(context);
        boolean d = snf.d();
        spz.a("ListRenderManager", "generateLayout:" + d + " inflateTime=" + (System.currentTimeMillis() - currentTimeMillis));
        return a(context, b);
    }

    private String a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b74919c", new Object[]{this, pswVar});
        }
        if (pswVar != null) {
            return pswVar.b();
        }
        return null;
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (sop.a().b().l) {
            spz.c("ListRenderManager", "PickPreloadControllerNew，开关关闭，不需要下滑");
            return false;
        } else if (snf.b(this.b)) {
            return true;
        } else {
            spz.c("ListRenderManager", "PickPreloadControllerNew,hasExposedNeedPlayNextVideo未曝光，不需要下滑");
            return false;
        }
    }

    private void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
            return;
        }
        spz.c("ListRenderManager", "PickPreloadControllerNew，resetUpScrollFlag,重置标记位");
        ((IDataService) this.b.getService(IDataService.class)).setTab3CacheHadExposedNeedPlayNextVideo(false);
        this.c.showTab3CacheHadExposedLoading(false);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.l.a(new snj() { // from class: tb.snn.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snj
                public void b(final psw pswVar, final psw pswVar2) {
                    com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData;
                    com.taobao.android.layoutmanager.container.secondpage.biz.b a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("24c86421", new Object[]{this, pswVar, pswVar2});
                        return;
                    }
                    spz.c("ListRenderManager", "onActiveCardChanged current: " + snn.a(snn.this, pswVar) + ", old: " + snn.a(snn.this, pswVar2));
                    snn.b(snn.this, pswVar);
                    snn.c(snn.this).b(pswVar, pswVar2);
                    if (pswVar == null || (currentMediaSetData = ((IDataService) snn.b(snn.this).getService(IDataService.class)).getCurrentMediaSetData()) == null) {
                        return;
                    }
                    boolean d = snn.d(snn.this);
                    StringBuilder sb = new StringBuilder();
                    sb.append("PickPreloadControllerNew,onActiveCardChanged,");
                    sb.append(d ? "执行下滑逻辑" : "执行隐藏loading，清空标记逻辑");
                    spz.c("ListRenderManager", sb.toString());
                    if (d) {
                        snn.e(snn.this);
                    } else {
                        snn snnVar = snn.this;
                        snn.a(snnVar, snn.b(snnVar));
                    }
                    a.c a3 = currentMediaSetData.a();
                    String B = a3.B();
                    f pageInterface = ((IHostPageInterfaceService) snn.b(snn.this).getService(IHostPageInterfaceService.class)).getPageInterface();
                    String str = null;
                    if (pageInterface != null) {
                        a2 = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) pageInterface);
                    } else {
                        a2 = snn.b(snn.this).getContext() instanceof ogb ? com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) snn.b(snn.this).getContext()) : null;
                    }
                    if (!StringUtils.isEmpty(B) && a2 != null) {
                        ITrackService iTrackService = (ITrackService) snn.b(snn.this).getService(ITrackService.class);
                        if (iTrackService != null) {
                            Map<String, String> activeCardCommonTrack = iTrackService.getActiveCardCommonTrack();
                            activeCardCommonTrack.put("contentId", a3.g());
                            activeCardCommonTrack.put("videoId", a3.g());
                            activeCardCommonTrack.put("video_spm_cnt", activeCardCommonTrack.get("spm-cnt"));
                            activeCardCommonTrack.put("video_spm_url", activeCardCommonTrack.get("spm-url"));
                            str = obz.a(activeCardCommonTrack);
                        }
                        spz.c("ListRenderManager", "侧滑进个人页--commonTrack=" + str);
                        a2.a(B, str);
                    }
                    snn.this.f().setAutoLock(false);
                    snn.g(snn.this).post(new Runnable() { // from class: tb.snn.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            while (!snn.f(snn.this).getFeedbackList().isEmpty()) {
                                snn.f(snn.this).insertDetailListAtCurrent(snn.f(snn.this).getFeedbackList().removeFirst());
                            }
                        }
                    });
                    snn.f(snn.this).getmPreloadNextHandler().removeMessages(0);
                    snn.f(snn.this).getmPreloadNextHandler().postDelayed(new Runnable() { // from class: tb.snn.6.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            boolean z = false;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            psw pswVar3 = pswVar2;
                            if (pswVar3 == null) {
                                snn.this.a(pswVar, false);
                                snn.this.a(pswVar, true);
                            } else if (!(pswVar3 instanceof psy) || !(pswVar instanceof psy)) {
                            } else {
                                int adapterPosition = ((psy) pswVar3).G().getAdapterPosition();
                                int adapterPosition2 = ((psy) pswVar).G().getAdapterPosition();
                                snn snnVar2 = snn.this;
                                psw pswVar4 = pswVar;
                                if (adapterPosition > adapterPosition2) {
                                    z = true;
                                }
                                snnVar2.a(pswVar4, z);
                            }
                        }
                    }, 1000L);
                }

                @Override // tb.snj
                public void a(psw pswVar, psw pswVar2) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("182f6ea0", new Object[]{this, pswVar, pswVar2});
                        return;
                    }
                    spz.c("ListRenderManager", "onBeforeActiveCardChanged current: " + snn.a(snn.this, pswVar) + ", old: " + snn.a(snn.this, pswVar2));
                    snn.c(snn.this).a(pswVar, pswVar2);
                    if (!(pswVar2 instanceof psy) || !(pswVar instanceof psy)) {
                        return;
                    }
                    int adapterPosition = ((psy) pswVar2).G().getAdapterPosition();
                    int adapterPosition2 = ((psy) pswVar).G().getAdapterPosition();
                    FluidContext b = snn.b(snn.this);
                    if (adapterPosition2 <= adapterPosition) {
                        z = false;
                    }
                    com.taobao.android.fluid.business.usertrack.track.b.d(b, z);
                }
            });
        }
    }

    private void d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else {
            this.j.setOnDragListener(new LockableRecycerView.c() { // from class: tb.snn.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
                public void d() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    } else {
                        snn.c(snn.this).d();
                    }
                }

                @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
                public void e() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                    } else {
                        snn.c(snn.this).e();
                    }
                }

                @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    snn.c(snn.this).b();
                    spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragDown。");
                    snn.a(snn.this, false);
                    if (snn.f(snn.this).isLoadingUp()) {
                        return;
                    }
                    int findFirstVisibleItemPosition = snn.this.d().findFirstVisibleItemPosition();
                    if (!snf.a()) {
                        if (findFirstVisibleItemPosition <= snn.h(snn.this)) {
                            snn.f(snn.this).postLoadUpRunnable();
                        }
                    } else if (findFirstVisibleItemPosition < 2) {
                        snn.f(snn.this).postLoadUpRunnable();
                    }
                    if (snn.f(snn.this).isLoadingUp() || snn.this.f().canScrollVertically(-1) || snn.f(snn.this).ismHasShowNoMoreMsgUp() || !snn.f(snn.this).isUpNoMoreData() || StringUtils.isEmpty(snn.f(snn.this).getNoMoreMsgUp())) {
                        return;
                    }
                    oce.b(context, snn.f(snn.this).getNoMoreMsgUp());
                    snn.f(snn.this).setHasShowNoMoreMsgUp(true);
                }

                @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                        return;
                    }
                    snn.c(snn.this).c();
                    boolean canScrollVertically = snn.this.f().canScrollVertically(1);
                    spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。 canScrollUp=" + canScrollVertically + " isLoadingMore()=" + snn.f(snn.this).isLoadingMore());
                    snn.a(snn.this, false);
                    snn.this.c(2);
                    if (!canScrollVertically) {
                        int findLastVisibleItemPosition = snn.this.d().findLastVisibleItemPosition();
                        int a2 = com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a.a(snn.f(snn.this).isLoadingMore(), snn.f(snn.this).isNoMoreData(), snn.f(snn.this).getNoRecReason());
                        com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a.a(snn.b(snn.this), findLastVisibleItemPosition, a2);
                        d.a(snn.b(snn.this), "cannot_scrollup", String.valueOf(System.currentTimeMillis() - snn.f(snn.this).getStartRecommendtime()), String.valueOf(a2), String.valueOf(findLastVisibleItemPosition), snn.f(snn.this).getRecommendRequestId());
                        spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。滑不动 reason=" + a2 + " position=" + findLastVisibleItemPosition + " ; getRecommendRequestId()=" + snn.f(snn.this).getRecommendRequestId() + "; cost=" + (System.currentTimeMillis() - snn.f(snn.this).getStartRecommendtime()));
                    }
                    if (snn.f(snn.this).isLoadingMore()) {
                        return;
                    }
                    if (!snf.a()) {
                        snn.i(snn.this);
                    } else if (snn.this.d().getItemCount() < snn.this.d().findFirstVisibleItemPosition() + 4) {
                        snn.f(snn.this).postLoadDownRunnable();
                    }
                    if (snn.f(snn.this).isLoadingMore() || canScrollVertically || snn.f(snn.this).isHasShowNoMoreMsg() || !snn.f(snn.this).isNoMoreData() || StringUtils.isEmpty(snn.f(snn.this).getNoMoreMsg())) {
                        return;
                    }
                    spz.c("ListRenderManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onDragUp。 isNoMoreData()=true；toast提示：" + snn.f(snn.this).getNoMoreMsg());
                    oce.b(context, snn.f(snn.this).getNoMoreMsg());
                    snn.f(snn.this).setHasShowNoMoreMsg(true);
                }
            });
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        final skd skdVar = new skd() { // from class: tb.snn.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skd
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    snn.j(snn.this).setRefreshing(false);
                }
            }
        };
        this.o.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: tb.snn.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                } else {
                    snn.c(snn.this).onRefresh();
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                } else {
                    snn.c(snn.this).onPullDistance(i);
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                    return;
                }
                snn.c(snn.this).onRefreshStateChanged(refreshState, refreshState2);
                if (refreshState2 != TBRefreshHeader.RefreshState.REFRESHING) {
                    return;
                }
                snn.this.c(1);
                snn.f(snn.this).requestDetailDataAndRefresh(skdVar);
            }
        });
    }

    private void r() {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (!snf.a(this.b) || (tBSwipeRefreshLayout = this.o) == null) {
        } else {
            tBSwipeRefreshLayout.enablePullRefresh(true);
            this.o.getRefresHeader().setBackgroundColor(0);
            q();
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (snf.a()) {
        } else {
            this.j.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.snn.10
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private boolean b = false;

                public static /* synthetic */ Object ipc$super(AnonymousClass10 anonymousClass10, String str, Object... objArr) {
                    if (str.hashCode() == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    spz.c("ListRenderManager", "onScrollStateChanged, newState:" + i + ", isDragging:" + this.b);
                    snn.c(snn.this).a(recyclerView, i);
                    StringBuilder sb = new StringBuilder();
                    sb.append("VideoProcess PublicCardListController.mLoadMoreRunnable trackdrag onScrollStateChanged rv state:");
                    sb.append(i);
                    spz.a("ListRenderManager", sb.toString());
                    if (i == 0) {
                        if (this.b) {
                            sml.a(snn.b(snn.this), "enddrag");
                            this.b = false;
                        }
                        snn.i(snn.this);
                    } else if (i == 1) {
                        snn.this.f33730a = System.currentTimeMillis();
                    } else if (i == 2) {
                        sml.a(snn.b(snn.this), "enddrag");
                        this.b = false;
                    }
                    if (this.b) {
                        return;
                    }
                    snn.a(snn.this, false);
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    snn.c(snn.this).a(recyclerView, i, i2);
                    if (i2 == 0 || recyclerView.getScrollState() != 1 || this.b) {
                        return;
                    }
                    sml.a(snn.b(snn.this), "startdrag");
                    this.b = true;
                    snn.a(snn.this, true);
                }
            });
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.m.a(new a.InterfaceC0490a() { // from class: tb.snn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    snn.c(snn.this).a(i);
                    snr.a(snn.this.f(), i);
                    smi.a(snn.b(snn.this));
                    com.taobao.android.fluid.business.intelligence.netpredict.a.a().a(snn.b(snn.this), snn.k(snn.this).a(), i + 1);
                }

                @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    snn.c(snn.this).a(z);
                    snn.b(snn.this, z);
                }

                @Override // com.taobao.android.fluid.common.view.a.InterfaceC0490a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    snn.c(snn.this).a();
                    snn.this.e().a(snn.this.f());
                }
            });
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        spz.c("ListRenderManager", "PickPreloadControllerNew,tab3CacheHadExposedNeedPlayNextVideo");
        if (sop.a().b().a()) {
            if (this.q == null) {
                this.q = new Handler(Looper.getMainLooper()) { // from class: tb.snn.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        snn.l(snn.this);
                        spz.c("ListRenderManager", "PickPreloadController，tab3CacheHadExposedNeedPlayNextVideo 延迟执行上翻逻辑");
                    }
                };
            }
            if (this.q.hasMessages(0)) {
                return;
            }
            this.q.sendEmptyMessageDelayed(0, sop.a().b().f);
            return;
        }
        spz.c("ListRenderManager", "PickPreloadController，tab3CacheHadExposedNeedPlayNextVideo 执行上翻逻辑");
        m();
    }

    public sor l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sor) ipChange.ipc$dispatch("63acb55d", new Object[]{this}) : this.l.k();
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            d.a(this.b, i);
        }
    }

    private void e(boolean z) {
        psw activeCard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (!sjt.c(this.b) || (activeCard = ((ICardService) this.b.getService(ICardService.class)).getActiveCard()) == null) {
        } else {
            activeCard.i(z);
        }
    }
}
