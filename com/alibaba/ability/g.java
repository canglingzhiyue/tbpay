package com.alibaba.ability;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.t;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.kge;

/* loaded from: classes2.dex */
public final class g {
    public static final a Companion;

    static {
        kge.a(198730045);
        Companion = new a(null);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1113480123);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final alq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (alq) ipChange.ipc$dispatch("f026038", new Object[]{this}) : a((Activity) null);
        }

        public final alq a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (alq) ipChange.ipc$dispatch("2d2e6a6", new Object[]{this, activity});
            }
            a aVar = this;
            if (!(activity instanceof Context)) {
                activity = null;
            }
            return aVar.a((Context) activity);
        }

        public final alq a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (alq) ipChange.ipc$dispatch("34c10140", new Object[]{this, context});
            }
            alr alrVar = new alr("mega_native", null, 2, null);
            alr alrVar2 = alrVar;
            alrVar.a(new alu(alrVar2));
            alrVar.a(context);
            t tVar = t.INSTANCE;
            return new alq(alrVar2);
        }
    }
}
