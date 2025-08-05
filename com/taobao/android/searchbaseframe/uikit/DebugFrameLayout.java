package com.taobao.android.searchbaseframe.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class DebugFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDebugClickListener;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(55344607);
    }

    public static /* synthetic */ Object ipc$super(DebugFrameLayout debugFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    public DebugFrameLayout(Context context) {
        super(context);
    }

    public DebugFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebugFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public a getDebugClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6de7c09b", new Object[]{this}) : this.mDebugClickListener;
    }

    public void setDebugClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a41bb53", new Object[]{this, aVar});
        } else {
            this.mDebugClickListener = aVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a = false;
        a aVar = this.mDebugClickListener;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        com.taobao.android.xsearchplugin.debugger.protocal.b.f16249a = false;
        a aVar = this.mDebugClickListener;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }
}
