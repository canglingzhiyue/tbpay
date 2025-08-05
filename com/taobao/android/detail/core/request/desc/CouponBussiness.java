package com.taobao.android.detail.core.request.desc;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.apicommon.ApiRequest;
import com.taobao.android.detail.core.request.apicommon.ApiRequestListener;
import com.taobao.android.detail.core.request.apicommon.AsynApiTask;
import com.taobao.detail.domain.base.Unit;
import com.taobao.mtop.api.ApiResponse;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CouponBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1228343154);
    }

    public static /* synthetic */ Object ipc$super(CouponBussiness couponBussiness, String str, Object... objArr) {
        if (str.hashCode() == -1325095953) {
            return super.a((ApiRequest) objArr[0], (Map) objArr[1], (ApiRequestListener) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CouponBussiness(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.request.desc.CouponBussiness");
    }

    public CouponBussiness a(Unit unit, Map<String, String> map, ApiRequestListener apiRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CouponBussiness) ipChange.ipc$dispatch("1b66d63c", new Object[]{this, unit, map, apiRequestListener});
        }
        if (unit == null) {
            return this;
        }
        ApiRequest apiRequest = new ApiRequest(unit, map);
        apiRequest.setNeedEcode(true);
        super.a(apiRequest, map, apiRequestListener);
        return this;
    }

    @Override // com.taobao.android.detail.core.request.apicommon.AsynApiTask
    public Class<? extends BaseOutDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : CouponResponse.class;
    }

    /* loaded from: classes4.dex */
    public static class CouponResponse extends BaseOutDo {
        private ApiResponse data;

        static {
            kge.a(-1311268483);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public ApiResponse mo2429getData() {
            return this.data;
        }

        public void setData(ApiResponse apiResponse) {
            this.data = apiResponse;
        }
    }
}
