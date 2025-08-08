package com.taobao.weex.ui.view.refresh.wrapper;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.WXLoadingLayout;
import com.taobao.weex.ui.view.WXRefreshLayout;
import com.taobao.weex.ui.view.refresh.core.WXRefreshView;
import com.taobao.weex.ui.view.refresh.core.WXSwipeLayout;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class BaseBounceView<T extends View> extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T mInnerView;
    private int mOrientation;
    public WXSwipeLayout swipeLayout;

    static {
        kge.a(1630827064);
    }

    public static /* synthetic */ Object ipc$super(BaseBounceView baseBounceView, String str, Object... objArr) {
        if (str.hashCode() == 1811093890) {
            super.removeView((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onLoadmoreComplete();

    public abstract void onRefreshingComplete();

    public abstract T setInnerView(Context context);

    public BaseBounceView(Context context, int i) {
        this(context, null, i);
    }

    public BaseBounceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mOrientation = 1;
        this.mOrientation = i;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue() : this.mOrientation;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            createBounceView(context);
        }
    }

    public boolean isVertical() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d064334b", new Object[]{this})).booleanValue() : this.mOrientation == 1;
    }

    public void setOnRefreshListener(WXSwipeLayout.WXOnRefreshListener wXOnRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1e8068", new Object[]{this, wXOnRefreshListener});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.setOnRefreshListener(wXOnRefreshListener);
    }

    public void setOnLoadingListener(WXSwipeLayout.WXOnLoadingListener wXOnLoadingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff03e748", new Object[]{this, wXOnLoadingListener});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.setOnLoadingListener(wXOnLoadingListener);
    }

    public void finishPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bd114a", new Object[]{this});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.finishPullRefresh();
    }

    public void finishPullLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d020005", new Object[]{this});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.finishPullLoad();
    }

    private WXSwipeLayout createBounceView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSwipeLayout) ipChange.ipc$dispatch("8d3fb53c", new Object[]{this, context});
        }
        this.swipeLayout = new WXSwipeLayout(context);
        this.swipeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mInnerView = setInnerView(context);
        T t = this.mInnerView;
        if (t == null) {
            return null;
        }
        this.swipeLayout.addTargetView(t);
        addView(this.swipeLayout, -1, -1);
        return this.swipeLayout;
    }

    public T getInnerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this}) : this.mInnerView;
    }

    public void setHeaderView(WXComponent wXComponent) {
        WXRefreshView headerView;
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca0e680", new Object[]{this, wXComponent});
            return;
        }
        setRefreshEnable(true);
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null || (headerView = wXSwipeLayout.getHeaderView()) == null || wXComponent == null) {
            return;
        }
        this.swipeLayout.setRefreshHeight((int) wXComponent.getLayoutHeight());
        String string = WXUtils.getString((String) wXComponent.getStyles().get("backgroundColor"), null);
        if (string != null && !StringUtils.isEmpty(string) && (color = WXResourceUtils.getColor(string)) != 0) {
            this.swipeLayout.setRefreshBgColor(color);
        }
        headerView.setRefreshView(wXComponent.mo1286getHostView());
    }

    public void setFooterView(WXComponent wXComponent) {
        WXRefreshView footerView;
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ab9a0e", new Object[]{this, wXComponent});
            return;
        }
        setLoadmoreEnable(true);
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null || (footerView = wXSwipeLayout.getFooterView()) == null || wXComponent == null) {
            return;
        }
        this.swipeLayout.setLoadingHeight((int) wXComponent.getLayoutHeight());
        String string = WXUtils.getString((String) wXComponent.getStyles().get("backgroundColor"), null);
        if (string != null && !StringUtils.isEmpty(string) && (color = WXResourceUtils.getColor(string)) != 0) {
            this.swipeLayout.setLoadingBgColor(color);
        }
        footerView.setRefreshView(wXComponent.mo1286getHostView());
    }

    public void removeFooterView(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ba0830", new Object[]{this, wXComponent});
            return;
        }
        setLoadmoreEnable(false);
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null || wXSwipeLayout.getFooterView() == null) {
            return;
        }
        this.swipeLayout.setLoadingHeight(0);
        this.swipeLayout.getFooterView().removeView(wXComponent.mo1286getHostView());
        this.swipeLayout.finishPullLoad();
    }

    public void removeHeaderView(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85af54a2", new Object[]{this, wXComponent});
            return;
        }
        setRefreshEnable(false);
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null || wXSwipeLayout.getHeaderView() == null) {
            return;
        }
        this.swipeLayout.setRefreshHeight(0);
        this.swipeLayout.getHeaderView().removeView(wXComponent.mo1286getHostView());
        this.swipeLayout.finishPullRefresh();
    }

    public void setRefreshEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5748c5b1", new Object[]{this, new Boolean(z)});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.setPullRefreshEnable(z);
    }

    public void setLoadmoreEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5eb78d", new Object[]{this, new Boolean(z)});
            return;
        }
        WXSwipeLayout wXSwipeLayout = this.swipeLayout;
        if (wXSwipeLayout == null) {
            return;
        }
        wXSwipeLayout.setPullLoadEnable(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else if (view instanceof WXLoadingLayout) {
            finishPullLoad();
            setLoadmoreEnable(false);
            WXSwipeLayout wXSwipeLayout = this.swipeLayout;
            if (wXSwipeLayout == null) {
                return;
            }
            wXSwipeLayout.removeView(wXSwipeLayout.getFooterView());
        } else if (view instanceof WXRefreshLayout) {
            finishPullRefresh();
            setRefreshEnable(false);
            WXSwipeLayout wXSwipeLayout2 = this.swipeLayout;
            if (wXSwipeLayout2 == null) {
                return;
            }
            wXSwipeLayout2.removeView(wXSwipeLayout2.getHeaderView());
        } else {
            super.removeView(view);
        }
    }

    public WXSwipeLayout getSwipeLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSwipeLayout) ipChange.ipc$dispatch("d12ccd1f", new Object[]{this}) : this.swipeLayout;
    }
}
