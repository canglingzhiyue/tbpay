package com.taobao.android.detail.core.detail.ext.view.widget.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.video.c;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import tb.dys;
import tb.ecf;
import tb.edp;
import tb.emu;
import tb.eno;
import tb.kge;

/* loaded from: classes4.dex */
public class MultiMediaPopupWindow extends FrameLayout implements ViewPager.OnPageChangeListener, CustomViewPager.a, j<DetailEvent>, dys.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GalleryPopupWindow";
    private Activity mActivity;
    public MultiMediaModel mModel;
    public int systemUiVisibilit;

    static {
        kge.a(1553977531);
        kge.a(-1143650222);
        kge.a(1848919473);
        kge.a(154771754);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(MultiMediaPopupWindow multiMediaPopupWindow, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager.a
    public void onPageFirstScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20337d3", new Object[]{this});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public MultiMediaPopupWindow(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.base.MultiMediaPopupWindow");
    }

    public MultiMediaPopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.base.MultiMediaPopupWindow");
    }

    public MultiMediaPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.base.MultiMediaPopupWindow");
    }

    public MultiMediaPopupWindow(Activity activity) {
        super(activity);
        this.mActivity = activity;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setFocusable(true);
        setBackgroundDrawable(new PaintDrawable());
    }

    public void popGallery(View view, int i, int i2, MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5efea96", new Object[]{this, view, new Integer(i), new Integer(i2), multiMediaModel});
            return;
        }
        this.mModel = multiMediaModel;
        this.mModel.mApp = this.mActivity.getApplication();
        showNavigationBar(false);
        d a2 = f.a(this.mActivity);
        if (a2 != null) {
            a2.a(eno.a(DetailEvent.class), this);
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view, new FrameLayout.LayoutParams(i, i2));
        ViewGroup viewGroup = (ViewGroup) this.mActivity.getWindow().getDecorView();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        viewGroup.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // tb.dys.a
    public void onItemChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb11cba", new Object[]{this, new Integer(i)});
        } else {
            ecf.a(this.mActivity, i);
        }
    }

    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
        } else {
            dismissGalleryPopupWindow();
        }
    }

    @Override // com.taobao.android.detail.core.detail.ext.view.widget.base.CustomViewPager.a
    public void onPageLastScrollLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8877511", new Object[]{this});
            return;
        }
        ecf.f(this.mActivity);
        onBack();
        f.a(this.mActivity, new edp());
    }

    public void dismissGalleryPopupWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6183bbb", new Object[]{this});
            return;
        }
        this.mModel.childModels.get(0);
        showNavigationBar(true);
        if (this.mActivity != null && getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        DetailEvent detailEvent = new DetailEvent(2);
        detailEvent.params = this.mModel;
        f.a(this.mActivity, detailEvent);
        Activity activity = this.mActivity;
        if (activity instanceof DetailCoreActivity) {
            ((DetailCoreActivity) activity).b("#4d000000");
        }
        d a2 = f.a(this.mActivity);
        if (a2 != null) {
            a2.b(eno.a(DetailEvent.class), this);
        }
        c.b(this.mActivity, null);
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(DetailEvent detailEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("77124ef6", new Object[]{this, detailEvent});
        }
        if (1 == detailEvent.getEventType()) {
            dismissGalleryPopupWindow();
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void setContentView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4aead0f", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view, new FrameLayout.LayoutParams(i, i2));
    }

    private void showNavigationBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67ca30b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                if (Build.VERSION.SDK_INT < 19) {
                    this.mActivity.getWindow().getDecorView().setSystemUiVisibility(0);
                    return;
                }
                this.mActivity.getWindow().clearFlags(1024);
                this.mActivity.getWindow().getDecorView().setSystemUiVisibility(this.systemUiVisibilit);
            } else if (Build.VERSION.SDK_INT < 19) {
                this.mActivity.getWindow().getDecorView().setSystemUiVisibility(8);
            } else {
                this.systemUiVisibilit = this.mActivity.getWindow().getDecorView().getSystemUiVisibility();
                this.mActivity.getWindow().getDecorView().setSystemUiVisibility(4102);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
