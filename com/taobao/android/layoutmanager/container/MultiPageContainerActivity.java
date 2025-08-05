package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.transition.Transition;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.List;
import tb.gwf;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogu;
import tb.ohg;

@PopLayer.PopupAllowedFromFragment
/* loaded from: classes5.dex */
public class MultiPageContainerActivity extends BaseActivity implements com.taobao.android.launcher.bootstrap.tao.ability.c, com.taobao.tao.flexbox.layoutmanager.container.d, IUtActivityNotTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f13169a;
    private static int b;
    private com.taobao.android.layoutmanager.container.containerlifecycle.c c;
    private Boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private Runnable h;
    private boolean i;
    private Handler j = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.layoutmanager.container.MultiPageContainerActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                MultiPageContainerActivity.a(MultiPageContainerActivity.this, true);
            } else if (i != 2) {
            } else {
                MultiPageContainerActivity.a(MultiPageContainerActivity.this).a(false);
            }
        }
    };
    private Intent k;

    static {
        kge.a(1431351285);
        kge.a(-2006007760);
        kge.a(-1864841087);
        kge.a(1698775038);
    }

    public static /* synthetic */ Object ipc$super(MultiPageContainerActivity multiPageContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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

    public static /* synthetic */ com.taobao.android.layoutmanager.container.containerlifecycle.c a(MultiPageContainerActivity multiPageContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.layoutmanager.container.containerlifecycle.c) ipChange.ipc$dispatch("d314b7ab", new Object[]{multiPageContainerActivity}) : multiPageContainerActivity.c;
    }

    public static /* synthetic */ boolean a(MultiPageContainerActivity multiPageContainerActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8228fd4", new Object[]{multiPageContainerActivity, new Boolean(z)})).booleanValue();
        }
        multiPageContainerActivity.f = z;
        return z;
    }

    public static /* synthetic */ void b(MultiPageContainerActivity multiPageContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807c0e3", new Object[]{multiPageContainerActivity});
        } else {
            super.finish();
        }
    }

    public static /* synthetic */ Runnable c(MultiPageContainerActivity multiPageContainerActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("ac8a3c12", new Object[]{multiPageContainerActivity}) : multiPageContainerActivity.h;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f13174a;
        public boolean b;

        static {
            kge.a(720065935);
        }

        private a() {
            this.b = true;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "url : " + this.f13174a + " isFinalUrl:" + this.b;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        boolean f = oec.f();
        ogg.a("MultiPageActivity", "onCreate: " + f);
        if (!f) {
            return;
        }
        this.k = getIntent();
        b();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        super.onCreate(bundle);
        this.g = System.nanoTime();
        ActionBar supportActionBar = getSupportActionBar();
        ogg.a("MultiPageActivity", "onCreate: supportActionBar=" + supportActionBar);
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        gwf.a((Activity) this);
        this.c = new com.taobao.android.layoutmanager.container.containerlifecycle.c(this);
        a a2 = a(false);
        if (!TextUtils.isEmpty(a2.f13174a)) {
            this.c.a(a2.f13174a, null, getIntent().getExtras());
            if (!a2.b) {
                this.j.sendEmptyMessageDelayed(1, f13169a);
            } else {
                this.e = true;
            }
        }
        this.c.a(new e.a() { // from class: com.taobao.android.layoutmanager.container.MultiPageContainerActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.container.e.a
            public void a(int i, com.taobao.tao.flexbox.layoutmanager.container.f fVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6f0cc1fb", new Object[]{this, new Integer(i), fVar});
                } else if (i != 0) {
                } else {
                    MultiPageContainerActivity.this.finishAfterTransition();
                    oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.container.MultiPageContainerActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ogu.g(MultiPageContainerActivity.this);
                            }
                        }
                    });
                }
            }
        });
        setContentView(this.c.c());
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null && !w.f() && Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        if (this instanceof MultiPageTransparentContainerActivity) {
            setTheme(R.style.Theme_OverLayingActionBar);
        } else {
            setTheme(R.style.Theme_AppCompat_Light);
        }
        ab.a((Context) this);
        f13169a = oec.a((Object) ohg.a().a("tnode", "coldLaunchTimeOut", "3000"), 3000);
        b = oec.a((Object) ohg.a().a("tnode", "pauseTimeOut", "300"), 300);
        if (oeb.ae()) {
            return;
        }
        getWindow().requestFeature(12);
        Transition transition = null;
        getWindow().setEnterTransition(transition);
        getWindow().setExitTransition(transition);
        overridePendingTransition(0, 0);
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (this.c.h().isEmpty()) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.container.f fVar = this.c.h().get(0);
            if (!(fVar instanceof com.taobao.android.layoutmanager.container.containerlifecycle.b)) {
                return;
            }
            if (PageRenderIntercept.c(fVar.getUrl(), str) && !oeb.a("refreshFirstPage", false)) {
                return;
            }
            ogg.a("MultiPageActivity", "冷启拉端快速渲染模式, 刷新pageUrl:" + str);
            ((com.taobao.android.layoutmanager.container.containerlifecycle.b) fVar).a("onUrlRefresh", str);
        }
    }

    private void a(int i) {
        ab tNodeEngine;
        aa A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            List<com.taobao.tao.flexbox.layoutmanager.container.f> h = this.c.h();
            int i2 = 0;
            while (true) {
                if (i2 >= h.size()) {
                    i2 = -1;
                    break;
                } else if ((h.get(i2) instanceof com.taobao.android.layoutmanager.container.containerlifecycle.b) && (tNodeEngine = ((com.taobao.android.layoutmanager.container.containerlifecycle.b) h.get(i2)).getTNodeEngine()) != null && (A = tNodeEngine.A()) != null && A.E() == i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0 || i2 >= h.size() - 1 || !oeb.a("popToTargetPage", true)) {
                return;
            }
            ogg.a("MultiPageActivity", "popToTargetPage, index:" + i2 + " size:" + h.size());
            for (int size = h.size() - 1; size > i2; size--) {
                com.taobao.android.layoutmanager.container.containerlifecycle.c cVar = this.c;
                cVar.a(cVar.b(size), false);
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ogg.a("MultiPageActivity", "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent != null && intent.getBooleanExtra(m.EXTRA_POP_TO, false)) {
            ogg.c("MultiPageActivity", "popTo触发onNewIntent, 不需要刷新");
            a(intent.getIntExtra(m.EXTRA_NODE_TARGET, -1));
            return;
        }
        boolean hasMessages = this.j.hasMessages(1);
        this.j.removeCallbacksAndMessages(null);
        if (this.f) {
            this.f = false;
            ogg.a("MultiPageActivity", "冷启拉端onNewIntent超时, 过滤该次url");
        } else if (c()) {
            ogg.a("MultiPageActivity", "冷启拉端重复onNewIntent, 过滤该次url");
        } else {
            a a2 = a(true);
            if (TextUtils.isEmpty(a2.f13174a)) {
                return;
            }
            if (hasMessages) {
                a(a2.f13174a, false);
            } else {
                this.c.a(a2.f13174a, null, getIntent().getExtras());
            }
        }
    }

    private a a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a9c2246b", new Object[]{this, new Boolean(z)});
        }
        boolean d = com.taobao.android.launcher.bootstrap.tao.ability.b.d(getIntent());
        if (this.d == null) {
            this.d = Boolean.valueOf(d);
        }
        a aVar = new a();
        Uri b2 = PageRenderIntercept.b(PageRenderIntercept.a(getIntent()));
        if (b2 != null) {
            String uri = b2.toString();
            boolean c = com.taobao.android.launcher.bootstrap.tao.ability.b.c(getIntent());
            if (d && !c) {
                aVar.b = false;
                aVar.f13174a = PageRenderIntercept.c(b2).toString();
                ogg.a("MultiPageActivity", "buildTargetUriWithItemId: before:" + uri + "  after:" + aVar.f13174a);
            } else {
                aVar.f13174a = uri;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("parsePageUrl, pageUrl:");
            sb.append(aVar.toString());
            sb.append("from ");
            sb.append(z ? "onNewIntent" : i.b.MEASURE_ONCREATE);
            sb.append(" isAfcContext:");
            sb.append(d);
            sb.append(" isAfcContextCallback:");
            sb.append(c);
            ogg.a("MultiPageActivity", sb.toString());
        } else {
            ogg.a("MultiPageActivity", "url is null, onNewIntent " + z);
        }
        return aVar;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ogg.a("MultiPageActivity", "onResume");
        super.onResume();
        if (oeb.bW()) {
            this.j.removeMessages(2);
        }
        this.c.e();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.d;
        return bool != null && bool.booleanValue() && this.e && this.c.h().size() == 1;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ogg.a("MultiPageActivity", "onPause");
        boolean bM = oeb.bM();
        if (!bM) {
            super.onPause();
        }
        boolean isFinishing = isFinishing();
        if (!isFinishing) {
            if (this.j.hasMessages(1)) {
                ogg.a("MultiPageActivity", "因为onNewIntent触发的onPause, 忽略分发");
            } else if (c()) {
                if (oeb.bW()) {
                    if (this.i) {
                        ogg.a("MultiPageActivity", "firstPauseMessageDelay, 非onNewIntent触发的onPause, 分发onPause");
                        this.c.a(isFinishing);
                    } else {
                        this.i = true;
                        ogg.a("MultiPageActivity", "因为onNewIntent触发的onPause, onCreate已经有换链的url, 延迟300ms分发");
                        this.j.sendEmptyMessageDelayed(2, b);
                    }
                } else {
                    ogg.a("MultiPageActivity", "因为onNewIntent触发的onPause, onCreate已经有换链的url, 延迟300ms分发");
                    this.j.sendEmptyMessageDelayed(2, b);
                }
            } else {
                ogg.a("MultiPageActivity", "非onNewIntent触发的onPause, 分发onPause");
                this.c.a(isFinishing);
            }
        } else {
            this.c.a(isFinishing);
            if (isFinishing) {
                this.j.removeCallbacksAndMessages(null);
            }
        }
        if (!bM) {
            return;
        }
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ogg.a("MultiPageActivity", "onStart");
        super.onStart();
        this.c.f();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ogg.a("MultiPageActivity", MessageID.onStop);
        super.onStop();
        if (this.j.hasMessages(2)) {
            this.c.a(false);
        }
        this.j.removeMessages(2);
        this.c.g();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ogg.a("MultiPageActivity", MessageID.onDestroy);
        super.onDestroy();
        this.c.i();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.container.MultiPageContainerActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean[] a2 = MultiPageContainerActivity.a(MultiPageContainerActivity.this).a(true, true);
                    if (a2[0] || a2[1]) {
                        return;
                    }
                    if (!oeb.ae()) {
                        MultiPageContainerActivity.this.disableFinishAnimationOnce();
                    }
                    MultiPageContainerActivity.b(MultiPageContainerActivity.this);
                    if (MultiPageContainerActivity.c(MultiPageContainerActivity.this) == null) {
                        return;
                    }
                    MultiPageContainerActivity.c(MultiPageContainerActivity.this).run();
                }
            }, true);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ab tNodeEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ogg.a("MultiPageActivity", "onActivityResult, requestCode: " + i + " resultCode:" + i2);
        com.taobao.android.layoutmanager.container.containerlifecycle.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        List<com.taobao.tao.flexbox.layoutmanager.container.f> h = cVar.h();
        if (h.size() <= 0 || (tNodeEngine = h.get(h.size() - 1).getTNodeEngine()) == null) {
            return;
        }
        tNodeEngine.a(i, i2, intent);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.d
    public Intent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("d02bf1c8", new Object[]{this}) : this.k;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.h = runnable;
        }
    }
}
