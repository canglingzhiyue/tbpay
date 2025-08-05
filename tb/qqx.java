package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.extension.page.h;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/pub/menu/MenuItemShare;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "customOpenOuter", "", "customShareEvent", "", "customShareUrl", "getId", "", "getMenuItemData", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "onClick", "", "share", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qqx extends d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33039a;
    private String b;
    private boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/pub/menu/MenuItemShare$share$1", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$IShareListener;", "onCancel", "", "msg", "", "onFail", "onSuccess", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements IShareAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void a(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void b(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.b
        public void c(String msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, msg});
            } else {
                q.d(msg, "msg");
            }
        }
    }

    static {
        kge.a(1664507909);
    }

    public static /* synthetic */ Object ipc$super(qqx qqxVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqx(ITMSPage page) {
        super(page);
        q.d(page, "page");
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : f();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.id.menu_item_share;
    }

    public TBPublicMenuItem f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("83ef9203", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("ꄪ:分享").build();
        q.b(build, "TBPublicMenuItem.Builder….setTitle(\"ꄪ:分享\").build()");
        return build;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = this.f33039a;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            if (this.c) {
                INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
                if (iNavigatorAdapter == null) {
                    return;
                }
                Activity o = b().o();
                q.b(o, "mInstance.activity");
                String str2 = this.f33039a;
                q.a((Object) str2);
                INavigatorAdapter.b.a(iNavigatorAdapter, o, str2, null, null, null, 16, null);
                return;
            }
            ITMSPageFactory m = b().m();
            String str3 = this.f33039a;
            q.a((Object) str3);
            b().b().a(ITMSPageFactory.a.a(m, str3, new Window(null, null, null, null, Integer.valueOf(Color.parseColor("#ffffff")), false, null, null, null, null, null, null, null, null, null, null, 65487, null), null, null, 8, null));
        } else if (!TextUtils.isEmpty(this.b)) {
        } else {
            a(e());
            super.c();
        }
    }

    private final void a(ITMSPage iTMSPage) {
        IShareAdapter.a aVar;
        String uri;
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, iTMSPage});
            return;
        }
        IShareAdapter.a aVar2 = null;
        if (o.f(iTMSPage.b())) {
            h hVar = (h) iTMSPage.a(h.class);
            if (hVar == null || (aVar = hVar.a()) == null) {
                if (n.bd() && iTMSPage.b().j() == TMSSolutionType.UNIAPP) {
                    uri = iTMSPage.b().g();
                } else {
                    uri = m.a(iTMSPage, b(), "", null).toString();
                }
                String str2 = uri;
                q.b(str2, "if (TMSConfigUtils.enabl…g()\n                    }");
                aVar = new IShareAdapter.a("NewMiniapp", str2, null, null, null, null, null, null, 252, null);
            }
            aVar2 = aVar;
            String d = aVar2.d();
            if (d == null || d.length() == 0) {
                aVar2.b("我在手淘发现了【" + k.j(iTMSPage.b()) + "】频道，我觉得特别符合你的style");
            }
            String e = aVar2.e();
            if (e == null || e.length() == 0) {
                aVar2.c("https://gw.alicdn.com/tfs/TB1qK6gbNnaK1RjSZFtXXbC2VXa-580-362.png");
            }
            String c = aVar2.c();
            if (c == null || c.length() == 0) {
                aVar2.a(k.j(iTMSPage.b()));
            }
            if (aVar2.f() == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("title", aVar2.d());
                String e2 = aVar2.e();
                hashMap.put("headImg", e2 == null || e2.length() == 0 ? k.k(b()) : aVar2.e());
                String c2 = aVar2.c();
                hashMap.put("userNick", c2 == null || c2.length() == 0 ? k.j(b()) : aVar2.c());
                String d2 = aVar2.d();
                hashMap.put("description", d2 == null || d2.length() == 0 ? k.l(b()) : aVar2.d());
                String c3 = aVar2.c();
                hashMap.put("price", c3 == null || c3.length() == 0 ? k.j(b()) : aVar2.c());
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = hashMap2;
                String c4 = aVar2.c();
                hashMap3.put("title", c4 == null || c4.length() == 0 ? k.j(b()) : aVar2.c());
                hashMap3.put("appLogo", k.k(iTMSPage.b()));
                hashMap3.put("appName", k.j(iTMSPage.b()));
                hashMap3.put("description", aVar2.d());
                hashMap3.put("imageUrl", "");
                hashMap3.put("appDesc", k.l(b()));
                t tVar = t.INSTANCE;
                hashMap.put("shareInfo", hashMap2);
                if (n.m().length() <= 0) {
                    z = false;
                }
                if (z) {
                    str = n.m();
                } else {
                    Mtop instance = Mtop.instance(b().o());
                    q.b(instance, "Mtop.instance(mInstance.activity)");
                    str = instance.getMtopConfig().envMode == EnvModeEnum.PREPARE ? "https://market.wapa.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true" : "https://market.m.taobao.com/app/crs-qn/light-app-task-center/pages/backflow?wh_weex=true";
                }
                hashMap.put("weexURL", str);
                hashMap.put("weexUrl", str);
                t tVar2 = t.INSTANCE;
                aVar2.a(hashMap);
            }
        } else {
            h hVar2 = (h) iTMSPage.a(h.class);
            if (hVar2 != null) {
                aVar2 = hVar2.a();
            }
        }
        if (aVar2 == null) {
            return;
        }
        Activity o = iTMSPage.b().o();
        q.b(o, "page.getInstance().activity");
        ((IShareAdapter) qpt.a(IShareAdapter.class)).share(o, iTMSPage, aVar2, new a());
    }
}
