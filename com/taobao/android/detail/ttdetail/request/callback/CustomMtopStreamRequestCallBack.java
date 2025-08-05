package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.a;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.stream.d;
import java.util.ArrayList;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.soa;

/* loaded from: classes5.dex */
public class CustomMtopStreamRequestCallBack extends CustomMtopRequestCallback implements IStreamCallBackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CustomMtopStreamRequestCallBack";

    static {
        kge.a(358974660);
        kge.a(250114264);
    }

    public static /* synthetic */ Object ipc$super(CustomMtopStreamRequestCallBack customMtopStreamRequestCallBack, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public boolean handleRequestDowngrade(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f4c829", new Object[]{this, jSONObject, str})).booleanValue();
        }
        return false;
    }

    public CustomMtopStreamRequestCallBack(a aVar, soa soaVar) {
        super(aVar, soaVar);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mListener == null) {
        } else {
            this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "customStreamApi mtop接口请求回调onError");
        handleError(i, obj);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "customStreamApi mtop接口请求回调onSystemError");
        handleError(i, obj);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.mQueryParams == null ? "" : this.mQueryParams.e();
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void setMtopInfo(MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72575c19", new Object[]{this, mtopInfo});
        } else {
            this.mMtopInfo = mtopInfo;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
            return;
        }
        i.a(TAG, "handleExceptionDowngrade");
        handleError(i, obj);
    }

    private void handleError(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea606b78", new Object[]{this, new Integer(i), obj});
            return;
        }
        i.a(TAG, "handleError");
        this.mMtopInfo.a(3);
        if (this.mListener != null) {
            this.mListener.a(this.mMtopInfo, i, obj);
        }
        ae.a(new HashMap(), -300127, "自定义流式请求回调失败");
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaba6d65", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
        } else if (dVar == null) {
        } else {
            byte[] bArr = dVar.e;
            JSONObject jSONObject = dVar.i;
            if (jSONObject == null && bArr != null) {
                try {
                    jSONObject = JSONObject.parseObject(new String(bArr));
                } catch (Exception e) {
                    i.a(TAG, "handleReceiveData parse exception:" + e);
                }
            }
            if (jSONObject != null && jSONObject.getJSONObject("data") != null && !jSONObject.getJSONObject("data").isEmpty()) {
                return;
            }
            MtopResponse mtopResponse = new MtopResponse();
            HashMap hashMap = new HashMap();
            hashMap.put(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API, new ArrayList());
            mtopResponse.setHeaderFields(hashMap);
            mtopResponse.setRetMsg("MainScreenDataEmpty");
            this.mMtopInfo.a(mtopResponse);
            handleError(i, obj);
        }
    }
}
