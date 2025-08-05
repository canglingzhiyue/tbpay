package tb;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.util.LruCache;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.as;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.ag;
import com.taobao.android.dinamicx.widget.bi;
import com.taobao.android.dinamicx.y;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public class gbj extends PagerAdapter implements y.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ag b;
    public List<DXWidgetNode> c;
    public as d;
    public Context e;
    public Set<Integer> g;
    public a h;
    public int j;
    public LinkedHashMap<Integer, View> f = new LinkedHashMap<>();
    public LinkedHashMap<Integer, SparseArray<Parcelable>> k = new LinkedHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private boolean f28284a = fqi.aC();
    public final LruCache<Integer, Integer> i = new LruCache<>(fqi.aa());

    static {
        kge.a(-432832422);
        kge.a(-337578759);
    }

    public static /* synthetic */ Object ipc$super(gbj gbjVar, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public gbj(ag agVar, List<DXWidgetNode> list, Context context) {
        this.b = agVar;
        this.c = list;
        this.d = new as(agVar.getDXRuntimeContext().C(), 3, UUID.randomUUID().toString());
        this.e = context;
        d();
        DinamicXEngine.a(this);
    }

    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<DXWidgetNode> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (obj instanceof ViewGroup) {
            a((View) obj, sparseArray);
        }
        this.k.put(Integer.valueOf(i), sparseArray);
        ag agVar = this.b;
        if (agVar != null && this.f28284a && (dXRuntimeContext = agVar.getDXRuntimeContext()) != null && dXRuntimeContext.s() != null && this.b.e() != null && dXRuntimeContext.s().getDxNestedScrollerViewMap() != null && this.b.e().hashCode() == dXRuntimeContext.T()) {
            dXRuntimeContext.s().getDxNestedScrollerViewMap().remove(Integer.valueOf(i));
        }
        viewGroup.removeView((View) obj);
        this.f.remove(Integer.valueOf(i));
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.c == null || this.d == null) {
            return null;
        }
        DXNativeFrameLayout dXNativeFrameLayout = new DXNativeFrameLayout(this.e);
        a(i, dXNativeFrameLayout);
        try {
            a(viewGroup, i, dXNativeFrameLayout);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
        SparseArray<Parcelable> sparseArray = this.k.get(Integer.valueOf(i));
        if (sparseArray != null) {
            b(dXNativeFrameLayout, sparseArray);
        }
        return dXNativeFrameLayout;
    }

    public void a(ViewGroup viewGroup, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e17016", new Object[]{this, viewGroup, new Integer(i), view});
        } else if (i == viewGroup.getChildCount()) {
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        } else if (i < viewGroup.getChildCount()) {
            viewGroup.removeViewAt(i);
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        } else {
            int childCount = i - viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                viewGroup.addView(new View(this.e), new ViewGroup.LayoutParams(-2, -2));
            }
            viewGroup.addView(view, i, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    public void a(ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae7bd7b", new Object[]{this, agVar});
            return;
        }
        this.b = agVar;
        getCount();
        d();
        for (Map.Entry<Integer, View> entry : this.f.entrySet()) {
            DXWidgetNode dXWidgetNode = this.c.get(entry.getKey().intValue());
            View value = entry.getValue();
            if (!(value instanceof ViewGroup) || ((ViewGroup) value).getChildCount() != 0) {
                DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
                int a3 = DXWidgetNode.DXMeasureSpec.a(this.b.getMeasuredWidth(), 1073741824);
                int a4 = DXWidgetNode.DXMeasureSpec.a(this.b.getMeasuredHeight(), 1073741824);
                if (dXWidgetNode instanceof ac) {
                    dXWidgetNode.setLayoutWidth(-1);
                    dXWidgetNode.setLayoutHeight(-1);
                }
                this.d.a(dXWidgetNode, null, value, a2, 2, 9, a3, a4, entry.getKey().intValue());
            }
        }
    }

    public View c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3eadb8db", new Object[]{this, new Integer(i)}) : this.f.get(Integer.valueOf(i));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : e() && this.h.size() + this.g.size() == this.j;
    }

    public void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
        } else if (b()) {
            fuw.d("DXViewPageLimit", "instantiateItem maxPage at " + i + "; renderEmptyView");
            this.f.put(Integer.valueOf(i), view);
        } else {
            b(i, view);
            d(i);
        }
    }

    public void b(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95435e58", new Object[]{this, new Integer(i), view});
            return;
        }
        DXWidgetNode dXWidgetNode = this.c.get(i);
        DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
        s sVar = new s(a2.A());
        sVar.b = a2.c();
        a2.a(sVar);
        int a3 = DXWidgetNode.DXMeasureSpec.a(this.b.getMeasuredWidth(), 1073741824);
        int a4 = DXWidgetNode.DXMeasureSpec.a(this.b.getMeasuredHeight(), 1073741824);
        if (dXWidgetNode instanceof ac) {
            dXWidgetNode.setLayoutWidth(-1);
            dXWidgetNode.setLayoutHeight(-1);
        }
        this.d.a(dXWidgetNode, null, view, a2, 2, 9, a3, a4, i);
        this.f.put(Integer.valueOf(i), view);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        b(viewGroup, i);
        this.i.put(Integer.valueOf(i), Integer.valueOf(i));
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (!e() || this.g.contains(Integer.valueOf(i))) {
        } else {
            this.h.put(Integer.valueOf(i), Integer.valueOf(i));
        }
    }

    public void b(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a0d2db", new Object[]{this, viewGroup, new Integer(i)});
        } else if (i < 0 || i >= getCount() || this.g.contains(Integer.valueOf(i))) {
        } else {
            View c = c(i);
            if ((c instanceof ViewGroup) && ((ViewGroup) c).getChildCount() == 0) {
                if (DinamicXEngine.j()) {
                    fuw.d("DXViewPageLimit", "renderItemViewIfEmpty at " + i);
                }
                View c2 = c(i);
                b(i, c2);
                SparseArray<Parcelable> sparseArray = this.k.get(Integer.valueOf(i));
                if (sparseArray != null) {
                    b(c2, sparseArray);
                }
            }
            if (!e()) {
                return;
            }
            c(viewGroup, i);
        }
    }

    public void c(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4d7e7a", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        a aVar = this.h;
        aVar.f28285a = viewGroup;
        aVar.put(Integer.valueOf(i), Integer.valueOf(i));
        this.h.f28285a = null;
    }

    public void a(ViewGroup viewGroup, Integer num) {
        ViewPager e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7a1270", new Object[]{this, viewGroup, num});
            return;
        }
        ag agVar = this.b;
        if (agVar == null || (e = agVar.e()) == null || num == null || viewGroup == null || num.intValue() == e.getCurrentItem()) {
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXViewPageLimit", "renderItemViewIfEmpty maxPage previous " + num);
        }
        View childAt = viewGroup.getChildAt(num.intValue());
        if (!(childAt instanceof ViewGroup)) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        a(childAt, sparseArray);
        this.k.put(num, sparseArray);
        gbh.a(childAt, (bi) null);
        ((ViewGroup) childAt).removeAllViews();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ag agVar = this.b;
        if (agVar == null) {
            this.g = new HashSet();
            this.j = Integer.MAX_VALUE;
            this.h = new a(this.j);
            return;
        }
        if (agVar.i() != null) {
            this.g = new HashSet(this.b.i());
        } else {
            this.g = new HashSet();
        }
        if (this.j == this.b.h() && this.h != null) {
            return;
        }
        this.j = this.b.h();
        int size = this.j - this.g.size();
        if (size <= 0) {
            size = this.j;
        }
        a aVar = this.h;
        if (aVar == null) {
            this.h = new a(size);
            return;
        }
        aVar.f28285a = this.b.e();
        this.h.resize(size);
        this.h.f28285a = null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.j < getCount();
    }

    public void a(View view, SparseArray<Parcelable> sparseArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a0e64d", new Object[]{this, view, sparseArray});
        } else if (view instanceof fxp) {
            DXWidgetNode b = gbh.b(view);
            if (!(b instanceof DXWidgetNode)) {
                return;
            }
            sparseArray.put(b.getAutoId(), ((fxp) view).onSaveInstanceState());
        } else if (!(view instanceof ViewGroup)) {
        } else {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                a(viewGroup.getChildAt(i), sparseArray);
                i++;
            }
        }
    }

    public void b(View view, SparseArray<Parcelable> sparseArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584a8c6c", new Object[]{this, view, sparseArray});
        } else if (view instanceof fxp) {
            DXWidgetNode b = gbh.b(view);
            if (!(b instanceof DXWidgetNode)) {
                return;
            }
            ((fxp) view).onRestoreInstanceState(sparseArray.get(b.getAutoId()));
        } else if (!(view instanceof ViewGroup)) {
        } else {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                b(viewGroup.getChildAt(i), sparseArray);
                i++;
            }
        }
    }

    /* loaded from: classes5.dex */
    public class a extends LruCache<Integer, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup f28285a;

        static {
            kge.a(2010567861);
        }

        @Override // android.support.v4.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Integer num, Integer num2, Integer num3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), num, num2, num3});
            } else {
                a(z, num, num2, num3);
            }
        }

        public a(int i) {
            super(i);
        }

        public void a(boolean z, Integer num, Integer num2, Integer num3) {
            ViewGroup viewGroup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1deebdeb", new Object[]{this, new Boolean(z), num, num2, num3});
            } else if (!z || (viewGroup = this.f28285a) == null) {
            } else {
                gbj.this.a(viewGroup, num);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.y.a
    public void M_() {
        ViewPager e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b56539", new Object[]{this});
            return;
        }
        ag agVar = this.b;
        if (agVar == null || (e = agVar.e()) == null) {
            return;
        }
        for (int i = 0; i < getCount(); i++) {
            if (this.i.get(Integer.valueOf(i)) == null && i != e.getCurrentItem()) {
                a(e, Integer.valueOf(i));
                this.h.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // com.taobao.android.dinamicx.y.a
    public String N_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0821c8", new Object[]{this});
        }
        if (!DinamicXEngine.j()) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < getCount(); i3++) {
            View c = c(i3);
            if (c instanceof ViewGroup) {
                if (((ViewGroup) c).getChildCount() == 0) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        return "ViewPager itemViewSize: " + i + "; emptyViewSize: " + i2;
    }
}
