package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ddg;
import tb.kcn;
import tb.kge;

/* loaded from: classes6.dex */
public class ah implements ddg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16455a = "##" + System.currentTimeMillis() + "##";

    static {
        kge.a(-1017852058);
        kge.a(337719401);
    }

    @Override // tb.ddg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kcn.a("TBDWInstance", this.f16455a + str);
    }

    @Override // tb.ddg
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        kcn.b("TBDWInstance", this.f16455a + str);
    }

    @Override // tb.ddg
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        kcn.c("TBDWInstance", this.f16455a + str);
    }
}
