package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetMedicineUrlResponse extends BaseOutDo {
    public GetMedicineUrlResponseDo data;

    static {
        kge.a(534061341);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public GetMedicineUrlResponseDo mo2429getData() {
        return this.data;
    }

    /* loaded from: classes8.dex */
    public static class GetMedicineUrlResponseDo implements IMTOPDataObject {
        public String result;

        static {
            kge.a(725446514);
            kge.a(-350052935);
        }

        public String getResult() {
            return this.result;
        }
    }
}
