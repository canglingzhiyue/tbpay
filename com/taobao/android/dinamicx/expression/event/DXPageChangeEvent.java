package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DXPageChangeEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isTouched;
    public int pageIndex;

    static {
        kge.a(-2000244754);
    }

    public DXPageChangeEvent(long j) {
        super(j);
    }

    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            setPageIndex(i, false);
        }
    }

    public void setPageIndex(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7026b379", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.pageIndex = i;
        this.isTouched = z;
        if (this.args == null) {
            this.args = new HashMap();
        }
        this.args.put(MtopModule.KEY_PAGE_INDEX, f.a(i));
        this.args.put("isTouched", f.a(z));
        this.args.put("fromAutoScroll", f.a(!z));
    }
}
