package com.alibaba.triver.cannal_engine.event;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes3.dex */
public class WidgetRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean gestureModeInner;
    public WeakReference<App> mAppRef;
    public GestureMode mGestureMode;
    public b mWidgetTouchEventBridge;

    /* loaded from: classes3.dex */
    public enum GestureMode {
        DEFAULT,
        NONE,
        VERTICAL,
        HORIZONTAL,
        ALL
    }

    static {
        kge.a(-459070171);
    }

    public static /* synthetic */ Object ipc$super(WidgetRenderContainer widgetRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WidgetRenderContainer(Context context) {
        super(context);
        this.mGestureMode = GestureMode.DEFAULT;
        this.gestureModeInner = false;
        this.mWidgetTouchEventBridge = new b();
    }

    public WidgetRenderContainer(Context context, GestureMode gestureMode) {
        super(context);
        this.mGestureMode = GestureMode.DEFAULT;
        this.gestureModeInner = false;
        this.mGestureMode = gestureMode;
        this.mWidgetTouchEventBridge = new b();
    }

    public void setApp(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa27c87a", new Object[]{this, app});
            return;
        }
        b bVar = this.mWidgetTouchEventBridge;
        if (bVar != null) {
            bVar.a(app);
        }
        this.mAppRef = new WeakReference<>(app);
    }

    public void setGestureMode(GestureMode gestureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5122f873", new Object[]{this, gestureMode});
        } else {
            this.mGestureMode = gestureMode;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        WeakReference<App> weakReference = this.mAppRef;
        if (weakReference != null && weakReference.get() != null && this.mGestureMode == GestureMode.DEFAULT) {
            this.gestureModeInner = TextUtils.equals(this.mAppRef.get().getStringValue("gestureMode"), "inner");
        }
        b bVar = this.mWidgetTouchEventBridge;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return dispatchWidgetTouchEvent(motionEvent);
    }

    public boolean dispatchWidgetTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34545ab9", new Object[]{this, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }
}
