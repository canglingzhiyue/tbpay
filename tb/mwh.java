package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class mwh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIT32 = 32;
    public static final int BIT64 = 64;
    public static final int UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static int f31299a;

    static {
        kge.a(449962268);
        f31299a = -1;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return 32;
        }
        String lowerCase = Build.SUPPORTED_ABIS[0].toLowerCase();
        if (lowerCase.startsWith("arm64") || lowerCase.startsWith("x86_64") || lowerCase.startsWith("mips64")) {
            return 64;
        }
        return (lowerCase.startsWith("armeabi") || lowerCase.startsWith(iju.ABI_ARM) || lowerCase.startsWith("x86")) ? 32 : -1;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            if (b(context) != 8) {
                return a();
            }
            return 64;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        int i = f31299a;
        if (i != -1) {
            return i;
        }
        int a2 = a(context.getApplicationInfo().nativeLibraryDir);
        if (a2 == -1) {
            a2 = c(context);
        }
        f31299a = a2;
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
        try {
            File file = new File(str);
            if (!file.isDirectory()) {
                return -1;
            }
            String lowerCase = file.getName().toLowerCase();
            if (Build.VERSION.SDK_INT >= 21 && lowerCase.startsWith("arm64")) {
                return 64;
            }
            return lowerCase.equals("arm") ? 32 : -1;
        } catch (Throwable th) {
            c.a("ArchUtils.getCpuArchValueFromNativeLibraryDir.error", th);
            return -1;
        }
    }

    private static Set<String> a(ApplicationInfo applicationInfo) {
        ZipFile zipFile;
        File parentFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("73b7c0a4", new Object[]{applicationInfo});
        }
        HashSet<String> hashSet = new HashSet();
        hashSet.add(applicationInfo.sourceDir);
        if (Build.VERSION.SDK_INT >= 21 && applicationInfo.splitSourceDirs != null) {
            hashSet.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
        }
        HashSet hashSet2 = new HashSet();
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
                                hashSet2.add(parentFile.getName());
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        zipFile2 = zipFile;
                        e.printStackTrace();
                        if (zipFile2 != null) {
                            zipFile2.close();
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
            } catch (Throwable th2) {
                th = th2;
                zipFile = null;
            }
        }
        return hashSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.mwh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L19
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "9f76bb91"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L19:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.util.Set r4 = a(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 32
            if (r0 < r1) goto L66
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r0 = r0.length
            if (r0 != 0) goto L2f
            return r2
        L2f:
            r0 = 64
            if (r4 == 0) goto L65
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L3a
            goto L65
        L3a:
            java.util.Iterator r4 = r4.iterator()
        L3e:
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
            if (r1 == 0) goto L3e
        L63:
            return r0
        L64:
            return r2
        L65:
            return r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mwh.c(android.content.Context):int");
    }
}
