package com.taobao.android.abilitykit.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dkt;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;
import tb.rlp;

/* loaded from: classes4.dex */
public class q extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POSTMSG_KEY = "5213810857266851316";

    static {
        kge.a(1400321630);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        dkt e = dleVar.e();
        if (e == null) {
            return new dkw(new dkv(rlp.T_BORDER_WIDTH, "引擎为空"), true);
        }
        e.b().a(dlhVar.c("action"), dlhVar.a("data"));
        return new dla();
    }
}
