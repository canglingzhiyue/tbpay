package com.alibaba.ut.abtest;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.c;
import com.alibaba.ut.abtest.internal.bucketing.DefaultVariationSet;
import com.alibaba.ut.abtest.internal.bucketing.model.a;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class UTABTest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAV = "UTABTestNav";
    public static final String COMPONENT_URI = "Rewrite";
    private static final VariationSet EMPTY_VARIATION_SET;
    private static final String TAG = "UTABTest";

    static {
        kge.a(1308501375);
        EMPTY_VARIATION_SET = new DefaultVariationSet(new a());
    }

    private UTABTest() {
    }

    public static c.a newConfigurationBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("bc2b832a", new Object[0]) : new c.a();
    }

    public static void initBeforeExperimentTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21917510", new Object[]{context});
        } else {
            EVO.initBeforeExperimentTask(context);
        }
    }

    @Deprecated
    public static synchronized void initializeSync(Context context, c cVar) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47b4bbd5", new Object[]{context, cVar});
            } else {
                EVO.initializeSync(context, cVar);
            }
        }
    }

    @Deprecated
    public static synchronized void initialize(Context context, c cVar) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afd3af5a", new Object[]{context, cVar});
            } else {
                EVO.initializeAsync(context, cVar);
            }
        }
    }

    @Deprecated
    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue() : EVO.isInitialized();
    }

    public static VariationSet activate(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("fadd607b", new Object[]{str, str2}) : activate(str, str2, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0127 A[Catch: Throwable -> 0x01f8, TryCatch #0 {Throwable -> 0x01f8, blocks: (B:6:0x0024, B:9:0x0034, B:11:0x003c, B:13:0x004a, B:15:0x0053, B:17:0x0059, B:20:0x0061, B:22:0x0067, B:24:0x0075, B:26:0x007e, B:29:0x0089, B:31:0x0097, B:33:0x00af, B:39:0x0111, B:41:0x0117, B:47:0x0127, B:48:0x0129, B:52:0x0135, B:54:0x013f, B:56:0x0145, B:59:0x014c, B:70:0x01e9, B:60:0x0169, B:61:0x017f, B:63:0x018a, B:65:0x0190, B:68:0x0197, B:69:0x01c0, B:34:0x00c5, B:36:0x00cb, B:38:0x00fc, B:37:0x00e1, B:72:0x01ef), top: B:77:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f A[Catch: Throwable -> 0x01f8, TryCatch #0 {Throwable -> 0x01f8, blocks: (B:6:0x0024, B:9:0x0034, B:11:0x003c, B:13:0x004a, B:15:0x0053, B:17:0x0059, B:20:0x0061, B:22:0x0067, B:24:0x0075, B:26:0x007e, B:29:0x0089, B:31:0x0097, B:33:0x00af, B:39:0x0111, B:41:0x0117, B:47:0x0127, B:48:0x0129, B:52:0x0135, B:54:0x013f, B:56:0x0145, B:59:0x014c, B:70:0x01e9, B:60:0x0169, B:61:0x017f, B:63:0x018a, B:65:0x0190, B:68:0x0197, B:69:0x01c0, B:34:0x00c5, B:36:0x00cb, B:38:0x00fc, B:37:0x00e1, B:72:0x01ef), top: B:77:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f A[Catch: Throwable -> 0x01f8, TryCatch #0 {Throwable -> 0x01f8, blocks: (B:6:0x0024, B:9:0x0034, B:11:0x003c, B:13:0x004a, B:15:0x0053, B:17:0x0059, B:20:0x0061, B:22:0x0067, B:24:0x0075, B:26:0x007e, B:29:0x0089, B:31:0x0097, B:33:0x00af, B:39:0x0111, B:41:0x0117, B:47:0x0127, B:48:0x0129, B:52:0x0135, B:54:0x013f, B:56:0x0145, B:59:0x014c, B:70:0x01e9, B:60:0x0169, B:61:0x017f, B:63:0x018a, B:65:0x0190, B:68:0x0197, B:69:0x01c0, B:34:0x00c5, B:36:0x00cb, B:38:0x00fc, B:37:0x00e1, B:72:0x01ef), top: B:77:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.ut.abtest.VariationSet activate(java.lang.String r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.Object> r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ut.abtest.UTABTest.activate(java.lang.String, java.lang.String, java.util.Map, java.lang.Object):com.alibaba.ut.abtest.VariationSet");
    }

    public static VariationSet getVariations(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VariationSet) ipChange.ipc$dispatch("78518cd8", new Object[]{str, str2}) : getVariations(str, str2, null);
    }

    public static VariationSet getVariations(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("4dbf3835", new Object[]{str, str2, map});
        }
        try {
            long nanoTime = System.nanoTime();
            if (!isInitialized()) {
                h.c(TAG, "getVariations方法调用，需要先调用 UTABTest.initialize() 方法初始化SDK。");
                return EMPTY_VARIATION_SET;
            } else if (!cex.a().j().c()) {
                h.d(TAG, "【运行实验】一休已禁止使用。");
                return EMPTY_VARIATION_SET;
            } else {
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    h.g(TAG, "【运行实验】获取实验变量。命名空间：" + str + "，实验标识：" + str2);
                    VariationSet a2 = cex.a().q().a(str, str2, map, false, null);
                    if (a2 == null) {
                        a2 = EMPTY_VARIATION_SET;
                    }
                    long nanoTime2 = System.nanoTime();
                    if (a2.size() <= 0) {
                        z = false;
                    }
                    b.a(b.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION, z, nanoTime2 - nanoTime);
                    if (a2.size() == 0) {
                        h.g(TAG, "【运行实验】运行失败。命名空间：" + str + "，实验标识：" + str2);
                    } else {
                        b.b(b.EXPERIMENT_EFFECTIVE_COUNTER, b.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
                        h.g(TAG, "【运行实验】运行成功。命名空间：" + str + "，实验标识：" + str2 + "，进入实验分组：" + a2.getExperimentBucketId());
                    }
                    b.b(b.EXPERIMENT_ACTIVATE_COUNTER, b.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
                    return a2;
                }
                h.d(TAG, "【运行实验】参数不合法，命名空间或实验标识为空！");
                return EMPTY_VARIATION_SET;
            }
        } catch (Throwable th) {
            b.a("UTABTest.getVariations", th);
            return EMPTY_VARIATION_SET;
        }
    }

    public static void activateServer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e361427", new Object[]{str});
        } else {
            activateServerInternal(str, null, false);
        }
    }

    public static void activateServerSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98759a2", new Object[]{str});
        } else {
            activateServerInternal(str, null, true);
        }
    }

    public static void activateServer(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2691e843", new Object[]{str, obj});
        } else {
            activateServerInternal(str, obj, false);
        }
    }

    public static void activateServerSync(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd8e4fe", new Object[]{str, obj});
        } else {
            activateServerInternal(str, obj, true);
        }
    }

    private static void activateServerInternal(final String str, final Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc577ab4", new Object[]{str, obj, new Boolean(z)});
            return;
        }
        try {
            long nanoTime = System.nanoTime();
            if (!cex.a().j().c()) {
                h.d(TAG, "【服务端实验】一休已禁止使用。");
            } else if (StringUtils.isEmpty(str)) {
                h.d(TAG, "【服务端实验】添加埋点规则失败，埋点规则不合法。");
            } else {
                if (z) {
                    cex.a().q().a(str, obj);
                } else {
                    p.a(new Runnable() { // from class: com.alibaba.ut.abtest.UTABTest.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                cex.a().q().a(str, obj);
                            } catch (Throwable th) {
                                b.a("UTABTest.activateServerInternal.Async", th);
                            }
                        }
                    });
                }
                long nanoTime2 = System.nanoTime();
                if (z) {
                    if (StringUtils.isEmpty(str)) {
                        z2 = false;
                    }
                    b.a(b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER_SYNC, z2, nanoTime2 - nanoTime);
                } else {
                    if (StringUtils.isEmpty(str)) {
                        z2 = false;
                    }
                    b.a(b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER, z2, nanoTime2 - nanoTime);
                }
                b.b(b.EXPERIMENT_ACTIVATE_COUNTER, b.EXPERIMENT_ACTIVATE_STAT_TYPE_ACTIVATE_SERVER);
            }
        } catch (Throwable th) {
            b.a("UTABTest.activateServerInternal", th);
        }
    }

    @Deprecated
    public static void addDataListener(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec76a90", new Object[]{str, str2, dVar});
            return;
        }
        try {
            if (!isInitialized()) {
                h.c(TAG, "请先调用 UTABTest.initialize() 方法初始化SDK。");
                return;
            }
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && dVar != null) {
                h.a(TAG, "addDataListener. component=" + str + ", module=" + str2 + ", listener=" + dVar);
                cex.a().i().a(str, str2, dVar);
                return;
            }
            h.c(TAG, "参数不合法，组件名称，模块名称或监听回调为空！");
        } catch (Throwable th) {
            b.a("UTABTest.addDataListener", th);
        }
    }

    @Deprecated
    public static void removeDataListener(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bbe6d3d", new Object[]{str, str2});
        } else {
            removeDataListener(str, str2, null);
        }
    }

    @Deprecated
    public static void removeDataListener(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c7ab8d", new Object[]{str, str2, dVar});
            return;
        }
        try {
            if (!isInitialized()) {
                h.c(TAG, "请先调用 UTABTest.initialize() 方法初始化SDK。");
                return;
            }
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                h.a(TAG, "removeDataListener. component=" + str + ", module=" + str2 + ", listener=" + dVar);
                cex.a().i().b(str, str2, dVar);
                return;
            }
            h.c(TAG, "参数不合法，组件名称或模块名称为空！");
        } catch (Throwable th) {
            b.a("UTABTest.removeDataListener", th);
        }
    }

    @Deprecated
    public static synchronized void updateUserAccount(String str, String str2) {
        synchronized (UTABTest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782de874", new Object[]{str, str2});
            } else {
                EVO.updateUserAccount(str, str2);
            }
        }
    }

    public static String getAppActivateTrackId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2948a711", new Object[0]) : cex.a().q().a();
    }
}
