package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class DeliverListResponse extends BaseOutDo implements Serializable {
    private DeliveryData data;

    /* loaded from: classes7.dex */
    public static class DeliveryData {
        public List<DeliverInfoBean> deliveryList;
        public JSONObject events;

        static {
            kge.a(1048136938);
        }
    }

    static {
        kge.a(-1649082856);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public DeliveryData mo2429getData() {
        return this.data;
    }

    public void setData(DeliveryData deliveryData) {
        this.data = deliveryData;
    }
}
