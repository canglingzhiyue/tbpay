package com.taobao.agoo;

import android.content.Context;
import android.taobao.util.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.a;
import com.taobao.accs.utl.ALog;
import com.taobao.android.launcher.bootstrap.tao.f;
import org.android.agoo.message.MessageReceiverService;
import tb.kge;

/* loaded from: classes4.dex */
public class TaobaoMessageIntentReceiverService extends MessageReceiverService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(204518087);
    }

    public TaobaoMessageIntentReceiverService() {
        f.a("null", "com.taobao.agoo.TaobaoMessageIntentReceiverService");
    }

    @Override // org.android.agoo.message.MessageReceiverService
    public String getIntentServiceClassName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ea303f", new Object[]{this, context});
        }
        ALog.w(k.TAOBAO_TAG, "getPackage Name=" + context.getPackageName(), new Object[0]);
        return a.a(context.getPackageName());
    }
}
