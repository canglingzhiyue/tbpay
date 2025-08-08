package com.taobao.android.detail.ttdetail.request.callback;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.ab;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.ag;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.stream.d;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.smx;
import tb.soa;

/* loaded from: classes5.dex */
public class MainRequestCallback implements IStreamCallBackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MainRequestCallback";
    public soa mListener;
    public MtopInfo mMtopInfo = new MtopInfo();
    public MainRequestParams mParams;
    public String mToken;

    static {
        kge.a(-1074683356);
        kge.a(250114264);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaba6d65", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
        }
    }

    public MainRequestCallback(MainRequestParams mainRequestParams, soa soaVar) {
        this.mParams = mainRequestParams;
        this.mListener = soaVar;
        this.mToken = mainRequestParams.getDetailToken();
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.mParams.getItemId();
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

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        i.a(TAG, "主接口非预请求回调，onSuccess");
        av.c(this.mParams.getDetailToken(), InputFrame3.TYPE_RESPONSE, System.currentTimeMillis());
        if (this.mListener == null) {
            return;
        }
        this.mMtopInfo.a(mtopResponse);
        if (az.a(mtopResponse)) {
            this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
        } else {
            handleSuccess(mtopResponse, i, baseOutDo, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "主接口非预请求回调，onError");
        handleError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "主接口非预请求回调，onSystemError");
        handleError(i, mtopResponse, obj);
    }

    private void handleError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8778fd", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mListener == null) {
        } else {
            String b = az.b(mtopResponse);
            i.a(TAG, "非流式handleError traceId=" + b);
            this.mMtopInfo.a(mtopResponse);
            this.mMtopInfo.a(3);
            if (ag.a(mtopResponse) || az.a(mtopResponse)) {
                this.mListener.a(this.mMtopInfo, i, obj);
            } else {
                handleExceptionDowngrade(i, obj);
            }
            ab.a(!StringUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), b);
        }
    }

    private void handleSuccess(MtopResponse mtopResponse, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cb779a", new Object[]{this, mtopResponse, new Integer(i), baseOutDo, obj});
        } else if (this.mListener == null) {
        } else {
            String b = az.b(mtopResponse);
            i.a(TAG, "非流式handleSuccess traceId=" + b);
            if (ag.a(mtopResponse)) {
                this.mMtopInfo.a(3);
                this.mListener.a(this.mMtopInfo, i, obj);
                return;
            }
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                try {
                    originFastJsonObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
                } catch (Exception e) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("itemId", this.mParams.getItemId());
                    ae.a(hashMap, -300018, "主接口结果parse异常");
                    i.a(TAG, "parseObject exception:" + e);
                    originFastJsonObject = null;
                }
                mtopResponse.setOriginFastJsonObject(originFastJsonObject);
            }
            if (originFastJsonObject == null) {
                this.mMtopInfo.a(3);
                handleExceptionDowngrade(i, obj);
                ab.b(!StringUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), b);
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                this.mMtopInfo.a(3);
                handleExceptionDowngrade(i, obj);
                ab.b(!StringUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), b);
            } else if (handleRequestDowngrade(originFastJsonObject, b)) {
            } else {
                this.mMtopInfo.a(2);
                this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public boolean handleRequestDowngrade(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92f4c829", new Object[]{this, jSONObject, str})).booleanValue();
        }
        JSONObject c = g.c(jSONObject);
        if (com.taobao.android.detail.ttdetail.utils.d.c(c)) {
            handleDowngrade(str);
            return true;
        } else if (!at.a(c)) {
            return false;
        } else {
            handleOneProductMMDegrade(c);
            return true;
        }
    }

    public void handleDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81c39fe", new Object[]{this, str});
            return;
        }
        i.a(TAG, "主请求降级getDetail/6.0");
        ab.a(this.mParams, this.mListener, str);
    }

    public void handleOneProductMMDegrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a39e904", new Object[]{this, jSONObject});
            return;
        }
        i.a(TAG, "一品多商降级");
        at.a(jSONObject, this.mParams, this.mListener);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
        } else if (j.n()) {
            handleDowngrade(az.b(this.mMtopInfo.b()));
        } else {
            this.mListener.a(this.mMtopInfo, i, obj);
        }
    }
}
