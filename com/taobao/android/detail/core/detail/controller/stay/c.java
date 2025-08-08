package com.taobao.android.detail.core.detail.controller.stay;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView;
import com.taobao.android.detail.core.detail.popup.g;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.dwk;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements DetailListView.a, DetailListView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ListView e;
    private DetailRecyclerView f;
    private f g;
    private AliDetailAuraRecyclerView h;
    private dwk i;
    private int k;
    private boolean l;
    private a m;
    private boolean n;
    private boolean o;
    private int p;
    private final int[] b = new int[2];
    private final int[] c = new int[2];
    private final int[] d = new int[2];
    private HashMap<Integer, b> j = new HashMap<>();
    private final int q = 500;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<b> f9470a = new ArrayList<>();
    private ViewTreeObserver.OnScrollChangedListener r = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.taobao.android.detail.core.detail.controller.stay.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            } else if (c.a(c.this) == null) {
            } else {
                c.b(c.this);
            }
        }
    };

    static {
        kge.a(1498133464);
        kge.a(-2067882672);
        kge.a(906171325);
    }

    public static /* synthetic */ a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e48b903e", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7ced51", new Object[]{cVar});
        } else {
            cVar.d();
        }
    }

    public c(Context context, ListView listView) {
        this.e = listView;
        c();
        this.p = g.a(context);
        emu.a("com.taobao.android.detail.core.detail.controller.stay.StayManager");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.j.clear();
        }
    }

    public void a(List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && this.m != null) {
            ArrayList arrayList = new ArrayList();
            for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : list) {
                if (bVar != null && !StringUtils.isEmpty(bVar.stayType)) {
                    arrayList.add(bVar);
                }
            }
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{this, fVar});
            return;
        }
        this.g = fVar;
        if (fVar == null) {
            this.f = null;
            return;
        }
        this.f = fVar.e();
        DetailRecyclerView detailRecyclerView = this.f;
        if (detailRecyclerView == null) {
            return;
        }
        detailRecyclerView.getViewTreeObserver().addOnScrollChangedListener(this.r);
    }

    public void a(dwk dwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f81da0", new Object[]{this, dwkVar});
            return;
        }
        this.i = dwkVar;
        if (dwkVar == null) {
            this.h = null;
            return;
        }
        this.h = dwkVar.c();
        this.h.getViewTreeObserver().addOnScrollChangedListener(this.r);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e.getViewTreeObserver().addOnScrollChangedListener(this.r);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 0 || i == i2) {
        } else {
            this.l = true;
            if (i - i2 > 0) {
                this.n = false;
            } else {
                this.n = true;
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
    public void a(int i) {
        Object item;
        com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.m;
        if (aVar != null) {
            aVar.a(i);
        }
        DetailRecyclerView detailRecyclerView = this.f;
        if (detailRecyclerView != null) {
            if (detailRecyclerView.getAdapter() == null) {
                return;
            }
            try {
                List<IDMComponent> f = this.g.c().k().f();
                if (i < 0 || i >= f.size() || StringUtils.isEmpty(a(f.get(i)))) {
                    return;
                }
                DetailRecyclerView detailRecyclerView2 = this.f;
                View childAt = detailRecyclerView2.getChildAt(i - ((LinearLayoutManager) detailRecyclerView2.getLayoutManager()).findFirstVisibleItemPosition());
                if (childAt == null) {
                    return;
                }
                this.j.put(Integer.valueOf(i), new b(null, childAt));
                return;
            } catch (Throwable th) {
                i.a("StayManager", "onItemVisible", th);
                return;
            }
        }
        ListView listView = this.e;
        if (listView == null || listView.getAdapter() == null || (item = this.e.getAdapter().getItem(i)) == null || !(item instanceof com.taobao.android.detail.datasdk.model.viewmodel.main.b) || (bVar = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) item) == null || StringUtils.isEmpty(bVar.stayType)) {
            return;
        }
        try {
            ListView listView2 = this.e;
            View childAt2 = listView2.getChildAt(i - listView2.getFirstVisiblePosition());
            if (childAt2 == null) {
                return;
            }
            this.j.put(Integer.valueOf(i), new b(bVar, childAt2));
        } catch (Throwable unused) {
        }
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getFields() != null) {
            return iDMComponent.getFields().getString("stayType");
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.a(i, z);
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.b(i);
    }

    @Override // com.taobao.android.detail.core.detail.widget.listview.DetailListView.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.m;
        if (aVar == null) {
            return;
        }
        aVar.c(i);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        HashMap<Integer, b> hashMap = this.j;
        if (hashMap == null || hashMap.isEmpty() || this.e == null) {
            return;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (!e()) {
            return;
        }
        Object[] array = this.j.keySet().toArray();
        Arrays.sort(array);
        this.f9470a.clear();
        for (int i = 0; i < array.length; i++) {
            b bVar = this.j.get(array[i]);
            bVar.b().getLocationOnScreen(this.b);
            int[] iArr = this.b;
            if (iArr[1] != 0) {
                bVar.f9469a = iArr[1];
            } else {
                DetailRecyclerView detailRecyclerView = this.f;
                if (detailRecyclerView != null) {
                    bVar.f9469a = a(detailRecyclerView, ((Integer) array[i]).intValue());
                } else {
                    bVar.f9469a = a(this.e, ((Integer) array[i]).intValue());
                }
            }
            this.f9470a.add(bVar);
        }
        if (this.m != null) {
            a(f());
        }
        i.d("StayManager", "scrollJudge use time : " + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
    }

    private int a(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd117a0b", new Object[]{this, listView, new Integer(i)})).intValue();
        }
        int firstVisiblePosition = i - this.e.getFirstVisiblePosition();
        listView.getChildAt(0).getLocationOnScreen(this.d);
        if (firstVisiblePosition < 0) {
            return (firstVisiblePosition * 500) + this.d[1];
        }
        int lastVisiblePosition = this.e.getLastVisiblePosition();
        View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int i2 = i - lastVisiblePosition;
        childAt.getLocationOnScreen(this.d);
        if (i2 <= 0) {
            return 0;
        }
        return (i2 * 500) + this.d[1] + childAt.getHeight();
    }

    private int a(DetailRecyclerView detailRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0aab028", new Object[]{this, detailRecyclerView, new Integer(i)})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) detailRecyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = i - linearLayoutManager.findFirstVisibleItemPosition();
        detailRecyclerView.getChildAt(0).getLocationOnScreen(this.d);
        if (findFirstVisibleItemPosition < 0) {
            return (findFirstVisibleItemPosition * 500) + this.d[1];
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        View childAt = detailRecyclerView.getChildAt(detailRecyclerView.getChildCount() - 1);
        int i2 = i - findLastVisibleItemPosition;
        childAt.getLocationOnScreen(this.d);
        if (i2 <= 0) {
            return 0;
        }
        return (i2 * 500) + this.d[1] + childAt.getHeight();
    }

    private boolean e() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        DetailRecyclerView detailRecyclerView = this.f;
        if (detailRecyclerView != null) {
            detailRecyclerView.getLocationOnScreen(this.c);
        } else {
            this.e.getLocationOnScreen(this.c);
        }
        int i = this.k;
        int[] iArr = this.c;
        if (i != iArr[1]) {
            if (iArr[1] - i < 0) {
                this.o = false;
            } else {
                this.o = true;
            }
            this.k = this.c[1];
            z = true;
        } else {
            z = false;
        }
        if (!this.l) {
            return z;
        }
        this.l = false;
        return true;
    }

    private boolean a(ContainerLocation containerLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("110e3003", new Object[]{this, containerLocation})).booleanValue();
        }
        if (ContainerLocation.insideScroll == containerLocation) {
            return this.n;
        }
        return this.o;
    }

    private ContainerLocation f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerLocation) ipChange.ipc$dispatch("8fa18544", new Object[]{this});
        }
        ContainerLocation containerLocation = ContainerLocation.reachBottom;
        if (g()) {
            return ContainerLocation.reachTop;
        }
        return h() ? ContainerLocation.insideScroll : containerLocation;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.e == null && this.f == null) {
            return false;
        }
        int[] iArr = this.c;
        return iArr[1] > 0 && iArr[1] < this.p;
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.e != null && this.c[1] == 0;
    }
}
