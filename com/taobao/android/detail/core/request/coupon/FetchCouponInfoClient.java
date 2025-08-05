package com.taobao.android.detail.core.request.coupon;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.trade.boost.annotations.MtopParams;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FetchCouponInfoClient extends MtopRequestClient<FetchCouponInfoParams, FetchCouponInfoModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_VERSION = "1.0";
    public static String mtopUrl;
    private int type;

    static {
        kge.a(84921589);
    }

    public static /* synthetic */ Object ipc$super(FetchCouponInfoClient fetchCouponInfoClient, String str, Object... objArr) {
        if (str.hashCode() == -780910161) {
            super.configMtopRequest((MtopRequest) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : "1.0";
    }

    public FetchCouponInfoClient(FetchCouponInfoParams fetchCouponInfoParams, String str, MtopRequestListener<FetchCouponInfoModel> mtopRequestListener, int i) {
        super(fetchCouponInfoParams, str, mtopRequestListener);
        this.type = i;
        emu.a("com.taobao.android.detail.core.request.coupon.FetchCouponInfoClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : mtopUrl;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : MtopParams.UnitStrategy.UNIT_TRADE.toString();
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.mRemoteBusiness == null) {
        } else {
            this.mRemoteBusiness.mo1335useWua();
            this.mRemoteBusiness.startRequest(FetchCouponInfoResult.class);
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        FetchCouponInfoResult fetchCouponInfoResult = baseOutDo instanceof FetchCouponInfoResult ? (FetchCouponInfoResult) baseOutDo : null;
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        if (fetchCouponInfoResult != null) {
            mtopRequestListener.b(fetchCouponInfoResult.mo2429getData());
        } else {
            mtopRequestListener.b(null);
        }
        bgc.b("detail", mtopResponse);
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public void configMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17441af", new Object[]{this, mtopRequest});
            return;
        }
        super.configMtopRequest(mtopRequest);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
    }
}
