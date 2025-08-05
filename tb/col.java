package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.h;

/* loaded from: classes3.dex */
public class col {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26356a;

    /* loaded from: classes3.dex */
    public interface a {
        cuf a(String str);
    }

    static {
        kge.a(2037117873);
        f26356a = new a() { // from class: tb.col.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.col.a
            public cuf a(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (cuf) ipChange.ipc$dispatch("7c6e1260", new Object[]{this, str}) : new h(str);
            }
        };
    }

    public static cuf a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cuf) ipChange.ipc$dispatch("7c6e1260", new Object[]{str}) : f26356a.a(str);
    }
}
