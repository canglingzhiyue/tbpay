package com.taobao.themis.taobao.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.title.titlebar.DefaultTitleBar;
import com.taobao.themis.inside.adapter.DefaultContainerViewFactory;
import com.taobao.themis.kernel.container.ui.titlebar.b;
import com.taobao.themis.kernel.container.ui.titlebar.c;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.d;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rnc;
import tb.suk;
import tb.tma;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/taobao/view/TMSTBContainerViewFactory;", "Lcom/taobao/themis/inside/adapter/DefaultContainerViewFactory;", "()V", "createPageContainer", "Lcom/taobao/themis/kernel/container/ui/IPageContainer;", "context", "Landroid/content/Context;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "createTabBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITabBar;", "createTitleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBContainerViewFactory extends DefaultContainerViewFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1528877779);
    }

    public static /* synthetic */ Object ipc$super(TMSTBContainerViewFactory tMSTBContainerViewFactory, String str, Object... objArr) {
        if (str.hashCode() == 416432265) {
            return super.createPageContainer((Context) objArr[0], (ITMSPage) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public rnc createPageContainer(Context context, ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnc) ipChange.ipc$dispatch("18d24089", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        d.a("TMSTBContainerViewFactory#createPageContainer", new Pair("pageUrl", page.e()), (Pair) null, 4, (Object) null);
        try {
            return super.createPageContainer(context, page);
        } finally {
            d.a("TMSTBContainerViewFactory#createPageContainer");
        }
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public b createTitleBar(Context context, ITMSPage page) {
        DefaultTitleBar defaultTitleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("49af86f1", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        DefaultTitleBar defaultTitleBar2 = null;
        d.a("TMSTBContainerViewFactory#createTitleBar", new Pair("pageUrl", page.e()), (Pair) null, 4, (Object) null);
        try {
            if (o.f(page.b())) {
                return new PubTitleBar(context);
            }
            TMSSolutionType j = page.b().j();
            if (j != null) {
                int i = a.$EnumSwitchMapping$0[j.ordinal()];
                if (i == 1 || i == 2) {
                    if (n.bl()) {
                        defaultTitleBar2 = new DefaultTitleBar(context);
                    }
                    defaultTitleBar = defaultTitleBar2;
                } else if (i == 3) {
                    defaultTitleBar = new DefaultTitleBar(context);
                }
                return defaultTitleBar;
            }
            defaultTitleBar = new PubTitleBar(context);
            return defaultTitleBar;
        } finally {
            d.a("TMSTBContainerViewFactory#createTitleBar");
        }
    }

    @Override // com.taobao.themis.inside.adapter.DefaultContainerViewFactory, com.taobao.themis.container.app.page.IContainerViewFactory
    public c createTabBar(Context context, ITMSPage page) {
        TabBar d;
        suk sukVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b17acb73", new Object[]{this, context, page});
        }
        q.d(context, "context");
        q.d(page, "page");
        d.a("TMSTBContainerViewFactory#createTabBar", new Pair("pageUrl", page.e()), (Pair) null, 4, (Object) null);
        try {
            com.taobao.themis.kernel.container.a x = page.b().x();
            if (x != null && (d = x.d()) != null) {
                if (d.isAct()) {
                    sukVar = new tma(context);
                } else if (n.be()) {
                    sukVar = new com.taobao.themis.kernel.extension.page.tab.a(context);
                } else {
                    sukVar = new suk(context);
                }
                sukVar.a(d);
                return sukVar;
            }
            return null;
        } finally {
            d.a("TMSTBContainerViewFactory#createTabBar");
        }
    }
}
