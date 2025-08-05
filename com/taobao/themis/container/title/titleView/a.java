package com.taobao.themis.container.title.titleView;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 +2\u00020\u0001:\u0001+J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J#\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H&¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0007H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0007H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0007H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0019H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&¨\u0006,"}, d2 = {"Lcom/taobao/themis/container/title/titleView/ITitleView;", "", "addCenterAction", "", "action", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "location", "", "addLeftAction", "index", "addRightAction", "attachPage", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "clearCenterActions", "clearLeftActions", "clearRightActions", "getAction", "T", "cls", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getActions", "", "getBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getContentView", "Landroid/view/View;", "getTitleViewHeight", "hideTitleBar", "animType", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "removeAction", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "setTitleBarAlpha", "alpha", "setTitleBarBackgroundColor", "color", "setTitleBarBackgroundDrawable", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "showTitleBar", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface a {
    public static final int CENTER = 2;
    public static final C0934a Companion = C0934a.f22395a;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/container/title/titleView/ITitleView$Companion;", "", "()V", "CENTER", "", "LEFT", "RIGHT", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.container.title.titleView.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0934a {
        public static final int CENTER = 2;
        public static final int LEFT = 0;
        public static final int RIGHT = 1;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C0934a f22395a;

        static {
            kge.a(-988175671);
            f22395a = new C0934a();
        }

        private C0934a() {
        }
    }

    void addCenterAction(com.taobao.themis.kernel.container.ui.titlebar.a aVar, int i);

    void addLeftAction(com.taobao.themis.kernel.container.ui.titlebar.a aVar);

    void addRightAction(com.taobao.themis.kernel.container.ui.titlebar.a aVar);

    void addRightAction(com.taobao.themis.kernel.container.ui.titlebar.a aVar, int i);

    void attachPage(ITMSPage iTMSPage);

    void clearCenterActions();

    void clearLeftActions();

    void clearRightActions();

    <T> T getAction(Class<T> cls);

    List<com.taobao.themis.kernel.container.ui.titlebar.a> getActions();

    Drawable getBackgroundDrawable();

    View getContentView();

    int getTitleViewHeight();

    void hideTitleBar(NavigatorBarAnimType navigatorBarAnimType);

    void removeAction(com.taobao.themis.kernel.container.ui.titlebar.a aVar);

    void setStyle(Window.Theme theme);

    void setTitleBarAlpha(int i);

    void setTitleBarBackgroundColor(int i);

    void setTitleBarBackgroundDrawable(Drawable drawable);

    void showTitleBar(NavigatorBarAnimType navigatorBarAnimType);
}
