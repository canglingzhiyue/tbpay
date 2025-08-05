package com.taobao.android.tbuprofen.util;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes6.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15498a;

    public static native Field getDeclaredField(Class<?> cls, String str);

    public static native Method getDeclaredMethod(Class<?> cls, String str, Class<?>[] clsArr);

    private static native void init();

    static {
        kge.a(-1746067960);
        f15498a = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                if (!TextUtils.isEmpty(h.b().a("tbuprofen-util"))) {
                    return;
                }
                f15498a = true;
                init();
            } catch (Exception unused) {
            }
        }
    }

    public static Method a(String str, String str2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("77132f3a", new Object[]{str, str2, clsArr}) : a(true, str, str2, clsArr);
    }

    public static Method a(boolean z, String str, String str2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("1887fb6", new Object[]{new Boolean(z), str, str2, clsArr});
        }
        try {
            return a(z, Class.forName(str), str2, clsArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: Throwable -> 0x004e, TRY_LEAVE, TryCatch #0 {Throwable -> 0x004e, blocks: (B:7:0x000c, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:19:0x004a, B:15:0x0022, B:16:0x0043), top: B:26:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Method a(boolean r7, java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
        /*
            if (r8 == 0) goto L53
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L53
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L43
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4e
            r2 = 28
            if (r7 >= r2) goto L13
            goto L43
        L13:
            boolean r7 = com.taobao.android.tbuprofen.util.ReflectUtils.f15498a     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L22
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4e
            r2 = 30
            if (r7 < r2) goto L22
            java.lang.reflect.Method r7 = getDeclaredMethod(r8, r9, r10)     // Catch: java.lang.Throwable -> L4e
            goto L47
        L22:
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            java.lang.String r2 = "getDeclaredMethod"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4e
            r2[r6] = r9     // Catch: java.lang.Throwable -> L4e
            r2[r1] = r10     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r7.invoke(r8, r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L4e
            goto L47
        L43:
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> L4e
        L47:
            r0 = r7
            if (r0 == 0) goto L52
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            return r0
        L53:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "argument is null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.util.ReflectUtils.a(boolean, java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static Field a(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("4bb5245c", new Object[]{cls, str}) : a(true, cls, str);
    }

    public static Field a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("55e16479", new Object[]{str, str2}) : a(true, str, str2);
    }

    private static Field a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("b080cd7d", new Object[]{new Boolean(z), str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("argument is null");
        }
        try {
            return a(z, Class.forName(str), str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: Throwable -> 0x0047, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0047, blocks: (B:7:0x000c, B:10:0x0013, B:12:0x0017, B:14:0x001d, B:19:0x0043, B:15:0x0022, B:16:0x003c), top: B:26:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Field a(boolean r6, java.lang.Class<?> r7, java.lang.String r8) {
        /*
            if (r7 == 0) goto L4c
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L4c
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L3c
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L47
            r2 = 28
            if (r6 >= r2) goto L13
            goto L3c
        L13:
            boolean r6 = com.taobao.android.tbuprofen.util.ReflectUtils.f15498a     // Catch: java.lang.Throwable -> L47
            if (r6 == 0) goto L22
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L47
            r2 = 30
            if (r6 < r2) goto L22
            java.lang.reflect.Field r6 = getDeclaredField(r7, r8)     // Catch: java.lang.Throwable -> L47
            goto L40
        L22:
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            java.lang.String r2 = "getDeclaredField"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L47
            r2[r5] = r8     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r6.invoke(r7, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L47
            goto L40
        L3c:
            java.lang.reflect.Field r6 = r7.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L47
        L40:
            r0 = r6
            if (r0 == 0) goto L4b
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r6 = move-exception
            r6.printStackTrace()
        L4b:
            return r0
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "argument is null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.util.ReflectUtils.a(boolean, java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }
}
