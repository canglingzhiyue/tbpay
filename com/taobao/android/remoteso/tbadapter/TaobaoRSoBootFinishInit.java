package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import tb.ihq;
import tb.ihu;
import tb.ihw;
import tb.ike;
import tb.ikq;

/* loaded from: classes6.dex */
public final class TaobaoRSoBootFinishInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.c("BootFinishInit.init(), start");
            ike.b = true;
            ihq.b().a("kernelu4_7z_uc", new ihu() { // from class: com.taobao.android.remoteso.tbadapter.TaobaoRSoBootFinishInit.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihu
                public void onFetchFinished(ihw ihwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                    } else {
                        RSoLog.c("TaobaoRSoBootFinishInit fetchAsync kernel uc finished");
                    }
                }
            });
            RSoLog.c("BootFinishInit.init(), done");
        } catch (Throwable th) {
            ikq.a("BootFinishInit.init()  error", th);
        }
    }
}
