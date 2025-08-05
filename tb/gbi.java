package tb;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ag;
import java.util.List;

/* loaded from: classes5.dex */
public class gbi extends gbj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<View> f28283a;

    static {
        kge.a(254821230);
    }

    public static /* synthetic */ Object ipc$super(gbi gbiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        } else if (hashCode != 705961164) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.destroyItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
    }

    @Override // tb.gbj, android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public gbi(ag agVar, List<DXWidgetNode> list, Context context) {
        super(agVar, list, context);
        this.f28283a = new SparseArray<>();
    }

    @Override // tb.gbj, android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        View b = b(i);
        this.f28283a.put(i, b);
        return b;
    }

    @Override // tb.gbj, android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            super.destroyItem(viewGroup, i, obj);
        }
    }

    private String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b92b0f69", new Object[]{this, new Integer(i)});
        }
        return "LazyViewPagerAdapter:" + i;
    }

    public View a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View findViewWithTag = viewGroup.findViewWithTag(e(i));
        if (findViewWithTag == null) {
            findViewWithTag = this.f28283a.get(i);
            b(i, findViewWithTag);
            try {
                a(viewGroup, i, findViewWithTag);
            } catch (Exception e) {
                a.b(e);
            }
            findViewWithTag.setTag(e(i));
            this.f28283a.remove(i);
            SparseArray<Parcelable> sparseArray = this.k.get(Integer.valueOf(i));
            if (sparseArray != null) {
                b(findViewWithTag, sparseArray);
            }
        }
        return findViewWithTag;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : this.f28283a.get(i) != null;
    }

    public View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        if (this.c == null || this.d == null) {
            return null;
        }
        DXWidgetNode dXWidgetNode = this.c.get(i);
        DXNativeFrameLayout dXNativeFrameLayout = new DXNativeFrameLayout(this.e);
        DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
        s sVar = new s(a2.A());
        sVar.b = a2.c();
        a2.a(sVar);
        return dXNativeFrameLayout;
    }

    @Override // tb.gbj, android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        a(viewGroup, i);
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
