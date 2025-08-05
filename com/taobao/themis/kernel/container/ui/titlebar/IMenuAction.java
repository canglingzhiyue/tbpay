package com.taobao.themis.kernel.container.ui.titlebar;

import com.taobao.themis.kernel.container.ui.titlebar.d;

/* loaded from: classes9.dex */
public interface IMenuAction {

    /* loaded from: classes9.dex */
    public enum MenuType {
        SHARE,
        ABOUT,
        MORE_CHANNEL,
        AUTHORIZE_SETTING,
        COMMENT,
        OPEN_PROXY,
        ADD_TO_DESKTOP
    }

    void a();

    void a(d.a aVar);

    void eH_();
}
