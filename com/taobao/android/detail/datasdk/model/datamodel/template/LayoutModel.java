package com.taobao.android.detail.datasdk.model.datamodel.template;

import java.io.Serializable;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class LayoutModel implements Serializable {
    public ComponentModel actionBar;
    public ComponentModel bottomBar;
    public ArrayList<ComponentModel> components;

    static {
        kge.a(-30857334);
        kge.a(1028243835);
    }

    public LayoutModel() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.LayoutModel");
    }
}
