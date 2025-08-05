package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes.dex */
public abstract class b implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler f;
    private static final Object g;

    /* renamed from: a  reason: collision with root package name */
    public final String f8179a;
    public final File b;
    public final SharedPreferences c;
    private final int i;
    private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> h = new WeakHashMap<>();
    private final Object j = new Object();
    public Map<String, c> d = new HashMap();
    public boolean e = false;

    public abstract void a();

    public abstract a b();

    public static /* synthetic */ Object a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2c0bb880", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ void a(b bVar, C0313b c0313b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd6b3aa", new Object[]{bVar, c0313b});
        } else {
            bVar.a(c0313b);
        }
    }

    public static /* synthetic */ WeakHashMap b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("94d8b8c", new Object[]{bVar}) : bVar.h;
    }

    static {
        kge.a(1526032583);
        kge.a(1991704957);
        f = new Handler(Looper.getMainLooper());
        g = new Object();
    }

    public b(Context context, String str, SharedPreferences sharedPreferences, int i) {
        this.f8179a = str;
        this.b = a(context, str);
        this.c = sharedPreferences;
        this.i = i;
        com.taobao.accs.asp.a.a(new Runnable() { // from class: com.taobao.accs.asp.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (b.a(b.this)) {
                    b.this.a();
                    b.a(b.this).notifyAll();
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (!this.e) {
            try {
                this.j.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    private File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{this, context, str});
        }
        File file = new File(context.getFilesDir(), "shared_prefs");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str + ".lock");
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        synchronized (this.j) {
            c();
            hashMap = new HashMap();
            for (Map.Entry<String, c> entry : this.d.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().f8186a);
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            str3 = cVar != null ? (String) cVar.f8186a : null;
            if (str3 == null) {
                str3 = str2;
            }
        }
        return str3;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            set2 = cVar != null ? (Set) cVar.f8186a : null;
            if (set2 == null) {
                set2 = set;
            }
        }
        return set2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            Integer num = null;
            if (cVar != null) {
                num = (Integer) cVar.f8186a;
            }
            if (num != null) {
                i = num.intValue();
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
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            Long l = null;
            if (cVar != null) {
                l = (Long) cVar.f8186a;
            }
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f2)})).floatValue();
        }
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            Float f3 = null;
            if (cVar != null) {
                f3 = (Float) cVar.f8186a;
            }
            if (f3 != null) {
                f2 = f3.floatValue();
            }
        }
        return f2;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        synchronized (this.j) {
            c();
            c cVar = this.d.get(str);
            Boolean bool = null;
            if (cVar != null) {
                bool = (Boolean) cVar.f8186a;
            }
            if (bool != null) {
                z = bool.booleanValue();
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
        synchronized (this.j) {
            c();
            containsKey = this.d.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        synchronized (this.j) {
            c();
        }
        return b();
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.j) {
            this.h.put(onSharedPreferenceChangeListener, g);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.j) {
            this.h.remove(onSharedPreferenceChangeListener);
        }
    }

    /* loaded from: classes.dex */
    public abstract class a implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Object b = new Object();
        private Bundle c = new Bundle();
        private boolean d = false;

        static {
            kge.a(-307947589);
            kge.a(1666853524);
        }

        public abstract void a(C0313b c0313b);

        public a() {
        }

        public static /* synthetic */ Bundle a(a aVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("8431b923", new Object[]{aVar, bundle});
            }
            aVar.c = bundle;
            return bundle;
        }

        public static /* synthetic */ C0313b a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0313b) ipChange.ipc$dispatch("af92d05b", new Object[]{aVar, new Long(j)}) : aVar.a(j);
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ededa0e3", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.d = z;
            return z;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this.b) {
                this.c.putString(str, str2);
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
                this.c.putStringArrayList(str, set == null ? null : new ArrayList<>(set));
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
                this.c.putInt(str, i);
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
                this.c.putLong(str, j);
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
                this.c.putFloat(str, f);
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
                this.c.putBoolean(str, z);
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
                this.c.putParcelable(str, null);
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
                this.d = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            a();
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                a();
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final C0313b a2 = a(SystemClock.elapsedRealtimeNanos());
            if (a2.c) {
                com.taobao.accs.asp.a.c(new Runnable() { // from class: com.taobao.accs.asp.b.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.this.a(a2);
                        }
                    }
                });
            }
            b.a(b.this, a2);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[Catch: all -> 0x0128, TryCatch #1 {, blocks: (B:8:0x0028, B:14:0x003a, B:16:0x0053, B:17:0x0055, B:55:0x0126, B:18:0x0056, B:20:0x005a, B:22:0x0064, B:24:0x006e, B:25:0x0078, B:27:0x007e, B:29:0x008e, B:30:0x0096, B:32:0x00a2, B:35:0x00aa, B:37:0x00b4, B:48:0x00ee, B:38:0x00bc, B:40:0x00c6, B:42:0x00d4, B:46:0x00de, B:50:0x00f5, B:52:0x0103, B:53:0x011d, B:54:0x0125), top: B:63:0x0028 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.taobao.accs.asp.b.C0313b a(long r17) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.asp.b.a.a(long):com.taobao.accs.asp.b$b");
        }
    }

    public void a(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db24d1a2", new Object[]{this, modifiedRecord});
            return;
        }
        synchronized (this.j) {
            c();
        }
        final a b = b();
        a.a(b, modifiedRecord.modified);
        a.a(b, modifiedRecord.isClear);
        final C0313b a2 = a.a(b, modifiedRecord.timestampVersion);
        if (a2.c && this.i == 0) {
            com.taobao.accs.asp.a.c(new Runnable() { // from class: com.taobao.accs.asp.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(a2);
                    }
                }
            });
        }
        a(a2);
    }

    private void a(C0313b c0313b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730818f4", new Object[]{this, c0313b});
        } else if (c0313b.b != null && c0313b.c && c0313b.f8185a != null && c0313b.f8185a.size() != 0) {
            for (int size = c0313b.f8185a.size() - 1; size >= 0; size--) {
                final String str = c0313b.f8185a.get(size);
                for (final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : c0313b.b) {
                    if (onSharedPreferenceChangeListener != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                        } else {
                            f.post(new Runnable() { // from class: com.taobao.accs.asp.b.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        onSharedPreferenceChangeListener.onSharedPreferenceChanged(b.this, str);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.taobao.accs.asp.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0313b {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f8185a;
        public final Set<SharedPreferences.OnSharedPreferenceChangeListener> b;
        public boolean c;
        public ModifiedRecord d;

        static {
            kge.a(1779181298);
        }

        private C0313b(boolean z, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set) {
            this.c = z;
            this.f8185a = list;
            this.b = set;
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f8186a;
        public long b;

        static {
            kge.a(1040210045);
        }

        public c(Object obj) {
            this.f8186a = obj;
        }

        public c(Object obj, long j) {
            this.f8186a = obj;
            this.b = j;
        }
    }
}
