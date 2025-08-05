package com.taobao.global.setting.util;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/* loaded from: classes7.dex */
public final class f implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<String, Object> f17220a;
    private final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> b;
    private e c;
    private boolean d;
    private File e;
    private String f;
    private int g;
    private FileChannel h;
    private MappedByteBuffer i;
    private HandlerThread j;
    private Handler k;
    private final Object l;
    private final Object m;
    private int n;
    private Vector<SharedPreferences.Editor> o;
    private InterfaceC0661f p;
    private boolean q;
    private long r;
    private final Runnable s;
    private g t;
    private int u;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static float a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c19671f", new Object[]{bArr})).floatValue() : ByteBuffer.wrap(bArr).getFloat();
        }

        public static byte[] a(float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c0f8385", new Object[]{new Float(f)}) : ByteBuffer.allocate(4).putFloat(f).array();
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static int a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{bArr})).intValue() : ByteBuffer.wrap(bArr).getInt();
        }

        public static byte[] a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{new Integer(i)}) : ByteBuffer.allocate(4).putInt(i).array();
        }
    }

    /* loaded from: classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static long a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196723", new Object[]{bArr})).longValue() : ByteBuffer.wrap(bArr).getLong();
        }

        public static byte[] a(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("5c115501", new Object[]{new Long(j)}) : ByteBuffer.allocate(8).putLong(j).array();
        }
    }

    /* loaded from: classes7.dex */
    public final class e extends FileObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(String str, int i) {
            super(str, i);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            } else if (f.b(f.this).size() > 0) {
                f.f(f.this);
            } else {
                stopWatching();
            }
        }
    }

    /* renamed from: com.taobao.global.setting.util.f$f  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0661f {
    }

    public boolean a(byte b2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217958", new Object[]{this, new Byte(b2)})).booleanValue() : b2 == 4 || b2 == 2 || b2 == 1 || b2 == 3 || b2 == 5;
    }

    public static /* synthetic */ e a(f fVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("dba25910", new Object[]{fVar, eVar});
        }
        fVar.c = eVar;
        return eVar;
    }

    public static /* synthetic */ String a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("432c317a", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ void a(f fVar, SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08bd573", new Object[]{fVar, editor, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            fVar.a(editor, z, z2, z3);
        }
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25abe3ae", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.a(z);
        }
    }

    public static /* synthetic */ ArrayList b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("83180d81", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ e c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("40c6990b", new Object[]{fVar}) : fVar.c;
    }

    public static /* synthetic */ int d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f921319c", new Object[]{fVar})).intValue() : fVar.g;
    }

    public static /* synthetic */ void e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22228ea", new Object[]{fVar});
        } else {
            fVar.i();
        }
    }

    public static /* synthetic */ void f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b23202b", new Object[]{fVar});
        } else {
            fVar.b();
        }
    }

    public f(File file) {
        this(file, 0, null);
    }

    public f(File file, int i, InterfaceC0661f interfaceC0661f) {
        this.f17220a = new LinkedHashMap<>();
        this.b = new ArrayList<>();
        this.d = true;
        this.l = new Object();
        this.m = new Object();
        this.o = new Vector<>();
        this.q = false;
        this.s = new Runnable() { // from class: com.taobao.global.setting.util.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int a2 = f.this.a();
                if (a2 <= 0 || a2 == f.d(f.this)) {
                    return;
                }
                f.a(f.this, false);
            }
        };
        this.t = new g() { // from class: com.taobao.global.setting.util.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.a(f.this, ((Boolean) a()).booleanValue());
                }
            }
        };
        this.p = interfaceC0661f;
        this.j = new HandlerThread(file.getName());
        this.j.start();
        this.k = new Handler(this.j.getLooper());
        this.e = file;
        this.f = file.getAbsolutePath() + ".bak";
        if (k()) {
            h();
        }
        this.k.post(new Runnable() { // from class: com.taobao.global.setting.util.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    File file2 = new File(f.a(f.this));
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                f fVar = f.this;
                f.a(fVar, new e(f.a(fVar), 2));
                if (f.b(f.this).size() <= 0) {
                    return;
                }
                f.c(f.this).startWatching();
            }
        });
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        j();
        synchronized (this.f17220a) {
            hashMap = new HashMap(this.f17220a);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        j();
        synchronized (this.f17220a) {
            try {
                try {
                    String str3 = (String) this.f17220a.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (ClassCastException e2) {
                    if (this.p != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e != null ? this.e.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e2);
                        sb.toString();
                        if (this.e != null) {
                            this.e.length();
                        }
                    }
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        throw new RuntimeException("putStringSet is not supported!");
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        j();
        synchronized (this.f17220a) {
            try {
                try {
                    Integer num = (Integer) this.f17220a.get(str);
                    if (num != null) {
                        i = num.intValue();
                    }
                } catch (ClassCastException e2) {
                    if (this.p != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e != null ? this.e.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e2);
                        sb.toString();
                        if (this.e != null) {
                            this.e.length();
                        }
                    }
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        j();
        synchronized (this.f17220a) {
            try {
                try {
                    Long l = (Long) this.f17220a.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (ClassCastException e2) {
                    if (this.p != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e != null ? this.e.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e2);
                        sb.toString();
                        if (this.e != null) {
                            this.e.length();
                        }
                    }
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        j();
        synchronized (this.f17220a) {
            try {
                try {
                    Float f2 = (Float) this.f17220a.get(str);
                    if (f2 != null) {
                        f = f2.floatValue();
                    }
                } catch (ClassCastException e2) {
                    if (this.p != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e != null ? this.e.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e2);
                        sb.toString();
                        if (this.e != null) {
                            this.e.length();
                        }
                    }
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        j();
        synchronized (this.f17220a) {
            try {
                try {
                    Boolean bool = (Boolean) this.f17220a.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (ClassCastException e2) {
                    if (this.p != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e != null ? this.e.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e2);
                        sb.toString();
                        if (this.e != null) {
                            this.e.length();
                        }
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean containsKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        j();
        synchronized (this.f17220a) {
            containsKey = this.f17220a.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        j();
        return new d();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
        } else if (onSharedPreferenceChangeListener == null) {
        } else {
            this.b.add(onSharedPreferenceChangeListener);
            e eVar = this.c;
            if (eVar == null) {
                return;
            }
            eVar.startWatching();
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
        } else if (onSharedPreferenceChangeListener == null) {
        } else {
            this.b.remove(onSharedPreferenceChangeListener);
            if (this.c == null || this.b.size() > 0) {
                return;
            }
            this.c.stopWatching();
        }
    }

    /* loaded from: classes7.dex */
    public final class d implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private HashMap<String, Object> b = new HashMap<>();
        private boolean c;

        public d() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this) {
                this.b.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            throw new RuntimeException("putStringSet is not supported!");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            synchronized (this) {
                this.b.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            synchronized (this) {
                this.b.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            synchronized (this) {
                this.b.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            synchronized (this) {
                this.b.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            synchronized (this) {
                this.b.put(str, null);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            synchronized (this) {
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
            f.a(f.this, this, false, true, false);
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                f.a(f.this, this, false, false, true);
            }
        }

        public boolean a() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            synchronized (this) {
                z = this.c;
                this.c = false;
            }
            return z;
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
            }
            synchronized (this) {
                hashMap = this.b;
            }
            return hashMap;
        }
    }

    private boolean a(SharedPreferences.Editor editor, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d8bf36", new Object[]{this, editor, map, new Boolean(z)})).booleanValue();
        }
        if (editor == null) {
            return false;
        }
        d dVar = (d) editor;
        boolean a2 = dVar.a();
        if (a2) {
            map.clear();
        }
        HashMap<String, Object> b2 = dVar.b();
        if (b2.size() == 0) {
            return a2;
        }
        synchronized (editor) {
            for (Map.Entry<String, Object> entry : b2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    map.remove(key);
                } else {
                    if (map.containsKey(key)) {
                        map.remove(key);
                    }
                    map.put(key, value);
                }
                if (!z) {
                    a(key);
                }
            }
        }
        return true;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.b.size() > 0) {
            for (int i = 0; i < this.b.size(); i++) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.b.get(i);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (SystemClock.elapsedRealtime() - this.r <= 60) {
        } else {
            this.r = SystemClock.elapsedRealtime();
            this.k.removeCallbacks(this.s);
            this.k.post(this.s);
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        int a2 = a();
        if (a2 <= 0 || a2 == this.g) {
            return false;
        }
        b(true);
        return true;
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this.m) {
            FileLock c2 = c(false);
            if (c2 != null) {
                this.q = true;
                if (c()) {
                    l();
                    a((String) null);
                }
                synchronized (this.f17220a) {
                    if (this.o.size() <= 0) {
                        try {
                            c2.release();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        this.q = false;
                        return;
                    }
                    a(m(), z);
                    o();
                    try {
                        c2.release();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    this.q = false;
                }
            }
            int i = this.n;
            this.n = i + 1;
            if (i < 6) {
                this.k.postDelayed(new Runnable() { // from class: com.taobao.global.setting.util.f.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            f.a(f.this, z);
                        }
                    }
                }, 2000L);
            }
        }
    }

    private void a(SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2067a031", new Object[]{this, editor, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (editor == null) {
        } else {
            synchronized (this.f17220a) {
                this.n = 0;
                if (!a(editor, this.f17220a, false)) {
                    return;
                }
                this.o.add(editor);
                if (z2) {
                    a(z);
                    return;
                }
                long j = z3 ? 1000L : 0L;
                this.t.a(Boolean.valueOf(z));
                Message obtain = Message.obtain(this.k, this.t);
                obtain.what = 21310;
                this.k.sendMessageDelayed(obtain, j);
            }
        }
    }

    private Pair<Integer, byte[][]> d() {
        byte[][] bArr;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[]{this});
        }
        synchronized (this.f17220a) {
            bArr = new byte[this.f17220a.size() * 5];
            arrayList = new ArrayList(this.f17220a.entrySet());
            this.o.clear();
        }
        int i = 0;
        int i2 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Map.Entry entry = (Map.Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && str.trim().length() > 0 && value != null) {
                byte[] bytes = str.getBytes();
                byte[] a2 = b.a(bytes.length);
                bArr[i2] = a2;
                bArr[i2 + 1] = bytes;
                int length = i + a2.length + bytes.length;
                byte[] b2 = b(value);
                byte[] a3 = b.a(b2.length);
                bArr[i2 + 2] = a3;
                bArr[i2 + 3] = b2;
                byte[] bArr2 = new byte[1];
                bArr2[0] = (byte) a(value);
                bArr[i2 + 4] = bArr2;
                i = length + a3.length + b2.length + bArr2.length;
                i2 += 5;
            }
        }
        return new Pair<>(Integer.valueOf(i), bArr);
    }

    private void a(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27143185", new Object[]{this, bArr, new Boolean(z)});
            return;
        }
        synchronized (this.l) {
            this.i.position(0);
            b(this.i, bArr);
            if (z) {
                this.i.force();
            }
        }
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        this.g = (this.g + 1) % Integer.MAX_VALUE;
        return this.g;
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        if (this.i == null || this.h == null) {
            return -1;
        }
        synchronized (this.l) {
            this.i.position(0);
            byte[] bArr = new byte[4];
            a(this.i, bArr);
            int a2 = b.a(bArr);
            this.i.position(4);
            byte b2 = this.i.get();
            if ((b2 == 18 || b2 == b(bArr)) && a2 >= 0) {
                int i = 2097152;
                if (a2 <= 2097152) {
                    i = a2;
                }
                return i;
            }
            if (this.p != null) {
                if (this.e != null) {
                    this.e.getAbsolutePath();
                }
                if (this.e != null) {
                    this.e.length();
                }
            }
            return -1;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.i == null) {
        } else {
            synchronized (this.l) {
                try {
                    int f = f();
                    if (f > this.i.capacity()) {
                        a(f + 1024);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        byte[] bArr = null;
        FileLock c2 = z ? null : c(true);
        if (c2 == null && !z) {
            if (z) {
                return;
            }
            p();
            return;
        }
        try {
            g();
            if (this.i != null && this.i.capacity() != 0) {
                long f = f();
                if (f <= 10) {
                    try {
                        z2 = b((byte[]) null, true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (!z2 || this.g < 0) {
                        p();
                    }
                    if (c2 == null) {
                        return;
                    }
                    try {
                        c2.release();
                        return;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return;
                    }
                }
                this.g = a();
                if (this.g > 0) {
                    synchronized (this.l) {
                        this.i.position(10);
                        bArr = new byte[((int) f) - 10];
                        a(this.i, bArr);
                    }
                }
                try {
                    z2 = b(bArr, true);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (!z2 || (bArr == null && this.g < 0)) {
                    p();
                }
                if (c2 == null) {
                    return;
                }
                try {
                    c2.release();
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
            }
            try {
                z2 = b((byte[]) null, true);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            if (!z2 || this.g < 0) {
                p();
            }
            if (c2 == null) {
                return;
            }
            try {
                c2.release();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                z2 = b(bArr, true);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (!z2 || (bArr == null && this.g < 0)) {
                p();
            }
            if (c2 != null) {
                try {
                    c2.release();
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (this.i == null) {
            return -1;
        }
        synchronized (this.l) {
            this.i.position(5);
            byte[] bArr = new byte[4];
            a(this.i, bArr);
            int a2 = b.a(bArr);
            this.i.position(9);
            byte b2 = this.i.get();
            if ((b2 == 18 || b2 == b(bArr)) && a2 >= 0) {
                return a2;
            }
            this.u++;
            if (this.u < 3 && this.p != null) {
                if (this.e != null) {
                    this.e.getAbsolutePath();
                }
                if (this.e != null) {
                    this.e.length();
                }
            }
            return -1;
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.d = false;
        }
        this.k.post(new Runnable() { // from class: com.taobao.global.setting.util.f.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (f.this) {
                    f.e(f.this);
                }
            }
        });
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.d) {
        } else {
            b(false);
            this.d = true;
            notifyAll();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        synchronized (this) {
            while (!this.d) {
                wait();
            }
        }
        b();
    }

    private boolean a(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed77fb01", new Object[]{this, mappedByteBuffer, bArr})).booleanValue();
        }
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        if (mappedByteBuffer.position() + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    private MappedByteBuffer a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (MappedByteBuffer) ipChange.ipc$dispatch("c2563669", new Object[]{this, new Integer(i)});
        }
        MappedByteBuffer mappedByteBuffer = this.i;
        if (mappedByteBuffer != null) {
            i2 = mappedByteBuffer.position();
        }
        try {
            this.i = this.h.map(FileChannel.MapMode.READ_WRITE, 0L, i);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MappedByteBuffer mappedByteBuffer2 = this.i;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.position(i2);
        }
        return this.i;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.i != null) {
            return true;
        }
        try {
            if (!this.e.exists()) {
                this.e.getParentFile().mkdirs();
                this.e.createNewFile();
                z = new File(this.f).exists();
            } else if (this.e.length() == 0) {
                if (this.p != null) {
                    this.e.getAbsolutePath();
                    this.e.length();
                }
                z = false;
            }
            this.h = new RandomAccessFile(this.e, "rw").getChannel();
            a(10);
            if (z) {
                return z;
            }
            n();
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (this.p != null) {
                String str = this.e.getAbsolutePath() + " " + e2.getCause();
            }
            return false;
        }
    }

    private FileLock c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileLock) ipChange.ipc$dispatch("8a9d1e7d", new Object[]{this, new Boolean(z)});
        }
        FileChannel fileChannel = this.h;
        FileLock fileLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (fileLock == null) {
                try {
                    fileLock = this.h.tryLock();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (fileLock == null) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (SystemClock.elapsedRealtime() - elapsedRealtime > 10000) {
                    return fileLock;
                }
            }
            return fileLock;
        }
        try {
            return fileChannel.tryLock();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private void b(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a97bf1c", new Object[]{this, mappedByteBuffer, bArr});
        } else if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
        } else {
            if (mappedByteBuffer.position() + bArr.length >= mappedByteBuffer.capacity()) {
                mappedByteBuffer = a(mappedByteBuffer.position() + bArr.length + 1024);
            }
            mappedByteBuffer.put(bArr);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        synchronized (this.f17220a) {
            if (this.o.size() > 0) {
                Iterator<SharedPreferences.Editor> it = this.o.iterator();
                while (it.hasNext()) {
                    a(it.next(), this.f17220a, true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r12.p == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r12.e == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        r12.e.getAbsolutePath();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(byte[] r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.util.f.b(byte[], boolean):boolean");
    }

    private Pair<byte[], Integer> a(byte[] bArr, int i) throws Exception {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("16945efe", new Object[]{this, bArr, new Integer(i)});
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, i, bArr2, 0, 4);
        int i4 = i + 4;
        if (bArr[i4] != 18 && bArr[i4] != b(bArr2)) {
            throw new Exception("length string's finish mark missing");
        }
        int i5 = i4 + 1;
        int a2 = b.a(bArr2);
        if (a2 < 0 || (i2 = i5 + a2) >= bArr.length || a2 > 2097152) {
            throw new Exception("length string is invalid");
        }
        byte[] bArr3 = null;
        if (a2 == 0) {
            i3 = i5 + 1;
        } else {
            bArr3 = new byte[a2];
            System.arraycopy(bArr, i5, bArr3, 0, a2);
            if (bArr[i2] != 18 && bArr[i2] != b(bArr3)) {
                throw new Exception("Stored bytes' finish mark missing");
            }
            i3 = i2 + 1;
        }
        return new Pair<>(bArr3, Integer.valueOf(i3));
    }

    private byte[] m() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bc9b48e9", new Object[]{this});
        }
        Pair<Integer, byte[][]> d2 = d();
        int intValue = ((Integer) d2.first).intValue() + 10 + ((byte[][]) d2.second).length;
        if (intValue > 2097152) {
            intValue = 2097152;
        }
        byte[] bArr = new byte[intValue];
        byte[] a2 = b.a(intValue);
        System.arraycopy(a2, 0, bArr, 0, a2.length);
        int length = a2.length + 0;
        bArr[length] = b(a2);
        int i = length + 1;
        byte[] a3 = b.a(e());
        System.arraycopy(a3, 0, bArr, i, a3.length);
        int length2 = i + a3.length;
        bArr[length2] = b(a3);
        byte[][] bArr2 = (byte[][]) d2.second;
        int length3 = bArr2.length;
        int i2 = length2 + 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            byte[] bArr3 = bArr2[i3];
            if (bArr3 != null) {
                if (bArr3.length + i2 + 1 <= 2097152) {
                    System.arraycopy(bArr3, 0, bArr, i2, bArr3.length);
                    int length4 = i2 + bArr3.length;
                    bArr[length4] = b(bArr3);
                    i2 = length4 + 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Write too much data in ");
                    File file2 = this.e;
                    sb.append(file2 != null ? file2.getAbsolutePath() : null);
                    Log.e("SharedPreferencesNew", sb.toString());
                    if (this.p != null && (file = this.e) != null) {
                        file.getAbsolutePath();
                    }
                }
            }
            i3++;
        }
        return bArr;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.i == null) {
        } else {
            byte[] bArr = new byte[10];
            byte[] a2 = b.a(0);
            System.arraycopy(a2, 0, bArr, 0, 4);
            bArr[4] = b(a2);
            byte[] a3 = b.a(0);
            System.arraycopy(a3, 0, bArr, 5, 4);
            bArr[9] = b(a3);
            this.i.position(0);
            this.i.put(bArr);
        }
    }

    private int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{this, obj})).intValue();
        }
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof Boolean) {
            return 4;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        return obj instanceof Long ? 3 : 0;
    }

    private Object b(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e86690ff", new Object[]{this, bArr, new Integer(i)});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            if (i == 5) {
                return new String(bArr);
            }
            if (i == 4) {
                if (bArr[0] == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i == 2) {
                return Float.valueOf(a.a(bArr));
            } else {
                if (i == 1) {
                    return Integer.valueOf(b.a(bArr));
                }
                if (i != 3) {
                    return null;
                }
                return Long.valueOf(c.a(bArr));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private byte[] b(Object obj) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1a7ec5f8", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                return ((String) obj).getBytes();
            }
            if (obj instanceof Boolean) {
                byte[] bArr = new byte[1];
                if (!((Boolean) obj).booleanValue()) {
                    i = 0;
                }
                bArr[0] = (byte) i;
                return bArr;
            } else if (obj instanceof Float) {
                return a.a(((Float) obj).floatValue());
            } else {
                if (obj instanceof Integer) {
                    return b.a(((Integer) obj).intValue());
                }
                if (!(obj instanceof Long)) {
                    return null;
                }
                return c.a(((Long) obj).longValue());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void o() {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.global.setting.util.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.String r2 = "631b576"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r10.f     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L23
            r1.createNewFile()     // Catch: java.lang.Throwable -> L4f
        L23:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch: java.lang.Throwable -> L47
            java.nio.channels.FileChannel r3 = r10.h     // Catch: java.lang.Throwable -> L47
            r4 = 0
            java.nio.MappedByteBuffer r1 = r10.i     // Catch: java.lang.Throwable -> L47
            int r1 = r1.capacity()     // Catch: java.lang.Throwable -> L47
            long r6 = (long) r1     // Catch: java.lang.Throwable -> L47
            r8 = r0
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L47
            r10.a(r2)
            r10.a(r0)
            return
        L42:
            r1 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L5c
        L47:
            r1 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L51
        L4c:
            r1 = move-exception
            r2 = r0
            goto L5c
        L4f:
            r1 = move-exception
            r2 = r0
        L51:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5b
            r10.a(r0)
            r10.a(r2)
            return
        L5b:
            r1 = move-exception
        L5c:
            r10.a(r0)
            r10.a(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.util.f.o():void");
    }

    private void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{this, closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private boolean p() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.util.f.p():boolean");
    }

    private byte a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c19671b", new Object[]{this, bArr})).byteValue();
        }
        byte b2 = 0;
        for (byte b3 : bArr) {
            b2 = (byte) (b2 ^ b3);
        }
        return b2;
    }

    private byte b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90ffa25c", new Object[]{this, bArr})).byteValue() : a(bArr);
    }

    /* loaded from: classes7.dex */
    public static abstract class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Object f17228a;

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.f17228a = obj;
            }
        }

        public Object a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f17228a;
        }
    }
}
