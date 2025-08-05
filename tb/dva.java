package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.MatchBasedAutoClear;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.message.disk.IStorageClearService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.mrt.task.g;
import com.taobao.tao.log.TLog;
import com.taobao.zcache.n;
import com.uc.webview.export.extension.StorageUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.duz;

/* loaded from: classes4.dex */
public class dva extends duz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String f;

    static {
        kge.a(1430799915);
    }

    public static /* synthetic */ Object ipc$super(dva dvaVar, String str, Object... objArr) {
        if (str.hashCode() == -1238543710) {
            return super.a((Map) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dva(Context context, BizTaskData bizTaskData, String str) {
        super(context, bizTaskData);
        this.f = str;
    }

    @Override // tb.duz
    public duz.b a(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (duz.b) ipChange.ipc$dispatch("b62d52a2", new Object[]{this, map});
        }
        duz.b a2 = super.a(map);
        TLog.loge(CacheCleaner.MODULE, "BizClearTask", String.format("execute: task %s clear success %s, clear size %s, with msg %s,", this.f27006a, Boolean.valueOf(a2.a()), Long.valueOf(a2.b()), a2.c()));
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.equals("common") != false) goto L17;
     */
    @Override // tb.duz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData r11, java.util.Map<java.lang.String, java.lang.Long> r12) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.dva.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            r1[r3] = r11
            r11 = 2
            r1[r11] = r12
            java.lang.String r11 = "de9870a5"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            return r11
        L1f:
            r0 = -1
            java.lang.String r4 = "BizClearTask"
            java.lang.String r5 = "CacheCleaner"
            if (r11 != 0) goto L2d
            java.lang.String r11 = "doAction: data is empty."
            com.taobao.tao.log.TLog.loge(r5, r4, r11)
            return r0
        L2d:
            java.lang.String r6 = r11.type
            r7 = -1
            int r8 = r6.hashCode()
            r9 = -1354814997(0xffffffffaf3f29eb, float:-1.7386241E-10)
            if (r8 == r9) goto L49
            r2 = -1349088399(0xffffffffaf968b71, float:-2.738392E-10)
            if (r8 == r2) goto L3f
            goto L52
        L3f:
            java.lang.String r2 = "custom"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L52
            r2 = 1
            goto L53
        L49:
            java.lang.String r8 = "common"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L52
            goto L53
        L52:
            r2 = -1
        L53:
            if (r2 == 0) goto L78
            if (r2 == r3) goto L6e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "doAction: unknown action type "
            r12.append(r2)
            java.lang.String r11 = r11.type
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.taobao.tao.log.TLog.loge(r5, r4, r11)
            return r0
        L6e:
            tb.dva$a r0 = new tb.dva$a
            java.util.Map<java.lang.String, java.lang.Long> r1 = r10.e
            java.lang.String r2 = r10.f
            r0.<init>(r1, r12, r2)
            goto L7d
        L78:
            tb.dva$b r0 = new tb.dva$b
            r0.<init>()
        L7d:
            long r11 = r0.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dva.a(com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData, java.util.Map):long");
    }

    /* loaded from: classes4.dex */
    public static class b implements duz.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1529473937);
            kge.a(1211277903);
        }

        @Override // tb.duz.a
        public long a(BizActionData bizActionData) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e03f3848", new Object[]{this, bizActionData})).longValue() : MatchBasedAutoClear.a(com.taobao.android.cachecleaner.monitor.config.a.a().d(), bizActionData.configList);
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements duz.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Map<String, Set<String>> f27008a;
        private final Map<String, Long> b;
        private final Map<String, Long> c;
        private final String d;

        static {
            kge.a(-620041127);
            kge.a(1211277903);
            f27008a = new HashMap();
        }

        public a(Map<String, Long> map, Map<String, Long> map2, String str) {
            this.b = map;
            this.c = map2;
            this.d = str;
        }

        @Override // tb.duz.a
        public long a(BizActionData bizActionData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e03f3848", new Object[]{this, bizActionData})).longValue();
            }
            String str = bizActionData.bizId;
            long j = -1;
            if (TextUtils.isEmpty(str)) {
                TLog.loge(CacheCleaner.MODULE, "BizClearTask", "doAction: bizId is empty.");
                return -1L;
            }
            try {
                j = a(str, bizActionData);
            } catch (Throwable th) {
                TLog.loge(CacheCleaner.MODULE, "BizClearTask", "doAction: with exception " + th);
            }
            TLog.loge(CacheCleaner.MODULE, "BizClearTask", String.format("biz %s complete action with clear size %s KB.", str, Long.valueOf(j)));
            return j;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
            if (r9.equals("SDWebImage") != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private long a(java.lang.String r9, com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData r10) {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.dva.a.a(java.lang.String, com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData):long");
        }

        private static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            f27008a.put("MNNRTModels", a(new File(com.taobao.android.cachecleaner.monitor.config.a.a().d().getFilesDir(), "MNNRTModels")));
        }

        private static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            Set<String> set = f27008a.get("MNNRTModels");
            if (set == null) {
                TLog.loge(CacheCleaner.MODULE, "BizClearTask", "notifyMnnFiles: last mnn files is empty.");
                return;
            }
            Set<String> a2 = a(new File(com.taobao.android.cachecleaner.monitor.config.a.a().d().getFilesDir(), "MNNRTModels"));
            for (String str : set) {
                if (!a2.contains(str)) {
                    g.a().c(str);
                }
            }
        }

        private static Set<String> a(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("b92bc98e", new Object[]{file});
            }
            File[] listFiles = file.listFiles();
            HashSet hashSet = new HashSet();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        hashSet.add(file2.getName());
                    }
                }
            }
            return hashSet;
        }

        private static void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
                return;
            }
            TLog.loge(CacheCleaner.MODULE, "BizClearTask", "clearHttpCacheAsync: http cache clear start.");
            StorageUtils.clearHttpCache(new Runnable() { // from class: tb.dva.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TLog.loge(CacheCleaner.MODULE, "BizClearTask", "clearHttpCacheAsync: http cache clear complete.");
                    }
                }
            });
        }

        private static long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue();
            }
            if (com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG)) {
                return 0L;
            }
            long j = -1;
            IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
            if (iStorageClearService != null) {
                IStorageClearService.Options options = new IStorageClearService.Options();
                options.daysAgo = 7;
                options.mode = 1;
                j = iStorageClearService.delete(IStorageClearService.Keys.OUTER, options).size;
            }
            com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG);
            return j;
        }

        private static void a(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            } else if (com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG_V2)) {
            } else {
                IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
                if (iStorageClearService != null) {
                    long j = 15778800000L;
                    if (map != null && (str = map.get("beforeTime")) != null && !str.isEmpty()) {
                        j = Long.parseLong(str);
                    }
                    iStorageClearService.cleanUpLocalConversation(System.currentTimeMillis() - j, null);
                }
                com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_MSG_V2);
            }
        }

        private static long a(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9dda8ad", new Object[]{map, map2, list})).longValue();
            }
            int i2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    i2 += map2.get(str).intValue();
                }
                if (map.containsKey(str)) {
                    i += map.get(str).intValue();
                }
            }
            return com.taobao.tao.log.utils.a.a(i << 10, i2 << 10, new HashMap());
        }

        private static long b(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d68c66e", new Object[]{map, map2, list})).longValue();
            }
            if (list.isEmpty()) {
                return -1L;
            }
            long j = 0;
            long j2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    j2 += map2.get(str).longValue();
                }
                if (map.containsKey(str)) {
                    j += map.get(str).longValue();
                }
            }
            return ikc.a(list.get(0), j, j2);
        }

        private static long c(Map<String, Long> map, Map<String, Long> map2, List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90f3e42f", new Object[]{map, map2, list})).longValue();
            }
            if (list.isEmpty()) {
                return -1L;
            }
            long j = 0;
            long j2 = 0;
            for (String str : list) {
                if (map2.containsKey(str)) {
                    j2 += map2.get(str).longValue();
                }
                if (map.containsKey(str)) {
                    j += map.get(str).longValue();
                }
            }
            return bgw.a(j, j2, new HashMap()) ^ true ? 0L : -1L;
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (com.taobao.android.cachecleaner.monitor.config.a.a().a(com.taobao.android.cachecleaner.monitor.config.a.BIZ_Z_CACHE)) {
            } else {
                if (com.taobao.android.cachecleaner.monitor.config.a.a().b().isEnableNewZcacheV1()) {
                    n.e(this.d);
                } else {
                    n.h();
                }
                com.taobao.android.cachecleaner.monitor.config.a.a().b(com.taobao.android.cachecleaner.monitor.config.a.BIZ_Z_CACHE);
            }
        }
    }
}
