package com.taobao.homepage.page;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.browser.utils.i;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.homepage.d;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import tb.kge;
import tb.ksk;
import tb.mvc;
import tb.ope;
import tb.oql;
import tb.qzl;

/* loaded from: classes7.dex */
public class MagicWindowActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17243a;
    private mvc b;
    private qzl.a c;
    private FrameLayout d;
    private PageState e;
    private String f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public enum PageState {
        ORDER,
        ACTIVITY,
        DEFAULT
    }

    public static /* synthetic */ Object ipc$super(MagicWindowActivity magicWindowActivity, String str, Object... objArr) {
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

    public static /* synthetic */ String a(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b930563", new Object[]{magicWindowActivity}) : magicWindowActivity.b();
    }

    public static /* synthetic */ void a(MagicWindowActivity magicWindowActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8e3167", new Object[]{magicWindowActivity, str});
        } else {
            magicWindowActivity.a(str);
        }
    }

    public static /* synthetic */ void a(MagicWindowActivity magicWindowActivity, String str, TMSEmbedSolutionType tMSEmbedSolutionType, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43014b0", new Object[]{magicWindowActivity, str, tMSEmbedSolutionType, new Boolean(z)});
        } else {
            magicWindowActivity.a(str, tMSEmbedSolutionType, z);
        }
    }

    public static /* synthetic */ PageState b(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageState) ipChange.ipc$dispatch("ed91b96f", new Object[]{magicWindowActivity}) : magicWindowActivity.e;
    }

    public static /* synthetic */ String c(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("746efe21", new Object[]{magicWindowActivity}) : magicWindowActivity.f;
    }

    public static /* synthetic */ boolean d(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df74fe24", new Object[]{magicWindowActivity})).booleanValue() : magicWindowActivity.f();
    }

    public static /* synthetic */ void e(MagicWindowActivity magicWindowActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23001be1", new Object[]{magicWindowActivity});
        } else {
            magicWindowActivity.a();
        }
    }

    static {
        kge.a(1169648058);
        f17243a = TBOrderListFragment.class.getSimpleName();
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_magic_window);
        HomePageUtility.a(this);
        this.d = (FrameLayout) findViewById(R.id.container);
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            a(b, TMSEmbedSolutionType.WEB_SINGLE_PAGE, false);
        } else if (f()) {
            a();
        } else {
            a(e(), TMSEmbedSolutionType.WEEX, true);
        }
        c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        mvc mvcVar = this.b;
        if (mvcVar == null) {
            return;
        }
        mvcVar.c();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        mvc mvcVar = this.b;
        if (mvcVar == null) {
            return;
        }
        mvcVar.d();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d();
        mvc mvcVar = this.b;
        if (mvcVar == null) {
            return;
        }
        mvcVar.a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        mvc mvcVar = this.b;
        if (mvcVar != null) {
            mvcVar.a();
            this.b = null;
        }
        this.d.removeAllViews();
        this.f = null;
        Bundle bundle = new Bundle();
        bundle.putBoolean(TBOrderListFragment.KEY_NEED_HIDE_BACK_BTN, true);
        Fragment instantiate = Fragment.instantiate(this, TBOrderListFragment.class.getName(), bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager == null) {
            return;
        }
        supportFragmentManager.beginTransaction().replace(R.id.container, instantiate, f17243a).commitAllowingStateLoss();
        this.e = PageState.ORDER;
        e.e("MagicWindowActivity", "switch to order");
    }

    private void a(String str, TMSEmbedSolutionType tMSEmbedSolutionType, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9995527b", new Object[]{this, str, tMSEmbedSolutionType, new Boolean(z)});
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager == null) {
            return;
        }
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(f17243a);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.d.removeAllViews();
        mvc mvcVar = this.b;
        if (mvcVar != null) {
            mvcVar.a();
        }
        this.b = new mvc(g4.b.j, this);
        this.d.addView(this.b.a(this, tMSEmbedSolutionType, str), new FrameLayout.LayoutParams(-1, -1));
        if (!z) {
            this.f = str;
        } else {
            this.f = null;
        }
        this.e = z ? PageState.DEFAULT : PageState.ACTIVITY;
        e.e("MagicWindowActivity", "switch to web page, url: " + str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        mvc mvcVar = this.b;
        if (mvcVar == null) {
            return;
        }
        mvcVar.a(str);
        this.f = str;
        e.e("MagicWindowActivity", "reload page, url: " + str);
    }

    private String b() {
        JSONObject c;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        ope f = d.f(ksk.NEW_FACE_PARENT.a());
        if (f == null || (c = f.c()) == null || (jSONObject = c.getJSONObject("parallelWindow")) == null) {
            return null;
        }
        long j = 0;
        try {
            j = jSONObject.getLongValue("activityEndTime");
        } catch (Exception unused) {
            e.e("MagicWindowActivity", "parse activity end time error");
        }
        String string = jSONObject.getString("targetUrl");
        if (TextUtils.isEmpty(string) || System.currentTimeMillis() > j) {
            return null;
        }
        String b = b(string);
        e.e("MagicWindowActivity", "activity url: " + b);
        return b;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new qzl.a() { // from class: com.taobao.homepage.page.MagicWindowActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qzl.a
                public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
                        return;
                    }
                    String a2 = MagicWindowActivity.a(MagicWindowActivity.this);
                    if (TextUtils.isEmpty(a2)) {
                        if (MagicWindowActivity.b(MagicWindowActivity.this) == PageState.ORDER || !MagicWindowActivity.d(MagicWindowActivity.this)) {
                            return;
                        }
                        MagicWindowActivity.e(MagicWindowActivity.this);
                    } else if (MagicWindowActivity.b(MagicWindowActivity.this) != PageState.ACTIVITY) {
                        MagicWindowActivity.a(MagicWindowActivity.this, a2, TMSEmbedSolutionType.WEB_SINGLE_PAGE, false);
                    } else if (TextUtils.equals(MagicWindowActivity.c(MagicWindowActivity.this), a2)) {
                    } else {
                        MagicWindowActivity.a(MagicWindowActivity.this, a2);
                    }
                }
            };
        }
        oql.a().o().a(this.c, (String) null);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c == null) {
        } else {
            oql.a().o().b(this.c, (String) null);
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : Uri.parse("https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true").buildUpon().appendQueryParameter(i.WEEX_REFERER_ORIGIN, "https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true").build().toString();
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str).buildUpon().appendQueryParameter("hide_back", "true").appendQueryParameter("status_bar_transparent", "true").build().toString();
        }
        return null;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : com.taobao.android.home.component.utils.j.a("enableEasyGoShowOrderListFragment", true);
    }
}
