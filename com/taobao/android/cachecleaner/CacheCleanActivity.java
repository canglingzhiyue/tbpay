package com.taobao.android.cachecleaner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.d;
import com.taobao.android.cachecleaner.monitor.config.ManualConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dvq;
import tb.iga;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class CacheCleanActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CacheOverviewInfo A;
    private Map<String, Long> B;
    private View C;
    private boolean D;
    private boolean E;
    private View F;

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f9255a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private View i;
    private View j;
    private View k;
    private AlertDialog.Builder l;
    private Handler m;
    private Handler n;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long x;
    private long y;
    private long z;
    private volatile int o = 0;
    private final AtomicBoolean v = new AtomicBoolean(false);
    private final List<Integer> w = new ArrayList();

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(-45479426);
    }

    public static /* synthetic */ Object ipc$super(CacheCleanActivity cacheCleanActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ long a(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("712a6aff", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.r = j;
        return j;
    }

    public static /* synthetic */ CacheOverviewInfo a(CacheCleanActivity cacheCleanActivity, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("8583e5d", new Object[]{cacheCleanActivity, cacheOverviewInfo});
        }
        cacheCleanActivity.A = cacheOverviewInfo;
        return cacheOverviewInfo;
    }

    public static /* synthetic */ Map a(CacheCleanActivity cacheCleanActivity, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3c334c1", new Object[]{cacheCleanActivity, map});
        }
        cacheCleanActivity.B = map;
        return map;
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3532e6d9", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.b();
        }
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity, DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97ae014", new Object[]{cacheCleanActivity, onClickListener});
        } else {
            cacheCleanActivity.a(onClickListener);
        }
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a9ccc", new Object[]{cacheCleanActivity, bVar});
        } else {
            cacheCleanActivity.a(bVar);
        }
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b76c63", new Object[]{cacheCleanActivity, str});
        } else {
            cacheCleanActivity.a(str);
        }
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity, String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afac301", new Object[]{cacheCleanActivity, str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            cacheCleanActivity.a(str, j, j2, j3);
        }
    }

    public static /* synthetic */ void a(CacheCleanActivity cacheCleanActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dd636d", new Object[]{cacheCleanActivity, str, str2});
        } else {
            cacheCleanActivity.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(CacheCleanActivity cacheCleanActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("712aa71f", new Object[]{cacheCleanActivity, new Boolean(z)})).booleanValue();
        }
        cacheCleanActivity.E = z;
        return z;
    }

    public static /* synthetic */ long b(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe17821e", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.s = j;
        return j;
    }

    public static /* synthetic */ TextView b(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("cad42a4e", new Object[]{cacheCleanActivity}) : cacheCleanActivity.b;
    }

    public static /* synthetic */ boolean b(CacheCleanActivity cacheCleanActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe17be3e", new Object[]{cacheCleanActivity, new Boolean(z)})).booleanValue();
        }
        cacheCleanActivity.D = z;
        return z;
    }

    public static /* synthetic */ long c(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b04993d", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.t = j;
        return j;
    }

    public static /* synthetic */ Handler c(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d1581a0b", new Object[]{cacheCleanActivity}) : cacheCleanActivity.n;
    }

    public static /* synthetic */ long d(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17f1b05c", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.y = j;
        return j;
    }

    public static /* synthetic */ void d(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ef01dc", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.p();
        }
    }

    public static /* synthetic */ long e(CacheCleanActivity cacheCleanActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4dec77b", new Object[]{cacheCleanActivity, new Long(j)})).longValue();
        }
        cacheCleanActivity.z = j;
        return j;
    }

    public static /* synthetic */ void e(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb830add", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.l();
        }
    }

    public static /* synthetic */ AtomicBoolean f(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("5c84d39e", new Object[]{cacheCleanActivity}) : cacheCleanActivity.v;
    }

    public static /* synthetic */ void g(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ab1cdf", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.r();
        }
    }

    public static /* synthetic */ void h(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3f25e0", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.g();
        }
    }

    public static /* synthetic */ void i(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d32ee1", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.i();
        }
    }

    public static /* synthetic */ void j(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876737e2", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.j();
        }
    }

    public static /* synthetic */ void k(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb40e3", new Object[]{cacheCleanActivity});
        } else {
            cacheCleanActivity.k();
        }
    }

    public static /* synthetic */ long l(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d28f49d8", new Object[]{cacheCleanActivity})).longValue() : cacheCleanActivity.r;
    }

    public static /* synthetic */ long m(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f82352d9", new Object[]{cacheCleanActivity})).longValue() : cacheCleanActivity.s;
    }

    public static /* synthetic */ Map n(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("810fa39b", new Object[]{cacheCleanActivity}) : cacheCleanActivity.B;
    }

    public static /* synthetic */ CacheOverviewInfo o(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CacheOverviewInfo) ipChange.ipc$dispatch("8a756719", new Object[]{cacheCleanActivity}) : cacheCleanActivity.A;
    }

    public static /* synthetic */ long p(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68df6ddc", new Object[]{cacheCleanActivity})).longValue() : cacheCleanActivity.y;
    }

    public static /* synthetic */ long q(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e7376dd", new Object[]{cacheCleanActivity})).longValue() : cacheCleanActivity.t;
    }

    public static /* synthetic */ View r(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8d01b1ac", new Object[]{cacheCleanActivity}) : cacheCleanActivity.C;
    }

    public static /* synthetic */ long s(CacheCleanActivity cacheCleanActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d99b88df", new Object[]{cacheCleanActivity})).longValue() : cacheCleanActivity.z;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_cache);
        getSupportActionBar().b(R.string.cache_page_title);
        a();
        this.w.add(0);
        this.w.add(1);
        this.w.add(2);
        this.w.add(3);
        this.w.add(4);
        if (!this.v.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f9255a = (ProgressBar) findViewById(R.id.cache_main_progress);
        this.b = (TextView) findViewById(R.id.cache_main_title);
        this.c = (TextView) findViewById(R.id.cache_main_msg);
        this.e = (TextView) findViewById(R.id.clean_cache_msg);
        this.d = (TextView) findViewById(R.id.clean_cache_btn);
        this.g = (TextView) findViewById(R.id.clean_data_msg);
        this.f = (TextView) findViewById(R.id.clean_data_btn);
        this.h = (TextView) findViewById(R.id.need_msg);
        this.i = findViewById(R.id.clean_cache_load);
        this.j = findViewById(R.id.clean_data_load);
        this.k = findViewById(R.id.need_load);
        this.C = findViewById(R.id.clean_loading);
        this.F = findViewById(R.id.cache_main_sys);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CacheCleanActivity.a(CacheCleanActivity.this, new DialogInterface.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                CacheCleanActivity.a(CacheCleanActivity.this, "cache");
                            }
                        }
                    });
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CacheCleanActivity.a(CacheCleanActivity.this, new DialogInterface.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                CacheCleanActivity.a(CacheCleanActivity.this, "data");
                            }
                        }
                    });
                }
            }
        });
        this.F.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CacheCleanActivity.a(CacheCleanActivity.this);
                }
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.o = 0;
        m();
        this.v.set(true);
        o();
        p();
        f();
        g();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.n = new Handler();
        this.n.post(new Runnable() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f9261a;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f9261a >= 100) {
                } else {
                    CacheCleanActivity cacheCleanActivity = CacheCleanActivity.this;
                    int i = R.string.use_loading;
                    CacheCleanActivity.b(CacheCleanActivity.this).setText(cacheCleanActivity.getString(i, new Object[]{this.f9261a + riy.MOD}));
                    this.f9261a = this.f9261a + 1;
                    CacheCleanActivity.c(CacheCleanActivity.this).postDelayed(this, 100L);
                }
            }
        });
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "startNextStep");
        int indexOf = this.w.indexOf(Integer.valueOf(this.o)) + 1;
        if (indexOf < this.w.size()) {
            this.o = this.w.get(indexOf).intValue();
            n().post(new a(this.o));
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                CacheCleanActivity.d(CacheCleanActivity.this);
                CacheCleanActivity.e(CacheCleanActivity.this);
            }
        });
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f9267a;

        static {
            kge.a(-1182090509);
            kge.a(-1390502639);
        }

        public a(int i) {
            this.f9267a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!CacheCleanActivity.f(CacheCleanActivity.this).get()) {
            } else {
                try {
                    int i = this.f9267a;
                    if (i == 1) {
                        CacheCleanActivity.a(CacheCleanActivity.this, new b() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.a.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.cachecleaner.CacheCleanActivity.b
                            public void a() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    CacheCleanActivity.h(CacheCleanActivity.this);
                                }
                            }
                        });
                    } else if (i == 2) {
                        CacheCleanActivity.i(CacheCleanActivity.this);
                        CacheCleanActivity.h(CacheCleanActivity.this);
                    } else if (i == 3) {
                        CacheCleanActivity.j(CacheCleanActivity.this);
                        CacheCleanActivity.h(CacheCleanActivity.this);
                    } else if (i != 4) {
                    } else {
                        CacheCleanActivity.g(CacheCleanActivity.this);
                        CacheCleanActivity.h(CacheCleanActivity.this);
                    }
                } catch (Exception e) {
                    TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "LoadDataRunnable error.step:" + this.f9267a + "error msg=" + e);
                    CacheCleanActivity.d(CacheCleanActivity.this);
                    CacheCleanActivity.this.runOnUiThread(new Runnable() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                CacheCleanActivity.k(CacheCleanActivity.this);
                            }
                        }
                    });
                    CacheCleanActivity.a(CacheCleanActivity.this, "calculate", e.getMessage());
                }
            }
        }
    }

    private void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ea011b", new Object[]{this, bVar});
            return;
        }
        Context applicationContext = getApplicationContext();
        this.p = dvq.a(applicationContext) << 10;
        this.q = this.p - (dvq.b(applicationContext) << 10);
        if (com.taobao.android.cachecleaner.monitor.config.a.a().h().isEnable()) {
            new iga(applicationContext).a(new iga.a() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iga.a
                public void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("890add93", new Object[]{this, cacheOverviewInfo, map});
                        return;
                    }
                    CacheCleanActivity.a(CacheCleanActivity.this, cacheOverviewInfo.getTotalUsedSize() << 10);
                    CacheCleanActivity.a(CacheCleanActivity.this, cacheOverviewInfo);
                    CacheCleanActivity.a(CacheCleanActivity.this, map);
                    TLog.loge(CacheCleaner.MODULE, "startCheckSystem success", "mAppSize = " + CacheCleanActivity.l(CacheCleanActivity.this));
                    bVar.a();
                }
            });
            return;
        }
        this.r = d.c(applicationContext);
        bVar.a();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ManualConfig h = com.taobao.android.cachecleaner.monitor.config.a.a().h();
        if (h.isEnable()) {
            if (d.a(getApplicationContext(), h.getSilenceTime())) {
                TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "startCheckCacheSize: in silence time.");
                this.D = false;
                this.s = 0L;
                return;
            }
            this.s = d.a(h.getCacheListV2(), this.B) << 10;
            return;
        }
        this.s = d.a(getApplicationContext());
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ManualConfig h = com.taobao.android.cachecleaner.monitor.config.a.a().h();
        if (h.isEnable()) {
            if (d.c(getApplicationContext(), h.getSilenceTime())) {
                TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "startCheckDataSize: in silence time.");
                this.E = false;
                this.s = 0L;
                return;
            }
            this.t = d.a(h.getDataListV2(), this.B) << 10;
            return;
        }
        this.t = d.d(getApplicationContext());
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        long j = this.r;
        long j2 = this.s;
        long j3 = this.t;
        this.u = (j - j2) - j3;
        this.x = j;
        this.z = j;
        a("calculate", j, this.p, this.q, j2, j3, this.u);
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.C.setVisibility(0);
        n().post(new Runnable() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public long b = 0;

            /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00b9 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:6:0x0012, B:22:0x0048, B:24:0x0054, B:26:0x00a0, B:27:0x00b5, B:25:0x008b, B:28:0x00b9, B:30:0x00c5, B:32:0x0113, B:31:0x00fe, B:11:0x002c, B:14:0x0035), top: B:42:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 398
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.CacheCleanActivity.AnonymousClass7.run():void");
            }
        });
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.b.setText(R.string.error_loading);
        this.c.setText(R.string.error_loading_msg);
        this.e.setText(R.string.empty_size);
        this.e.setVisibility(0);
        this.d.setEnabled(false);
        this.d.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        this.i.setVisibility(8);
        this.g.setText(R.string.empty_size);
        this.g.setVisibility(0);
        this.f.setEnabled(false);
        this.f.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        this.j.setVisibility(8);
        this.h.setText(R.string.empty_size);
        this.k.setVisibility(8);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "finishUpdateUi");
        this.C.setVisibility(8);
        this.f9255a.setMax((int) ((this.p / 1024) / 1024));
        this.f9255a.setProgress((int) ((this.r / 1024) / 1024));
        this.f9255a.setSecondaryProgress((int) ((this.q / 1024) / 1024));
        this.b.setText(dvq.a(this.r));
        int i = R.string.use_percent_msg;
        this.c.setText(getString(i, new Object[]{((int) ((((float) this.r) / ((float) this.p)) * 100.0f)) + riy.MOD}));
        long j = this.s;
        if (j > 0) {
            this.e.setText(dvq.a(j));
            this.e.setVisibility(0);
            this.d.setEnabled(true);
        } else {
            this.e.setText(R.string.empty_size);
            this.e.setVisibility(0);
            this.d.setEnabled(false);
            this.d.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        }
        this.d.setVisibility(0);
        this.i.setVisibility(8);
        long j2 = this.t;
        if (j2 > 0) {
            this.g.setText(dvq.a(j2));
            this.g.setVisibility(0);
            this.f.setEnabled(true);
        } else {
            this.g.setText(R.string.empty_size);
            this.g.setVisibility(0);
            this.f.setEnabled(false);
            this.f.setTextColor(getResources().getColor(R.color.btn_clean_disable));
        }
        this.f.setVisibility(0);
        this.j.setVisibility(8);
        long j3 = this.u;
        if (j3 > 0) {
            this.h.setText(dvq.a(j3));
        } else {
            this.h.setText(R.string.empty_size);
        }
        this.h.setVisibility(0);
        this.k.setVisibility(8);
        if (this.q / 1024 >= com.taobao.android.cachecleaner.monitor.config.a.a().h().getLowStorageWeakSys()) {
            return;
        }
        this.F.setVisibility(0);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            a("start", 0L, 0L, 0L, 0L, 0L, 0L);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("user_cache_clean_new_v2");
        uTCustomHitBuilder.setEventPage("cache_manager");
        uTCustomHitBuilder.setProperty("error", str2);
        uTCustomHitBuilder.setProperty("type", String.valueOf(str));
        uTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (com.taobao.android.cachecleaner.monitor.config.a.a().h().isEnable()) {
            uTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private void a(String str, long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396d0832", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("user_cache_clean_calculate_v2");
        uTCustomHitBuilder.setEventPage("cache_manager");
        if (str.equals("calculate")) {
            uTCustomHitBuilder.setProperty("appSize", String.valueOf(j / 1024));
            uTCustomHitBuilder.setProperty("deviceSize", String.valueOf(j2 / 1024));
            uTCustomHitBuilder.setProperty("useSize", String.valueOf(j3 / 1024));
            uTCustomHitBuilder.setProperty("cacheSize", String.valueOf(j4 / 1024));
            uTCustomHitBuilder.setProperty("dataSize", String.valueOf(j5 / 1024));
            uTCustomHitBuilder.setProperty("importantSize", String.valueOf(j6 / 1024));
        }
        uTCustomHitBuilder.setProperty("type", str);
        uTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (com.taobao.android.cachecleaner.monitor.config.a.a().h().isEnable()) {
            uTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private void a(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7099cd2", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("user_cache_clean_new_v2");
        uTCustomHitBuilder.setEventPage("cache_manager");
        uTCustomHitBuilder.setProperty("size", String.valueOf(j / 1024));
        uTCustomHitBuilder.setProperty("remainSize", String.valueOf(j2 / 1024));
        uTCustomHitBuilder.setProperty("startSize", String.valueOf(j3 / 1024));
        uTCustomHitBuilder.setProperty("type", String.valueOf(str));
        uTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        if (com.taobao.android.cachecleaner.monitor.config.a.a().h().isEnable()) {
            uTCustomHitBuilder.setProperty("engine", "quota");
        } else {
            uTCustomHitBuilder.setProperty("engine", "old");
        }
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private void a(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c665", new Object[]{this, onClickListener});
            return;
        }
        this.l = new AlertDialog.Builder(this).setMessage(R.string.clean_dialog_msg).setPositiveButton(R.string.clean_dialog_confirm, onClickListener).setNegativeButton(R.string.clean_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.taobao.android.cachecleaner.CacheCleanActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                }
            }
        });
        this.l.create().show();
    }

    private synchronized Handler n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7c2b1ab1", new Object[]{this});
        }
        Handler handler = this.m;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("[cache_]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.m = handler2;
        return handler2;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            a("all", this.y, this.z, this.x);
            o();
            p();
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "onDestroy error=" + e);
        }
    }

    private synchronized void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.m == null) {
        } else {
            this.m.removeCallbacksAndMessages(null);
            this.m.getLooper().quit();
            this.m = null;
        }
    }

    private synchronized void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.n == null) {
        } else {
            this.n.removeCallbacksAndMessages(null);
            this.n = null;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
            c();
        } catch (Exception e) {
            TLog.loge(CacheCleaner.MODULE, "CacheCleanActivity", "go to sys error -> " + e);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("cache_clean_low_storage_sys");
        uTCustomHitBuilder.setEventPage("cache_manager");
        uTCustomHitBuilder.setProperty("appSize", String.valueOf(this.r / 1024));
        uTCustomHitBuilder.setProperty("deviceSize", String.valueOf(this.p / 1024));
        uTCustomHitBuilder.setProperty("useSize", String.valueOf(this.q / 1024));
        uTCustomHitBuilder.setProperty("cacheSessionId", "CacheCleanActivity");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
