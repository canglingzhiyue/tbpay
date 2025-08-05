package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.s;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class qus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qus INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static ListStyle f33065a;

    static {
        kge.a(-1962938192);
        INSTANCE = new qus();
        String string = s.a().getString("savedListStyle", "");
        if (q.a((Object) "list", (Object) string)) {
            f33065a = ListStyle.LIST;
        } else if (!q.a((Object) "wf", (Object) string)) {
        } else {
            f33065a = ListStyle.WATERFALL;
        }
    }

    private qus() {
    }

    public final void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
        } else if (listStyle == null) {
        } else {
            f33065a = listStyle;
            s.a().edit().putString("savedListStyle", listStyle.getValue()).apply();
        }
    }

    public final ListStyle a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("88014f65", new Object[]{this}) : f33065a;
    }
}
