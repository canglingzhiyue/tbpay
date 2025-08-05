package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class rgn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 7;
    public static final int BIT64 = 8;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f33147a;
    private static int b;

    static {
        kge.a(1182070308);
        f33147a = new HashSet();
        b = -1;
    }

    public static int getCurrentCpuArchValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92483c50", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return 7;
        }
        String str = Build.SUPPORTED_ABIS[0];
        if (str.toLowerCase().startsWith("arm64") || str.toLowerCase().startsWith("x86_64") || str.toLowerCase().startsWith("mips64")) {
            return 8;
        }
        return (str.toLowerCase().startsWith("armeabi") || str.toLowerCase().startsWith(iju.ABI_ARM) || str.toLowerCase().startsWith("x86")) ? 7 : -1;
    }

    public static int getCpuArch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af213e62", new Object[0])).intValue();
        }
        if (getCurrentRuntimeCpuArchValue(rfy.sContext) != 8) {
            return getCurrentCpuArchValue();
        }
        return 8;
    }

    public static int getCurrentRuntimeCpuArchValue(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b01ee26c", new Object[]{context})).intValue();
        }
        int i = b;
        if (i != -1) {
            return i;
        }
        int a2 = a(context.getApplicationInfo().nativeLibraryDir);
        if (a2 == -1) {
            a2 = getCpuArchValueFromApk(context);
        }
        b = a2;
        String str = "getCpuArchValue " + a2;
        return a2;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return -1;
        }
        String lowerCase = file.getName().toLowerCase();
        if (Build.VERSION.SDK_INT >= 21 && lowerCase.startsWith("arm64")) {
            return 8;
        }
        return lowerCase.equals("arm") ? 7 : -1;
    }

    public static synchronized Set<String> getSupportedAbis(ApplicationInfo applicationInfo) {
        ZipFile zipFile;
        File parentFile;
        synchronized (rgn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("17996de6", new Object[]{applicationInfo});
            }
            if (f33147a != null && !f33147a.isEmpty()) {
                return f33147a;
            }
            HashSet<String> hashSet = new HashSet();
            hashSet.add(applicationInfo.sourceDir);
            if (Build.VERSION.SDK_INT >= 21 && applicationInfo.splitSourceDirs != null) {
                hashSet.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
            }
            for (String str : hashSet) {
                ZipFile zipFile2 = null;
                try {
                    try {
                        zipFile = new ZipFile(str);
                        try {
                            Enumeration<? extends ZipEntry> entries = zipFile.entries();
                            while (entries.hasMoreElements()) {
                                String name = entries.nextElement().getName();
                                if (!name.contains("../") && (parentFile = new File(name).getParentFile()) != null && parentFile.getPath().startsWith("lib/")) {
                                    f33147a.add(parentFile.getName());
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            zipFile2 = zipFile;
                            e.printStackTrace();
                            if (zipFile2 != null) {
                                try {
                                    zipFile2.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                    try {
                        zipFile.close();
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = null;
                }
            }
            return f33147a;
        }
    }

    public static int getInstalledApkCpuArchValue(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("807af029", new Object[]{context})).intValue();
        }
        Set<String> supportedAbis = getSupportedAbis(context.getApplicationInfo());
        boolean contains = supportedAbis.contains(iju.ABI_ARM64);
        boolean contains2 = supportedAbis.contains(iju.ABI_ARM);
        if (contains2 && contains) {
            return -1;
        }
        if (contains) {
            return 8;
        }
        return contains2 ? 7 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getCpuArchValueFromApk(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rgn.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L19
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "a4ccb44b"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L19:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.util.Set r4 = getSupportedAbis(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 7
            if (r0 < r1) goto L66
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r0 = r0.length
            if (r0 != 0) goto L2e
            return r2
        L2e:
            r0 = 8
            if (r4 == 0) goto L65
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L39
            goto L65
        L39:
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "arm64-v8a"
            boolean r3 = r3.endsWith(r1)
            if (r3 != 0) goto L63
            java.lang.String r3 = "x86_64"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L63
            java.lang.String r3 = "mips64"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L3d
        L63:
            return r0
        L64:
            return r2
        L65:
            return r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rgn.getCpuArchValueFromApk(android.content.Context):int");
    }
}
