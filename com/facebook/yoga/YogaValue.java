package com.facebook.yoga;

import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class YogaValue {
    static final YogaValue AUTO;
    static final YogaValue UNDEFINED;
    static final YogaValue ZERO;
    public final YogaUnit unit;
    public final float value;

    /* renamed from: com.facebook.yoga.YogaValue$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit = new int[YogaUnit.values().length];

        static {
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(419400637);
        UNDEFINED = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);
        ZERO = new YogaValue(0.0f, YogaUnit.POINT);
        AUTO = new YogaValue(Float.NaN, YogaUnit.AUTO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaValue(float f, int i) {
        this(f, YogaUnit.fromInt(i));
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.value = f;
        this.unit = yogaUnit;
    }

    public static YogaValue parse(String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? UNDEFINED : "auto".equals(str) ? AUTO : str.endsWith(riy.MOD) ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT) : new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = this.unit;
            if (yogaUnit == yogaValue.unit) {
                return yogaUnit == YogaUnit.UNDEFINED || this.unit == YogaUnit.AUTO || Float.compare(this.value, yogaValue.value) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value) + this.unit.intValue();
    }

    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.unit.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Float.toString(this.value);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                return "auto";
            }
            return this.value + riy.MOD;
        }
        return "undefined";
    }
}
