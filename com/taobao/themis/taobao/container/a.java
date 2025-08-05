package com.taobao.themis.taobao.container;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.k;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/taobao/container/TBDefaultMoreAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/IMenuAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "()V", "mContext", "Landroid/content/Context;", "mMenu", "Lcom/taobao/themis/taobao/container/TMSTBMenu;", "mStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "moreAction", "Lcom/taobao/uikit/actionbar/TBActionView;", "addItem", "", "item", "Lcom/taobao/themis/kernel/container/ui/titlebar/IGlobalMenu$TMSMenuItem;", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getView", "Landroid/view/View;", "context", "hideMenu", "onHide", "onShow", "removeItem", "resetMenu", "setCustomIconColor", "setStyle", "style", "showMenu", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends com.taobao.themis.kernel.container.ui.titlebar.a implements IMenuAction {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22821a;
    private TBActionView b;
    private e c;
    private Window.Theme d;

    static {
        kge.a(2133865125);
        kge.a(-1271686885);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -78343661) {
            super.a((ITMSPage) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        this.f22821a = context;
        if (this.b == null) {
            View inflate = View.inflate(context, R.layout.tms_tb_more_view, null);
            if (inflate == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
            }
            TBActionView tBActionView = (TBActionView) inflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 44.0f), k.a(context, 44.0f));
            layoutParams.gravity = 8388627;
            t tVar = t.INSTANCE;
            tBActionView.setLayoutParams(layoutParams);
            View iconView = tBActionView.getIconView();
            q.b(iconView, "iconView");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(k.a(context, 24.0f), k.a(context, 24.0f));
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(k.a(context, 6.0f));
            t tVar2 = t.INSTANCE;
            iconView.setLayoutParams(layoutParams2);
            tBActionView.setContentDescription("更多");
            t tVar3 = t.INSTANCE;
            this.b = tBActionView;
        }
        return this.b;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        super.a(page);
        b();
        e eVar = new e(page);
        eVar.getPublicMenu().setCustomOverflow(this.b);
        t tVar = t.INSTANCE;
        this.c = eVar;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void e() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        e eVar = this.c;
        if (eVar != null) {
            eVar.b();
        }
        e eVar2 = this.c;
        if (eVar2 != null && (publicMenu = eVar2.getPublicMenu()) != null) {
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
        b();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void eH_() {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f028ac3", new Object[]{this});
        } else if (d() == null) {
        } else {
            e eVar = this.c;
            if (eVar != null) {
                eVar.e();
            }
            e eVar2 = this.c;
            if (eVar2 != null && (publicMenu = eVar2.getPublicMenu()) != null) {
                publicMenu.setCustomOverflow(this.b);
            }
            b();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.IMenuAction
    public void a(d.a item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7959c39", new Object[]{this, item});
            return;
        }
        q.d(item, "item");
        e eVar = this.c;
        if (eVar == null) {
            return;
        }
        eVar.a(p.a(item));
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
        if (Window.Theme.DARK == style) {
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
        b();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (Window.Theme.LIGHT == this.d) {
            TBActionView tBActionView = this.b;
            if (tBActionView == null) {
                return;
            }
            tBActionView.setIconColor(-16777216);
        } else {
            TBActionView tBActionView2 = this.b;
            if (tBActionView2 == null) {
                return;
            }
            tBActionView2.setIconColor(-1);
        }
    }
}
