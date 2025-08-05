package com.ta.utdid2.core.persistent;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.core.persistent.MySharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class TransactionXMLFile {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object GLOBAL_COMMIT_LOCK;
    public static final int MODE_PRIVATE = 0;
    private File mPreferencesDir;
    private final Object mSync = new Object();
    private HashMap<File, MySharedPreferencesImpl> sSharedPrefs = new HashMap<>();

    public static /* synthetic */ File access$000(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("e1061b1f", new Object[]{file}) : makeBackupFile(file);
    }

    public static /* synthetic */ Object access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("79619b7a", new Object[0]) : GLOBAL_COMMIT_LOCK;
    }

    static {
        kge.a(673120966);
        GLOBAL_COMMIT_LOCK = new Object();
    }

    public TransactionXMLFile(String str) {
        if (str != null && str.length() > 0) {
            this.mPreferencesDir = new File(str);
            return;
        }
        throw new RuntimeException("Directory can not be empty");
    }

    private File makeFilename(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9d6ef890", new Object[]{this, file, str});
        }
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    private File getPreferencesDir() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e5467fdb", new Object[]{this});
        }
        synchronized (this.mSync) {
            file = this.mPreferencesDir;
        }
        return file;
    }

    private File getSharedPrefsFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4cb74d4b", new Object[]{this, str});
        }
        File preferencesDir = getPreferencesDir();
        return makeFilename(preferencesDir, str + ".xml");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (r0 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ta.utdid2.core.persistent.MySharedPreferences getMySharedPreferences(java.lang.String r5, int r6) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.core.persistent.TransactionXMLFile.getMySharedPreferences(java.lang.String, int):com.ta.utdid2.core.persistent.MySharedPreferences");
    }

    private static File makeBackupFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a29e17a3", new Object[]{file});
        }
        return new File(file.getPath() + ".bak");
    }

    /* loaded from: classes.dex */
    public static final class MySharedPreferencesImpl implements MySharedPreferences {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Object f;

        /* renamed from: a  reason: collision with root package name */
        private final File f8138a;
        private final File b;
        private final int c;
        private Map d;
        private boolean e = false;
        private WeakHashMap<MySharedPreferences.OnSharedPreferenceChangeListener, Object> g;

        public static /* synthetic */ WeakHashMap a(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("e2a74f69", new Object[]{mySharedPreferencesImpl}) : mySharedPreferencesImpl.g;
        }

        public static /* synthetic */ Map b(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("11e22624", new Object[]{mySharedPreferencesImpl}) : mySharedPreferencesImpl.d;
        }

        public static /* synthetic */ boolean c(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4d7f474", new Object[]{mySharedPreferencesImpl})).booleanValue() : mySharedPreferencesImpl.b();
        }

        static {
            kge.a(-1449077815);
            kge.a(-64142890);
            f = new Object();
        }

        public MySharedPreferencesImpl(File file, int i, Map map) {
            this.f8138a = file;
            this.b = TransactionXMLFile.access$000(file);
            this.c = i;
            this.d = map == null ? new HashMap() : map;
            this.g = new WeakHashMap<>();
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean checkFile() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64031d2f", new Object[]{this})).booleanValue();
            }
            File file = this.f8138a;
            return file != null && new File(file.getAbsolutePath()).exists();
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            synchronized (this) {
                this.e = z;
            }
        }

        public boolean a() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            synchronized (this) {
                z = this.e;
            }
            return z;
        }

        public void a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else if (map == null) {
            } else {
                synchronized (this) {
                    this.d = map;
                }
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public void registerOnSharedPreferenceChangeListener(MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ec12e2b", new Object[]{this, onSharedPreferenceChangeListener});
                return;
            }
            synchronized (this) {
                this.g.put(onSharedPreferenceChangeListener, f);
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public void unregisterOnSharedPreferenceChangeListener(MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cfeacc4", new Object[]{this, onSharedPreferenceChangeListener});
                return;
            }
            synchronized (this) {
                this.g.remove(onSharedPreferenceChangeListener);
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public Map<String, ?> getAll() {
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
            }
            synchronized (this) {
                hashMap = new HashMap(this.d);
            }
            return hashMap;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public String getString(String str, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
            }
            synchronized (this) {
                str3 = (String) this.d.get(str);
                if (str3 == null) {
                    str3 = str2;
                }
            }
            return str3;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public int getInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
            }
            synchronized (this) {
                Integer num = (Integer) this.d.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            }
            return i;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public long getLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
            }
            synchronized (this) {
                Long l = (Long) this.d.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public float getFloat(String str, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f2)})).floatValue();
            }
            synchronized (this) {
                Float f3 = (Float) this.d.get(str);
                if (f3 != null) {
                    f2 = f3.floatValue();
                }
            }
            return f2;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean getBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            synchronized (this) {
                Boolean bool = (Boolean) this.d.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
            return z;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean contains(String str) {
            boolean containsKey;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
            }
            synchronized (this) {
                containsKey = this.d.containsKey(str);
            }
            return containsKey;
        }

        /* loaded from: classes.dex */
        public final class EditorImpl implements MySharedPreferences.MyEditor {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Map<String, Object> mModified = new HashMap();
            private boolean mClear = false;

            static {
                kge.a(-1839620856);
                kge.a(-701654681);
            }

            public EditorImpl() {
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putString(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("cb9b5b03", new Object[]{this, str, str2});
                }
                synchronized (this) {
                    this.mModified.put(str, str2);
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putInt(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("400a5a8c", new Object[]{this, str, new Integer(i)});
                }
                synchronized (this) {
                    this.mModified.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putLong(String str, long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("2f8b2536", new Object[]{this, str, new Long(j)});
                }
                synchronized (this) {
                    this.mModified.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putFloat(String str, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("33f2849c", new Object[]{this, str, new Float(f)});
                }
                synchronized (this) {
                    this.mModified.put(str, Float.valueOf(f));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putBoolean(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("1a109394", new Object[]{this, str, new Boolean(z)});
                }
                synchronized (this) {
                    this.mModified.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor remove(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("331d18c9", new Object[]{this, str});
                }
                synchronized (this) {
                    this.mModified.put(str, this);
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor clear() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("58b1912a", new Object[]{this});
                }
                synchronized (this) {
                    this.mClear = true;
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<MySharedPreferences.OnSharedPreferenceChangeListener> hashSet;
                boolean c;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
                }
                synchronized (TransactionXMLFile.access$100()) {
                    z = MySharedPreferencesImpl.a(MySharedPreferencesImpl.this).size() > 0;
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet(MySharedPreferencesImpl.a(MySharedPreferencesImpl.this).keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.mClear) {
                            MySharedPreferencesImpl.b(MySharedPreferencesImpl.this).clear();
                            this.mClear = false;
                        }
                        for (Map.Entry<String, Object> entry : this.mModified.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (value == this) {
                                MySharedPreferencesImpl.b(MySharedPreferencesImpl.this).remove(key);
                            } else {
                                MySharedPreferencesImpl.b(MySharedPreferencesImpl.this).put(key, value);
                            }
                            if (z) {
                                arrayList.add(key);
                            }
                        }
                        this.mModified.clear();
                    }
                    c = MySharedPreferencesImpl.c(MySharedPreferencesImpl.this);
                    if (c) {
                        MySharedPreferencesImpl.this.a(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : hashSet) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(MySharedPreferencesImpl.this, str);
                            }
                        }
                    }
                }
                return c;
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public MySharedPreferences.MyEditor edit() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("d86cd5cd", new Object[]{this}) : new EditorImpl();
        }

        private FileOutputStream a(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileOutputStream) ipChange.ipc$dispatch("12101f2d", new Object[]{this, file});
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (this.f8138a.exists()) {
                if (!this.b.exists()) {
                    if (!this.f8138a.renameTo(this.b)) {
                        return false;
                    }
                } else {
                    this.f8138a.delete();
                }
            }
            try {
                FileOutputStream a2 = a(this.f8138a);
                if (a2 == null) {
                    return false;
                }
                b.a(this.d, a2);
                a2.close();
                this.b.delete();
                return true;
            } catch (Exception unused) {
                if (this.f8138a.exists()) {
                    this.f8138a.delete();
                }
                return false;
            }
        }
    }
}
