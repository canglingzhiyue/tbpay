package com.taobao.themis.open.permission.sendmtop;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.utils.o;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.Regex;
import kotlin.text.d;
import kotlin.text.n;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import tb.kge;
import tb.qpv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001GB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J \u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020$2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\u0006\u0010%\u001a\u00020&H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0004H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u00020\u0004H\u0002J\u001e\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u001a\u00107\u001a\u0002062\u0006\u0010%\u001a\u00020&2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u00109\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002J\u0015\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010;H\u0002¢\u0006\u0002\u0010<J(\u0010=\u001a\u00020*2\u0006\u0010'\u001a\u00020(2\u0006\u0010>\u001a\u00020?2\u0006\u0010%\u001a\u00020&2\u0006\u0010@\u001a\u00020AH\u0002J$\u0010B\u001a\u00020*2\u0006\u0010%\u001a\u00020&2\b\u0010C\u001a\u0004\u0018\u00010(2\b\u0010D\u001a\u0004\u0018\u00010EH\u0007J\u001c\u0010F\u001a\u0004\u0018\u00010?2\u0006\u0010%\u001a\u00020&2\b\u0010C\u001a\u0004\u0018\u00010(H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u000e\u0010\"\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/taobao/themis/open/permission/sendmtop/SendMtopUtils;", "", "()V", "AUTO_LOGIN_ONLY", "", "KEY_APP_ENV", "getKEY_APP_ENV", "()Ljava/lang/String;", "setKEY_APP_ENV", "(Ljava/lang/String;)V", "KEY_APP_ID", "getKEY_APP_ID", "setKEY_APP_ID", "KEY_APP_ID_TAOBAO", "getKEY_APP_ID_TAOBAO", "setKEY_APP_ID_TAOBAO", "KEY_APP_KEY", "getKEY_APP_KEY", "setKEY_APP_KEY", "KEY_APP_VERSION", "getKEY_APP_VERSION", "setKEY_APP_VERSION", "KEY_BIZ_DATA", "getKEY_BIZ_DATA", "setKEY_BIZ_DATA", "KEY_INVOKER_ID", "getKEY_INVOKER_ID", "setKEY_INVOKER_ID", "KEY_REQ_KEY", "getKEY_REQ_KEY", "setKEY_REQ_KEY", "KEY_X_PAGE_URL", "getKEY_X_PAGE_URL", "setKEY_X_PAGE_URL", RPCDataItems.SWITCH_TAG_LOG, "buildMtopBusiness", "Lcom/taobao/tao/remotebusiness/MtopBusiness;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "sendMtopParams", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopParams;", "configMtopBussiness", "", "remoteBusiness", "genMtopHead", "", "getCloudAPIName", "type", "getCloudType", "apiName", "getDomain", "envMode", "Lmtopsdk/mtop/domain/EnvModeEnum;", "mtop", "Lmtopsdk/mtop/intf/Mtop;", "getMtopInstance", "instanceId", "getXPageUrl", "getXPageUrlParamsWitheList", "", "()[Ljava/lang/String;", "onResponse", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/themis/open/permission/sendmtop/SendMtopResponse;", "start", "", "requestAsync", "params", "callback", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopUtils$Callback;", "requestSync", "Callback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a */
    private static final String f22716a;
    private static final String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/open/permission/sendmtop/SendMtopUtils$Callback;", "", "onResult", "", "sendMtopResponse", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopResponse;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.permission.sendmtop.a$a */
    /* loaded from: classes9.dex */
    public interface InterfaceC0967a {
        void a(SendMtopResponse sendMtopResponse);
    }

    static {
        kge.a(1748022995);
        INSTANCE = new a();
        f22716a = "SendMtopUtils";
        b = "AutoLoginOnly";
        c = "x-miniapp-id-taobao";
        d = HttpHeaderConstant.X_MINI_APPKEY;
        e = HttpHeaderConstant.X_REQ_APPKEY;
        f = HttpHeaderConstant.X_OPEN_BIZ_DATA;
        g = "appId";
        h = "invokerAppId";
        i = "x-miniapp-version";
        j = HttpHeaderConstant.X_PAGE_URL;
        k = "x-miniapp-env";
    }

    private a() {
    }

    public static final /* synthetic */ void a(a aVar, SendMtopParams sendMtopParams, SendMtopResponse sendMtopResponse, f fVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280399b6", new Object[]{aVar, sendMtopParams, sendMtopResponse, fVar, new Long(j2)});
        } else {
            aVar.a(sendMtopParams, sendMtopResponse, fVar, j2);
        }
    }

    @JvmStatic
    public static final void a(final f instance, final SendMtopParams sendMtopParams, final InterfaceC0967a interfaceC0967a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a837f8f", new Object[]{instance, sendMtopParams, interfaceC0967a});
            return;
        }
        q.d(instance, "instance");
        if (interfaceC0967a == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final SendMtopResponse sendMtopResponse = new SendMtopResponse();
        if (sendMtopParams == null || StringUtils.isEmpty(sendMtopParams.getApi())) {
            sendMtopResponse.setErrorMsg(String.valueOf(2));
            sendMtopResponse.setErrorCode("invalid parameter!");
            interfaceC0967a.a(sendMtopResponse);
            return;
        }
        MtopBusiness a2 = INSTANCE.a(instance, sendMtopParams);
        if (a2 == null) {
            sendMtopResponse.setSuccess(false);
            sendMtopResponse.setErrorCode("20");
            sendMtopResponse.setErrorMsg("不支持的账号实例");
            INSTANCE.a(sendMtopParams, sendMtopResponse, instance, currentTimeMillis);
            interfaceC0967a.a(sendMtopResponse);
            return;
        }
        a2.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.themis.open.permission.sendmtop.SendMtopUtils$requestAsync$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else {
                    onError(i2, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    SendMtopResponse.this.setSuccess(false);
                    SendMtopResponse.this.setErrorCode("MTOP_RESPONSE_NULL");
                    SendMtopResponse.this.setErrorMsg("网络请求异常");
                    a.a(a.INSTANCE, sendMtopParams, SendMtopResponse.this, instance, currentTimeMillis);
                    interfaceC0967a.a(SendMtopResponse.this);
                } else {
                    SendMtopResponse sendMtopResponse2 = SendMtopResponse.this;
                    String retCode = mtopResponse.getRetCode();
                    q.b(retCode, "response.retCode");
                    sendMtopResponse2.setErrorCode(retCode);
                    SendMtopResponse sendMtopResponse3 = SendMtopResponse.this;
                    String retMsg = mtopResponse.getRetMsg();
                    q.b(retMsg, "response.retMsg");
                    sendMtopResponse3.setErrorMsg(retMsg);
                    SendMtopResponse.this.setData(mtopResponse.getBytedata());
                    SendMtopResponse.this.setSuccess(mtopResponse.isApiSuccess());
                    SendMtopResponse.this.setHeaders(mtopResponse.getHeaderFields());
                    a.a(a.INSTANCE, sendMtopParams, SendMtopResponse.this, instance, currentTimeMillis);
                    interfaceC0967a.a(SendMtopResponse.this);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    SendMtopResponse.this.setSuccess(false);
                    SendMtopResponse.this.setErrorCode("MTOP_RESPONSE_NULL");
                    SendMtopResponse.this.setErrorMsg("网络请求异常");
                    a.a(a.INSTANCE, sendMtopParams, SendMtopResponse.this, instance, currentTimeMillis);
                    interfaceC0967a.a(SendMtopResponse.this);
                } else {
                    SendMtopResponse sendMtopResponse2 = SendMtopResponse.this;
                    String retCode = mtopResponse.getRetCode();
                    q.b(retCode, "response.retCode");
                    sendMtopResponse2.setErrorCode(retCode);
                    SendMtopResponse sendMtopResponse3 = SendMtopResponse.this;
                    String retMsg = mtopResponse.getRetMsg();
                    q.b(retMsg, "response.retMsg");
                    sendMtopResponse3.setErrorMsg(retMsg);
                    SendMtopResponse.this.setData(mtopResponse.getBytedata());
                    SendMtopResponse.this.setSuccess(mtopResponse.isApiSuccess());
                    a.a(a.INSTANCE, sendMtopParams, SendMtopResponse.this, instance, currentTimeMillis);
                    interfaceC0967a.a(SendMtopResponse.this);
                    AuthUtils authUtils = AuthUtils.INSTANCE;
                    f fVar = instance;
                    String errorCode = SendMtopResponse.this.getErrorCode();
                    byte[] bytedata = mtopResponse.getBytedata();
                    q.b(bytedata, "response.bytedata");
                    authUtils.a(fVar, errorCode, com.taobao.themis.kernel.utils.f.a(new String(bytedata, d.UTF_8)));
                }
            }
        });
        a2.startRequest();
    }

    private final MtopBusiness a(f fVar, SendMtopParams sendMtopParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("7692eee4", new Object[]{this, fVar, sendMtopParams});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(sendMtopParams.getApi());
        mtopRequest.setVersion(sendMtopParams.getV());
        mtopRequest.setNeedEcode(sendMtopParams.getForceLogin());
        mtopRequest.setNeedSession(sendMtopParams.getNeedLogin());
        mtopRequest.dataParams = sendMtopParams.getDataMap();
        mtopRequest.setData(JSONObject.toJSONString(sendMtopParams.getDataMap()));
        String str = null;
        try {
            str = MtopAccountSiteUtils.getInstanceId(sendMtopParams.getAccountSite());
        } catch (Throwable th) {
            TMSLogger.c(f22716a, Log.getStackTraceString(th));
        }
        if (StringUtils.isEmpty(str)) {
            if (!StringUtils.isEmpty(sendMtopParams.getAccountSite())) {
                return null;
            }
            str = Mtop.Id.INNER;
        }
        Mtop a2 = a(fVar, str);
        if (StringUtils.isEmpty(sendMtopParams.getAccountSite())) {
            String q = k.q(fVar);
            if (!StringUtils.isEmpty(q)) {
                q.a((Object) q);
                sendMtopParams.setAccountSite(q);
            }
        }
        if (!StringUtils.isEmpty(sendMtopParams.getAccountSite())) {
            String instanceId = MtopAccountSiteUtils.getInstanceId(sendMtopParams.getAccountSite());
            if (!StringUtils.isEmpty(instanceId)) {
                a2 = a(fVar, instanceId);
            }
        }
        String str2 = a2.getMtopConfig().ttid;
        if (!StringUtils.isEmpty(sendMtopParams.getTtid())) {
            str2 = sendMtopParams.getTtid();
        }
        MtopBusiness remoteBusiness = MtopBusiness.build(a2, mtopRequest, str2);
        q.b(remoteBusiness, "remoteBusiness");
        a(fVar, remoteBusiness, sendMtopParams);
        if (sendMtopParams.getUseCache()) {
            remoteBusiness.mo1334useCache();
        }
        return remoteBusiness;
    }

    private final void a(f fVar, MtopBusiness mtopBusiness, SendMtopParams sendMtopParams) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e99df2", new Object[]{this, fVar, mtopBusiness, sendMtopParams});
            return;
        }
        if (StringUtils.isEmpty(sendMtopParams.getAccountSite()) || n.a("taobao", sendMtopParams.getAccountSite(), true)) {
            mtopBusiness.mo1314setCustomDomain(a(EnvModeEnum.ONLINE, mtopBusiness.getMtopInstance()), a(EnvModeEnum.PREPARE, mtopBusiness.getMtopInstance()), a(EnvModeEnum.TEST, mtopBusiness.getMtopInstance()));
        }
        String str = f22716a;
        TMSLogger.b(str, " userInfo:" + mtopBusiness.mtopProp.userInfo);
        for (Map.Entry<String, String> entry : sendMtopParams.getParameterMap().entrySet()) {
            mtopBusiness.mo1289addHttpQueryParameter(entry.getKey(), entry.getValue());
        }
        if (!StringUtils.isEmpty(sendMtopParams.getMpHost())) {
            mtopBusiness.mo1313setCustomDomain(sendMtopParams.getMpHost());
        }
        String dataType = sendMtopParams.getDataType();
        if (dataType == null || dataType.length() == 0) {
            z = true;
        }
        if (!z && (StringUtils.equals("json", sendMtopParams.getDataType()) || StringUtils.equals("originaljson", sendMtopParams.getDataType()))) {
            String dataType2 = sendMtopParams.getDataType();
            if (dataType2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String upperCase = dataType2.toUpperCase();
            q.b(upperCase, "(this as java.lang.String).toUpperCase()");
            mtopBusiness.mo1315setJsonType(JsonTypeEnum.valueOf(upperCase));
        }
        mtopBusiness.mo1309setBizId("60");
        if (sendMtopParams.getTimer() > 0) {
            mtopBusiness.mo1326setSocketTimeoutMilliSecond((int) sendMtopParams.getTimer());
            mtopBusiness.mo1312setConnectionTimeoutMilliSecond((int) sendMtopParams.getTimer());
        }
        mtopBusiness.mo1342showLoginUI(!q.a((Object) b, (Object) sendMtopParams.getSessionOption()));
        if (sendMtopParams.getWuaFlag() > 0) {
            mtopBusiness.mo1335useWua();
        }
        String str2 = sendMtopParams.getHeaders().get(HttpHeaderConstant.X_MINI_APPKEY);
        mtopBusiness.setOpenBiz("mini-app");
        mtopBusiness.mo1305reqMethod(StringUtils.equals(MethodEnum.GET.getMethod(), sendMtopParams.getMethod()) ? MethodEnum.GET : MethodEnum.POST);
        mtopBusiness.setMiniAppKey(str2);
        mtopBusiness.setRequestSourceAppKey(sendMtopParams.getHeaders().get(e));
        mtopBusiness.setOpenBizData(sendMtopParams.getHeaders().get(f));
        mtopBusiness.mo1297headers(sendMtopParams.getHeaders());
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(sendMtopParams.getUserAgent())) {
            hashMap.put("x-ua", com.taobao.themis.kernel.utils.a.a());
        } else {
            hashMap.put("x-ua", sendMtopParams.getUserAgent());
        }
        mtopBusiness.mo1297headers((Map<String, String>) hashMap);
        mtopBusiness.mo1321setPageUrl(sendMtopParams.getHeaders().get(j));
        if (sendMtopParams.isAddISVHeader()) {
            mtopBusiness.mtopProp.apiType = ApiTypeEnum.ISV_OPEN_API;
            mtopBusiness.mtopProp.isInnerOpen = true;
            if (!StringUtils.isEmpty(str2)) {
                mtopBusiness.mtopProp.openAppKey = str2;
            }
            mtopBusiness.mtopProp.accessToken = "";
        }
        Mtop mtopInstance = mtopBusiness.getMtopInstance();
        q.b(mtopInstance, "remoteBusiness.mtopInstance");
        String concatStr = StringUtils.concatStr(mtopInstance.getInstanceId(), str2);
        if (AuthUtils.INSTANCE.b(fVar) != null) {
            mtopsdk.xstate.a.a(concatStr, "accessToken", AuthUtils.INSTANCE.b(fVar));
        } else {
            mtopsdk.xstate.a.b(concatStr, "accessToken");
        }
    }

    private final Mtop a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("3d319c58", new Object[]{this, fVar, str});
        }
        Activity o = fVar.o();
        q.b(o, "instance.activity");
        Mtop instance = Mtop.instance(str, o.getApplicationContext());
        q.b(instance, "Mtop.instance(instanceId…ivity.applicationContext)");
        return instance;
    }

    private final String a(EnvModeEnum envModeEnum, Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2f34b5e", new Object[]{this, envModeEnum, mtop});
        }
        if (envModeEnum != null) {
            int i2 = b.$EnumSwitchMapping$0[envModeEnum.ordinal()];
            if (i2 == 1) {
                return (mtop == null || !q.a((Object) MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, (Object) mtop.getMtopConfig().mtopDomain.getDomain(envModeEnum))) ? "acs4miniapp-inner.m.taobao.com" : "guide-acs4miniapp-inner.m.taobao.com";
            } else if (i2 == 2) {
                return MtopUnitStrategy.GUIDE_PRE_DOMAIN;
            } else {
                if (i2 != 3) {
                }
            }
        }
        return "";
    }

    @JvmStatic
    public static final Map<String, String> a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba15c9a2", new Object[]{instance});
        }
        q.d(instance, "instance");
        String o = k.o(instance);
        String r = k.r(instance);
        HashMap hashMap = new HashMap();
        String a2 = k.a(instance, null, 1, null);
        String y = k.y(instance);
        hashMap.put(g, r);
        hashMap.put(c, r);
        hashMap.put(d, o);
        String str = i;
        String d2 = k.d(instance);
        if (d2 == null) {
            d2 = "";
        }
        hashMap.put(str, d2);
        hashMap.put(j, INSTANCE.b(instance));
        JSONObject jSONObject = null;
        if (k.f(instance)) {
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "templateVersion", k.i(instance));
            jSONObject2.put((JSONObject) RVStartParams.KEY_TEMPLATE_ID, a2);
            jSONObject2.put((JSONObject) "appKey", y);
        }
        hashMap.put(e, y);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) g, r);
        jSONObject4.put((JSONObject) h, a2);
        jSONObject4.put((JSONObject) "viaFusionApp", (String) true);
        if (jSONObject != null) {
            jSONObject4.put((JSONObject) "templateConfig", (String) jSONObject);
        }
        String str2 = f;
        String jSONString = jSONObject3.toJSONString();
        q.b(jSONString, "bizDataObject.toJSONString()");
        hashMap.put(str2, jSONString);
        if (com.taobao.themis.kernel.utils.n.aN()) {
            String str3 = k;
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject5;
            jSONObject6.put((JSONObject) "nbsn", (String) instance.q().getNBScene());
            jSONObject6.put((JSONObject) "nbsource", instance.q().getNBSource());
            t tVar = t.INSTANCE;
            String jSONString2 = jSONObject5.toJSONString();
            q.b(jSONString2, "JSONObject().apply {\n   …         }.toJSONString()");
            hashMap.put(str3, jSONString2);
        }
        return hashMap;
    }

    private final String b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb021032", new Object[]{this, fVar});
        }
        String g2 = fVar.g();
        q.b(g2, "instance.url");
        Uri.Builder buildUpon = Uri.parse("https://m.duanqu.com").buildUpon();
        String[] a2 = a();
        if (a2 != null) {
            for (String str : a2) {
                if (buildUpon != null) {
                    buildUpon.appendQueryParameter(str, o.a(g2, str));
                }
            }
        }
        String builder = buildUpon.toString();
        q.b(builder, "builder.toString()");
        return builder;
    }

    private final String[] a() {
        List a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this});
        }
        String[] strArr = null;
        try {
            if (StringUtils.isEmpty("sellerId,shopId,_ariver_appid")) {
                return strArr;
            }
            List<String> split = new Regex(",").split("sellerId,shopId,_ariver_appid", 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        a2 = p.c(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            a2 = p.a();
            Object[] array = a2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return (String[]) array;
        } catch (Exception e2) {
            e2.printStackTrace();
            return strArr;
        }
    }

    private final void a(SendMtopParams sendMtopParams, SendMtopResponse sendMtopResponse, f fVar, long j2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c11292", new Object[]{this, sendMtopParams, sendMtopResponse, fVar, new Long(j2)});
            return;
        }
        double currentTimeMillis = System.currentTimeMillis() - j2;
        qpv.a(fVar, sendMtopParams.getApi(), sendMtopResponse.getSuccess(), currentTimeMillis, sendMtopResponse.getErrorCode(), sendMtopResponse.getErrorMsg());
        String a3 = a(sendMtopParams.getApi());
        if (a3 == null || (a2 = a(sendMtopParams, a3)) == null) {
            return;
        }
        qpv.a(fVar, a2, a3, sendMtopResponse.getSuccess(), currentTimeMillis, sendMtopResponse.getErrorCode(), sendMtopResponse.getErrorMsg());
    }

    private final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        int hashCode = str.hashCode();
        if (hashCode == -1985558130) {
            if (!str.equals("mtop.miniapp.cloud.application.request")) {
                return null;
            }
            return "application";
        } else if (hashCode == -88243248) {
            if (!str.equals("mtop.miniapp.cloud.invoke.fc")) {
                return null;
            }
            return "fc";
        } else if (hashCode != 1559440546 || !str.equals("mtop.miniapp.cloud.invoke.top")) {
            return null;
        } else {
            return "top";
        }
    }

    private final String a(SendMtopParams sendMtopParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b71c101", new Object[]{this, sendMtopParams, str});
        }
        int hashCode = str.hashCode();
        if (hashCode == 3261) {
            if (!str.equals("fc")) {
                return null;
            }
            return sendMtopParams.getDataMap().get("fcName");
        } else if (hashCode != 115029) {
            if (hashCode != 1554253136 || !str.equals("application")) {
                return null;
            }
            return sendMtopParams.getDataMap().get("path");
        } else if (!str.equals("top")) {
            return null;
        } else {
            return sendMtopParams.getDataMap().get("apiName");
        }
    }
}
