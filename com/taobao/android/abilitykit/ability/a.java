package com.taobao.android.abilitykit.ability;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHAIN_STORAGE_REMOVE_KEY = "6114190708471994712";

    static {
        kge.a(-715968595);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        String c = dlhVar.c("key");
        if (StringUtils.isEmpty(c)) {
            return new dkw(new dkv(10008, "KEY 入参为空"), false);
        }
        dleVar.d().remove(c);
        return new dla();
    }
}
