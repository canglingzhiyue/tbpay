package android.taobao.windvane.extra.uc;

import android.os.Build;
import android.os.Process;
import android.taobao.windvane.config.a;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVUCUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_KEY = "ISX86";
    public static final String TAG = "WVUCUtils";
    public static final long VAL_ARM = 2;
    public static final long VAL_DEAFAULT = 0;
    public static final long VAL_X86 = 1;
    private static String sAbi;
    private static String sAbi2;
    private static String[] sAbiList;
    private static String sArch;
    private static String sCpuAbi;
    private static String[] sSupportedABIs;

    static {
        kge.a(-1184744666);
    }

    public static boolean isArchContains(String str) {
        String fromSystemProp;
        if (sArch == null) {
            sArch = System.getProperty("os.arch");
        }
        String str2 = sArch;
        if (str2 == null || !str2.toLowerCase().contains(str)) {
            if (sAbi == null) {
                try {
                    sAbi = Build.CPU_ABI;
                    sAbi2 = Build.CPU_ABI2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            String str3 = sAbi;
            if (str3 != null && str3.toLowerCase().contains(str)) {
                return true;
            }
            if (sSupportedABIs == null && Build.VERSION.SDK_INT >= 21) {
                try {
                    sSupportedABIs = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            String[] strArr = sSupportedABIs;
            if (strArr != null && strArr.length > 0 && strArr[0] != null && strArr[0].toLowerCase().contains(str)) {
                return true;
            }
            if (sCpuAbi == null) {
                sCpuAbi = getFromSystemProp("ro.product.cpu.abi");
            }
            String str4 = sCpuAbi;
            if (str4 != null && str4.toLowerCase().contains(str)) {
                return true;
            }
            if (sAbiList == null && (fromSystemProp = getFromSystemProp("ro.product.cpu.abilist")) != null && fromSystemProp.length() != 0) {
                sAbiList = fromSystemProp.split(",");
            }
            String[] strArr2 = sAbiList;
            return strArr2 != null && strArr2.length > 0 && strArr2[0] != null && strArr2[0].toLowerCase().contains(str);
        }
        return true;
    }

    public static boolean is64Bit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf7f490", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            boolean is64Bit = Process.is64Bit();
            m.c(TAG, "is 64 bit = [" + is64Bit + riy.ARRAY_END_STR);
            return is64Bit;
        } else if (Build.VERSION.SDK_INT < 21) {
            return false;
        } else {
            return isART64();
        }
    }

    private static boolean isART64() {
        try {
            Object invoke = ClassLoader.class.getDeclaredMethod("findLibrary", String.class).invoke(a.f.getClassLoader(), "art");
            if (invoke == null) {
                return false;
            }
            return ((String) invoke).contains("lib64");
        } catch (Exception unused) {
            return is64bitCPU();
        }
    }

    private static boolean is64bitCPU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72807fce", new Object[0])).booleanValue();
        }
        String str = null;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                str = strArr[0];
            }
        } else {
            str = Build.CPU_ABI;
        }
        return str != null && str.contains("arm64");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String getFromSystemProp(java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.WVUCUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r9 = "ded5037d"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L15:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/build.prop"
            r0.<init>(r1)
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L73
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L6a
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L63
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L63
        L2c:
            java.lang.String r6 = r5.readLine()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L7a
            boolean r7 = r6.contains(r9)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L2c
            java.lang.String r7 = "="
            java.lang.String[] r6 = r6.split(r7)     // Catch: java.lang.Throwable -> L5e
            int r7 = r6.length     // Catch: java.lang.Throwable -> L5e
            r8 = 2
            if (r7 != r8) goto L2c
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L2c
            r9 = r6[r3]     // Catch: java.lang.Throwable -> L5e
            java.lang.String r9 = r9.trim()     // Catch: java.lang.Throwable -> L5e
            close(r5)
            close(r0)
            close(r4)
            return r9
        L5e:
            r9 = move-exception
            goto L77
        L60:
            r9 = move-exception
            r5 = r1
            goto L85
        L63:
            r9 = move-exception
            r5 = r1
            goto L77
        L66:
            r9 = move-exception
            r0 = r1
            r5 = r0
            goto L85
        L6a:
            r9 = move-exception
            r0 = r1
            r5 = r0
            goto L77
        L6e:
            r9 = move-exception
            r0 = r1
            r4 = r0
            r5 = r4
            goto L85
        L73:
            r9 = move-exception
            r0 = r1
            r4 = r0
            r5 = r4
        L77:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L84
        L7a:
            close(r5)
            close(r0)
            close(r4)
            return r1
        L84:
            r9 = move-exception
        L85:
            close(r5)
            close(r0)
            close(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCUtils.getFromSystemProp(java.lang.String):java.lang.String");
    }

    private static void close(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
