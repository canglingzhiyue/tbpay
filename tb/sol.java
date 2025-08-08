package tb;

import android.content.Context;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.communication.d;
import com.taobao.android.detail.ttdetail.communication.g;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.o;
import com.taobao.android.detail.ttdetail.component.module.w;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.b;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.c;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class sol extends o<ezg> implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TTDetailScrollerLayout f33768a;
    private Context b;
    private eyx c;
    private TTDetailScrollerLayout.a d;
    private w e;
    private soy f;
    private int g;
    private int h;
    private a i;
    private boolean j;
    private List<String> k;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);
    }

    static {
        kge.a(-983264647);
        kge.a(-767194759);
    }

    public static /* synthetic */ Object ipc$super(sol solVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(sol solVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff208748", new Object[]{solVar});
        } else {
            solVar.d();
        }
    }

    public static /* synthetic */ boolean a(sol solVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4f11490", new Object[]{solVar, new Boolean(z)})).booleanValue();
        }
        solVar.j = z;
        return z;
    }

    public static /* synthetic */ void b(sol solVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cede2b", new Object[]{solVar, new Boolean(z)});
        } else {
            solVar.a(z);
        }
    }

    public static /* synthetic */ boolean b(sol solVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eda38dcd", new Object[]{solVar})).booleanValue() : solVar.j;
    }

    public static /* synthetic */ TTDetailScrollerLayout.a c(sol solVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.a) ipChange.ipc$dispatch("9fcb0676", new Object[]{solVar}) : solVar.d;
    }

    public static /* synthetic */ TTDetailScrollerLayout d(sol solVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout) ipChange.ipc$dispatch("7aac614", new Object[]{solVar}) : solVar.f33768a;
    }

    public sol(Context context, eyx eyxVar, ezg ezgVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, ezgVar, dataEntryArr);
        this.h = -1;
        this.j = false;
    }

    public void a(TTDetailScrollerLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbf0154", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f0cd6b", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public sol(View view, Context context, eyx eyxVar, ezg ezgVar, DataEntry... dataEntryArr) {
        this(context, eyxVar, ezgVar, dataEntryArr);
        this.b = context;
        this.c = eyxVar;
        this.f33768a = (TTDetailScrollerLayout) view.findViewById(R.id.tt_scrollerLayout);
        this.f33768a.setOnVerticalScrollChangeListener(new TTDetailScrollerLayout.a() { // from class: tb.sol.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.a
            public void a(View view2, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("287d8af9", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                c.a("TTDetailScrollerController", "scrollY:" + i + "oldScrollY:" + i2);
                sol.a(sol.this);
                if (i != i2) {
                    sol solVar = sol.this;
                    if (i - i2 <= 0) {
                        z = false;
                    }
                    sol.a(solVar, z);
                }
                sol solVar2 = sol.this;
                sol.b(solVar2, sol.b(solVar2));
                if (sol.c(sol.this) == null) {
                    return;
                }
                sol.c(sol.this).a(view2, i, i2, i3);
            }
        });
        a(context);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.f33768a;
        if (tTDetailScrollerLayout != null) {
            return tTDetailScrollerLayout.isScrollTop();
        }
        return true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f33768a != null) {
            int e = e();
            int scrollY = this.f33768a.getScrollY() + this.f33768a.getPaddingTop() + e;
            int childCount = this.f33768a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f33768a.getChildAt(i);
                if (childAt != null && childAt.getTop() <= scrollY && childAt.getBottom() > scrollY) {
                    if (this.f == null) {
                        return;
                    }
                    x j = b.j(childAt);
                    if (j != null) {
                        String f = j.f();
                        if (StringUtils.isEmpty(f)) {
                            f = c(i);
                        }
                        if ("header".equals(f)) {
                            for (int size = this.k.size() - 1; size >= 0; size--) {
                                String str = this.k.get(size);
                                int a2 = g().a(str);
                                int scrollY2 = this.f33768a.getScrollY();
                                c.a("TTDetailScrollerController", "rateTopOffset:" + a2 + "mainScreenOffset:" + scrollY2 + "height:" + e + "scrollY:" + scrollY2);
                                if (scrollY2 == 0 && (a2 == -1 || a2 - e > 0)) {
                                    this.f.a("header");
                                    return;
                                } else if ((scrollY2 - a2) + e > 0) {
                                    this.f.a(str);
                                    return;
                                }
                            }
                            this.f.a("header");
                            return;
                        }
                        this.f.a(f);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private String c(int i) {
        x j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            View childAt = this.f33768a.getChildAt(i2);
            if (childAt != null && (j = b.j(childAt)) != null) {
                String f = j.f();
                if (!StringUtils.isEmpty(f)) {
                    return f;
                }
            }
        }
        return "";
    }

    private int e() {
        soy soyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        if (this.g == 0 && (soyVar = this.f) != null) {
            this.g = soyVar.a();
        }
        if (e.a(this.b)) {
            this.g = 1;
        }
        return this.g;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.f33768a;
        if (tTDetailScrollerLayout == null) {
            return;
        }
        final int size = tTDetailScrollerLayout.getNonGoneChildren().size();
        int scrollY = this.f33768a.getScrollY();
        for (final int i = 0; i < size; i++) {
            View childAt = this.f33768a.getChildAt(i);
            boolean a2 = a(childAt);
            x j = b.j(childAt);
            if (j != null) {
                if (j.f10569a != a2) {
                    if (a2) {
                        j.didAppear();
                    } else {
                        j.a(true, z);
                    }
                    if (!(j instanceof w)) {
                        com.taobao.android.detail.ttdetail.behavior.b.a(this.b, bq.a(j), a2 ? 1 : 2);
                    }
                    j.f10569a = a2;
                }
                if (j instanceof syh) {
                    syh syhVar = (syh) j;
                    syhVar.b(childAt.getTop() - this.f33768a.getScrollY());
                    syhVar.a(new ojv() { // from class: tb.sol.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ojv
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            for (int i2 = size - 1; i2 >= (size - 1) - i; i2--) {
                                x j2 = b.j(sol.d(sol.this).getChildAt(i2));
                                if (j2 instanceof com.taobao.android.detail.ttdetail.skeleton.recommend.a) {
                                    j2.a();
                                    return;
                                }
                            }
                        }
                    });
                }
                c.a("TTDetailScrollerController", "第" + i + "个View visible:" + a2);
                if (this.h != i && scrollY >= childAt.getTop() && scrollY < childAt.getBottom()) {
                    a aVar = this.i;
                    if (aVar != null) {
                        aVar.a(this.h, i);
                    }
                    this.h = i;
                }
            }
        }
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        return view.getGlobalVisibleRect(rect) && rect.width() > 0 && rect.height() > 0;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.f33768a;
        if (tTDetailScrollerLayout == null) {
            return;
        }
        tTDetailScrollerLayout.getNonGoneChildren();
        this.f33768a.scrollToChild(this.f33768a.getChildAt(i));
    }

    public void a(pir pirVar) {
        x xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b02a9f", new Object[]{this, pirVar});
            return;
        }
        int childCount = this.f33768a.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                x j = b.j(this.f33768a.getChildAt(i));
                if (j != null) {
                    b(j);
                    if (!(j instanceof w)) {
                        j.destroy();
                    }
                }
            }
            this.f33768a.removeAllViews();
        }
        qpk h = pirVar.h();
        if (h == null) {
            return;
        }
        qms d = pirVar.h().d();
        this.f = (soy) (d != null ? d.a(this.c.d()) : null);
        soy soyVar = this.f;
        if (soyVar != null) {
            this.k = a(soyVar.b());
        }
        for (Map.Entry<String, qms> entry : h.c().entrySet()) {
            if ("mainScreen".equals(entry.getKey())) {
                xVar = (x) this.c.b().a("mainScreen");
            } else {
                xVar = (x) entry.getValue().a(this.c.d());
            }
            if (xVar != null) {
                a(xVar);
                this.f33768a.addNestedComponent(xVar);
                List<String> list = this.k;
                if (list != null && !list.isEmpty() && !StringUtils.isEmpty(xVar.f())) {
                    this.k.remove(xVar.f());
                }
            }
        }
        this.f33768a.post(new Runnable() { // from class: tb.sol.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                sol.b(sol.this, false);
                sol.a(sol.this);
            }
        });
    }

    private ArrayList<String> a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e0eee6b3", new Object[]{this, list});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(context, DescNativeController.a.class, this);
        com.taobao.android.detail.ttdetail.communication.c.a(context, soc.class, this);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.b, DescNativeController.a.class);
        com.taobao.android.detail.ttdetail.communication.c.a(this.b, soc.class);
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar instanceof DescNativeController.a) {
            String a2 = ((DescNativeController.a) dVar).a();
            if ("adjust".equals(a2) || AbsListWidgetInstance.KEY_SECTION_EXPAND.equals(a2)) {
                this.f33768a.checkTargetsScroll(true, true);
            } else if ("native".equals(a2) || "web".equals(a2)) {
                this.f33768a.fixTargetsScroll(true);
            } else {
                this.f33768a.checkTargetsScroll(false, true);
            }
            return true;
        }
        if (dVar instanceof soc) {
            String str = ((soc) dVar).f33763a;
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            this.f33768a.stopScroll();
            int size = this.f33768a.getNonGoneChildren().size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                View childAt = this.f33768a.getChildAt(i);
                x j = b.j(childAt);
                if (j != null) {
                    String f = j.f();
                    if (!StringUtils.isEmpty(f) && childAt.getVisibility() != 8) {
                        int e = i == 0 ? 0 : e();
                        if (str.equals(f)) {
                            this.f33768a.scrollToChildWithOffset(childAt, e);
                            break;
                        }
                    }
                }
                i++;
            }
            if (!z) {
                for (int i2 = 0; i2 < size; i2++) {
                    View childAt2 = this.f33768a.getChildAt(i2);
                    x j2 = b.j(childAt2);
                    if (j2 != null && childAt2.getVisibility() != 8 && j2.a(this.f33768a, str, e())) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private w g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("c7b5ea06", new Object[]{this});
        }
        if (this.e == null) {
            this.e = (w) this.c.b().a("mainScreen");
        }
        return this.e;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.f33768a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TTDetailScrollerLayout tTDetailScrollerLayout = this.f33768a;
        if (tTDetailScrollerLayout == null) {
            return;
        }
        int size = tTDetailScrollerLayout.getNonGoneChildren().size();
        for (int i = 0; i < size; i++) {
            x j = b.j(this.f33768a.getChildAt(i));
            if (j != null) {
                j.f10569a = false;
                j.a(false, false);
                if (!(j instanceof w)) {
                    com.taobao.android.detail.ttdetail.behavior.b.a(this.b, bq.a(j), 2);
                }
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f33768a == null) {
        } else {
            a(false);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        f();
    }
}
