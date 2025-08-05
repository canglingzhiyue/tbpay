package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class hti implements htc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(970609967);
        kge.a(1492083656);
    }

    @Override // tb.htc
    public a a(String type, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e54f1663", new Object[]{this, type, view, new Boolean(z), new Integer(i)});
        }
        q.c(type, "type");
        q.c(view, "view");
        if (type.hashCode() != -598520263 || !type.equals("sceneHeader")) {
            return null;
        }
        return new c(view, z, i, new d(1000, 1001, 1000));
    }
}
