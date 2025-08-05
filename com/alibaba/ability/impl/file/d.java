package com.alibaba.ability.impl.file;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Date;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-713244668);
    }

    public static final boolean a(File deleteSafely) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{deleteSafely})).booleanValue();
        }
        q.d(deleteSafely, "$this$deleteSafely");
        if (!deleteSafely.exists()) {
            return false;
        }
        try {
            if (TextUtils.equals(deleteSafely.getCanonicalPath(), "/")) {
                return false;
            }
            if (!TextUtils.equals(deleteSafely.getAbsolutePath(), "/")) {
                return deleteSafely.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final long b(File size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58420194", new Object[]{size})).longValue();
        }
        q.d(size, "$this$size");
        long j = 0;
        if (!size.exists()) {
            return 0L;
        }
        if (size.isFile()) {
            return size.length();
        }
        File[] listFiles = size.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                q.b(file, "file");
                j += b(file);
            }
        }
        return j;
    }

    public static final long c(File getCreateTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25ec6355", new Object[]{getCreateTime})).longValue();
        }
        q.d(getCreateTime, "$this$getCreateTime");
        if (getCreateTime.exists()) {
            return new Date(getCreateTime.lastModified()).getTime();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.io.File r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.file.d.a(java.io.File, java.lang.String):java.lang.String");
    }

    public static final String d(File getSha1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92c5d7be", new Object[]{getSha1});
        }
        q.d(getSha1, "$this$getSha1");
        return a(getSha1, "SHA-1");
    }

    public static final String e(File getMD5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("705101d", new Object[]{getMD5});
        }
        q.d(getMD5, "$this$getMD5");
        return a(getMD5, "MD5");
    }
}
