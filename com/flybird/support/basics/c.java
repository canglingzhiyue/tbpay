package com.flybird.support.basics;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.CRC32;
import tb.cun;
import tb.idy;
import tb.ieb;

/* loaded from: classes4.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static final b<Pair<File, Long>, Pair<File, Boolean>> f7232a = new b<Pair<File, Long>, Pair<File, Boolean>>() { // from class: com.flybird.support.basics.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v6, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public Pair<File, Long> a(String str, Pair<File, Boolean> pair, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("5a0a24eb", new Object[]{this, str, pair, th});
            }
            cun.a(th, "write data object failed");
            return null;
        }

        /* JADX WARN: Type inference failed for: r6v8, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public Pair<File, Long> a(File file, Pair<File, Boolean> pair) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            if (!file.isFile() && file.equals(pair2.first)) {
                File file2 = (File) pair2.first;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            }
            return new Pair<>(pair2.first, Long.valueOf(((Boolean) pair2.second).booleanValue() ? idy.a(file) : 0L));
        }

        /* JADX WARN: Type inference failed for: r5v8, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public Pair<File, Long> a(String str, Pair<File, Boolean> pair) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            FileOutputStream fileOutputStream = new FileOutputStream((File) pair2.first);
            try {
                fileOutputStream.write(ConnectionUtils.a(str));
                fileOutputStream.close();
                return new Pair<>(pair2.first, Long.valueOf(((Boolean) pair2.second).booleanValue() ? idy.a(str) : 0L));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r6v9, types: [android.util.Pair<java.io.File, java.lang.Long>, java.lang.Object] */
        @Override // com.flybird.support.basics.b
        public Pair<File, Long> a(byte[] bArr, Pair<File, Boolean> pair) throws Throwable {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, pair});
            }
            Pair<File, Boolean> pair2 = pair;
            FileOutputStream fileOutputStream = new FileOutputStream((File) pair2.first);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                Object obj = pair2.first;
                if (((Boolean) pair2.second).booleanValue()) {
                    byte[][] bArr2 = {bArr};
                    CRC32 crc32 = new CRC32();
                    for (int i = 0; i < 1; i++) {
                        byte[] bArr3 = bArr2[i];
                        if (bArr3 != null) {
                            crc32.update(bArr3);
                        }
                    }
                    j = crc32.getValue();
                } else {
                    j = 0;
                }
                return new Pair<>(obj, Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    };

    public static File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{str});
        }
        ieb.a();
        File cacheDir = AppContextHolder.f7228a.getCacheDir();
        String a2 = idy.a(ConnectionUtils.a(str));
        return new File(cacheDir + File.separator + a2);
    }

    public static File a(String str, String str2, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b1c38f35", new Object[]{str, str2, new Boolean(z)});
        }
        ieb.a();
        try {
            File e = e(str, str2);
            if (z) {
                String keyValue = KVStorage.getKeyValue("fb__kv_checksum", str + "_" + str2);
                if (keyValue == null) {
                    cun.a("no expected checksum");
                    return null;
                }
                if (idy.a(e) != Long.parseLong(keyValue)) {
                    z2 = false;
                }
                if (!z2) {
                    cun.a("checksum failed");
                    return null;
                }
            }
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean a(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        ieb.a();
        File c = c(str, str2);
        if (!c.exists() || !c.delete()) {
            z = false;
        }
        KVStorage.setKeyValue("fb__kv_checksum", str + "_" + str2, null);
        return z;
    }

    public static File c(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fefdfe4f", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            cun.a("empty file name");
            return null;
        }
        File file = new File(b(str), str2);
        if (!file.isDirectory()) {
            return file;
        }
        cun.a("file " + str + "  " + str2 + "is a dir");
        return null;
    }

    public static File d(String str, String str2) throws Exception {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("19197cee", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            cun.a("empty folder name");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            file = b(str);
        } else {
            file = new File(b(str), str2);
        }
        if (!file.isFile()) {
            return file;
        }
        cun.a("folder " + str + " " + str2 + "is a file");
        return null;
    }

    public static boolean b(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        ieb.a();
        File d = d(str, str2);
        if (!d.exists()) {
            return true;
        }
        return a(d);
    }

    public static File e(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3334fb8d", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(new File(AppContextHolder.f7228a.getFilesDir(), str), str2);
            if (file.isFile()) {
                return file;
            }
            cun.a(str + " 's file " + str2 + " is not a file");
            return null;
        }
        cun.a("empty folder path or filename");
        return null;
    }

    public static File a(String str, String str2, Object obj, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("be06e711", new Object[]{str, str2, obj, new Boolean(z)});
        }
        ieb.a();
        File c = c(str, str2);
        if (c.exists()) {
            c.delete();
        }
        Pair<File, Long> a2 = f7232a.a(obj, new Pair<>(c, Boolean.valueOf(z)));
        if (a2 == null) {
            cun.a("write sync failed");
            return null;
        }
        if (z) {
            if (a2.second == null) {
                cun.a("missing checksum");
            }
            KVStorage.setKeyValue("fb__kv_checksum", str + "_" + str2, String.valueOf(a2.second));
        }
        return (File) a2.first;
    }

    public static List<File> a(String str, String str2, final FileFilter fileFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2110d5cc", new Object[]{str, str2, fileFilter});
        }
        try {
            File[] listFiles = d(str, null).listFiles(new FileFilter() { // from class: com.flybird.support.basics.-$$Lambda$syypXlfsaYckejkadfi-IKFTVog
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return c.a(fileFilter, file);
                }
            });
            if (listFiles != null) {
                List<File> asList = Arrays.asList(listFiles);
                Collections.sort(asList, $$Lambda$p3iBvnE56FrDX6zIcnKMJ5z3AAI.INSTANCE);
                return asList;
            }
        } catch (Exception e) {
            cun.a("FileStorage", "error on listFilesByCreate", e);
        }
        return new ArrayList();
    }

    public static /* synthetic */ boolean a(FileFilter fileFilter, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23772542", new Object[]{fileFilter, file})).booleanValue() : file.isFile() && fileFilter.accept(file);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    public static File b(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("36a9927a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            cun.a("empty folder path");
            return null;
        }
        File file = new File(AppContextHolder.f7228a.getFilesDir(), str);
        if (file.isFile() && !file.delete()) {
            cun.a("exception while deleting " + file);
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            cun.a("exception while mkdirs " + file);
            return null;
        }
    }

    public static void f(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            cun.a("empty folder path");
        }
        File file = new File(AppContextHolder.f7228a.getFilesDir(), str);
        File file2 = !TextUtils.isEmpty(str2) ? new File(file, str2) : file;
        if (file2.isFile()) {
            if (file2.delete()) {
                return;
            }
            cun.a("error on deleting " + file2);
        } else if (!file2.isDirectory() || a(file2)) {
        } else {
            cun.a("error on rm-dir-ing " + file2);
        }
    }
}
