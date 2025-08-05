package tb;

import android.util.Log;
import com.ali.alihadeviceevaluator.network.RemoteDeviceManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aku;

/* loaded from: classes.dex */
public class akr implements RemoteDeviceManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_LAST_TIMESTAMP = "lasttimestamp";
    public static final String K_SCORE = "score";
    public static final String K_SWITCH = "switch";
    public static final String K_VALID_PERIOD = "validperiod";

    /* renamed from: a  reason: collision with root package name */
    public aku.a f25399a;
    private float b = -1.0f;
    private volatile float c = -1.0f;
    private volatile float d = -1.0f;
    private volatile boolean e = false;

    public static /* synthetic */ float a(akr akrVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2641c960", new Object[]{akrVar, new Float(f)})).floatValue();
        }
        akrVar.b = f;
        return f;
    }

    public static /* synthetic */ void a(akr akrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e033a850", new Object[]{akrVar});
        } else {
            akrVar.h();
        }
    }

    public static /* synthetic */ float b(akr akrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ceb6aec1", new Object[]{akrVar})).floatValue() : akrVar.b;
    }

    public static /* synthetic */ float b(akr akrVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81f92ff", new Object[]{akrVar, new Float(f)})).floatValue();
        }
        akrVar.d = f;
        return f;
    }

    public static /* synthetic */ float c(akr akrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd39b542", new Object[]{akrVar})).floatValue() : akrVar.d;
    }

    public static /* synthetic */ void c(akr akrVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fd5cae", new Object[]{akrVar, new Float(f)});
        } else {
            akrVar.c(f);
        }
    }

    public akr a(aku.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (akr) ipChange.ipc$dispatch("5358fdae", new Object[]{this, aVar});
        }
        this.f25399a = aVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f();
        }
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        if (this.d != -1.0f) {
            return this.d;
        }
        if (this.c == -1.0f) {
            return -1.0f;
        }
        return this.c;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!alg.a().contains("score")) {
            return false;
        }
        this.c = alg.a().getFloat("score", 100.0f);
        return true;
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        if (!alg.a().getBoolean("switch", true)) {
            return -3;
        }
        if (f >= 80.0f) {
            return 0;
        }
        if (f >= 20.0f) {
            return 1;
        }
        return f >= 0.0f ? 2 : -2;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        e();
        if (g()) {
            String str = "load ai score from local. score = " + this.c;
            this.d = this.c;
            c(this.d);
            return;
        }
        alf.b.postDelayed(new Runnable() { // from class: tb.akr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    akr.a(akr.this);
                }
            }
        }, 5000L);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!alg.a().contains("score") || !alg.a().contains(K_LAST_TIMESTAMP)) {
            return false;
        }
        return System.currentTimeMillis() < alg.a().getLong(K_LAST_TIMESTAMP, 0L) + alf.a(!alg.a().contains(K_VALID_PERIOD) ? 24L : alg.a().getLong(K_VALID_PERIOD, 0L));
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (g() || this.e) {
        } else {
            new RemoteDeviceManager(this).fetchData(b());
            this.e = true;
        }
    }

    @Override // com.ali.alihadeviceevaluator.network.RemoteDeviceManager.a
    public void b(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        String str = "load ai score from remote. score = " + f;
        this.e = false;
        alf.b.post(new Runnable() { // from class: tb.akr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                float f2 = f;
                if (f2 <= 0.0f || f2 > 100.0f) {
                    return;
                }
                akr.a(akr.this, f2);
                akr akrVar = akr.this;
                akr.b(akrVar, akr.b(akrVar));
                akr akrVar2 = akr.this;
                akr.c(akrVar2, akr.c(akrVar2));
                alg.b().putLong(akr.K_LAST_TIMESTAMP, System.currentTimeMillis());
                alg.b().putFloat("score", f);
                alg.b().commit();
            }
        });
    }

    @Override // com.ali.alihadeviceevaluator.network.RemoteDeviceManager.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Log.e(alf.TAG, "load ai score from remote failed!!!");
        if (this.c != -1.0f) {
            c(this.c);
        } else {
            c(100.0f);
        }
        this.e = false;
    }

    private void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
            return;
        }
        aku.a aVar = this.f25399a;
        if (aVar == null) {
            return;
        }
        aVar.a(a(f), (int) f);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (g()) {
        } else {
            alf.b.postDelayed(new Runnable() { // from class: tb.akr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        akr.a(akr.this);
                    }
                }
            }, 5000L);
        }
    }
}
