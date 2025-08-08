package com.taobao.themis.inside.adapter;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.utils.f;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.d;
import kotlin.text.n;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import tb.kge;
import tb.qpt;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002Jv\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0097\u0001\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\n2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u001d0#H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u001eH\u0016Jt\u0010&\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taobao/themis/inside/adapter/MtopAdapterImpl;", "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter;", "()V", "mHandler", "Landroid/os/Handler;", "mHandlerThread", "Landroid/os/HandlerThread;", "buildMtopClient", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "apiName", "", "apiVersion", "params", "", "", "method", "needLogin", "", "traceId", MtopJSBridge.MtopJSParam.ACCOUNT_SITE, "headers", "oriUrl", "buildResponse", "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", InputFrame3.TYPE_RESPONSE, "Lmtopsdk/mtop/domain/MtopResponse;", "getMtopInstance", "Lmtopsdk/mtop/intf/Mtop;", "requestAsync", "", "Lcom/taobao/themis/kernel/network/RequestParams;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$RequestListener;", "sourceUrl", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "requestSync", "Companion", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class MtopAdapterImpl implements IMtopInnerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a */
    private final HandlerThread f22427a = new HandlerThread("mtopAsync");
    private Handler b;

    static {
        kge.a(-1455018038);
        kge.a(1604374157);
        Companion = new a(null);
    }

    public MtopAdapterImpl() {
        this.f22427a.start();
        this.b = new Handler(this.f22427a.getLooper());
    }

    public static final /* synthetic */ IMtopInnerAdapter.Response access$buildResponse(MtopAdapterImpl mtopAdapterImpl, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("7c474e99", new Object[]{mtopAdapterImpl, mtopResponse}) : mtopAdapterImpl.a(mtopResponse);
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public IMtopInnerAdapter.Response requestSync(RequestParams params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("4a28a221", new Object[]{this, params});
        }
        q.d(params, "params");
        String str = params.api;
        String str2 = str == null ? "" : str;
        String str3 = params.version;
        return requestSync(str2, str3 == null ? "" : str3, params.toMap(), params.method, params.needLogin, params.accountSite, params.headers, params.traceId, params.oriUrl);
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public IMtopInnerAdapter.Response requestSync(String apiName, String apiVersion, Map<String, Object> map, String method, boolean z, String str, Map<String, String> map2, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("cc7ce31e", new Object[]{this, apiName, apiVersion, map, method, new Boolean(z), str, map2, str2, str3});
        }
        q.d(apiName, "apiName");
        q.d(apiVersion, "apiVersion");
        q.d(method, "method");
        return a(a(apiName, apiVersion, map, method, z, str2, str, map2, str3).syncRequest());
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public void requestAsync(RequestParams params, IMtopInnerAdapter.b listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1499af", new Object[]{this, params, listener});
            return;
        }
        q.d(params, "params");
        q.d(listener, "listener");
        String str = params.api;
        String str2 = str == null ? "" : str;
        String str3 = params.version;
        requestAsync(str2, str3 == null ? "" : str3, params.toMap(), params.method, params.needLogin, params.accountSite, params.headers, params.traceId, params.oriUrl, new MtopAdapterImpl$requestAsync$1(listener));
    }

    @Override // com.taobao.themis.kernel.network.IMtopInnerAdapter
    public void requestAsync(final String apiName, String apiVersion, Map<String, Object> map, String method, boolean z, String str, Map<String, String> map2, String str2, String str3, final rul<? super IMtopInnerAdapter.Response, t> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9ffa89", new Object[]{this, apiName, apiVersion, map, method, new Boolean(z), str, map2, str2, str3, callback});
            return;
        }
        q.d(apiName, "apiName");
        q.d(apiVersion, "apiVersion");
        q.d(method, "method");
        q.d(callback, "callback");
        MtopBusiness a2 = a(apiName, apiVersion, map, method, z, str2, str, map2, str3);
        final long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.b("MtopAdapterImpl", "api " + apiName + " requestInnerASync start");
        a2.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.themis.inside.adapter.MtopAdapterImpl$requestAsync$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                callback.mo2421invoke(MtopAdapterImpl.access$buildResponse(MtopAdapterImpl.this, mtopResponse));
                TMSLogger.b("MtopAdapterImpl", "api " + apiName + " requestInnerASync success, duration: " + (currentTimeMillis - System.currentTimeMillis()));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("api ");
                sb.append(apiName);
                sb.append(" requestInnerASync failed, code:");
                String str4 = null;
                sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                sb.append(", msg:");
                if (mtopResponse != null) {
                    str4 = mtopResponse.getRetMsg();
                }
                sb.append(str4);
                sb.append(", duration: ");
                sb.append(currentTimeMillis - System.currentTimeMillis());
                TMSLogger.d("MtopAdapterImpl", sb.toString());
                callback.mo2421invoke(MtopAdapterImpl.access$buildResponse(MtopAdapterImpl.this, mtopResponse));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }
        });
        a2.startRequest();
    }

    private final MtopBusiness a(String str, String str2, Map<String, Object> map, String str3, boolean z, String str4, String str5, Map<String, String> map2, String str6) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("679883ba", new Object[]{this, str, str2, map, str3, new Boolean(z), str4, str5, map2, str6});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSONObject.toJSONString(map));
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(z);
        mtopRequest.setNeedSession(z);
        MtopBusiness mtopBusiness = MtopBusiness.build(a(str5), mtopRequest);
        if (map2 != null && !map2.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            mtopBusiness.mo1297headers(map2);
        }
        Locale locale = Locale.ROOT;
        q.b(locale, "Locale.ROOT");
        if (str3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = str3.toUpperCase(locale);
        q.b(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        mtopBusiness.mo1305reqMethod(MethodEnum.valueOf(upperCase));
        mtopBusiness.mo1309setBizId("60");
        mtopBusiness.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        if (StringUtils.isEmpty(str5) || q.a((Object) "taobao", (Object) str5)) {
            mtopBusiness.mo1314setCustomDomain(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, "");
        }
        if (str4 != null) {
            mtopBusiness.mo1318setPTraceId(str4);
        }
        mtopBusiness.mo1296handler(this.b);
        a aVar = Companion;
        if (str6 == null) {
            str6 = "";
        }
        mtopBusiness.mo1321setPageUrl(aVar.a(str6));
        mtopBusiness.mo1320setPageName("");
        q.b(mtopBusiness, "mtopBusiness");
        return mtopBusiness;
    }

    private final Mtop a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("e9ca387d", new Object[]{this, str});
        }
        if (str == null) {
            str = "";
        }
        String instanceId = MtopAccountSiteUtils.getInstanceId(str);
        if (instanceId == null) {
            instanceId = Mtop.Id.INNER;
        }
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…nmentService::class.java)");
        Mtop instance = Mtop.instance(instanceId, ((IEnvironmentService) a2).getApplicationContext());
        q.b(instance, "Mtop.instance(\n         …licationContext\n        )");
        return instance;
    }

    private final IMtopInnerAdapter.Response a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopInnerAdapter.Response) ipChange.ipc$dispatch("c56fe46", new Object[]{this, mtopResponse});
        }
        IMtopInnerAdapter.Response response = new IMtopInnerAdapter.Response();
        if (mtopResponse == null) {
            response.setSuccess(false);
            response.setErrorCode("MTOP_RESPONSE_NULL");
            response.setErrorMsg("网络请求异常");
            return response;
        } else if (mtopResponse.getBytedata() == null) {
            TMSLogger.b("[mtop]", "response data is null");
            response.setSuccess(false);
            response.setErrorCode(mtopResponse.getRetCode());
            response.setErrorMsg(mtopResponse.getRetMsg());
            return response;
        } else {
            if (mtopResponse.isApiSuccess()) {
                response.setSuccess(true);
                byte[] bytedata = mtopResponse.getBytedata();
                q.b(bytedata, "response.bytedata");
                response.setData(f.a(new String(bytedata, d.UTF_8)));
                response.setRawData(mtopResponse.getBytedata());
            } else {
                response.setSuccess(false);
                response.setErrorCode(mtopResponse.getRetCode());
                response.setErrorMsg(mtopResponse.getRetMsg());
                byte[] bytedata2 = mtopResponse.getBytedata();
                q.b(bytedata2, "response.bytedata");
                response.setData(f.a(new String(bytedata2, d.UTF_8)));
                response.setRawData(mtopResponse.getBytedata());
            }
            return response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/inside/adapter/MtopAdapterImpl$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "xPageUrlParamsWitheList", "", "getXPageUrlParamsWitheList", "()Ljava/util/List;", "getXPageUrl", "originUrl", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1083991698);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final String a(String originUrl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, originUrl});
            }
            q.d(originUrl, "originUrl");
            Uri.Builder buildUpon = Uri.parse("https://m.duanqu.com").buildUpon();
            for (String str : a()) {
                if (buildUpon != null) {
                    buildUpon.appendQueryParameter(str, com.taobao.themis.utils.o.a(originUrl, str));
                }
            }
            String builder = buildUpon.toString();
            q.b(builder, "builder.toString()");
            return builder;
        }

        private final List<String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
            }
            try {
                String config = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigByGroupAndName(i.GROUP_ARIVER_COMMON_CONFIG, "xpageUrlParamsWitheList", "sellerId,shopId,isShop,_ariver_appid");
                q.b(config, "config");
                return n.b((CharSequence) config, new String[]{","}, false, 0, 6, (Object) null);
            } catch (Exception e) {
                e.printStackTrace();
                return p.a();
            }
        }
    }
}
