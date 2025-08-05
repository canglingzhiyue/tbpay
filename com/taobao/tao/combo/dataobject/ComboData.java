package com.taobao.tao.combo.dataobject;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ComboData implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 1;
    public long buyCount;
    public ArrayList<ComboItemData> itemList;
    public long mealId;
    public ArrayList<Long> mealIdList;
    public String mealName;
    public long mealPrice;
    public long savedMoney;
    public String type;

    static {
        kge.a(-1683744141);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
