package com.taobao.detail.domain.meal;

import com.taobao.detail.clientDomain.TBDetailResultVO;
import com.taobao.detail.domain.base.BaseVO;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ComboInfo extends BaseVO implements Serializable {
    public List<SimpleCombo> combos;
    public Combo currentCombo;

    /* loaded from: classes7.dex */
    public static class Combo implements Serializable {
        public boolean areaSell;
        public String comboDescription;
        public String comboH5Url;
        public String id;
        public List<TBDetailResultVO> itemsForApp;
        public String name;
        @Deprecated
        public String reservePrice;
        public String reservePriceForTaobaoApp;
        public String tmalAppH5Url;
        public int type;

        static {
            kge.a(-454370086);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes7.dex */
    public static class SimpleCombo implements Serializable {
        public String comboDescription;
        public String id;
        public String name;

        static {
            kge.a(1221742920);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1382207216);
        kge.a(1028243835);
    }
}
