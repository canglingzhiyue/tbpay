package com.taobao.android.detail.ttdetail.request.callback;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.ab;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.soa;

/* loaded from: classes5.dex */
public class CompatibleRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CompatibleRequestCallback";
    private soa mListener;
    private MtopInfo mMtopInfo = new MtopInfo();
    private MainRequestParams mParams;

    static {
        kge.a(2110148841);
        kge.a(-525336021);
    }

    public CompatibleRequestCallback(MainRequestParams mainRequestParams, soa soaVar) {
        this.mParams = mainRequestParams;
        this.mListener = soaVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        i.a(TAG, "getDetail降级请求回调，onSuccess");
        handleSuccess(mtopResponse, i, baseOutDo, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "getDetail降级请求回调，onError");
        handleError(i, mtopResponse, obj);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        i.a(TAG, "getDetail降级请求回调，onSystemError");
        handleError(i, mtopResponse, obj);
    }

    private void handleSuccess(MtopResponse mtopResponse, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cb779a", new Object[]{this, mtopResponse, new Integer(i), baseOutDo, obj});
        } else if (this.mListener == null) {
        } else {
            this.mMtopInfo.a(mtopResponse);
            JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
            if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
                originFastJsonObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
                mtopResponse.setOriginFastJsonObject(originFastJsonObject);
            }
            String b = az.b(mtopResponse);
            if (originFastJsonObject == null) {
                this.mMtopInfo.a(3);
                this.mListener.a(this.mMtopInfo, i, obj);
                ab.b(true, this.mParams.getItemId(), b);
                return;
            }
            JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                this.mMtopInfo.a(3);
                this.mListener.a(this.mMtopInfo, i, obj);
                ab.b(true, this.mParams.getItemId(), b);
                return;
            }
            JSONObject c = g.c(originFastJsonObject);
            if (at.a(c)) {
                at.a(c, this.mParams, this.mListener);
                return;
            }
            this.mMtopInfo.a(mtopResponse);
            this.mMtopInfo.a(2);
            this.mListener.a(this.mMtopInfo, i, baseOutDo, obj);
        }
    }

    private void handleError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8778fd", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mListener == null) {
        } else {
            this.mMtopInfo.a(mtopResponse);
            this.mMtopInfo.a(3);
            this.mListener.a(this.mMtopInfo, i, obj);
            ab.a(true, this.mParams.getItemId(), az.b(mtopResponse));
        }
    }
}
