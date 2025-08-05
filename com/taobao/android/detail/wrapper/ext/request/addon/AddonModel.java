package com.taobao.android.detail.wrapper.ext.request.addon;

import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class AddonModel {
    public String addOnSession;
    public String itemId;
    public ArrayList<Item> items = new ArrayList<>();
    public String logo;
    public String promotionText;
    public String sellId;
    public String thresholdText;
    public String tipLink;

    /* loaded from: classes5.dex */
    public static class Item {
        public String maskColor;
        public String pic;
        public String subImage;
        public String text;

        static {
            kge.a(838352746);
        }
    }

    static {
        kge.a(1677442573);
    }

    public AddonModel() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.addon.AddonModel");
    }
}
