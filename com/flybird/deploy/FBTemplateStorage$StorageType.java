package com.flybird.deploy;

/* loaded from: classes4.dex */
public enum FBTemplateStorage$StorageType {
    DEFAULT(0, "default"),
    GRAY(1, com.taobao.android.weex_framework.util.a.ATOM_EXT_gray),
    EXP(2, "exp");
    
    public final int intVal;
    public final String pathPart;

    FBTemplateStorage$StorageType(int i, String str) {
        this.intVal = i;
        this.pathPart = str;
    }
}
