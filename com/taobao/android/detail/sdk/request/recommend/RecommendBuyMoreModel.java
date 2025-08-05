package com.taobao.android.detail.sdk.request.recommend;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RecommendBuyMoreModel implements Serializable, IMTOPDataObject {
    public String URL;
    public String button_msg;
    public BuyMoreMSG msg;
    public List<String> result;

    /* loaded from: classes4.dex */
    public static class BuyMoreMSG implements IMTOPDataObject {
        public List<String> arg;
        public String logoURL;
        public int man;
        public String msg;
        public int type;

        static {
            kge.a(-971899949);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(1370323351);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public RecommendBuyMoreModel() {
        tpc.a("com.taobao.android.detail.sdk.request.recommend.RecommendBuyMoreModel");
    }
}
