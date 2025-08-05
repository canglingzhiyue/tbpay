package com.taobao.android.shop.features.category;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class CategoryData implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 1;
    public CategoryDataItem[] cats;
    public String type;
    public String url;

    static {
        kge.a(-481251955);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
