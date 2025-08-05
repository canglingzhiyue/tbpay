package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.c;

/* loaded from: classes6.dex */
public class isb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f29266a = new b();
    public a b = new a();
    private Object c;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ise<irp, ? extends itn> f29267a;
        public ise<ipq, ? extends itd> b;

        static {
            kge.a(-1812358917);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ise<c, ? extends itv> f29268a;
        public ise<irp, ? extends ito> b;
        public ise<ipq, ? extends itd> c;

        static {
            kge.a(80366553);
        }
    }

    static {
        kge.a(1674275308);
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public <T> T b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : (T) this.c;
    }
}
