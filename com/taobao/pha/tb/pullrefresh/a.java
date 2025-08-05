package com.taobao.pha.tb.pullrefresh;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.pha.tb.pullrefresh.SwipeRefreshLayout;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class a implements IPullRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public SwipeRefreshLayout f18840a;

    static {
        kge.a(-931820815);
        kge.a(1157762032);
        b = a.class.getSimpleName();
    }

    public a(Context context) {
        this.f18840a = new SwipeRefreshLayout(context);
        setColorScheme(IPullRefreshLayout.ColorScheme.NORMAL);
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this}) : this.f18840a;
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f18840a.enablePullRefresh(z);
        this.f18840a.setEnabled(z);
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setListener(final IPullRefreshLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6065f436", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.f18840a.setOnChildScrollUpCallback(new SwipeRefreshLayout.a() { // from class: com.taobao.pha.tb.pullrefresh.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.tb.pullrefresh.SwipeRefreshLayout.a
                public boolean a(SwipeRefreshLayout swipeRefreshLayout) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c14e8cef", new Object[]{this, swipeRefreshLayout})).booleanValue() : bVar.b();
                }
            });
            this.f18840a.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.pha.tb.pullrefresh.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                public void onPullDistance(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                    }
                }

                @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                public void onRefresh() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    } else {
                        bVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.f18840a.setBackgroundColor(i);
        }
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setColorScheme(IPullRefreshLayout.ColorScheme colorScheme) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa5a820", new Object[]{this, colorScheme});
        } else if (colorScheme == IPullRefreshLayout.ColorScheme.LIGHT) {
            this.f18840a.setHeaderColorScheme(0);
        } else if (colorScheme == IPullRefreshLayout.ColorScheme.DARK) {
            this.f18840a.setHeaderColorScheme(1);
        } else {
            if (getView() != null && getView().getContext() != null && (getView().getContext().getResources().getConfiguration().uiMode & 48) == 32) {
                i = 0;
            }
            this.f18840a.setHeaderColorScheme(i);
        }
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            this.f18840a.setRefreshing(z);
        } catch (Exception e) {
            ngr.b(b, ngn.a(e));
        }
    }
}
