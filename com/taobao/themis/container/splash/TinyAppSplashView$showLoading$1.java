package com.taobao.themis.container.splash;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.qpt;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TinyAppSplashView$showLoading$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TinyAppSplashView$showLoading$1(b bVar) {
        super(0);
        this.this$0 = bVar;
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
        if (b.$ipChange.compareTo(ISplashView.Status.LOADING) > 0) {
            return;
        }
        b bVar2 = this.this$0;
        b.$ipChange.removeAllViews();
        b bVar3 = this.this$0;
        com.taobao.themis.container.splash.loading.a createLoadingPage = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createLoadingPage(b.$ipChange);
        if (createLoadingPage == null) {
            TMSLogger.d("DefaultSplashView", "create loading page is null");
            return;
        }
        b.a(this.this$0, ISplashView.Status.LOADING);
        b bVar4 = this.this$0;
        b.$ipChange.setVisibility(0);
        b bVar5 = this.this$0;
        ViewGroup viewGroup = b.$ipChange;
        ViewGroup viewGroup2 = (ViewGroup) createLoadingPage;
        viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup2.setId(R.id.tms_loading_view);
        t tVar = t.INSTANCE;
        viewGroup.addView(viewGroup2);
        b bVar6 = this.this$0;
        String j = k.j(b.$ipChange);
        if (j == null) {
            j = "";
        }
        createLoadingPage.setAppName(j);
        b bVar7 = this.this$0;
        String k = k.k(b.$ipChange);
        if (k == null) {
            k = "";
        }
        createLoadingPage.setLogo(k);
        b bVar8 = this.this$0;
        String v = k.v(b.$ipChange);
        if (v == null) {
            v = "";
        }
        createLoadingPage.setDeveloper(v);
        b bVar9 = this.this$0;
        if (b.$ipChange.findViewById(R.id.tms_loading_title_bar) != null) {
            return;
        }
        b bVar10 = this.this$0;
        com.taobao.themis.kernel.container.ui.titlebar.b createTitleBar = ((ISplashViewFactory) qpt.a(ISplashViewFactory.class)).createTitleBar(b.$ipChange);
        if (createTitleBar == null) {
            TMSLogger.d("DefaultSplashView", "create title bar is null");
            return;
        }
        b bVar11 = this.this$0;
        ViewGroup viewGroup3 = b.$ipChange;
        View contentView = createTitleBar.getContentView();
        if (contentView != null) {
            contentView.setId(R.id.tms_loading_title_bar);
            t tVar2 = t.INSTANCE;
        } else {
            contentView = null;
        }
        viewGroup3.addView(contentView);
    }
}
