package com.taobao.android.detail.core.request.jhs.marketing;

import java.io.Serializable;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

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
            kge.a(-1944420635);
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
            kge.a(193092478);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class MarketingAction implements Serializable {
        public String attributes;
        public String type;

        static {
            kge.a(246402651);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1090975453);
        kge.a(1028243835);
    }

    public JhsMarkegingResult() {
        emu.a("com.taobao.android.detail.core.request.jhs.marketing.JhsMarkegingResult");
    }
}
