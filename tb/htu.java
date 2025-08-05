package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.state.b;
import com.taobao.android.meta.structure.state.c;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class htu extends iue<c, htv> implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-408568390);
        kge.a(-1457606828);
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // com.taobao.android.meta.structure.state.b
    public com.taobao.android.meta.data.b<? extends a, ? extends MetaResult<? extends a>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.data.b) ipChange.ipc$dispatch("e1079cc9", new Object[]{this});
        }
        htv widget = getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        return (com.taobao.android.meta.data.b) iruVar.d();
    }
}
