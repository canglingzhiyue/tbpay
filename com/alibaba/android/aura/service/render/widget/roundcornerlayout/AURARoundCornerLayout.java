package com.alibaba.android.aura.service.render.widget.roundcornerlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARoundCornerLayout extends FrameLayout implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a mRoundCornerLayoutHelper;

    static {
        kge.a(-1050194447);
        kge.a(-732782454);
    }

    public static /* synthetic */ Object ipc$super(AURARoundCornerLayout aURARoundCornerLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$001(AURARoundCornerLayout aURARoundCornerLayout, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa23d0f", new Object[]{aURARoundCornerLayout, canvas});
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public AURARoundCornerLayout(Context context) {
        this(context, null);
    }

    public AURARoundCornerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AURARoundCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRoundCornerLayoutHelper = new a(this);
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.b
    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else {
            this.mRoundCornerLayoutHelper.a(f, f2, f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(final Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else {
            this.mRoundCornerLayoutHelper.a(canvas, new Runnable() { // from class: com.alibaba.android.aura.service.render.widget.roundcornerlayout.AURARoundCornerLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AURARoundCornerLayout.access$001(AURARoundCornerLayout.this, canvas);
                    }
                }
            });
        }
    }

    public void setRadius(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eb9878", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == 0) {
            setRadius(f, f, 0.0f, 0.0f);
        } else if (i != 1) {
        } else {
            setRadius(0.0f, 0.0f, f, f);
        }
    }
}
