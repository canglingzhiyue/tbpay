package com.uc.webview.base;

import android.os.Build;
import com.android.alibaba.ip.server.FileManager;
import com.uc.webview.base.io.PathUtils;
import dalvik.system.DexClassLoader;
import java.io.File;

/* loaded from: classes9.dex */
public class i extends DexClassLoader {
    public i(String str, String str2, String str3, ClassLoader classLoader) {
        super(a(str, str2), str2, str3, classLoader);
        a(str, str2, false);
    }

    private static String a(String str, String str2) {
        a(str, str2, true);
        if ((Build.VERSION.SDK_INT == 30 || Build.VERSION.SDK_INT == 31 || Build.VERSION.SDK_INT == 32) && str.endsWith(".jar")) {
            return j.a(str);
        }
        if (Build.VERSION.SDK_INT < 34) {
            return str;
        }
        try {
            new File(str).setReadOnly();
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String a(String str, String str2, boolean z) {
        if (Build.VERSION.SDK_INT == 21) {
            for (String str3 : str.split(":")) {
                String name = new File(str3).getName();
                if (!name.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
                    int lastIndexOf = name.lastIndexOf(".");
                    if (lastIndexOf < 0) {
                        name = name + FileManager.CLASSES_DEX_SUFFIX;
                    } else {
                        StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                        sb.append((CharSequence) name, 0, lastIndexOf);
                        sb.append(FileManager.CLASSES_DEX_SUFFIX);
                        name = sb.toString();
                    }
                }
                File file = new File(str2, name);
                if (file.exists()) {
                    File file2 = new File(str2, PathUtils.generateName(file));
                    if (!file2.exists()) {
                        if (z) {
                            com.uc.webview.base.io.d.c("UCLoader", file);
                        } else {
                            com.uc.webview.base.io.d.b("UCLoader", file2);
                        }
                    }
                }
            }
        }
        return str;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> cls;
        synchronized (i.class) {
            try {
                cls = super.findClass(str);
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls == null) {
                cls = findLoadedClass(str);
            }
            if (cls == null) {
                return getParent().loadClass(str);
            }
            return cls;
        }
    }

    @Override // java.lang.ClassLoader
    protected Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        Class<?> findClass;
        synchronized (i.class) {
            if (!str.startsWith("com.uc.") && !str.startsWith("org.chromium.")) {
                findClass = super.loadClass(str, z);
            }
            Class<?> findLoadedClass = findLoadedClass(str);
            findClass = findLoadedClass == null ? findClass(str) : findLoadedClass;
        }
        return findClass;
    }
}
