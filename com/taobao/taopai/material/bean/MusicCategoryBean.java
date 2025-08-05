package com.taobao.taopai.material.bean;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicCategoryBean implements Serializable, IMTOPDataObject {
    public int id;
    public String logoUrl;
    public String name;
    public SubCategoryInfo subCategories;
    public String type;
    public int useCount;

    /* loaded from: classes8.dex */
    public static class SubCategoryInfo implements Serializable, IMTOPDataObject {
        public int relatedCollectionId;
        public int vendorCategoryId;

        static {
            kge.a(328677822);
            kge.a(1028243835);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(1787699542);
        kge.a(1028243835);
        kge.a(-350052935);
    }
}
