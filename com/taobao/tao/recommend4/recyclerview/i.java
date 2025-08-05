package com.taobao.tao.recommend4.recyclerview;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.List;
import tb.gbg;
import tb.kge;
import tb.ksk;
import tb.lap;
import tb.myb;
import tb.ope;
import tb.ott;
import tb.otu;
import tb.otv;

/* loaded from: classes8.dex */
public class i extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<ksk> f20992a;
    private ksk b;
    private List<ott> c;
    private int d;
    private List<SectionModel> e;
    private int f = -1;
    private ViewPager.OnPageChangeListener g;
    private ViewPager h;

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i < 0) {
            return true;
        }
        return !(i == 0) || !(i2 == 0);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
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

    public static /* synthetic */ void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b25942", new Object[]{iVar});
        } else {
            iVar.b();
        }
    }

    public static /* synthetic */ void a(i iVar, ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f482b3f", new Object[]{iVar, childRecyclerView, new Integer(i)});
        } else {
            iVar.a(childRecyclerView, i);
        }
    }

    public static /* synthetic */ ViewPager b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("4c7dd32f", new Object[]{iVar}) : iVar.h;
    }

    static {
        kge.a(718772962);
        ArrayList arrayList = new ArrayList(3);
        f20992a = arrayList;
        arrayList.add(ksk.REC_ORDER_LIST_CATAPULT);
        f20992a.add(ksk.REC_PAY_SUCCESS);
        f20992a.add(ksk.REC_CART);
        f20992a.add(ksk.REC_ORDER_LIST);
        f20992a.add(ksk.REC_ORDER_DETAIL);
        f20992a.add(ksk.REC_LOGISTICS);
        f20992a.add(ksk.REC_CONFIRM_RECEIPT);
    }

    public i(ksk kskVar) {
        a(kskVar);
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
            return;
        }
        this.b = kskVar;
        if (f20992a.contains(kskVar)) {
            this.c = new ArrayList(2);
            this.c.add(new otu(kskVar.c, kskVar.f30287a));
            this.c.add(new otv(kskVar.c, kskVar.f30287a));
            return;
        }
        this.c = null;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (!(recyclerView instanceof ChildRecyclerView)) {
            return;
        }
        d((ChildRecyclerView) recyclerView);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i != 0 || !(recyclerView instanceof ChildRecyclerView)) {
            return;
        }
        d((ChildRecyclerView) recyclerView);
    }

    public void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (!(recyclerView instanceof ChildRecyclerView)) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onWindowVisibilityChanged, view not ChildRecyclerView, discard");
        } else if (i == 0 && !a(recyclerView)) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onWindowVisibilityChanged, view not onScreen, discard");
        } else {
            a((ChildRecyclerView) recyclerView, i);
        }
    }

    public void a(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd60b96a", new Object[]{this, childRecyclerView});
        } else {
            b(childRecyclerView);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.recommend4.recyclerview.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(i.this);
                    }
                }
            }, 0L);
        }
    }

    private void b(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d659eb", new Object[]{this, childRecyclerView});
        } else if (!d()) {
        } else {
            if (this.g != null) {
                lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "already register viewPager listener, discard");
                return;
            }
            this.h = c(childRecyclerView);
            if (this.h == null) {
                lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "viewPager is null, discard");
                return;
            }
            this.g = e(childRecyclerView);
            this.h.addOnPageChangeListener(this.g);
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "register viewPager listener success");
        }
    }

    private void b() {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!d() || (onPageChangeListener = this.g) == null || (viewPager = this.h) == null) {
        } else {
            viewPager.removeOnPageChangeListener(onPageChangeListener);
            this.g = null;
            this.h = null;
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "remove viewPager listener success");
        }
    }

    private void a(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb6e6d9", new Object[]{this, childRecyclerView, new Integer(i)});
        } else if (!a(this.f, i)) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, visible not change, discard. current=" + this.f);
        } else {
            this.f = i;
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, change visibility to " + i);
            if (i == 0) {
                lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, start calculate");
                d(childRecyclerView);
                return;
            }
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "changeVisibility, start leave");
            c();
        }
    }

    private ViewPager c(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("a48553d8", new Object[]{this, childRecyclerView});
        }
        if (childRecyclerView == null) {
            return null;
        }
        myb nestedScrollParent = childRecyclerView.getNestedScrollParent();
        if (!(nestedScrollParent instanceof ViewGroup)) {
            return null;
        }
        ViewParent viewParent = (ViewGroup) nestedScrollParent;
        while (viewParent != null) {
            viewParent = viewParent.getParent();
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "getViewPager, target:" + viewParent.getClass().getSimpleName());
            if (viewParent instanceof ViewPager) {
                return (ViewPager) viewParent;
            }
            if (viewParent instanceof ViewGroup) {
                if (viewParent instanceof ViewPager.DecorView) {
                    break;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private boolean a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4660659a", new Object[]{this, recyclerView})).booleanValue();
        }
        if (recyclerView != null && recyclerView.getContext() != null && recyclerView.isShown()) {
            int[] iArr = new int[2];
            recyclerView.getLocationOnScreen(iArr);
            if (iArr[0] >= 0 && iArr[0] <= gbg.b(recyclerView.getContext())) {
                return true;
            }
        }
        return false;
    }

    private void d(ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc19aed", new Object[]{this, childRecyclerView});
        } else if (this.c != null) {
            this.d = b((RecyclerView) childRecyclerView);
            if (this.d == Integer.MAX_VALUE) {
                return;
            }
            for (ott ottVar : this.c) {
                ottVar.b(childRecyclerView, this.d);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<ott> list = this.c;
        if (list == null) {
            return;
        }
        for (ott ottVar : list) {
            ottVar.c();
        }
    }

    private int b(RecyclerView recyclerView) {
        String str;
        ope f;
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e101280a", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null || (f = com.taobao.tao.homepage.d.f((str = this.b.f30287a))) == null || (c = f.c(str)) == null) {
            return Integer.MAX_VALUE;
        }
        List<SectionModel> sections = c.getSections();
        if (this.e == sections) {
            return this.d;
        }
        this.e = sections;
        if (sections == null || sections.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < sections.size(); i++) {
            if (!a(sections.get(i))) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ba04289", new Object[]{this, sectionModel})).booleanValue() : (sectionModel == null || sectionModel.getJSONObject("template") == null || !TextUtils.equals("one", com.taobao.homepage.utils.o.b(sectionModel.getJSONObject("template")))) ? false : true;
    }

    private ViewPager.OnPageChangeListener e(final ChildRecyclerView childRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("8d8f34c6", new Object[]{this, childRecyclerView}) : new ViewPager.OnPageChangeListener() { // from class: com.taobao.tao.recommend4.recyclerview.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                try {
                    lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", "onPageSelected");
                    if (i.b(i.this).findFocus() == childRecyclerView.getNestedScrollParent()) {
                        i.a(i.this, childRecyclerView, 0);
                    } else {
                        i.a(i.this, childRecyclerView, 4);
                    }
                } catch (Throwable th) {
                    lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "RecommendStayTimeListener", th.getMessage());
                }
            }
        };
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b == ksk.REC_ORDER_LIST_CATAPULT || this.b == ksk.REC_ORDER_LIST;
    }
}
