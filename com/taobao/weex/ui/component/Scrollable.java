package com.taobao.weex.ui.component;

import android.view.ViewGroup;
import com.taobao.weex.common.OnWXScrollListener;
import java.util.Map;

/* loaded from: classes9.dex */
public interface Scrollable {
    void addScrolledListener(OnWXScrollListener onWXScrollListener);

    void bindAppearEvent(WXComponent wXComponent);

    void bindDisappearEvent(WXComponent wXComponent);

    void bindStickStyle(WXComponent wXComponent);

    int getOrientation();

    String getRef();

    int getScrollX();

    int getScrollY();

    ViewGroup getView();

    boolean isScrollable();

    void removeScrolledListener(OnWXScrollListener onWXScrollListener);

    void scrollTo(WXComponent wXComponent, Map<String, Object> map);

    void unbindAppearEvent(WXComponent wXComponent);

    void unbindDisappearEvent(WXComponent wXComponent);

    void unbindStickStyle(WXComponent wXComponent);
}
