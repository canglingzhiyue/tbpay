package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.controller.stay.c;
import com.taobao.android.detail.core.detail.kit.view.adapter.main.DetailMainViewAdapter;
import com.taobao.android.detail.core.detail.model.constant.DetailConstants;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.ultronengine.e;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class dxz extends com.taobao.android.detail.core.detail.widget.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailBaseMainController";

    /* renamed from: a  reason: collision with root package name */
    public Activity f27080a;
    public DetailListView b;
    public DetailMainViewAdapter c;
    public PullToRefreshFeature d;
    public PullToRefreshFeatureRV e;
    public List<b> f;
    public Handler g;
    public f h;
    public dwk i;
    public dwj j;
    private DetailListView.b k;
    private a l;
    private c m;
    private DetailListView.a n;
    private DetailListView.b o;
    private View p;
    private boolean q;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, String str, String str2);

        void a(int i, boolean z, String str, String str2);
    }

    static {
        kge.a(338811729);
    }

    public static /* synthetic */ Object ipc$super(dxz dxzVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ a a(dxz dxzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fc5dfc11", new Object[]{dxzVar}) : dxzVar.l;
    }

    public static /* synthetic */ c b(dxz dxzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9a7ca8fd", new Object[]{dxzVar}) : dxzVar.m;
    }

    public static /* synthetic */ DetailListView.b c(dxz dxzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailListView.b) ipChange.ipc$dispatch("8f415405", new Object[]{dxzVar}) : dxzVar.k;
    }

    public dxz(Activity activity) {
        super(activity);
        this.f = new ArrayList();
        this.k = null;
        emu.a("com.taobao.android.detail.core.detail.controller.DetailBaseMainController");
        this.f27080a = activity;
        this.b = (DetailListView) d.b(this.f27080a, R.layout.x_detail_main_top);
        this.b.setDivider(null);
        int i = 0;
        this.b.setDividerHeight(0);
        this.b.setDescendantFocusability(393216);
        this.g = new Handler(Looper.getMainLooper());
        this.d = new PullToRefreshFeature(this.f27080a);
        this.d.enablePullDownToRefresh(false, null);
        this.e = new PullToRefreshFeatureRV(this.f27080a);
        this.e.enablePullDownToRefresh(false, null);
        this.b.setCoverOffset(com.taobao.android.detail.core.detail.kit.utils.b.a(activity, DetailConstants.f9636a) + (((DetailCoreActivity) activity).c ? ecr.b(activity) : i));
        this.c = new DetailMainViewAdapter(this.f27080a);
        g a2 = n.a(this.f27080a);
        if (a2 != null) {
            a2.a(this.c);
        }
        this.m = new c(this.f27080a, this.b);
        this.n = new DetailListView.a() { // from class: tb.dxz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void a(int i2) {
                IDMComponent a3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                i.c(dxz.TAG, "onItemVisible " + i2);
                if (dxz.this.h != null && dxz.this.h.a()) {
                    e a4 = com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h.e(), i2);
                    if (a4 != null) {
                        a4.G_();
                    }
                    if (dxz.a(dxz.this) != null && (a3 = com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h, i2)) != null) {
                        TStudioHelper.a().b((Object) a3);
                        dxz.a(dxz.this).a(i2, a3.getContainerType(), dxz.this.b(a3.getType()));
                    }
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).a(i2);
                } else if (dxz.this.c == null) {
                } else {
                    com.taobao.android.detail.core.detail.kit.view.holder.c componentByPosition = dxz.this.c.getComponentByPosition(i2 - dxz.this.b.getFeatureSize());
                    if (componentByPosition != null) {
                        componentByPosition.G_();
                    }
                    b bVar = (b) dxz.this.c.getItem(i2);
                    if (bVar != null && dxz.a(dxz.this) != null) {
                        if (bVar.component != null) {
                            dxz.a(dxz.this).a(i2, bVar.component.key, bVar.component.ruleId);
                        } else if (bVar.dmComponent != null) {
                            TStudioHelper.a().b((Object) bVar.dmComponent);
                            dxz.a(dxz.this).a(i2, bVar.dmComponent.getContainerType(), dxz.this.b(bVar.dmComponent.getType()));
                        }
                    }
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).a(i2);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void a(int i2, boolean z) {
                IDMComponent a3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i2), new Boolean(z)});
                    return;
                }
                i.c(dxz.TAG, "onItemInvisible " + i2);
                if (dxz.this.h != null && dxz.this.h.a()) {
                    e a4 = com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h.e(), i2);
                    if (a4 != null) {
                        a4.a(true, z);
                    }
                    if (dxz.a(dxz.this) != null && (a3 = com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h, i2)) != null) {
                        TStudioHelper.a().b((Object) a3);
                        dxz.a(dxz.this).a(i2, z, a3.getContainerType(), dxz.this.b(a3.getType()));
                    }
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).a(i2, z);
                } else if (dxz.this.c == null) {
                } else {
                    com.taobao.android.detail.core.detail.kit.view.holder.c componentByPosition = dxz.this.c.getComponentByPosition(i2 - dxz.this.b.getFeatureSize());
                    if (componentByPosition != null) {
                        componentByPosition.a(true, z);
                    }
                    b bVar = (b) dxz.this.c.getItem(i2);
                    if (bVar != null && dxz.a(dxz.this) != null) {
                        if (bVar.component != null) {
                            dxz.a(dxz.this).a(i2, z, bVar.component.key, bVar.component.ruleId);
                        } else if (bVar.dmComponent != null) {
                            TStudioHelper.a().c(bVar.dmComponent);
                            dxz.a(dxz.this).a(i2, z, bVar.dmComponent.getContainerType(), dxz.this.b(bVar.dmComponent.getType()));
                        }
                    }
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).a(i2, z);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void b(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                    return;
                }
                i.c(dxz.TAG, "onItemPartVisible " + i2);
                if (dxz.this.h != null && dxz.this.h.a()) {
                    com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h.e(), i2);
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).b(i2);
                } else if (dxz.this.c == null) {
                } else {
                    dxz.this.c.getComponentByPosition(i2 - dxz.this.b.getFeatureSize());
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).b(i2);
                }
            }

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
            public void c(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
                    return;
                }
                i.c(dxz.TAG, "onItemPartInvisible " + i2);
                if (dxz.this.h != null && dxz.this.h.a()) {
                    com.taobao.android.detail.core.ultronengine.g.a(dxz.this.h.e(), i2);
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).c(i2);
                } else if (dxz.this.c == null) {
                } else {
                    dxz.this.c.getComponentByPosition(i2 - dxz.this.b.getFeatureSize());
                    if (dxz.b(dxz.this) == null) {
                        return;
                    }
                    dxz.b(dxz.this).c(i2);
                }
            }
        };
        this.b.setOnItemStateListener(this.n);
        D_();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (((DetailCoreActivity) this.f27080a).c) {
            i = ecr.b(this.f27080a);
        }
        AliDetailAuraRecyclerView c = this.i.c();
        c.setCoverOffset(com.taobao.android.detail.core.detail.kit.utils.b.a(this.f27080a, DetailConstants.f9636a) + i);
        c.setOnScrollYDistanceChangeListener(this.o);
        this.m.a(this.i);
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{this, fVar});
            return;
        }
        this.h = fVar;
        if (this.h != null) {
            if (((DetailCoreActivity) this.f27080a).c) {
                i = ecr.b(this.f27080a);
            }
            DetailRecyclerView e = this.h.e();
            e.setCoverOffset(com.taobao.android.detail.core.detail.kit.utils.b.a(this.f27080a, DetailConstants.f9636a) + i);
            e.setOnItemStateListener(this.n);
            e.setOnScrollYDistanceChangeListener(this.o);
        }
        this.m.a(this.h);
    }

    public String b(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (str != null && (indexOf = str.indexOf("$")) > 0) {
            return str.substring(indexOf + 1, str.length());
        }
        return null;
    }

    public void a(List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            c cVar = this.m;
            if (cVar != null) {
                cVar.b();
                this.m.a(list);
            }
            this.f = list;
            DetailMainViewAdapter detailMainViewAdapter = this.c;
            if (detailMainViewAdapter != null) {
                detailMainViewAdapter.setDataSource(this.f);
                this.b.reset();
                this.b.setAdapter((ListAdapter) this.c);
            }
            b(list);
        }
    }

    private void b(List<b> list) {
        b next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if ("dinamic_async".equals(next.getType()) && (next instanceof com.taobao.android.detail.core.model.viewmodel.main.b)) {
                com.taobao.android.detail.core.model.viewmodel.main.b bVar = (com.taobao.android.detail.core.model.viewmodel.main.b) next;
                if ("true".equals(bVar.g)) {
                    bVar.a(this.f27080a);
                }
            }
        }
    }

    public void D_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7959c7a2", new Object[]{this});
            return;
        }
        this.o = new DetailListView.b() { // from class: tb.dxz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.b
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                if (dxz.c(dxz.this) != null) {
                    dxz.c(dxz.this).a(i, i2);
                }
                if (dxz.b(dxz.this) == null) {
                    return;
                }
                dxz.b(dxz.this).a(i, i2);
            }
        };
        this.b.setOnScrollYDistanceChangeListener(this.o);
    }

    public void a(DetailListView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39569cb", new Object[]{this, bVar});
        } else {
            this.k = bVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bb1a55", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        View childAt;
        View childAt2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        DetailRecyclerView o = o();
        return (o == null || o.getLayoutManager() == null) ? this.b.getFirstVisiblePosition() == 0 && (childAt = this.b.getChildAt(0)) != null && childAt.getTop() == 0 : ((LinearLayoutManager) o.getLayoutManager()).findFirstVisibleItemPosition() == 0 && (childAt2 = o.getChildAt(0)) != null && childAt2.getTop() == 0;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        View childAt;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (!this.q) {
            Activity activity = this.f27080a;
            String str3 = "";
            if (activity instanceof DetailCoreActivity) {
                DetailCoreActivity detailCoreActivity = (DetailCoreActivity) activity;
                try {
                    str = epo.g().e();
                    try {
                        str2 = detailCoreActivity.y().i().i();
                        try {
                            str3 = detailCoreActivity.y().i().h();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        str2 = str3;
                    }
                } catch (Throwable unused3) {
                }
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.7631564.slide");
                hashMap.put("item_id", str2);
                hashMap.put("seller_id", str3);
                hashMap.put("user_id", str);
                eps.a("Page_Detail", "Page_Detail_Slide", hashMap);
                this.q = true;
            }
            str = str3;
            str2 = str;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("spm", "a2141.7631564.slide");
            hashMap2.put("item_id", str2);
            hashMap2.put("seller_id", str3);
            hashMap2.put("user_id", str);
            eps.a("Page_Detail", "Page_Detail_Slide", hashMap2);
            this.q = true;
        }
        DetailRecyclerView o = o();
        if (o != null && o.getLayoutManager() != null) {
            return o.getLastVisibleItemPosition() == o.getTotalCount() - 1 && (childAt = o.getChildAt(o.getChildCount() - 1)) != null && childAt.getBottom() <= o.getHeight();
        }
        if (this.b.getLastVisiblePosition() == this.b.getCount() - 1) {
            DetailListView detailListView = this.b;
            View childAt2 = detailListView.getChildAt(detailListView.getChildCount() - 1);
            if (childAt2 != null && childAt2.getBottom() <= this.b.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        DetailRecyclerView o = o();
        if (o != null) {
            return o.getMeasuredHeight();
        }
        return this.b.getMeasuredHeight();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DetailRecyclerView o = o();
        if (o != null && o.getAdapter() != null) {
            if (o.getAdapter().getItemCount() <= 0) {
                return;
            }
            if (z) {
                if (i == Integer.MAX_VALUE) {
                    if (b(this.f27080a, o)) {
                        return;
                    }
                    o.smoothScrollToPosition(o.getTotalCount() - 1);
                    return;
                }
                o.smoothScrollToPosition(i);
            } else if (i == Integer.MAX_VALUE) {
                if (a(this.f27080a, o)) {
                    return;
                }
                o.getLayoutManager().scrollToPosition(o.getTotalCount() - 1);
            } else if (i == 0 && s.b()) {
                o.getLayoutManager().smoothScrollToPosition(o, null, 0);
            } else if (i == 0 && eme.a(this.f27080a)) {
                o.getLayoutManager().smoothScrollToPosition(o, null, 0);
            } else {
                o.getLayoutManager().scrollToPosition(i);
            }
        } else if (this.b.getCount() <= 0) {
        } else {
            if (z) {
                if (i == Integer.MAX_VALUE) {
                    DetailListView detailListView = this.b;
                    detailListView.smoothScrollToPosition(detailListView.getCount() - 1);
                    return;
                }
                this.b.smoothScrollToPosition(i);
            } else if (i == Integer.MAX_VALUE) {
                DetailListView detailListView2 = this.b;
                detailListView2.setSelection(detailListView2.getCount() - 1);
            } else {
                this.b.setSelection(i);
            }
        }
    }

    private boolean a(Activity activity, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0dee4ec", new Object[]{this, activity, recyclerView})).booleanValue();
        }
        if (!n()) {
            return false;
        }
        recyclerView.scrollBy(0, Integer.MAX_VALUE);
        return true;
    }

    private boolean b(Activity activity, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca060ad", new Object[]{this, activity, recyclerView})).booleanValue();
        }
        if (!n()) {
            return false;
        }
        recyclerView.smoothScrollBy(0, Integer.MAX_VALUE);
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this});
        }
        DetailRecyclerView o = o();
        if (o != null) {
            this.p = o;
            return this.p;
        } else if (com.taobao.android.detail.core.performance.g.b(this.f27080a)) {
            this.p = this.b;
            return this.p;
        } else {
            View view = this.p;
            if (view != null) {
                return view;
            }
            this.p = this.b;
            return this.p;
        }
    }

    public f l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("b43eb712", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DetailRecyclerView o = o();
        if (o != null) {
            o.smoothScrollBy(0, i2 * 3);
        } else {
            this.b.smoothScrollBy(i2, 10);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DetailRecyclerView o = o();
        if (o != null) {
            o.onScroll(i);
        } else {
            this.b.onScroll(i);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f fVar = this.h;
        if (fVar != null && fVar.a()) {
            DetailRecyclerView e = this.h.e();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) e.getLayoutManager();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                e a2 = com.taobao.android.detail.core.ultronengine.g.a(this.h.e(), findFirstVisibleItemPosition - e.getHeaderViewsCount());
                if (a2 != null) {
                    a2.G_();
                }
            }
        } else if (this.c != null) {
            int lastVisibleItem = this.b.getLastVisibleItem();
            for (int firstVisibleItem = this.b.getFirstVisibleItem(); firstVisibleItem <= lastVisibleItem; firstVisibleItem++) {
                com.taobao.android.detail.core.detail.kit.view.holder.c componentByPosition = this.c.getComponentByPosition(firstVisibleItem - this.b.getFeatureSize());
                if (componentByPosition != null) {
                    componentByPosition.G_();
                }
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        f fVar = this.h;
        if (fVar != null && fVar.a()) {
            DetailRecyclerView e = this.h.e();
            for (int i = 0; i <= e.getItemCount(); i++) {
                e a2 = com.taobao.android.detail.core.ultronengine.g.a(this.h.e(), i);
                if (a2 != null) {
                    a2.a(z, z2);
                }
            }
            return;
        }
        DetailMainViewAdapter detailMainViewAdapter = this.c;
        if (detailMainViewAdapter == null || detailMainViewAdapter.getComponentList() == null) {
            return;
        }
        Iterator<com.taobao.android.detail.core.detail.kit.view.holder.c> it = this.c.getComponentList().iterator();
        while (it.hasNext()) {
            com.taobao.android.detail.core.detail.kit.view.holder.c next = it.next();
            if (next instanceof com.taobao.android.detail.core.detail.kit.view.holder.c) {
                next.a(z, z2);
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f fVar = this.h;
        if (fVar != null && fVar.a()) {
            DetailRecyclerView e = this.h.e();
            for (int i = 0; i <= e.getItemCount(); i++) {
                com.taobao.android.detail.core.ultronengine.g.a(this.h.e(), i);
            }
            return;
        }
        DetailMainViewAdapter detailMainViewAdapter = this.c;
        if (detailMainViewAdapter == null || detailMainViewAdapter.getComponentList() == null) {
            return;
        }
        Iterator<com.taobao.android.detail.core.detail.kit.view.holder.c> it = this.c.getComponentList().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DetailMainViewAdapter detailMainViewAdapter = this.c;
        if (detailMainViewAdapter != null) {
            detailMainViewAdapter.destroy();
        }
        c cVar = this.m;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        } else if (aVar == null) {
        } else {
            bVar.a();
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        Activity activity = this.f27080a;
        if (!(activity instanceof DetailCoreActivity)) {
            return false;
        }
        return ((DetailCoreActivity) activity).F();
    }

    public DetailRecyclerView o() {
        dwk dwkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailRecyclerView) ipChange.ipc$dispatch("e2c43886", new Object[]{this});
        }
        f fVar = this.h;
        if (fVar != null && fVar.a()) {
            return this.h.e();
        }
        if (n() && (dwkVar = this.i) != null) {
            return dwkVar.c();
        }
        return null;
    }
}
