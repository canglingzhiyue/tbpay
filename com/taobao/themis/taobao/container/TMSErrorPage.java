package com.taobao.themis.taobao.container;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.container.splash.entity.ErrorInfo;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.utils.NetUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSErrorPage;", "Lcom/taobao/themis/container/splash/error/IErrorPage;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mErrorView", "Lcom/taobao/uikit/extend/component/TBErrorView;", "getView", "Landroid/view/View;", "showErrorInfo", "", "errorInfo", "Lcom/taobao/themis/container/splash/entity/ErrorInfo;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSErrorPage implements com.taobao.themis.container.splash.error.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TBErrorView f22817a;
    private final Context b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ErrorInfo b;

        public a(ErrorInfo errorInfo) {
            this.b = errorInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
            if (iNavigatorAdapter == null) {
                return;
            }
            Context access$getMContext$p = TMSErrorPage.access$getMContext$p(TMSErrorPage.this);
            String str = this.b.g;
            q.b(str, "errorInfo.buttonUrl");
            INavigatorAdapter.b.a(iNavigatorAdapter, access$getMContext$p, str, null, null, null, 16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.f f22819a;

        public b(com.taobao.themis.kernel.f fVar) {
            this.f22819a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f22819a.C();
            this.f22819a.n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.themis.kernel.f f22820a;

        public c(com.taobao.themis.kernel.f fVar) {
            this.f22820a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f22820a.a(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
            }
        }
    }

    static {
        kge.a(227762774);
        kge.a(-1748308071);
    }

    public TMSErrorPage(Context mContext) {
        q.d(mContext, "mContext");
        this.b = mContext;
        this.f22817a = new TBErrorView(this.b);
        this.f22817a.setBackgroundColor(Color.parseColor("#f4f4f4"));
    }

    public static final /* synthetic */ Context access$getMContext$p(TMSErrorPage tMSErrorPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e4999df8", new Object[]{tMSErrorPage}) : tMSErrorPage.b;
    }

    @Override // com.taobao.themis.container.splash.error.a
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.f22817a;
    }

    @Override // com.taobao.themis.container.splash.error.a
    public void showErrorInfo(ErrorInfo errorInfo, com.taobao.themis.kernel.f instance, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21d70c3", new Object[]{this, errorInfo, instance, iTMSPage});
            return;
        }
        q.d(errorInfo, "errorInfo");
        q.d(instance, "instance");
        this.f22817a.setTitle(errorInfo.f22390a);
        if (NetUtil.isNetworkConnected(this.b)) {
            if (StringUtils.isEmpty(errorInfo.b)) {
                errorInfo.b = com.taobao.themis.container.utils.a.a(this.b, R.string.tms_kit_refresh_tip);
            }
            this.f22817a.setSubTitle(errorInfo.b);
        }
        if (!StringUtils.isEmpty(errorInfo.e)) {
            this.f22817a.setIconUrl(errorInfo.e);
        } else {
            this.f22817a.setIconUrl("https://gw.alicdn.com/tfs/TB1a.purYr1gK0jSZFDXXb9yVXa-416-416.png");
        }
        Error newError = Error.Factory.newError(errorInfo.c, errorInfo.d);
        HashMap hashMap = new HashMap();
        hashMap.put("appId", instance.h());
        hashMap.put("appName", k.j(instance));
        hashMap.put("frameType", k.a(instance));
        hashMap.put("appType", "tms");
        hashMap.put("templateId", k.g(instance));
        String openModel = instance.q().getOpenModel();
        if (StringUtils.equals(openModel, i.KEY_AFC_OPEN_LINK) || StringUtils.equals(openModel, i.KEY_BROWSER_LINK)) {
            hashMap.put("isFromOuter", "true");
        }
        newError.extras = hashMap;
        if (iTMSPage == null) {
            newError.url = instance.g();
        } else {
            newError.url = iTMSPage.e();
        }
        this.f22817a.setError(newError);
        this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        boolean a2 = com.taobao.themis.container.utils.c.INSTANCE.a();
        String b2 = com.taobao.themis.container.utils.c.INSTANCE.b();
        if (a2) {
            this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        }
        String str = b2;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(instance.h())) {
            String h = instance.h();
            q.b(h, "instance.appId");
            if (n.b((CharSequence) str, (CharSequence) h, false, 2, (Object) null)) {
                this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
            }
        }
        if (!StringUtils.isEmpty(errorInfo.f) && !StringUtils.isEmpty(errorInfo.g)) {
            this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
            this.f22817a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, errorInfo.f, new a(errorInfo));
        } else if (com.taobao.themis.kernel.utils.n.INSTANCE.aF() && (instance.i() == TMSContainerType.EMBEDDED || instance.j() == TMSSolutionType.WEB_SINGLE_PAGE || (instance.j() == TMSSolutionType.UNIAPP && com.taobao.themis.kernel.utils.n.INSTANCE.r()))) {
            errorInfo.f = com.taobao.themis.container.utils.a.a(this.b, R.string.tms_kit_refresh_page);
            this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
            this.f22817a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, errorInfo.f, new b(instance));
        } else if (iTMSPage == null || errorInfo.h != ErrorInfo.buttonActionType.back) {
        } else {
            errorInfo.f = com.taobao.themis.container.utils.a.a(this.b, R.string.tms_kit_close_page);
            this.f22817a.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
            this.f22817a.setButton(TBErrorView.ButtonType.BUTTON_LEFT, errorInfo.f, new c(instance));
        }
    }
}
