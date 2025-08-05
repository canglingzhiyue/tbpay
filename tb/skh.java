package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface skh {
    int getActionBarHeight();

    ViewStub getAlbumDetailStub();

    int getAndSetTopLayoutVisibility(int i);

    ViewGroup getAnimLayout();

    skf getContainer();

    ViewGroup getContentView();

    ViewStub getGoodListStub();

    DefaultGestureCollectorDelegateLayout getMainContentView();

    View getMoreButton();

    int getOldActionBarHeight();

    String getRawId();

    int getWindowHeight();

    int getWindowWidth();

    void hideCacheLoading();

    void hideErrorView();

    void hideExposedLoadingLayout();

    void hideLoading();

    void initErrorAndRefresh();

    boolean isFirstCardFromRefresh();

    boolean isHasPreRender();

    boolean isHighActionbar();

    boolean isLoading();

    boolean isTab3GuideShoppingVersion();

    void preRender();

    void refresh();

    void refresh(Map map, boolean z);

    void refresh(Map map, boolean z, boolean z2, boolean z3);

    void refreshWithCallback(skd skdVar);

    void renderContainer(Context context);

    void setContainerSize(int i, int i2);

    void setFirstCardFromRefresh(boolean z);

    void setLockedTouchEvent(boolean z);

    void setPendingRunnable(Runnable runnable);

    void setRotateAnimation(RotateAnimation rotateAnimation);

    void showExposedLoadingLayout();

    void showNoPermissionError(Object obj);

    void updateView(boolean z, List<a> list);
}
