package com.taobao.tao.detail.biz.api5.area;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.domain.base.Area;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

@Deprecated
/* loaded from: classes8.dex */
public class AllAreaBussiness extends AsynApiTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2009267161);
    }

    public AllAreaBussiness(Context context) {
        super(context);
        tpc.a("com.taobao.tao.detail.biz.api5.area.AllAreaBussiness");
    }

    @Override // com.taobao.tao.detail.biz.api5.common.AsynApiTask
    public Class<? extends BaseOutDo> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("5d842d15", new Object[]{this}) : AreaResponse.class;
    }

    /* loaded from: classes8.dex */
    public static class AreaResponse extends BaseOutDo implements IMTOPDataObject {
        private AreaData data;

        static {
            kge.a(-1381245589);
            kge.a(-350052935);
        }

        @Override // mtopsdk.mtop.domain.BaseOutDo
        /* renamed from: getData */
        public AreaData mo2429getData() {
            return this.data;
        }

        public void setData(AreaData areaData) {
            this.data = areaData;
        }

        /* loaded from: classes8.dex */
        public static class AreaData implements IMTOPDataObject {
            private List<Area> result;

            static {
                kge.a(2117218576);
                kge.a(-350052935);
            }

            public List<Area> getResult() {
                return this.result;
            }

            public void setResult(List<Area> list) {
                this.result = list;
            }
        }
    }
}
