package com.taobao.android.detail.ttdetail.request.stream;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.ag;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.stream.c;
import com.taobao.tao.stream.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arz;
import tb.kge;
import tb.smx;

/* loaded from: classes5.dex */
public class MtopStreamRequestCallback implements IMtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MtopStreamRequestCallback";
    public static final String X_USED_STREAM = "x-used-stream";
    private IStreamCallBackAdapter mRequestCallback;
    private volatile String mStreamId;
    private String mToken;
    private AtomicBoolean mIsFirstReceived = new AtomicBoolean(false);
    private b mStreamDataController = new b();

    static {
        kge.a(-1895202288);
        kge.a(179613910);
    }

    public MtopStreamRequestCallback(String str, String str2) {
        this.mToken = str;
        this.mStreamId = str2;
        com.taobao.android.detail.ttdetail.request.a.a(str, str2);
    }

    public void setMtopRequestCallback(IStreamCallBackAdapter iStreamCallBackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fc97a8", new Object[]{this, iStreamCallBackAdapter});
        } else {
            this.mRequestCallback = iStreamCallBackAdapter;
        }
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
            return;
        }
        i.a(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onReceiveData");
        if (!TextUtils.equals(this.mStreamId, com.taobao.android.detail.ttdetail.request.a.b(this.mToken))) {
            ae.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleReceiveData(dVar, baseOutDo, i, obj);
        }
    }

    private void handleReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaba6d65", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
            return;
        }
        byte[] bArr = dVar == null ? null : dVar.e;
        String str = "";
        if (this.mIsFirstReceived.compareAndSet(false, true)) {
            Map<String, List<String>> map = dVar == null ? null : dVar.g;
            String str2 = dVar == null ? str : dVar.f21113a;
            String str3 = dVar == null ? str : dVar.b;
            String str4 = dVar == null ? str : dVar.c;
            JSONObject jSONObject = dVar == null ? null : dVar.i;
            Map<String, List<String>> copyMap = copyMap(map);
            boolean isStreamData = isStreamData(copyMap);
            i.a(TAG, "streamId=" + this.mStreamId + ", 流式回调：" + isStreamData);
            copyMap.put(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API, new ArrayList());
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str2);
            mtopResponse.setRetMsg(str3);
            mtopResponse.setApi(str4);
            mtopResponse.setBytedata(bArr);
            if (jSONObject == null && bArr != null) {
                try {
                    jSONObject = JSONObject.parseObject(new String(bArr));
                } catch (Exception e) {
                    IStreamCallBackAdapter iStreamCallBackAdapter = this.mRequestCallback;
                    if (iStreamCallBackAdapter != null) {
                        str = iStreamCallBackAdapter.getItemId();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", str);
                    if (smx.API_NAME.equals(str4)) {
                        ae.a(hashMap, -300018, "主接口结果parse异常");
                    }
                    i.a(TAG, "parseObject exception:" + e);
                    jSONObject = null;
                }
            }
            mtopResponse.setOriginFastJsonObject(jSONObject);
            mtopResponse.setSupportStreamJson(true);
            mtopResponse.setHeaderFields(copyMap);
            String b = az.b(mtopResponse);
            i.a(TAG, "流式一段handleReceiveData traceId=" + b);
            IStreamCallBackAdapter iStreamCallBackAdapter2 = this.mRequestCallback;
            if (iStreamCallBackAdapter2 == null) {
                return;
            }
            String itemId = iStreamCallBackAdapter2.getItemId();
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.a(mtopResponse);
            this.mRequestCallback.setMtopInfo(mtopInfo);
            if (ag.a(mtopResponse)) {
                mtopInfo.a(3);
                this.mRequestCallback.onError(i, mtopResponse, obj);
                return;
            } else if (jSONObject == null) {
                mtopInfo.a(3);
                this.mRequestCallback.handleExceptionDowngrade(i, obj);
                this.mStreamId = null;
                this.mStreamDataController.a();
                monitorStreamDataEmpty(itemId, str2, str3, isStreamData);
                return;
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    mtopInfo.a(3);
                    this.mRequestCallback.handleExceptionDowngrade(i, obj);
                    this.mStreamId = null;
                    this.mStreamDataController.a();
                    monitorStreamDataEmpty(itemId, str2, str3, isStreamData);
                    return;
                } else if (this.mRequestCallback.handleRequestDowngrade(jSONObject, b)) {
                    this.mStreamId = null;
                    this.mStreamDataController.a();
                    return;
                } else {
                    this.mStreamDataController.a(bArr);
                    mtopInfo.a(1);
                    mtopInfo.a(this.mStreamDataController.c());
                    this.mRequestCallback.onSuccess(i, mtopResponse, baseOutDo, obj);
                    i.a(TAG, "首段数据返回");
                    return;
                }
            }
        }
        this.mStreamDataController.a(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("streamId=");
        sb.append(this.mStreamId);
        sb.append(", 第");
        if (dVar != null) {
            str = dVar.f;
        }
        sb.append(str);
        sb.append("段数据返回");
        i.a(TAG, sb.toString());
        this.mRequestCallback.handleReceiveData(dVar, baseOutDo, i, obj);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        i.a(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onError");
        if (!TextUtils.equals(this.mStreamId, com.taobao.android.detail.ttdetail.request.a.b(this.mToken))) {
            ae.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleStreamError(bVar, i, obj);
        }
    }

    private void handleStreamError(com.taobao.tao.stream.b bVar, int i, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b5d9b8", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        Map<String, List<String>> map = null;
        this.mStreamId = null;
        this.mStreamDataController.a();
        if (this.mRequestCallback == null) {
            return;
        }
        if (bVar != null) {
            map = bVar.f21112a;
        }
        String str2 = "";
        String str3 = bVar == null ? str2 : bVar.b;
        if (bVar != null) {
            str2 = bVar.c;
        }
        String str4 = str2;
        int i2 = bVar == null ? 0 : bVar.f;
        Map<String, List<String>> copyMap = copyMap(map);
        copyMap.put(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API, new ArrayList());
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setRetCode(str3);
        mtopResponse.setRetMsg(str4);
        mtopResponse.setHeaderFields(copyMap);
        mtopResponse.setResponseCode(i2);
        String b = az.b(mtopResponse);
        i.a(TAG, "流式handleStreamError traceId=" + b);
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.a(mtopResponse);
        mtopInfo.a(3);
        this.mRequestCallback.setMtopInfo(mtopInfo);
        if (this.mIsFirstReceived.compareAndSet(false, true)) {
            i.a(TAG, "无onReceiveData流式调用error, retCode:" + str3 + ", retMsg:" + str4);
            if (ag.a(mtopResponse)) {
                this.mRequestCallback.onError(i, mtopResponse, obj);
            } else {
                this.mRequestCallback.handleExceptionDowngrade(i, obj);
            }
            str = "noOnReceiveDataError";
        } else {
            i.a(TAG, "有onReceiveData流式调用error, retCode:" + str3 + "retMsg:" + str4);
            this.mRequestCallback.onError(i, mtopResponse, obj);
            str = "onReceiveDataError";
        }
        monitorStreamError(this.mRequestCallback.getItemId(), str3, str4, isStreamData(copyMap), str);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onFinish(c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            return;
        }
        i.a(TAG, "streamId=" + this.mStreamId + ", 主接口流式请求回调，onFinish");
        if (!TextUtils.equals(this.mStreamId, com.taobao.android.detail.ttdetail.request.a.b(this.mToken))) {
            ae.a(-300014, "丢弃流式回调结果");
            return;
        }
        synchronized (this) {
            handleStreamFinish(cVar, i, obj);
        }
    }

    private void handleStreamFinish(c cVar, int i, Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f008c54", new Object[]{this, cVar, new Integer(i), obj});
        } else if (this.mRequestCallback == null) {
            this.mStreamId = null;
            this.mStreamDataController.a();
        } else {
            Map<String, List<String>> map = cVar == null ? null : cVar.f21112a;
            String str = cVar == null ? "" : cVar.b;
            String str2 = cVar == null ? "" : cVar.c;
            Map<String, List<String>> copyMap = copyMap(map);
            copyMap.put(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API, new ArrayList());
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str);
            mtopResponse.setRetMsg(str2);
            mtopResponse.setHeaderFields(copyMap);
            String b = az.b(mtopResponse);
            i.a(TAG, "流式handleStreamFinish traceId=" + b);
            boolean isStreamData = isStreamData(copyMap);
            i.a(TAG, "streamId=" + this.mStreamId + ", 流式回调：" + isStreamData);
            MtopInfo mtopInfo = new MtopInfo();
            mtopInfo.a(mtopResponse);
            mtopInfo.a(3);
            this.mRequestCallback.setMtopInfo(mtopInfo);
            if (this.mIsFirstReceived.compareAndSet(false, true)) {
                i.a(TAG, "streamId=" + this.mStreamId + ", 无onReceiveData流式调用finish, retCode:" + str + "retMsg:" + str2);
                monitorStreamError(this.mRequestCallback.getItemId(), str, str2, isStreamData, "NoOnReceiveDataFinish");
                this.mRequestCallback.onError(i, mtopResponse, obj);
            } else {
                try {
                    jSONObject = this.mStreamDataController.b();
                } catch (Throwable th) {
                    i.a(TAG, "streamId=" + this.mStreamId + ", 合并数据失败", th);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", this.mRequestCallback.getItemId());
                    ae.a(hashMap, -300009, "流式数据合并失败");
                    mtopInfo.a(3);
                    this.mRequestCallback.onError(i, mtopResponse, obj);
                } else {
                    mtopResponse.setOriginFastJsonObject(jSONObject);
                    mtopResponse.setSupportStreamJson(true);
                    mtopInfo.a(2);
                    mtopInfo.a(this.mStreamDataController.c());
                    this.mRequestCallback.onSuccess(i, mtopResponse, null, obj);
                }
            }
            this.mStreamId = null;
            this.mStreamDataController.a();
        }
    }

    private boolean isStreamData(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5e1a78e", new Object[]{this, map})).booleanValue() : az.a(map);
    }

    private Map<String, List<String>> copyMap(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a3fa10c", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        if (value != null && !value.isEmpty()) {
                            arrayList.addAll(value);
                            hashMap.put(key, arrayList);
                        }
                        hashMap.put(key, arrayList);
                    }
                }
            } catch (Exception e) {
                i.a(TAG, "streamId=" + this.mStreamId + ", 流式返回headerFields异常", e);
            }
        }
        return hashMap;
    }

    private void monitorStreamDataEmpty(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b758eb46", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("retCode", str2);
        hashMap.put(arz.KEY_RET_MSG, str3);
        hashMap.put(com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        ae.a(hashMap, -300007, "流式返回数据为空");
    }

    private void monitorStreamError(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea67a6b", new Object[]{this, str, str2, str3, new Boolean(z), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("retCode", str2);
        hashMap.put(arz.KEY_RET_MSG, str3);
        hashMap.put("errorMsg", str4);
        hashMap.put(com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.IS_STREAM, String.valueOf(z));
        ae.a(hashMap, -300008, "流式请求回调错误");
    }
}
