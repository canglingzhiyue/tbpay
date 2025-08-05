package com.etao.feimagesearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.guide.PltNewUser;
import com.etao.feimagesearch.newresult.perf.IrpAvaRecord;
import com.etao.feimagesearch.result.IrpOverlaySlice;
import com.etao.feimagesearch.result.b;
import com.etao.feimagesearch.util.ah;
import com.etao.feimagesearch.util.u;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.uikit.screentype.a;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlay;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice;
import com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView;
import com.taobao.search.c;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.t;
import tb.coy;
import tb.jwq;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public class IrpActivity extends FEISBaseActivity implements b, a, com.taobao.android.xsearchplugin.muise.f, jwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.etao.feimagesearch.newresult.base.a b;
    private IrpAvaRecord d = new IrpAvaRecord();
    private List<MUSOverlay> e = new ArrayList(5);
    private c f = null;
    private final u g = new u(true, new rul<String, t>() { // from class: com.etao.feimagesearch.IrpActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.t, java.lang.Object] */
        @Override // tb.rul
        /* renamed from: invoke */
        public /* synthetic */ t mo2421invoke(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9923577", new Object[]{this, str}) : a(str);
        }

        public t a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t) ipChange.ipc$dispatch("79fe5aed", new Object[]{this, str});
            }
            coy.a("Page_PhotoSearchResult", "plt_2023_screenshot", "path", str);
            return null;
        }
    });
    private d h = new d(this) { // from class: com.etao.feimagesearch.IrpActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.cog
        public boolean a(int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : IrpActivity.a(IrpActivity.this, i, keyEvent);
        }

        @Override // tb.cog
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                IrpActivity.this.b();
            }
        }
    };

    static {
        kge.a(1581571943);
        kge.a(1439857926);
        kge.a(-1300944702);
        kge.a(-629875645);
        kge.a(-1327398134);
    }

    public static /* synthetic */ Object ipc$super(IrpActivity irpActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
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
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean a(IrpActivity irpActivity, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("522d492d", new Object[]{irpActivity, new Integer(i), keyEvent})).booleanValue() : super.onKeyDown(i, keyEvent);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            super.finish();
        }
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.etao.feimagesearch.newresult.perf.a.I();
        TLogTracker.a("IrpResult");
        super.onCreate(bundle);
        j.INSTANCE.c();
        ScreenType b = ScreenType.b((Context) this);
        this.b = new com.etao.feimagesearch.newresult.base.e(this.h, com.etao.feimagesearch.newresult.base.e.a(getIntent()));
        this.b.a(bundle, c());
        PltNewUser.markPltUsed(this);
        if (com.etao.feimagesearch.config.b.dI()) {
            this.f = new c();
        }
        c cVar = this.f;
        if (cVar != null) {
            cVar.b(0);
            this.f.a((Activity) this, true);
            this.f.a(getWindow().getDecorView(), 0);
        }
        if (b != null) {
            b.a((a) this);
        }
        com.etao.feimagesearch.newresult.perf.a.J();
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.b.e();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.b.a();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.b.d();
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a("IrpResult");
        super.onResume();
        this.b.b();
        this.g.a(this);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.etao.feimagesearch.newresult.perf.a.b(true);
        this.b.c();
        this.g.b(this);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            this.b.f();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : this.b.a(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != 2001) {
            return;
        }
        com.taobao.android.address.b.a(i, i2, intent);
    }

    @Override // com.etao.feimagesearch.result.b
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b.g();
    }

    @Override // com.etao.feimagesearch.result.b
    public IrpAvaRecord e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IrpAvaRecord) ipChange.ipc$dispatch("aaafe5be", new Object[]{this}) : this.d;
    }

    @Override // com.etao.feimagesearch.result.b
    public com.etao.feimagesearch.newresult.base.b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.newresult.base.b) ipChange.ipc$dispatch("4967cad9", new Object[]{this}) : this.b.h();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (keyEvent.getKeyCode() == 4) {
            if (keyEvent.getAction() == 0) {
                if (this.e.isEmpty()) {
                    finish();
                } else {
                    List<MUSOverlay> list = this.e;
                    list.get(list.size() - 1).fireEvent("close", null);
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f2f21", new Object[]{this, new Boolean(z)});
        } else {
            super.onPointerCaptureChanged(z);
        }
    }

    @Override // tb.jwq
    public MUSOverlaySlice a(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlaySlice) ipChange.ipc$dispatch("b898b90d", new Object[]{this, context, mUSView, mUSOverlay, mUSOverlayView}) : new IrpOverlaySlice(context, mUSView, mUSOverlay, mUSOverlayView);
    }

    @Override // tb.jwq
    public void a(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81397a02", new Object[]{this, mUSOverlay});
        } else {
            this.e.add(mUSOverlay);
        }
    }

    @Override // tb.jwq
    public void b(MUSOverlay mUSOverlay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1577e9a1", new Object[]{this, mUSOverlay});
        } else {
            this.e.remove(mUSOverlay);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        c cVar = this.f;
        if (cVar != null) {
            return cVar.a();
        }
        return false;
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void a(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf8a69d", new Object[]{this, eVar});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.a(eVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void b(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172ccde", new Object[]{this, eVar});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.b(eVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void closeViewDarkMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dae15", new Object[]{this, view});
        } else if (view == null || !r.cB()) {
        } else {
            ah.a(view);
        }
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(Integer.valueOf(i));
        }
    }
}
