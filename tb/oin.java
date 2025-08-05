package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.d;
import com.taobao.share.ui.engine.render.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class oin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<oio> f32102a;

    static {
        kge.a(540862619);
    }

    public oin(List<oio> list) {
        this.f32102a = list;
    }

    public void a(b bVar, d dVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b6528d", new Object[]{this, bVar, dVar, context, new Integer(i)});
            return;
        }
        com.taobao.share.globalmodel.b a2 = dVar.a();
        Iterator<oio> it = this.f32102a.iterator();
        while (it.hasNext() && !it.next().a(context, a2, i, bVar)) {
        }
    }
}
