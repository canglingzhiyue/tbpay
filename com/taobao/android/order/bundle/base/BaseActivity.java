package com.taobao.android.order.bundle.base;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.f;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import com.taobao.android.order.bundle.TBOrderListActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.g;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.homepage.utils.a;
import com.taobao.search.common.util.i;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.ut.mini.l;
import java.util.HashMap;
import tb.bww;
import tb.bwx;
import tb.bxb;
import tb.bxi;
import tb.dcn;
import tb.dtz;
import tb.esy;
import tb.hvp;
import tb.hyn;
import tb.hyr;
import tb.hzc;
import tb.hzp;
import tb.jpo;
import tb.jpr;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.ria;

/* loaded from: classes6.dex */
public abstract class BaseActivity extends AppCompatActivity implements c, ITBPublicMenu, bww, bwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String T;
    public ria ab;
    private ParallelBizValueHelper.PageType b;
    private OnScreenChangedListener c;

    /* renamed from: a  reason: collision with root package name */
    private g f14532a = null;
    public final esy d = new esy();

    static {
        kge.a(644027013);
        kge.a(-1056043576);
        kge.a(-1343974867);
        kge.a(-259503857);
        kge.a(-2127406267);
    }

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
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
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract void a(Bundle bundle);

    public void bS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31527d5", new Object[]{this});
        }
    }

    public abstract void c();

    public abstract g d();

    public static /* synthetic */ void a(BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e3974", new Object[]{baseActivity});
        } else {
            baseActivity.f();
        }
    }

    public static /* synthetic */ void b(BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d48c53", new Object[]{baseActivity});
        } else {
            baseActivity.g();
        }
    }

    public BaseActivity() {
        hvp.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a();
        String A = A();
        jpr.a(A);
        jqi.a("tborder", this.d);
        jqi.a(A, this.d);
        a(A, bundle);
        jpo.b(this).a("apmClientBeforeNetworkLogicProcess", (String) null);
        f.a((Activity) this);
        hyr.a().a(this);
        a(bundle);
        this.f14532a = d();
        g gVar = this.f14532a;
        if (gVar != null) {
            gVar.a();
            c();
            hyn.a(BaseBioNavigatorActivity.g, i.b.MEASURE_ONCREATE, new String[0]);
        }
        if (dcn.a()) {
            f();
            e();
        }
        bS_();
    }

    private void a(String str, Bundle bundle) {
        jpo jpoVar;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        jpo b = jpo.b(this);
        b.a(this, str, D());
        com.taobao.android.ultron.performence.model.f fVar = new com.taobao.android.ultron.performence.model.f(bxb.sPid, bxb.b(str));
        fVar.a(bxi.b() ? 0.5f : 0.002f);
        Intent intent = getIntent();
        if (intent == null || bundle != null) {
            b.a(str);
            b.a(fVar);
            return;
        }
        long longExtra = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra2 = intent.getLongExtra("NAV_TO_URL_START_UPTIME", 0L);
        long longExtra3 = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        this.T = com.taobao.android.order.bundle.helper.g.b(intent, CoreConstants.IN_PARAMS_DETAILCLICK);
        boolean z = !StringUtils.isEmpty(this.T);
        long parseLong = z ? Long.parseLong(this.T) : 0L;
        if (parseLong <= 0) {
            jpoVar = b;
            j = longExtra;
        } else {
            jpoVar = b;
            j = parseLong;
        }
        if (j <= 0 || currentTimeMillis - j <= 0) {
            jqg.b("OrderPerformanceTrack", "start time invalid");
            this.ab = null;
            return;
        }
        jpo jpoVar2 = jpoVar;
        jpoVar2.a(str, j);
        jpoVar2.a(fVar);
        this.ab = new ria(str, this);
        this.ab.c().put(dtz.STAGE_KEY_CLICK_START, Long.valueOf(j));
        this.ab.c().put("up_nav_start_time", Long.valueOf(longExtra2));
        this.ab.c().put("on_create_time", Long.valueOf(currentTimeMillis));
        jpoVar2.a("apmClientFullStageProcess", longExtra, (String) null);
        boolean z2 = true;
        jpo.b(this).a(1, "d2", String.valueOf(z));
        if (longExtra <= 0) {
            z2 = false;
        }
        if (!z2 || longExtra3 <= 0) {
            return;
        }
        jpoVar2.a("apmClientLayoutComplete", longExtra, (String) null);
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("navStage");
        ultronPerformanceStageModel.setStartMills(longExtra);
        ultronPerformanceStageModel.setEndMills(currentTimeMillis);
        jpoVar2.a(ultronPerformanceStageModel, (String) null, false);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        jqg.b("DeviceAdapter", "OnScreenChangedListener register");
        this.c = new OnScreenChangedListener() { // from class: com.taobao.android.order.bundle.base.BaseActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                }
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                BaseActivity.a(BaseActivity.this);
                BaseActivity baseActivity = BaseActivity.this;
                if (baseActivity instanceof TBOrderDetailActivity) {
                    ((TBOrderDetailActivity) baseActivity).q();
                }
                BaseActivity.b(BaseActivity.this);
            }
        };
        h.a().c(this.c);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(com.taobao.android.autosize.i.a(this).width(), 1073741824);
        hzc e = this.f14532a.e();
        if (!(e instanceof hzp)) {
            return;
        }
        ((hzp) e).d().q().f(a2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            i().e().a(127);
        }
    }

    public g i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("4fa703d6", new Object[]{this}) : this.f14532a;
    }

    @Override // tb.bww
    public hzc z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hzc) ipChange.ipc$dispatch("cf5ee7f4", new Object[]{this});
        }
        g gVar = this.f14532a;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        g gVar = this.f14532a;
        if (gVar == null || gVar.c() == null) {
            return;
        }
        this.f14532a.c().a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        g gVar = this.f14532a;
        if (gVar != null && gVar.c() != null) {
            this.f14532a.c().e();
        }
        try {
            z = a.b(this);
        } catch (Throwable unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("voiceIsOpen", String.valueOf(z));
        l.getInstance().updatePageProperties(hashMap);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        g gVar = this.f14532a;
        if (gVar == null || gVar.c() == null) {
            return;
        }
        this.f14532a.c().b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        g gVar = this.f14532a;
        if (gVar == null || gVar.c() == null) {
            return;
        }
        this.f14532a.c().c();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.c != null) {
            h.a().d(this.c);
        }
        g gVar = this.f14532a;
        if (gVar != null && gVar.c() != null) {
            this.f14532a.c().d();
            this.f14532a.d();
        }
        jpo.b(this).a(this);
        jqi.a("tborder");
        String A = A();
        jqi.a(A);
        jpr.b(A);
    }

    @Override // tb.bwx
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : ParallelBizValueHelper.a(this.b);
    }

    public ParallelBizValueHelper.PageType w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParallelBizValueHelper.PageType) ipChange.ipc$dispatch("49b90d55", new Object[]{this}) : this.b;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this instanceof TBOrderListActivity) {
            this.b = ParallelBizValueHelper.PageType.order_list;
        } else if (!(this instanceof TBOrderDetailActivity)) {
        } else {
            if ("true".equals(com.taobao.android.order.bundle.helper.g.b(getIntent(), CoreConstants.IN_PARAMS_VIEW_LOGISTICS))) {
                this.b = ParallelBizValueHelper.PageType.logistics_detail;
            } else {
                this.b = ParallelBizValueHelper.PageType.order_detail;
            }
        }
    }

    public final String A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this}) : ParallelBizValueHelper.c(this.b);
    }

    public final String D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this}) : ParallelBizValueHelper.d(this.b);
    }
}
