package com.taobao.android.cachecleaner.autoclear;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.List;
import java.util.Map;
import tb.dvc;
import tb.dvq;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1822133261);
    }

    public static long c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb92", new Object[]{context})).longValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return dvc.b(context, context.getPackageName());
        }
        com.taobao.android.cachecleaner.monitor.info.b bVar = new com.taobao.android.cachecleaner.monitor.info.b();
        return bVar.a(context.getCacheDir().getParentFile(), dvq.INNER_ROOT_DIR).getSize() + bVar.a(context.getExternalCacheDir(), dvq.EXTERNAL_CACHE_ROOT_DIR).getSize() + bVar.a(context.getExternalFilesDir(null), dvq.EXTERNAL_FILES_ROOT_DIR).getSize();
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (a(context, b.getFullCacheClearSilenceTime())) {
            TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "getCleanableSize: in silence time.");
            return 0L;
        }
        return a(context, b.getFullCacheClearDir(), b.getExceptFileSuffixes());
    }

    public static long a(List<BizTaskData> list, Map<String, Long> map) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeebb500", new Object[]{list, map})).longValue();
        }
        long j = 0;
        if (map == null || map.isEmpty()) {
            TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "getPathFilesSize error mDirMap is null!");
            return 0L;
        }
        for (BizTaskData bizTaskData : list) {
            for (String str : bizTaskData.pathMap.keySet()) {
                if (map.containsKey(str) && (l = map.get(str)) != null) {
                    j += l.longValue();
                }
            }
        }
        return j;
    }

    public static long a(Context context, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efa2fc36", new Object[]{context, list, list2})).longValue();
        }
        long j = 0;
        for (String str : list) {
            File a2 = a(context, str);
            if (a2 != null) {
                j += a(a2, 0, list2);
            }
        }
        return j;
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        a();
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        return b(context, b.getFullCacheClearDir(), b.getExceptFileSuffixes());
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            new b().a(1, new CacheOverviewInfo());
        }
    }

    public static long b(Context context, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83e16bd5", new Object[]{context, list, list2})).longValue();
        }
        long j = 0;
        for (String str : list) {
            File a2 = a(context, str);
            if (a2 != null) {
                j += b(a2, 0, list2);
            }
        }
        b(context, System.currentTimeMillis());
        return j;
    }

    public static long d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236731", new Object[]{context})).longValue();
        }
        RuleConfig b = com.taobao.android.cachecleaner.monitor.config.a.a().b();
        if (c(context, b.getFullCacheClearSilenceTime())) {
            TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "checkInDataCleanSilenceTime: in silence time.");
            return 0L;
        }
        return a(context, b.getBizWhiteList(), b.getExceptFileSuffixes());
    }

    public static long e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012d0", new Object[]{context})).longValue();
        }
        new b().b(1, new CacheOverviewInfo());
        d(context, System.currentTimeMillis());
        return 0L;
    }

    private static long a(File file, int i, List<String> list) {
        long length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d874d3e9", new Object[]{file, new Integer(i), list})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (!a(file2, list)) {
                    if (file2.isDirectory()) {
                        length = a(file2, i + 1, list);
                    } else {
                        length = file2.length();
                    }
                    j += length;
                }
            }
        }
        return j;
    }

    private static long b(File file, int i, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cb40c48", new Object[]{file, new Integer(i), list})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                if (!file.delete()) {
                    TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "deleteDir: delete failed with " + file.getName());
                }
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (!a(file2, list)) {
                        j += b(file2, i + 1, list);
                    }
                } else if (!a(file2, list)) {
                    long length = file2.length();
                    if (file2.delete()) {
                        j += length;
                    } else {
                        TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "deleteDir: delete failed with " + file.getName());
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(CacheCleaner.MODULE, "FullCacheAutoClear", "deleteDir: delete failed with " + file.getName());
            }
        }
        return j;
    }

    private static boolean a(File file, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec608ed4", new Object[]{file, list})).booleanValue();
        }
        String absolutePath = file.getAbsolutePath();
        if (StringUtils.isEmpty(absolutePath)) {
            return false;
        }
        for (String str : list) {
            if (absolutePath.endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("258f9e68", new Object[]{context, new Long(j)})).booleanValue() : System.currentTimeMillis() - f(context) < j * 1000;
    }

    public static void b(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7866a5", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("full_clear_cache_sp", 0).edit();
        edit.putLong("full_clear_cache_key", j);
        edit.apply();
    }

    private static long f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a17cbe6f", new Object[]{context})).longValue() : context.getSharedPreferences("full_clear_cache_sp", 0).getLong("full_clear_cache_key", -1L);
    }

    public static boolean c(Context context, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f612eea", new Object[]{context, new Long(j)})).booleanValue() : System.currentTimeMillis() - g(context) < j * 1000;
    }

    public static void d(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6449f727", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("full_clear_cache_sp", 0).edit();
        edit.putLong("data_clear_cache_key", j);
        edit.apply();
    }

    private static long g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2296a0e", new Object[]{context})).longValue() : context.getSharedPreferences("full_clear_cache_sp", 0).getLong("data_clear_cache_key", -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r0.equals(tb.dvq.INNER_ROOT_NAME) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.io.File a(android.content.Context r9, java.lang.String r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.cachecleaner.autoclear.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r9 = "90186323"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.io.File r9 = (java.io.File) r9
            return r9
        L18:
            boolean r0 = android.text.StringUtils.isEmpty(r10)
            r1 = 0
            if (r0 == 0) goto L20
            return r1
        L20:
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r10.split(r0, r4)
            int r5 = r0.length
            java.lang.String r6 = ""
            if (r5 <= 0) goto L2e
            r0 = r0[r3]
            goto L2f
        L2e:
            r0 = r6
        L2f:
            r5 = -1
            int r7 = r0.hashCode()
            r8 = -676711579(0xffffffffd7aa3365, float:-3.74275429E14)
            if (r7 == r8) goto L58
            r3 = 768684631(0x2dd13257, float:2.3782904E-11)
            if (r7 == r3) goto L4e
            r3 = 771702092(0x2dff3d4c, float:2.9017365E-11)
            if (r7 == r3) goto L44
            goto L61
        L44:
            java.lang.String r3 = "ExternalFiles"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L61
            r3 = 2
            goto L62
        L4e:
            java.lang.String r3 = "ExternalCache"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L61
            r3 = 1
            goto L62
        L58:
            java.lang.String r7 = "InnerStorage"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L61
            goto L62
        L61:
            r3 = -1
        L62:
            if (r3 == 0) goto L74
            if (r3 == r2) goto L6f
            if (r3 == r4) goto L6a
            r9 = r1
            goto L7c
        L6a:
            java.io.File r9 = r9.getExternalFilesDir(r1)
            goto L7c
        L6f:
            java.io.File r9 = r9.getExternalCacheDir()
            goto L7c
        L74:
            java.io.File r9 = r9.getCacheDir()
            java.io.File r9 = r9.getParentFile()
        L7c:
            if (r9 != 0) goto L7f
            return r1
        L7f:
            java.io.File r1 = new java.io.File
            java.lang.String r10 = r10.replace(r0, r6)
            r1.<init>(r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.d.a(android.content.Context, java.lang.String):java.io.File");
    }
}
