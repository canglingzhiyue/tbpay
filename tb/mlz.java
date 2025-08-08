package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.mly;

/* loaded from: classes.dex */
public class mlz implements mly {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FROM_AREA = "from";
    public static final String SP_NAME = "MetricKitDomainStorage";
    public static final String SP_NAME_PREFIX = "MetricKitData_";
    public static final String SP_TO_AREA = "to";
    private static volatile SharedPreferences c = null;
    private static boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    private final String f31102a;
    private final Application b;
    private final mlv d;

    @Override // tb.mly
    public /* synthetic */ void b(String str) {
        mly.CC.$default$b(this, str);
    }

    @Override // tb.mly
    public /* synthetic */ void c(String str) {
        mly.CC.$default$c(this, str);
    }

    public static /* synthetic */ mlv a(mlz mlzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mlv) ipChange.ipc$dispatch("bcc46dd2", new Object[]{mlzVar}) : mlzVar.d;
    }

    public static /* synthetic */ String b(mlz mlzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5af37a2", new Object[]{mlzVar}) : mlzVar.f31102a;
    }

    public mlz(Application application, String str) {
        this(application, str, new mlv(application));
    }

    public mlz(Application application, String str, mlv mlvVar) {
        this.f31102a = str + "^";
        this.b = application;
        this.d = mlvVar;
        if (!e) {
            synchronized (mlz.class) {
                if (!e) {
                    a((Context) application).edit().clear().putLong(mly.VALID_STORAGE_LAUNCH_SESSION, LAUNCH_SESSION).putString(mly.VALID_STORAGE_DATE, SIMPLE_DATE_FORMAT.format(new Date())).putInt(mly.VALID_STORAGE_PID, Process.myPid()).apply();
                    e = true;
                }
            }
        }
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (c == null) {
            synchronized (mlz.class) {
                if (c == null) {
                    c = context.getSharedPreferences(SP_NAME, 0);
                }
            }
        }
        return c;
    }

    public static long a(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75c56f6b", new Object[]{application})).longValue() : a((Context) application).getLong(mly.VALID_STORAGE_LAUNCH_SESSION, -1L);
    }

    public static int b(Application application) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76721b09", new Object[]{application})).intValue() : a((Context) application).getInt(mly.VALID_STORAGE_PID, 0);
    }

    @Override // tb.mly
    public mly.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mly.a) ipChange.ipc$dispatch("30244585", new Object[]{this}) : new mly.a() { // from class: tb.mlz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mly.a
            public /* synthetic */ mly.a a(Map<String, ?> map) {
                return mly.a.CC.$default$a(this, map);
            }

            @Override // tb.mly.a
            public /* synthetic */ mly.a b(String str, String str2) {
                return mly.a.CC.$default$b(this, str, str2);
            }

            @Override // tb.mly.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    mlz.a(mlz.this).a();
                }
            }

            @Override // tb.mly.a
            public boolean b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : mlz.a(mlz.this).b();
            }

            @Override // tb.mly.a
            public mly.a a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("3a4f87b3", new Object[]{this, str, str2});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.a(mlz.b(mlz.this) + str, str2);
                return this;
            }

            @Override // tb.mly.a
            public mly.a a(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("52211b0d", new Object[]{this, str, new Boolean(z)});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.a(mlz.b(mlz.this) + str, z);
                return this;
            }

            @Override // tb.mly.a
            public mly.a a(String str, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("cf551fbe", new Object[]{this, str, new Integer(i)});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.a(mlz.b(mlz.this) + str, i);
                return this;
            }

            @Override // tb.mly.a
            public mly.a a(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("d706c51d", new Object[]{this, str, new Long(j)});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.a(mlz.b(mlz.this) + str, j);
                return this;
            }

            @Override // tb.mly.a
            public mly.a a(String str, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("b8402fa1", new Object[]{this, str, new Float(f)});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.a(mlz.b(mlz.this) + str, f);
                return this;
            }

            @Override // tb.mly.a
            public mly.a a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("29ccf5bd", new Object[]{this, str});
                }
                a(str, mlz.this.a(str, 0) + 1);
                return this;
            }

            @Override // tb.mly.a
            public mly.a b(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("54de811e", new Object[]{this, str, new Long(j)});
                }
                a(str, mlz.this.a(str, 0L) + j);
                return this;
            }

            @Override // tb.mly.a
            public mly.a c(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (mly.a) ipChange2.ipc$dispatch("1da2d3f1", new Object[]{this, str, str2});
                }
                mlz.this.b(str);
                mlv a2 = mlz.a(mlz.this);
                a2.c(mlz.b(mlz.this) + str, str2);
                return this;
            }
        };
    }

    @Override // tb.mly
    public mly a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly) ipChange.ipc$dispatch("7c727e9a", new Object[]{this, str});
        }
        b(str);
        Application application = this.b;
        return new mlz(application, this.f31102a + str, this.d);
    }

    @Override // tb.mly
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        b(str);
        SharedPreferences a2 = a((Context) this.b);
        return a2.getString(this.f31102a + str, str2);
    }

    @Override // tb.mly
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        b(str);
        SharedPreferences a2 = a((Context) this.b);
        return a2.getInt(this.f31102a + str, i);
    }

    @Override // tb.mly
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        b(str);
        SharedPreferences a2 = a((Context) this.b);
        return a2.getLong(this.f31102a + str, j);
    }

    @Override // tb.mly
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue();
        }
        b(str);
        SharedPreferences a2 = a((Context) this.b);
        return a2.getFloat(this.f31102a + str, f);
    }

    @Override // tb.mly
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        Map<String, ?> all = a((Context) this.b).getAll();
        if (all == null || all.size() == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (String str : all.keySet()) {
            if (!StringUtils.isEmpty(str) && str.startsWith(this.f31102a)) {
                String[] split = str.substring(this.f31102a.length()).split(mly.UNESCAPED_SEPARATOR);
                if (split.length > 0) {
                    hashSet.add(split[0]);
                }
            }
        }
        return hashSet;
    }
}
