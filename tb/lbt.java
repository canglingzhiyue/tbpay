package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lbt INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Context, ctr> f30459a;

    static {
        kge.a(-516300013);
        INSTANCE = new lbt();
        f30459a = new LinkedHashMap();
    }

    private lbt() {
    }

    public final void a(Context context, ctr ctrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7631ad0f", new Object[]{this, context, ctrVar});
        } else if (context == null || ctrVar == null) {
        } else {
            f30459a.put(context, ctrVar);
        }
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            f30459a.remove(context);
        }
    }

    public final ctr b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctr) ipChange.ipc$dispatch("4869dba6", new Object[]{this, context});
        }
        if (context != null) {
            return f30459a.get(context);
        }
        return null;
    }
}
