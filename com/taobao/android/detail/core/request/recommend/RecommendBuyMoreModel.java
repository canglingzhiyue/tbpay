package com.taobao.android.detail.core.request.recommend;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

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
            kge.a(1113144984);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(397688818);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public RecommendBuyMoreModel() {
        emu.a("com.taobao.android.detail.core.request.recommend.RecommendBuyMoreModel");
    }
}
