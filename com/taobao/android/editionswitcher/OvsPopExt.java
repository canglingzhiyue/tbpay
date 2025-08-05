package com.taobao.android.editionswitcher;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class OvsPopExt implements Serializable {
    public static final int KIND_CHANGE_AREA_COUNTDOWN = 1;
    public static final int KIND_CHANGE_AREA_DEFAULT = 0;
    public static final int KIND_CHANGE_AREA_FORCE = 2;
    public int ovsRemindCountDown;
    public int ovsRemindKind = 0;

    static {
        kge.a(1851232665);
        kge.a(1028243835);
    }
}
