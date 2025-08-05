package com.taobao.android.searchbaseframe.business.srp.page.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public class RoundFrameLayout extends FrameLayout implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final b clip;

    static {
        kge.a(1921523287);
        kge.a(1075220821);
    }

    public static /* synthetic */ Object ipc$super(RoundFrameLayout roundFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.page.uikit.a
    public void setTopOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843a6316", new Object[]{this, new Integer(i)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundFrameLayout(Context context) {
        super(context);
        q.c(context, "context");
        this.clip = new b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        this.clip.a(canvas);
        super.dispatchDraw(canvas);
        this.clip.b(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.clip.a();
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.page.uikit.a
    public void setTopRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
        } else {
            this.clip.a(i);
        }
    }

    public void setBottomRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aad469d", new Object[]{this, new Integer(i)});
        } else {
            this.clip.b(i);
        }
    }
}
