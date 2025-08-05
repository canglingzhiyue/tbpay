package com.taobao.tao.detail.biz.api5.combo;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.domain.meal.ComboInfo;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailComboBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-421507605);
    }

    public DetailComboBussiness(Context context) {
        super(context);
        tpc.a("com.taobao.tao.detail.biz.api5.combo.DetailComboBussiness");
    }

    @Override // com.taobao.tao.detail.biz.api5.common.AsynApiTask
    public Class<? extends BaseOutDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : ComboResponse.class;
    }

    /* loaded from: classes8.dex */
    public static class ComboResponse extends BaseOutDo {
        private ComboInfo data;

        static {
            kge.a(-2105746218);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public ComboInfo mo2429getData() {
            return this.data;
        }

        public void setData(ComboInfo comboInfo) {
            this.data = comboInfo;
        }
    }
}
