package com.taobao.pha.tb.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;

/* loaded from: classes7.dex */
public class SwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mChildScrollUpCallback;
    private final RefreshHeader mRefreshHeader;

    /* loaded from: classes7.dex */
    public interface a {
        boolean a(SwipeRefreshLayout swipeRefreshLayout);
    }

    static {
        kge.a(-961364756);
    }

    public static /* synthetic */ Object ipc$super(SwipeRefreshLayout swipeRefreshLayout, String str, Object... objArr) {
        if (str.hashCode() == 2108156838) {
            return new Boolean(super.isChildScrollToTop());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SwipeRefreshLayout(Context context) {
        super(context);
        this.mRefreshHeader = new RefreshHeader(context);
        setHeaderViewHeight(50);
        setHeaderView(this.mRefreshHeader);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshHeader = new RefreshHeader(context);
        setHeaderViewHeight(50);
        setHeaderView(this.mRefreshHeader);
    }

    public boolean setHeaderBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc695da", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader == null) {
            return false;
        }
        refreshHeader.setBackgroundColor(i);
        return true;
    }

    public boolean setHeaderColorScheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1acb9527", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader == null) {
            return false;
        }
        refreshHeader.setColorScheme(i);
        return true;
    }

    public void setOnChildScrollUpCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13784575", new Object[]{this, aVar});
        } else {
            this.mChildScrollUpCallback = aVar;
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
    public boolean isChildScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
        }
        a aVar = this.mChildScrollUpCallback;
        if (aVar == null) {
            return super.isChildScrollToTop();
        }
        return !aVar.a(this);
    }
}
