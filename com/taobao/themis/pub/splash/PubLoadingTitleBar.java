package com.taobao.themis.pub.splash;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.title.titlebar.TMSBaseTitleBar;
import com.taobao.themis.kernel.container.ui.titlebar.a;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.action.g;
import com.taobao.themis.pub.titlebar.action.h;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Lcom/taobao/themis/pub/splash/PubLoadingTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attachPage", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "initTitleBar", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubLoadingTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1194460134);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubLoadingTitleBar(Context context) {
        super(context);
        q.d(context, "context");
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        getMTitleView().addLeftAction(new g());
        getMTitleView().addRightAction(new h());
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public void attachPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        for (a aVar : getMTitleView().getActions()) {
            aVar.a(page);
        }
    }
}
