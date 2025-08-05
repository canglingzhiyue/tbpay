package com.taobao.android.purchase.core.address;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class NewErrorDialogStructure implements Serializable {
    public String image;
    public ButtonStructure left;
    public String msg;
    public ButtonStructure right;
    public String subTitle;
    public String title;
    public String titleBgColor;

    /* loaded from: classes6.dex */
    public static class ButtonStructure implements Serializable {
        public String bgColor;
        public String text;

        static {
            kge.a(1432152048);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1685775443);
        kge.a(1028243835);
    }
}
