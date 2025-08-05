package com.taobao.android.detail.core.request.coupon;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.datamodel.coupon.CouponInfoModel;
import com.taobao.android.detail.core.request.MtopRequestClient;
import com.taobao.android.detail.core.request.MtopRequestListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bgc;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponInfoListClient extends MtopRequestClient<CouponInfoListParams, CouponInfoModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API_VERSION = "1.0";
    public static String mtopUrl;

    static {
        kge.a(-71039903);
    }

    public static /* synthetic */ Object ipc$super(CouponInfoListClient couponInfoListClient, String str, Object... objArr) {
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

    public CouponInfoListClient(CouponInfoListParams couponInfoListParams, String str, MtopRequestListener<CouponInfoModel> mtopRequestListener) {
        super(couponInfoListParams, str, mtopRequestListener);
        emu.a("com.taobao.android.detail.core.request.coupon.CouponInfoListClient");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : mtopUrl;
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.mRemoteBusiness == null) {
        } else {
            this.mRemoteBusiness.startRequest(CouponInfoListResult.class);
        }
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        CouponInfoListResult couponInfoListResult = baseOutDo instanceof CouponInfoListResult ? (CouponInfoListResult) baseOutDo : null;
        MtopRequestListener mtopRequestListener = (MtopRequestListener) this.mRequestListenerRef.get();
        if (mtopRequestListener == null) {
            return;
        }
        if (couponInfoListResult != null) {
            mtopRequestListener.b(couponInfoListResult.mo2429getData());
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
