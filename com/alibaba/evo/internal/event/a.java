package com.alibaba.evo.internal.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.n;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bwq;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class a implements com.alibaba.ut.abtest.event.b<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-21026205);
        kge.a(1000651436);
    }

    @Override // com.alibaba.ut.abtest.event.b
    public void onEvent(com.alibaba.ut.abtest.event.a<b> aVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f15b7a0", new Object[]{this, aVar});
            return;
        }
        h.e("ExperimentBetaDataV5EventListener", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT);
        if (aVar == null || aVar.b() == null) {
            h.e("ExperimentBetaDataV5EventListener", "【Beta实验数据】数据内容为空，停止处理！");
            return;
        }
        b b = aVar.b();
        synchronized (this) {
            String str = n.a(cex.a().r()) + b.c;
            if (StringUtils.equals(str, cex.a().i().g())) {
                h.f("ExperimentBetaDataV5EventListener", "【Beta实验数据V5】未发现新数据。本地数据签名：" + str);
                return;
            }
            cex.a().i().b(b.c);
            com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_DATA_REACH_TYPE, "" + aVar.c());
            try {
                a(b);
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("ExperimentBetaDataV5EventListener.onEvent", th);
            }
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c184aa", new Object[]{this, bVar});
            return;
        }
        long b = bwq.a().b(bVar.b, bVar.c, bVar.f2927a);
        if (b > 0) {
            return;
        }
        h.f("ExperimentBetaDataV5EventListener", "【实验数据】数据文件下载任务添加失败，任务ID：" + b);
    }
}
