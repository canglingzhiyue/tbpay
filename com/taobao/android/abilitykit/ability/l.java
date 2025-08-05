package com.taobao.android.abilitykit.ability;

import android.content.Context;
import android.os.Handler;
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
public final class l extends dlg<dle> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String DELAY = "17315434034580";

    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dle f8911a;
        public final /* synthetic */ dll b;

        public b(dle dleVar, dll dllVar) {
            this.f8911a = dleVar;
            this.b = dllVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            dll dllVar = this.b;
            if (dllVar == null) {
                return;
            }
            dllVar.callback("onComplete", new dla());
        }
    }

    static {
        kge.a(431250076);
        Companion = new a(null);
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, dle akAbilityRuntimeContext, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, akAbilityRuntimeContext, dllVar});
        }
        kotlin.jvm.internal.q.d(akAbilityRuntimeContext, "akAbilityRuntimeContext");
        if (dlhVar != null) {
            long j = 0;
            Context a2 = akAbilityRuntimeContext.a();
            if (a2 == null) {
                return new dkw(new dkv(Integer.parseInt(DELAY), "context is null"), false);
            }
            try {
                String c = dlhVar.c("duration");
                if (c != null) {
                    j = Long.parseLong(c);
                }
            } catch (NumberFormatException unused) {
            }
            new Handler(a2.getMainLooper()).postDelayed(new b(akAbilityRuntimeContext, dllVar), j);
        }
        return new dla();
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(678998756);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
