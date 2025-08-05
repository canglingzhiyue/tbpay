package tb;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.business.BaseListRequest;
import com.taobao.live.home.business.a;
import com.taobao.live.home.business.b;
import com.taobao.live.home.dinamic.business.FeedListResponse;
import com.taobao.taobao.R;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.meh;

/* loaded from: classes7.dex */
public class mej extends RecyclerView.OnScrollListener implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "mej";

    /* renamed from: a  reason: collision with root package name */
    public meh<IMTOPDataObject> f31046a;
    private Context c;
    private View d;
    private RecyclerView e;
    private SwipeRefreshLayout f;
    private RecyclerView.LayoutManager g;
    private a h;
    private RecyclerView.OnScrollListener i;
    private mei j;
    private int k = 2;

    public static /* synthetic */ Object ipc$super(mej mejVar, String str, Object... objArr) {
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

    public mej(Context context, mei meiVar) {
        this.c = context;
        this.j = meiVar;
    }

    public void a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a16adc", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.live_base_list_fragment);
            this.d = viewStub.inflate();
            h();
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.d = LayoutInflater.from(this.c).inflate(R.layout.live_base_list_fragment, viewGroup, false);
        if (viewGroup != null) {
            viewGroup.addView(this.d);
        }
        h();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d;
    }

    public meh<IMTOPDataObject> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (meh) ipChange.ipc$dispatch("16b95ead", new Object[]{this}) : this.f31046a;
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else {
            this.i = onScrollListener;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setEnabled(z);
    }

    private meh<IMTOPDataObject> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (meh) ipChange.ipc$dispatch("357ff429", new Object[]{this}) : this.j.a();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        BaseListRequest d = this.j.d();
        this.h = this.j.c();
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.a((b) this);
        if (d == null) {
            return;
        }
        this.h.b(d);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            this.f = (SwipeRefreshLayout) view.findViewById(R.id.live_list_refresh);
            this.e = (RecyclerView) this.d.findViewById(R.id.live_list_recycler_view);
            SwipeRefreshLayout swipeRefreshLayout = this.f;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: tb.mej.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
                    public void onRefresh() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                        } else {
                            mej.this.d();
                        }
                    }
                });
                this.f.setColorSchemeResources(R.color.live_refresh_color);
                this.f.setDistanceToTriggerSync(100);
            }
            if (this.e != null) {
                this.f31046a = f();
                if (this.f31046a != null) {
                    this.e.addOnScrollListener(this);
                    this.e.setAdapter(this.f31046a);
                    this.g = this.j.a(this.c, this.f31046a);
                    RecyclerView.LayoutManager layoutManager = this.g;
                    if (layoutManager != null) {
                        this.e.setLayoutManager(layoutManager);
                    }
                    RecyclerView.ItemDecoration b2 = this.j.b();
                    if (b2 != null) {
                        this.e.addItemDecoration(b2);
                    }
                }
            }
            i();
        }
        g();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.f31046a;
        if (mehVar != null && mehVar.e() == 0 && this.j.e() != 0) {
            this.f31046a.a(this.j.e(), new meh.e() { // from class: tb.mej.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.meh.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        mej.this.e();
                    }
                }

                @Override // tb.meh.e
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        mej.this.e();
                    }
                }
            });
        }
        if (this.f31046a == null) {
            return;
        }
        if (this.j.e() != 0) {
            this.f31046a.a(this.j.f());
        }
        if (this.j.g() == 0) {
            return;
        }
        this.f31046a.a(this.j.g(), new meh.b() { // from class: tb.mej.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.meh.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    mej.this.d();
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.e != null) {
            RecyclerView.LayoutManager layoutManager = this.g;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i4 = this.k;
                int[] iArr = new int[i4];
                int[] iArr2 = new int[i4];
                ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
                ((StaggeredGridLayoutManager) this.g).findLastVisibleItemPositions(iArr2);
                for (int min = Math.min(iArr[0], iArr[this.k - 1]); min <= Math.max(iArr2[0], iArr2[this.k - 1]); min++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.e.findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition instanceof com.taobao.live.home.dinamic.view.b) {
                        com.taobao.live.home.dinamic.view.b bVar = (com.taobao.live.home.dinamic.view.b) findViewHolderForAdapterPosition;
                        bVar.a(recyclerView.getScrollState());
                        bVar.f();
                    }
                }
                meh<IMTOPDataObject> mehVar = this.f31046a;
                if (mehVar != null && (i3 = mehVar.i()) >= 20 && iArr2[0] >= i3 - 10) {
                    e();
                }
            }
        }
        RecyclerView.OnScrollListener onScrollListener = this.i;
        if (onScrollListener == null) {
            return;
        }
        onScrollListener.onScrolled(recyclerView, i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (this.e != null) {
            RecyclerView.LayoutManager layoutManager = this.g;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i2 = this.k;
                int[] iArr = new int[i2];
                int[] iArr2 = new int[i2];
                ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(iArr);
                ((StaggeredGridLayoutManager) this.g).findLastVisibleItemPositions(iArr2);
                for (int min = Math.min(iArr[0], iArr[this.k - 1]); min <= Math.max(iArr2[0], iArr2[this.k - 1]); min++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.e.findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition instanceof com.taobao.live.home.dinamic.view.b) {
                        com.taobao.live.home.dinamic.view.b bVar = (com.taobao.live.home.dinamic.view.b) findViewHolderForAdapterPosition;
                        bVar.b(i);
                        bVar.f();
                    }
                }
            }
        }
        RecyclerView.OnScrollListener onScrollListener = this.i;
        if (onScrollListener == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(recyclerView, i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h == null) {
        } else {
            LiveHomeController.a().e();
            this.h.d();
            SwipeRefreshLayout swipeRefreshLayout = this.f;
            if (swipeRefreshLayout == null) {
                return;
            }
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // com.taobao.live.home.business.b
    public boolean onJudgeEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4c0044e", new Object[]{this})).booleanValue() : this.j.a(this.f31046a);
    }

    public void onLoadMore(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60aad8f", new Object[]{this, baseListRequest});
        } else if (baseListRequest == null) {
        } else {
            baseListRequest.s += baseListRequest.n;
        }
    }

    public void onReload(BaseListRequest baseListRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335854d1", new Object[]{this, baseListRequest});
        } else if (baseListRequest == null) {
        } else {
            baseListRequest.s = 0L;
        }
    }

    private void a(List<IMTOPDataObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.f31046a;
        if (mehVar == null || this.e == null) {
            return;
        }
        mehVar.c();
        this.f31046a.g();
        this.j.a(list);
        this.f31046a.a(list);
        this.e.invalidateItemDecorations();
    }

    @Override // com.taobao.live.home.business.b
    public void onPageReload(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a8a88c", new Object[]{this, baseOutDo});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (!(baseOutDo instanceof FeedListResponse)) {
            return;
        }
        FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
        if (this.f31046a == null || feedListResponse.mo2429getData() == null) {
            return;
        }
        a(feedListResponse.mo2429getData().dataList);
        if (feedListResponse.mo2429getData().dataList == null) {
            return;
        }
        String str = b;
        mfj.b(str, "onPageReload: " + feedListResponse.mo2429getData().dataList.size());
    }

    @Override // com.taobao.live.home.business.b
    public void onPageReceived(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cdbec4", new Object[]{this, baseOutDo});
        } else if (!(baseOutDo instanceof FeedListResponse)) {
        } else {
            FeedListResponse feedListResponse = (FeedListResponse) baseOutDo;
            if (this.f31046a == null || feedListResponse.mo2429getData() == null) {
                return;
            }
            meh<IMTOPDataObject> mehVar = this.f31046a;
            if (mehVar != null) {
                mehVar.a(feedListResponse.mo2429getData().dataList);
            }
            if (feedListResponse.mo2429getData().dataList == null) {
                return;
            }
            String str = b;
            mfj.c(str, "onPageReceived: " + feedListResponse.mo2429getData().dataList.size() + " list size: " + this.f31046a.i());
        }
    }

    @Override // com.taobao.live.home.business.b
    public void onPageError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cfa8ab", new Object[]{this, str});
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        this.j.a(str);
    }

    @Override // com.taobao.live.home.business.b
    public void onPageEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7729b6f4", new Object[]{this});
            return;
        }
        meh<IMTOPDataObject> mehVar = this.f31046a;
        if (mehVar == null) {
            return;
        }
        mehVar.b();
    }
}
