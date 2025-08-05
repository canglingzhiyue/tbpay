package com.alibaba.android.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class l extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1324855661);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            JSONObject fields = b().getFields();
            if (fields == null) {
                return;
            }
            eVar.h().a(fields.getString("message"));
        } catch (Throwable th) {
            UnifyLog.d("CommonLoadingSubscriber", th.toString());
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonShowLoadingSubscriber.onHandleEvent", th);
        }
    }
}
