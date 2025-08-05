package com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends a<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint m;

    static {
        kge.a(1284764724);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1862824439:
                super.b(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case -739012099:
                super.a((Canvas) objArr[0]);
                return null;
            case 1544639176:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public c(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.TimeItem");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.m = new Paint(this.i);
        this.m.setColor(this.e);
        this.m.setStyle(Paint.Style.FILL);
        a();
    }

    public c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4a34a8a4", new Object[]{this, str});
        }
        this.k = str;
        return this;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        canvas.drawRoundRect(this.l, epo.d, epo.d, this.m);
        super.a(canvas);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(i, i2);
        Paint paint = this.m;
        if (paint == null) {
            return;
        }
        paint.setColor(i2);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        a();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.b(i, i2);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = this.i.measureText("00") + (this.g << 1);
        this.c = (this.j.bottom - this.j.top) + (this.h << 1);
    }
}
