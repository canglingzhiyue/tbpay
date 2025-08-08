package tb;

import android.graphics.drawable.Drawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.homepage.view.manager.lifecycle.listener.d;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.taobao.R;
import tb.qzl;

/* loaded from: classes7.dex */
public class tik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lbo f34121a;
    private b.a b;
    private qzl.a c;
    private d d;
    private boolean e;
    private boolean f;
    private boolean g;
    private til h;
    private boolean i;

    static {
        kge.a(456902068);
    }

    public static /* synthetic */ til a(tik tikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (til) ipChange.ipc$dispatch("71e1540d", new Object[]{tikVar}) : tikVar.h;
    }

    public static /* synthetic */ boolean a(tik tikVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("469f197d", new Object[]{tikVar, iContainerDataModel})).booleanValue() : tikVar.a(iContainerDataModel);
    }

    public static /* synthetic */ boolean a(tik tikVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c2496", new Object[]{tikVar, new Boolean(z)})).booleanValue();
        }
        tikVar.i = z;
        return z;
    }

    public static /* synthetic */ void b(tik tikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef036503", new Object[]{tikVar});
        } else {
            tikVar.i();
        }
    }

    public static /* synthetic */ boolean b(tik tikVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f169ee35", new Object[]{tikVar, new Boolean(z)})).booleanValue();
        }
        tikVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean c(tik tikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd866b88", new Object[]{tikVar})).booleanValue() : tikVar.g;
    }

    public static /* synthetic */ boolean d(tik tikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc097209", new Object[]{tikVar})).booleanValue() : tikVar.f;
    }

    public static /* synthetic */ boolean e(tik tikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba8c788a", new Object[]{tikVar})).booleanValue() : tikVar.i;
    }

    public static /* synthetic */ String f(tik tikVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf358479", new Object[]{tikVar}) : tikVar.h();
    }

    public void a(lbo lboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f278c67f", new Object[]{this, lboVar});
            return;
        }
        this.f34121a = lboVar;
        this.h = new til(this.f34121a);
        this.b = e();
        this.c = f();
        this.d = g();
        b.a(this.b);
        oql.a().o().a(this.c, (String) null);
        this.f34121a.y().o().a(this.d);
        this.h.a();
        if (!b.c()) {
            return;
        }
        i();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        laq b = laq.a().a("BottomTabBar").b("resetView");
        til tilVar = this.h;
        if (tilVar == null) {
            return;
        }
        tilVar.d();
        if (b.c()) {
            i();
            b.c("当前是海外多语言，设置海外图标");
        }
        if (this.f) {
            String h = h();
            this.h.a(h);
            b.c("当前有氛围，需要恢复，氛围是: " + h);
        }
        if (this.i) {
            this.h.a(true);
            b.c("当前置灰，需要恢复");
        }
        b.c("重置小火箭视图").b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        laq b = laq.a().a("BottomTabBar").b("changeToR4UButtonView");
        if (this.h == null) {
            b.c("tabBarActionButtonProvider == null").b();
        } else if (this.e || this.f) {
            b.c("当前是小火箭状态或者有氛围: " + this.f).b();
        } else if (b.c()) {
            b.c("海外多语言不设置成小火箭").b();
        } else {
            this.e = true;
            b.c("切换成小火箭按钮").b();
            this.h.c();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        laq b = laq.a().a("BottomTabBar").b("changeToHomepageButtonView");
        if (this.h == null) {
            b.c("mTabBarActionButtonProvider == null").b();
        } else if (!this.e || this.f) {
            b.c("不是小火箭状态或者有氛围: " + this.f).b();
        } else if (b.c()) {
            b.c("海外多语言不设置成淘字").b();
        } else {
            this.e = false;
            b.c("切换成淘字按钮").b();
            this.h.b();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b.a aVar = this.b;
        if (aVar != null) {
            b.b(aVar);
        }
        if (this.c != null) {
            oql.a().o().b(this.c, (String) null);
        }
        if (this.d != null) {
            this.f34121a.y().o().b(this.d);
        }
        til tilVar = this.h;
        if (tilVar == null) {
            return;
        }
        tilVar.e();
    }

    private b.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("de8b386a", new Object[]{this}) : new b.a() { // from class: tb.tik.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    return;
                }
                laq b = laq.a().a("BottomTabBar").b("onLocaleChanged");
                if (tik.a(tik.this) == null) {
                    b.c("mTabBarActionButtonProvider == null").b();
                } else if (b.c()) {
                    tik.b(tik.this);
                } else if (!tik.c(tik.this)) {
                } else {
                    b.c("重置图标").b();
                    tik.a(tik.this).f();
                }
            }
        };
    }

    private qzl.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qzl.a) ipChange.ipc$dispatch("dd506519", new Object[]{this}) : new qzl.a() { // from class: tb.tik.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qzl.a
            public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
                    return;
                }
                laq b = laq.a().a("BottomTabBar").b("onDataProcess");
                if (!l.d(Globals.getApplication())) {
                    b.c("不是海外").b();
                } else if (tik.d(tik.this)) {
                    b.c("当前有氛围").b();
                } else {
                    boolean a2 = tik.a(tik.this, iContainerDataModel);
                    if (a2 == tik.e(tik.this)) {
                        b.c("置灰状态没变化").b();
                        return;
                    }
                    tik.a(tik.this, a2);
                    IHomeSubTabController z = c.a().z();
                    if (z != null) {
                        b.c("同步置灰状态,isGrey: " + a2);
                        z.syncGreyStatus(a2);
                    }
                    if (tik.a(tik.this) == null) {
                        return;
                    }
                    b.c("状态变化了，更新图标").b();
                    tik.a(tik.this).a(a2);
                }
            }
        };
    }

    private d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("858391b3", new Object[]{this}) : new d() { // from class: tb.tik.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.homepage.view.manager.lifecycle.listener.d
            public void p() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63fccf7", new Object[]{this});
                    return;
                }
                String f = tik.f(tik.this);
                boolean z = !StringUtils.isEmpty(f);
                if (tik.a(tik.this) == null) {
                    return;
                }
                laq.a().a("BottomTabBar").b("onFestivalChanged").c("imageUrl: " + f).b();
                tik.b(tik.this, z);
                tik.a(tik.this).a(f);
            }
        };
    }

    private String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : FestivalMgr.a().a("global", "tabbarImagesURL_home_second_selected");
    }

    private boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        laq b = laq.a().a("BottomTabBar").b("isGrey");
        if (iContainerDataModel == null) {
            b.c("containerDataModel == null").b();
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            b.c("baseData == null").b();
            return false;
        }
        JSONObject passParams = base.getPassParams();
        if (passParams == null) {
            b.c("passParams == null").b();
            return false;
        }
        boolean booleanValue = passParams.getBooleanValue("globalGrey");
        b.c("isGrey: " + booleanValue).b();
        return booleanValue;
    }

    private void i() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = Globals.getApplication().getDrawable(R.drawable.uik_nav_home_selected_en);
        } else {
            drawable = Globals.getApplication().getResources().getDrawable(R.drawable.uik_nav_home_selected_en);
        }
        this.g = true;
        laq.a().a("BottomTabBar").b("loadOverseaButton").c("加载海外图标").b();
        this.h.a(drawable);
    }
}
