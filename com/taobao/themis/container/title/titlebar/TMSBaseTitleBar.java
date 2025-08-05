package com.taobao.themis.container.title.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.container.title.action.base.c;
import com.taobao.themis.container.title.action.base.e;
import com.taobao.themis.container.title.titleView.TMSTitleView;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.extension.page.ae;
import com.taobao.themis.kernel.extension.page.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.uc.webview.export.media.MessageID;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qov;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001c\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010%2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001c\u0010&\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001c\u0010&\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010%2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010%2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J#\u0010/\u001a\u0004\u0018\u0001H0\"\u0004\b\u0000\u001002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H002H\u0016¢\u0006\u0002\u00103J\n\u00104\u001a\u0004\u0018\u000105H\u0004J\b\u00106\u001a\u00020\u001bH\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0006H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010?\u001a\u00020*H\u0016J\b\u0010@\u001a\u00020*H\u0016J\b\u0010A\u001a\u00020*H\u0016J\u0010\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020*H\u0016J\u0010\u0010F\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u001bH\u0016J\u0010\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0015H\u0016J\u001c\u0010K\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010%2\b\u0010M\u001a\u0004\u0018\u00010\"H\u0016J\u001c\u0010K\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010%2\b\u0010N\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010O\u001a\u00020*2\b\b\u0001\u0010P\u001a\u00020\u001bH\u0016J\u0012\u0010Q\u001a\u00020*2\b\u0010M\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010Q\u001a\u00020*2\b\u0010R\u001a\u0004\u0018\u00010%H\u0016J\u0019\u0010S\u001a\u00020\u00062\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010TJ\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010U\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006V"}, d2 = {"Lcom/taobao/themis/container/title/titlebar/TMSBaseTitleBar;", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isTranslucent", "", "()Ljava/lang/Boolean;", "setTranslucent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mContext", "getMContext", "()Landroid/content/Context;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getMPage", "()Lcom/taobao/themis/kernel/page/ITMSPage;", "setMPage", "(Lcom/taobao/themis/kernel/page/ITMSPage;)V", "mStyle", "Lcom/taobao/themis/kernel/container/Window$Theme;", "getMStyle", "()Lcom/taobao/themis/kernel/container/Window$Theme;", "setMStyle", "(Lcom/taobao/themis/kernel/container/Window$Theme;)V", "mTitleBarBackgroundColor", "", "mTitleView", "Lcom/taobao/themis/container/title/titleView/ITitleView;", "getMTitleView", "()Lcom/taobao/themis/container/title/titleView/ITitleView;", "addLeftButton", "icon", "Landroid/graphics/drawable/Drawable;", DataReceiveMonitor.CB_LISTENER, "Landroid/view/View$OnClickListener;", "", "addRightButton", "lightIcon", "darkIcon", "attachPage", "", "page", "clearCenterButtons", "clearLeftButtons", "clearRightButtons", "getAction", "T", "cls", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getActivity", "Landroid/app/Activity;", "getBarHeight", "getContentView", "Landroid/view/View;", "getTitleColor", "", "hideTitleBar", "type", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "isDarkTheme", MessageID.onDestroy, "onHide", "onShow", "removeAction", "action", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "resetBackground", "resetTitle", "setAlpha", "alpha", "setStyle", "style", "setTitle", "title", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "image", "setTitleBarBgColor", "color", "setTitleBarBgDrawable", "url", "setTitleColor", "(Ljava/lang/Integer;)Z", "showTitleBar", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class TMSBaseTitleBar implements com.taobao.themis.kernel.container.ui.titlebar.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.themis.container.title.titleView.a f22400a;
    private final Context b;
    private ITMSPage c;
    private Boolean d;
    private int e;
    private Window.Theme f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/container/title/titlebar/TMSBaseTitleBar$setTitleBarBgDrawable$1", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$ImageListener;", "onImageFinish", "", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "Landroid/graphics/drawable/Drawable;", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements IImageAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.themis.kernel.adapter.IImageAdapter.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            } else if (drawable == null) {
            } else {
                TMSBaseTitleBar.this.getMTitleView().setTitleBarBackgroundDrawable(drawable);
            }
        }
    }

    static {
        kge.a(1008365453);
        kge.a(1231319233);
    }

    public TMSBaseTitleBar(Context context) {
        q.d(context, "context");
        this.f = Window.Theme.LIGHT;
        this.e = -1;
        this.b = context;
        this.f22400a = new TMSTitleView(context);
    }

    public final com.taobao.themis.container.title.titleView.a getMTitleView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.container.title.titleView.a) ipChange.ipc$dispatch("c7b5ba4a", new Object[]{this}) : this.f22400a;
    }

    public final Context getMContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6f648077", new Object[]{this}) : this.b;
    }

    public final void setMPage(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ff598c", new Object[]{this, iTMSPage});
        } else {
            this.c = iTMSPage;
        }
    }

    public final ITMSPage getMPage() {
        ITMSPage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("26554f74", new Object[]{this});
        }
        ITMSPage iTMSPage = this.c;
        return (iTMSPage == null || (a2 = ae.Companion.a(iTMSPage)) == null) ? this.c : a2;
    }

    public final Window.Theme getMStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window.Theme) ipChange.ipc$dispatch("7cc8d833", new Object[]{this}) : this.f;
    }

    public final void setMStyle(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c186d95", new Object[]{this, theme});
            return;
        }
        q.d(theme, "<set-?>");
        this.f = theme;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    /* renamed from: isTranslucent */
    public final Boolean mo1497isTranslucent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("27e468d3", new Object[]{this}) : this.d;
    }

    public final void setTranslucent(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57f43ef", new Object[]{this, bool});
        } else {
            this.d = bool;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void attachPage(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        this.c = page;
        this.f22400a.attachPage(page);
        this.e = qqc.i(page);
        if (!qqc.e(page)) {
            setTitle(qqc.f(page), qqc.h(page));
        }
        Integer g = qqc.g(page);
        if (g != null) {
            setTitleColor(Integer.valueOf(g.intValue()));
        }
        setTitleBarBgColor(qqc.i(page));
        if (qqc.d(page)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        }
        setStyle(qqc.c(page));
    }

    public boolean addLeftButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a0a2bb2", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        qov qovVar = new qov();
        qovVar.a(str, onClickListener);
        this.f22400a.addLeftAction(qovVar);
        return true;
    }

    public boolean addLeftButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b9a258", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (drawable == null) {
            return false;
        }
        qov qovVar = new qov();
        qovVar.a(drawable, onClickListener);
        this.f22400a.addLeftAction(qovVar);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad477f9f", new Object[]{this, str, onClickListener})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        qov qovVar = new qov();
        qovVar.a(str, onClickListener);
        this.f22400a.addRightAction(qovVar);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(Drawable drawable, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324b505", new Object[]{this, drawable, onClickListener})).booleanValue();
        }
        if (drawable == null) {
            return false;
        }
        qov qovVar = new qov();
        qovVar.a(drawable, onClickListener);
        this.f22400a.addRightAction(qovVar);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean addRightButton(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1873dd15", new Object[]{this, str, str2, onClickListener})).booleanValue();
        }
        if (getMPage() == null) {
            return false;
        }
        qov qovVar = (qov) this.f22400a.getAction(qov.class);
        if (qovVar == null) {
            qov qovVar2 = new qov();
            this.f22400a.addRightAction(qovVar2);
            ITMSPage mPage = getMPage();
            q.a(mPage);
            qovVar2.a(mPage);
            qovVar2.a(str, str2, onClickListener);
        } else {
            qovVar.a(str, str2, onClickListener);
        }
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void setTitleBarBgDrawable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a07391", new Object[]{this, str});
            return;
        }
        IImageAdapter.b bVar = new IImageAdapter.b();
        bVar.a(1);
        IImageAdapter iImageAdapter = (IImageAdapter) qpt.b(IImageAdapter.class);
        if (iImageAdapter == null) {
            return;
        }
        iImageAdapter.loadImage(str, bVar, new a());
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void setTitleBarBgDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9c292b", new Object[]{this, drawable});
        } else if (drawable == null) {
        } else {
            this.f22400a.setTitleBarBackgroundDrawable(drawable);
            this.f22400a.setTitleBarAlpha(255);
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void setTitleBarBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b465dbb", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        this.f22400a.setTitleBarBackgroundColor(i);
        this.f22400a.setTitleBarAlpha(255);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void resetBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eff85e4", new Object[]{this});
            return;
        }
        setStyle(this.f);
        Boolean bool = this.d;
        if (bool == null) {
            return;
        }
        setTranslucent(bool.booleanValue());
    }

    public int getBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("134482de", new Object[]{this})).intValue() : this.f22400a.getTitleViewHeight();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setStyle(Window.Theme style) {
        i iVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f45710", new Object[]{this, style})).booleanValue();
        }
        q.d(style, "style");
        ITMSPage mPage = getMPage();
        if (mPage != null && (iVar = (i) mPage.a(i.class)) != null) {
            if (style == Window.Theme.LIGHT) {
                z = true;
            }
            iVar.b(z);
        }
        this.f22400a.setStyle(style);
        this.f = style;
        return true;
    }

    public boolean isDarkTheme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77b079f4", new Object[]{this})).booleanValue() : this.f == Window.Theme.DARK;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setTitle(String str, String str2) {
        com.taobao.themis.container.title.action.base.a aVar;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152bd735", new Object[]{this, str, str2})).booleanValue();
        }
        String str3 = str2;
        if (!(str3 == null || str3.length() == 0) && (cVar = (c) getAction(c.class)) != null) {
            cVar.b(str2);
            return true;
        }
        String str4 = str;
        if ((str4 == null || str4.length() == 0) || (aVar = (com.taobao.themis.container.title.action.base.a) getAction(com.taobao.themis.container.title.action.base.a.class)) == null) {
            return false;
        }
        aVar.a(str);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setTitleColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d62fee07", new Object[]{this, num})).booleanValue();
        }
        com.taobao.themis.container.title.action.base.a aVar = (com.taobao.themis.container.title.action.base.a) getAction(com.taobao.themis.container.title.action.base.a.class);
        if (aVar != null) {
            aVar.a(num);
        }
        return true;
    }

    public long getTitleColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63b37dc", new Object[]{this})).longValue();
        }
        if (!(this.f22400a.getBackgroundDrawable() instanceof ColorDrawable)) {
            return 0L;
        }
        Drawable backgroundDrawable = this.f22400a.getBackgroundDrawable();
        if (backgroundDrawable == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        }
        return ((ColorDrawable) backgroundDrawable).getColor();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean showTitleBar(NavigatorBarAnimType type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdaae89c", new Object[]{this, type})).booleanValue();
        }
        q.d(type, "type");
        if (this.f22400a.getContentView().getVisibility() != 0) {
            onShow();
        }
        this.f22400a.showTitleBar(type);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean hideTitleBar(NavigatorBarAnimType type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3b5c0f7", new Object[]{this, type})).booleanValue();
        }
        q.d(type, "type");
        if (this.f22400a.getContentView().getVisibility() == 0) {
            onHide();
        }
        this.f22400a.hideTitleBar(type);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setTitle(String str, Drawable drawable) {
        com.taobao.themis.container.title.action.base.a aVar;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cb1e4cf", new Object[]{this, str, drawable})).booleanValue();
        }
        if (drawable != null && (cVar = (c) getAction(c.class)) != null) {
            cVar.a(drawable);
            return true;
        } else if (str == null || (aVar = (com.taobao.themis.container.title.action.base.a) getAction(com.taobao.themis.container.title.action.base.a.class)) == null) {
            return false;
        } else {
            aVar.a(str);
            return true;
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public boolean setTranslucent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579b6bfa", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.f22400a.setTitleBarAlpha(0);
            this.f22400a.setTitleBarBackgroundColor(0);
        } else {
            this.f22400a.setTitleBarAlpha(255);
            this.f22400a.setTitleBarBackgroundColor(this.e);
        }
        this.d = Boolean.valueOf(z);
        return true;
    }

    public boolean setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d144fec4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.f22400a.setTitleBarAlpha(i);
        return true;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        for (com.taobao.themis.kernel.container.ui.titlebar.a aVar : this.f22400a.getActions()) {
            aVar.e();
        }
        this.f22400a.setStyle(this.f);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        for (com.taobao.themis.kernel.container.ui.titlebar.a aVar : this.f22400a.getActions()) {
            aVar.f();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    /* renamed from: isTranslucent  reason: collision with other method in class */
    public boolean mo1497isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.d;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.f22400a.getContentView();
    }

    public void clearLeftButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323326f4", new Object[]{this});
        } else {
            this.f22400a.clearLeftActions();
        }
    }

    public void clearRightButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc31839", new Object[]{this});
        } else {
            this.f22400a.clearRightActions();
        }
    }

    public void clearCenterButtons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b82d26", new Object[]{this});
        } else {
            this.f22400a.clearCenterActions();
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public <T> T getAction(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b5e78488", new Object[]{this, cls});
        }
        q.d(cls, "cls");
        return (T) this.f22400a.getAction(cls);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void removeAction(com.taobao.themis.kernel.container.ui.titlebar.a action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f544f32", new Object[]{this, action});
            return;
        }
        q.d(action, "action");
        action.g();
        this.f22400a.removeAction(action);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void resetTitle(ITMSPage page) {
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("845963fb", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        setTitle(qqc.f(page), qqc.h(page));
        setTitleColor(qqc.g(page));
        setTitleBarBgColor(qqc.i(page));
        com.taobao.themis.container.title.action.base.b bVar = (com.taobao.themis.container.title.action.base.b) getAction(com.taobao.themis.container.title.action.base.b.class);
        if (bVar != null) {
            Window c = page.c().e().c();
            if (q.a((Object) (c != null ? c.o() : null), (Object) false)) {
                bVar.a();
            } else {
                bVar.b();
            }
        }
        e eVar = (e) getAction(e.class);
        if (eVar != null) {
            if (page.c().n() != null) {
                Object n = page.c().n();
                if (n == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                }
                Map map = (Map) n;
                Object obj = map.get(com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str = (String) obj;
                Object obj2 = map.get(com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_DARK_IMAGE_URL);
                if (obj2 != null) {
                    eVar.a(str, (String) obj2, (View.OnClickListener) map.get("onClick"));
                    eVar.b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                eVar.a();
            }
        }
        setStyle(qqc.c(page));
        qpm f = page.f();
        if (f != null && (pageContainer = f.getPageContainer()) != null) {
            pageContainer.a(qqc.b(page));
        }
        if (qqc.d(page)) {
            hideTitleBar(NavigatorBarAnimType.NULL);
        } else {
            showTitleBar(NavigatorBarAnimType.NULL);
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (com.taobao.themis.kernel.container.ui.titlebar.a aVar : this.f22400a.getActions()) {
            aVar.g();
        }
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        Context context = this.b;
        if (!(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }
}
