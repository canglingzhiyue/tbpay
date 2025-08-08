package com.alibaba.android.nextrpc.stream.internal;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.alibaba.android.nextrpc.stream.internal.mtop.StreamMtopRequestClient;
import com.alibaba.android.nextrpc.stream.internal.mtop.a;
import com.alibaba.android.nextrpc.stream.internal.mtop.b;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.android.nextrpc.stream.request.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback;
import com.taobao.tao.stream.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.ada;
import tb.bfp;
import tb.bft;
import tb.bfu;
import tb.bfw;
import tb.joq;
import tb.mto;

/* loaded from: classes2.dex */
public class StreamNextRpcRequestImpl implements IStreamMtopRequestCallback, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTACHED_RESPONSE_HEADER_ERROR_CODE = "errorCode";
    private static final String ATTACHED_RESPONSE_HEADER_ERROR_MSG = "errorMsg";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_COUNT = "seqCount";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_ID = "reqId";
    private static final String ATTACHED_RESPONSE_HEADER_REQ_NUM = "seqNum";
    private static final String ATTACHED_RESPONSE_HEADER_SUCCESS = "success";
    private static final String MAIN_REQUEST_HEADER_REQ_ID = "nextrpc-req-id";
    private static final String TAG = "StreamNextRpcRequestImpl";
    private byte[] errorByteData;
    private String[] errorRet;
    private boolean isMainResponseFinish;
    private String mApiName;
    private String mVersion;
    private int mainNum;
    private d nextRpcResponseCallback;
    private String requestHeaderId;
    private String requestTime;
    private b responseStatusListener;
    private String retCode;
    private String retMsg;
    private Handler scheduleTimeoutHandler = new Handler(Looper.getMainLooper());
    private long nextrpcTimeout = 30000;
    private Map<String, bfu> attachedQueueMap = new HashMap();
    private Map<String, List<AttachedResponse>> attachedResponseMap = new HashMap();

    @Override // com.taobao.tao.stream.IMtopStreamListener
    @Deprecated
    public void onReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
        }
    }

    public static /* synthetic */ String access$000(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a907b7d8", new Object[]{streamNextRpcRequestImpl}) : streamNextRpcRequestImpl.mApiName;
    }

    public static /* synthetic */ String access$100(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78c7eb77", new Object[]{streamNextRpcRequestImpl}) : streamNextRpcRequestImpl.requestHeaderId;
    }

    public static /* synthetic */ String access$200(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48881f16", new Object[]{streamNextRpcRequestImpl}) : streamNextRpcRequestImpl.mVersion;
    }

    public static /* synthetic */ d access$300(StreamNextRpcRequestImpl streamNextRpcRequestImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a030f2c7", new Object[]{streamNextRpcRequestImpl}) : streamNextRpcRequestImpl.nextRpcResponseCallback;
    }

    public static /* synthetic */ void access$400(StreamNextRpcRequestImpl streamNextRpcRequestImpl, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83480a5", new Object[]{streamNextRpcRequestImpl, str, str2, map});
        } else {
            streamNextRpcRequestImpl.userTracker(str, str2, map);
        }
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public String request(StreamNextRpcRequest streamNextRpcRequest, d dVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39e43774", new Object[]{this, streamNextRpcRequest, dVar, bVar});
        }
        this.nextRpcResponseCallback = dVar;
        this.responseStatusListener = bVar;
        this.requestHeaderId = bfw.a();
        this.mApiName = streamNextRpcRequest.getMtopBusiness().request.getApiName();
        this.mVersion = streamNextRpcRequest.getMtopBusiness().request.getVersion();
        if (streamNextRpcRequest.getAllTimeOutSeconds() > mto.a.GEO_NOT_SUPPORT) {
            this.nextrpcTimeout = (long) (streamNextRpcRequest.getAllTimeOutSeconds() * 1000.0d);
        }
        if (this.nextrpcTimeout < streamNextRpcRequest.getMtopBusiness().mtopProp.connTimeout) {
            streamNextRpcRequest.getMtopBusiness().mo1312setConnectionTimeoutMilliSecond((int) this.nextrpcTimeout);
        }
        Map<String, String> requestHeaders = streamNextRpcRequest.getMtopBusiness().mtopProp.getRequestHeaders();
        if (requestHeaders == null) {
            requestHeaders = new HashMap<>();
        }
        requestHeaders.put(MAIN_REQUEST_HEADER_REQ_ID, this.requestHeaderId);
        streamNextRpcRequest.getMtopBusiness().mtopProp.setRequestHeaders(requestHeaders);
        this.requestTime = String.valueOf(System.currentTimeMillis());
        ada.a(TAG, "真正发起网络请求", System.currentTimeMillis(), null);
        new StreamMtopRequestClient(streamNextRpcRequest.getMtopBusiness()).a(this);
        scheduleTimeout();
        HashMap hashMap = new HashMap();
        hashMap.put(joq.STAGE_NETWORK, this.requestTime);
        hashMap.put("useAttachedQueue", "true");
        try {
            userTracker("nextrpc-main-request", "", hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
            UnifyLog.d(TAG, "UserTracker exception !", new Object[0]);
        }
        return this.requestHeaderId;
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public void onReceiveData(StreamRemoteMainResponse streamRemoteMainResponse, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bf9f64", new Object[]{this, streamRemoteMainResponse, baseOutDo, new Integer(i), obj});
            return;
        }
        com.taobao.tao.stream.d mtopStreamResponse = streamRemoteMainResponse.getMtopStreamResponse();
        if (StringUtils.isEmpty(mtopStreamResponse.c)) {
            mtopStreamResponse.c = this.mApiName;
        }
        if (StringUtils.isEmpty(mtopStreamResponse.d)) {
            mtopStreamResponse.d = this.mVersion;
        }
        if (!streamRemoteMainResponse.isBizSuccess()) {
            this.errorByteData = mtopStreamResponse.e;
            this.errorRet = mtopStreamResponse.h;
            this.retCode = mtopStreamResponse.f21113a;
            this.retMsg = mtopStreamResponse.b;
            UnifyLog.d(TAG, "onReceiveData biz error api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum + ",ret=" + Arrays.toString(mtopStreamResponse.h) + ",retCode=" + mtopStreamResponse.f21113a + ",retMsg=" + mtopStreamResponse.b, new Object[0]);
            return;
        }
        this.mainNum++;
        streamRemoteMainResponse.setMainNum(this.mainNum);
        String attachedResponseStat = streamRemoteMainResponse.getAttachedResponseStat();
        if (StringUtils.isEmpty(attachedResponseStat)) {
            this.nextRpcResponseCallback.a(streamRemoteMainResponse, null);
            if (attachedResponseStat == null) {
                z = false;
            }
            receiveDataUt(z, streamRemoteMainResponse.getTraceId(), false);
            return;
        }
        bft bftVar = new bft();
        this.attachedQueueMap.put(attachedResponseStat, bftVar);
        bftVar.a(streamRemoteMainResponse);
        for (String str : JSONObject.parseObject(attachedResponseStat).keySet()) {
            List<AttachedResponse> list = this.attachedResponseMap.get(str);
            if (list != null) {
                for (AttachedResponse attachedResponse : list) {
                    bftVar.a(attachedResponse);
                }
            }
        }
        ArrayList arrayList = new ArrayList(bftVar.c());
        bftVar.a();
        this.nextRpcResponseCallback.a(streamRemoteMainResponse, arrayList);
        receiveDataUt(true, streamRemoteMainResponse.getTraceId(), isAllAttachedResponse());
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        this.mainNum++;
        this.isMainResponseFinish = true;
        StreamOtherResponse streamOtherResponse = new StreamOtherResponse(bVar, this.mApiName, this.mVersion, i, obj);
        streamOtherResponse.setByteData(this.errorByteData);
        streamOtherResponse.setRet(this.errorRet);
        streamOtherResponse.setMainNum(this.mainNum);
        streamOtherResponse.setRetCode(this.retCode);
        streamOtherResponse.setRetMsg(this.retMsg);
        streamOtherResponse.setMappingCode(bVar.e);
        streamOtherResponse.setResponseCode(bVar.f);
        UnifyLog.d(TAG, "onError api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum + ",ret=" + Arrays.toString(this.errorRet) + ",retCode=" + bVar.b + ",retMsg=" + bVar.c, new Object[0]);
        this.errorByteData = null;
        this.errorRet = null;
        this.nextRpcResponseCallback.a(streamOtherResponse);
        if (isAllAttachedResponse()) {
            streamOtherResponse.setFinishType("MTOP_FAILURE");
            this.nextRpcResponseCallback.c(streamOtherResponse);
            release();
        }
        userTracker("nextrpc-main-response-failed", null, getRequestTimeTraceParams());
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onFinish(c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            return;
        }
        this.isMainResponseFinish = true;
        StreamOtherResponse streamOtherResponse = new StreamOtherResponse(cVar, this.mApiName, this.mVersion, i, obj);
        streamOtherResponse.setMainNum(this.mainNum);
        streamOtherResponse.setMappingCode(cVar.e);
        streamOtherResponse.setResponseCode(cVar.f);
        UnifyLog.d(TAG, "onFinish api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",mainNum=" + this.mainNum, new Object[0]);
        if (isAllAttachedResponse()) {
            this.nextRpcResponseCallback.c(streamOtherResponse);
            release();
        }
        userTracker("nextrpc-main-response-finish", null, getRequestTimeTraceParams());
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback
    public void onReceiveAccsData(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646e216b", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        AttachedResponse attachedResponse = new AttachedResponse(jSONObject.getString(ATTACHED_RESPONSE_HEADER_REQ_ID), str3, parseHeaders(jSONObject), jSONObject.getIntValue(ATTACHED_RESPONSE_HEADER_REQ_NUM), jSONObject.getIntValue(ATTACHED_RESPONSE_HEADER_REQ_COUNT), jSONObject.getBooleanValue("success"), jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"));
        String bizName = attachedResponse.getBizName();
        bfu bfuVar = null;
        for (String str4 : this.attachedQueueMap.keySet()) {
            if (JSONObject.parseObject(str4).containsKey(bizName)) {
                bfuVar = this.attachedQueueMap.get(str4);
            }
        }
        Map<String, String> a2 = com.alibaba.android.nextrpc.internal.utils.b.a(attachedResponse.getHeaders());
        a2.putAll(getRequestTimeTraceParams());
        userTracker("nextrpc-attached-response", "", a2);
        if (bfuVar == null) {
            List<AttachedResponse> list = this.attachedResponseMap.get(bizName);
            if (list == null) {
                list = new ArrayList<>();
                this.attachedResponseMap.put(bizName, list);
            }
            list.add(attachedResponse);
            return;
        }
        bfuVar.a(attachedResponse);
        bfuVar.a();
        if (attachedResponse.isSucceed().booleanValue()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(attachedResponse);
            this.nextRpcResponseCallback.a(arrayList);
        }
        if (!isAllAttachedResponse()) {
            return;
        }
        if (this.isMainResponseFinish) {
            this.nextRpcResponseCallback.c(new StreamOtherResponse(null, this.mApiName, this.mVersion, -1, null));
        }
        release();
    }

    private void scheduleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10099a51", new Object[]{this});
        } else {
            this.scheduleTimeoutHandler.postDelayed(new Runnable() { // from class: com.alibaba.android.nextrpc.stream.internal.StreamNextRpcRequestImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UnifyLog.d(StreamNextRpcRequestImpl.TAG, "api=" + StreamNextRpcRequestImpl.access$000(StreamNextRpcRequestImpl.this) + ",requestId=" + StreamNextRpcRequestImpl.access$100(StreamNextRpcRequestImpl.this) + ",nextrpc timeout", new Object[0]);
                    StreamNextRpcRequestImpl.this.release();
                    StreamOtherResponse streamOtherResponse = new StreamOtherResponse(null, StreamNextRpcRequestImpl.access$000(StreamNextRpcRequestImpl.this), StreamNextRpcRequestImpl.access$200(StreamNextRpcRequestImpl.this), -1, null);
                    streamOtherResponse.setFinishType("TIMEOUT");
                    StreamNextRpcRequestImpl.access$300(StreamNextRpcRequestImpl.this).c(streamOtherResponse);
                    StreamNextRpcRequestImpl.access$400(StreamNextRpcRequestImpl.this, "nextrpc-timeout", null, null);
                }
            }, this.nextrpcTimeout);
        }
    }

    private void cancelScheduleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da89d77", new Object[]{this});
        } else {
            this.scheduleTimeoutHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.alibaba.android.nextrpc.stream.internal.mtop.a
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.responseStatusListener.a(this.requestHeaderId);
        cancelScheduleTimeout();
        UnifyLog.d(TAG, "api=" + this.mApiName + ",requestId=" + this.requestHeaderId + ",release nextrpc", new Object[0]);
    }

    private Map<String, List<String>> parseHeaders(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b46ba18b", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            throw new IllegalArgumentException("accs header can not be null");
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        try {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key)) {
                    List arrayList = new ArrayList();
                    if (value instanceof JSONArray) {
                        arrayList = JSONObject.parseArray(((JSONArray) value).toJSONString(), String.class);
                    }
                    if (value instanceof String) {
                        arrayList.add((String) value);
                    }
                    hashMap.put(key, arrayList);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private boolean isAllAttachedResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8d3ac7", new Object[]{this})).booleanValue();
        }
        for (bfu bfuVar : this.attachedQueueMap.values()) {
            if (!bfuVar.b()) {
                return false;
            }
        }
        return true;
    }

    private void userTracker(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9c07d", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MtopStreamRequestCallback.IS_STREAM, "true");
        bfp.a(str, this.mApiName, str2, map);
    }

    private Map<String, String> getRequestTimeTraceParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd5c65c1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(joq.STAGE_NETWORK, this.requestTime);
        hashMap.put("currentTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(ATTACHED_RESPONSE_HEADER_REQ_NUM, String.valueOf(this.mainNum));
        return hashMap;
    }

    private void receiveDataUt(boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff2ea9", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isAllAttachedResponse", z2 ? "1" : "0");
        hashMap.put("traceId", str);
        hashMap.putAll(getRequestTimeTraceParams());
        userTracker("nextrpc-main-response-success", z ? "hasNextData" : "noNextData", hashMap);
    }
}
