package com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends a<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(150659272);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862824439) {
            super.b(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1544639176) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public b(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.DotItem");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.i.setColor(this.e);
        this.k = ":";
        this.g = epo.d;
        a();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.a
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(i, i2);
        if (this.i == null) {
            return;
        }
        this.i.setColor(i2);
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
        this.b = this.i.measureText(":") + (this.g << 1);
        this.c = (this.j.bottom - this.j.top) + (this.h << 1);
    }
}
