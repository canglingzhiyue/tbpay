package tb;

import android.content.Context;
import com.alibaba.android.nextrpc.stream.request.a;
import com.alibaba.android.nextrpc.stream.request.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f29654a;

    static {
        kge.a(816441250);
    }

    public jog(Context context, String str) {
        this.f29654a = new b().a(context).a(str).a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29654a.a();
        }
    }

    public void a(jod jodVar, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763d5737", new Object[]{this, jodVar, jnvVar});
        } else {
            jodVar.a(this.f29654a, jnvVar);
        }
    }

    public void a(jod jodVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30d0ed3", new Object[]{this, jodVar, obj, jnvVar});
        } else {
            jodVar.a(this.f29654a, obj, jnvVar);
        }
    }
}
