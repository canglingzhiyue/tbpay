package com.taobao.themis.container.title.titlebar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.extension.page.h;
import com.taobao.themis.kernel.extension.page.u;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.rnc;
import tb.tlb;
import tb.tlc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/DefaultTitleBar;", "Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAppNameAction", "Lcom/taobao/themis/container/title/action/impl/AppNameAction;", "mBackAction", "Lcom/taobao/themis/container/title/action/impl/BackAction;", "uniTitleBarPosition", "com/taobao/themis/container/title/titlebar/DefaultTitleBar$uniTitleBarPosition$1", "Lcom/taobao/themis/container/title/titlebar/DefaultTitleBar$uniTitleBarPosition$1;", "attachPage", "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class DefaultTitleBar extends TMSBaseTitleBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    private final tlc f22396a;
    private final tlb b;
    private final d c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/container/title/titlebar/DefaultTitleBar$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f b;
            Object systemService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                systemService = DefaultTitleBar.this.getMContext().getSystemService("input_method");
            } catch (Throwable th) {
                TMSLogger.b("UniTitleBar", "backClick cause error", th);
            }
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            q.b(view, "view");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            ITMSPage mPage = DefaultTitleBar.this.getMPage();
            if (mPage == null || (b = mPage.b()) == null) {
                return;
            }
            b.a(TMSBackPressedType.TITLE_BAR_BACK_ACTION);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/container/title/titlebar/DefaultTitleBar$attachPage$1", "Lcom/taobao/themis/kernel/extension/page/IMetaPageExtension$OnMetaGetCallback;", "onMetaGet", "", "meta", "Lcom/alibaba/fastjson/JSONObject;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements u.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f22398a;

        public c(h hVar) {
            this.f22398a = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        @Override // com.taobao.themis.kernel.extension.page.u.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.alibaba.fastjson.JSONObject r21) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.title.titlebar.DefaultTitleBar.c.a(com.alibaba.fastjson.JSONObject):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/container/title/titlebar/DefaultTitleBar$uniTitleBarPosition$1", "Lcom/taobao/themis/container/title/titlebar/AbsPubTitleBarPosition;", "commit", "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d extends com.taobao.themis.container.title.titlebar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.themis.container.title.titlebar.a
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
                return;
            }
            ITMSPage mPage = DefaultTitleBar.this.getMPage();
            if (mPage == null) {
                return;
            }
            mPage.a(com.taobao.themis.container.title.titlebar.a.TARGET, com.taobao.themis.container.title.titlebar.a.EVENT_NAME, generatePosition());
        }
    }

    static {
        kge.a(290034883);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(DefaultTitleBar defaultTitleBar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.attachPage((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTitleBar(Context context) {
        super(context);
        q.d(context, "context");
        this.f22396a = new tlc();
        this.b = new tlb();
        com.taobao.themis.container.title.titleView.a mTitleView = getMTitleView();
        tlc tlcVar = this.f22396a;
        tlcVar.a(new a());
        t tVar = t.INSTANCE;
        mTitleView.addLeftAction(tlcVar);
        getMTitleView().addLeftAction(this.b);
        if (n.bz()) {
            this.b.b(k.a(getMContext(), 216));
        } else {
            int a2 = k.a(getMContext());
            View findViewById = getMTitleView().getContentView().findViewById(R.id.right_panel);
            q.b(findViewById, "mTitleView.getContentVie…d<View>(R.id.right_panel)");
            int measuredWidth = a2 - findViewById.getMeasuredWidth();
            View a3 = this.f22396a.a(getMContext());
            this.b.b((measuredWidth - (a3 != null ? a3.getMeasuredWidth() : 0)) - k.a(getMContext(), 24.0f));
        }
        this.c = new d();
    }

    @Override // com.taobao.themis.container.title.titlebar.TMSBaseTitleBar, com.taobao.themis.kernel.container.ui.titlebar.b
    public void attachPage(ITMSPage page) {
        u uVar;
        rnc pageContainer;
        rnc pageContainer2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.attachPage(page);
        View contentView = getMTitleView().getContentView();
        if (contentView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) contentView;
        this.c.getSafeAreaInsets()[0] = k.a(getMContext(), k.b(getMContext()));
        this.c.setImmersive(qqc.b(page));
        qpm f = page.f();
        IMenuAction iMenuAction = null;
        View view = (f == null || (pageContainer2 = f.getPageContainer()) == null) ? null : pageContainer2.getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        if (((ViewGroup) view) != null && n.ab()) {
            qpm f2 = page.f();
            View view2 = (f2 == null || (pageContainer = f2.getPageContainer()) == null) ? null : pageContainer.getView();
            if (view2 != null) {
                com.taobao.themis.container.title.titlebar.b.a(viewGroup, ((ViewGroup) view2).getChildAt(0), this.c);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        } else {
            com.taobao.themis.container.title.titlebar.b.a(viewGroup, (View) null, this.c);
        }
        IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) qpt.b(IGlobalMenuAdapter.class);
        if (iGlobalMenuAdapter != null) {
            iMenuAction = iGlobalMenuAdapter.getMoreAction(page);
        }
        if (iMenuAction != null && (iMenuAction instanceof com.taobao.themis.kernel.container.ui.titlebar.a)) {
            com.taobao.themis.kernel.container.ui.titlebar.a aVar = (com.taobao.themis.kernel.container.ui.titlebar.a) iMenuAction;
            getMTitleView().addRightAction(aVar);
            aVar.a(page);
        }
        h hVar = (h) page.a(h.class);
        if (hVar == null || (uVar = (u) page.a(u.class)) == null) {
            return;
        }
        uVar.a(new c(hVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/DefaultTitleBar$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        static {
            kge.a(-383473589);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }
}
