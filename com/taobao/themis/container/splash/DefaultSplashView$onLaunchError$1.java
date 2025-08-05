package com.taobao.themis.container.splash;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.qpt;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class DefaultSplashView$onLaunchError$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e $error;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSplashView$onLaunchError$1(a aVar, e eVar) {
        super(0);
        this.this$0 = aVar;
        this.$error = eVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        a aVar = this.this$0;
        if (a.$ipChange == ISplashView.Status.ERROR) {
            return;
        }
        a.a(this.this$0, ISplashView.Status.ERROR);
        a aVar2 = this.this$0;
        a.$ipChange.removeAllViews();
        a aVar3 = this.this$0;
        a.$ipChange.setVisibility(0);
        a aVar4 = this.this$0;
        com.taobao.themis.container.splash.error.a createErrorPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorPage(a.$ipChange);
        if (createErrorPage == null) {
            TMSLogger.d("DefaultSplashView", "create error page is null");
            return;
        }
        View view = createErrorPage.getView();
        if (!(view instanceof FrameLayout)) {
            view = null;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.tms_error_view);
            a aVar5 = this.this$0;
            a.$ipChange.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = this.$error.d;
        errorInfo.d = this.$error.e;
        t tVar = t.INSTANCE;
        a aVar6 = this.this$0;
        createErrorPage.showErrorInfo(errorInfo, a.$ipChange, null);
        a aVar7 = this.this$0;
        if (a.$ipChange.findViewById(R.id.tms_loading_title_bar) != null) {
            return;
        }
        a aVar8 = this.this$0;
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(a.$ipChange);
        if (createTitleBar == null) {
            TMSLogger.d("DefaultSplashView", "create title bar is null");
            return;
        }
        a aVar9 = this.this$0;
        ViewGroup viewGroup = a.$ipChange;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        viewGroup.addView(contentView);
    }
}
