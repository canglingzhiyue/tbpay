package com.taobao.uikit.extend.component.unify.Dialog;

import android.os.Build;
import android.support.v4.view.GravityCompat;

/* loaded from: classes9.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;
    
    private static final boolean HAS_RTL;

    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.GravityEnum$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum = new int[GravityEnum.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        HAS_RTL = z;
    }

    public int getGravityInt() {
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[ordinal()];
        if (i == 1) {
            if (!HAS_RTL) {
                return 3;
            }
            return GravityCompat.START;
        } else if (i == 2) {
            return 1;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Invalid gravity constant");
            }
            if (!HAS_RTL) {
                return 5;
            }
            return GravityCompat.END;
        }
    }

    public int getTextAlignment() {
        int i = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$GravityEnum[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
