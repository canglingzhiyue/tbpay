package tb;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.config.a;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class dvq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_DIR_NAME = "cache";
    public static final long DAY_IN_MILLS = 86400000;
    public static final String EXTERNAL_CACHE_DIR;
    public static final String EXTERNAL_CACHE_NAME = "ExternalCache";
    public static final String EXTERNAL_CACHE_ROOT_DIR;
    public static final String EXTERNAL_FILES_DIR;
    public static final String EXTERNAL_FILES_NAME = "ExternalFiles";
    public static final String EXTERNAL_FILES_ROOT_DIR;
    public static final String FILES_DIR_NAME = "files";
    public static final int GB_IN_BYTES = 1073741824;
    public static final String INNER_ROOT_DIR;
    public static final String INNER_ROOT_NAME = "InnerStorage";
    public static final int MB_IN_BYTES = 1048576;

    /* renamed from: a  reason: collision with root package name */
    private static int f27021a;
    private static String b;
    private static String c;
    private static String d;

    static {
        kge.a(-1795669948);
        f27021a = -1;
        INNER_ROOT_DIR = File.separator + INNER_ROOT_NAME;
        EXTERNAL_CACHE_ROOT_DIR = File.separator + EXTERNAL_CACHE_NAME;
        EXTERNAL_FILES_ROOT_DIR = File.separator + EXTERNAL_FILES_NAME;
        EXTERNAL_CACHE_DIR = File.separator + EXTERNAL_CACHE_NAME + File.separator + "cache";
        EXTERNAL_FILES_DIR = File.separator + EXTERNAL_FILES_NAME + File.separator + FILES_DIR_NAME;
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue();
        }
        RuleConfig b2 = a.a().b();
        if (f27021a == -1) {
            List<String> softLinkExcludeBrand = b2.getSoftLinkExcludeBrand();
            if (softLinkExcludeBrand == null || !c(a.a().d()) || (!TextUtils.isEmpty(Build.BRAND) && softLinkExcludeBrand.contains(Build.BRAND.toUpperCase()))) {
                f27021a = 1;
            } else {
                f27021a = 0;
            }
        }
        if (f27021a != 0) {
            return a(file, b2.getSoftLinkDir());
        }
        return a(file, b2.getSoftLinkDir()) || c(file);
    }

    private static boolean a(File file, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec608ed4", new Object[]{file, list})).booleanValue();
        }
        String absolutePath = file.getAbsolutePath();
        if (absolutePath != null && !TextUtils.isEmpty(absolutePath) && list != null) {
            for (String str : list) {
                if (absolutePath.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(File file) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 26 && a.a().b().getEnableSoftLinkApi()) {
                z = Files.isSymbolicLink(file.toPath());
                file = file;
            } else {
                boolean equals = file.getAbsolutePath().equals(file.getCanonicalPath());
                z = !equals;
                file = equals;
            }
        } catch (IOException unused) {
            TLog.loge(CacheCleaner.MODULE, "CleanerFile", "isSymbolicLinkSafely: with IOException, file path " + file.getAbsolutePath());
        } catch (Throwable th) {
            dvp.a("isSymbolicLinkSafely_" + th, "");
        }
        return z;
    }

    private static boolean c(Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        for (String str : context.getCacheDir().getAbsolutePath().split("/")) {
            if (!TextUtils.isEmpty(str)) {
                if (Pattern.matches("(([a-zA-Z0-9]{1,})\\.)+[a-zA-Z0-9]+", str) && !str.contains(context.getPackageName())) {
                    return false;
                }
                if (str.contains(context.getPackageName())) {
                    return true;
                }
            }
        }
        return true;
    }

    public static File a(Context context, String str) {
        String[] split;
        File externalFilesDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.split("/", 4).length < 4) {
            return null;
        }
        String str2 = File.separator + split[1] + File.separator + split[2];
        if (TextUtils.equals(str2, a())) {
            externalFilesDir = context.getCacheDir().getParentFile();
        } else if (TextUtils.equals(str2, EXTERNAL_CACHE_DIR)) {
            externalFilesDir = context.getExternalCacheDir();
        } else if (!TextUtils.equals(str2, EXTERNAL_FILES_DIR)) {
            return null;
        } else {
            externalFilesDir = context.getExternalFilesDir(null);
        }
        return new File(externalFilesDir, str.replace(str2, ""));
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        StatFs statFs = new StatFs(context.getCacheDir().getParentFile().getAbsolutePath());
        return (statFs.getBlockCount() / 1024) * statFs.getBlockSize();
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        StatFs statFs = new StatFs(context.getCacheDir().getParentFile().getAbsolutePath());
        return (statFs.getAvailableBlocks() / 1024) * statFs.getBlockSize();
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j >= 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(a(j + "", "1073741824", 2));
            sb.append(" GB");
            return sb.toString();
        } else if (j >= 1048576) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a(j + "", "1048576", 2));
            sb2.append(" MB");
            return sb2.toString();
        } else if (j > 1024) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(j + "", "1024", 2));
            sb3.append(" KB");
            return sb3.toString();
        } else {
            return a(j + "", "1", 2) + " B";
        }
    }

    public static String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f592e79", new Object[]{str, str2, new Integer(i)});
        }
        if (i < 0) {
            throw new IllegalArgumentException("scale need > 0");
        }
        return new BigDecimal(str).divide(new BigDecimal(str2), i, RoundingMode.HALF_DOWN).toString();
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (b == null) {
            b = INNER_ROOT_DIR + File.separator + a.a().c();
        }
        return b;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (c == null) {
            c = a() + File.separator + "cache";
        }
        return c;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (d == null) {
            d = a() + File.separator + FILES_DIR_NAME;
        }
        return d;
    }
}
