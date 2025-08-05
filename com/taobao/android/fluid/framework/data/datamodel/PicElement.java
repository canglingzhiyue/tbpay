package com.taobao.android.fluid.framework.data.datamodel;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class PicElement extends BaseElement {
    public List<Anchor> anchors;
    private String decideUrl;
    public String desc;
    public int height;
    public String name;
    public String summary;
    public String url;
    public int width;

    /* loaded from: classes5.dex */
    public static final class Anchor implements IMTOPDataObject {
        public String itemId;
        public String targetUrl;
        public String text;
        public int x;
        public int y;

        static {
            kge.a(1795748987);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(-387990082);
    }

    public String getDecideUrl() {
        return this.decideUrl;
    }

    public void setDecideUrl(String str) {
        this.decideUrl = str;
    }
}
