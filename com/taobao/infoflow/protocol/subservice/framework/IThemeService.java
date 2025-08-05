package com.taobao.infoflow.protocol.subservice.framework;

import android.view.ViewGroup;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lkq;

/* loaded from: classes.dex */
public interface IThemeService<V extends ViewGroup> extends ISubService, lkq<V> {
    public static final String SERVICE_NAME = "ThemeService";

    void onFestivalRefresh();

    void preCreateTheme();

    void setEnableCreateGlobalTheme(String str);

    void setGlobalThemeVisible(boolean z);
}
