package com.taobao.taopai.material.maires;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MaiResDependenceList {
    @JSONField(name = "dependence")
    public List<MaiResDependenceItem> mDependenceList;

    /* loaded from: classes8.dex */
    public static class MaiResDependenceItem {
        @JSONField(name = "eagerinit")
        public int eagerInit;
        public int id;
        public boolean isDownloadSuccess;
        public int materialGroup;
        public int materialType;
        public String module;
        public String name;
        public String type;
        public String url;
        public int version;

        static {
            kge.a(-1457282633);
        }
    }

    static {
        kge.a(-1837941598);
    }
}
