package com.taobao.android.detail.sdk.request.diva;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DivaExtraRelation extends DetailVRequestParams implements Serializable, IMTOPDataObject {
    public List<PromotionTagInfo> contents;
    public int rotation;

    /* loaded from: classes4.dex */
    public static class PromotionTagInfo implements Serializable {
        public List<TagLayoutInfo> icons;

        static {
            kge.a(-1232372084);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class TagLayoutInfo implements Serializable {
        public String divaViewHeight;
        public String divaViewWidth;
        public int height;
        public String img;
        public String type;
        public double weightX;
        public double weightY;
        public int width;
        public int z;

        static {
            kge.a(-1909040565);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1835865245);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public DivaExtraRelation() {
        tpc.a("com.taobao.android.detail.sdk.request.diva.DivaExtraRelation");
    }
}
