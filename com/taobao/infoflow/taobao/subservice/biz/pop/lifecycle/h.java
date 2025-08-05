package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import tb.kge;
import tb.kyu;
import tb.ljd;
import tb.ljs;

/* loaded from: classes7.dex */
public class h implements IPullRefreshService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kyu f17507a;

    static {
        kge.a(1372698481);
        kge.a(-1877061380);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        }
    }

    public static /* synthetic */ kyu a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kyu) ipChange.ipc$dispatch("f3ec4316", new Object[]{hVar}) : hVar.f17507a;
    }

    public h(ljs ljsVar, kyu kyuVar) {
        this.f17507a = kyuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
        } else {
            ljd.a().a(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.a(h.this).g().a(0.0f, 0.0f);
                    }
                }
            }, 0L);
        }
    }
}
