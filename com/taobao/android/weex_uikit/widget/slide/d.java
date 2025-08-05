package com.taobao.android.weex_uikit.widget.slide;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.i;
import java.util.ArrayList;
import java.util.List;
import tb.jwu;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16212a;
    public MUSDKInstance c;
    public boolean d;
    private boolean e;
    public List<i> b = new ArrayList(0);
    private int f = -1;

    static {
        kge.a(1742582479);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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

    public d(MUSDKInstance mUSDKInstance) {
        this.c = mUSDKInstance;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(List<i> list, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.f16212a = 0;
        this.b.clear();
        if (list != null) {
            this.b.addAll(list);
            if (!z || list.size() <= 2) {
                z2 = false;
            }
            this.d = z2;
        } else {
            this.d = false;
        }
        notifyDataSetChanged();
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.d) {
            return i;
        }
        if (i == 0) {
            return a() - 1;
        }
        if (i != getCount() - 1) {
            return i - 1;
        }
        return 0;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f16212a = i;
        }
    }

    public void a(ViewPager viewPager, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce2f245", new Object[]{this, viewPager, new Integer(i), new Boolean(z)});
        } else if (this.f16212a != 0) {
        } else {
            if (i < 0 || i >= a()) {
                g.a("[Slide]: scrollTo position is beyond bounds");
            } else if (!this.d) {
                viewPager.setCurrentItem(i, z);
            } else if (i == a(viewPager.getCurrentItem())) {
            } else {
                viewPager.setCurrentItem(i + 1, z);
            }
        }
    }

    public void a(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f8e6f", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= a()) {
            g.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem(i + 1, false);
        } else {
            viewPager.setCurrentItem(i, false);
        }
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f16212a != 0) {
            return false;
        }
        return this.d || i < getCount() - 1;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.d) {
            return this.b.size() + 2;
        }
        return this.b.size();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
    }

    private i d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("ff723b27", new Object[]{this, new Integer(i)}) : this.b.get(a(i));
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        MUSView a2 = jwu.a(this.c);
        if (m.c()) {
            a2.setTag("slide-child-" + i);
        }
        a2.setRoot(false);
        i d = d(i);
        if (d.g() != null) {
            d.g().release(true);
        }
        a2.setUiNodeTree(d);
        Object tag = this.c.getTag("enableSlidePreciseExpose");
        if (tag == null || !TextUtils.equals(tag.toString(), "true")) {
            a2.setScrollObserverEnabled(false);
        }
        viewGroup.addView(a2);
        return a2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        b((ViewPager) viewGroup, i);
    }

    public void b(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71afb970", new Object[]{this, viewPager, new Integer(i)});
        } else if (this.f == i) {
        } else {
            this.f = i;
            if (viewPager.getChildCount() == 0 || !this.e || !viewPager.beginFakeDrag()) {
                return;
            }
            viewPager.fakeDragBy(0.0f);
            viewPager.endFakeDrag();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        MUSView mUSView = (MUSView) obj;
        if (mUSView == null) {
            return;
        }
        mUSView.setTag(null);
        viewGroup.removeView(mUSView);
        jwu.a(mUSView);
    }

    public void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
        } else if (!this.d) {
        } else {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem == 0) {
                viewPager.setCurrentItem(getCount() - 2, false);
            } else if (currentItem != getCount() - 1) {
            } else {
                viewPager.setCurrentItem(1, false);
            }
        }
    }
}
