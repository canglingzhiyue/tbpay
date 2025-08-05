package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bca;
import tb.bdx;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class u extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-763118584);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (this.h == null) {
            return;
        }
        if (this.h.getTag() != null && this.h.getTag().startsWith("icartCalculate4Column")) {
            g();
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.h.getFields().put("isExpanded", (Object) Boolean.valueOf(!this.h.getFields().getBooleanValue("isExpanded")));
        this.f25791a.x().m();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IDMComponent iDMComponent = null;
        List<IDMComponent> f = this.f25791a.x().d().f();
        if (f != null) {
            while (true) {
                if (i >= f.size()) {
                    break;
                }
                IDMComponent iDMComponent2 = f.get(i);
                if (TextUtils.equals(iDMComponent2.getTag(), "checkedItemList")) {
                    iDMComponent = iDMComponent2;
                    break;
                }
                i++;
            }
        }
        if (iDMComponent == null) {
            return;
        }
        iDMComponent.getFields().put("isExpanded", (Object) Boolean.valueOf(!iDMComponent.getFields().getBooleanValue("isExpanded")));
        this.f25791a.x().i();
    }
}
