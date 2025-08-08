package com.taobao.android.cachecleaner.autoclear;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.data.MatchBasedData;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.dvp;
import tb.kge;

/* loaded from: classes4.dex */
public class MatchBasedAutoClear {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MatchStrategyType {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface c {
        boolean a(File file, MatchBasedData matchBasedData);
    }

    static {
        kge.a(-1125937129);
    }

    public static long a(Context context, List<MatchBasedData> list) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9773145", new Object[]{context, list})).longValue();
        }
        if (context == null || list == null) {
            TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", "clearMatchBasedFile: with empty params.");
            return -1L;
        }
        long j = 0;
        for (MatchBasedData matchBasedData : list) {
            TLog.logd(CacheCleaner.MODULE, "MatchAutoClear", String.format("clearMatchBasedFile: start match clear task %s, with strategy %s.", matchBasedData.id, matchBasedData.strategy));
            long currentTimeMillis = System.currentTimeMillis();
            String str = matchBasedData.strategy;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1039745817) {
                if (hashCode != -318750117) {
                    if (hashCode == 108392519 && str.equals("regex")) {
                        c2 = 1;
                    }
                } else if (str.equals("precise")) {
                    c2 = 2;
                }
            } else if (str.equals("normal")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a2 = a(context, matchBasedData, new a());
            } else if (c2 == 1) {
                a2 = a(context, matchBasedData, new e());
            } else if (c2 == 2) {
                a2 = a(context, matchBasedData, new d());
            } else {
                a2 = new b(1, "error: cannot find match strategy!");
            }
            dvp.a(a2);
            if (b.a(a2) == 0) {
                j += b.b(a2);
                TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", String.format("clearMatchBasedFile: task %s clear success, consume time %s, clear files %s, clear size %s KB.", matchBasedData.id, (System.currentTimeMillis() - currentTimeMillis) + "", JSON.toJSONString(b.c(a2)), b.b(a2) + ""));
            } else {
                TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", String.format("clearMatchBasedFile: task %s clear failed, with msg %s.", matchBasedData.id, b.d(a2)));
            }
        }
        return j;
    }

    private static b a(Context context, MatchBasedData matchBasedData, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c0fef7aa", new Object[]{context, matchBasedData, cVar});
        }
        File a2 = a(context, matchBasedData.pDir);
        if (a2 == null) {
            return new b(1, "error: witch empty parent directory!");
        }
        File[] listFiles = a2.listFiles();
        if (listFiles == null) {
            return new b(0);
        }
        b bVar = new b(0);
        try {
            for (File file : listFiles) {
                if (file != null && cVar.a(file, matchBasedData)) {
                    if (file.isFile()) {
                        long length = file.length() >> 20;
                        if (file.delete()) {
                            b.a(bVar, b.b(bVar) + length);
                            b.c(bVar).add(file.getName());
                        }
                    } else if (file.isDirectory()) {
                        b.a(bVar, b.b(bVar) + (a(file, 0) >> 20));
                        b.c(bVar).add(file.getName());
                    }
                }
            }
            b.a(bVar, 0);
        } catch (Exception e2) {
            b.a(bVar, 1);
            b.a(bVar, "error: execute with exception " + e2);
            TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", b.d(bVar));
        }
        return bVar;
    }

    private static long a(File file, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85ccef8", new Object[]{file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (i <= 10 && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                if (!file.delete()) {
                    TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", "deleteDir: delete failed with " + file.getName());
                }
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    j += a(file2, i + 1);
                } else {
                    long length = file2.length();
                    if (file2.delete()) {
                        j += length;
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(CacheCleaner.MODULE, "MatchAutoClear", "deleteDir: delete failed with " + file.getName());
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r0.equals(tb.dvq.INNER_ROOT_NAME) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.io.File a(android.content.Context r8, java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r8 = "90186323"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.io.File r8 = (java.io.File) r8
            return r8
        L18:
            boolean r0 = android.text.StringUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L20
            return r1
        L20:
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r9.split(r0, r4)
            int r5 = r0.length
            if (r5 <= 0) goto L2c
            r0 = r0[r3]
            goto L2e
        L2c:
            java.lang.String r0 = ""
        L2e:
            r5 = -1
            int r6 = r0.hashCode()
            r7 = -676711579(0xffffffffd7aa3365, float:-3.74275429E14)
            if (r6 == r7) goto L57
            r3 = 768684631(0x2dd13257, float:2.3782904E-11)
            if (r6 == r3) goto L4d
            r3 = 771702092(0x2dff3d4c, float:2.9017365E-11)
            if (r6 == r3) goto L43
            goto L60
        L43:
            java.lang.String r3 = "ExternalFiles"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
            r3 = 2
            goto L61
        L4d:
            java.lang.String r3 = "ExternalCache"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L60
            r3 = 1
            goto L61
        L57:
            java.lang.String r6 = "InnerStorage"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L60
            goto L61
        L60:
            r3 = -1
        L61:
            if (r3 == 0) goto L73
            if (r3 == r2) goto L6e
            if (r3 == r4) goto L69
            r8 = r1
            goto L7b
        L69:
            java.io.File r8 = r8.getExternalFilesDir(r1)
            goto L7b
        L6e:
            java.io.File r8 = r8.getExternalCacheDir()
            goto L7b
        L73:
            java.io.File r8 = r8.getCacheDir()
            java.io.File r8 = r8.getParentFile()
        L7b:
            if (r8 != 0) goto L7e
            return r1
        L7e:
            java.io.File r1 = new java.io.File
            int r0 = r0.length()
            java.lang.String r9 = r9.substring(r0)
            r1.<init>(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.a(android.content.Context, java.lang.String):java.io.File");
    }

    /* loaded from: classes4.dex */
    public static class e implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1086282466);
            kge.a(2001072747);
        }

        private e() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.c
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("778ef542", new Object[]{this, file, matchBasedData})).booleanValue() : Pattern.matches(matchBasedData.pattern, file.getName());
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(166468317);
            kge.a(2001072747);
        }

        private a() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.c
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("778ef542", new Object[]{this, file, matchBasedData})).booleanValue();
            }
            String name = file.getName();
            return (matchBasedData.fileNameLen == 0 || ((long) name.length()) == matchBasedData.fileNameLen) && file.length() >= (matchBasedData.sizeThreshold << 10) && System.currentTimeMillis() - file.lastModified() >= (((matchBasedData.lmfThreshold * 24) * 60) * 60) * 1000 && System.currentTimeMillis() - file.lastModified() >= matchBasedData.lmfThresholdSec * 1000 && (StringUtils.isEmpty(matchBasedData.suffix) || name.endsWith(matchBasedData.suffix)) && (StringUtils.isEmpty(matchBasedData.prefix) || name.startsWith(matchBasedData.prefix));
        }
    }

    /* loaded from: classes4.dex */
    public static class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1275794506);
            kge.a(2001072747);
        }

        private d() {
        }

        @Override // com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear.c
        public boolean a(File file, MatchBasedData matchBasedData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("778ef542", new Object[]{this, file, matchBasedData})).booleanValue() : StringUtils.equals(file.getName(), matchBasedData.fileName) && System.currentTimeMillis() - file.lastModified() >= (((matchBasedData.lmfThreshold * 24) * 60) * 60) * 1000 && System.currentTimeMillis() - file.lastModified() >= matchBasedData.lmfThresholdSec * 1000;
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f9273a;
        private String b;
        private List<String> c;
        private long d;

        static {
            kge.a(1827088911);
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("548b3517", new Object[]{bVar})).intValue() : bVar.f9273a;
        }

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3cdbe252", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.f9273a = i;
            return i;
        }

        public static /* synthetic */ long a(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3cdbe614", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.d = j;
            return j;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b88cf072", new Object[]{bVar, str});
            }
            bVar.b = str;
            return str;
        }

        public static /* synthetic */ long b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d6b95b7", new Object[]{bVar})).longValue() : bVar.d;
        }

        public static /* synthetic */ List c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3fe60ba5", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ff85fbf", new Object[]{bVar}) : bVar.b;
        }

        public b(int i) {
            this(i, "");
        }

        public b(int i, String str) {
            this.c = new ArrayList();
            this.d = 0L;
            this.f9273a = i;
            this.b = str;
        }

        public long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.d;
        }

        public List<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f9273a;
        }
    }
}
