package com.taobao.android.detail2.core.framework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import com.taobao.weex.common.WXModule;
import java.util.List;
import tb.ctu;
import tb.dlx;
import tb.fjl;
import tb.fjp;
import tb.fjt;
import tb.fkb;
import tb.fmd;
import tb.hnj;
import tb.idk;
import tb.ipa;
import tb.kge;
import tb.mvl;
import tb.nlb;
import tb.tim;
import tb.xjf;
import tb.xjg;

/* loaded from: classes5.dex */
public class NewDetailActivity extends AppCompatActivity implements a, j, o, com.taobao.tao.m, dlx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f11462a;
    private SystemBarDecorator b;
    private boolean d;
    private Runnable e;
    private boolean f;
    public boolean h;
    private boolean i;
    private long j;
    private boolean k;
    private xjg l;
    private xjf m;
    private mvl c = new mvl();
    private boolean g = true;

    static {
        kge.a(796992000);
        kge.a(-1678640208);
        kge.a(478546929);
        kge.a(477856532);
        kge.a(-936309664);
        kge.a(1204424376);
    }

    public static /* synthetic */ Object ipc$super(NewDetailActivity newDetailActivity, String str, Object... objArr) {
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
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail2.core.framework.a
    public Activity getNewDetailContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("26c4bd2d", new Object[]{this}) : this;
    }

    public static /* synthetic */ Runnable a(NewDetailActivity newDetailActivity, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("28bf695d", new Object[]{newDetailActivity, runnable});
        }
        newDetailActivity.e = runnable;
        return runnable;
    }

    public static /* synthetic */ xjg a(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xjg) ipChange.ipc$dispatch("9d76c478", new Object[]{newDetailActivity}) : newDetailActivity.l;
    }

    public static /* synthetic */ void a(NewDetailActivity newDetailActivity, long j, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382025c8", new Object[]{newDetailActivity, new Long(j), intent});
        } else {
            newDetailActivity.a(j, intent);
        }
    }

    public static /* synthetic */ void a(NewDetailActivity newDetailActivity, Intent intent, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86512eee", new Object[]{newDetailActivity, intent, new Long(j), new Long(j2), new Long(j3)});
        } else {
            newDetailActivity.a(intent, j, j2, j3);
        }
    }

    public static /* synthetic */ Runnable b(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("df98079c", new Object[]{newDetailActivity}) : newDetailActivity.e;
    }

    public static /* synthetic */ e c(NewDetailActivity newDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("81c3c623", new Object[]{newDetailActivity}) : newDetailActivity.f11462a;
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            this.i = intent.getBooleanExtra(c.KEY_NAV_HIT_TOP_SPEED_FIRST_PIC, false);
            this.h = intent.getBooleanExtra("lowBatteryNdQuickJump", false);
            this.j = intent.getLongExtra(c.KEY_NAV_LONG_TOKEN, -1L);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        b(intent);
        if (a(bundle, intent)) {
            fjt.a(fjt.TAG_TIP, "checkAndProcessHitTopSpeedFirstPic Success!");
        } else {
            a(bundle, false);
        }
    }

    private boolean a(final Bundle bundle, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb45932d", new Object[]{this, bundle, intent})).booleanValue();
        }
        if (!this.i) {
            return false;
        }
        this.l = xjg.a(this.j);
        xjg xjgVar = this.l;
        if (xjgVar == null) {
            return false;
        }
        this.k = xjgVar.b(this);
        if (!this.k) {
            return false;
        }
        fjt.a(xjg.TAG, "极速布局初始化成功。InitSimpleMainPicSuccess True.");
        this.m = xjf.a(this.j);
        if (this.l.c()) {
            this.l.a(this.c);
            this.c.a(this, intent);
        }
        super.onCreate(bundle);
        this.l.a(this);
        this.l.b(new ipa.b() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ipa.c
            public String b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "onCreateInternal";
            }

            @Override // tb.ipa.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                NewDetailActivity.this.a(bundle, true);
                NewDetailActivity.a(NewDetailActivity.this).e();
            }

            @Override // tb.ipa.b, tb.xje
            public Intent d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Intent) ipChange2.ipc$dispatch("d02bf1c8", new Object[]{this}) : intent;
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.os.Bundle r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.NewDetailActivity.a(android.os.Bundle, boolean):void");
    }

    public void f() {
        xjf xjfVar;
        FrameLayout a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.h && (xjfVar = this.m) != null && (a2 = xjfVar.a(false)) != null) {
            this.m.a(this);
            if (h() && this.l.a(a2)) {
                fjt.a(xjg.TAG, "setContentView-Normal-TopSeed");
            } else {
                setContentView(a2);
            }
            fjt.a(xjg.TAG, "BatterPreView: setContentViewForPreViewSuccess. NormalView .");
        } else {
            setContentView(R.layout.detail_activity_layout);
        }
    }

    public void g() {
        xjf xjfVar;
        FrameLayout a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.h && (xjfVar = this.m) != null && (a2 = xjfVar.a(true)) != null) {
            this.m.a(this);
            if (h() && this.l.a(a2)) {
                fjt.a(xjg.TAG, "setContentView-Anim-TopSeed");
            } else {
                setContentView(a2);
            }
            fjt.a(xjg.TAG, "BatterPreView: setContentViewForPreViewSuccess. AnimView .");
        } else {
            setContentView(R.layout.detail_activity_layout_for_mask_frame_layout);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        xjg xjgVar = this.l;
        if (xjgVar != null && xjgVar.a(this, i)) {
            return;
        }
        super.setContentView(i);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h) {
            if (ipa.Q()) {
                fjt.a(fjt.TAG_TIP, "TBAutoSizeSkip.");
                return;
            }
            fjt.a(fjt.TAG_TIP, "TBAutoSizeStart01.");
            com.taobao.android.autosize.f.a((Activity) this);
        } else {
            fjt.a(fjt.TAG_TIP, "TBAutoSizeStart02.");
            com.taobao.android.autosize.f.a((Activity) this);
        }
    }

    private void a(long j, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d663cb19", new Object[]{this, new Long(j), intent});
            return;
        }
        ctu.a("doRenderPrepare");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.root);
        if (h()) {
            this.l.b(frameLayout);
        }
        if (this.c.a() && this.c.c() != null) {
            ctu.a("new_NewDetailInstance_MaskFrameAnim");
            this.f11462a = new e(this, frameLayout, intent, this.c.c().getNewDetailMaskFrameLayoutContext());
            ctu.a();
        } else {
            ctu.a("new_NewDetailInstance");
            this.f11462a = new e(this, frameLayout, intent, null);
            ctu.a();
        }
        this.f11462a.a(j);
        ctu.a();
    }

    private void a(final Intent intent, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4339f65", new Object[]{this, intent, new Long(j), new Long(j2)});
            return;
        }
        final long a2 = fkb.a(j);
        if (ipa.u()) {
            ipa.a(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "doTraceNdSectionStart2024";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        NewDetailActivity.a(NewDetailActivity.this, intent, j, j2, a2);
                    }
                }
            });
        } else {
            a(intent, j, j2, a2);
        }
    }

    private void a(Intent intent, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a240c3ff", new Object[]{this, intent, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        a(intent);
        fjp.a(this, fjp.SECTION_NAV, j3, "");
        if (this.c.a()) {
            fjp.a(this, fjp.SECTION_FAST_ANIM_VISIBLE, j3, "");
        }
        fjp.a(this, fjp.SECTION_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_WEEX_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_NAV_BAR_WEEX_VISIBLE, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, j3, "");
        fjp.a(this, fjp.SECTION_FIRST_VIDEO_READY, j3, "");
        fjp.b(this, fjp.SECTION_NAV, j2, "");
        fjp.a(this, fjp.SECTION_CONTAINER_INIT, j2, "");
        fjp.a((a) this, fjp.SECTION_SECOND_WEEX_VISIBLE, "");
        fjp.a((a) this, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "");
    }

    private void b(Intent intent, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91c67a6", new Object[]{this, intent, new Long(j), new Long(j2)});
            return;
        }
        a(intent);
        fjp.a(this, fjp.SECTION_NAV, fkb.a(j), "");
        if (this.c.a()) {
            fjp.a(this, fjp.SECTION_FAST_ANIM_VISIBLE, fkb.a(j), "");
        }
        fjp.a(this, fjp.SECTION_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_NATIVE_PIC_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_WEEX_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_NAV_BAR_WEEX_VISIBLE, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, fkb.a(j), "");
        fjp.a(this, fjp.SECTION_FIRST_VIDEO_READY, fkb.a(j), "");
        fjp.b(this, fjp.SECTION_NAV, j2, "");
        fjp.a(this, fjp.SECTION_CONTAINER_INIT, j2, "");
        fjp.a((a) this, fjp.SECTION_SECOND_WEEX_VISIBLE, "");
        fjp.a((a) this, fjp.SECTION_SECOND_NATIVE_PIC_VISIBLE, "");
    }

    private void a(Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null || (extras = intent.getExtras()) == null) {
        } else {
            try {
                fjp.a((a) this, "HPisClientCache", (Object) extras.getString(tim.S_ARGS_IS_CLIENT_CACHE));
                fjp.a((a) this, "HPTargetType", (Object) extras.getString(DinamicxNativeConfig.TARGETTYPE));
                fjp.a((a) this, "HPRequestND", (Object) extras.getString("requestNewDetailFlag"));
                String string = extras.getString("requestNewDetailTime");
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                fjp.a(this, fjp.SECTION_OPEN_IMMED_HP_TO_REAL_REQUEST, fkb.a(Long.parseLong(string)), "");
            } catch (Exception e) {
                fjt.a("new_detail异常", "traceHPStatus出错", e);
            }
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i && this.k && this.l != null;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (h()) {
            super.onStart();
            this.l.c(new Runnable() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewDetailActivity.this.a(true);
                    }
                }
            });
        } else {
            a(false);
        }
        ctu.a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ctu.a("NewDetailActivity_onStart");
        if (z) {
            fjt.a(fjt.TAG_TIP, "skipSuperOnStart");
        } else {
            super.onStart();
        }
        e eVar = this.f11462a;
        if (eVar != null) {
            eVar.b(eVar.d());
        }
        ctu.a();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (!ipa.M()) {
            this.c.d();
        }
        super.finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d = true;
        if (ipa.T()) {
            hnj.d(this);
        }
        if (!ipa.M()) {
            this.c.e();
        }
        e eVar = this.f11462a;
        if (eVar != null) {
            eVar.c();
        }
        super.onDestroy();
        Context context = TBMainHost.a().getContext();
        if (ipa.I()) {
            fjt.a("NewDetailLaunchIdleTask", "TikTest onDestroy Task , Run , preloadWeexV2FromCache 01");
            com.taobao.android.detail2.core.framework.base.weex.h.c();
        } else if (a() && (context instanceof Activity)) {
            nlb.a("weex_sync_delete_code", "onDestroy preloadDetailCardMainPicWeex Error:" + ipa.ba());
        }
        ipa.b(this.e);
        if (ipa.i()) {
            idk.c();
        }
        this.f = true;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        e eVar = this.f11462a;
        if (eVar == null) {
            return false;
        }
        if (!eVar.g()) {
            fjt.a(fjt.TAG_RENDER, "enableWeexV2KeepLiveWithActivity 开关关闭");
            return false;
        } else if (!this.f11462a.h() && !this.f11462a.e()) {
            fjt.a(fjt.TAG_RENDER, "isKeepLiveWeexOpen 和 isForceOpenPreloadWeex 开关关闭");
            return false;
        } else {
            fjt.a(fjt.TAG_RENDER, "NewDetailActivity下weex实例预加载开启");
            return true;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (h()) {
            super.onStop();
            this.l.f(new Runnable() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewDetailActivity.this.b(true);
                    }
                }
            });
        } else {
            b(false);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            fjt.a(fjt.TAG_TIP, "skipSuperOnStop");
        } else {
            super.onStop();
        }
        e eVar = this.f11462a;
        if (eVar == null) {
            return;
        }
        eVar.a(eVar.d());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (h()) {
            super.onPause();
            this.l.e(new Runnable() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewDetailActivity.this.c(true);
                    }
                }
            });
        } else {
            c(false);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        ctu.a("NewDetailActivity_onPause");
        e eVar = this.f11462a;
        if (eVar != null) {
            eVar.a(eVar.d(), false);
        }
        if (z) {
            fjt.a(fjt.TAG_TIP, "skipSuperOnPause");
        } else {
            super.onPause();
        }
        ctu.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (h()) {
            super.onResume();
            this.l.d(new Runnable() { // from class: com.taobao.android.detail2.core.framework.NewDetailActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ctu.a("t_nd_onResumeInternal");
                    NewDetailActivity.this.d(true);
                    ctu.a();
                }
            });
        } else {
            d(false);
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            fjt.a(fjt.TAG_TIP, "skipSuperOnResume");
        } else {
            super.onResume();
        }
        e eVar = this.f11462a;
        if (eVar == null) {
            return;
        }
        eVar.c(eVar.d());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        e eVar = this.f11462a;
        if (eVar != null) {
            if (eVar.b()) {
                return;
            }
            this.f11462a.o();
            finish();
        } else if (!ipa.z()) {
        } else {
            finish();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.a
    public int getNewDetailContainerStatusBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5300567c", new Object[]{this})).intValue() : this.b.getConfig().getStatusBarHeight();
    }

    @Override // com.taobao.android.detail2.core.framework.a
    public void updateBatteryBarDarkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa527865", new Object[]{this, new Boolean(z)});
        } else {
            this.b.enableImmersiveStatusBar(z);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.a
    public void finishNewDetailContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704d3e6a", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override // tb.dlx
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!a("onPopPositionChanged", "", jSONObject)) {
        } else {
            try {
                this.f11462a.a(b(jSONObject));
            } catch (Exception e) {
                fjt.a(fjt.TAG_VIDEO_ZOOM, "onPopPositionChanged数据解析错误", e);
            }
        }
    }

    @Override // tb.dlx
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (!a("onPopStateChanged", str, jSONObject)) {
        } else {
            try {
                this.f11462a.a(str, b(jSONObject));
            } catch (Exception e) {
                fjt.a(fjt.TAG_VIDEO_ZOOM, "onPopStateChanged数据解析错误", e);
            }
        }
    }

    private fmd.b b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmd.b) ipChange.ipc$dispatch("6199ece4", new Object[]{this, jSONObject});
        }
        fmd.b bVar = new fmd.b();
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return bVar;
        }
        bVar.c = fjl.a(this, jSONObject2.getInteger("x").intValue());
        bVar.d = fjl.a(this, jSONObject2.getInteger("y").intValue());
        bVar.e = fjl.a(this, jSONObject2.getInteger("h").intValue());
        bVar.f = fjl.a(this, jSONObject2.getInteger("w").intValue());
        JSONObject jSONObject3 = jSONObject2.getJSONObject("animations");
        if (jSONObject3 != null && (jSONArray = jSONObject3.getJSONArray("translationY")) != null) {
            bVar.f28059a = fjl.a(this, jSONArray.getFloat(0).floatValue());
            bVar.b = fjl.a(this, jSONArray.getFloat(1).floatValue());
        }
        return bVar;
    }

    private boolean a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2bf4cf8", new Object[]{this, str, str2, jSONObject})).booleanValue();
        }
        e eVar = this.f11462a;
        if (eVar == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "scene: " + str + ", state: " + str2 + ", mNewDetailInstance为空，不响应浮层回调");
            return false;
        } else if (eVar.j()) {
            return true;
        } else {
            fjt.a(fjt.TAG_VIDEO_ZOOM, "scene: " + str + ", state: " + str2 + ", 开关关闭，不响应浮层回调");
            return false;
        }
    }

    @Override // com.taobao.tao.m
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !ipa.a("fast_key_no_default_action_bar_style");
    }

    @Override // com.taobao.android.detail2.core.framework.j
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g ? this.f : this.d;
    }

    @Override // com.taobao.android.detail2.core.framework.o
    public List<com.taobao.android.detail2.core.framework.base.weex.c> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        e eVar = this.f11462a;
        if (eVar != null) {
            return eVar.s();
        }
        return null;
    }
}
