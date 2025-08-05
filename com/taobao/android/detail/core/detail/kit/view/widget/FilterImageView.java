package com.taobao.android.detail.core.detail.kit.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class FilterImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int color;

    static {
        kge.a(-295979755);
    }

    public static /* synthetic */ Object ipc$super(FilterImageView filterImageView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FilterImageView(Context context) {
        super(context);
        this.color = 134217728;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.FilterImageView");
    }

    public FilterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.color = 134217728;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.FilterImageView");
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.color = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawColor(this.color);
    }
}
