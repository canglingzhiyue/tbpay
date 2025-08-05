package com.taobao.themis.widget.event;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/event/NativeWidgetNestedRenderContainer;", "Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "context", "Landroid/content/Context;", "gestureMode", "Lcom/taobao/themis/widget/event/GestureMode;", "(Landroid/content/Context;Lcom/taobao/themis/widget/event/GestureMode;)V", "(Landroid/content/Context;)V", "mGestureMode", "startX", "", "startY", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "interceptTouchEvent", "", "isGestureModeInner", "needDispatchTouchEvent", "x", "y", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class NativeWidgetNestedRenderContainer extends TMSEmbed.EmbedRootView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GestureMode mGestureMode;
    private float startX;
    private float startY;

    static {
        kge.a(-1975058289);
    }

    public static /* synthetic */ Object ipc$super(NativeWidgetNestedRenderContainer nativeWidgetNestedRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeWidgetNestedRenderContainer(Context context) {
        super(context);
        q.d(context, "context");
        this.mGestureMode = GestureMode.DEFAULT;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeWidgetNestedRenderContainer(Context context, GestureMode gestureMode) {
        this(context);
        q.d(context, "context");
        q.d(gestureMode, "gestureMode");
        this.mGestureMode = gestureMode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, ev})).booleanValue();
        }
        q.d(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.startX = ev.getX();
            this.startY = ev.getY();
            return super.dispatchTouchEvent(ev);
        } else if (action == 2) {
            if (!needDispatchTouchEvent(ev.getX() - this.startX, ev.getY() - this.startY)) {
                return false;
            }
            interceptTouchEvent();
            return super.dispatchTouchEvent(ev);
        } else {
            return super.dispatchTouchEvent(ev);
        }
    }

    private final boolean needDispatchTouchEvent(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab54876", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        int i = a.$EnumSwitchMapping$0[this.mGestureMode.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return Math.abs(f) > Math.abs(f2);
        } else if (i == 3) {
            return Math.abs(f) < Math.abs(f2);
        } else if (i != 4) {
            return false;
        } else {
            return Math.abs(f) > Math.abs(f2) || isGestureModeInner();
        }
    }

    private final boolean isGestureModeInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb33eff", new Object[]{this})).booleanValue();
        }
        if (getInstance() == null || this.mGestureMode != GestureMode.DEFAULT) {
            return false;
        }
        f nativeWidgetNestedRenderContainer = getInstance();
        return q.a((Object) (nativeWidgetNestedRenderContainer != null ? com.taobao.themis.widget.c.a(nativeWidgetNestedRenderContainer) : null), (Object) "inner");
    }

    private final void interceptTouchEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcf8304", new Object[]{this});
            return;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(true);
    }
}
