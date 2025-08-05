package kotlin.reflect;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public /* synthetic */ class q {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            iArr[KVariance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KVariance.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KVariance.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
