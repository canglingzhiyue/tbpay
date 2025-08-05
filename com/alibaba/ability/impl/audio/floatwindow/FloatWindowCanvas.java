package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class FloatWindowCanvas extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int attachedActivityHash;

    static {
        kge.a(1046734143);
    }

    public FloatWindowCanvas(Context context) {
        this(context, null, 2, null);
    }

    public /* synthetic */ FloatWindowCanvas(Context context, AttributeSet attributeSet, int i, o oVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatWindowCanvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.d(context, "context");
        this.attachedActivityHash = -1;
    }

    public final int getAttachedActivityHash() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d86e71f1", new Object[]{this})).intValue() : this.attachedActivityHash;
    }

    public final void setAttachedActivityHash(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2c9939", new Object[]{this, new Integer(i)});
        } else {
            this.attachedActivityHash = i;
        }
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue() : getChildCount() == 0;
    }

    public final boolean containsFloatWindow(AbsFloatWindow child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f62a71b2", new Object[]{this, child})).booleanValue();
        }
        q.d(child, "child");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == child) {
                return true;
            }
        }
        return false;
    }

    public final void addViewByLevel(AbsFloatWindow child, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62230ef", new Object[]{this, child, new Integer(i)});
            return;
        }
        q.d(child, "child");
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.impl.audio.floatwindow.AbsFloatWindow");
            }
            int i3 = ((AbsFloatWindow) childAt).level;
            if (i3 == i) {
                return;
            }
            if (i3 > i) {
                addView(child, i2);
                return;
            }
        }
        addView(child);
    }
}
