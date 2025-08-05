package com.taobao.android.detail.core.model.datamodel.combo;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryComboData implements IMTOPDataObject {
    public ComboDataInfo currentCombo;
    public String errorInfo;
    public boolean success;

    /* loaded from: classes4.dex */
    public static class ComboDataInfo implements Serializable {
        public boolean areaSell;
        public String areas;
        public String cityId;
        public String comboH5Url;
        public String group;
        public String id;
        public List<ComboItemForApp> itemsForApp;
        public String name;
        public String regionId;
        public String reservePriceForTaobaoApp;
        public String userAreaId;

        static {
            kge.a(-1274060658);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class ComboItemForApp implements Serializable {
        public ComboItemInfoModel itemInfoModel;

        static {
            kge.a(332034337);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class ComboItemInfoModel implements Serializable {
        public boolean isMakeup;
        public String itemId;
        public List<String> picsPath;
        public List<ComboPriceUnit> priceUnits;

        static {
            kge.a(974589426);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class ComboPriceUnit implements Serializable {
        public int display;
        public String name;
        public String price;
        public String rangePrice;

        static {
            kge.a(1711953943);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1275299884);
        kge.a(-350052935);
    }

    public QueryComboData() {
        emu.a("com.taobao.android.detail.core.model.datamodel.combo.QueryComboData");
    }
}
