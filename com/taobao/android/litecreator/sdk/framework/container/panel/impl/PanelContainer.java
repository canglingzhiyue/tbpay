package com.taobao.android.litecreator.sdk.framework.container.panel.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "exceptViewList", "", "Landroid/view/View;", "mRectList", "", "Landroid/graphics/Rect;", "onShow", "", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setExceptViewList", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class PanelContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<? extends View> exceptViewList;
    private final List<Rect> mRectList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/android/litecreator/sdk/framework/container/panel/impl/PanelContainer$onShow$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "litecreator_sdk_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
            }
            PanelContainer.this.getViewTreeObserver().removeOnPreDrawListener(this);
            List<View> access$getExceptViewList$p = PanelContainer.access$getExceptViewList$p(PanelContainer.this);
            if (access$getExceptViewList$p != null) {
                for (View view : access$getExceptViewList$p) {
                    if (view != null) {
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        PanelContainer.access$getMRectList$p(PanelContainer.this).add(new Rect(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight()));
                    }
                }
            }
            return true;
        }
    }

    static {
        kge.a(918451081);
    }

    public static /* synthetic */ Object ipc$super(PanelContainer panelContainer, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelContainer(Context context) {
        super(context);
        q.d(context, "context");
        this.mRectList = new ArrayList();
    }

    public static final /* synthetic */ List access$getExceptViewList$p(PanelContainer panelContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c7ffc6bc", new Object[]{panelContainer}) : panelContainer.exceptViewList;
    }

    public static final /* synthetic */ List access$getMRectList$p(PanelContainer panelContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fe619ef5", new Object[]{panelContainer}) : panelContainer.mRectList;
    }

    public static final /* synthetic */ void access$setExceptViewList$p(PanelContainer panelContainer, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13d3328", new Object[]{panelContainer, list});
        } else {
            panelContainer.exceptViewList = list;
        }
    }

    public final void setExceptViewList(List<? extends View> exceptViewList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a964e296", new Object[]{this, exceptViewList});
            return;
        }
        q.d(exceptViewList, "exceptViewList");
        this.exceptViewList = exceptViewList;
    }

    public final void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        this.mRectList.clear();
        getViewTreeObserver().addOnPreDrawListener(new a());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        for (Rect rect : this.mRectList) {
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
