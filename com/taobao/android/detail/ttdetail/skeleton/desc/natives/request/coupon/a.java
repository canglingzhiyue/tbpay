package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Network;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.i;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ApiProxy";
    public static final String TLOG_TAG = "MultiGWProxy";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f10851a;

    static {
        kge.a(-396724500);
        f10851a = false;
    }

    public static MtopResponse a(ApiRequest apiRequest, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("e9ddf92e", new Object[]{apiRequest, context});
        }
        if (apiRequest == null) {
            return null;
        }
        if (StringUtils.isEmpty(apiRequest.httpUrl)) {
            return b(apiRequest, context);
        }
        return c(apiRequest, context);
    }

    public static MtopResponse b(ApiRequest apiRequest, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("236b4aef", new Object[]{apiRequest, context});
        }
        MtopBuilder mo1305reqMethod = Mtop.instance(context).build((MtopRequest) apiRequest, e.c()).mo1305reqMethod(apiRequest.post ? MethodEnum.POST : MethodEnum.GET);
        if (apiRequest.wua) {
            mo1305reqMethod = mo1305reqMethod.mo1335useWua();
        }
        return mo1305reqMethod.syncRequest();
    }

    public static MtopResponse c(ApiRequest apiRequest, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5cf89cb0", new Object[]{apiRequest, context});
        }
        Network httpNetwork = (f10851a || apiRequest.httpUrl.contains("_forceHttp")) ? new HttpNetwork(context) : new DegradableNetwork(context);
        MtopResponse mtopResponse = new MtopResponse();
        try {
            RequestImpl requestImpl = new RequestImpl(apiRequest.httpUrl);
            if (httpNetwork instanceof DegradableNetwork) {
                int a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.a.a(IDecisionResult.ENGINE_ERROR, 5000);
                requestImpl.setConnectTimeout(a2);
                requestImpl.setReadTimeout(a2);
            }
            i.a("MultiGWProxy", "Send Request");
            Response syncSend = httpNetwork.syncSend(requestImpl, null);
            if (syncSend == null || syncSend.getBytedata() == null || syncSend.getBytedata().length <= 0) {
                i.a("MultiGWProxy", "[EmptyByteData]|repeat request");
                syncSend = new HttpNetwork(context).syncSend(requestImpl, null);
            }
            if (syncSend != null) {
                mtopResponse.setBytedata(syncSend.getBytedata());
                mtopResponse.setRetCode("SUCCESS");
                mtopResponse.setRetMsg(syncSend.getDesc());
                mtopResponse.setHeaderFields(syncSend.getConnHeadFields());
                apiRequest.response = syncSend;
                i.a("MultiGWProxy", "[ResponseReturn]|set byte data and retcode ERRCODE_SUCCESS");
                return mtopResponse;
            }
            i.a("MultiGWProxy", "[NullResponse]");
            return mtopResponse;
        } catch (Exception e) {
            TBSdkLog.e("ApiProxy", "invoke httpClient.syncCall error.", e);
            i.a("MultiGWProxy", "[ExceptionInSendingRequest]|" + e.toString());
            return mtopResponse;
        }
    }
}
