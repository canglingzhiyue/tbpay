package com.taobao.android.shop.features.category;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class CategoryDataItem implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 1;
    public String id;
    public String imagePath;
    public String mcatImg;
    public String name;
    public String parID;
    public CategoryDataItem[] subCats;

    static {
        kge.a(1226313280);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
