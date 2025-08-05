package com.android.alibaba.ip.server;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.utils.RefectUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import tb.kge;

/* loaded from: classes3.dex */
public class MonkeyPatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Object activityThread;

    static {
        kge.a(182659517);
        activityThread = null;
    }

    public static Object getActivityThread(Context context, Class<?> cls) {
        try {
            if (activityThread != null) {
                return activityThread;
            }
            if (cls == null) {
                cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            }
            Method method = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke != null) {
                activityThread = invoke;
            }
            if (invoke != null || context == null) {
                return invoke;
            }
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            activityThread = obj2;
            return obj2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: Throwable -> 0x0017, TryCatch #5 {Throwable -> 0x0017, blocks: (B:5:0x000a, B:6:0x0010, B:12:0x0021, B:14:0x003f, B:16:0x0048, B:18:0x0052, B:20:0x005e, B:22:0x0062, B:23:0x0076, B:25:0x007c, B:27:0x008e, B:29:0x009c, B:30:0x00a0, B:31:0x00a3, B:33:0x00d5, B:37:0x00ec, B:40:0x00f5, B:41:0x010d, B:45:0x0145, B:46:0x0149, B:48:0x014f, B:53:0x0184, B:54:0x0190, B:43:0x011f, B:44:0x0130, B:60:0x01a0, B:61:0x01a7, B:36:0x00e9, B:19:0x005a, B:11:0x001b, B:50:0x015d), top: B:72:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: Throwable -> 0x0017, TryCatch #5 {Throwable -> 0x0017, blocks: (B:5:0x000a, B:6:0x0010, B:12:0x0021, B:14:0x003f, B:16:0x0048, B:18:0x0052, B:20:0x005e, B:22:0x0062, B:23:0x0076, B:25:0x007c, B:27:0x008e, B:29:0x009c, B:30:0x00a0, B:31:0x00a3, B:33:0x00d5, B:37:0x00ec, B:40:0x00f5, B:41:0x010d, B:45:0x0145, B:46:0x0149, B:48:0x014f, B:53:0x0184, B:54:0x0190, B:43:0x011f, B:44:0x0130, B:60:0x01a0, B:61:0x01a7, B:36:0x00e9, B:19:0x005a, B:11:0x001b, B:50:0x015d), top: B:72:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[Catch: Throwable -> 0x0017, TryCatch #5 {Throwable -> 0x0017, blocks: (B:5:0x000a, B:6:0x0010, B:12:0x0021, B:14:0x003f, B:16:0x0048, B:18:0x0052, B:20:0x005e, B:22:0x0062, B:23:0x0076, B:25:0x007c, B:27:0x008e, B:29:0x009c, B:30:0x00a0, B:31:0x00a3, B:33:0x00d5, B:37:0x00ec, B:40:0x00f5, B:41:0x010d, B:45:0x0145, B:46:0x0149, B:48:0x014f, B:53:0x0184, B:54:0x0190, B:43:0x011f, B:44:0x0130, B:60:0x01a0, B:61:0x01a7, B:36:0x00e9, B:19:0x005a, B:11:0x001b, B:50:0x015d), top: B:72:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: Throwable -> 0x0017, TryCatch #5 {Throwable -> 0x0017, blocks: (B:5:0x000a, B:6:0x0010, B:12:0x0021, B:14:0x003f, B:16:0x0048, B:18:0x0052, B:20:0x005e, B:22:0x0062, B:23:0x0076, B:25:0x007c, B:27:0x008e, B:29:0x009c, B:30:0x00a0, B:31:0x00a3, B:33:0x00d5, B:37:0x00ec, B:40:0x00f5, B:41:0x010d, B:45:0x0145, B:46:0x0149, B:48:0x014f, B:53:0x0184, B:54:0x0190, B:43:0x011f, B:44:0x0130, B:60:0x01a0, B:61:0x01a7, B:36:0x00e9, B:19:0x005a, B:11:0x001b, B:50:0x015d), top: B:72:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0 A[Catch: Throwable -> 0x0017, TRY_ENTER, TryCatch #5 {Throwable -> 0x0017, blocks: (B:5:0x000a, B:6:0x0010, B:12:0x0021, B:14:0x003f, B:16:0x0048, B:18:0x0052, B:20:0x005e, B:22:0x0062, B:23:0x0076, B:25:0x007c, B:27:0x008e, B:29:0x009c, B:30:0x00a0, B:31:0x00a3, B:33:0x00d5, B:37:0x00ec, B:40:0x00f5, B:41:0x010d, B:45:0x0145, B:46:0x0149, B:48:0x014f, B:53:0x0184, B:54:0x0190, B:43:0x011f, B:44:0x0130, B:60:0x01a0, B:61:0x01a7, B:36:0x00e9, B:19:0x005a, B:11:0x001b, B:50:0x015d), top: B:72:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void monkeyPatchExistingResources(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.server.MonkeyPatcher.monkeyPatchExistingResources(android.content.Context, java.lang.String):void");
    }

    private static void pruneResourceCaches(Object obj) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mTypedArrayPool");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                Method declaredMethod = obj2.getClass().getDeclaredMethod("acquire", new Class[0]);
                declaredMethod.setAccessible(true);
                do {
                } while (declaredMethod.invoke(obj2, new Object[0]) != null);
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(obj);
            } catch (Throwable unused2) {
            }
        }
        Object obj3 = null;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                Field declaredField3 = obj.getClass().getDeclaredField("mAccessLock");
                declaredField3.setAccessible(true);
                obj3 = declaredField3.get(obj);
            } else {
                Field declaredField4 = Resources.class.getDeclaredField("mTmpValue");
                declaredField4.setAccessible(true);
                obj3 = declaredField4.get(obj);
            }
        } catch (Throwable unused3) {
        }
        if (obj3 == null) {
            obj3 = MonkeyPatcher.class;
        }
        synchronized (obj3) {
            pruneResourceCache(obj, "mDrawableCache");
            pruneResourceCache(obj, "mColorDrawableCache");
            pruneResourceCache(obj, "mColorStateListCache");
            if (Build.VERSION.SDK_INT >= 23) {
                pruneResourceCache(obj, "mAnimatorCache");
                pruneResourceCache(obj, "mStateListAnimatorCache");
            } else if (Build.VERSION.SDK_INT == 19) {
                pruneResourceCache(obj, "sPreloadedDrawables");
                pruneResourceCache(obj, "sPreloadedColorDrawables");
                pruneResourceCache(obj, "sPreloadedColorStateLists");
            }
        }
    }

    private static boolean pruneResourceCache(Object obj, String str) {
        LongSparseArray[] longSparseArrayArr;
        try {
            Field field = RefectUtils.field(obj, str);
            if (field == null) {
                field = Resources.class.getDeclaredField(str);
            }
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            Class<?> type = field.getType();
            if (Build.VERSION.SDK_INT < 16) {
                if (obj2 instanceof SparseArray) {
                    ((SparseArray) obj2).clear();
                    return true;
                } else if (Build.VERSION.SDK_INT >= 14 && (obj2 instanceof LongSparseArray)) {
                    ((LongSparseArray) obj2).clear();
                    return true;
                }
            } else if (Build.VERSION.SDK_INT < 23) {
                if ("mColorStateListCache".equals(str)) {
                    if (obj2 instanceof LongSparseArray) {
                        ((LongSparseArray) obj2).clear();
                    }
                } else if (type.isAssignableFrom(ArrayMap.class)) {
                    Method declaredMethod = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", ArrayMap.class, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, obj2, -1);
                    return true;
                } else if (type.isAssignableFrom(LongSparseArray.class)) {
                    try {
                        Method declaredMethod2 = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", LongSparseArray.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(obj, obj2, -1);
                        return true;
                    } catch (NoSuchMethodException unused) {
                        if (obj2 instanceof LongSparseArray) {
                            ((LongSparseArray) obj2).clear();
                            return true;
                        }
                    }
                } else if (type.isArray() && type.getComponentType().isAssignableFrom(LongSparseArray.class)) {
                    for (LongSparseArray longSparseArray : (LongSparseArray[]) obj2) {
                        if (longSparseArray != null) {
                            longSparseArray.clear();
                        }
                    }
                    return true;
                }
            } else if (type != null) {
                Method declaredMethod3 = type.getDeclaredMethod("onConfigurationChange", Integer.TYPE);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(obj2, -1);
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    public static void mergeResFile(File file, String str) throws IOException {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c80ec", new Object[]{file, str});
            return;
        }
        File createTempFile = File.createTempFile("resources", null, new File(str).getParentFile());
        byte[] bArr = new byte[1024];
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream);
        ZipFile zipFile = new ZipFile(file);
        ZipFile zipFile2 = new ZipFile(str);
        HashSet hashSet = new HashSet();
        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
        while (true) {
            str2 = "resources.arsc";
            if (!entries.hasMoreElements()) {
                break;
            }
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (!name.contains("../") && !nextElement.getName().endsWith(FileManager.CLASSES_DEX_SUFFIX) && !nextElement.isDirectory()) {
                hashSet.add(nextElement.getName());
                ZipEntry zipEntry = new ZipEntry(name);
                if (name.contains("raw/") || name.contains("assets/") || name.equals(str2)) {
                    zipEntry.setMethod(0);
                    zipEntry.setCrc(nextElement.getCrc());
                    zipEntry.setSize(nextElement.getSize());
                }
                zipOutputStream.putNextEntry(zipEntry);
                write(zipFile2.getInputStream(nextElement), zipOutputStream, bArr);
                bufferedOutputStream.flush();
            }
        }
        Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
        while (entries2.hasMoreElements()) {
            ZipEntry nextElement2 = entries2.nextElement();
            String name2 = nextElement2.getName();
            if (!name2.contains("../") && !name2.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
                Enumeration<? extends ZipEntry> enumeration = entries2;
                if (!hashSet.contains(nextElement2.getName())) {
                    ZipEntry zipEntry2 = new ZipEntry(name2);
                    if (name2.contains("raw/") || name2.contains("assets/") || name2.equals(str2)) {
                        zipEntry2.setMethod(0);
                        str3 = str2;
                        zipEntry2.setCrc(nextElement2.getCrc());
                        zipEntry2.setSize(nextElement2.getSize());
                    } else {
                        str3 = str2;
                    }
                    zipOutputStream.putNextEntry(zipEntry2);
                    write(zipFile.getInputStream(nextElement2), zipOutputStream, bArr);
                    bufferedOutputStream.flush();
                    entries2 = enumeration;
                    str2 = str3;
                } else {
                    entries2 = enumeration;
                }
            }
        }
        zipFile.close();
        zipFile2.close();
        closeQuitely(zipOutputStream);
        closeQuitely(bufferedOutputStream);
        if (createTempFile.exists()) {
            new File(str).delete();
            createTempFile.renameTo(new File(str));
        }
        if (!new File(str).exists()) {
            throw new IOException("merge resource patch failed");
        }
    }

    private static void write(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f364a8a6", new Object[]{inputStream, outputStream, bArr});
            return;
        }
        int read = inputStream.read(bArr);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        closeQuitely(inputStream);
    }

    private static void closeQuitely(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26215439", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
