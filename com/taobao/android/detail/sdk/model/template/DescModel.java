package com.taobao.android.detail.sdk.model.template;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DescModel implements Serializable {
    public ArrayList<ComponentModel> components;
    public ArrayList<b> requestApis = new ArrayList<>();
    public ArrayList<ActionModel> actionModels = new ArrayList<>();

    static {
        kge.a(-791879223);
        kge.a(1028243835);
    }

    public DescModel() {
        tpc.a("com.taobao.android.detail.sdk.model.template.DescModel");
    }
}
