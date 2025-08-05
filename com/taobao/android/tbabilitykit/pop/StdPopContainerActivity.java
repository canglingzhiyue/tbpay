package com.taobao.android.tbabilitykit.pop;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.tbabilitykit.pop.b;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class StdPopContainerActivity extends FragmentActivity implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f15348a = new ArrayList();
    private d b;
    private g c;

    static {
        kge.a(-1689553182);
        kge.a(-193058797);
    }

    public static /* synthetic */ Object ipc$super(StdPopContainerActivity stdPopContainerActivity, String str, Object... objArr) {
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.tbabilitykit.pop.b
    public void a(c listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd31e476", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        b.a.a(this, listener);
    }

    @Override // com.taobao.android.tbabilitykit.pop.b
    public void b(c listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801e4dd5", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        b.a.b(this, listener);
    }

    @Override // com.taobao.android.tbabilitykit.pop.b
    public List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f15348a;
    }

    public final d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("dc815516", new Object[]{this}) : this.b;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        this.b = a.a();
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        d dVar = this.b;
        if (dVar == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        if (Build.VERSION.SDK_INT == 26) {
            setTheme(R.style.Theme_Ability_NotTranslucent_NoTitleBar);
        }
        if (dVar.b().f8913a.u()) {
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.b(uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().skipPage(this);
        }
        if (dVar.b().f8913a.w()) {
            UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
            q.b(uTAnalytics2, "UTAnalytics.getInstance()");
            uTAnalytics2.getDefaultTracker().updatePageStatus(this, UTPageStatus.UT_H5_IN_WebView);
        }
        if (dVar.b().f8913a.r() && Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().addFlags(67108864);
            Window window = getWindow();
            q.b(window, "window");
            window.setStatusBarColor(0);
        }
        if (dVar.b().f8913a.p()) {
            getWindow().setSoftInputMode(32);
        } else {
            getWindow().setSoftInputMode(48);
        }
        super.onCreate(bundle);
        StdPopContainerActivity stdPopContainerActivity = this;
        dVar.a(stdPopContainerActivity);
        this.c = new g(dVar.b(), stdPopContainerActivity, dVar.a());
        g gVar = this.c;
        if (gVar == null) {
            return;
        }
        h.a().c(gVar);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        d dVar;
        com.taobao.android.abilitykit.ability.pop.model.c b;
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        com.taobao.android.abilitykit.ability.pop.model.c b2;
        com.taobao.android.abilitykit.ability.pop.model.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        d dVar2 = this.b;
        if (q.a((Object) com.taobao.android.abilitykit.ability.pop.model.c.DEFAULT_LANDSCAPE_DRAWER, (Object) ((dVar2 == null || (b2 = dVar2.b()) == null || (bVar2 = b2.f8913a) == null) ? null : bVar2.A())) && (dVar = this.b) != null && (b = dVar.b()) != null && (bVar = b.f8913a) != null && bVar.B()) {
            overridePendingTransition(R.anim.mega_slide_in_right, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.taobao.android.abilitykit.ability.pop.presenter.d<?, ?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        d dVar = this.b;
        if (dVar != null && (a2 = dVar.a()) != null) {
            a2.a(null, false);
        }
        g gVar = this.c;
        if (gVar != null) {
            h.a().d(gVar);
            this.c = null;
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (c cVar : a()) {
            cVar.a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e) {
            AppMonitor.Counter.commit("AbilityKit", "stdPopPauseError", "stdPopPauseError-" + e, 1.0d);
        }
    }
}
