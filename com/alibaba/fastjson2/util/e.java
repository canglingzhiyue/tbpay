package com.alibaba.fastjson2.util;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public class e {
    public static final int ANDROID_SDK_INT;
    public static final long ARRAY_BYTE_BASE_OFFSET;
    public static final long ARRAY_CHAR_BASE_OFFSET;
    public static final boolean BIG_ENDIAN;
    public static final Unsafe UNSAFE;

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:3)(1:35)|4|5|6|(1:(2:8|(1:12)(1:31))(2:32|33))|(8:16|17|(1:19)(1:28)|20|21|22|23|24)|30|17|(0)(0)|20|21|22|23|24) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    static {
        /*
            r0 = -218916053(0xfffffffff2f39b2b, float:-9.650233E30)
            tb.kge.a(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            com.alibaba.fastjson2.util.e.BIG_ENDIAN = r0
            r0 = 0
            java.lang.Class<sun.misc.Unsafe> r1 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L47
            int r4 = r1.length     // Catch: java.lang.Throwable -> L47
        L1d:
            if (r2 >= r4) goto L3a
            r5 = r1[r2]     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "theUnsafe"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto L3b
            java.lang.String r7 = "THE_ONE"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r2 = r2 + 1
            goto L1d
        L3a:
            r5 = r0
        L3b:
            if (r5 == 0) goto L47
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r5.get(r0)     // Catch: java.lang.Throwable -> L47
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r1 = r0
        L48:
            com.alibaba.fastjson2.util.e.UNSAFE = r1
            r2 = -1
            if (r1 == 0) goto L5a
            java.lang.Class<byte[]> r3 = byte[].class
            int r3 = r1.arrayBaseOffset(r3)
            java.lang.Class<char[]> r4 = char[].class
            int r1 = r1.arrayBaseOffset(r4)
            goto L5c
        L5a:
            r1 = -1
            r3 = -1
        L5c:
            long r3 = (long) r3
            com.alibaba.fastjson2.util.e.ARRAY_BYTE_BASE_OFFSET = r3
            long r3 = (long) r1
            com.alibaba.fastjson2.util.e.ARRAY_CHAR_BASE_OFFSET = r3
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r3)     // Catch: java.lang.Throwable -> L72
            int r2 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L72
        L72:
            com.alibaba.fastjson2.util.e.ANDROID_SDK_INT = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.e.<clinit>():void");
    }
}
