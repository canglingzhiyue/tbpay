package com.taobao.oversea.live;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.ui.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.oversea.live.fragment.EmptyFragment;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import tb.bhc;
import tb.bhd;
import tb.ndl;
import tb.psg;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class TmgLiveHomepageActivity extends CustomBaseActivity implements EmptyFragment.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Fragment f18661a;
    public EmptyFragment b;
    private String c = "";

    public static /* synthetic */ Object ipc$super(TmgLiveHomepageActivity tmgLiveHomepageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ String a(TmgLiveHomepageActivity tmgLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d7b8742", new Object[]{tmgLiveHomepageActivity}) : tmgLiveHomepageActivity.c;
    }

    static {
        AsyncTask.execute($$Lambda$TmgLiveHomepageActivity$njgEvlJZ2ixNrOtMAYRrXT13pWs.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        String str = "init player start: " + SystemClock.uptimeMillis();
        TaobaoMediaPlayer.loadLibrariesOnce(null);
        String str2 = "init player end: " + SystemClock.uptimeMillis();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(null);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        setContentView(R.layout.activity_tmg_live_home_page);
        d();
        c();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        new SystemBarDecorator(this).enableImmersiveStatusBar();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        psg.a(this).b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            psg.a(this).c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ndl.PARAM_SJSD, this.c);
        this.b = new EmptyFragment();
        if (!e()) {
            this.b.setRetryCallback(this);
            getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, this.b).commitAllowingStateLoss();
            f();
            return;
        }
        this.f18661a = Fragment.instantiate(getBaseContext(), "com.taobao.oversea.live.homepage.ContainerFragment", bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, this.f18661a).commitAllowingStateLoss();
    }

    private void d() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (getIntent() == null || (data = getIntent().getData()) == null) {
        } else {
            this.c = data.getQueryParameter(ndl.PARAM_SJSD);
            ndl.f31369a = data.getQueryParameter(ndl.PARAM_POST_SPM);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        g c = c.Companion.a().c();
        return c == null || b.a().j().isEmpty() || (b.a().c("tmgbusiness4androidremote") != null && c.a().contains("tmgbusiness4androidremote"));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            h.a(this).a(com.alibaba.android.split.core.splitinstall.j.a().a(new a(this)).a(true).a(bhd.a(this, "com.taobao.oversea.live.homepage.ContainerFragment").a(new bhc.b<Fragment>() { // from class: com.taobao.oversea.live.TmgLiveHomepageActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("80cf6b4a", new Object[]{this, fragment, bundle});
                        return;
                    }
                    bundle.putString(ndl.PARAM_SJSD, TmgLiveHomepageActivity.a(TmgLiveHomepageActivity.this));
                    TmgLiveHomepageActivity tmgLiveHomepageActivity = TmgLiveHomepageActivity.this;
                    tmgLiveHomepageActivity.f18661a = fragment;
                    tmgLiveHomepageActivity.f18661a = Fragment.instantiate(tmgLiveHomepageActivity, "com.taobao.oversea.live.homepage.ContainerFragment", bundle);
                    TmgLiveHomepageActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.live_fragment_container, TmgLiveHomepageActivity.this.f18661a).commitAllowingStateLoss();
                }

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    } else if (TmgLiveHomepageActivity.this.b == null) {
                    } else {
                        TmgLiveHomepageActivity.this.b.updateErrorViewStatus(false);
                    }
                }
            }).a()).a());
        }
    }

    @Override // com.taobao.oversea.live.fragment.EmptyFragment.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f();
        }
    }
}
