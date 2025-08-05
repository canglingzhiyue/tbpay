package com.taobao.themis.kernel.container.ui.titlebar;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;

/* loaded from: classes9.dex */
public interface b {
    boolean addRightButton(Drawable drawable, View.OnClickListener onClickListener);

    boolean addRightButton(String str, View.OnClickListener onClickListener);

    boolean addRightButton(String str, String str2, View.OnClickListener onClickListener);

    void attachPage(ITMSPage iTMSPage);

    <T> T getAction(Class<T> cls);

    View getContentView();

    boolean hideTitleBar(NavigatorBarAnimType navigatorBarAnimType);

    /* renamed from: isTranslucent */
    boolean mo1497isTranslucent();

    void onDestroy();

    void onHide();

    void onShow();

    void removeAction(a aVar);

    void resetBackground();

    void resetTitle(ITMSPage iTMSPage);

    boolean setStyle(Window.Theme theme);

    boolean setTitle(String str, Drawable drawable);

    boolean setTitle(String str, String str2);

    void setTitleBarBgColor(int i);

    void setTitleBarBgDrawable(Drawable drawable);

    void setTitleBarBgDrawable(String str);

    boolean setTitleColor(Integer num);

    boolean setTranslucent(boolean z);

    boolean showTitleBar(NavigatorBarAnimType navigatorBarAnimType);
}
