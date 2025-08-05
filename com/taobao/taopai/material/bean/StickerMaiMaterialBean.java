package com.taobao.taopai.material.bean;

import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class StickerMaiMaterialBean {
    public String aspect;
    public Info info;
    public List<ModuleTree> modules;
    public String type;
    public String version;

    /* loaded from: classes8.dex */
    public static class Info {
        public String path;
        public String type;

        static {
            kge.a(708871398);
        }
    }

    /* loaded from: classes8.dex */
    public static class ModuleTree {
        public String id;
        public List<String> images;
        public String module;

        static {
            kge.a(1219923554);
        }
    }

    static {
        kge.a(212842892);
    }
}
