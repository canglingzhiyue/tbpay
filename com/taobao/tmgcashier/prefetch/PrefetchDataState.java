package com.taobao.tmgcashier.prefetch;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tmgcashier.constant.a;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import tb.kge;

/* loaded from: classes9.dex */
public class PrefetchDataState implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchDataState";
    private WVCallBackContext mCallback;
    private Context mContext;
    private volatile PrefetchDataStateEnum mState = PrefetchDataStateEnum.INIT;
    private String mResultInfo = "";
    private String mErrorInfo = "";
    public Map<String, String> params = new HashMap(16);

    /* loaded from: classes9.dex */
    public enum PrefetchDataStateEnum {
        INIT,
        STARTING,
        ERROR,
        SUCCESS,
        REQUESTED
    }

    static {
        kge.a(-1866858849);
        kge.a(-525336021);
    }

    public PrefetchDataState(Context context) {
        this.mContext = context;
    }

    public synchronized void setState(PrefetchDataStateEnum prefetchDataStateEnum, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab23de83", new Object[]{this, prefetchDataStateEnum, str});
            return;
        }
        if (prefetchDataStateEnum == PrefetchDataStateEnum.SUCCESS) {
            this.mResultInfo = str;
        }
        if (prefetchDataStateEnum == PrefetchDataStateEnum.REQUESTED) {
            if (this.mState == PrefetchDataStateEnum.SUCCESS) {
                sendSuccessResult();
                this.mResultInfo = "";
            } else if (this.mState == PrefetchDataStateEnum.ERROR) {
                sendResult(this.mErrorInfo);
            } else if (this.mState == PrefetchDataStateEnum.REQUESTED) {
                sendResult("bridge重复调用！");
            }
        }
        if (prefetchDataStateEnum == PrefetchDataStateEnum.SUCCESS && this.mState == PrefetchDataStateEnum.REQUESTED) {
            sendSuccessResult();
            this.mResultInfo = "";
        } else if (prefetchDataStateEnum == PrefetchDataStateEnum.ERROR && this.mState == PrefetchDataStateEnum.REQUESTED) {
            sendResult(this.mErrorInfo);
        }
        this.mState = prefetchDataStateEnum;
    }

    private void sendSuccessResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51039bdf", new Object[]{this});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(this.mResultInfo);
    }

    private void sendResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8b2696", new Object[]{this, str});
        } else if (this.mCallback == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_FAILED");
            rVar.a("errorInfo", str);
            this.mCallback.error(rVar);
        }
    }

    public void startRequest(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4289591", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        JSONObject parseObject = JSON.parseObject(a.f22967a);
        String string = parseObject.getString("mtop_name");
        String string2 = parseObject.getString("api_version");
        JSONArray jSONArray = parseObject.getJSONArray("request_key_list");
        this.params.clear();
        for (int i = 0; i < jSONArray.size(); i++) {
            String str = (String) jSONArray.get(i);
            String queryParameter = data.getQueryParameter(str);
            if (queryParameter != null) {
                this.params.put(str, queryParameter);
            } else {
                TLog.logd("frontCashier", "CashActivity", "prefetchData key 为空：" + str);
            }
        }
        this.params.put("openDataPrefetch", "true");
        this.params.put("hasClose", "true");
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string);
        mtopRequest.setVersion(string2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(this.params));
        MtopBusiness build = MtopBusiness.build(Mtop.getInstance(""), mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) this);
        build.startRequest();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData onSystemError:" + mtopResponse.toString());
        this.mErrorInfo = mtopResponse.toString();
        setState(PrefetchDataStateEnum.ERROR, "onSystemError ");
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData onSuccess");
        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) dataJsonObject.toString());
        jSONObject.put("response_date", (Object) Long.valueOf(System.currentTimeMillis()));
        jSONObject.put("request_params", (Object) this.params);
        setState(PrefetchDataStateEnum.SUCCESS, jSONObject.toJSONString());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        TLog.logd("frontCashier", "CashActivity", "prefetchData error:" + mtopResponse.toString());
        this.mErrorInfo = mtopResponse.toString();
        setState(PrefetchDataStateEnum.ERROR, "onError ");
    }

    public void setCallBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94d82b", new Object[]{this, wVCallBackContext});
        } else {
            this.mCallback = wVCallBackContext;
        }
    }
}
