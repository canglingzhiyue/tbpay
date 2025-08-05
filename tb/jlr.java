package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class jlr extends jls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@ifEmpty(";
    public static final int SUB_INDEX = 9;

    static {
        kge.a(-396196093);
    }

    @Override // tb.jls
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 9;
    }

    @Override // tb.jls
    public Object a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar});
        }
        Object obj = null;
        if (this.c != null && !this.c.isEmpty()) {
            Iterator<Object> it = this.c.iterator();
            while (it.hasNext() && (obj = aVar.a(it.next())) == null) {
            }
        }
        return obj;
    }
}
