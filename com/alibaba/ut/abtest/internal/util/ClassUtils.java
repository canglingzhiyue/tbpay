package com.alibaba.ut.abtest.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class ClassUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final char PACKAGE_SEPARATOR_CHAR = '.';

    static {
        kge.a(-1952063775);
    }

    private ClassUtils() {
    }

    public static Class<?> a(String str, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d2e3baa5", new Object[]{str, classLoader});
        }
        try {
            return b(str, classLoader);
        } catch (ClassNotFoundError e) {
            h.c("ClassUtils", "find class fail!", e);
            return null;
        }
    }

    public static Class<?> b(String str, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("67222a44", new Object[]{str, classLoader});
        }
        if (classLoader == null) {
            classLoader = ClassUtils.class.getClassLoader();
        }
        try {
            return a(classLoader, str, false);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundError(e);
        }
    }

    public static Class<?> a(ClassLoader classLoader, String str, boolean z) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("bfc2b2b5", new Object[]{classLoader, str, new Boolean(z)});
        }
        try {
            return Class.forName(a(str), z, classLoader);
        } catch (ClassNotFoundException e) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return a(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String c = n.c(str);
        j.a(c, "className must not be null.");
        if (!c.endsWith(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        while (c.endsWith(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)) {
            c = c.substring(0, c.length() - 2);
            sb.append(riy.ARRAY_START_STR);
        }
        sb.append("L");
        sb.append(c);
        sb.append(";");
        return sb.toString();
    }

    /* loaded from: classes3.dex */
    public static final class ClassNotFoundError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        static {
            kge.a(-764020988);
        }

        public ClassNotFoundError(Throwable th) {
            super(th);
        }

        public ClassNotFoundError(String str, Throwable th) {
            super(str, th);
        }
    }
}
