package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.c;
import android.taobao.windvane.export.network.f;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWLauncher1;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.UniAppStartParams;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0012J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010 \u001a\u00020\u0010J\u0016\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\nJ\u0006\u0010+\u001a\u00020\u0012J\u0006\u0010,\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/infoflow/webview/WebViewProvider;", "", "mBusinessId", "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "mMegaPreloadFirstChunk", "Lcom/taobao/infoflow/performance/MegaPreloadFirstChunk;", "mRenderListener", "Lcom/taobao/infoflow/webview/IRenderListener;", "mSolutionType", "Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "mTMSEmbedCard", "Lcom/taobao/themis/external/embed/TMSEmbed;", "mWebViewContext", "Lcom/taobao/infoflow/webview/WebViewContext;", "compensateInitDWLauncher", "", "createStartParams", "Lcom/taobao/themis/external/embed/StartParams;", "solutionType", "url", ept.SUB_CREATE_VIEW, "Landroid/view/View;", "Landroid/app/Activity;", "containerType", "destroy", "dispatchEvent", "event", "eventData", "Lcom/alibaba/fastjson/JSONObject;", "getWebViewContext", tbt.PRE_REQUEST, "pageUrl", "preloadFirstChunk", "webUrl", "reloadUrl", "setPerformanceSpan", "span", "Lcom/taobao/falco/FalcoLoadActionSpan;", "setRenderListener", "renderListener", "viewAppear", "viewDisAppear", "Companion", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class mvc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String FAST_PAGE = "pages-fast.m.taobao.com";
    public static final String IS_CAN_PRELOAD_FIRST_CHUNK = "isCanPreloadFirstChunk";
    public static final String IS_CAN_PRE_REQUEST = "isPreRequest";
    public static final String TAG = "WebViewProvider";

    /* renamed from: a  reason: collision with root package name */
    private final mva f31275a;
    private TMSEmbed b;
    private TMSEmbedSolutionType c;
    private khh d;
    private szx e;
    private final String f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "prefetchUrl", com.taobao.android.weex_framework.util.a.ATOM_EXT_match}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TMSEmbedSolutionType b;
        public final /* synthetic */ String c;

        public b(TMSEmbedSolutionType tMSEmbedSolutionType, String str) {
            this.b = tMSEmbedSolutionType;
            this.c = str;
        }

        @Override // android.taobao.windvane.export.network.c
        public final boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
            }
            String str3 = str;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = str2;
                if (!(str4 == null || str4.length() == 0) && TextUtils.equals(new URL(str).getHost(), new URL(str2).getHost())) {
                    String a2 = tbv.INSTANCE.a(str);
                    if (!TextUtils.equals(str3, str4) && !TextUtils.equals(a2, str4)) {
                        tbw.INSTANCE.a("preRequestFailure", "notHitPreRequest", "没有命中预请求,prefetchUrl：$prefetchUrl", mvc.a(mvc.this), mvc.b(mvc.this).name(), str);
                        return false;
                    }
                    tbw.INSTANCE.a("preRequestSuccess", mvc.a(mvc.this), this.b, this.c);
                    ldf.d(mvc.TAG, "命中预请求");
                    return true;
                }
            }
            return false;
        }
    }

    static {
        kge.a(-1620010252);
        Companion = new a(null);
    }

    public mvc(String mBusinessId, Context context) {
        q.d(mBusinessId, "mBusinessId");
        this.f = mBusinessId;
        this.f31275a = new mva(this.f);
        this.c = TMSEmbedSolutionType.WEB_SINGLE_PAGE;
        this.d = new khh(context, this.f);
    }

    public static final /* synthetic */ String a(mvc mvcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("247dc7a2", new Object[]{mvcVar}) : mvcVar.f;
    }

    public static final /* synthetic */ TMSEmbedSolutionType b(mvc mvcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSEmbedSolutionType) ipChange.ipc$dispatch("8e6e451a", new Object[]{mvcVar}) : mvcVar.c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/infoflow/webview/WebViewProvider$Companion;", "", "()V", "FAST_PAGE", "", "IS_CAN_PRELOAD_FIRST_CHUNK", "IS_CAN_PRE_REQUEST", RPCDataItems.SWITCH_TAG_LOG, "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(243426620);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final View a(Activity context, TMSEmbedSolutionType containerType, String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f88a1bfd", new Object[]{this, context, containerType, url});
        }
        q.d(context, "context");
        q.d(containerType, "containerType");
        q.d(url, "url");
        ldf.d(TAG, "createView url：" + url);
        this.c = containerType;
        a(url, containerType);
        Activity activity = context;
        a(activity);
        this.f31275a.a(activity, containerType.name(), this.f);
        ljl d = this.f31275a.d();
        if (d != null) {
            d.a(ljl.CREATE_VIEW_TIME);
        }
        this.b = new TMSEmbed(context, this.c);
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null) {
            return null;
        }
        tMSEmbed.a(new tbu(this.f31275a, url, this.c, this.f, this.e));
        tMSEmbed.a(a(this.c, url));
        tMSEmbed.a();
        return tMSEmbed.b();
    }

    public final void a(shc span) {
        toa toaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb9cb6a", new Object[]{this, span});
            return;
        }
        q.d(span, "span");
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed == null || (toaVar = (toa) tMSEmbed.a(toa.class)) == null) {
            return;
        }
        toaVar.a(span);
    }

    public final void a(szx renderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc0fe47", new Object[]{this, renderListener});
            return;
        }
        q.d(renderListener, "renderListener");
        this.e = renderListener;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = null;
        this.f31275a.a();
        this.d.a();
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.c();
        }
        ldf.d(TAG, "destroy");
    }

    public final void a(String event, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, event, jSONObject});
            return;
        }
        q.d(event, "event");
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            TMSEmbed.a(tMSEmbed, event, jSONObject, null, 4, null);
        }
        ldf.d(TAG, "dispatchEvent," + event);
    }

    public final void a(String webUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, webUrl});
            return;
        }
        q.d(webUrl, "webUrl");
        StartParams a2 = a(this.c, webUrl);
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            TMSEmbed.a(tMSEmbed, a2, null, 2, null);
        }
        ldf.d(TAG, "reloadUrl," + a2);
    }

    public final mva b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mva) ipChange.ipc$dispatch("16b99da5", new Object[]{this}) : this.f31275a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        mut c = this.f31275a.c();
        if (c != null) {
            c.c();
        }
        ldf.d(TAG, "viewAppear");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        mut c = this.f31275a.c();
        if (c != null) {
            c.d();
        }
        ldf.d(TAG, "viewDisAppear");
    }

    public final void b(String webUrl) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, webUrl});
            return;
        }
        q.d(webUrl, "webUrl");
        if (!ldj.a(IS_CAN_PRELOAD_FIRST_CHUNK, true)) {
            ldf.d(TAG, "webViewPerformanceOptimization,orange开关关闭了");
            return;
        }
        try {
            str = new URL(webUrl).getHost();
            q.b(str, "URL(webUrl).host");
        } catch (Exception e) {
            ldf.d(TAG, "preloadFirstChunk" + e);
            str = "";
        }
        if (!TextUtils.equals(str, FAST_PAGE)) {
            ldf.d(TAG, "不是fast请求头链接，不预请求");
            return;
        }
        this.d.a(webUrl);
        tbw.INSTANCE.a("preloadFirstChunk", this.f, this.c, webUrl);
        ldf.d(TAG, "webViewPerformanceOptimization,url" + webUrl);
    }

    public final void a(String pageUrl, TMSEmbedSolutionType solutionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89154f79", new Object[]{this, pageUrl, solutionType});
            return;
        }
        q.d(pageUrl, "pageUrl");
        q.d(solutionType, "solutionType");
        if (!tbt.a(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), tbt.PRE_REQUEST)) {
            ldf.d(TAG, "preRequest uc降级不做任何优化");
        } else if (!ldj.a(IS_CAN_PRE_REQUEST, true)) {
            ldf.d(TAG, "orange开关关闭");
        } else if (!TextUtils.equals(new URL(pageUrl).getHost(), FAST_PAGE)) {
            ldf.d(TAG, "不是fast请求头链接，不预请求");
        } else {
            Request a2 = new Request.a().a(pageUrl).b("GET").a(new b(solutionType, pageUrl)).a();
            q.b(a2, "Request.Builder()\n      …               }).build()");
            f.a(a2);
            ldf.d(TAG, "触发预请求");
        }
    }

    private final StartParams a(TMSEmbedSolutionType tMSEmbedSolutionType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StartParams) ipChange.ipc$dispatch("a192a394", new Object[]{this, tMSEmbedSolutionType, str});
        }
        int i = mvd.$EnumSwitchMapping$0[tMSEmbedSolutionType.ordinal()];
        if (i == 1) {
            UniAppStartParams uniAppStartParams = new UniAppStartParams();
            uniAppStartParams.setUrl(str);
            return uniAppStartParams;
        } else if (i == 2) {
            Weex2StartParams weex2StartParams = new Weex2StartParams();
            weex2StartParams.setUrl(str);
            return weex2StartParams;
        } else {
            WebStartParams webStartParams = new WebStartParams();
            webStartParams.setUrl(str);
            return webStartParams;
        }
    }

    private final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Application)) {
                return;
            }
            new DWLauncher1().init((Application) applicationContext, null);
        } catch (Exception e) {
            ldf.d(TAG, "补偿注册播放器" + e);
        }
    }
}
