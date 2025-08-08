package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.i;
import java.util.List;
import tb.jxg;
import tb.kge;

/* loaded from: classes6.dex */
public class SlideContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SlideViewPager viewPager;

    static {
        kge.a(1005353985);
    }

    public static /* synthetic */ Object ipc$super(SlideContainer slideContainer, String str, Object... objArr) {
        if (str.hashCode() == 1621401666) {
            super.invalidate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SlideContainer(Context context) {
        super(context);
        this.viewPager = new SlideViewPager(context);
        addView(this.viewPager, new FrameLayout.LayoutParams(-1, -1));
    }

    public void mount(ViewPager.OnPageChangeListener onPageChangeListener, MUSDKInstance mUSDKInstance, List<i> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075b2b8", new Object[]{this, onPageChangeListener, mUSDKInstance, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
            return;
        }
        updateEffect(jSONObject);
        this.viewPager.removeOnPageChangeListener(onPageChangeListener);
        this.viewPager.addOnPageChangeListener(onPageChangeListener);
        this.viewPager.mount(mUSDKInstance, list, z, z2, z3, i, i2, i3);
    }

    public void unmount(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939d4f05", new Object[]{this, onPageChangeListener});
            return;
        }
        this.viewPager.removeOnPageChangeListener(onPageChangeListener);
        this.viewPager.unmount();
        this.viewPager.setOffscreenPageLimit(1);
        this.viewPager.setClipChildren(true);
        this.viewPager.setPageTransformer(false, null);
        setClipChildren(true);
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue() : this.viewPager.isTouching();
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.viewPager.resetTouching();
        }
    }

    public void scrollTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f85320", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.viewPager.scrollTo(i, z);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.viewPager.setScrollable(z);
        }
    }

    public void setInfinite(List<i> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91604f86", new Object[]{this, list, new Boolean(z)});
        } else {
            this.viewPager.setInfinite(list, z);
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.setIndex(i);
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.setInterval(i);
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.viewPager.setAutoPlay(z);
        }
    }

    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue() : this.viewPager.getRealPosition(i);
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.updateState(i);
        }
    }

    public void updateEffect(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2aebcf", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.viewPager.setPageTransformer(false, null);
        } else {
            String string = jSONObject.getString("type");
            if (StringUtils.isEmpty(string)) {
                this.viewPager.setPageTransformer(false, null);
                return;
            }
            char c = 65535;
            if (string.hashCode() == 109250890 && string.equals("scale")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            this.viewPager.setPageTransformer(false, new jxg(jSONObject.getJSONObject("param")));
        }
    }

    public void refresh(MUSDKInstance mUSDKInstance, List<i> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7525e", new Object[]{this, mUSDKInstance, list, new Integer(i)});
        } else {
            this.viewPager.refresh(mUSDKInstance, list, i);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        super.invalidate();
        if (!(getParent() instanceof MUSNodeHost)) {
            return;
        }
        ((MUSNodeHost) getParent()).invalidateChild(this);
    }
}
