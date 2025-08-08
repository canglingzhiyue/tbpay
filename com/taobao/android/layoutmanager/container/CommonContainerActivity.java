package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.ActionBar;
import mtopsdk.common.util.StringUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.BaseContainerFragment;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition;
import com.taobao.tao.flexbox.layoutmanager.component.z;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeCircularProgress;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import tb.gwf;
import tb.gwg;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogb;
import tb.ogg;
import tb.ohd;

/* loaded from: classes5.dex */
public class CommonContainerActivity extends BaseActivity implements com.taobao.tao.flexbox.layoutmanager.container.a, NavigationBarModule.a, ogb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseContainerFragment f13165a;
    private TNodeCircularProgress b;
    private Uri c;
    private boolean d;
    private ViewGroup e;
    private oga<?> f;

    static {
        kge.a(-1984188584);
        kge.a(1597657723);
        kge.a(113102490);
        kge.a(-1007722434);
    }

    public static /* synthetic */ Object ipc$super(CommonContainerActivity commonContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1526884382:
                super.onActivityReenter(((Number) objArr[0]).intValue(), (Intent) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -663187577:
                return new Boolean(super.onSupportNavigateUp());
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
            case 1874373038:
                return super.findViewById(((Number) objArr[0]).intValue());
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

    public static /* synthetic */ void a(CommonContainerActivity commonContainerActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7a8d3f", new Object[]{commonContainerActivity});
        } else {
            super.finish();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ab.a((Context) this);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            super.onCreate(bundle);
            ogg.a("tnode uri is empty");
            finish();
            return;
        }
        String queryParameter = data.getQueryParameter("tnode");
        if (oeb.N()) {
            a(queryParameter);
        }
        h();
        if (oeb.a("tnode.usePadAdapt", true)) {
            com.taobao.android.autosize.f.a((Activity) this);
        }
        if (oeb.cc() && bundle != null) {
            bundle.remove("android:support:fragments");
            bundle.remove("android:support:next_request_index");
        }
        super.onCreate(bundle);
        if (StringUtils.isEmpty(queryParameter)) {
            ogg.a("tnode query is empty, url: " + data.toString());
            finish();
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g x = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().x();
        if (x != null && x.b(this)) {
            getWindow().getDecorView();
        }
        View inflate = getLayoutInflater().inflate(R.layout.layoutmanager_common_container_activity, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(inflate);
        this.e = (ViewGroup) findViewById(16908290);
        this.b = (TNodeCircularProgress) findViewById(R.id.activity_progress);
        if (ohd.b()) {
            ohd.a(getWindow().getDecorView());
        }
        g();
        i();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || !StringUtils.equals(Uri.parse(str).getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAGE_TRACK), "false")) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        this.f13165a = new BaseContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BaseContainerFragment.KEY_INTENT_URI, data);
        this.f13165a.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, this.f13165a).commitAllowingStateLoss();
        b(data.toString());
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!oec.c((Context) this) || !oeb.Z() || !oec.b((Context) this)) {
        } else {
            getWindow().requestFeature(12);
            aa aaVar = null;
            Transition transition = null;
            getWindow().setEnterTransition(transition);
            getWindow().setExitTransition(transition);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(R.transition.tnode_shared_element_transition);
            if (e() != null) {
                aaVar = e().A();
            }
            float a2 = ohd.a(aaVar, this, oec.b(getIntent().getStringExtra(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_START_CORNER_RADIUS), 0));
            float a3 = ohd.a(aaVar, this, oec.b(getIntent().getStringExtra(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_END_CORNER_RADIUS), 0));
            if ((a2 > 0.0f || a3 > 0.0f) && (inflateTransition instanceof TransitionSet)) {
                ((TransitionSet) inflateTransition).addTransition(new CornerRadiusTransition(a2, a3));
            }
            inflateTransition.setDuration(200L);
            inflateTransition.setInterpolator(new FastOutSlowInInterpolator());
            getWindow().setSharedElementEnterTransition(inflateTransition);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!oec.c((Context) this) || !oeb.Z() || !oec.b((Context) this)) {
        } else {
            postponeEnterTransition();
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null || !str.contains("TNodeDemo")) {
        } else {
            getWindow().setSoftInputMode(32);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            return (T) super.findViewById(i);
        }
        return (T) viewGroup.findViewById(i);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        Uri uri = this.c;
        if (uri == null) {
            return;
        }
        String queryParameter = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_STATUSBAR_COLOR);
        boolean z = StringUtils.isEmpty(queryParameter) && !"true".equals(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_FULLTRANSPARENT));
        boolean booleanQueryParameter = this.c.getBooleanQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE, false);
        if (!StringUtils.isEmpty(queryParameter)) {
            if (queryParameter.length() >= 2) {
                char charAt = queryParameter.charAt(0);
                char charAt2 = queryParameter.charAt(1);
                if (charAt >= '0' && charAt <= 'f' && charAt2 >= '0' && charAt2 <= 'f') {
                    queryParameter = "#" + queryParameter;
                }
            }
            gwg.a(this, odx.a(queryParameter));
        }
        if (booleanQueryParameter) {
            gwf.a((Activity) this);
        }
        if (!z) {
            return;
        }
        if (!booleanQueryParameter) {
            i = -1;
        }
        ohd.a((Activity) this, i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.setVisibility(8);
        }
    }

    @Override // tb.ogb
    public oga<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oga) ipChange.ipc$dispatch("b2df2c2a", new Object[]{this}) : this.f;
    }

    @Override // tb.ogb
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.f13165a.onTNodeEngineResume();
        } else {
            this.f13165a.onTNodeEnginePause();
        }
    }

    @Override // tb.ogc
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return;
        }
        ogaVar.setFirstPageName(str);
    }

    @Override // tb.ogc
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return;
        }
        ogaVar.setFirstPageProperty(map);
    }

    @Override // tb.ogc
    public String getFirstPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("232786a5", new Object[]{this});
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return null;
        }
        return ogaVar.getFirstPageName();
    }

    @Override // tb.ogc
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return null;
        }
        return ogaVar.getFirstPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return;
        }
        ogaVar.setSecondPageName(str);
    }

    @Override // tb.ogc
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return;
        }
        ogaVar.setSecondPageProperty(map);
    }

    @Override // tb.ogc
    public String getSecondPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this});
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return null;
        }
        return ogaVar.getSecondPageName();
    }

    @Override // tb.ogc
    public Map getSecondPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this});
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return null;
        }
        return ogaVar.getSecondPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageUTObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
            return;
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return;
        }
        ogaVar.setSecondPageUTObject(obj);
    }

    @Override // tb.ogc
    public Object getSecondPageUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1f89714", new Object[]{this});
        }
        oga<?> ogaVar = this.f;
        if (ogaVar == null) {
            return null;
        }
        return ogaVar.getSecondPageUTObject();
    }

    private void k() {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.c == null || getSupportActionBar() == null) {
        } else {
            getSupportActionBar().a("");
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_NAVBAR_HIDE))) {
                getSupportActionBar().e();
            }
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_NAVBAR_TRANSPARENT))) {
                getSupportActionBar().b(new ColorDrawable(Color.parseColor("#00000000")));
            }
            if ("true".equalsIgnoreCase(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_HIDE_NAV))) {
                getSupportActionBar().b(new ColorDrawable(Color.parseColor("#00000000")));
            }
            String queryParameter = this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_STATUSBAR_COLOR);
            String queryParameter2 = this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_FULLTRANSPARENT);
            if (StringUtils.isEmpty(queryParameter) && !"true".equals(queryParameter2)) {
                z = true;
            }
            if (!z || (supportActionBar = getSupportActionBar()) == null) {
                return;
            }
            supportActionBar.b(new ColorDrawable(-1));
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null && findSecPageWrapper.g()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.d) {
            this.d = true;
            ab e = e();
            if (e != null) {
                e.t();
            }
            finish();
            return;
        }
        BaseContainerFragment baseContainerFragment = this.f13165a;
        if (baseContainerFragment != null) {
            baseContainerFragment.onActivityFinish(new BaseContainerFragment.a() { // from class: com.taobao.android.layoutmanager.container.CommonContainerActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.container.BaseContainerFragment.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        CommonContainerActivity.a(CommonContainerActivity.this);
                    }
                }
            });
        } else {
            super.finish();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : getPublicMenu().getCustomOverflow().getWidth();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a
    public a.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("ca20a233", new Object[]{this}) : new a.b() { // from class: com.taobao.android.layoutmanager.container.CommonContainerActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.container.a.b
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    CommonContainerActivity.this.getSystemBarDecorator().setStatusBarColor(i, true);
                }
            }
        };
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.a
    public a.InterfaceC0844a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0844a) ipChange.ipc$dispatch("cb56f4f3", new Object[]{this}) : new a.InterfaceC0844a() { // from class: com.taobao.android.layoutmanager.container.CommonContainerActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.container.a.InterfaceC0844a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    CommonContainerActivity.this.getPublicMenu().setActionViewIconColor(i);
                }
            }
        };
    }

    @Override // tb.ogb
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        } else {
            com.taobao.android.layoutmanager.container.secondpage.biz.a.a(this, obj, str);
        }
    }

    @Override // tb.ogb
    public Pair<Boolean, Pair<Boolean, aa>> supportSecondPage(MotionEvent motionEvent) {
        aa aaVar;
        boolean z;
        aa A;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e6be4178", new Object[]{this, motionEvent});
        }
        ab e = e();
        if (e == null || (A = e.A()) == null) {
            aaVar = null;
            z = false;
        } else {
            aaVar = ad.a(A, (int) motionEvent.getRawX(), (int) motionEvent.getRawY(), false);
            com.taobao.android.layoutmanager.container.secondpage.biz.b a2 = com.taobao.android.layoutmanager.container.secondpage.biz.a.a(this);
            if (a2 != null && aaVar != null) {
                a2.a(aaVar.e(z.KEY_TRACK_TARGET), (String) null);
            }
            z = true;
        }
        if (aaVar == null) {
            z2 = false;
        }
        return new Pair<>(Boolean.valueOf(z2), new Pair(Boolean.valueOf(z), aaVar));
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fd97e2", new Object[]{this, new Integer(i), intent});
            return;
        }
        super.onActivityReenter(i, intent);
        ab e = e();
        if (e == null) {
            return;
        }
        e.a(i, intent);
    }

    private TNodeView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("f16aefd0", new Object[]{this});
        }
        BaseContainerFragment baseContainerFragment = this.f13165a;
        if (baseContainerFragment == null) {
            return null;
        }
        return baseContainerFragment.tnodeView;
    }

    public ab e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("c3a146f1", new Object[]{this});
        }
        TNodeView l = l();
        if (l == null) {
            return null;
        }
        return l.getEngine();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        boolean onSupportNavigateUp = super.onSupportNavigateUp();
        ab e = e();
        if (e != null) {
            e.x();
        }
        return onSupportNavigateUp;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule.a
    public void a(int[] iArr) {
        int[] iArr2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : NavigationBarModule.a.defaultMenus) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (iArr[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                if (i == 0) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_wangxin));
                } else if (i == 1) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_home));
                } else if (i == 2) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_service));
                } else if (i == 3) {
                    arrayList.add(Integer.valueOf(R.id.uik_menu_feedback));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TBPublicMenu.removePublicMenu(((Integer) it.next()).intValue());
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        TNodeView l;
        oga<?> ogaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (this.f != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
        BaseContainerFragment baseContainerFragment = this.f13165a;
        if (baseContainerFragment != null && baseContainerFragment.isInSecondPage() && (ogaVar = this.f) != null) {
            ogaVar.n();
        }
        if (!isFinishing() || (l = l()) == null) {
            return;
        }
        l.onDestroy();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        oga<?> ogaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        com.taobao.android.layoutmanager.module.a.a(this, true);
        if (this.f != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        }
        BaseContainerFragment baseContainerFragment = this.f13165a;
        if (baseContainerFragment == null || !baseContainerFragment.isInSecondPage() || (ogaVar = this.f) == null) {
            return;
        }
        ogaVar.m();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        oga<?> ogaVar = this.f;
        if (ogaVar != null) {
            ogaVar.o();
        }
        com.taobao.android.layoutmanager.module.a.b(this);
    }

    public void a(m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ba8463", new Object[]{this, bVar});
            return;
        }
        this.c = bVar.b;
        if (this.c == null) {
            return;
        }
        k();
        j();
        if (this.c.getBooleanQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_SEC_PAGE_ENABLE, false)) {
            this.f = new com.taobao.android.layoutmanager.container.secondpage.biz.b(this);
            this.f.a(this, -1);
            if (!"true".equalsIgnoreCase(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_NAVBAR_HIDE))) {
                this.e.setPadding(0, gwf.b(this), 0, 0);
            }
        }
        String queryParameter = this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_PAN_GESTURE);
        if (!com.taobao.android.layoutmanager.a.d() || !StringUtils.equals(queryParameter, com.taobao.tao.flexbox.layoutmanager.container.a.GESTURE_PULLRIGHTEXIT)) {
            return;
        }
        new SlidingLayout(this).bindActivity(this);
    }

    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            return;
        }
        a();
        if (this.f == null || "true".equalsIgnoreCase(this.c.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_NAVBAR_HIDE))) {
            return;
        }
        this.e.setPadding(0, gwf.b(this), 0, 0);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (e() == null) {
            return;
        }
        e().a(i, i2, intent);
    }
}
