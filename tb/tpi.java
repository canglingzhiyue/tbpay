package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.MtopResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/taobao/android/icart/broadcast/wvprocessor/impl/CartWVRequestNextPageProcessor;", "Lcom/taobao/android/icart/broadcast/wvprocessor/ICartWVProcessor;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "process", "", "presenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "params", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "Companion", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class tpi implements tph {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String actionType = "requestSubProtocol#queryNextPage";

    /* renamed from: a  reason: collision with root package name */
    private final String f34249a = "CartWVRequestNextPageProcessor";

    static {
        kge.a(749742412);
        kge.a(-929190291);
        Companion = new a(null);
    }

    public static final /* synthetic */ String a(tpi tpiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("504c59b5", new Object[]{tpiVar}) : tpiVar.f34249a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/icart/broadcast/wvprocessor/impl/CartWVRequestNextPageProcessor$Companion;", "", "()V", "actionType", "", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a {
        static {
            kge.a(1657136532);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.tph
    public boolean a(bbz presenter, JSONObject params, WVCallBackContext callback) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19963093", new Object[]{this, presenter, params, callback})).booleanValue();
        }
        q.d(presenter, "presenter");
        q.d(params, "params");
        q.d(callback, "callback");
        JSONObject jSONObject = params.getJSONObject("exParams");
        if (jSONObject == null || (string = params.getString("renderRoot")) == null) {
            return false;
        }
        jqg.a(this.f34249a, "process#params", params);
        new bcg(presenter).a(false, jSONObject, (jnv) new b(callback, string));
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0002\b\u0003\u0018\u00010\rH\u0016JB\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¨\u0006\u0012"}, d2 = {"com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVRequestNextPageProcessor$process$1", "Lcom/taobao/android/ultron/datamodel/AbsRequestCallback;", "onError", "", i.CDN_REQUEST_TYPE, "", InputFrame3.TYPE_RESPONSE, "Lmtopsdk/mtop/domain/MtopResponse;", "requestContext", "", "parseFailed", "", "extraData", "", "", "onSuccess", "dmContext", "Lcom/taobao/android/ultron/datamodel/IDMContext;", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class b extends jnv {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WVCallBackContext b;
        public final /* synthetic */ String c;

        public b(WVCallBackContext wVCallBackContext, String str) {
            this.b = wVCallBackContext;
            this.c = str;
        }

        @Override // tb.joc
        public void a(int i, MtopResponse response, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), response, obj, new Boolean(z), map});
                return;
            }
            q.d(response, "response");
            WVCallBackContext wVCallBackContext = this.b;
            r rVar = r.RET_FAIL;
            rVar.a(response.getRetCode(), response.getRetMsg());
            t tVar = t.INSTANCE;
            wVCallBackContext.error(rVar);
            jqg.a(tpi.a(tpi.this), "error,", response.getRetMsg());
        }

        @Override // tb.joc
        public void a(int i, MtopResponse response, Object obj, jny jnyVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), response, obj, jnyVar, map});
                return;
            }
            q.d(response, "response");
            WVCallBackContext wVCallBackContext = this.b;
            r rVar = r.RET_SUCCESS;
            if (jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b) {
                com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
                jqg.a(tpi.a(tpi.this), "onSuccess#fullProtocolData", bVar.M());
                JSONObject a2 = ipo.INSTANCE.a(bVar.M(), this.c);
                if (a2 == null) {
                    return;
                }
                jqg.a(tpi.a(tpi.this), "onSuccess#subProtocol", a2);
                rVar.a("protocol", a2.toJSONString());
            }
            t tVar = t.INSTANCE;
            wVCallBackContext.success(rVar);
            jqg.b(tpi.a(tpi.this), "success");
        }
    }
}
