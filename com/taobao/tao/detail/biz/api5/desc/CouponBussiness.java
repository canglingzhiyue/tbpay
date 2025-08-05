package com.taobao.tao.detail.biz.api5.desc;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.api.ApiResponse;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class CouponBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1311852931);
    }

    public CouponBussiness(Context context) {
        super(context);
        tpc.a("com.taobao.tao.detail.biz.api5.desc.CouponBussiness");
    }

    @Override // com.taobao.tao.detail.biz.api5.common.AsynApiTask
    public Class<? extends BaseOutDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : CouponResponse.class;
    }

    /* loaded from: classes8.dex */
    public static class CouponResponse extends BaseOutDo {
        private ApiResponse data;

        static {
            kge.a(-748771352);
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
