package com.taobao.android.boutique.fastsp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.BackupFastSp;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.qmw;
import tb.tco;

/* loaded from: classes4.dex */
public class BackupFastSp implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Object CONTENT;
    private static final String TAG = "FastSp";
    private final qmw mAction;
    private final File mBackupFile;
    private long mCurrentMemoryStateGeneration;
    private long mDiskStateGeneration;
    private final File mKvFile;
    private Future<?> mLastTask;
    private Map<String, Object> mMap;
    private final File mXmlFile;
    private final Object mLock = new Object();
    private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> mListeners = new WeakHashMap<>();

    /* loaded from: classes4.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final ScheduledExecutorService f9221a;

        static {
            kge.a(1466909871);
            ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new h() { // from class: com.taobao.android.boutique.fastsp.BackupFastSp.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.virtual_thread.face.h
                public String newThreadName() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "fast_sp";
                }
            });
            f9221a = newScheduledThreadPool;
            if (newScheduledThreadPool instanceof ThreadPoolExecutor) {
                ((ThreadPoolExecutor) f9221a).setKeepAliveTime(1L, TimeUnit.SECONDS);
                ((ThreadPoolExecutor) f9221a).allowCoreThreadTimeOut(true);
            }
        }

        public static void a(Runnable runnable, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e91fcae", new Object[]{runnable, new Boolean(z)});
            } else if (z) {
                f9221a.execute(runnable);
            } else {
                f9221a.schedule(runnable, 100L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static /* synthetic */ void access$100(BackupFastSp backupFastSp, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a857c43a", new Object[]{backupFastSp, bVar});
        } else {
            backupFastSp.writeToFile(bVar);
        }
    }

    public static /* synthetic */ void access$200(BackupFastSp backupFastSp, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d36739", new Object[]{backupFastSp, bVar, new Boolean(z)});
        } else {
            backupFastSp.enqueueDiskWrite(bVar, z);
        }
    }

    public static /* synthetic */ Object access$300(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b453be4", new Object[]{backupFastSp}) : backupFastSp.mLock;
    }

    public static /* synthetic */ Map access$400(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("26abdb62", new Object[]{backupFastSp}) : backupFastSp.mMap;
    }

    public static /* synthetic */ Map access$402(BackupFastSp backupFastSp, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49ddabaf", new Object[]{backupFastSp, map});
        }
        backupFastSp.mMap = map;
        return map;
    }

    public static /* synthetic */ WeakHashMap access$500(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("db8b83c7", new Object[]{backupFastSp}) : backupFastSp.mListeners;
    }

    public static /* synthetic */ long access$600(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("558c519f", new Object[]{backupFastSp})).longValue() : backupFastSp.mCurrentMemoryStateGeneration;
    }

    public static /* synthetic */ long access$608(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26684697", new Object[]{backupFastSp})).longValue();
        }
        long j = backupFastSp.mCurrentMemoryStateGeneration;
        backupFastSp.mCurrentMemoryStateGeneration = 1 + j;
        return j;
    }

    static {
        kge.a(-1101941735);
        kge.a(1991704957);
        CONTENT = new Object();
    }

    public BackupFastSp(File file, File file2, int i, qmw qmwVar) {
        this.mKvFile = file;
        this.mXmlFile = file2;
        this.mBackupFile = makeBackupFile(file);
        this.mAction = qmwVar;
        loadFromDisk();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this}) : new HashMap(this.mMap);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        String str3 = (String) this.mMap.get(str);
        return str3 != null ? str3 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        Set<String> set2 = (Set) this.mMap.get(str);
        return set2 != null ? set2 : set;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Integer num = (Integer) this.mMap.get(str);
        return num != null ? num.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        Long l = (Long) this.mMap.get(str);
        return l != null ? l.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        Float f2 = (Float) this.mMap.get(str);
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = (Boolean) this.mMap.get(str);
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue() : this.mMap.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this}) : new a();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.mLock) {
            this.mListeners.put(onSharedPreferenceChangeListener, CONTENT);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.mLock) {
            this.mListeners.remove(onSharedPreferenceChangeListener);
        }
    }

    private void loadFromDisk() {
        Map<String, ?> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bf9d74", new Object[]{this});
            return;
        }
        if (this.mBackupFile.exists()) {
            this.mKvFile.delete();
            this.mBackupFile.renameTo(this.mKvFile);
        }
        if (this.mKvFile.exists() && !this.mKvFile.canRead()) {
            tco.b(TAG, "Attempt to read preferences file " + this.mKvFile + " without permission");
        }
        Throwable th = null;
        try {
            try {
                map = this.mAction.a(this.mXmlFile, this.mKvFile);
            } catch (Exception e) {
                tco.a(e);
                tco.b(TAG, "Cannot read " + this.mKvFile.getAbsolutePath(), e);
                map = null;
            }
        } catch (Throwable th2) {
            tco.a(th2);
            map = null;
            th = th2;
        }
        if (th != null) {
            return;
        }
        if (map != null) {
            this.mMap = map;
        } else {
            this.mMap = new HashMap();
        }
    }

    public static File makeBackupFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a29e17a3", new Object[]{file});
        }
        return new File(file.getPath() + ".bak");
    }

    private void writeToFile(b bVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7935918d", new Object[]{this, bVar});
            return;
        }
        if (this.mKvFile.exists()) {
            if (this.mDiskStateGeneration < bVar.f9220a) {
                synchronized (this.mLock) {
                    z = this.mCurrentMemoryStateGeneration == bVar.f9220a;
                }
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            if (!this.mBackupFile.exists()) {
                if (!this.mKvFile.renameTo(this.mBackupFile)) {
                    tco.c(TAG, "Couldn't rename file " + this.mKvFile + " to backup file " + this.mBackupFile);
                    return;
                }
            } else {
                this.mKvFile.delete();
            }
        }
        try {
            this.mAction.a(this.mMap, this.mXmlFile, this.mKvFile);
            this.mDiskStateGeneration = bVar.f9220a;
            this.mBackupFile.delete();
        } catch (Exception e) {
            tco.b(TAG, "writeToFile: Got exception:", e);
            if (!this.mKvFile.exists() || this.mKvFile.delete()) {
                return;
            }
            tco.c(TAG, "Couldn't clean up partially-written file " + this.mKvFile);
        }
    }

    private void enqueueDiskWrite(final b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02d02ab", new Object[]{this, bVar, new Boolean(z)});
        } else {
            c.a(new Runnable() { // from class: com.taobao.android.boutique.fastsp.BackupFastSp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    BackupFastSp.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BackupFastSp.access$100(BackupFastSp.this, bVar);
                    }
                }
            }, z);
        }
    }

    /* loaded from: classes4.dex */
    public class a implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Object b;
        private boolean c;
        private final Map<String, Object> d;

        static {
            kge.a(-2050612620);
            kge.a(1666853524);
        }

        public static /* synthetic */ void lambda$DLtf2PoN4O5NUujirur195AlUpQ(a aVar, b bVar) {
            aVar.b(bVar);
        }

        private a() {
            BackupFastSp.this = r1;
            this.b = new Object();
            this.c = false;
            this.d = new HashMap();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this.b) {
                this.d.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            synchronized (this.b) {
                this.d.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            synchronized (this.b) {
                this.d.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            synchronized (this.b) {
                this.d.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            synchronized (this.b) {
                this.d.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            synchronized (this.b) {
                this.d.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            synchronized (this.b) {
                this.d.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            synchronized (this.b) {
                this.c = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            a(true);
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                a(false);
            }
        }

        private void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            b a2 = a();
            BackupFastSp.access$200(BackupFastSp.this, a2, z);
            a(a2);
        }

        private void a(final b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5e5e422", new Object[]{this, bVar});
            } else if (bVar.d != null) {
                if (bVar.c == null && !bVar.b) {
                    return;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.c.size() - 1; size >= 0; size--) {
                        String str = bVar.c.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.d) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(BackupFastSp.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.boutique.fastsp.-$$Lambda$BackupFastSp$a$DLtf2PoN4O5NUujirur195AlUpQ
                    {
                        BackupFastSp.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BackupFastSp.a.lambda$DLtf2PoN4O5NUujirur195AlUpQ(BackupFastSp.a.this, bVar);
                    }
                });
            }
        }

        public /* synthetic */ void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c71c3701", new Object[]{this, bVar});
            } else {
                a(bVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x00b1 A[Catch: all -> 0x00df, TryCatch #2 {, blocks: (B:82:0x001c, B:88:0x0039, B:90:0x0052, B:91:0x0054, B:125:0x00ce, B:92:0x0055, B:94:0x0059, B:96:0x005f, B:98:0x0065, B:100:0x006b, B:101:0x0075, B:103:0x007b, B:107:0x0090, B:109:0x0096, B:111:0x009c, B:113:0x00a2, B:118:0x00b1, B:114:0x00a6, B:116:0x00ac, B:120:0x00b6, B:122:0x00bd, B:123:0x00c2, B:124:0x00cd), top: B:134:0x001c }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.taobao.android.boutique.fastsp.BackupFastSp.b a() {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.boutique.fastsp.BackupFastSp.a.a():com.taobao.android.boutique.fastsp.BackupFastSp$b");
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public final long f9220a;
        public final boolean b;
        public final List<String> c;
        public final Set<SharedPreferences.OnSharedPreferenceChangeListener> d;
        public final Map<String, Object> e;

        static {
            kge.a(-858479008);
        }

        private b(long j, boolean z, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f9220a = j;
            this.b = z;
            this.c = list;
            this.d = set;
            this.e = map;
        }
    }
}
