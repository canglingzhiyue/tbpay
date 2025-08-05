package com.taobao.android.detail.core.standard.widget.lightoff.gallery;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.PictureViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.detail.core.standard.widget.lightoff.model.a b;
    private com.taobao.android.detail.core.standard.widget.lightoff.a c;
    private View e;

    /* renamed from: a  reason: collision with root package name */
    public List<LightOffItemModel> f9908a = new ArrayList(10);
    private Map<String, Class<? extends ILightOffViewModel>> d = new HashMap();

    static {
        kge.a(930516939);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 272159538) {
            return super.instantiateItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
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

    public b(com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar) {
        this.b = aVar;
        this.d.put(PictureViewModel.TYPE, PictureViewModel.class);
    }

    public void a(List<LightOffItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.f9908a.clear();
        this.f9908a.addAll(list);
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(this.b.f9909a);
        LightOffItemModel lightOffItemModel = this.f9908a.get(i);
        if (lightOffItemModel == null) {
            return super.instantiateItem(viewGroup, i);
        }
        View a2 = a(lightOffItemModel);
        if (a2 == null) {
            return frameLayout;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(a2, layoutParams);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private View a(LightOffItemModel lightOffItemModel) {
        Map<String, Class<? extends ILightOffViewModel>> map = this.b.f;
        Class<? extends ILightOffViewModel> cls = map != null ? map.get(lightOffItemModel.type) : null;
        if (cls == null) {
            cls = this.d.get(lightOffItemModel.type);
        }
        if (cls == null) {
            return null;
        }
        try {
            ILightOffViewModel newInstance = cls.newInstance();
            View view = newInstance.getView(this.b.f9909a, lightOffItemModel, this.c);
            if (view != null) {
                view.setTag(newInstance);
            }
            return view;
        } catch (Exception e) {
            String a2 = i.a("LightOffGalleryAdapter", BTags.XLightOff);
            com.taobao.android.detail.core.utils.i.a(a2, "createItemView exception:" + e.getMessage());
            return null;
        }
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

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f9908a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (!(obj instanceof ViewGroup)) {
        } else {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            if (viewGroup2.getChildCount() <= 0) {
                return;
            }
            this.e = viewGroup2.getChildAt(0);
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.e;
    }

    public void a(com.taobao.android.detail.core.standard.widget.lightoff.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594596f0", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }
}
