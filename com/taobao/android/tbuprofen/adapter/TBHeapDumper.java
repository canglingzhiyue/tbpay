package com.taobao.android.tbuprofen.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.TBHeapDumper;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.h;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.statistics.UploadFileType;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.olf;
import tb.olg;
import tb.olh;

/* loaded from: classes.dex */
public class TBHeapDumper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_DIAGNOSE_DUMP_HEAP = "com.taobao.android.diagnose.action.DUMP_HEAP";
    public static final String ACTION_DIAGNOSE_DUMP_HEAP_TEST = "com.taobao.android.diagnose.action.DUMP_HEAP_TEST";
    public static final String ACTION_PARAM_PROCESS = "processName";
    public static final String ACTION_PARAM_STRIP_TYPE = "strip";
    public static final String ACTION_PARAM_TYPE = "type";
    public static final int CODE_DUMP_DISABLE = 201;
    public static final int CODE_IN_PROCESS = 202;
    public static final int CODE_SPACE_LIMIT = 203;
    public static final int FLAG_STRIP_ARRAY = 2;
    public static final int FLAG_STRIP_SPLIT = 4;
    public static final int FLAG_STRIP_SYSTEM = 1;
    public static final int TYPE_DUMP_ART_HPROF_FULL = 1;
    public static final int TYPE_DUMP_ART_HPROF_STD = 0;
    public static final int TYPE_DUMP_ART_HPROF_STRIP = 2;
    public static final int TYPE_DUMP_INSTANCE = 4;
    public static final int TYPE_DUMP_REFERENCE = 8;
    private static int g;
    private static boolean k;

    /* renamed from: a */
    private final Context f15448a;
    private final DefaultPlugin b;
    private final e c;
    private final File d;
    private final TBProfConfig.HeapDumpConfig h;
    private final a i;
    private boolean j;
    private String l = null;
    private boolean m = false;
    private HeapDumpReceiver e = null;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public static /* synthetic */ boolean lambda$ObUfASsZ6nWKxoEaEDjswRbE5CY(File file, File file2, String str) {
        return a(file, file2, str);
    }

    public static native int nativeForkDumpHprof(String str, String str2, int i, int i2, String str3);

    public static native int nativeForkDumpStripHprof(String str, String str2, int i, int i2, long j, int i3, String str3);

    public static /* synthetic */ List a(TBHeapDumper tBHeapDumper, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5b9ed398", new Object[]{tBHeapDumper, new Integer(i), new Integer(i2), new Boolean(z)}) : tBHeapDumper.a(i, i2, z);
    }

    public static /* synthetic */ AtomicBoolean a(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("9560cc85", new Object[]{tBHeapDumper}) : tBHeapDumper.f;
    }

    public static /* synthetic */ boolean a(TBHeapDumper tBHeapDumper, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("821755f3", new Object[]{tBHeapDumper, new Boolean(z)})).booleanValue() : tBHeapDumper.b(z);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        k = z;
        return z;
    }

    public static /* synthetic */ boolean b(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68816068", new Object[]{tBHeapDumper})).booleanValue() : tBHeapDumper.k();
    }

    public static /* synthetic */ TBProfConfig.HeapDumpConfig c(TBHeapDumper tBHeapDumper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBProfConfig.HeapDumpConfig) ipChange.ipc$dispatch("6be7539e", new Object[]{tBHeapDumper}) : tBHeapDumper.h;
    }

    public static /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : g;
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : k;
    }

    /* loaded from: classes.dex */
    public static class HeapDumpReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final TBHeapDumper f15453a;

        static {
            kge.a(-1823343937);
        }

        /* renamed from: lambda$hBMzNI3M-UAOn166bisFyWvV444 */
        public static /* synthetic */ void m1030lambda$hBMzNI3MUAOn166bisFyWvV444(HeapDumpReceiver heapDumpReceiver, Intent intent, Context context) {
            heapDumpReceiver.a(intent, context);
        }

        public HeapDumpReceiver(TBHeapDumper tBHeapDumper) {
            this.f15453a = tBHeapDumper;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TBHeapDumper.a(this.f15453a).compareAndSet(false, true)) {
                com.taobao.android.tbuprofen.log.c.b("TBHeapDumper", "Current in dump process", new Object[0]);
            } else {
                new Thread(new Runnable() { // from class: com.taobao.android.tbuprofen.adapter.-$$Lambda$TBHeapDumper$HeapDumpReceiver$hBMzNI3M-UAOn166bisFyWvV444
                    {
                        TBHeapDumper.HeapDumpReceiver.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TBHeapDumper.HeapDumpReceiver.m1030lambda$hBMzNI3MUAOn166bisFyWvV444(TBHeapDumper.HeapDumpReceiver.this, intent, context);
                    }
                }, "tbp-dump-thread").start();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x00f6 A[Catch: all -> 0x014e, Exception -> 0x0150, Merged into TryCatch #1 {all -> 0x014e, Exception -> 0x0150, blocks: (B:78:0x001a, B:80:0x0022, B:83:0x0033, B:87:0x005b, B:110:0x00a5, B:112:0x00ba, B:113:0x00be, B:116:0x00d4, B:121:0x00e2, B:123:0x011d, B:127:0x012f, B:129:0x0137, B:131:0x013d, B:122:0x00f6, B:94:0x0070, B:97:0x007a, B:100:0x0084, B:137:0x0151), top: B:143:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0125 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x012f A[Catch: all -> 0x014e, Exception -> 0x0150, Merged into TryCatch #1 {all -> 0x014e, Exception -> 0x0150, blocks: (B:78:0x001a, B:80:0x0022, B:83:0x0033, B:87:0x005b, B:110:0x00a5, B:112:0x00ba, B:113:0x00be, B:116:0x00d4, B:121:0x00e2, B:123:0x011d, B:127:0x012f, B:129:0x0137, B:131:0x013d, B:122:0x00f6, B:94:0x0070, B:97:0x007a, B:100:0x0084, B:137:0x0151), top: B:143:0x0009 }, TRY_ENTER] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ void a(android.content.Intent r13, android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.TBHeapDumper.HeapDumpReceiver.a(android.content.Intent, android.content.Context):void");
        }
    }

    static {
        kge.a(-205512684);
        g = 0;
        k = false;
    }

    public TBHeapDumper(Context context, DefaultPlugin defaultPlugin, a aVar) {
        this.f15448a = context;
        this.b = defaultPlugin;
        this.c = aVar.f;
        if (aVar.g == null) {
            this.h = new TBProfConfig.HeapDumpConfig();
        } else {
            this.h = aVar.g;
        }
        this.i = aVar;
        File externalCacheDir = context.getExternalCacheDir();
        this.d = new File(externalCacheDir == null ? context.getCacheDir() : externalCacheDir, "tbp-dump");
        if (!this.d.exists()) {
            this.d.mkdirs();
        }
        this.j = false;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Init TBHeapDumper", new Object[0]);
            if (this.e == null) {
                this.e = new HeapDumpReceiver(this);
                IntentFilter intentFilter = new IntentFilter("com.taobao.android.diagnose.action.JAVA_LOW_MEMORY");
                intentFilter.addAction(ACTION_DIAGNOSE_DUMP_HEAP);
                LocalBroadcastManager.getInstance(this.f15448a).registerReceiver(this.e, intentFilter);
                if (new File("/data/local/tmp/.dump_hprof_enable").exists()) {
                    IntentFilter intentFilter2 = new IntentFilter(ACTION_DIAGNOSE_DUMP_HEAP_TEST);
                    if (Build.VERSION.SDK_INT > 33) {
                        this.f15448a.registerReceiver(this.e, intentFilter2, 2);
                    } else {
                        this.f15448a.registerReceiver(this.e, intentFilter2);
                    }
                    this.j = true;
                }
            }
            j();
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", e, "Init exception", new Object[0]);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            com.taobao.android.tbuprofen.common.e.a().a(new Runnable() { // from class: com.taobao.android.tbuprofen.adapter.-$$Lambda$JHRUaA6EKH-k7aR9RtN2bWHSab0
                {
                    TBHeapDumper.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TBHeapDumper.this.c();
                }
            }, 10L, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(boolean r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.TBHeapDumper.b(boolean):boolean");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f.get()) {
            com.taobao.android.tbuprofen.log.c.d("TBHeapDumper", "checkFile", new Object[0]);
            File[] listFiles = this.d.listFiles();
            if (listFiles == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (file.getName().endsWith(".zst") || file.getName().endsWith(".part")) {
                    long j = this.h.expireDay * 24 * 3600000;
                    if (j > 0 && System.currentTimeMillis() - file.lastModified() < j) {
                        arrayList.add(file);
                        com.taobao.android.tbuprofen.log.c.d("TBHeapDumper", "Add upload list:%s", file.getName());
                    } else {
                        file.delete();
                        com.taobao.android.tbuprofen.log.c.d("TBHeapDumper", "Delete expire file:%s", file.getName());
                    }
                } else {
                    file.delete();
                    com.taobao.android.tbuprofen.log.c.d("TBHeapDumper", "Delete file:%s", file.getName());
                }
            }
            if (!this.h.upload || arrayList.isEmpty()) {
                return;
            }
            a((List<File>) arrayList, false);
        }
    }

    private List<File> a(int i, int i2, boolean z) {
        List<File> a2;
        List<File> a3;
        List<File> a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1795fbb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (!this.h.isEnable) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Heap dump is disable", new Object[0]);
            return null;
        }
        com.taobao.android.tbuprofen.log.c.c("TBHeapDumper", "Dump heap info. Type: %d, StripType: %d, Upload: %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList();
        if ((i & 2) == 2 && (a4 = a(2, i2)) != null) {
            arrayList.addAll(a4);
        }
        if ((i & 4) == 4 && (a3 = a(4, i2)) != null) {
            arrayList.addAll(a3);
        }
        if ((i & 8) == 8 && (a2 = a(8, i2)) != null) {
            arrayList.addAll(a2);
        }
        if (z && !arrayList.isEmpty()) {
            a((List<File>) arrayList, true);
        }
        return arrayList;
    }

    private List<File> a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("135b967f", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        List<File> list = null;
        if (this.h.processOnce) {
            int i3 = g;
            if ((i3 & i) == i) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Heap dump only once in same process. %d", Integer.valueOf(i3));
                return null;
            }
        }
        com.taobao.android.tbuprofen.log.c.c("TBHeapDumper", "Start to dump heap info. Type: %d", Integer.valueOf(i));
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 2) {
            list = a(i2);
        } else if (i != 4) {
            if (i != 8) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Unknown dump type: %d", Integer.valueOf(i));
                return null;
            } else if (this.b != null) {
                list = h();
            } else {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "TBP is not start!", new Object[0]);
            }
        } else if (this.b != null) {
            list = g();
        } else {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "TBP is not start!", new Object[0]);
        }
        List<File> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            g |= i;
            com.taobao.android.tbuprofen.log.c.c("TBHeapDumper", "End of dump heap info. Type: %d", Integer.valueOf(i));
            if (this.c != null) {
                long j = 0;
                for (File file : list2) {
                    j += file.length();
                }
                this.c.a(i, System.currentTimeMillis() - currentTimeMillis, j);
            }
        }
        return list2;
    }

    private List<File> a(int i) {
        File file;
        File file2;
        int nativeForkDumpStripHprof;
        List<File> a2;
        List<File> a3;
        IpChange ipChange = $ipChange;
        File file3 = null;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        b(2);
        String a4 = a("tbp.hprof");
        this.d.listFiles($$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7IzaxrVo.INSTANCE);
        File file4 = null;
        if (d() < this.h.minSpace) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Do not have enough space to dump hprof!", new Object[0]);
            a(2, 2, String.valueOf(203));
            return null;
        }
        File file5 = new File(this.d, a4);
        File file6 = new File(this.d, a4 + ".strip");
        File file7 = new File(this.d, a4 + ".dat");
        try {
            try {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Dump tb hprof data with type %d, flag %d", 2, Integer.valueOf(i));
                file = file7;
                file2 = file6;
            } catch (Exception e) {
                e = e;
                file = file7;
                file2 = file6;
            } catch (Throwable th) {
                th = th;
                file3 = file7;
                file4 = file6;
                file4.delete();
                file5.delete();
                file3.delete();
                throw th;
            }
            try {
                nativeForkDumpStripHprof = nativeForkDumpStripHprof(file5.getAbsolutePath(), "tbp-dump-process", this.h.hprofTimeout, this.h.zipLevel, this.h.splitSize, i, i());
                a2 = a(file2);
                a3 = a(file);
            } catch (Exception e2) {
                e = e2;
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", e, "dumpHprofData exception", new Object[0]);
                a(2, 3, e.getClass().getName());
                file2.delete();
                file5.delete();
                file.delete();
                return null;
            }
            if (nativeForkDumpStripHprof == 0) {
                long j = 0;
                for (File file8 : a2) {
                    j += file8.length();
                }
                long j2 = 0;
                for (File file9 : a3) {
                    j2 += file9.length();
                }
                if (this.c != null) {
                    this.c.a(2, file5.length(), file2.length(), j, file.length(), j2);
                }
                file2.delete();
                file5.delete();
                file.delete();
                return a2;
            }
            a(2, 2, String.valueOf(nativeForkDumpStripHprof));
            for (File file10 : a2) {
                file10.delete();
            }
            for (File file11 : a3) {
                file11.delete();
            }
            file2.delete();
            file5.delete();
            file.delete();
            return null;
        } catch (Throwable th2) {
            th = th2;
            file4.delete();
            file5.delete();
            file3.delete();
            throw th;
        }
    }

    public static /* synthetic */ boolean c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ec6365", new Object[]{file})).booleanValue();
        }
        if (file.getName().contains("tbp.hprof")) {
            file.delete();
        }
        return false;
    }

    private List<File> g() {
        int a2;
        List<File> a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        b(4);
        String a4 = a("tbp.ins");
        File file = new File(this.d, a4);
        File file2 = this.d;
        File file3 = new File(file2, a4 + ".zst");
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                for (File file4 : a(file3)) {
                    if (file4.exists()) {
                        file4.delete();
                    }
                }
                a2 = this.b.a(file.getAbsolutePath(), this.h.instanceMinCount, this.h.instanceMinSize, this.h.instanceTopCount, "tbp-dump-process", this.h.instanceTimeout, this.h.zipLevel, this.h.splitSize);
                a3 = a(file3);
            } catch (Exception e) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", e, "dumpInstanceData exception", new Object[0]);
                a(4, 3, e.getClass().getName());
            }
            if (a2 == 0 && !a3.isEmpty()) {
                for (File file5 : a3) {
                    if (!file5.canRead() && !file5.setReadable(true)) {
                        com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Instance file can not read", new Object[0]);
                        a(4, 1, (String) null);
                        return null;
                    }
                }
                return a3;
            }
            a(4, 2, String.valueOf(a2));
            for (File file6 : a3) {
                file6.delete();
            }
            file.delete();
            return null;
        } finally {
            file.delete();
        }
    }

    private List<File> h() {
        int a2;
        List<File> a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        b(8);
        String a4 = a("tbp.ref");
        File file = new File(this.d, a4);
        File file2 = this.d;
        File file3 = new File(file2, a4 + ".zst");
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                for (File file4 : a(file3)) {
                    if (file4.exists()) {
                        file4.delete();
                    }
                }
                a2 = this.b.a(file.getAbsolutePath(), "tbp-dump-process", this.h.referenceTimeout, this.h.zipLevel, this.h.splitSize);
                a3 = a(file3);
            } catch (Exception e) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", e, "dumpReferenceData exception", new Object[0]);
                a(8, 3, e.getClass().getName());
            }
            if (a2 == 0 && !a3.isEmpty()) {
                for (File file5 : a3) {
                    if (!file5.canRead() && !file5.setReadable(true)) {
                        com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Instance file can not read", new Object[0]);
                        a(4, 1, (String) null);
                        return null;
                    }
                }
                return a3;
            }
            a(8, 2, String.valueOf(a2));
            return null;
        } finally {
            file.delete();
        }
    }

    private List<File> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bec9888", new Object[]{this, file});
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return Collections.emptyList();
        }
        final File file2 = new File(parentFile, file.getName() + ".zst");
        if (file2.exists()) {
            return Collections.singletonList(file2);
        }
        File[] listFiles = parentFile.listFiles(new FilenameFilter() { // from class: com.taobao.android.tbuprofen.adapter.-$$Lambda$TBHeapDumper$ObUfASsZ6nWKxoEaEDjswRbE5CY
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return TBHeapDumper.lambda$ObUfASsZ6nWKxoEaEDjswRbE5CY(file2, file3, str);
            }
        });
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(listFiles);
    }

    public static /* synthetic */ boolean a(File file, File file2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2a5c764", new Object[]{file, file2, str})).booleanValue() : str.endsWith(".part") && str.contains(file.getName());
    }

    private void a(List<File> list, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            StringBuilder sb = new StringBuilder();
            for (File file : list) {
                if (this.h.uploadData || !file.getName().contains(".dat")) {
                    arrayList.add(file.getAbsolutePath());
                    sb.append(file.length() >> 20);
                    sb.append(";");
                }
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "3");
            hashMap.put("packageName", this.f15448a.getPackageName());
            hashMap.put("appVersion", this.i.f15455a);
            hashMap.put(com.taobao.tao.log.statistics.d.PARAM_IS_DEBUG, Boolean.toString(this.i.c));
            hashMap.put("osVer", Build.VERSION.RELEASE);
            hashMap.put("sdkVer", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("brand", Build.BRAND);
            hashMap.put("model", Build.MODEL);
            hashMap.put("buildId", com.taobao.android.tbuprofen.common.a.a(this.f15448a, "build_id"));
            hashMap.put("packageType", com.taobao.android.tbuprofen.common.a.a(this.f15448a, "package_type"));
            hashMap.put("publishType", com.taobao.android.tbuprofen.common.a.a(this.f15448a, "publish_type"));
            hashMap.put("count", String.valueOf(list.size()));
            hashMap.put("content", String.format("HeapDump[%s][%b](%s)", this.i.f15455a, Boolean.valueOf(z), sb));
            olg.a(arrayList, "USER_UPLOAD", "taobao_hprof_upload", hashMap, new olf() { // from class: com.taobao.android.tbuprofen.adapter.TBHeapDumper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TBHeapDumper.this = this;
                }

                @Override // tb.olf
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else {
                        com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Upload file failed. errcode=%s, errmsg=%s", str2, str3);
                    }
                }

                @Override // tb.olf
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    File file2 = new File(str);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    com.taobao.android.tbuprofen.log.c.c("TBHeapDumper", "Upload file %s successfully.", str);
                    if (!olh.ALL_DONE.equals(str) || !z) {
                        return;
                    }
                    olg.a("ERROR", "MEM_EXHAUST", hashMap, new olf() { // from class: com.taobao.android.tbuprofen.adapter.TBHeapDumper.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // tb.olf
                        public void a(String str3, String str4, String str5) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                            } else {
                                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Upload tlog file failed.", new Object[0]);
                            }
                        }

                        @Override // tb.olf
                        public void a(String str3, String str4) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                            } else {
                                com.taobao.android.tbuprofen.log.c.c("TBHeapDumper", "Upload tlog file successfully.", new Object[0]);
                            }
                        }
                    });
                }
            }, 7, UploadFileType.HEAP_DUMP);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.a(i);
    }

    private void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        eVar.a(i, i2, str);
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return String.format("%s-%s-%s", this.i.f15455a, !TextUtils.isEmpty(this.i.b) ? this.i.b.replaceAll("[:*?<>|\"\\\\/]", "_") : "default", str);
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (!this.h.addHeaderInfo) {
            return null;
        }
        if (this.l == null) {
            this.l = String.format("%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s", com.taobao.android.tbuprofen.common.a.a(this.f15448a, "appkey"), this.f15448a.getPackageName(), this.i.b, this.i.f15455a, Boolean.valueOf(this.i.c), Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.BRAND, Build.MODEL, Build.FINGERPRINT, Boolean.valueOf(com.taobao.android.diagnose.common.a.b()), com.taobao.android.tbuprofen.common.a.a(this.f15448a, "build_id"), com.taobao.android.tbuprofen.common.a.a(this.f15448a, "package_type"), com.taobao.android.tbuprofen.common.a.a(this.f15448a, "publish_type"), UTDevice.getUtdid(this.f15448a));
        }
        return this.l;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!b(true)) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Dump for OOM is disable!", new Object[0]);
        } else if (d() < this.h.minSpace) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Do not have enough space to dump oom hprof!", new Object[0]);
        } else {
            final String i = i();
            String a2 = a("tbp-oom.hprof");
            final File file = new File(this.d, a2);
            File file2 = this.d;
            final File file3 = new File(file2, a2 + ".strip");
            final String absolutePath = file.getAbsolutePath();
            final File[] listFiles = this.d.listFiles($$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCngsgA.INSTANCE);
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Enable OOM Dump!!", new Object[0]);
            TCrashSDK.instance().addJvmUncaughtCrashListener(new JvmUncaughtCrashListener() { // from class: com.taobao.android.tbuprofen.adapter.TBHeapDumper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TBHeapDumper.this = this;
                }

                @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
                public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
                    }
                    if (th instanceof OutOfMemoryError) {
                        if (TBHeapDumper.c(TBHeapDumper.this).processOnce && TBHeapDumper.e() != 0) {
                            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Heap dump only once in same process. %d", Integer.valueOf(TBHeapDumper.e()));
                            return null;
                        }
                        long j = Runtime.getRuntime().totalMemory();
                        if ((j >> 20) < 500) {
                            return null;
                        }
                        String.format("OOM Crash!!! Heap:%d", Long.valueOf(j));
                        TBHeapDumper.a(true);
                    }
                    return null;
                }
            });
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.JAVA_ONLY, new OnFileCreatedListener() { // from class: com.taobao.android.tbuprofen.adapter.TBHeapDumper.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TBHeapDumper.this = this;
                }

                @Override // com.taobao.android.tcrash.OnFileCreatedListener
                public void onFileCreated(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b8cac13e", new Object[]{this, str});
                    } else if (TBHeapDumper.f()) {
                        for (File file4 : listFiles) {
                            file4.delete();
                        }
                        TBHeapDumper.nativeForkDumpStripHprof(absolutePath, "tbp-dump-process", TBHeapDumper.c(TBHeapDumper.this).hprofTimeout, TBHeapDumper.c(TBHeapDumper.this).zipLevel, TBHeapDumper.c(TBHeapDumper.this).splitSize, TBHeapDumper.c(TBHeapDumper.this).stripFlag, i);
                        file.delete();
                        file3.delete();
                    }
                }
            });
        }
    }

    public static /* synthetic */ boolean b(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue() : file.getName().contains("tbp-oom.hprof");
    }

    public void a(String str, int i, int i2, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb4d02", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && str.equals(this.i.b)) {
            File file = new File(this.d.getParentFile(), "tbp-dump-local");
            if (!file.exists()) {
                file.mkdirs();
            }
            String a2 = a(System.currentTimeMillis() + "-tbp.hprof");
            File file2 = new File(file, a2);
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Dump heap info for type %d, stripFlag %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0) {
                nativeForkDumpHprof(file2.getPath(), "tbp-dump-process", this.h.hprofTimeout, 0, null);
                return;
            }
            if (i == 1) {
                nativeForkDumpHprof(file2.getPath(), "tbp-dump-process", this.h.hprofTimeout, this.h.zipLevel, i());
            } else if (i != 2) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Unsupported dump type %d", Integer.valueOf(i));
            } else {
                nativeForkDumpStripHprof(file2.getAbsolutePath(), "tbp-dump-process", this.h.hprofTimeout, this.h.zipLevel, this.h.splitSize, i2, i());
            }
            if (z || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file3 : listFiles) {
                if (file3.getName().contains(a2) && !file3.getName().endsWith(".zst")) {
                    file3.delete();
                }
            }
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.m) {
            return true;
        }
        try {
        } catch (UnsatisfiedLinkError unused) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Failed to load plugin lib", new Object[0]);
        }
        if (!com.android.taobao.zstd.d.a()) {
            com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Zstd is not ready!!.", new Object[0]);
            return false;
        }
        if (this.b == null) {
            String a2 = h.b().a(DefaultPlugin.PLUGIN_LIB_NAME);
            if (!TextUtils.isEmpty(a2)) {
                com.taobao.android.tbuprofen.log.c.a("TBHeapDumper", "Failed to load plugin lib. %s", a2);
            } else {
                this.m = true;
            }
        }
        return this.m;
    }
}
