package com.taobao.pha.core.phacontainer.pullrefresh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class DefaultPullRefreshLayout extends SwipeRefreshLayout implements IPullRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long mAutoRefreshDuration;
    private IPullRefreshLayout.b mListener;

    static {
        kge.a(-1380994472);
        kge.a(1157762032);
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this}) : this;
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setColorScheme(IPullRefreshLayout.ColorScheme colorScheme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa5a820", new Object[]{this, colorScheme});
        }
    }

    public static /* synthetic */ IPullRefreshLayout.b access$000(DefaultPullRefreshLayout defaultPullRefreshLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshLayout.b) ipChange.ipc$dispatch("a3fc7f95", new Object[]{defaultPullRefreshLayout}) : defaultPullRefreshLayout.mListener;
    }

    public DefaultPullRefreshLayout(Context context) {
        super(context);
        this.mAutoRefreshDuration = 5000L;
        init();
    }

    @Override // com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout
    public void setListener(IPullRefreshLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6065f436", new Object[]{this, bVar});
        } else {
            this.mListener = bVar;
        }
    }

    public void setAutoRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfadcef5", new Object[]{this, new Boolean(z)});
        } else if (!isEnabled()) {
        } else {
            IPullRefreshLayout.b bVar = this.mListener;
            if (bVar != null) {
                bVar.a();
            }
            setRefreshing(true);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.pha.core.phacontainer.pullrefresh.DefaultPullRefreshLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        DefaultPullRefreshLayout.this.setRefreshing(false);
                    }
                }
            }, this.mAutoRefreshDuration);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setColorSchemeResources(R.color.swipe_color_1, R.color.swipe_color_2, R.color.swipe_color_3, R.color.swipe_color_4);
        setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.pha.core.phacontainer.pullrefresh.DefaultPullRefreshLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                } else if (DefaultPullRefreshLayout.access$000(DefaultPullRefreshLayout.this) == null) {
                } else {
                    DefaultPullRefreshLayout.access$000(DefaultPullRefreshLayout.this).a();
                }
            }
        });
        setOnChildScrollUpCallback(new SwipeRefreshLayout.OnChildScrollUpCallback() { // from class: com.taobao.pha.core.phacontainer.pullrefresh.DefaultPullRefreshLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.SwipeRefreshLayout.OnChildScrollUpCallback
            public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("896677b1", new Object[]{this, swipeRefreshLayout, view})).booleanValue();
                }
                if (DefaultPullRefreshLayout.access$000(DefaultPullRefreshLayout.this) == null) {
                    return false;
                }
                return DefaultPullRefreshLayout.access$000(DefaultPullRefreshLayout.this).b();
            }
        });
    }
}
