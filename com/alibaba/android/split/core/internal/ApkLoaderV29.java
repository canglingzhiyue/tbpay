package com.alibaba.android.split.core.internal;

import android.content.pm.PackageManager;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.q;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipFile;
import tb.bgv;
import tb.bgy;
import tb.kge;

/* loaded from: classes2.dex */
public class ApkLoaderV29 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEX_SUFFIX = ".dex";
    private static final String ODEX_SUFFIX = ".odex";
    private static final String PM_INTERFACE_DESCRIPTOR = "android.content.pm.IPackageManager";
    private static bgv sLogger;

    public static /* synthetic */ bgv access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgv) ipChange.ipc$dispatch("4bd6687e", new Object[0]) : sLogger;
    }

    static {
        kge.a(1393239302);
        kge.a(-324479817);
        sLogger = new bgv("ApkLoaderV29");
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            ApkLoaderV26.innerLoad(classLoader, set, z);
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91cbc261", new Object[]{this, classLoader, file, qVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z && z2) {
            return performDexOptSecondary(qVar.a());
        }
        boolean injectDexElements = ApkLoaderV21.injectDexElements(classLoader, file, qVar, z, new V24DexElementsMaker(), "path", new SkipDexOpter(), z2);
        performDexOptSecondary(qVar.a());
        return injectDexElements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v9 */
    private ByteBuffer allocate(File file) {
        Throwable th;
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (ByteBuffer) ipChange.ipc$dispatch("b26ff17c", new Object[]{this, file});
        }
        try {
            try {
                r1 = new ZipFile(file);
            } catch (Exception e) {
                e = e;
                inputStream = null;
                r1 = 0;
            } catch (Throwable th2) {
                r1 = 0;
                th = th2;
                file = 0;
            }
            try {
                inputStream = r1.getInputStream(r1.getEntry(InstantPatcher.CLASSES_DEX));
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                file = 0;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                if (file != 0) {
                    try {
                        file.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocate = ByteBuffer.allocate(byteArray.length);
                allocate.put(byteArray);
                allocate.position(0);
                try {
                    r1.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return allocate;
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean performDexOptSecondary(File file) throws IllegalStateException {
        if (file.getName().equals("com_taobao_plugin.apk")) {
            PackageManager packageManager = j.h().e().getPackageManager();
            try {
                final boolean[] zArr = {false};
                Method declaredMethod = packageManager.getClass().getDeclaredMethod("registerDexModule", String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback"));
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                declaredMethod.invoke(packageManager, file.getAbsolutePath(), new PackageManager.DexModuleRegisterCallback() { // from class: com.alibaba.android.split.core.internal.ApkLoaderV29.1
                    public void onDexModuleRegistered(String str, boolean z, String str2) {
                        if (z) {
                            zArr[0] = true;
                            Log.e("ApkLoaderV30", "registerDexModule success");
                            ApkLoaderV29.access$000().d("registerDexModule success", new Object[0]);
                        } else {
                            Log.e("ApkLoaderV30", "registerDexModule failed! dexModulePath:" + str + " message:" + str2);
                            ApkLoaderV29.access$000().d("registerDexModule failed! dexModulePath: %s message:%s", str, str2);
                        }
                        countDownLatch.countDown();
                    }
                });
                if (countDownLatch.await(30L, TimeUnit.SECONDS)) {
                    if (zArr[0]) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        if (v.e(j.h().e(), bgy.j(file.getName()))) {
            PackageManager packageManager2 = j.h().e().getPackageManager();
            try {
                packageManager2.getClass().getDeclaredMethod("registerDexModule", String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")).invoke(packageManager2, file.getAbsolutePath(), new PackageManager.DexModuleRegisterCallback() { // from class: com.alibaba.android.split.core.internal.ApkLoaderV29.2
                    public void onDexModuleRegistered(String str, boolean z, String str2) {
                        if (z) {
                            Log.e("ApkLoaderV30", "registerDexModule success");
                            ApkLoaderV29.access$000().d("registerDexModule success", new Object[0]);
                            return;
                        }
                        Log.e("ApkLoaderV30", "registerDexModule failed! dexModulePath:" + str + " message:" + str2);
                        ApkLoaderV29.access$000().d("registerDexModule failed! dexModulePath: %s message:%s", str, str2);
                    }
                });
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    private static String optimizedPathFor(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("186f88ee", new Object[]{file, file2});
        }
        String name = file.getName();
        if (!name.endsWith(".dex")) {
            int lastIndexOf = name.lastIndexOf(".");
            if (lastIndexOf < 0) {
                name = name + ODEX_SUFFIX;
            } else {
                StringBuilder sb = new StringBuilder(lastIndexOf + 4);
                sb.append((CharSequence) name, 0, lastIndexOf);
                sb.append(ODEX_SUFFIX);
                name = sb.toString();
            }
        }
        return new File(file2, name).getPath();
    }
}
