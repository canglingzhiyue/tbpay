package com.taobao.themis.taobao.container;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.ISplashViewFactory;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.pub.splash.PubGameLoadingPage;
import com.taobao.themis.pub.splash.PubGameLoadingTitleBar;
import com.taobao.themis.pub.splash.PubLoadingPage;
import com.taobao.themis.pub.splash.PubLoadingTitleBar;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSTBSplashViewFactory;", "Lcom/taobao/themis/container/splash/ISplashViewFactory;", "()V", "createErrorPage", "Lcom/taobao/themis/container/splash/error/IErrorPage;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "createErrorWidget", "Lcom/taobao/themis/container/splash/error/IErrorPageWidget;", "createLoadingPage", "Lcom/taobao/themis/container/splash/loading/ILoadingPage;", "createTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBSplashViewFactory implements ISplashViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1723636719);
        kge.a(249846329);
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.container.ui.titlebar.b) ipChange.ipc$dispatch("9a15bba3", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        TMSSolutionType j = instance.j();
        if (j == null) {
            return null;
        }
        int i = f.$EnumSwitchMapping$0[j.ordinal()];
        if (i == 1) {
            Activity o = instance.o();
            q.b(o, "instance.activity");
            return new PubLoadingTitleBar(o);
        } else if (i != 2) {
            return null;
        } else {
            Activity o2 = instance.o();
            q.b(o2, "instance.activity");
            return new PubGameLoadingTitleBar(o2);
        }
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public com.taobao.themis.container.splash.loading.a createLoadingPage(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.container.splash.loading.a) ipChange.ipc$dispatch("7716ce00", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        TMSSolutionType j = instance.j();
        if (j == null) {
            return null;
        }
        int i = f.$EnumSwitchMapping$1[j.ordinal()];
        if (i == 1) {
            Activity o = instance.o();
            q.b(o, "instance.activity");
            return new PubLoadingPage(o);
        } else if (i != 2) {
            return null;
        } else {
            Activity o2 = instance.o();
            q.b(o2, "instance.activity");
            return new PubGameLoadingPage(o2);
        }
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public com.taobao.themis.container.splash.error.a createErrorPage(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.container.splash.error.a) ipChange.ipc$dispatch("cb452728", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        Activity o = instance.o();
        q.b(o, "instance.activity");
        return new TMSErrorPage(o);
    }

    @Override // com.taobao.themis.container.splash.ISplashViewFactory
    public com.taobao.themis.container.splash.error.b createErrorWidget(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.container.splash.error.b) ipChange.ipc$dispatch("93cfb772", new Object[]{this, instance});
        }
        q.d(instance, "instance");
        Activity o = instance.o();
        q.b(o, "instance.activity");
        return new c(o);
    }
}
