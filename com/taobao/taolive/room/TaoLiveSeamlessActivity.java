package com.taobao.taolive.room;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.taolive.room.controller2.f;
import com.taobao.taolive.room.controller2.h;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.y;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.history.RecentlyOftenWatchService;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import java.util.Map;
import tb.kge;
import tb.pbp;
import tb.pez;
import tb.psm;

/* loaded from: classes8.dex */
public class TaoLiveSeamlessActivity extends SwipeBackActivity implements ShareContentCallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_KILL_SELF = "com.taobao.taolive.room.TaoLiveVideoActivity.killself";

    /* renamed from: a  reason: collision with root package name */
    private static final String f21493a;
    private com.taobao.taolive.room.controller2.d b;
    private Handler c;
    private String e;
    private pez f;
    private long i;
    private ViewGroup k;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"com.taobao.taolive.room.TaoLiveVideoActivity.killself".equals(intent.getAction())) {
            } else {
                TaoLiveSeamlessActivity.this.finish();
            }
        }
    };
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            } else {
                String action = intent.getAction();
                if (TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    TaoLiveSeamlessActivity.a(TaoLiveSeamlessActivity.this);
                } else if (!TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                } else {
                    TaoLiveSeamlessActivity.this.finish();
                }
            }
        }
    };

    public static /* synthetic */ Object ipc$super(TaoLiveSeamlessActivity taoLiveSeamlessActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
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
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
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

    public static /* synthetic */ void a(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b63b05", new Object[]{taoLiveSeamlessActivity});
        } else {
            taoLiveSeamlessActivity.b();
        }
    }

    public static /* synthetic */ com.taobao.taolive.room.controller2.d b(TaoLiveSeamlessActivity taoLiveSeamlessActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.room.controller2.d) ipChange.ipc$dispatch("220570aa", new Object[]{taoLiveSeamlessActivity}) : taoLiveSeamlessActivity.b;
    }

    static {
        kge.a(2093521620);
        kge.a(321354641);
        f21493a = TaoLiveSeamlessActivity.class.getSimpleName();
    }

    @Override // com.taobao.taolive.room.SwipeBackActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        f();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        this.i = System.currentTimeMillis();
        pbp.a(null, null);
        this.f = new pez(this);
        RecentlyOftenWatchService.a().c();
        LocalBroadcastManager.getInstance(getBaseContext()).registerReceiver(this.h, new IntentFilter("com.taobao.taolive.room.TaoLiveVideoActivity.killself"));
        getWindow().addFlags(128);
        if (!com.taobao.taolive.room.utils.d.b()) {
            Toast.makeText(this, "亲,你的机型暂不支持直播T.T", 1).show();
            finish();
        } else if (!Login.checkSessionValid()) {
            a((Activity) this);
            Login.login(true);
        } else {
            b();
        }
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.j);
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.j);
        }
    }

    private void b() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        getIntent().putExtra("firstTime", this.i);
        if (getIntent() != null && (data = getIntent().getData()) != null) {
            this.e = data.getQueryParameter("newRoomType");
        }
        c();
        ViewGroup a2 = this.b.a();
        setContentView(a2);
        if (this.k != null) {
            return;
        }
        this.k = a2;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b = new h(this, getIntent());
        this.b.a(new f() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.room.controller2.f
            public void a(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                }
            }

            @Override // com.taobao.taolive.room.controller2.f
            public void b(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("41e3e87c", new Object[]{this, map});
                }
            }
        });
        this.b.a(new View.OnClickListener() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TaoLiveSeamlessActivity.b(TaoLiveSeamlessActivity.this).c();
                }
            }
        });
        this.b.b(new View.OnClickListener() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TaoLiveSeamlessActivity.this.getPublicMenu() == null) {
                } else {
                    TaoLiveSeamlessActivity.this.getPublicMenu().show();
                }
            }
        });
        this.b.a(new ISmallWindowStrategy() { // from class: com.taobao.taolive.room.TaoLiveSeamlessActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
            public void a(View view, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                    return;
                }
                if (!TextUtils.isEmpty(str) && aa.i()) {
                    str = str.replace(y.TAOLIVE_ONLINE_LIVE_ID, "id=" + aa.C());
                }
                if (TextUtils.isEmpty(str)) {
                    str = com.taobao.taolive.room.utils.c.a(str2);
                }
                s.a(view.getContext(), str.replace("/taolive/video.html", "/taolive/seamless.html").replace("forceRefresh=true", "forceRefresh=false"), null, 67108864, false);
            }
        });
    }

    private void d() {
        com.taobao.taolive.room.controller2.d dVar;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!psm.p() || (dVar = this.b) == null || !dVar.e() || (viewGroup = this.k) == null) {
        } else {
            viewGroup.removeAllViews();
            this.k.setId(View.generateViewId());
            c();
            this.k.addView(this.b.a());
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            Uri data = intent.getData();
            if (data != null) {
                z = data.getBooleanQueryParameter(aw.PARAM_FORCE_REFRESH, false);
            }
        }
        if (this.b == null) {
            return;
        }
        d();
        this.b.a(intent, z);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.onConfigurationChanged(configuration);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.b == null) {
            return;
        }
        d();
        this.b.onResume();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.onPause();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.i();
        this.b.onStop();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.k = null;
        this.f.b();
        RecentlyOftenWatchService.a().d();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null) {
            dVar.onDestroy();
        }
        b((Activity) this);
        if (this.h != null) {
            LocalBroadcastManager.getInstance(getBaseContext()).unregisterReceiver(this.h);
            this.h = null;
        }
        Handler handler = this.c;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.c = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        if (i == 20000) {
            dVar.f();
        } else if (i == 20001) {
            dVar.g();
        } else if (i != 10000) {
        } else {
            if (i2 == 8) {
                dVar.a(false);
            } else if (i2 != 1) {
            } else {
                dVar.a(true);
            }
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar != null && dVar.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        com.taobao.taolive.room.controller2.d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.a(i);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        this.f.a(menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (!this.f.a(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        this.f.b(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z) {
            return;
        }
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            getWindow().getDecorView().setSystemUiVisibility(5380);
        }
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("febe4434", new Object[]{this}) : this.f.a();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }
}
