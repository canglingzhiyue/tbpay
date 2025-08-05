package tb;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.component.module.j;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class eyu extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f27662a = 0.0f;
    private float b = 0.0f;
    private float e = 1.0f;
    private final List<h> c = new ArrayList(5);
    private final Map<Integer, LinkedList<View>> d = new ConcurrentHashMap();

    static {
        kge.a(-550374283);
    }

    public static /* synthetic */ Object ipc$super(eyu eyuVar, String str, Object... objArr) {
        if (str.hashCode() == 190603819) {
            return new Float(super.getPageWidth(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public <C extends d> C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        for (h hVar : this.c) {
            C c = (C) hVar.findComponent(str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public <C extends d> C b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e0897dfe", new Object[]{this, str});
        }
        for (h hVar : this.c) {
            C c = (C) hVar.findComponentByUltronName(str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public <F extends h> void a(List<F> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c.clear();
        if (list == null) {
            return;
        }
        this.c.addAll(list);
    }

    public List<h> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public <F extends h> F a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (F) ipChange.ipc$dispatch("e131fea2", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.c.size()) {
            return (F) this.c.get(i);
        }
        return null;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        h hVar = this.c.get(i);
        hVar.setData(a.KEY_COMPONENT_CREATE_INDEX, Integer.valueOf(i));
        hVar.create();
        j frameSize = hVar.getFrameSize(j.a(viewGroup.getWidth(), Integer.MIN_VALUE), j.a(viewGroup.getHeight(), 0));
        int componentViewType = hVar.getComponentViewType();
        View componentView = hVar.getComponentView(a(componentViewType, i));
        componentView.setTag(R.id.tt_detail_view_pager_reused_id, Integer.valueOf(componentViewType));
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.width = frameSize.a();
        layoutParams.height = frameSize.b();
        viewGroup.addView(componentView, layoutParams);
        hVar.willAppear();
        return componentView;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (view.getParent() != null) {
            return;
        }
        Object tag = view.getTag(R.id.tt_detail_view_pager_reused_id);
        if (!(tag instanceof Integer)) {
            return;
        }
        int intValue = ((Integer) tag).intValue();
        view.setTag(R.id.tt_detail_view_pager_reused_position, Integer.valueOf(i));
        a(intValue, view);
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.f27662a = f;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (this.f27662a <= 0.0f) {
            return super.getPageWidth(i);
        }
        if (getCount() == 1 && com.taobao.android.detail.ttdetail.utils.j.O()) {
            return 1.0f;
        }
        h a2 = a(i);
        if (a2 != null) {
            float p = a2.p() / this.f27662a;
            float f = this.e;
            return f + ((p - f) * this.b);
        }
        return super.getPageWidth(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.c.size();
    }

    private void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
        } else if (view == null) {
        } else {
            LinkedList<View> linkedList = this.d.get(Integer.valueOf(i));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.d.put(Integer.valueOf(i), linkedList);
            }
            linkedList.offer(view);
        }
    }

    private View a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c2bbc90a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        LinkedList<View> linkedList = this.d.get(Integer.valueOf(i));
        if (linkedList == null) {
            return null;
        }
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            View view = linkedList.get(size);
            Object tag = view.getTag(R.id.tt_detail_view_pager_reused_position);
            if ((tag instanceof Integer) && i2 == ((Integer) tag).intValue() && linkedList.remove(view) && view.getParent() == null) {
                return view;
            }
        }
        View poll = linkedList.poll();
        if (poll != null && poll.getParent() == null) {
            return poll;
        }
        return null;
    }
}
