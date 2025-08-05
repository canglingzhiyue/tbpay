package com.amap.api.location;

/* loaded from: classes3.dex */
public class CoordUtil {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6387a = false;

    public static native int convertToGcj(double[] dArr, double[] dArr2);

    public static boolean isLoadedSo() {
        return f6387a;
    }

    public static void setLoadedSo(boolean z) {
        f6387a = z;
    }
}
