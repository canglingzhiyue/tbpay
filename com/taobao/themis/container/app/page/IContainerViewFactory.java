package com.taobao.themis.container.app.page;

import android.content.Context;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/taobao/themis/container/app/page/IContainerViewFactory;", "Lcom/taobao/themis/kernel/basic/TMSAdapter;", "createPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "context", "Landroid/content/Context;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "createTabBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar;", "createTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface IContainerViewFactory extends com.taobao.themis.kernel.basic.a {
    rnc createPageContainer(Context context, ITMSPage iTMSPage);

    com.taobao.themis.kernel.container.ui.titlebar.c createTabBar(Context context, ITMSPage iTMSPage);

    com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar(Context context, ITMSPage iTMSPage);
}
