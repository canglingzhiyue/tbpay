package com.taobao.android.detail.sdk.request.jhs.marketing;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JhsMarkegingResult implements Serializable {
    public ArrayList<JhsMarketingItem> result;

    /* loaded from: classes4.dex */
    public static class JhsMarketingItem implements Serializable {
        public MarketActivityButton button;
        public String id;
        public String marketingDescForPlugin;
        public String marketingExtendDescForPlugin;
        public String marketingTaskDescForPlugin;
        public String marketingTypeForPlugin;
        public String type;

        static {
            kge.a(409499978);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class MarketActivityButton implements Serializable {
        public MarketingAction action;
        public String link;
        public String msgDisplay;
        public boolean status;

        static {
            kge.a(1909627747);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class MarketingAction implements Serializable {
        public String attributes;
        public String type;

        static {
            kge.a(322335574);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1004076002);
        kge.a(1028243835);
    }

    public JhsMarkegingResult() {
        tpc.a("com.taobao.android.detail.sdk.request.jhs.marketing.JhsMarkegingResult");
    }
}
