package com.taobao.homepage.pop.view.container.main;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.container.b;
import com.taobao.homepage.pop.view.popview.BasePopView;
import tb.kyu;
import tb.laj;
import tb.lak;

/* loaded from: classes7.dex */
public class b extends com.taobao.homepage.pop.view.container.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public b(BasePopContainer basePopContainer, lak lakVar, kyu kyuVar) {
        super(basePopContainer, lakVar, kyuVar);
        this.e = new a(basePopContainer);
    }

    @Override // com.taobao.homepage.pop.view.container.b
    public void a(com.taobao.homepage.pop.viewmodel.b bVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758407ea", new Object[]{this, bVar, aVar});
            return;
        }
        IPopData a2 = bVar.a();
        if (!a2.isAllowShow()) {
            a(aVar, false, com.taobao.homepage.pop.ucp.b.ERROR_MSG_SHOW_COUNT_INVALID);
            c.a("MainContainerTrigger ", "trigger error, data has shown");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        IPopConfig popConfig = a2.getPopConfig();
        laj a3 = this.d.a(popConfig.getPopContentType());
        if (a3 == null) {
            a(aVar, false, popConfig.getPopContentType() == 1 ? com.taobao.homepage.pop.ucp.b.ERROR_DX_RENDER_FAILED : com.taobao.homepage.pop.ucp.b.ERROR_WEEX_RENDER_FAILED);
            c.a("MainContainerTrigger ", "no viewProvider by contentType=" + popConfig.getPopContentType());
            return;
        }
        IPopAnchorViewInfo a4 = this.e.a(a2, 0);
        if (a4 == null) {
            a(aVar, false, com.taobao.homepage.pop.ucp.b.ERROR_MSG_ANCHOR_VIEW_INVALID);
            c.a("MainContainerTrigger ", "no view info by contentType=" + popConfig.getPopContentType());
            return;
        }
        d.a("PopTargetCardValid", a2);
        BasePopView createPopView = this.c.createPopView(a2, a3, null, a4, this.e, bVar);
        if (createPopView == null) {
            a(aVar, false, popConfig.getPopContentType() == 1 ? com.taobao.homepage.pop.ucp.b.ERROR_DX_RENDER_FAILED : com.taobao.homepage.pop.ucp.b.ERROR_WEEX_RENDER_FAILED);
            c.a("MainContainerTrigger ", "create popView error");
            return;
        }
        ((FrameLayout.LayoutParams) createPopView.getLayoutParams()).gravity = popConfig.getPointY() == 1 ? 81 : 49;
        a(aVar, true);
        c.a("MainContainerTrigger ", "create new pop success, popView=" + createPopView.hashCode() + ", businessId=" + a2.getBusinessID() + ", useTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
    }
}
