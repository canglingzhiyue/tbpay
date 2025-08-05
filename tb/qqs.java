package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/taobao/themis/pub/menu/MenuItemAddToDesktop;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "getId", "", "getMenuItemData", "Lcom/taobao/uikit/actionbar/TBPublicMenuItem;", NetworkAbility.API_GET_TYPE, "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction$MenuType;", "onClick", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class qqs extends d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1713484134);
    }

    public static /* synthetic */ Object ipc$super(qqs qqsVar, String str, Object... objArr) {
        if (str.hashCode() == 92838762) {
            super.c();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqs(ITMSPage page) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.id.menu_item_addTo_desktop;
    }

    public TBPublicMenuItem f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("83ef9203", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("똊:添加到桌面").build();
        q.b(build, "TBPublicMenuItem.Builder…tTitle(\"똊:添加到桌面\").build()");
        return build;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.d.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        qrb.a(b().o(), b().h(), k.j(b()), k.k(b()), b().q().getStartUrl());
        super.c();
    }
}
