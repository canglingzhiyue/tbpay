package com.taobao.themis.pub.titlebar.action;

import android.content.Context;
import android.graphics.Color;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH$J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0017H\u0016J\b\u0010+\u001a\u00020\u001dH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubBaseMoreAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction;", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mMenu", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu;", "getMMenu", "()Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu;", "setMMenu", "(Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu;)V", "mPubMoreAction", "Lcom/taobao/uikit/actionbar/TBActionView;", "getMPubMoreAction", "()Lcom/taobao/uikit/actionbar/TBActionView;", "setMPubMoreAction", "(Lcom/taobao/uikit/actionbar/TBActionView;)V", "mStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "getMStyle", "()Lcom/taobao/themis/kernel/container/Window$Theme;", "setMStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)V", "addItem", "", "item", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "hideMenu", "onHide", "onShow", "removeItem", "resetMenu", "setCustomIconColor", "setStyle", "style", "showMenu", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class d extends com.taobao.themis.kernel.container.ui.titlebar.a implements IMenuAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22759a;
    private TBActionView b;
    private com.taobao.themis.kernel.container.ui.titlebar.d c;
    private Window.Theme d;

    static {
        kge.a(-1201165012);
        kge.a(-1271686885);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -78343661) {
            super.a((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void a(d.a item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7959c39", new Object[]{this, item});
        } else {
            q.d(item, "item");
        }
    }

    public abstract void j();

    public final Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.f22759a;
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            this.f22759a = context;
        }
    }

    public final void a(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d881d71e", new Object[]{this, tBActionView});
        } else {
            this.b = tBActionView;
        }
    }

    public final TBActionView h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBActionView) ipChange.ipc$dispatch("73d0b525", new Object[]{this}) : this.b;
    }

    public final com.taobao.themis.kernel.container.ui.titlebar.d n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.ui.titlebar.d) ipChange.ipc$dispatch("725db5af", new Object[]{this}) : this.c;
    }

    public final Window.Theme i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window.Theme) ipChange.ipc$dispatch("f1de2e2", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(ITMSPage page) {
        d.a createMenuItem;
        d.a createMenuItem2;
        d.a createMenuItem3;
        d.a createMenuItem4;
        d.a createMenuItem5;
        d.a createMenuItem6;
        d.a createMenuItem7;
        d.a createMenuItem8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) qpt.b(IGlobalMenuAdapter.class);
        if (iGlobalMenuAdapter == null) {
            return;
        }
        IGlobalMenuAdapter iGlobalMenuAdapter2 = (IGlobalMenuAdapter) qpt.b(IGlobalMenuAdapter.class);
        com.taobao.themis.kernel.container.ui.titlebar.d globalMenu = iGlobalMenuAdapter2 != null ? iGlobalMenuAdapter2.getGlobalMenu(page) : null;
        if (globalMenu instanceof ITBPublicMenu) {
            TBPublicMenu publicMenu = ((ITBPublicMenu) globalMenu).getPublicMenu();
            q.b(publicMenu, "menu.publicMenu");
            publicMenu.setCustomOverflow(this.b);
            ArrayList arrayList = new ArrayList();
            if (com.taobao.themis.kernel.utils.m.b(page.e())) {
                if (n.f() && (createMenuItem8 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.MORE_CHANNEL)) != null) {
                    arrayList.add(createMenuItem8);
                }
                if (n.g() && (createMenuItem7 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.ADD_TO_DESKTOP)) != null) {
                    arrayList.add(createMenuItem7);
                }
                d.a createMenuItem9 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.COMMENT);
                if (createMenuItem9 != null) {
                    arrayList.add(createMenuItem9);
                }
            } else if (com.taobao.themis.kernel.utils.m.a(page.e())) {
                if (page.b().j() == TMSSolutionType.MINIGAME && (createMenuItem6 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.AUTHORIZE_SETTING)) != null) {
                    arrayList.add(createMenuItem6);
                }
            } else {
                if ((page.b().j() != TMSSolutionType.UNIAPP || (page.b().j() == TMSSolutionType.UNIAPP && kotlin.text.n.b((CharSequence) page.e(), (CharSequence) i.SOURCE_URL, false, 2, (Object) null))) && (createMenuItem = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.SHARE)) != null) {
                    arrayList.add(createMenuItem);
                }
                if (page.b().j() == TMSSolutionType.MINIGAME && (createMenuItem5 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.AUTHORIZE_SETTING)) != null) {
                    arrayList.add(createMenuItem5);
                }
                if (!k.C(page.b()) && (createMenuItem4 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.ABOUT)) != null) {
                    arrayList.add(createMenuItem4);
                }
                if (n.f() && (createMenuItem3 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.MORE_CHANNEL)) != null) {
                    arrayList.add(createMenuItem3);
                }
                if (n.g() && (createMenuItem2 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.ADD_TO_DESKTOP)) != null) {
                    arrayList.add(createMenuItem2);
                }
                d.a createMenuItem10 = iGlobalMenuAdapter.createMenuItem(page, IMenuAction.MenuType.COMMENT);
                if (createMenuItem10 != null) {
                    arrayList.add(createMenuItem10);
                }
            }
            globalMenu.a(arrayList);
        }
        this.c = globalMenu;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.container.ui.titlebar.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void e() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.container.ui.titlebar.d dVar = this.c;
        if (dVar != null) {
            dVar.b();
        }
        com.taobao.themis.kernel.container.ui.titlebar.d dVar2 = this.c;
        if (!(dVar2 instanceof ITBPublicMenu)) {
            dVar2 = null;
        }
        ITBPublicMenu iTBPublicMenu = (ITBPublicMenu) dVar2;
        if (iTBPublicMenu != null && (publicMenu = iTBPublicMenu.getPublicMenu()) != null) {
            publicMenu.setCustomOverflow(this.b);
        }
        if (Window.Theme.LIGHT == this.d) {
            TBActionView tBActionView = this.b;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            TBActionView tBActionView2 = this.b;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(-16777216);
            }
        }
        j();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.themis.kernel.container.ui.titlebar.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void eH_() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f028ac3", new Object[]{this});
        } else if (d() == null) {
        } else {
            com.taobao.themis.kernel.container.ui.titlebar.d dVar = this.c;
            if (dVar != null) {
                dVar.e();
            }
            com.taobao.themis.kernel.container.ui.titlebar.d dVar2 = this.c;
            if (!(dVar2 instanceof ITBPublicMenu)) {
                dVar2 = null;
            }
            ITBPublicMenu iTBPublicMenu = (ITBPublicMenu) dVar2;
            if (iTBPublicMenu != null && (publicMenu = iTBPublicMenu.getPublicMenu()) != null) {
                publicMenu.setCustomOverflow(this.b);
            }
            j();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        this.d = style;
        if (Window.Theme.LIGHT == style) {
            TBActionView tBActionView = this.b;
            if (tBActionView != null) {
                tBActionView.setIconColor(-1);
            }
        } else {
            int parseColor = Color.parseColor("#333333");
            TBActionView tBActionView2 = this.b;
            if (tBActionView2 != null) {
                tBActionView2.setIconColor(parseColor);
            }
        }
        j();
    }
}
