package com.network.diagnosis.product;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.network.diagnosis.toolchain.InternalDetectActivity;
import com.network.diagnosis.toolchain.WVNetworkDiagnosisPlugin;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import tb.dck;
import tb.fne;

/* loaded from: classes4.dex */
public class NetworkDiagnosisV2Activity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler A;
    private Context B;
    private TBCircularProgressDrawable D;
    private TBCircularProgressDrawable E;
    private TBCircularProgressDrawable F;
    private TBCircularProgressDrawable G;
    private TBCircularProgressDrawable H;
    private ImageButton I;
    private ImageButton J;
    private LinearLayout b;
    private TextView c;
    private ArcProgressBar d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private Button o;
    private Button p;
    private LinearLayout q;
    private TextView r;
    private ContentView s;
    private Button t;
    private Handler z;

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f8048a = new ArrayList();
    private final AtomicBoolean u = new AtomicBoolean(false);
    private volatile int v = 0;
    private volatile int w = -1;
    private int x = 0;
    private final AtomicBoolean y = new AtomicBoolean(false);
    private volatile String C = null;
    private boolean K = false;

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8068a;

        public a(int i) {
            this.f8068a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!NetworkDiagnosisV2Activity.a(NetworkDiagnosisV2Activity.this).get()) {
            } else {
                try {
                    int i = this.f8068a;
                    if (i == 1) {
                        NetworkDiagnosisV2Activity.b(NetworkDiagnosisV2Activity.this);
                    } else if (i == 2) {
                        NetworkDiagnosisV2Activity.c(NetworkDiagnosisV2Activity.this);
                    } else if (i == 3) {
                        NetworkDiagnosisV2Activity.d(NetworkDiagnosisV2Activity.this);
                    } else if (i == 4) {
                        NetworkDiagnosisV2Activity.e(NetworkDiagnosisV2Activity.this);
                    } else if (i != 5) {
                    } else {
                        NetworkDiagnosisV2Activity.f(NetworkDiagnosisV2Activity.this);
                    }
                } catch (Exception unused) {
                    ALog.e("NetworkDiagnosisV2", "DiagnosisRunnable error.", NetworkDiagnosisV2Activity.g(NetworkDiagnosisV2Activity.this), "step", Integer.valueOf(this.f8068a));
                    NetworkDiagnosisV2Activity.h(NetworkDiagnosisV2Activity.this);
                    NetworkDiagnosisV2Activity.a(NetworkDiagnosisV2Activity.this, false, 6, "runtime error");
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, String str, Object... objArr) {
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

    public static /* synthetic */ int A(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("863df2af", new Object[]{networkDiagnosisV2Activity})).intValue() : networkDiagnosisV2Activity.v;
    }

    public static /* synthetic */ AtomicBoolean a(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("1fe89d1c", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.u;
    }

    public static /* synthetic */ void a(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da153a7", new Object[]{networkDiagnosisV2Activity, new Integer(i)});
        } else {
            networkDiagnosisV2Activity.a(i);
        }
    }

    public static /* synthetic */ void a(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c620b95", new Object[]{networkDiagnosisV2Activity, new Boolean(z), new Integer(i), str});
        } else {
            networkDiagnosisV2Activity.a(z, i, str);
        }
    }

    public static /* synthetic */ int b(NetworkDiagnosisV2Activity networkDiagnosisV2Activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c025779", new Object[]{networkDiagnosisV2Activity, new Integer(i)})).intValue();
        }
        networkDiagnosisV2Activity.x = i;
        return i;
    }

    public static /* synthetic */ void b(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbdff1d", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.e();
        }
    }

    public static /* synthetic */ void c(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4d835e", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.f();
        }
    }

    public static /* synthetic */ void d(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dd079f", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.g();
        }
    }

    public static /* synthetic */ void e(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66c8be0", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.h();
        }
    }

    public static /* synthetic */ void f(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fc1021", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.i();
        }
    }

    public static /* synthetic */ String g(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99a1707e", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.C;
    }

    public static /* synthetic */ void h(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11b18a3", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.l();
        }
    }

    public static /* synthetic */ TBCircularProgressDrawable i(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("46525e2a", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.D;
    }

    public static /* synthetic */ ImageView j(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("b3d0820b", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.e;
    }

    public static /* synthetic */ ImageView k(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("162b98ea", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.j;
    }

    public static /* synthetic */ int l(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f59299a", new Object[]{networkDiagnosisV2Activity})).intValue() : networkDiagnosisV2Activity.x;
    }

    public static /* synthetic */ ArcProgressBar m(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArcProgressBar) ipChange.ipc$dispatch("64278b9c", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.d;
    }

    public static /* synthetic */ void n(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56783229", new Object[]{networkDiagnosisV2Activity});
        } else {
            networkDiagnosisV2Activity.m();
        }
    }

    public static /* synthetic */ TBCircularProgressDrawable o(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("e06dfab0", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.G;
    }

    public static /* synthetic */ ImageView p(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("1f30b45", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.h;
    }

    public static /* synthetic */ ImageView q(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("644e2224", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.m;
    }

    public static /* synthetic */ TBCircularProgressDrawable r(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("2d7bc8f3", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.F;
    }

    public static /* synthetic */ ImageView s(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("29044fe2", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.g;
    }

    public static /* synthetic */ ImageView t(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("8b5f66c1", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.l;
    }

    public static /* synthetic */ TBCircularProgressDrawable u(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("7a899736", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.E;
    }

    public static /* synthetic */ ImageView v(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("5015947f", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.f;
    }

    public static /* synthetic */ ImageView w(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("b270ab5e", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.k;
    }

    public static /* synthetic */ TBCircularProgressDrawable x(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("c7976579", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.H;
    }

    public static /* synthetic */ ImageView y(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("7726d91c", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.i;
    }

    public static /* synthetic */ ImageView z(NetworkDiagnosisV2Activity networkDiagnosisV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("d981effb", new Object[]{networkDiagnosisV2Activity}) : networkDiagnosisV2Activity.n;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.network_diagnosis_v2);
        String dataString = getIntent().getDataString();
        this.K = !TextUtils.isEmpty(dataString) && dataString.contains("diagnosis_page_mode=half");
        this.B = this;
        this.b = (LinearLayout) findViewById(R.id.layout_diagnosis);
        this.I = (ImageButton) findViewById(R.id.nd_close_button_in_check);
        this.c = (TextView) findViewById(R.id.nd_title);
        this.d = (ArcProgressBar) findViewById(R.id.nd_progress);
        this.e = (ImageView) findViewById(R.id.connection_status);
        this.f = (ImageView) findViewById(R.id.signal_status);
        this.g = (ImageView) findViewById(R.id.proxy_status);
        this.h = (ImageView) findViewById(R.id.permission_status);
        this.i = (ImageView) findViewById(R.id.server_status);
        int parseColor = Color.parseColor("#CCCCCC");
        this.D = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.E = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.F = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.G = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.H = new TBCircularProgressDrawable(parseColor, 5.0f, true);
        this.e.setImageDrawable(this.D);
        this.f.setImageDrawable(this.E);
        this.g.setImageDrawable(this.F);
        this.h.setImageDrawable(this.G);
        this.i.setImageDrawable(this.H);
        this.j = (ImageView) findViewById(R.id.connection_result);
        this.k = (ImageView) findViewById(R.id.signal_result);
        this.l = (ImageView) findViewById(R.id.proxy_result);
        this.m = (ImageView) findViewById(R.id.permission_result);
        this.n = (ImageView) findViewById(R.id.server_result);
        this.o = (Button) findViewById(R.id.btn_start);
        this.q = (LinearLayout) findViewById(R.id.layout_diagnosis_result);
        this.J = (ImageButton) findViewById(R.id.nd_close_button_in_result);
        this.r = (TextView) findViewById(R.id.nd_result_title);
        this.s = (ContentView) findViewById(R.id.nd_result_content);
        this.t = (Button) findViewById(R.id.btn_result);
        this.b.setVisibility(0);
        this.q.setVisibility(8);
        this.d.reset();
        this.p = (Button) findViewById(R.id.btn_internal_detect);
        if (WVNetworkDiagnosisPlugin.isEnableInternalDetect()) {
            this.p.setVisibility(0);
        }
        if (this.K) {
            getSupportActionBar().e();
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.d.setDiameter(130);
            this.d.setBgArcWidth(5);
            this.d.setProgressWidth(5);
            this.d.setDialWidth(3);
            this.d.setDialIntervalWidth(7);
            this.d.updateView();
        } else {
            getSupportActionBar().a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14011));
            getSupportActionBar().b(getResources().getDrawable(R.color.nd_white));
            this.I.setVisibility(8);
            this.J.setVisibility(8);
        }
        this.f8048a.add(0);
        this.f8048a.add(1);
        this.f8048a.add(2);
        this.f8048a.add(3);
        this.f8048a.add(4);
        this.f8048a.add(5);
        this.A = new Handler(Looper.getMainLooper());
        if (!this.u.compareAndSet(false, true)) {
            return;
        }
        j();
    }

    public void startOnclickListener(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e61470", new Object[]{this, view});
        } else if (view.getId() == R.id.btn_start) {
            if (this.u.compareAndSet(false, true)) {
                j();
            } else {
                k();
            }
        } else if (view.getId() == R.id.btn_result) {
            a();
        } else if (view.getId() == R.id.btn_internal_detect) {
            startActivity(new Intent(this, InternalDetectActivity.class));
        } else if (view.getId() != R.id.nd_close_button_in_check && view.getId() != R.id.nd_close_button_in_result) {
        } else {
            finish();
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d.setCurrentValues(100.0f);
        this.u.set(false);
        this.w = i;
        String str = this.C;
        Object[] objArr = new Object[4];
        objArr[0] = "result";
        objArr[1] = Boolean.valueOf(i == -1);
        objArr[2] = "code";
        objArr[3] = Integer.valueOf(i);
        ALog.e("NetworkDiagnosisV2", "[showResultTips]", str, objArr);
        this.b.setVisibility(8);
        this.q.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        switch (this.w) {
            case -6:
                this.r.setText(R.string.diagnosis_server_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_server_subtitle), getString(R.string.diagnosis_server_content)));
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_server_btn);
                return;
            case -5:
                this.r.setText(R.string.diagnosis_signal_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_1), getString(R.string.diagnosis_signal_content_1)));
                if (NetworkStatusHelper.getStatus().isWifi()) {
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_2), getString(R.string.diagnosis_signal_content_2)));
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_3), getString(R.string.diagnosis_signal_content_3)));
                    arrayList.add(Pair.create(getString(R.string.diagnosis_signal_subtitle_4), getString(R.string.diagnosis_signal_content_4)));
                }
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_signal_btn);
                return;
            case -4:
                this.r.setText(R.string.diagnosis_proxy_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_proxy_subtitle), getString(R.string.diagnosis_proxy_content)));
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_proxy_btn);
                return;
            case -3:
                this.r.setText(R.string.diagnosis_permission_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_permission_subtitle), getString(R.string.diagnosis_permission_content)));
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_permission_btn);
                return;
            case -2:
                this.r.setText(R.string.diagnosis_error_connection_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_error_connection_subtitle_1), getString(R.string.diagnosis_error_connection_content_1)));
                arrayList.add(Pair.create(getString(R.string.diagnosis_error_connection_subtitle_2), getString(R.string.diagnosis_error_connection_content_2)));
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_error_connection_btn);
                return;
            case -1:
                this.r.setText(R.string.diagnosis_ok_title);
                arrayList.add(Pair.create(getString(R.string.diagnosis_ok_subtitle), getString(R.string.diagnosis_ok_content)));
                this.s.setContent(arrayList);
                this.t.setText(R.string.diagnosis_ok_btn);
                return;
            default:
                return;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        switch (this.w) {
            case -6:
            case -1:
                c();
                return;
            case -5:
            case -4:
                b();
                j();
                return;
            case -3:
            case -2:
                d();
                return;
            default:
                return;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.o.setText(R.string.diagnosis_btn_start);
        this.c.setText(R.string.diagnosis_title_default);
        this.d.reset();
        this.x = 0;
        this.D.stop();
        this.e.setVisibility(8);
        this.E.stop();
        this.f.setVisibility(8);
        this.F.stop();
        this.g.setVisibility(8);
        this.G.stop();
        this.h.setVisibility(8);
        this.H.stop();
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.q.setVisibility(8);
        this.b.setVisibility(0);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.y.get()) {
            if (b.a()) {
                this.y.set(true);
                Toast.makeText(this.B, com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14006), 0).show();
                return;
            }
            Toast.makeText(this.B, com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14036), 0).show();
        } else {
            Toast.makeText(this.B, com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_14016), 0).show();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkDiagnosisV2Activity.i(NetworkDiagnosisV2Activity.this).start();
                NetworkDiagnosisV2Activity.j(NetworkDiagnosisV2Activity.this).setVisibility(0);
                NetworkDiagnosisV2Activity.k(NetworkDiagnosisV2Activity.this).setVisibility(8);
            }
        }, 1);
        boolean isConnected = NetworkStatusHelper.isConnected();
        ALog.e("NetworkDiagnosisV2", "[startCheckConnection]", this.C, "connected", Boolean.valueOf(isConnected));
        if (!isConnected) {
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkDiagnosisV2Activity.a(NetworkDiagnosisV2Activity.this, -2);
                    }
                }
            }, 1);
            a(false, 1, "no network");
            return;
        }
        a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkDiagnosisV2Activity.i(NetworkDiagnosisV2Activity.this).stop();
                NetworkDiagnosisV2Activity.j(NetworkDiagnosisV2Activity.this).setVisibility(8);
                NetworkDiagnosisV2Activity.k(NetworkDiagnosisV2Activity.this).setVisibility(0);
                NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
                NetworkDiagnosisV2Activity.b(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.l(networkDiagnosisV2Activity) + 20);
                NetworkDiagnosisV2Activity.m(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.l(NetworkDiagnosisV2Activity.this));
                NetworkDiagnosisV2Activity.n(NetworkDiagnosisV2Activity.this);
            }
        }, 1);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkDiagnosisV2Activity.o(NetworkDiagnosisV2Activity.this).start();
                NetworkDiagnosisV2Activity.p(NetworkDiagnosisV2Activity.this).setVisibility(0);
                NetworkDiagnosisV2Activity.q(NetworkDiagnosisV2Activity.this).setVisibility(8);
            }
        }, 2);
        boolean z = checkCallingOrSelfPermission("android.permission.INTERNET") == 0;
        ALog.e("NetworkDiagnosisV2", "[startCheckPermission]", this.C, "hasPermission", Boolean.valueOf(z));
        if (!z) {
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
            a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkDiagnosisV2Activity.a(NetworkDiagnosisV2Activity.this, -3);
                    }
                }
            }, 2);
            a(false, 2, "app forbidden network");
            return;
        }
        a(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NetworkDiagnosisV2Activity.o(NetworkDiagnosisV2Activity.this).stop();
                NetworkDiagnosisV2Activity.p(NetworkDiagnosisV2Activity.this).setVisibility(8);
                NetworkDiagnosisV2Activity.q(NetworkDiagnosisV2Activity.this).setVisibility(0);
                NetworkDiagnosisV2Activity networkDiagnosisV2Activity = NetworkDiagnosisV2Activity.this;
                NetworkDiagnosisV2Activity.b(networkDiagnosisV2Activity, NetworkDiagnosisV2Activity.l(networkDiagnosisV2Activity) + 20);
                NetworkDiagnosisV2Activity.m(NetworkDiagnosisV2Activity.this).setCurrentValues(NetworkDiagnosisV2Activity.l(NetworkDiagnosisV2Activity.this));
                NetworkDiagnosisV2Activity.n(NetworkDiagnosisV2Activity.this);
            }
        }, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "5c0f96e"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$17 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$17
            r0.<init>()
            r1 = 3
            r9.a(r0, r1)
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Exception -> L20
        L20:
            boolean r0 = anet.channel.status.NetworkStatusHelper.isProxy()
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            goto L52
        L28:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 < r4) goto L51
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r9.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network[] r4 = r0.getAllNetworks()
            int r5 = r4.length
            r6 = 0
        L3c:
            if (r6 >= r5) goto L51
            r7 = r4[r6]
            android.net.NetworkCapabilities r7 = r0.getNetworkCapabilities(r7)
            if (r7 == 0) goto L4e
            r8 = 4
            boolean r7 = r7.hasTransport(r8)
            if (r7 == 0) goto L4e
            goto L26
        L4e:
            int r6 = r6 + 1
            goto L3c
        L51:
            r0 = 0
        L52:
            java.lang.String r4 = r9.C
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "hasProxy"
            r5[r2] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r5[r3] = r6
            java.lang.String r3 = "NetworkDiagnosisV2"
            java.lang.String r6 = "[startCheckProxy]"
            anet.channel.util.ALog.e(r3, r6, r4, r5)
            if (r0 == 0) goto L79
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$18 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$18
            r0.<init>()
            r9.a(r0, r1)
            java.lang.String r0 = "using proxy"
            r9.a(r2, r1, r0)
            return
        L79:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$19 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$19
            r0.<init>()
            r9.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.g():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r5.e() < 3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r17 = this;
            r0 = r17
            com.android.alibaba.ip.runtime.IpChange r1 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r0
            java.lang.String r3 = "5cf10ef"
            r1.ipc$dispatch(r3, r2)
            return
        L14:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$2 r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$2
            r1.<init>()
            r2 = 4
            r0.a(r1, r2)
            org.android.netutil.PingTask r1 = new org.android.netutil.PingTask
            r7 = 1000(0x3e8, float:1.401E-42)
            r9 = 0
            r10 = 0
            r8 = 3
            java.lang.String r6 = "223.5.5.5"
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            java.util.concurrent.Future r1 = r1.launch()
            r5 = 0
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L36
            org.android.netutil.PingResponse r1 = (org.android.netutil.PingResponse) r1     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
            r1 = r5
        L37:
            java.lang.String r6 = r0.C
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "v4TaskResponse"
            r8[r4] = r9
            java.lang.String r9 = r0.a(r1)
            r8[r3] = r9
            java.lang.String r9 = "[startCheckSignal]"
            java.lang.String r10 = "NetworkDiagnosisV2"
            anet.channel.util.ALog.e(r10, r9, r6, r8)
            r6 = 3
            if (r1 == 0) goto L59
            int r8 = r1.e()
            if (r8 >= r6) goto L59
        L57:
            r1 = 1
            goto L94
        L59:
            int r8 = anet.channel.util.Inet64Util.getStackType()
            if (r8 != r6) goto L93
            org.android.netutil.PingTask r8 = new org.android.netutil.PingTask
            r13 = 1000(0x3e8, float:1.401E-42)
            r15 = 0
            r16 = 0
            r14 = 3
            java.lang.String r12 = "2400:3200::1"
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.concurrent.Future r8 = r8.launch()
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Exception -> L78
            org.android.netutil.PingResponse r8 = (org.android.netutil.PingResponse) r8     // Catch: java.lang.Exception -> L78
            r5 = r8
        L78:
            java.lang.String r8 = r0.C
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r12 = "v6TaskResponse"
            r11[r4] = r12
            java.lang.String r1 = r0.a(r1)
            r11[r3] = r1
            anet.channel.util.ALog.e(r10, r9, r8, r11)
            if (r5 == 0) goto L93
            int r1 = r5.e()
            if (r1 >= r6) goto L93
            goto L57
        L93:
            r1 = 0
        L94:
            java.lang.String r5 = r0.C
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r7 = "isWeak"
            r6[r4] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r6[r3] = r7
            anet.channel.util.ALog.e(r10, r9, r5, r6)
            if (r1 == 0) goto Lb5
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$3 r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$3
            r1.<init>()
            r0.a(r1, r2)
            java.lang.String r1 = "signal weak"
            r0.a(r4, r2, r1)
            return
        Lb5:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$4 r1 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$4
            r1.<init>()
            r0.a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.h():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.network.diagnosis.product.NetworkDiagnosisV2Activity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.String r2 = "5dd2870"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$5 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$5
            r0.<init>()
            r1 = 5
            r8.a(r0, r1)
            r0 = 0
            java.lang.String r4 = "guide-acs.m.taobao.com"
            android.util.Pair r4 = r8.a(r4)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$6 r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$6
            r5.<init>()
            r8.a(r5, r1)
            java.lang.Object r5 = r4.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3b
            java.lang.Object r0 = r4.second
            java.lang.String r0 = (java.lang.String) r0
        L38:
            r4 = r0
            r0 = 0
            goto L77
        L3b:
            java.lang.String r4 = "gw.alicdn.com"
            android.util.Pair r4 = r8.a(r4)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$7 r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$7
            r5.<init>()
            r8.a(r5, r1)
            java.lang.Object r5 = r4.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L58
            java.lang.Object r0 = r4.second
            java.lang.String r0 = (java.lang.String) r0
            goto L38
        L58:
            java.lang.String r4 = "msgacs.m.taobao.com"
            android.util.Pair r4 = r8.a(r4)
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$8 r5 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$8
            r5.<init>()
            r8.a(r5, r1)
            java.lang.Object r5 = r4.first
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L75
            java.lang.Object r0 = r4.second
            java.lang.String r0 = (java.lang.String) r0
            goto L38
        L75:
            r4 = r0
            r0 = 1
        L77:
            java.lang.String r5 = r8.C
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "isAvailable"
            r6[r3] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r6[r2] = r7
            r2 = 2
            java.lang.String r7 = "message"
            r6[r2] = r7
            r2 = 3
            r6[r2] = r4
            java.lang.String r2 = "NetworkDiagnosisV2"
            java.lang.String r7 = "[startCheckServer]"
            anet.channel.util.ALog.e(r2, r7, r5, r6)
            if (r0 != 0) goto La3
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$9 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$9
            r0.<init>()
            r8.a(r0, r1)
            r8.a(r3, r1, r4)
            return
        La3:
            com.network.diagnosis.product.NetworkDiagnosisV2Activity$10 r0 = new com.network.diagnosis.product.NetworkDiagnosisV2Activity$10
            r0.<init>()
            r8.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.network.diagnosis.product.NetworkDiagnosisV2Activity.i():void");
    }

    private Pair<Boolean, String> a(String str) {
        PingResponse pingResponse;
        PingResponse pingResponse2;
        PingResponse pingResponse3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) {
            return Pair.create(true, "ok");
        }
        String ip = connStrategyListByHost.get(0).getIp();
        Future<PingResponse> launch = new PingTask(ip, 1000, 2, 0, 0).launch();
        Future<PingResponse> launch2 = new PingTask(ip, 1000, 2, 1172, 0).launch();
        Future<PingResponse> launch3 = new PingTask(ip, 1000, 2, 1432, 0).launch();
        try {
            pingResponse = launch.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", this.C, "host", str, "pingResponse", a(pingResponse));
        if (pingResponse != null && pingResponse.e() == 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(fne.KEY_OP, (Object) "ping");
            jSONObject.put("host", (Object) str);
            jSONObject.put(c.IP, (Object) ip);
            return Pair.create(false, jSONObject.toString());
        }
        try {
            pingResponse2 = launch2.get();
        } catch (Exception unused2) {
            pingResponse2 = null;
        }
        ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", this.C, "host", str, "mtu1200Response", a(pingResponse2));
        if (pingResponse2 != null && pingResponse2.e() == 0) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(fne.KEY_OP, (Object) "mtu1200");
            jSONObject2.put("host", (Object) str);
            jSONObject2.put(c.IP, (Object) ip);
            return Pair.create(false, jSONObject2.toString());
        }
        try {
            pingResponse3 = launch3.get();
        } catch (Exception unused3) {
            pingResponse3 = null;
        }
        ALog.e("NetworkDiagnosisV2", "[detectTaoBaoServer]", this.C, "host", str, "mtu1460Response", a(pingResponse3));
        if (pingResponse3 != null && pingResponse3.e() == 0) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(fne.KEY_OP, (Object) "mtu1460");
            jSONObject3.put("host", (Object) str);
            jSONObject3.put(c.IP, (Object) ip);
            return Pair.create(false, jSONObject3.toString());
        }
        return Pair.create(true, "ok");
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.C = "nd_" + System.currentTimeMillis();
        ALog.e("NetworkDiagnosisV2", "[startDiagnosis]", this.C, new Object[0]);
        this.c.setText(R.string.diagnosis_title_ing);
        this.o.setText(R.string.diagnosis_btn_cancel);
        this.v = 0;
        this.u.set(true);
        o();
        m();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ALog.e("NetworkDiagnosisV2", "[cancelDiagnosis]", this.C, new Object[0]);
        this.v = 0;
        this.u.set(false);
        b();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ALog.e("NetworkDiagnosisV2", "[finishDiagnosis]", this.C, new Object[0]);
        this.d.setCurrentValues(100.0f);
        a(-1);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        int indexOf = this.f8048a.indexOf(Integer.valueOf(this.v)) + 1;
        if (indexOf < this.f8048a.size()) {
            this.v = this.f8048a.get(indexOf).intValue();
            n().post(new a(this.v));
            return;
        }
        l();
        a(true, 0, "result ok");
    }

    private synchronized Handler n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7c2b1ab1", new Object[]{this});
        }
        Handler handler = this.z;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("[network_diagnosis]");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.z = handler2;
        return handler2;
    }

    private synchronized void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.z == null) {
        } else {
            this.z.removeCallbacksAndMessages(null);
            this.z.getLooper().quit();
            this.z = null;
        }
    }

    private void a(final Runnable runnable, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91bcdd", new Object[]{this, runnable, new Integer(i)});
        } else {
            this.A.post(new Runnable() { // from class: com.network.diagnosis.product.NetworkDiagnosisV2Activity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!NetworkDiagnosisV2Activity.a(NetworkDiagnosisV2Activity.this).get() || NetworkDiagnosisV2Activity.A(NetworkDiagnosisV2Activity.this) != i) {
                    } else {
                        runnable.run();
                    }
                }
            });
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        o();
        Handler handler = this.A;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    private void a(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "TBNetworkDetector";
        alarmObject.modulePoint = "Detection_Success_Rate";
        alarmObject.isSuccess = z;
        if (!z) {
            alarmObject.errorCode = String.valueOf(i);
            alarmObject.errorMsg = str;
        }
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    private String a(PingResponse pingResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("267056f7", new Object[]{this, pingResponse});
        }
        if (pingResponse == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.IP, pingResponse.a());
            jSONObject.put("errCode", Integer.valueOf(pingResponse.c()));
            jSONObject.put("successCnt", Integer.valueOf(pingResponse.e()));
            PingEntry[] d = pingResponse.d();
            JSONArray jSONArray = new JSONArray();
            if (d != null) {
                for (PingEntry pingEntry : d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("hop", (Object) Integer.valueOf(pingEntry.c));
                    jSONObject2.put(dck.COL_SEQ, (Object) Integer.valueOf(pingEntry.b));
                    jSONObject2.put("rtt", (Object) Double.valueOf(pingEntry.f25063a));
                    jSONArray.add(jSONObject2);
                }
            }
            jSONObject.put("results", (Object) jSONArray);
            return jSONObject.toJSONString();
        } catch (Exception unused) {
            ALog.e("NetworkDiagnosisV2", "[toFormatPingResponse]error.", null, new Object[0]);
            return "";
        }
    }
}
