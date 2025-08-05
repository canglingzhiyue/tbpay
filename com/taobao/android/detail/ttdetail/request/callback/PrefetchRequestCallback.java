package com.taobao.android.detail.ttdetail.request.callback;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.a;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.utils.ab;
import com.taobao.android.detail.ttdetail.utils.ag;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.smo;
import tb.smx;
import tb.soa;

/* loaded from: classes5.dex */
public class PrefetchRequestCallback extends MainRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchRequestCallback";

    static {
        kge.a(1671013798);
    }

    public static /* synthetic */ Object ipc$super(PrefetchRequestCallback prefetchRequestCallback, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PrefetchRequestCallback(MainRequestParams mainRequestParams) {
        super(mainRequestParams, null);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        av.c(this.mToken, InputFrame3.TYPE_RESPONSE, System.currentTimeMillis());
        prefetchRequestCallback(i, mtopResponse, baseOutDo, obj, true);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(i, mtopResponse, null, obj, false);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            prefetchRequestCallback(i, mtopResponse, null, obj, false);
        }
    }

    private void prefetchRequestCallback(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804d9822", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj, new Boolean(z)});
            return;
        }
        this.mMtopInfo.a(mtopResponse);
        i.a(TAG, "主接口预请求回调，isSuccess=" + z);
        if (!az.a(mtopResponse)) {
            String b = az.b(mtopResponse);
            i.a(TAG, "预请求降级getDetail6.0 prefetchRequestCallback traceId=" + b);
            if (ag.a(mtopResponse)) {
                this.mMtopInfo.a(3);
            } else {
                this.mMtopInfo = z ? getDowngradeSuccessMtopInfo(mtopResponse) : getDowngradeErrorMtopInfo(mtopResponse);
            }
        }
        if (this.mMtopInfo.a() == 0) {
            return;
        }
        if (this.mMtopInfo.a() == 3) {
            z2 = false;
        }
        handlePrefetchMtopInfo(i, baseOutDo, obj, z2);
    }

    private void handlePrefetchMtopInfo(int i, BaseOutDo baseOutDo, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a76ad65", new Object[]{this, new Integer(i), baseOutDo, obj, new Boolean(z)});
            return;
        }
        a aVar = new a(this.mToken);
        if (!aVar.d()) {
            i.a(TAG, "预请求数据不回调，token=" + this.mToken);
            return;
        }
        soa a2 = aVar.a();
        if (a2 != null) {
            this.mListener = a2;
            if (this.mMtopInfo.a() != 1) {
                aVar.e();
            }
            i.a(TAG, "预请求数据直接回调，status=" + this.mMtopInfo.a());
            handleListener(z, this.mMtopInfo, i, baseOutDo, obj);
            return;
        }
        a.C0427a c0427a = new a.C0427a();
        c0427a.a(z ? "success" : "error");
        c0427a.a(this.mMtopInfo);
        aVar.a(c0427a);
        i.a(TAG, "缓存预请求结果，status=" + this.mMtopInfo.a());
    }

    private MtopInfo getDowngradeSuccessMtopInfo(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("637f4a0e", new Object[]{this, mtopResponse});
        }
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.a(mtopResponse);
        JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
        if (originFastJsonObject == null && mtopResponse.getBytedata() != null) {
            originFastJsonObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
            mtopResponse.setOriginFastJsonObject(originFastJsonObject);
        }
        String b = az.b(mtopResponse);
        if (originFastJsonObject == null) {
            mtopInfo.a(3);
            ab.b(!TextUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), b);
            return mtopInfo;
        }
        JSONObject jSONObject = originFastJsonObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            mtopInfo.a(3);
            ab.b(!TextUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), b);
            return mtopInfo;
        }
        JSONObject c = g.c(originFastJsonObject);
        if (at.a(c)) {
            handleOneProductMMDegrade(c);
        } else {
            mtopInfo.a(2);
        }
        return mtopInfo;
    }

    private MtopInfo getDowngradeErrorMtopInfo(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("2d09bf13", new Object[]{this, mtopResponse});
        }
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.a(mtopResponse);
        mtopInfo.a(3);
        ab.a(!TextUtils.equals(smx.API_NAME, mtopResponse.getApi()), this.mParams.getItemId(), az.b(mtopResponse));
        return mtopInfo;
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback, com.taobao.android.detail.ttdetail.request.callback.IStreamCallBackAdapter
    public void handleExceptionDowngrade(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b7034a", new Object[]{this, new Integer(i), obj});
        } else if (j.n()) {
            handleDowngrade(az.b(this.mMtopInfo.b()));
        } else {
            onError(i, this.mMtopInfo.b(), obj);
        }
    }

    private void handleListener(boolean z, MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e4fda", new Object[]{this, new Boolean(z), mtopInfo, new Integer(i), baseOutDo, obj});
        } else if (z) {
            this.mListener.a(mtopInfo, i, baseOutDo, obj);
        } else {
            this.mListener.a(mtopInfo, i, obj);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback
    public void handleDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81c39fe", new Object[]{this, str});
            return;
        }
        new smo(this.mParams).a(this).k();
        i.a(TAG, "预请求降级getDetail/6.0");
        ab.a(this.mParams.getItemId(), str);
    }

    @Override // com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback
    public void handleOneProductMMDegrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a39e904", new Object[]{this, jSONObject});
            return;
        }
        i.a(TAG, "一品多商降级");
        String itemId = this.mParams.getItemId();
        Map<String, String> b = at.b(jSONObject);
        this.mParams.updateRefreshParams(b);
        new smx(this.mParams).a(this).k();
        at.a(itemId, b);
    }
}
