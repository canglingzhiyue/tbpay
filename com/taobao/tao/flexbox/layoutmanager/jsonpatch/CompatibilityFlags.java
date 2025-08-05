package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import java.util.EnumSet;

/* loaded from: classes8.dex */
public enum CompatibilityFlags {
    MISSING_VALUES_AS_NULLS,
    REMOVE_NONE_EXISTING_ARRAY_ELEMENT;

    public static EnumSet<CompatibilityFlags> defaults() {
        return EnumSet.noneOf(CompatibilityFlags.class);
    }
}
