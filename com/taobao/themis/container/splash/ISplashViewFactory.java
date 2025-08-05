package com.taobao.themis.container.splash;

import com.taobao.themis.kernel.f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/taobao/themis/container/splash/ISplashViewFactory;", "Lcom/taobao/themis/kernel/basic/TMSAdapter;", "createErrorPage", "Lcom/taobao/themis/container/splash/error/IErrorPage;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "createErrorWidget", "Lcom/taobao/themis/container/splash/error/IErrorPageWidget;", "createLoadingPage", "Lcom/taobao/themis/container/splash/loading/ILoadingPage;", "createTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface ISplashViewFactory extends com.taobao.themis.kernel.basic.a {
    com.taobao.themis.container.splash.error.a createErrorPage(f fVar);

    com.taobao.themis.container.splash.error.b createErrorWidget(f fVar);

    com.taobao.themis.container.splash.loading.a createLoadingPage(f fVar);

    com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar(f fVar);
}
