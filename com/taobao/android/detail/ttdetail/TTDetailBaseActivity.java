package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.j;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.inside.TTDInsideController;
import com.taobao.android.detail.ttdetail.inside.a;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.bb;
import com.taobao.android.detail.ttdetail.utils.be;
import com.taobao.android.detail.ttdetail.utils.bj;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.u;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.kge;
import tb.nup;
import tb.odg;
import tb.sdc;

/* loaded from: classes4.dex */
public class TTDetailBaseActivity extends AppCompatActivity implements com.taobao.android.detail.ttdetail.communication.g<j>, ITBPublicMenu, sdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBPublicMenu f10452a;
    private boolean b;
    private TTDetailPageManager c;
    private nup d;
    private FrameLayout e;
    private long f;
    private long g;
    private long h = System.currentTimeMillis();
    private com.taobao.android.detail.ttdetail.widget.g i;
    private String j;
    private Map<String, String> k;

    static {
        kge.a(1309103908);
        kge.a(-767194759);
        kge.a(-1343974867);
        kge.a(-2124799993);
    }

    public static /* synthetic */ Object ipc$super(TTDetailBaseActivity tTDetailBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -315360737:
                return new Boolean(super.onKeyUp(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case 143326307:
                super.onBackPressed();
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
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.sdc
    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ void a(TTDetailBaseActivity tTDetailBaseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db923bb5", new Object[]{tTDetailBaseActivity});
        } else {
            tTDetailBaseActivity.e();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, jVar})).booleanValue() : a(jVar);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.f = System.currentTimeMillis();
        a.a(this);
        boolean c = a.c(this);
        if (!c) {
            a.b(this);
        }
        super.onCreate(bundle);
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sBottomInBottomOut))) {
            int i = R.anim.tt_detail_activity_inside_open_enter;
        } else {
            int i2 = R.anim.tt_detail_activity_open_enter;
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sBottomInBottomOut))) {
            int i3 = R.anim.tt_detail_activity_inside_open_exit;
        } else {
            int i4 = R.anim.tt_detail_activity_open_exit;
        }
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onCreate(): " + (this.g - this.f));
        this.f = this.g;
        q.a(this);
        setContentView(R.layout.activity_new_ttdetail);
        if (c) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.tt_detail_inside_root_stub);
            if (viewStub != null) {
                this.e = (FrameLayout) viewStub.inflate().findViewById(R.id.fl_tt_detail_inside_container);
            } else {
                this.e = (FrameLayout) findViewById(R.id.fl_tt_detail_inside_container);
            }
        } else {
            this.e = (FrameLayout) findViewById(R.id.fl_tt_detail_container);
        }
        a(c);
        be.a(this, getWindow(), !c);
        be.a(getWindow(), -1);
        com.taobao.android.detail.ttdetail.communication.c.a(this, j.class, this);
        av.a(this, "initPage", this.h);
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onCreate(): " + (this.g - this.f));
        this.f = this.g;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = new TTDetailPageManager(this, getIntent());
        this.c.c(this.j);
        this.c.a(this.k);
        this.c.a(this.i);
        this.c.a(this.d);
        this.c.n();
        this.c.a((ITBPublicMenu) this);
        this.c.a(z);
        this.c.a(new TTDInsideController.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailBaseActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.inside.TTDInsideController.a
            public void onPageClose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1a4cb911", new Object[]{this});
                } else {
                    TTDetailBaseActivity.a(TTDetailBaseActivity.this);
                }
            }
        });
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View i = this.c.i();
        if (bj.a(this.e, i)) {
            return;
        }
        this.e.addView(i, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.f = System.currentTimeMillis();
        super.onStart();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onStart(): " + (this.g - this.f));
        this.f = this.g;
        this.c.a();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onStart(): " + (this.g - this.f));
        this.f = this.g;
    }

    @Override // android.app.Activity
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        this.f = System.currentTimeMillis();
        super.onRestart();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onRestart(): " + (this.g - this.f));
        this.f = this.g;
        this.c.b();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onRestart(): " + (this.g - this.f));
        this.f = this.g;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.f = System.currentTimeMillis();
        super.onResume();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "super.onResume(): " + (this.g - this.f));
        this.f = this.g;
        this.c.c();
        this.g = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onResume(): " + (this.g - this.f));
        this.f = this.g;
        TBPublicMenu tBPublicMenu = this.f10452a;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        bb.a(this);
        try {
            odg.l().a("Page_Detail", this.c.v(), this, m.a(u.a().a((Activity) this)));
        } catch (Throwable unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.c.d();
        TBPublicMenu tBPublicMenu = this.f10452a;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        try {
            odg.l().b("Page_Detail", this.c.v(), this, new String[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.c.e();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bb.c(this);
        super.onDestroy();
        com.taobao.android.detail.ttdetail.communication.c.a(this, this);
        this.c.f();
        q.b(this);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (!this.b) {
            this.c.x();
        }
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        i.a("TTDetailBaseActivity.realFinish");
        bb.c(this);
        super.finish();
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sBottomInBottomOut))) {
            int i = R.anim.tt_detail_activity_inside_close_enter;
        } else {
            int i2 = R.anim.tt_detail_activity_close_enter;
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sBottomInBottomOut))) {
            int i3 = R.anim.tt_detail_activity_inside_close_exit;
        } else {
            int i4 = R.anim.tt_detail_activity_close_exit;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.b = true;
        boolean x = this.c.x();
        this.b = false;
        if (x) {
            return;
        }
        f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (this.c.k()) {
        } else {
            if (getSupportFragmentManager().getBackStackEntryCount() <= 0 && getFragmentManager().getBackStackEntryCount() <= 0 && !isFinishing()) {
                d();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.c.a(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.c.b(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.c.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public boolean a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a0192db", new Object[]{this, jVar})).booleanValue();
        }
        onBackPressed();
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    public final eyx g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("3d2e4394", new Object[]{this}) : this.c.j();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.j = str;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager == null) {
            return;
        }
        tTDetailPageManager.c(str);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.k = map;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager == null) {
            return;
        }
        tTDetailPageManager.a(map);
    }

    public void a(com.taobao.android.detail.ttdetail.widget.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89aa800a", new Object[]{this, gVar});
            return;
        }
        this.i = gVar;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager == null) {
            return;
        }
        tTDetailPageManager.a(this.i);
    }

    public final void a(nup nupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eeaaaf", new Object[]{this, nupVar});
            return;
        }
        this.d = nupVar;
        TTDetailPageManager tTDetailPageManager = this.c;
        if (tTDetailPageManager == null) {
            return;
        }
        tTDetailPageManager.a(this.d);
    }

    public final String a(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("86d7aa1f", new Object[]{this, map, mtopResponse, new Integer(i)}) : this.c.a(map, mtopResponse, i);
    }

    public TTDetailPageManager j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailPageManager) ipChange.ipc$dispatch("9478b03a", new Object[]{this}) : this.c;
    }

    @Override // tb.sdc
    public final eyx c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("1e67ae18", new Object[]{this}) : this.c.j();
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString(getString(R.string.tt_detail_zzb_key_page), "Page_Detail");
        String v = this.c.v();
        if (!TextUtils.isEmpty(v)) {
            bundle2.putString(getString(R.string.tt_detail_zzb_key_id), v);
        }
        Map<String, String> g = this.c.g();
        if (g != null && !g.isEmpty()) {
            Bundle bundle3 = new Bundle();
            for (Map.Entry<String, String> entry : g.entrySet()) {
                bundle3.putString(entry.getKey(), entry.getValue());
            }
            bundle2.putBundle(getString(R.string.tt_detail_zzb_key_extparams), bundle3);
        }
        bundle.putBundle(getString(R.string.tt_detail_zzb_key_bundle), bundle2);
        return bundle;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        if (this.f10452a == null) {
            this.f10452a = new TBPublicMenu(this);
            try {
                this.f10452a.setDefaultPublicMenuClickListener(new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailBaseActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        } else if (tBPublicMenuItem.getId() != R.id.uik_menu_home) {
                        } else {
                            TTDetailBaseActivity.this.finish();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
        return this.f10452a;
    }
}
