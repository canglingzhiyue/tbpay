package com.alibaba.android.ultron.event.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1246306565);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -1069556256) {
            super.d((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.t, com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-6897220322575373868";
    }

    @Override // com.alibaba.android.ultron.event.ext.t, com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (e(eVar) != null && eVar.d() != null && f(eVar) && ((fields = eVar.d().getFields()) == null || !fields.containsKey("asyncStatus") || !"success".equals(fields.getString("asyncStatus")))) {
        } else {
            super.d(eVar);
        }
    }
}
