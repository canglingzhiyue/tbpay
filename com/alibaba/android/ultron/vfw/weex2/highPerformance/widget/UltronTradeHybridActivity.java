package com.alibaba.android.ultron.vfw.weex2.highPerformance.widget;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.adh;
import tb.bzu;
import tb.cts;
import tb.hfg;
import tb.jqg;
import tb.jqm;
import tb.kge;
import tb.sfc;

/* loaded from: classes2.dex */
public class UltronTradeHybridActivity extends BaseActivity implements hfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2808a;
    private p b;
    private UltronTradeHybridDialogFragment c;
    private p e;
    private boolean d = false;
    private boolean f = false;
    private boolean g = false;

    static {
        kge.a(-1262648239);
        kge.a(618279230);
    }

    public static /* synthetic */ Object ipc$super(UltronTradeHybridActivity ultronTradeHybridActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        a();
        b();
        super.onCreate(bundle);
        if (!d()) {
            e();
            jqg.b("UltronTradeHybridActivity.onCreate", "preRender is not ready");
        }
        if (bundle != null) {
            bzu.a(bzu.a.b("tradeHybridContainerRebuild").a(false).a(0.001f));
        }
        a(bundle);
    }

    @Override // tb.hfg
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment = this.c;
        return ultronTradeHybridDialogFragment != null && ultronTradeHybridDialogFragment.isGestureIntercept();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (getIntent() == null || getIntent().getData() == null) {
            UnifyLog.d("UltronTradeHybridActivity.initParams", "invalid url");
        } else {
            this.f2808a = getIntent().getData().toString();
            if (!StringUtils.isEmpty(this.f2808a)) {
                if (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a.a(this.f2808a, cts.a.PRE_RENDER_URL_PAY_SUCCESS)) {
                    this.f2808a = adh.a(this.f2808a, cts.a.QUERY_HIT_PRERENDER_OPT);
                }
                Object a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(this.f2808a);
                if (a2 instanceof p) {
                    this.b = (p) a2;
                }
            }
            a("统一性能优化容器");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f2808a)) {
            UnifyLog.d("UltronTradeHybridActivity.initStyle", "mUrl is empty");
        } else {
            Uri parse = Uri.parse(this.f2808a);
            try {
                if (StringUtils.equals(parse.getQueryParameter(CXCommonActivity.NAV_OVERLAY), "true")) {
                    supportRequestWindowFeature(9);
                } else {
                    supportRequestWindowFeature(8);
                }
            } catch (Exception e) {
                UnifyLog.d("UltronTradeHybridActivity.initStyle", e.toString());
            }
            try {
                if (StringUtils.equals(parse.getQueryParameter(CXCommonActivity.NAV_HIDDEN), "true")) {
                    getSupportActionBar().e();
                }
            } catch (Exception e2) {
                UnifyLog.d("UltronTradeHybridActivity.initStyle", e2.toString());
            }
            try {
                if (StringUtils.equals(parse.getQueryParameter(CXCommonActivity.NAV_HIDDEN), "true")) {
                    getSupportActionBar().e();
                }
            } catch (Exception e3) {
                UnifyLog.d("UltronTradeHybridActivity.initStyle", e3.toString());
            }
            String queryParameter = parse.getQueryParameter("wx_statusbar_hidden");
            String queryParameter2 = parse.getQueryParameter("_wx_statusbar_hidden");
            if (StringUtils.equals(queryParameter, "true") || StringUtils.equals(queryParameter2, "true")) {
                this.d = true;
            }
            try {
                if (!StringUtils.equals(parse.getQueryParameter("pageType"), "pop")) {
                    return;
                }
                this.f = true;
                adh.a(this, parse);
                sfc.a(this);
                getWindow().setBackgroundDrawableResource(R.color.transparent);
                overridePendingTransition(0, 0);
            } catch (Exception e4) {
                UnifyLog.d("UltronTradeHybridActivity.initStyle", e4.toString());
            }
        }
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        setContentView(R.layout.ultron_weex2_high_performance_activity_layout);
        View findViewById = findViewById(R.id.hybridRootContainer);
        if (this.f && findViewById != null) {
            findViewById.setBackgroundColor(Color.parseColor("#00000000"));
        }
        this.c = a(this.f2808a, d() ? this.b : this.e, d());
        this.c.displayByActivity(this, bundle);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            jqg.b("UltronTradeHybridActivity.switchInnerFragment", "pageUrl is empty");
        } else {
            try {
                Object a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(str);
                p pVar = a2 instanceof p ? (p) a2 : null;
                boolean a3 = a(pVar);
                jqg.b("UltronTradeHybridActivity.switchInnerFragment", "innerFragment is PreRenderReady? " + a3);
                if (!a3) {
                    pVar = f.a().a(this, str);
                }
                UltronTradeHybridDialogFragment a4 = a(str, pVar, a3);
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.setCustomAnimations(R.anim.push_left_in, R.anim.push_left_out, R.anim.push_right_in, R.anim.push_right_out);
                beginTransaction.replace(R.id.fragmentContainer, a4);
                beginTransaction.addToBackStack(null);
                if (!getSupportFragmentManager().isStateSaved()) {
                    beginTransaction.commit();
                } else {
                    beginTransaction.commitAllowingStateLoss();
                }
                this.g = true;
            } catch (Throwable th) {
                jqg.b("UltronTradeHybridActivity.switchInnerFragment", "onException: " + th);
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.g) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 4) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.getBackStackEntryCount() > 0) {
                supportFragmentManager.popBackStack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (!this.f) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a(this.b);
    }

    private boolean a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11e8b529", new Object[]{this, pVar})).booleanValue();
        }
        c b = c.b(pVar);
        if (b == null) {
            return false;
        }
        boolean a2 = b.a();
        boolean c = b.c();
        boolean b2 = b.b();
        jqg.b("UltronTradeHybridActivity.isPreRenderReady", String.format("isRenderReady: %s, isBizReady: %s, isRenderException: %s", Boolean.valueOf(a2), Boolean.valueOf(c), Boolean.valueOf(b2)));
        return a2 && c && !b2;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e = f.a().a(this, this.f2808a);
        }
    }

    private UltronTradeHybridDialogFragment a(String str, p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridDialogFragment) ipChange.ipc$dispatch("4516e210", new Object[]{this, str, pVar, new Boolean(z)});
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return new UltronTradeHybridDialogFragment.a().d("UltronTradeHybridActivity").e("UltronTradeHybridActivity").f(str).b(pVar).c(z).d(false).d(R.id.fragmentContainer).e(displayMetrics.widthPixels).f(displayMetrics.heightPixels).b();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!jqm.a()) {
        } else {
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            Toast.makeText(this, str, 1).show();
        }
    }
}
