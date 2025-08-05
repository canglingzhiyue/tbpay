package com.alibaba.android.ultron.trade.event;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1308345869);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -796173974) {
            super.b((bmz) objArr[0]);
            return null;
        } else if (hashCode != 677690238) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    @Override // com.alibaba.android.ultron.trade.event.n, com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else {
            super.b(bmzVar);
        }
    }

    @Override // com.alibaba.android.ultron.trade.event.n
    public void a(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864bb7e", new Object[]{this, intent, new Integer(i)});
        } else if (i != -1 || intent == null) {
            f();
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) c.KEY_STATUS_H5_ASYNC_REQUEST);
            a(this.b, jSONObject);
            super.a(intent, i);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "H5Back");
        a(this.b, jSONObject);
        this.f.w().b(this.h);
    }
}
