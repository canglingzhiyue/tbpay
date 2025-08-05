package com.taobao.android.abilitykit.ability;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHAIN_STORAGE_SET_KEY = "-672072475718291693";

    static {
        kge.a(1445003297);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        String c = dlhVar.c("key");
        if (TextUtils.isEmpty(c)) {
            return new dkw(new dkv(10007, "KEY 入参为空"), false);
        }
        Object f = dlhVar.f("value");
        if ("1.0".equals(dlhVar.a())) {
            dleVar.d().put(c, f);
        } else if (!dmp.a(c, dleVar.d(), f)) {
            return new dkw(new dkv(10007, "更新数据出错"), false);
        }
        return new dla();
    }
}
