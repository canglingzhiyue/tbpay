package com.taobao.themis.container.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.g;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.trk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0014J\b\u0010$\u001a\u00020\u0011H\u0014J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001cH\u0014J\b\u0010'\u001a\u00020\u0011H\u0014J\b\u0010(\u001a\u00020\u0011H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006*"}, d2 = {"Lcom/taobao/themis/container/app/TMSBaseActivity;", "Landroid/support/v4/app/FragmentActivity;", "Lcom/taobao/themis/kernel/TMSInstanceBinder;", "()V", "mContainerHelper", "Lcom/taobao/themis/container/app/TMSAppContainerHelper;", "getMContainerHelper", "()Lcom/taobao/themis/container/app/TMSAppContainerHelper;", "setMContainerHelper", "(Lcom/taobao/themis/container/app/TMSAppContainerHelper;)V", "mUrl", "", "getMUrl", "()Ljava/lang/String;", "getTMSInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", MessageID.onStop, "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class TMSBaseActivity extends FragmentActivity implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.themis.container.app.a f22355a;

    static {
        kge.a(82550088);
        kge.a(1169932797);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(TMSBaseActivity tMSBaseActivity, String str, Object... objArr) {
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
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
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

    public void a(com.taobao.themis.container.app.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300852aa", new Object[]{this, aVar});
        } else {
            this.f22355a = aVar;
        }
    }

    public com.taobao.themis.container.app.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.container.app.a) ipChange.ipc$dispatch("98c1a5ad", new Object[]{this}) : this.f22355a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        Intent intent = getIntent();
        q.b(intent, "intent");
        return intent.getDataString();
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.taobao.themis.kernel.utils.d dVar2 = com.taobao.themis.kernel.utils.d.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanExtra = getIntent().getBooleanExtra("recycledActivity", false);
        com.taobao.themis.kernel.utils.d dVar3 = com.taobao.themis.kernel.utils.d.INSTANCE;
        super.onCreate(bundle);
        if (bundle != null && !bundle.containsKey("shouldRelaunch")) {
            TMSLogger.d("TMSBaseActivity", "activity recycle by system , reload page");
            Object clone = getIntent().clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Intent");
            }
            Intent intent = (Intent) clone;
            intent.setClass(this, getClass());
            intent.putExtra("recycledActivity", true);
            startActivity(intent);
            finish();
            return;
        }
        com.taobao.themis.kernel.utils.d dVar4 = com.taobao.themis.kernel.utils.d.INSTANCE;
        if (TMSSolutionType.getType(o.b(e())) == TMSSolutionType.WEB_SINGLE_PAGE) {
            dVar = new e(this);
        } else {
            setContentView(R.layout.tms_activity_main);
            ViewGroup splashViewContainer = (ViewGroup) findViewById(R.id.tms_splash_container);
            q.b(splashViewContainer, "splashViewContainer");
            dVar = new d(this, splashViewContainer);
        }
        a(dVar);
        com.taobao.themis.kernel.utils.d dVar5 = com.taobao.themis.kernel.utils.d.INSTANCE;
        com.taobao.themis.container.app.a d = d();
        if (d != null) {
            String e = e();
            q.a((Object) e);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "containerOnCreate", (String) Long.valueOf(currentTimeMillis));
            jSONObject2.put((JSONObject) "recycledActivity", (String) Boolean.valueOf(booleanExtra));
            t tVar = t.INSTANCE;
            d.a(e, jSONObject);
        }
        com.taobao.themis.container.app.a d2 = d();
        if (d2 != null) {
            d2.a(ai.a(j.a("containerOnCreate", String.valueOf(currentTimeMillis)), j.a("recycledActivity", String.valueOf(booleanExtra))));
        }
        com.taobao.themis.kernel.utils.d dVar6 = com.taobao.themis.kernel.utils.d.INSTANCE;
        com.taobao.themis.container.app.a d3 = d();
        if (d3 == null) {
            return;
        }
        trk.a.a(d3, (TMSSolutionType) null, (f.c) null, 3, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/container/app/TMSBaseActivity$Companion;", "", "()V", "KEY_SHOULD_RELAUNCH", "", RPCDataItems.SWITCH_TAG_LOG, "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1163030896);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public com.taobao.themis.kernel.f b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("db03aa12", new Object[]{this});
        }
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return null;
        }
        return d.a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return;
        }
        d.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return;
        }
        d.f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (n.aB()) {
            com.taobao.themis.container.app.a d = d();
            if (d != null) {
                d.g();
            }
            super.onPause();
        } else {
            super.onPause();
            com.taobao.themis.container.app.a d2 = d();
            if (d2 == null) {
                return;
            }
            d2.g();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return;
        }
        d.o();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            Result.a aVar = Result.Companion;
            com.taobao.themis.container.app.a d = d();
            if (d != null) {
                d.b();
                tVar = t.INSTANCE;
            } else {
                tVar = null;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        com.taobao.themis.container.app.a d = d();
        if (d != null && d.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, newConfig});
            return;
        }
        q.d(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return;
        }
        d.a(newConfig);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.taobao.themis.container.app.a d = d();
        if (d == null) {
            return;
        }
        d.a(i, i2, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, outState});
            return;
        }
        q.d(outState, "outState");
        super.onSaveInstanceState(outState);
        if (!com.taobao.themis.utils.f.c(this) || !n.ao()) {
            return;
        }
        outState.putBoolean("shouldRelaunch", true);
    }
}
