package tb;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.a;
import com.taobao.taolive.sdk.goodlist.n;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class hhz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPEN_SOURCE_OPEN_GOODLIST = "open_goodslist";
    public static final String OPEN_SOURCE_OPEN_SEARCH = "open_search";
    public static final String OPEN_SOURCE_OPE_AGGREGATION = "open_aggregation";
    public static final String OPEN_SOURCE_SCROLL_AGGREGATION = "scroll_aggregation";
    public static final String OPEN_SOURCE_SCROLL_GOODLIST = "scroll_goodslist";
    public static final String OPEN_SOURCE_SCROLL_SEARCH = "scroll_search";
    public static final String OPEN_SOURCE_SWITCH_GOODLIST_TAB = "switch_goodslist_tab";
    private boolean b;
    private RecyclerView h;
    private final c i;
    private Handler j;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f28674a = new ArrayList();
    private String k = OPEN_SOURCE_SCROLL_GOODLIST;
    private final Runnable l = new Runnable() { // from class: tb.hhz.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hhz hhzVar = hhz.this;
            hhzVar.a(hhz.a(hhzVar));
        }
    };
    private final RecyclerView.OnScrollListener m = new RecyclerView.OnScrollListener() { // from class: tb.hhz.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
            if (str.hashCode() == 2142696127) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 2 || i == 1) {
                hhz.a(hhz.this, true);
                return;
            }
            boolean b = hhz.b(hhz.this);
            if (recyclerView instanceof CloseRecyclerView) {
                b = hhz.b(hhz.this) && System.currentTimeMillis() - ((CloseRecyclerView) recyclerView).ensureFingerSlideStartTime < 2000;
            }
            if (!b || hhz.c(hhz.this) == null) {
                return;
            }
            hhz.c(hhz.this).postDelayed(hhz.d(hhz.this), hhz.e(hhz.this));
            hhz.a(hhz.this, false);
        }
    };
    private final boolean c = n.j();
    private final int e = n.i();
    private final boolean d = n.h();
    private final int f = hir.u();
    private final int g = hir.v();

    static {
        kge.a(164196023);
    }

    public static /* synthetic */ String a(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77f3a342", new Object[]{hhzVar}) : hhzVar.k;
    }

    public static /* synthetic */ boolean a(hhz hhzVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93dfe57a", new Object[]{hhzVar, new Boolean(z)})).booleanValue();
        }
        hhzVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean b(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da81f7a3", new Object[]{hhzVar})).booleanValue() : hhzVar.b;
    }

    public static /* synthetic */ Handler c(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7c3cbca6", new Object[]{hhzVar}) : hhzVar.j;
    }

    public static /* synthetic */ Runnable d(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e9fbf353", new Object[]{hhzVar}) : hhzVar.l;
    }

    public static /* synthetic */ int e(hhz hhzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a60b0b15", new Object[]{hhzVar})).intValue() : hhzVar.f;
    }

    public hhz(c cVar) {
        this.i = cVar;
    }

    public void a(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{this, recyclerView, str});
            return;
        }
        this.h = recyclerView;
        this.k = str;
        recyclerView.addOnScrollListener(this.m);
        this.j = new Handler();
    }

    public void a(String str) {
        RecyclerView recyclerView;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.i;
        if (cVar == null || cVar.p()) {
            return;
        }
        this.f28674a.clear();
        if (!this.c || !this.d || this.b || (recyclerView = this.h) == null) {
            return;
        }
        kas kasVar = null;
        if (recyclerView.getAdapter() instanceof kas) {
            kasVar = (kas) this.h.getAdapter();
        }
        if (kasVar == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.h.getLayoutManager();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findLastVisibleItemPosition < 0 || findFirstVisibleItemPosition < 0 || (i = this.g) < 0 || findFirstVisibleItemPosition > i) {
            return;
        }
        if (findFirstVisibleItemPosition < i && findLastVisibleItemPosition > i) {
            findLastVisibleItemPosition = i;
        }
        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            a a2 = kasVar.a(findFirstVisibleItemPosition);
            if (a2 != null && !hjn.a(a2.f21830a)) {
                if (n.a(this.i.f(), (LiveItem) JSON.parseObject(a2.b.toJSONString(), LiveItem.class))) {
                    this.f28674a.add(a2.e);
                }
                if (this.f28674a.size() > this.e) {
                    break;
                }
            }
            findFirstVisibleItemPosition++;
        }
        n.a(this.i.f(), this.i.u(), this.i.g(), this.f28674a, this.i.k() ? "movehighlight" : "live", str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.m);
        }
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.l);
    }
}
