package com.taobao.themis.inside.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.app.page.IContainerViewFactory;
import com.taobao.themis.container.app.page.TMSPageContainer;
import com.taobao.themis.container.app.page.g;
import com.taobao.themis.container.app.page.h;
import com.taobao.themis.container.title.titlebar.DefaultTitleBar;
import com.taobao.themis.kernel.container.ui.titlebar.b;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rnc;
import tb.sui;
import tb.suj;
import tb.suk;
import tb.tca;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultContainerViewFactory;", "Lcom/taobao/themis/container/app/page/IContainerViewFactory;", "()V", "createPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "context", "Landroid/content/Context;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "createTabBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar;", "createTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class DefaultContainerViewFactory implements IContainerViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1332643992);
        kge.a(-837702945);
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public rnc createPageContainer(Context context, ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnc) ipChange.ipc$dispatch("18d24089", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        if (page.a(suj.class) != null) {
            return new h(context, page);
        }
        tca tcaVar = (tca) page.a(tca.class);
        if (tcaVar != null) {
            return tcaVar.e();
        }
        if (page.a(sui.class) != null) {
            return new g(context, page);
        }
        return new TMSPageContainer(context, page);
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public b createTitleBar(Context context, ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("49af86f1", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        TMSSolutionType j = page.b().j();
        DefaultTitleBar defaultTitleBar = null;
        if (j != null) {
            int i = a.$EnumSwitchMapping$0[j.ordinal()];
            if (i == 1) {
                if (n.bl()) {
                    defaultTitleBar = new DefaultTitleBar(context);
                }
                return defaultTitleBar;
            } else if (i == 2 || i == 3) {
                return new DefaultTitleBar(context);
            }
        }
        return null;
    }

    @Override // com.taobao.themis.container.app.page.IContainerViewFactory
    public c createTabBar(Context context, ITMSPage page) {
        TabBar d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b17acb73", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        com.taobao.themis.kernel.container.a x = page.b().x();
        if (x == null || (d = x.d()) == null) {
            return null;
        }
        suk sukVar = new suk(context);
        sukVar.a(d);
        return sukVar;
    }
}
