package com.taobao.mytaobao.ultron.model;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class OrderCountResponse extends BaseOutDo implements Serializable {
    private Results data;

    /* loaded from: classes7.dex */
    public static class Order implements Serializable {
        public String count;
        public String tabCode;

        static {
            kge.a(-1782516725);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes7.dex */
    public static class Results implements Serializable {
        public List<Order> result;

        static {
            kge.a(-1296929421);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1414470465);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public Results mo2429getData() {
        return this.data;
    }

    public void setData(Results results) {
        this.data = results;
    }
}
