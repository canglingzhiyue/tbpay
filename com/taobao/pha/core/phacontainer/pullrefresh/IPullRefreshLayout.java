package com.taobao.pha.core.phacontainer.pullrefresh;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.pha.core.model.PageModel;

/* loaded from: classes7.dex */
public interface IPullRefreshLayout {

    /* loaded from: classes7.dex */
    public enum ColorScheme {
        LIGHT,
        DARK,
        NORMAL
    }

    /* loaded from: classes.dex */
    public interface a {
        IPullRefreshLayout a(Context context, PageModel pageModel);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();

        boolean b();
    }

    ViewGroup getView();

    void setBackgroundColor(int i);

    void setColorScheme(ColorScheme colorScheme);

    void setEnabled(boolean z);

    void setListener(b bVar);

    void setRefreshing(boolean z);
}
