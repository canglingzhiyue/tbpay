package com.taobao.pha.core.phacontainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabHeaderModel;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class g extends FragmentPagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18777a;
    private final PageModel b;
    private final AppController c;
    private String d;

    static {
        kge.a(392871249);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 50642664) {
            if (hashCode != 705961164) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.destroyItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        return new Integer(super.getItemPosition(objArr[0]));
    }

    public g(FragmentManager fragmentManager, PageModel pageModel, AppController appController) {
        super(fragmentManager);
        this.f18777a = "ViewPagerAdapter";
        this.b = pageModel;
        this.c = appController;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        PageModel pageModel = this.b;
        if (pageModel == null) {
            return 0;
        }
        return pageModel.frames.size();
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("3c4466d5", new Object[]{this, new Integer(i)});
        }
        PageModel pageModel = this.b;
        if (pageModel == null || pageModel.frames.size() <= 0) {
            z = false;
        }
        ngr.b("ViewPagerAdapter", "FragmentViewPagerAdapter getItem:" + i + ", hasFrames=" + z + ", appController=" + this.c);
        if (!z) {
            return null;
        }
        Bundle bundle = new Bundle();
        PageModel pageModel2 = this.b.frames.get(i);
        bundle.putSerializable("key_page_model", pageModel2);
        TabHeaderModel pageHeader = this.b.getPageHeader();
        if (pageHeader != null) {
            bundle.putBoolean("key_tab_header_enable_scroll_listener", pageHeader.enableScrollListener);
            bundle.putInt("key_tab_header_height", pageHeader.height);
            bundle.putString("key_page_header_position", pageHeader.position);
            bundle.putInt("key_page_frame_index", i);
        }
        AppController appController = this.c;
        if (appController == null) {
            return null;
        }
        bundle.putLong("AppControllerInstanceId", appController.L());
        Fragment instantiate = Fragment.instantiate(this.c.C(), LazyPageFragment.class.getName(), bundle);
        if (instantiate instanceof c) {
            c cVar = (c) instantiate;
            cVar.setPageIndex(pageModel2.pageIndex);
            if (!TextUtils.isEmpty(this.d) && (instantiate instanceof LazyPageFragment)) {
                ((LazyPageFragment) instantiate).setAppearNavigationType(this.d);
            }
            this.c.a(cVar, pageModel2.key);
        }
        return instantiate;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!(obj instanceof LazyPageFragment)) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // android.support.v4.app.FragmentPagerAdapter, android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        PageModel mo1202getPageModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (!(obj instanceof LazyPageFragment) || (mo1202getPageModel = ((LazyPageFragment) obj).mo1202getPageModel()) == null || !TextUtils.equals("low", mo1202getPageModel.priority)) {
        } else {
            ngr.b("ViewPagerAdapter", "destroyItem" + i + " " + obj);
            super.destroyItem(viewGroup, i, obj);
        }
    }
}
