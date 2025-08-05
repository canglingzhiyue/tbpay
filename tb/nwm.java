package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.e;
import com.taobao.search.refactor.b;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nwm extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-244492857);
    }

    public static /* synthetic */ Object ipc$super(nwm nwmVar, String str, Object... objArr) {
        if (str.hashCode() == -447801757) {
            return super.a((String) objArr[0], (View) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Number) objArr[3]).intValue());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.refactor.b, tb.hti, tb.htc
    public a a(String type, View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e54f1663", new Object[]{this, type, view, new Boolean(z), new Integer(i)});
        }
        q.c(type, "type");
        q.c(view, "view");
        if (q.a((Object) "topBar", (Object) type)) {
            return new e(view, z);
        }
        return super.a(type, view, z, i);
    }
}
