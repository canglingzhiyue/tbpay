package com.taobao.weex.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class WXAbstractRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean mHasConsumeEvent;
    public WeakReference<WXSDKInstance> mSDKInstance;

    static {
        kge.a(-1324920406);
    }

    public static /* synthetic */ Object ipc$super(WXAbstractRenderContainer wXAbstractRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public void createInstanceRenderView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f825077d", new Object[]{this, str});
        }
    }

    public WXAbstractRenderContainer(Context context) {
        super(context);
        this.mHasConsumeEvent = false;
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasConsumeEvent = false;
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasConsumeEvent = false;
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHasConsumeEvent = false;
    }

    public void setSDKInstance(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5aec3a", new Object[]{this, wXSDKInstance});
        } else {
            this.mSDKInstance = new WeakReference<>(wXSDKInstance);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        WeakReference<WXSDKInstance> weakReference = this.mSDKInstance;
        if (weakReference == null || (wXSDKInstance = weakReference.get()) == null) {
            return;
        }
        wXSDKInstance.c(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mHasConsumeEvent = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean hasConsumeEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a0f5c43", new Object[]{this})).booleanValue() : this.mHasConsumeEvent;
    }
}
