package com.taobao.android.litecreator.model;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.themis.kernel.i;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J2\u0010\u000f\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/android/litecreator/model/LCMTopManager;", "", "()V", "REQUEST_TYPE_GET", "Lmtopsdk/mtop/domain/MethodEnum;", "getREQUEST_TYPE_GET", "()Lmtopsdk/mtop/domain/MethodEnum;", "REQUEST_TYPE_POST", "getREQUEST_TYPE_POST", RPCDataItems.SWITCH_TAG_LOG, "", "getErrorMsg", "apiName", "mtopResponse", "Lmtopsdk/mtop/domain/MtopResponse;", "request", "", "Lcom/taobao/android/litecreator/model/LCMTopRequest;", "callback", "Lcom/taobao/android/litecreator/model/ILcMTopListener;", e.REQUEST_ID, i.CDN_REQUEST_TYPE, InputFrame3.TYPE_RESPONSE, "Lcom/taobao/android/litecreator/model/LCMTopResponse;", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a */
    private static final String f13344a;
    private static final MethodEnum b;
    private static final MethodEnum c;

    static {
        kge.a(-1479211644);
        INSTANCE = new a();
        f13344a = "LCMTopManager";
        b = MethodEnum.POST;
        c = MethodEnum.GET;
    }

    private a() {
    }

    public static final /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15f63fe0", new Object[]{aVar}) : f13344a;
    }

    public static final /* synthetic */ String a(a aVar, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9eed0cb1", new Object[]{aVar, str, mtopResponse}) : aVar.a(str, mtopResponse);
    }

    public final void a(LCMTopRequest request, ILcMTopListener callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1fdf8e", new Object[]{this, request, callback});
            return;
        }
        q.d(request, "request");
        q.d(callback, "callback");
        a(null, b, request, null, callback);
    }

    public final void a(String str, MethodEnum requestType, final LCMTopRequest request, LCMTopResponse lCMTopResponse, final ILcMTopListener callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371d856d", new Object[]{this, str, requestType, request, lCMTopResponse, callback});
            return;
        }
        q.d(requestType, "requestType");
        q.d(request, "request");
        q.d(callback, "callback");
        MtopBusiness build = MtopBusiness.build(Mtop.instance(str, Globals.getApplication()), (MtopRequest) request);
        if (request.getVersion() == null) {
            request.setVersion("1.0");
        }
        if (request.isLegalRequest()) {
            String str2 = f13344a;
            u.d(str2, "request: isLegalRequest: " + request);
        }
        if (request.getExtraHeaders() != null) {
            build.mo1297headers(request.getExtraHeaders());
        }
        if (request.isHttps()) {
            build.mo1303protocol(ProtocolEnum.HTTPSECURE);
        }
        if (request.getBizId() != null) {
            build.mo1309setBizId(request.getBizId());
        }
        if (request.getTopic() != null) {
            build.mo1310setBizTopic(request.getTopic());
        }
        if (request.getPageIndex() != null) {
            Integer pageIndex = request.getPageIndex();
            q.a(pageIndex);
            build.mo1319setPageIndex(pageIndex.intValue());
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.model.LCMTopManager$request$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    mtopResponse.getApi();
                }
                if (mtopResponse != null) {
                    mtopResponse.getRetMsg();
                }
                if (mtopResponse != null) {
                    mtopResponse.getRetCode();
                }
                String a2 = a.a(a.INSTANCE);
                StringBuilder sb = new StringBuilder();
                sb.append("loading onSystemError, ");
                a aVar = a.INSTANCE;
                String apiName = LCMTopRequest.this.getApiName();
                q.b(apiName, "request.apiName");
                sb.append(a.a(aVar, apiName, mtopResponse));
                u.d(a2, sb.toString());
                callback.onSystemError(i, mtopResponse, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String a2 = a.a(a.INSTANCE);
                u.d(a2, "loading onSuccess, api = " + LCMTopRequest.this.getApiName());
                callback.onSuccess(i, mtopResponse, baseOutDo, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String a2 = a.a(a.INSTANCE);
                StringBuilder sb = new StringBuilder();
                sb.append("loading onError, ");
                a aVar = a.INSTANCE;
                String apiName = LCMTopRequest.this.getApiName();
                q.b(apiName, "request.apiName");
                sb.append(a.a(aVar, apiName, mtopResponse));
                u.d(a2, sb.toString());
                callback.onError(i, mtopResponse, obj);
            }
        });
        build.mo1305reqMethod(requestType);
        if (lCMTopResponse != null) {
            build.startRequest(lCMTopResponse.getClass());
        } else {
            build.startRequest();
        }
    }

    private final String a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99823609", new Object[]{this, str, mtopResponse});
        }
        if (mtopResponse instanceof MtopResponse) {
            StringBuilder sb = new StringBuilder();
            String retMsg = mtopResponse.getRetMsg();
            q.b(retMsg, "mtopResponse.retMsg");
            String retCode = mtopResponse.getRetCode();
            q.b(retCode, "mtopResponse.retCode");
            sb.append("api = ");
            sb.append(str);
            sb.append(" , retMsg=");
            sb.append(retMsg);
            sb.append(" , retCode=");
            sb.append(retCode);
            String sb2 = sb.toString();
            q.b(sb2, "sb.toString()");
            return sb2;
        }
        return "api = " + str;
    }
}
