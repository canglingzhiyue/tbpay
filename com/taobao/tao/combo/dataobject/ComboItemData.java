package com.taobao.tao.combo.dataobject;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ComboItemData implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 1;
    public boolean isFavor;
    public long itemId;
    public String itemName;
    public long itemPrice;
    public String mainPicUrl;
    public ArrayList<String> picUrlList;

    static {
        kge.a(2047392678);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
