package com.taobao.tao.detail.biz.api5.main;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.clientDomain.TBDetailResultVO;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;

    static {
        kge.a(-987184928);
    }

    public DetailBussiness(Context context) {
        super(context);
        this.c = "DetailBussiness";
        tpc.a("com.taobao.tao.detail.biz.api5.main.DetailBussiness");
    }

    @Override // com.taobao.tao.detail.biz.api5.common.AsynApiTask
    public Class<? extends BaseOutDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : DetailResponse.class;
    }

    /* loaded from: classes8.dex */
    public static class DetailResponse extends BaseOutDo {
        private TBDetailResultVO detailVO;

        static {
            kge.a(1561186326);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public TBDetailResultVO mo2429getData() {
            return this.detailVO;
        }

        public void setData(TBDetailResultVO tBDetailResultVO) {
            this.detailVO = tBDetailResultVO;
        }
    }
}
