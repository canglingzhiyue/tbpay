package com.taobao.themis.taobao.container;

import android.app.Activity;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.hyt;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u00060\rR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSTBMenu;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu;", "Lcom/taobao/uikit/actionbar/ITBPublicMenu;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mActivity", "Landroid/app/Activity;", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mPublicMenu", "Lcom/taobao/uikit/actionbar/TBPublicMenu;", "menuItemFactory", "Lcom/taobao/themis/taobao/container/TMSTBMenu$TMSMenuItemFactory;", "getMenuItemFactory", "()Lcom/taobao/themis/taobao/container/TMSTBMenu$TMSMenuItemFactory;", "addItems", "", "item", "", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "getPublicMenu", "getReportExtraInfo", "Lcom/alibaba/fastjson/JSONObject;", "hide", "onPause", "onResume", "pageUserInfo", "Landroid/os/Bundle;", "removeItem", DMComponent.RESET, "show", "TMSMenuItemFactory", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e implements d, ITBPublicMenu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.themis.kernel.f f22824a;
    private final Activity b;
    private final TBPublicMenu c;
    private final a d;
    private final ITMSPage e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/taobao/container/TMSTBMenu$TMSMenuItemFactory;", "", "(Lcom/taobao/themis/taobao/container/TMSTBMenu;)V", "createMenuItem", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "type", "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class a {
        static {
            kge.a(-1808450540);
        }

        public a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "tbPublicMenuItem", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", "kotlin.jvm.PlatformType", "onPublicMenuItemClicked"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22826a;

        public b(List list) {
            this.f22826a = list;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            Object obj;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem == null) {
            } else {
                Iterator it = this.f22826a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((d.a) obj).a() == tBPublicMenuItem.getId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                d.a aVar = (d.a) obj;
                if (aVar == null) {
                    return;
                }
                aVar.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "tbPublicMenuItem", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", "kotlin.jvm.PlatformType", "onPublicMenuItemClicked"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f22827a;

        public c(List list) {
            this.f22827a = list;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            Object obj;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem == null) {
            } else {
                Iterator it = this.f22827a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((d.a) obj).a() == tBPublicMenuItem.getId()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                d.a aVar = (d.a) obj;
                if (aVar == null) {
                    return;
                }
                aVar.c();
            }
        }
    }

    static {
        kge.a(-1367949426);
        kge.a(-1171464120);
        kge.a(-1343974867);
    }

    public e(ITMSPage mPage) {
        q.d(mPage, "mPage");
        this.e = mPage;
        this.f22824a = this.e.b();
        Activity o = this.f22824a.o();
        q.b(o, "mInstance.activity");
        this.b = o;
        this.c = new TBPublicMenu(this.b, this);
        this.d = new a();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.show();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.clearExternalMenus();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.onResume();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c.onPause();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d
    public void a(List<? extends d.a> item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, item});
            return;
        }
        q.d(item, "item");
        if (n.bn()) {
            TBPublicMenu tBPublicMenu = this.c;
            List<? extends d.a> list = item;
            ArrayList arrayList = new ArrayList(p.a((Iterable) list, 10));
            for (d.a aVar : list) {
                arrayList.add(aVar.d());
            }
            tBPublicMenu.addExternalMenus(arrayList, new b(item));
            return;
        }
        TBPublicMenu tBPublicMenu2 = this.c;
        List<? extends d.a> list2 = item;
        ArrayList arrayList2 = new ArrayList(p.a((Iterable) list2, 10));
        for (d.a aVar2 : list2) {
            arrayList2.add(aVar2.d());
        }
        tBPublicMenu2.addCustomMenus(arrayList2, new c(item));
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        JSONObject d = d();
        for (Map.Entry<String, Object> entry : d.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (str = value.toString()) == null) {
                str = "";
            }
            bundle3.putString(key, str);
        }
        bundle2.putString("from", "miniAppDetail");
        bundle2.putString("subjectId", this.f22824a.h());
        bundle2.putString("subjectType", "MINI_APP");
        bundle2.putString("extraInfo", d.toJSONString());
        bundle.putBundle(hyt.ZZB_BUNDLE_KEY, bundle2);
        return bundle;
    }

    private final JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "appVersion", k.d(this.f22824a));
        jSONObject2.put((JSONObject) "appId", this.f22824a.h());
        jSONObject2.put((JSONObject) "appName", k.j(this.f22824a));
        jSONObject2.put((JSONObject) "frameType", k.a(this.f22824a));
        jSONObject2.put((JSONObject) "bizType", k.b(this.f22824a));
        jSONObject2.put((JSONObject) i.SUB_KEY_FRAGMENT_JUMP, k.c(this.f22824a));
        jSONObject2.put((JSONObject) "appType", "tms");
        jSONObject2.put((JSONObject) "templateId", k.g(this.f22824a));
        jSONObject2.put((JSONObject) "templateVersion", k.i(this.f22824a));
        String openModel = this.f22824a.q().getOpenModel();
        if (StringUtils.equals(openModel, com.taobao.themis.kernel.i.KEY_AFC_OPEN_LINK) || StringUtils.equals(openModel, com.taobao.themis.kernel.i.KEY_BROWSER_LINK)) {
            jSONObject2.put((JSONObject) "isFromOuter", "true");
        }
        return jSONObject;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this}) : this.c;
    }
}
