package tb;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class esf extends RecyclerView.OnScrollListener implements LockableRecycerView.c, snd, snj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f27524a;
    private static int b;
    private FluidContext d;
    private IFeedsListService e;
    private a<Long> c = new a<>(oeb.a("list_monitor_queue_size", 3));
    private Set<String> f = new HashSet();
    private Handler g = new Handler(Looper.getMainLooper());
    private boolean h = oeb.a("ShortVideo.enableListMonitor", true);
    private Runnable i = new Runnable() { // from class: tb.esf.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sno mediaCardListAdapter = esf.a(esf.this).getMediaCardListAdapter();
            if (mediaCardListAdapter != null && mediaCardListAdapter.a() != null && !mediaCardListAdapter.a().isEmpty()) {
                return;
            }
            HashMap hashMap = new HashMap();
            IDataService iDataService = (IDataService) esf.b(esf.this).getService(IDataService.class);
            hashMap.put("retCode", iDataService.getDetailRequestRetCode());
            hashMap.put("reason", Integer.valueOf(iDataService.getDetailRequestStatus()));
            esf.a(esf.this, "noData", hashMap);
        }
    };

    public static /* synthetic */ Object ipc$super(esf esfVar, String str, Object... objArr) {
        if (str.hashCode() == 2142696127) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.snj
    public void a(psw pswVar, psw pswVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182f6ea0", new Object[]{this, pswVar, pswVar2});
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ IFeedsListService a(esf esfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFeedsListService) ipChange.ipc$dispatch("edc2966e", new Object[]{esfVar}) : esfVar.e;
    }

    public static /* synthetic */ void a(esf esfVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4181e1b", new Object[]{esfVar, str, map});
        } else {
            esfVar.a(str, map);
        }
    }

    public static /* synthetic */ FluidContext b(esf esfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("c728bac7", new Object[]{esfVar}) : esfVar.d;
    }

    static {
        kge.a(-26196355);
        kge.a(-1025556074);
        kge.a(2125388320);
        kge.a(1755210026);
        f27524a = oeb.a("list_monitor_drag_timeout", 3000L);
        b = oeb.a("list_monitor_no_data_check_timeout", 15000);
    }

    /* loaded from: classes5.dex */
    public class a<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LinkedList<E> b = new LinkedList<>();
        private int c;

        static {
            kge.a(1974161982);
        }

        public a(int i) {
            this.c = i;
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, e});
                return;
            }
            if (this.b.size() >= this.c) {
                this.b.removeFirst();
            }
            this.b.addLast(e);
        }

        public E a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.b.getFirst();
        }

        public E b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b.getLast();
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b.size() == this.c;
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else {
                this.b.clear();
            }
        }
    }

    public esf(FluidContext fluidContext) {
        this.d = fluidContext;
        IFeedsListService iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        this.e = iFeedsListService;
        if (this.h) {
            iFeedsListService.addDragListener(this);
            iFeedsListService.a((RecyclerView.OnScrollListener) this);
            iFeedsListService.a((snj) this);
            ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.a(Long.valueOf(System.currentTimeMillis()));
        if (!this.c.c() || this.c.b().longValue() - this.c.a().longValue() > f27524a) {
            return;
        }
        g();
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (f()) {
            return;
        }
        this.c.d();
    }

    @Override // tb.snj
    public void b(psw pswVar, psw pswVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c86421", new Object[]{this, pswVar, pswVar2});
        } else {
            this.c.d();
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> a2 = this.e.getMediaCardListAdapter().a();
        return this.e.getActivePosition() == (a2 != null ? a2.size() : 0) - 1;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e.getRecyclerView().isLocked()) {
            a("listLocked", (Map) null);
        } else if (!f()) {
        } else {
            HashMap hashMap = new HashMap();
            IDataService iDataService = (IDataService) this.d.getService(IDataService.class);
            hashMap.put("noMoreData", Boolean.valueOf(iDataService.isNoMoreData()));
            hashMap.put("reason", Integer.valueOf(com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.a.a(iDataService.isLoadingMore(), iDataService.isNoMoreData(), iDataService.getNoRecReason())));
            hashMap.put("retCode", iDataService.getRequestRetCode());
            a("noMoreData", hashMap);
        }
    }

    private void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (this.f.contains(str)) {
        } else {
            this.f.add(str);
            if (map == null) {
                map = new HashMap();
            }
            psw activeCard = this.e.getActiveCard();
            if (activeCard != null) {
                map.put("type", Integer.valueOf(activeCard.c()));
                map.put("contentId", activeCard.D().g());
                map.put("position", Integer.valueOf(activeCard.r()));
            }
            map.put("bizType", this.d.getInstanceConfig().getBizType());
            sps sessionParams = ((ISceneConfigService) this.d.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                Map<String, String> c = sessionParams.c();
                if (c != null) {
                    map.put("sceneSource", c.get("sceneSource"));
                }
                map.put("source", sessionParams.c);
                map.put("sessionType", sessionParams.b);
            }
            ((ITrackService) this.d.getService(ITrackService.class)).getTrackTint().a(t.MODULE_FULL_PAGE, "unscrollable", str, map);
            spz.c("ListMonitor", "reportUnScrollable:" + str + " args:" + map);
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.g.postDelayed(this.i, b);
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.g.removeCallbacks(this.i);
        }
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            this.g.removeCallbacks(this.i);
        }
    }
}
