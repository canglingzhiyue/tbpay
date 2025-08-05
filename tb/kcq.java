package tb;

import android.content.Context;
import anetwork.channel.Request;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class kcq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "aws.WebSocketCenter";

    /* renamed from: a  reason: collision with root package name */
    private static volatile kcq f29963a;
    private HashMap<String, kde> b = new HashMap<>();

    static {
        kge.a(-1675235625);
    }

    private kcq() {
    }

    public static kcq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcq) ipChange.ipc$dispatch("f06ca25", new Object[0]);
        }
        if (f29963a == null) {
            synchronized (kcq.class) {
                if (f29963a == null) {
                    f29963a = new kcq();
                }
            }
        }
        return f29963a;
    }

    public kcr a(Context context, Request request, kdf kdfVar) {
        kde kdeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcr) ipChange.ipc$dispatch("4c3714bb", new Object[]{this, context, request, kdfVar});
        }
        if (kdfVar == null || context == null || request == null || request.getURI() == null || "".equals(request.getURI().getHost())) {
            return null;
        }
        synchronized (this) {
            kdeVar = this.b.get(request.getURI().toString());
            if (kdeVar == null) {
                kdeVar = new kde(context, request, kdfVar);
                this.b.put(request.getURI().toString(), kdeVar);
            }
        }
        kdeVar.a(kdfVar);
        kdeVar.c();
        return kdeVar;
    }
}
