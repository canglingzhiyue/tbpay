package com.taobao.search.searchdoor.shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.common.SearchBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.imn;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.nrk;
import tb.nsd;
import tb.nto;

/* loaded from: classes7.dex */
public class ShopSearchDoorActivity extends SearchBaseActivity implements ium {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nsd f19406a;

    static {
        kge.a(160340303);
        kge.a(-1747045540);
    }

    public static /* synthetic */ Object ipc$super(ShopSearchDoorActivity shopSearchDoorActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
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

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        SearchSdk.init();
        ScreenType.b(this);
        TLogTracker.a("InShopSearchDoor");
        super.onCreate(bundle);
        TLogTracker.a(r.bk());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        nto.INSTANCE.a(getIntent());
        a();
        b();
        c();
        SearchDoorContext a2 = this.f19406a.a();
        if (a2 != null) {
            TLogTracker.a(a2.c());
        } else {
            TLogTracker.a((Map<String, ? extends Object>) null);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f19406a = new nsd(this, this, null, new iur() { // from class: com.taobao.search.searchdoor.shop.ShopSearchDoorActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    }
                }

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        ShopSearchDoorActivity.this.setContentView(view);
                    }
                }
            });
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        setIntent(intent);
        super.onNewIntent(intent);
        nto.INSTANCE.a(intent);
        this.f19406a.a(intent);
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a("InShopSearchDoor");
        super.onResume();
        b();
        c();
        nsd nsdVar = this.f19406a;
        if (nsdVar == null) {
            return;
        }
        nsdVar.onCtxResumeInternal();
    }

    @Override // tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : com.taobao.search.sf.j.f19452a;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search");
        setUTPageName("Page_Shop_Search");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        nsd nsdVar = this.f19406a;
        if (nsdVar == null) {
            return;
        }
        nsdVar.g();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        nsd nsdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z || (nsdVar = this.f19406a) == null) {
            return;
        }
        nsdVar.h();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        nsd nsdVar = this.f19406a;
        if (nsdVar == null) {
            return;
        }
        nsdVar.onCtxPauseInternal();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TLogTracker.a();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.b();
    }

    @Override // com.taobao.search.common.SearchBaseActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        nsd nsdVar = this.f19406a;
        if (nsdVar != null) {
            nsdVar.onCtxDestroyInternal();
        }
        TLogTracker.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || 136 != i || intent == null || this.f19406a == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("q");
        if (StringUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f19406a.postEvent(nrk.a.a(stringExtra, ""));
    }
}
