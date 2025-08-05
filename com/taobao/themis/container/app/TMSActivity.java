package com.taobao.themis.container.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.launcher.bootstrap.tao.ability.c;
import com.taobao.android.nav.Nav;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.container.utils.b;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.g;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.uc.webview.export.media.MessageID;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qqb;
import tb.qqp;
import tb.tld;
import tb.tle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001!B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\rH\u0014J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0017H\u0014J\b\u0010\u001e\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0014J\n\u0010 \u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/taobao/themis/container/app/TMSActivity;", "Lcom/taobao/themis/container/app/TMSBaseActivity;", "Lcom/taobao/themis/kernel/TMSInstanceBinder;", "Lcom/taobao/android/launcher/bootstrap/tao/ability/LinkLifeCycle;", "Lcom/taobao/uikit/actionbar/ITBPublicMenu;", "()V", "mHasJumpToOther", "", "mUrl", "", "getMUrl", "()Ljava/lang/String;", "finish", "", "getPublicMenu", "Lcom/taobao/uikit/actionbar/TBPublicMenu;", "getTMSInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "jumpToTriver", "navUrlToOtherAC", "url", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onNewIntent", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "onSaveInstanceState", "outState", "onSetActivityTheme", MessageID.onStop, "pageUserInfo", "Companion", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSActivity extends TMSBaseActivity implements c, g, ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private boolean b;

    static {
        kge.a(555087703);
        kge.a(1169932797);
        kge.a(-1864841087);
        kge.a(-1343974867);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(TMSActivity tMSActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
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
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
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

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (getIntent().getStringExtra("oriUrl") != null) {
            String stringExtra = getIntent().getStringExtra("oriUrl");
            if (stringExtra == null) {
                return null;
            }
            Intent intent = getIntent();
            q.b(intent, "intent");
            intent.setData(o.b(stringExtra));
            return stringExtra;
        }
        Intent intent2 = getIntent();
        q.b(intent2, "intent");
        return intent2.getDataString();
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        tld tldVar;
        com.taobao.themis.container.app.a d;
        com.taobao.themis.kernel.f a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.taobao.themis.kernel.utils.d dVar = com.taobao.themis.kernel.utils.d.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.themis.kernel.utils.d dVar2 = com.taobao.themis.kernel.utils.d.INSTANCE;
        b.a(getApplicationContext());
        long currentTimeMillis2 = System.currentTimeMillis();
        TMSLogger.a("TMSActivity", "TMSActivity onCreate");
        tle tleVar = null;
        com.taobao.themis.kernel.utils.d dVar3 = com.taobao.themis.kernel.utils.d.INSTANCE;
        if (getIntent() == null || !com.taobao.themis.taobao.utils.b.a(getIntent())) {
            tldVar = tleVar;
        } else {
            Uri b = o.b(e());
            if (b == null) {
                NotifyApm.a().a(this);
                super.onCreate(bundle);
                a((String) null);
                return;
            }
            TMSLogger.d("TMSActivity 极简链路", "onCreate targetUrl is: " + b);
            TMSActivity tMSActivity = this;
            if (com.taobao.themis.utils.f.a(tMSActivity)) {
                Toast.makeText(tMSActivity, "外链拉端 - 极简链路", 1).show();
            }
            if (!TMSSwitchUtils.isEnterTMS(tMSActivity, b) && (!n.K() || !TMSSwitchUtils.enableEnterTMSH5AFC(tMSActivity, b))) {
                TMSLogger.d("TMSActivity 极简链路", "命中 Themis，但是不应该 TMS 处理，跳出 TMS");
                NotifyApm.a().a(this);
                super.onCreate(bundle);
                a(b.toString());
                return;
            }
            setTheme(R.style.Theme_TMSActivity);
            tldVar = new tld();
            TMSLogger.d("TMSActivity 极简链路", "命中 Themis");
            if (getIntent().getStringExtra("oriUrl") == null) {
                getIntent().putExtra("oriUrl", b.toString());
            }
        }
        if (bundle == null || !bundle.containsKey("shouldRelaunch")) {
            com.taobao.android.autosize.f.a((Activity) this);
        }
        com.taobao.themis.kernel.utils.d dVar4 = com.taobao.themis.kernel.utils.d.INSTANCE;
        super.onCreate(bundle);
        com.taobao.themis.container.app.a d2 = d();
        if (d2 != null) {
            d2.a(ai.a(kotlin.j.a("containerOnCreate", String.valueOf(currentTimeMillis)), kotlin.j.a("containerStart", String.valueOf(currentTimeMillis2))));
        }
        if (tldVar == null || (d = d()) == null || (a2 = d.a()) == null) {
            return;
        }
        a2.a(tldVar);
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, com.taobao.themis.kernel.g
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

    @Override // com.taobao.themis.container.app.TMSBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (n.Q() || TextUtils.isEmpty(e())) {
            return;
        }
        com.taobao.android.linkback.f.a(Uri.parse(e()), this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.taobao.themis.container.app.a d;
        com.taobao.themis.kernel.f a2;
        qqb b;
        ITMSPage c;
        com.taobao.themis.kernel.f a3;
        List b2;
        com.taobao.themis.kernel.f a4;
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (intent == null || intent.getDataString() == null) {
            return;
        }
        String dataString = intent.getDataString();
        String str = null;
        if (dataString == null) {
            NotifyApm.a().a(this);
            a((String) null);
            return;
        }
        String str2 = dataString;
        if (!TextUtils.isEmpty(str2)) {
            TMSLogger.d("TMSActivity 极简链路", "targetUrl is: " + dataString);
        } else {
            TMSLogger.d("TMSActivity 极简链路", "targetUrl is empty!");
        }
        if (n.K() && TMSSolutionType.WEB_SINGLE_PAGE == TMSSolutionType.getType(Uri.parse(dataString))) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            com.taobao.themis.container.app.a d2 = d();
            if (d2 != null && (a4 = d2.a()) != null) {
                str = a4.g();
            }
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                Uri targetUri = Uri.parse(dataString);
                if (!m.a(this, targetUri)) {
                    TMSLogger.d("TMSActivity 极简链路", "换链到 native 页面");
                    NotifyApm.a().a(this);
                    a(dataString);
                    z = false;
                    z2 = true;
                } else {
                    if (n.bP()) {
                        b2 = p.b("forbidRefineType", "isNeedHome", "packageName", "bxsign", "surge_ssr", "afcflow", com.taobao.themis.kernel.i.KEY_AFC_LINK, "utparamcnt", "async");
                    } else {
                        b2 = p.b("isNeedHome", com.taobao.themis.kernel.i.KEY_AFC_LINK, "utparamcnt");
                    }
                    q.b(targetUri, "targetUri");
                    Iterator<String> it = targetUri.getQueryParameterNames().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        String next = it.next();
                        if (!b2.contains(next) && !TextUtils.equals(targetUri.getQueryParameter(next), parse.getQueryParameter(next))) {
                            break;
                        }
                    }
                }
            }
            if (z && !isFinishing() && (d = d()) != null && (a2 = d.a()) != null && (b = a2.b()) != null && (c = b.c()) != null) {
                qqp qqpVar = new qqp();
                qqpVar.f33036a = dataString;
                com.taobao.themis.container.app.a d3 = d();
                if (d3 != null && (a3 = d3.a()) != null) {
                    a3.c(dataString);
                }
                t tVar = t.INSTANCE;
                c.a(qqpVar);
            }
            TMSLogger.d("TMSActivity 极简链路", "WEB_SINGLE_PAGE onNewIntent isFinishing=" + isFinishing() + " shouldReload=" + z + " navToNative=" + z2);
        } else if (!m.b(Uri.parse(dataString))) {
            TMSLogger.d("TMSActivity 极简链路", "换链");
            NotifyApm.a().a(this);
            a(dataString);
        } else {
            Uri targetUri2 = Uri.parse(dataString).buildUpon().appendQueryParameter(com.taobao.themis.kernel.i.KEY_AFC_LINK, "1").build();
            q.b(targetUri2, "targetUri");
            if (TMSSwitchUtils.isEnterTMS(this, targetUri2)) {
                return;
            }
            NotifyApm.a().a(this);
            TMSLogger.d("TMSActivity 极简链路", "命中 Triver");
            c();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (n.Q() && !this.b && !TextUtils.isEmpty(e())) {
            com.taobao.android.linkback.f.a(Uri.parse(e()), this);
        }
        super.finish();
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (!this.b) {
            return;
        }
        finish();
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = true;
        Nav.from(this).toUri(str);
    }

    private final void c() {
        this.b = true;
        Class<?> cls = Class.forName("com.alibaba.triver.bundle.nav.TriverNavProcessor");
        q.b(cls, "Class.forName(\"com.aliba….nav.TriverNavProcessor\")");
        Method declaredMethod = cls.getDeclaredMethod("jumpTriverAndCheckRemote", Context.class, Intent.class);
        q.b(declaredMethod, "clz.getDeclaredMethod(\n …ent::class.java\n        )");
        declaredMethod.invoke(null, this, getIntent());
    }

    @Override // com.taobao.themis.container.app.TMSBaseActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/container/app/TMSActivity$Companion;", "", "()V", "KEY_SHOULD_RELAUNCH", "", RPCDataItems.SWITCH_TAG_LOG, "TAGCOLD", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1251336671);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
