package tb;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class pgt extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f32643a;

    static {
        kge.a(1311948460);
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

    public pgt(ArrayList<View> arrayList) {
        this.f32643a = arrayList;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f32643a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        View view = this.f32643a.get(i);
        if (view != null) {
            viewGroup.removeView(view);
            viewGroup.addView(view);
        }
        return view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.f32643a;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }
}
