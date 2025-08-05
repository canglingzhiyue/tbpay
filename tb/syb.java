package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.lji;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/infoflow/preload/PreloadFirstChunkService;", "", "mJsBridgeServiceImpl", "Lcom/taobao/infoflow/jsbridge/IJsBridgeService;", "mCallBack", "Lcom/taobao/tao/topmultitab/protocol/IHomeTabContainerCallBack;", "mWebViewProvider", "Lcom/taobao/infoflow/webview/WebViewProvider;", "(Lcom/taobao/infoflow/jsbridge/IJsBridgeService;Lcom/taobao/tao/topmultitab/protocol/IHomeTabContainerCallBack;Lcom/taobao/infoflow/webview/WebViewProvider;)V", "mPreloadJsFeature", "Lcom/taobao/infoflow/jsbridge/IJsBridgeService$IJsNativeFeature;", "createPreloadJsFeature", "getMultiTabPageUrlList", "", "", "jsParams", "Lcom/alibaba/fastjson/JSONObject;", "onDestroyService", "", "preloadFirstChunk", "pageUrlList", "Companion", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class syb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String FEATURE_NAME = "preloadFirstChunk";
    public static final String PRELOAD_FIRST_CHUNK_INTERVAL_TIME = "preloadFirstChunkIntervalTime";
    public static final String PRELOAD_FIRST_CHUNK_MAX_SIZE = "preloadFirstChunkMaxSize";
    public static final String TAG = "PreloadFirstChunkService";

    /* renamed from: a  reason: collision with root package name */
    private lji.a f33935a;
    private final lji b;
    private final com.taobao.tao.topmultitab.protocol.c c;
    private final mvc d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;

        public c(List list, int i) {
            this.b = list;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                syb.b(syb.this).b((String) this.b.get(this.c));
            }
        }
    }

    static {
        kge.a(1853830325);
        Companion = new a(null);
    }

    public syb(lji mJsBridgeServiceImpl, com.taobao.tao.topmultitab.protocol.c mCallBack, mvc mWebViewProvider) {
        q.d(mJsBridgeServiceImpl, "mJsBridgeServiceImpl");
        q.d(mCallBack, "mCallBack");
        q.d(mWebViewProvider, "mWebViewProvider");
        this.b = mJsBridgeServiceImpl;
        this.c = mCallBack;
        this.d = mWebViewProvider;
        this.f33935a = b();
        this.b.a(this.f33935a);
    }

    public static final /* synthetic */ com.taobao.tao.topmultitab.protocol.c a(syb sybVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.topmultitab.protocol.c) ipChange.ipc$dispatch("1cf625a3", new Object[]{sybVar}) : sybVar.c;
    }

    public static final /* synthetic */ List a(syb sybVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ccfb17f3", new Object[]{sybVar, jSONObject}) : sybVar.a(jSONObject);
    }

    public static final /* synthetic */ void a(syb sybVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8ebb8d", new Object[]{sybVar, list});
        } else {
            sybVar.a(list);
        }
    }

    public static final /* synthetic */ mvc b(syb sybVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvc) ipChange.ipc$dispatch("aa0d322f", new Object[]{sybVar}) : sybVar.d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/infoflow/preload/PreloadFirstChunkService$Companion;", "", "()V", "FEATURE_NAME", "", "PRELOAD_FIRST_CHUNK_INTERVAL_TIME", "PRELOAD_FIRST_CHUNK_MAX_SIZE", RPCDataItems.SWITCH_TAG_LOG, "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-749698627);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.b(this.f33935a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/taobao/infoflow/preload/PreloadFirstChunkService$createPreloadJsFeature$1", "Lcom/taobao/infoflow/jsbridge/IJsBridgeService$IJsNativeFeature;", "executeFeature", "", "method", "", "jsParams", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/taobao/infoflow/jsbridge/IJsBridgeService$IJsNativeFeature$JsCallback;", "getFeatureName", "information_flow_tb_campaign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements lji.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.lji.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "preloadFirstChunk";
        }

        public b() {
        }

        @Override // tb.lji.a
        public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, callback});
                return;
            }
            q.d(callback, "callback");
            if (!tbt.a(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), tbt.H5_PRELOAD_FIRST_CHUNK)) {
                ldf.d(syb.TAG, "uc降级场景不预加载");
                callback.a("uc降级场景不预加载");
            } else if (TextUtils.equals("topMutliTab", syb.a(syb.this).g())) {
                List<String> b = syb.a(syb.this).b("getSelectPopWebUrl");
                syb.a(syb.this, b);
                ldf.d(syb.TAG, "下拉框预加载，链接条数有：" + b.size());
                callback.b("下拉框预加载，链接条数有：" + b.size());
            } else {
                List a2 = syb.a(syb.this, jSONObject);
                syb.a(syb.this, a2);
                callback.b("实验室版本预加载，链接条数有：" + a2.size());
                ldf.d(syb.TAG, "实验室版本，链接条数有：" + a2.size());
            }
        }
    }

    private final lji.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("4c6e2e55", new Object[]{this}) : new b();
    }

    private final List<String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        String string = jSONObject != null ? jSONObject.getString("preloadFirstChunkStrategy") : null;
        ldf.d(TAG, "实验室版本，当前策略是：" + string);
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1793320594) {
                if (hashCode == 1195314547) {
                    if (string.equals("getLeftTabWebUrl")) {
                        List<String> b2 = this.c.b("getLeftTabWebUrl");
                        q.b(b2, "mCallBack.getWebPerforma…nst.GET_LEFT_TAB_WEB_URL)");
                        return b2;
                    }
                } else if (hashCode == 2061403050 && string.equals("getRightTabWebUrl")) {
                    List<String> b3 = this.c.b("getRightTabWebUrl");
                    q.b(b3, "mCallBack.getWebPerforma…st.GET_RIGHT_TAB_WEB_URL)");
                    return b3;
                }
            } else if (string.equals("getLeftAndRightTabWebUrl")) {
                List<String> b4 = this.c.b("getLeftAndRightTabWebUrl");
                q.b(b4, "mCallBack.getWebPerforma…FT_AND_RIGHT_TAB_WEB_URL)");
                return b4;
            }
        }
        return new ArrayList();
    }

    private final void a(List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z) {
            ldf.d(TAG, "pageUrlList 为空或者size = 0");
            return;
        }
        int min = Math.min(ldj.a(PRELOAD_FIRST_CHUNK_MAX_SIZE, 5), list.size());
        int a2 = ldj.a(PRELOAD_FIRST_CHUNK_INTERVAL_TIME, 1000);
        for (int i = 0; i < min; i++) {
            ljd.a().a(new c(list, i), a2);
        }
    }
}
