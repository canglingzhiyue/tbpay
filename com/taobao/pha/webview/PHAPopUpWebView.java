package com.taobao.pha.webview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PHAPopUpWebView extends PHAWVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRadius;
    private int mScrollY;

    static {
        kge.a(-621883705);
    }

    public static /* synthetic */ Object ipc$super(PHAPopUpWebView pHAPopUpWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1253202540) {
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 143825882) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            }
        }
        return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
    }

    public PHAPopUpWebView(Context context, Map<String, Object> map) {
        super(context);
        this.mScrollY = 0;
        this.mRadius = 0.0f;
        if (map != null) {
            Object obj = map.get("radius");
            if (!(obj instanceof Float)) {
                return;
            }
            this.mRadius = ((Float) obj).floatValue();
        }
    }

    @Override // com.taobao.pha.webview.PHAWVUCWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent findViewParentIfNeeds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && canScrollDown() && (findViewParentIfNeeds = findViewParentIfNeeds(this)) != null) {
            findViewParentIfNeeds.requestDisallowInterceptTouchEvent(true);
        }
        return super.coreDispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.pha.webview.PHAWVUCWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        ViewParent findViewParentIfNeeds;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        this.mScrollY = i4;
        if (!canScrollDown() && (findViewParentIfNeeds = findViewParentIfNeeds(this)) != null) {
            findViewParentIfNeeds.requestDisallowInterceptTouchEvent(false);
        }
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.mRadius > 0.0f) {
            Path path = new Path();
            float f = this.mRadius;
            path.addRoundRect(new RectF(0.0f, getScrollY(), getWidth(), getScrollY() + getHeight()), new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    private static ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{view});
        }
        if (view.getParent() == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            return view.getParent();
        }
        if (!(view.getParent() instanceof View)) {
            return null;
        }
        return findViewParentIfNeeds((View) view.getParent());
    }

    private boolean canScrollDown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aec9160a", new Object[]{this})).booleanValue() : this.mScrollY > 0;
    }
}
