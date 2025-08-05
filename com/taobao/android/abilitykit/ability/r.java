package com.taobao.android.abilitykit.ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.g;
import tb.dkt;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmo;
import tb.kge;

/* loaded from: classes4.dex */
public class r extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBEMSG_KEY = "5073668281949529077";

    static {
        kge.a(404494654);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        dkt e = dleVar.e();
        if (e == null) {
            return new dkw(new dkv(10013, "引擎为空"), true);
        }
        if (dmo.a(dlhVar.c(), "replace", false)) {
            e.b().a(dlhVar.c("action"));
        }
        e.b().a(dlhVar.c("action"), new g.a(dllVar, dleVar, "true".equals(dlhVar.c("receiveOnce"))));
        return new dla();
    }
}
