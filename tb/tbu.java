package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/infoflow/webview/WebViewRenderListener;", "Lcom/taobao/themis/external/embed/TMSEmbed$IRenderListener;", "mWebViewContext", "Lcom/taobao/infoflow/webview/WebViewContext;", "mPageUrl", "", "mSolutionType", "Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "mBusinessId", "renderListener", "Lcom/taobao/infoflow/webview/IRenderListener;", "(Lcom/taobao/infoflow/webview/WebViewContext;Ljava/lang/String;Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;Ljava/lang/String;Lcom/taobao/infoflow/webview/IRenderListener;)V", "onJSException", "", "errorCode", "errorMsg", ljl.LAUNCHER_FINISH_TIME, ljl.LAUNCHER_START_TIME, "onRenderFailed", ljl.RENDER_START_TIME, ljl.RENDER_SUCCESS_TIME, "Companion", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class tbu extends a.C0936a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "WebViewRenderListener";

    /* renamed from: a  reason: collision with root package name */
    private final mva f34016a;
    private final String b;
    private final TMSEmbedSolutionType c;
    private final String d;
    private final szx e;

    static {
        kge.a(1915091757);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(tbu tbuVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -650670724:
                super.a((String) objArr[0], (String) objArr[1]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 1708636285:
                super.b((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/infoflow/webview/WebViewRenderListener$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1393847755);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public tbu(mva mWebViewContext, String mPageUrl, TMSEmbedSolutionType mSolutionType, String mBusinessId, szx szxVar) {
        q.d(mWebViewContext, "mWebViewContext");
        q.d(mPageUrl, "mPageUrl");
        q.d(mSolutionType, "mSolutionType");
        q.d(mBusinessId, "mBusinessId");
        this.f34016a = mWebViewContext;
        this.b = mPageUrl;
        this.c = mSolutionType;
        this.d = mBusinessId;
        this.e = szxVar;
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        ldf.d(TAG, ljl.RENDER_START_TIME);
        ljl d = this.f34016a.d();
        if (d != null) {
            d.a(ljl.RENDER_START_TIME);
        }
        tbw.INSTANCE.a("renderStart", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        ldf.d(TAG, ljl.RENDER_SUCCESS_TIME);
        ljl d = this.f34016a.d();
        if (d != null) {
            d.a(ljl.RENDER_SUCCESS_TIME);
        }
        tbw.INSTANCE.a("renderSuccess", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void a(String errorCode, String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
            return;
        }
        q.d(errorCode, "errorCode");
        q.d(errorMsg, "errorMsg");
        super.a(errorCode, errorMsg);
        ldf.d(TAG, "onRenderFailed errorCode:" + errorCode + " errorMsg:" + errorMsg);
        szx szxVar = this.e;
        if (szxVar != null) {
            szxVar.a(errorCode, errorMsg);
        }
        tbw.INSTANCE.a("onRenderFailed", errorCode, errorMsg, this.d, this.c.name(), this.b);
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        ldf.d(TAG, ljl.LAUNCHER_START_TIME);
        ljl d = this.f34016a.d();
        if (d != null) {
            d.a(ljl.LAUNCHER_START_TIME);
        }
        tbw.INSTANCE.a("launchStart", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        ldf.d(TAG, ljl.LAUNCHER_FINISH_TIME);
        ljl d = this.f34016a.d();
        if (d != null) {
            d.a(ljl.LAUNCHER_FINISH_TIME);
        }
        tbw.INSTANCE.a("launchFinish", this.d, this.c, this.b);
    }

    @Override // com.taobao.themis.external.embed.a.C0936a
    public void b(String errorCode, String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, errorCode, errorMsg});
            return;
        }
        q.d(errorCode, "errorCode");
        q.d(errorMsg, "errorMsg");
        super.b(errorCode, errorMsg);
        ldf.d(TAG, "onJSException errorCode:" + errorCode + " errorMsg:" + errorMsg);
        szx szxVar = this.e;
        if (szxVar != null) {
            szxVar.a(errorCode, errorMsg);
        }
        tbw.INSTANCE.a("onJSException", errorCode, errorMsg, this.d, this.c.name(), this.b);
    }
}
