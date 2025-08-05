package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlq extends jls {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29617a;
    public static int b;

    static {
        kge.a(1495267817);
        f29617a = "@concat(";
        b = 8;
    }

    @Override // tb.jls
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : b;
    }

    @Override // tb.jls
    public Object a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar});
        }
        if (this.c == null || this.c.isEmpty()) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : this.c) {
            Object a2 = aVar.a(obj);
            if (a2 != null) {
                stringBuffer.append(a2.toString());
            }
        }
        return stringBuffer.toString();
    }
}
