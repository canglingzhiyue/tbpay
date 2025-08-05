package com.taobao.taobao.scancode.barcode.object.recommend;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetQRMedicineUrlResponse extends BaseOutDo {
    public GetMedicineUrlResponseDo data;

    static {
        kge.a(1775850396);
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
            kge.a(-893011501);
            kge.a(-350052935);
        }

        public String getResult() {
            return this.result;
        }
    }
}
