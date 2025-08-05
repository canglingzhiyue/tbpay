package com.taobao.android.editionswitcher;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class PositionInfoExt implements Serializable {
    public String hTaoContentImg;
    public String oldDialogContentImg;
    public String oldDialogSubTitle;
    public String oldDialogTitle;

    static {
        kge.a(1629628519);
        kge.a(1028243835);
    }

    public PositionInfoExt() {
    }

    public PositionInfoExt(String str, String str2, String str3, String str4) {
        this.hTaoContentImg = str;
        this.oldDialogTitle = str2;
        this.oldDialogSubTitle = str3;
        this.oldDialogContentImg = str4;
    }
}
