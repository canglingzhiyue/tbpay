package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class n extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1493299861);
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
            String string = fields.getString("message");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            com.alibaba.android.ultron.vfw.widget.a.a(eVar.a(), string);
        } catch (Throwable th) {
            UnifyLog.d("ToastSubscriber", th.toString());
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonToastSubscriber.onHandleEvent", th);
        }
    }
}
