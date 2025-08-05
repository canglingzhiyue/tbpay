package com.taobao.pha.core.phacontainer;

import com.taobao.pha.core.phacontainer.pullrefresh.IPullRefreshLayout;

/* loaded from: classes7.dex */
public interface d {
    boolean disablePullRefresh();

    boolean enablePullRefresh(boolean z);

    IPullRefreshLayout getPullRefreshLayout();

    boolean setBackgroundColor(int i);

    boolean setColorScheme(String str);

    boolean startPullRefresh();

    boolean stopPullRefresh();
}
