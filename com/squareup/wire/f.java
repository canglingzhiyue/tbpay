package com.squareup.wire;

/* loaded from: classes4.dex */
final class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str + " == null");
    }
}
