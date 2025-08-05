package com.taobao.android.abilitykit.ability;

import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes4.dex */
public final class o extends dlg<dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String GETABILITYRESULT = "3025288866970454173";

    static {
        kge.a(188286092);
        Companion = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1788497708);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        return new dla(dlhVar != null ? dlhVar.c() : null);
    }
}
