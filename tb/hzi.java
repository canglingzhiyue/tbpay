package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.h;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes6.dex */
public class hzi implements hzk<jnz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jnz f28852a;

    static {
        kge.a(-1072026624);
        kge.a(889019089);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, tb.jnz] */
    @Override // tb.hzk
    public /* synthetic */ jnz b(Context context, b bVar, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("183ebdb8", new Object[]{this, context, bVar, hVar}) : a(context, bVar, hVar);
    }

    @Override // tb.hzk
    public void a(jnz jnzVar, Object obj, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfb063c", new Object[]{this, jnzVar, obj, jnvVar});
        } else if (jnzVar == null) {
        } else {
            this.f28852a = jnzVar;
            jnzVar.a(obj, jnvVar);
        }
    }

    public jnz a(Context context, b bVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnz) ipChange.ipc$dispatch("d8381595", new Object[]{this, context, bVar, hVar});
        }
        jnw a2 = hzo.a(context, hVar);
        if (a2 != null) {
            return a2.c(bVar);
        }
        throw new IllegalArgumentException("context or request config can't be null");
    }

    @Override // tb.hzk
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        jnz jnzVar = this.f28852a;
        if (jnzVar == null) {
            return;
        }
        jnzVar.a();
    }
}
