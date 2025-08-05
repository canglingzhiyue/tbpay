package com.taobao.android.weex_uikit.widget.slide;

import android.support.v4.view.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(5006619);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -1474194546) {
            return new Integer(super.a(((Number) objArr[0]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public e(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public void a(ViewPager viewPager, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce2f245", new Object[]{this, viewPager, new Integer(i), new Boolean(z)});
        } else if (this.f16212a != 0) {
        } else {
            if (i < 0 || i >= a()) {
                g.a("[Slide]: scrollTo position is beyond bounds");
            } else if (!this.d) {
                viewPager.setCurrentItem(getCount() - i, z);
            } else if (i == a(viewPager.getCurrentItem())) {
            } else {
                viewPager.setCurrentItem(i - 1, z);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public void a(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f8e6f", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= a()) {
            g.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem((getCount() - i) - 2, false);
        } else {
            viewPager.setCurrentItem((getCount() - i) - 1, false);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f16212a != 0) {
            return false;
        }
        return this.d || i > 0;
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : (this.b.size() - 1) - super.a(i);
    }
}
