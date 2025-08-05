package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class SideGudieInfo implements INetDataObject {
    public String gudieIcon;
    public String gudieTitle;
    public String recommendImg;
    public List<RecommendTextList> recommendTextList;
    public String recommendType;

    /* loaded from: classes8.dex */
    public static class RecommendTextList implements INetDataObject {
        public String color;
        public String icon;
        public String isBlod;
        public String text;

        static {
            kge.a(-1228893193);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1010186356);
        kge.a(-540945145);
    }
}
