package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class jad extends dlg<dlr> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String STARTLOCATIONSERVICE = "7458050951944093004";

    static {
        kge.a(-411864193);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(jad jadVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(-1962652665);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, dlr abilityRuntimeContext, dll callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("8e026c4b", new Object[]{this, dlhVar, abilityRuntimeContext, callback});
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(callback, "callback");
        Context a2 = abilityRuntimeContext.a();
        q.b(a2, "abilityRuntimeContext.context");
        a(a2);
        return new dla();
    }

    private final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
