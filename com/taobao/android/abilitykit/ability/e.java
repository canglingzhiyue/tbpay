package com.taobao.android.abilitykit.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dlb;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_KEY = "811415";

    static {
        kge.a(-2001441364);
    }

    @Override // tb.dlg
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar}) : dlb.a().a(dleVar, dlhVar.c("utAction"), dlhVar.c("pageName"), dlhVar.a("data"));
    }
}
