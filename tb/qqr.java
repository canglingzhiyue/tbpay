package tb;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.o;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/pub/menu/MenuItemAbout;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getId", "", "getMenuItemData", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "onClick", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qqr extends d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1647719347);
    }

    public static /* synthetic */ Object ipc$super(qqr qqrVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqr(ITMSPage page) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.id.menu_item_about;
    }

    public TBPublicMenuItem f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("83ef9203", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("뤊:关于").build();
        q.b(build, "TBPublicMenuItem.Builder….setTitle(\"뤊:关于\").build()");
        return build;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public void c() {
        Window.Orientation orientation;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(b().h())) {
        } else {
            Uri build = o.b(n.e()).buildUpon().appendQueryParameter("appId", b().h()).appendQueryParameter("newContainer", String.valueOf(m.b(o.b(b().q().getStartUrl())))).appendQueryParameter("isThemis", "true").appendQueryParameter("frameTempType", "pubArea").appendQueryParameter("developerVersion", k.d(b())).build();
            if (b().j() == TMSSolutionType.MINIGAME) {
                z = true;
            }
            ITMSPageFactory m = b().m();
            String uri = build.toString();
            q.b(uri, "uri.toString()");
            Activity o = b().o();
            q.b(o, "mInstance.activity");
            int requestedOrientation = o.getRequestedOrientation();
            if (requestedOrientation == 0) {
                orientation = Window.Orientation.LANDSCAPE;
            } else if (requestedOrientation == 1) {
                orientation = Window.Orientation.PORTRAIT;
            } else {
                orientation = Window.Orientation.PORTRAIT;
            }
            b().b().a(ITMSPageFactory.a.a(m, uri, new Window(null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, orientation, Boolean.valueOf(z), null, null, null, null, 62207, null), null, null, 8, null));
            super.c();
        }
    }
}
