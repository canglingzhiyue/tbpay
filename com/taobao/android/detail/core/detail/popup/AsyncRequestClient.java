package com.taobao.android.detail.core.detail.popup;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.trade.boost.annotations.MtopParams;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AsyncRequestClient extends MtopRequestClient<AsyncRequestParams, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = true;
    private static final String TAG = "AsyncRequestClient";
    private Context mContext;

    static {
        kge.a(-339792806);
    }

    public static /* synthetic */ Object ipc$super(AsyncRequestClient asyncRequestClient, String str, Object... objArr) {
        if (str.hashCode() == -460605060) {
            super.execute();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AsyncRequestClient(Context context, AsyncRequestParams asyncRequestParams, String str, MtopRequestListener<JSONObject> mtopRequestListener) {
        super(asyncRequestParams, str, mtopRequestListener);
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.popup.AsyncRequestClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : ((AsyncRequestParams) this.mParams).getApi();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : ((AsyncRequestParams) this.mParams).getVersion();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        if (((AsyncRequestParams) this.mParams).isTradeUnit()) {
            return MtopParams.UnitStrategy.UNIT_TRADE.toString();
        }
        return MtopParams.UnitStrategy.UNIT_GUIDE.toString();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            super.execute();
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (mtopResponse == null || mtopResponse.getMtopStat() == null || mtopResponse.getMtopStat().getNetworkStats() == null) {
        } else {
            JSONObject jSONObject = null;
            String str = mtopResponse.getBytedata() != null ? new String(mtopResponse.getBytedata()) : null;
            if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                jSONObject = parseObject.getJSONObject("data");
            }
            MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
            if (jSONObject == null) {
                mtopRequestListener.a(mtopResponse);
            } else {
                mtopRequestListener.b(jSONObject);
            }
            bgc.b("detail", mtopResponse);
        }
    }
}
