package com.taobao.android.detail.sdk.model.template;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class LayoutModel implements Serializable {
    public ComponentModel actionBar;
    public ComponentModel bottomBar;
    public ArrayList<ComponentModel> components;

    static {
        kge.a(1250292880);
        kge.a(1028243835);
    }

    public LayoutModel() {
        tpc.a("com.taobao.android.detail.sdk.model.template.LayoutModel");
    }
}
