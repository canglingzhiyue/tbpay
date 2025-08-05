package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;

/* loaded from: classes9.dex */
public interface IGlobalMenuAdapter extends com.taobao.themis.kernel.basic.a {
    d.a createMenuItem(ITMSPage iTMSPage, IMenuAction.MenuType menuType);

    <T> d getGlobalMenu(ITMSPage iTMSPage);

    IMenuAction getMoreAction(ITMSPage iTMSPage);
}
