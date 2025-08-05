package com.alibaba.jsi.standard;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.ils;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f3133a;
    public static String b;
    private static String c;
    private static String d;
    private static String e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static String i;
    private static String j;

    static {
        kge.a(694539810);
        c = null;
        d = null;
        e = null;
        f = true;
        g = false;
        h = false;
        i = null;
        j = null;
        f3133a = null;
        b = null;
    }

    public static synchronized void a(Object obj) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{obj});
            } else if (j != null) {
            } else {
                j = g.a(obj);
                f3133a = j + "/app_jsi";
                b = f3133a + "/shared";
                i = g.b(obj);
                e = f3133a + "/sopaths";
                File file = new File(f3133a);
                if (file.isFile()) {
                    file.delete();
                }
                if (!file.exists() && !file.mkdirs()) {
                    g.c("Make JSI data dir failed: " + f3133a);
                }
            }
        }
    }

    public static boolean a(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (g && h) {
            return true;
        }
        boolean z = str3 == null || str3.isEmpty() || Constants.CodeCache.SAVE_PATH.equals(str3);
        if (c == null && str != null && new File(str).isFile()) {
            c = str;
        }
        if (d == null && str2 != null && new File(str2).isFile()) {
            d = str2;
        }
        if (c != null && (!z || d != null)) {
            f = false;
        } else if (!a(z)) {
            if (c == null) {
                File file = new File(i, "libjsi.so");
                if (file.isFile()) {
                    c = file.getPath();
                }
            }
            if (d == null) {
                File file2 = new File(i, "libwebviewuc.so");
                if (file2.isFile()) {
                    d = file2.getPath();
                }
            }
            if (c == null || (z && d == null)) {
                File file3 = new File(j, "app_h5container");
                if (!file3.isDirectory() || !a(file3, z)) {
                    File file4 = new File(j, "app_ucmsdk");
                    if (file4.isDirectory()) {
                        b(file4, z);
                    }
                }
            }
        }
        String str5 = c;
        if (str5 == null) {
            throw new RuntimeException("Can not locate jsi so: libjsi.so");
        }
        if (!g) {
            System.load(str5);
            g = true;
            a(c);
        }
        String engineType = e.getEngineType();
        boolean z2 = z && engineType != null && engineType.contains(Constants.CodeCache.SAVE_PATH);
        if (d == null && z2) {
            throw new RuntimeException("Can not locate JS engine so: libwebviewuc.so");
        }
        if (z2 && !h) {
            long nativeCommand = JNIBridge.nativeCommand(1L, 0L, new Object[]{d});
            if (nativeCommand == 0) {
                h = true;
            } else if (nativeCommand != 1) {
                StringBuilder sb = new StringBuilder("Load JS engine '");
                sb.append(d);
                sb.append("' failed, code: ");
                sb.append(nativeCommand);
                sb.append(", message: ");
                Object[] objArr = new Object[1];
                if (JNIBridge.nativeCommand(4L, 1L, objArr) == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        str4 = (String) obj;
                        sb.append(str4);
                        throw new RuntimeException(sb.toString());
                    }
                }
                str4 = null;
                sb.append(str4);
                throw new RuntimeException(sb.toString());
            } else {
                g.a("UC linker is disabled, loaded JS engine so by default.");
            }
        }
        if (f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            sb2.append("`");
            sb2.append(d);
            sb2.append("`");
            sb2.append(String.valueOf(new File(c).length()));
            File file5 = new File(e + ".tmp");
            a(file5, sb2.toString());
            File file6 = new File(e);
            try {
                file6.delete();
                file5.renameTo(file6);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    public static boolean a(int i2) {
        String engineType;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i2)})).booleanValue();
        }
        if (!g) {
            return false;
        }
        if ((i2 != 1 || h) && (engineType = e.getEngineType()) != null) {
            for (String str : engineType.split(",")) {
                if (Constants.CodeCache.SAVE_PATH.equals(str)) {
                    if ((i2 == 1 || i2 == 0) && h) {
                        return true;
                    }
                } else if ("jsc".equals(str)) {
                    if (i2 == 2 || i2 == 0) {
                        return true;
                    }
                } else if ("qjs".equals(str) && (i2 == 3 || i2 == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(File file, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85d0ed9", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        File file2 = new File(file, "uc");
        if (!file2.isDirectory() || (listFiles = file2.listFiles()) == null) {
            return false;
        }
        for (File file3 : listFiles) {
            if (file3.isDirectory() && c(new File(file3, "so/lib"), z)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(File file, boolean z) {
        File[] listFiles;
        File[] listFiles2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("affee538", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        File[] listFiles3 = file.listFiles();
        if (listFiles3 == null) {
            return false;
        }
        for (File file2 : listFiles3) {
            if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    if (file3.isDirectory() && (listFiles2 = file3.listFiles()) != null) {
                        for (File file4 : listFiles2) {
                            File file5 = new File(file4, "lib");
                            if (c(file5, z)) {
                                return true;
                            }
                            File[] listFiles4 = file5.listFiles();
                            if (listFiles4 != null) {
                                for (File file6 : listFiles4) {
                                    if (c(file6, z)) {
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private static boolean c(File file, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97a0bb97", new Object[]{file, new Boolean(z)})).booleanValue();
        }
        if (!file.isDirectory()) {
            return false;
        }
        File file2 = new File(file, "libjsi.so");
        if (file2.isFile()) {
            c = file2.getPath();
        }
        File file3 = new File(file, "libwebviewuc.so");
        if (file3.isFile()) {
            d = file3.getPath();
        }
        return c != null && (!z || d != null);
    }

    private static boolean a(boolean z) {
        String a2;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        File file = new File(e);
        if (!file.isFile() || (a2 = a(file)) == null) {
            return false;
        }
        String[] split = a2.trim().split("`");
        if (split.length != 3) {
            return false;
        }
        try {
            j2 = Long.parseLong(split[2]);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            j2 = 0;
        }
        if (j2 == 0) {
            return false;
        }
        File file2 = new File(split[0]);
        if (!file2.isFile() || !file2.getName().equals("libjsi.so") || file2.length() != j2) {
            return false;
        }
        c = split[0];
        if (new File(split[1]).isFile()) {
            d = split[1];
            f = false;
        }
        return !z || d != null;
    }

    private static String a(File file) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    return sb.toString();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                th.printStackTrace();
                return null;
            } finally {
                a((Closeable) fileInputStream);
            }
        }
    }

    private static boolean a(File file, String str) {
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{file, str})).booleanValue();
        }
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str, 0, str.length());
            a((Closeable) fileWriter);
            return true;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            try {
                th.printStackTrace();
                a((Closeable) fileWriter2);
                return false;
            } catch (Throwable th3) {
                a((Closeable) fileWriter2);
                throw th3;
            }
        }
    }

    private static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else if (th == null) {
        } else {
            th.printStackTrace(new PrintStream(new i()));
        }
    }

    private static void a(String str) {
        Field a2;
        Object obj;
        if (!g.c()) {
            return;
        }
        try {
            Object b2 = b(g.class.getClassLoader());
            if (b2 == null || (a2 = a(b2, "nativeLibraryDirectories")) == null || (obj = a2.get(b2)) == null) {
                return;
            }
            File file = new File(str);
            if (file.isFile()) {
                file = file.getParentFile();
            }
            File[] fileArr = (File[]) obj;
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            boolean z = false;
            for (File file2 : fileArr) {
                if (file2.getPath().contains(ils.ARCH_BIT64)) {
                    z = true;
                }
                if (!file.getPath().equals(file2.getPath())) {
                    arrayList.add(file2);
                }
            }
            if (!z) {
                return;
            }
            a2.set(b2, arrayList.toArray(new File[0]));
            g.a("Add native library dir succeed: " + file.getPath());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static Object b(Object obj) {
        try {
            Field a2 = a(obj, "pathList");
            if (a2 == null) {
                return null;
            }
            return a2.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("c522740b", new Object[]{obj, str});
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
