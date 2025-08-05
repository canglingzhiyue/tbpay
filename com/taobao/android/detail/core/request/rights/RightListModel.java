package com.taobao.android.detail.core.request.rights;

import java.io.Serializable;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RightListModel implements Serializable {
    public ArrayList<ServiceItemModel> result;

    /* loaded from: classes4.dex */
    public static class RightItemModel implements Serializable {
        public ArrayList<String> desc;
        public String description;
        public String icon;
        public String id;
        public String link;
        public String name;
        public int showType;
        public int type;

        static {
            kge.a(-162858692);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes4.dex */
    public static class ServiceItemModel implements Serializable {
        public String description;
        public String icon;
        public String id;
        public String link;
        public String name;
        public ArrayList<RightItemModel> services;

        static {
            kge.a(-735408061);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(236823778);
        kge.a(1028243835);
    }

    public RightListModel() {
        emu.a("com.taobao.android.detail.core.request.rights.RightListModel");
    }
}
