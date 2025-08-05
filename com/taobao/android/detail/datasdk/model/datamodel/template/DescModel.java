package com.taobao.android.detail.datasdk.model.datamodel.template;

import java.io.Serializable;
import java.util.ArrayList;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DescModel implements Serializable {
    public ArrayList<ComponentModel> components;
    public ArrayList<b> requestApis = new ArrayList<>();
    public ArrayList<ActionModel> actionModels = new ArrayList<>();

    static {
        kge.a(-1615557821);
        kge.a(1028243835);
    }

    public DescModel() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.DescModel");
    }
}
