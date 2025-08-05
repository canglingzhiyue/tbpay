package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.jvh;
import tb.tcp;

/* loaded from: classes4.dex */
public class jvh implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final tcp f29813a;
    public final SharedPreferences b;

    static {
        kge.a(-395056290);
        kge.a(1991704957);
    }

    public static /* synthetic */ String lambda$3oQMgnlACp6OQdCSRLV85lHVFS0(jvh jvhVar, String str, String str2) {
        return jvhVar.a(str, str2);
    }

    public static /* synthetic */ Map lambda$5nHfluaFmQlZ5wD7EbJ6OtsaXUU(jvh jvhVar) {
        return jvhVar.b();
    }

    public static /* synthetic */ Boolean lambda$GQlO4N4TGrtlXjipqu0Ym8Npus8(jvh jvhVar, String str, boolean z) {
        return jvhVar.a(str, z);
    }

    public static /* synthetic */ Long lambda$eaCxLiWC8mGrInM9Ox0DyCczIC8(jvh jvhVar, String str, long j) {
        return jvhVar.a(str, j);
    }

    public static /* synthetic */ Set lambda$ijvIIOMiIuJ1BHEiqx5y9THj2MA(jvh jvhVar, String str, Set set) {
        return jvhVar.a(str, set);
    }

    public static /* synthetic */ Float lambda$jmeC_CXfqNgfX2DTWQOdsznZuhk(jvh jvhVar, String str, float f) {
        return jvhVar.a(str, f);
    }

    /* renamed from: lambda$p--lLNUA9mvcQvXEjgaUhFXCVDk */
    public static /* synthetic */ SharedPreferences.Editor m2455lambda$plLNUA9mvcQvXEjgaUhFXCVDk(jvh jvhVar) {
        return jvhVar.a();
    }

    /* renamed from: lambda$rpMAB3ug5Ypv6GHz9cT-zajiCuo */
    public static /* synthetic */ Boolean m2456lambda$rpMAB3ug5Ypv6GHz9cTzajiCuo(jvh jvhVar, String str) {
        return jvhVar.a(str);
    }

    /* renamed from: lambda$x0aM509d6KTS9hl7sgN-Vczs1O8 */
    public static /* synthetic */ Integer m2457lambda$x0aM509d6KTS9hl7sgNVczs1O8(jvh jvhVar, String str, int i) {
        return jvhVar.a(str, i);
    }

    public jvh(SharedPreferences sharedPreferences, tcp tcpVar) {
        this.b = sharedPreferences;
        this.f29813a = tcpVar;
    }

    public /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b.getAll();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this}) : (Map) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$5nHfluaFmQlZ5wD7EbJ6OtsaXUU
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$5nHfluaFmQlZ5wD7EbJ6OtsaXUU(jvh.this);
            }
        }, "getAll");
    }

    public /* synthetic */ String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : this.b.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public String getString(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2}) : (String) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$3oQMgnlACp6OQdCSRLV85lHVFS0
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$3oQMgnlACp6OQdCSRLV85lHVFS0(jvh.this, str, str2);
            }
        }, "getString");
    }

    public /* synthetic */ Set a(String str, Set set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("ac797c", new Object[]{this, str, set}) : this.b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(final String str, final Set<String> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set}) : (Set) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$ijvIIOMiIuJ1BHEiqx5y9THj2MA
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$ijvIIOMiIuJ1BHEiqx5y9THj2MA(jvh.this, str, set);
            }
        }, "getStringSet");
    }

    public /* synthetic */ Integer a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("ffc489f8", new Object[]{this, str, new Integer(i)}) : Integer.valueOf(this.b.getInt(str, i));
    }

    @Override // android.content.SharedPreferences
    public int getInt(final String str, final int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue() : ((Integer) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$x0aM509d6KTS9hl7sgN-Vczs1O8
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.m2457lambda$x0aM509d6KTS9hl7sgNVczs1O8(jvh.this, str, i);
            }
        }, "getInt")).intValue();
    }

    public /* synthetic */ Long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("ae744a03", new Object[]{this, str, new Long(j)}) : Long.valueOf(this.b.getLong(str, j));
    }

    @Override // android.content.SharedPreferences
    public long getLong(final String str, final long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue() : ((Long) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$eaCxLiWC8mGrInM9Ox0DyCczIC8
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$eaCxLiWC8mGrInM9Ox0DyCczIC8(jvh.this, str, j);
            }
        }, "getLong")).longValue();
    }

    public /* synthetic */ Float a(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("df047a17", new Object[]{this, str, new Float(f)}) : Float.valueOf(this.b.getFloat(str, f));
    }

    @Override // android.content.SharedPreferences
    public float getFloat(final String str, final float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue() : ((Float) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$jmeC_CXfqNgfX2DTWQOdsznZuhk
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$jmeC_CXfqNgfX2DTWQOdsznZuhk(jvh.this, str, f);
            }
        }, "getFloat")).floatValue();
    }

    public /* synthetic */ Boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("2b8449df", new Object[]{this, str, new Boolean(z)}) : Boolean.valueOf(this.b.getBoolean(str, z));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue() : ((Boolean) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$GQlO4N4TGrtlXjipqu0Ym8Npus8
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.lambda$GQlO4N4TGrtlXjipqu0Ym8Npus8(jvh.this, str, z);
            }
        }, "getBoolean")).booleanValue();
    }

    public /* synthetic */ Boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{this, str}) : Boolean.valueOf(this.b.contains(str));
    }

    @Override // android.content.SharedPreferences
    public boolean contains(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue() : ((Boolean) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$rpMAB3ug5Ypv6GHz9cT-zajiCuo
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.m2456lambda$rpMAB3ug5Ypv6GHz9cTzajiCuo(jvh.this, str);
            }
        }, "contains")).booleanValue();
    }

    public /* synthetic */ SharedPreferences.Editor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("7591bd89", new Object[]{this}) : this.b.edit();
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this}) : new a((SharedPreferences.Editor) this.f29813a.a(new tcp.c() { // from class: tb.-$$Lambda$jvh$p--lLNUA9mvcQvXEjgaUhFXCVDk
            @Override // tb.tcp.c
            public final Object call() {
                return jvh.m2455lambda$plLNUA9mvcQvXEjgaUhFXCVDk(jvh.this);
            }
        }, "edit"));
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
        } else {
            this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
        } else {
            this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    /* loaded from: classes4.dex */
    public class a implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final SharedPreferences.Editor f29814a;

        static {
            kge.a(2041106682);
            kge.a(1666853524);
        }

        /* renamed from: lambda$-vQomR9AT9kFNxOncpDuv91ddy4 */
        public static /* synthetic */ Boolean m2458lambda$vQomR9AT9kFNxOncpDuv91ddy4(a aVar) {
            return aVar.b();
        }

        public static /* synthetic */ Boolean lambda$v6xJq0USfEwO61Siq5sFy1Ik8hc(a aVar) {
            return aVar.a();
        }

        public a(SharedPreferences.Editor editor) {
            jvh.this = r1;
            this.f29814a = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            this.f29814a.putString(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            this.f29814a.putStringSet(str, set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            this.f29814a.putInt(str, i);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            this.f29814a.putLong(str, j);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            this.f29814a.putFloat(str, f);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            this.f29814a.putBoolean(str, z);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            this.f29814a.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            this.f29814a.clear();
            return this;
        }

        public /* synthetic */ Boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a5abcd26", new Object[]{this}) : Boolean.valueOf(this.f29814a.commit());
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue() : ((Boolean) jvh.this.f29813a.b(new tcp.c() { // from class: tb.-$$Lambda$jvh$a$-vQomR9AT9kFNxOncpDuv91ddy4
                @Override // tb.tcp.c
                public final Object call() {
                    return jvh.a.m2458lambda$vQomR9AT9kFNxOncpDuv91ddy4(jvh.a.this);
                }
            }, "commit")).booleanValue();
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                jvh.this.f29813a.b(new tcp.c() { // from class: tb.-$$Lambda$jvh$a$v6xJq0USfEwO61Siq5sFy1Ik8hc
                    @Override // tb.tcp.c
                    public final Object call() {
                        return jvh.a.lambda$v6xJq0USfEwO61Siq5sFy1Ik8hc(jvh.a.this);
                    }
                }, com.taobao.android.weex_framework.util.a.ATOM_apply);
            }
        }

        public /* synthetic */ Boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this});
            }
            this.f29814a.apply();
            return true;
        }
    }
}
