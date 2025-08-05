package com.alibaba.android.split.scene;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class FeatureNode implements Serializable {
    public List<String> activities;
    public List<String> dependsOn;
    public String scene;
    public String tabName = "default";

    static {
        kge.a(1034464351);
        kge.a(1028243835);
    }
}
