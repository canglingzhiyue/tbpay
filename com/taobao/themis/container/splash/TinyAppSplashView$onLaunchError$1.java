package com.taobao.themis.container.splash;

import mtopsdk.common.util.StringUtils;
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
public final class TinyAppSplashView$onLaunchError$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e $error;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$onLaunchError$1(b bVar, e eVar) {
        super(0);
        this.this$0 = bVar;
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
        b bVar = this.this$0;
        if (b.$ipChange == ISplashView.Status.ERROR) {
            return;
        }
        b.a(this.this$0, ISplashView.Status.ERROR);
        b bVar2 = this.this$0;
        b.$ipChange.removeAllViews();
        b bVar3 = this.this$0;
        b.$ipChange.setVisibility(0);
        b bVar4 = this.this$0;
        com.taobao.themis.container.splash.error.a createErrorPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createErrorPage(b.$ipChange);
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
            b bVar5 = this.this$0;
            b.$ipChange.addView(frameLayout);
        }
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.c = this.$error.d;
        errorInfo.d = this.$error.e;
        if (!StringUtils.isEmpty(this.$error.j)) {
            errorInfo.f22390a = this.$error.j;
        }
        if (!StringUtils.isEmpty(this.$error.k)) {
            errorInfo.b = this.$error.k;
        }
        t tVar = t.INSTANCE;
        b bVar6 = this.this$0;
        createErrorPage.showErrorInfo(errorInfo, b.$ipChange, null);
        b bVar7 = this.this$0;
        if (b.$ipChange.findViewById(R.id.tms_loading_title_bar) != null) {
            return;
        }
        b bVar8 = this.this$0;
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(b.$ipChange);
        if (createTitleBar == null) {
            TMSLogger.d("DefaultSplashView", "create title bar is null");
            return;
        }
        b bVar9 = this.this$0;
        ViewGroup viewGroup = b.$ipChange;
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
