package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoliveSearchHotWords implements IMTOPDataObject {
    public static final String TYPE_HINT = "hint";
    public static final String TYPE_URL = "url";
    public static final String TYPE_WORD = "word";
    public RightInfo rightInfo;
    public String type;
    public String url;
    public String word;

    /* loaded from: classes6.dex */
    public class RightInfo implements IMTOPDataObject {
        public String anchorId;
        public String itemId;
        public String liveId;
        public String reasonLong;
        public String reasonShort;
        public String rightType;

        static {
            kge.a(955008723);
            kge.a(-350052935);
        }

        public RightInfo() {
        }
    }

    static {
        kge.a(968807917);
        kge.a(-350052935);
    }
}
