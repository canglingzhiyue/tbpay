package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import tb.bca;
import tb.bei;
import tb.bez;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class f extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-241140166);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        if (!"true".equals((String) bmzVar.b("isChecked")) && a(this.h)) {
            z = false;
        }
        b(this.h, z);
        a(this.h, z);
        bez x = this.f25791a.x();
        if (x == null) {
            return;
        }
        x.g();
    }

    private boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("_addItemIsChecked") && "true".equals(fields.getString("_addItemIsChecked"));
    }

    private void a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6484868", new Object[]{this, iDMComponent, new Boolean(z)});
            return;
        }
        for (IDMComponent iDMComponent2 : bei.a(iDMComponent, this.f25791a)) {
            b(iDMComponent2, z);
        }
    }

    private void b(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fe1529", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (iDMComponent == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("_addItemIsChecked", String.valueOf(z));
            a(iDMComponent, hashMap);
        }
    }
}
