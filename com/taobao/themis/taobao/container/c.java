package com.taobao.themis.taobao.container;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSErrorWidget;", "Lcom/taobao/themis/container/splash/error/IErrorPageWidget;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "view", "Lcom/taobao/uikit/extend/component/TBErrorViewWidget;", "getView", "Landroid/view/View;", "showErrorInfo", "", "errorInfo", "Lcom/taobao/themis/container/splash/entity/ErrorInfo;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c implements com.taobao.themis.container.splash.error.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TBErrorViewWidget f22822a;
    private final Context b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22823a;
        public final /* synthetic */ com.taobao.themis.kernel.f b;

        public a(ITMSPage iTMSPage, com.taobao.themis.kernel.f fVar) {
            this.f22823a = iTMSPage;
            this.b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            qpm f;
            rnc pageContainer;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage iTMSPage = this.f22823a;
            if (iTMSPage != null && (f = iTMSPage.f()) != null && (pageContainer = f.getPageContainer()) != null) {
                pageContainer.dZ_();
            }
            this.b.C();
        }
    }

    static {
        kge.a(44401739);
        kge.a(1101094717);
    }

    public c(Context mContext) {
        q.d(mContext, "mContext");
        this.b = mContext;
        this.f22822a = new TBErrorViewWidget(this.b);
    }

    @Override // com.taobao.themis.container.splash.error.b
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f22822a;
    }

    @Override // com.taobao.themis.container.splash.error.b
    public void a(ErrorInfo errorInfo, com.taobao.themis.kernel.f instance, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7e5bb", new Object[]{this, errorInfo, instance, iTMSPage});
            return;
        }
        q.d(errorInfo, "errorInfo");
        q.d(instance, "instance");
        this.f22822a.setTopic("themisPageName");
        this.f22822a.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
        this.f22822a.setRefreshButton(new a(iTMSPage, instance));
        this.f22822a.setVisibility(0);
    }
}
