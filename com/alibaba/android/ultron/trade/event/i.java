package com.alibaba.android.ultron.trade.event;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.bmz;
import tb.bnd;
import tb.bnf;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(533804984);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        CharSequence charSequence = (CharSequence) a(0);
        CharSequence charSequence2 = (CharSequence) a(1);
        if (StringUtils.isEmpty(charSequence) || charSequence2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("value", charSequence2.toString());
        bmzVar.a((bnf) new bnd(this.h, this.f));
        a(hashMap);
        b(hashMap);
        if (!"dialog".equalsIgnoreCase(charSequence.toString()) || !d()) {
            return;
        }
        this.f.w().a(this.h, bmzVar);
    }
}
