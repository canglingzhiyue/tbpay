package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.a;
import com.taobao.phenix.loader.network.b;

/* loaded from: classes.dex */
public class nij implements nid<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CONNECT_TIMEOUT = 15000;
    public static final int DEFAULT_READ_TIMEOUT = 10000;

    /* renamed from: a  reason: collision with root package name */
    private boolean f31481a;
    private b b;
    private Integer c;
    private Integer d;

    static {
        kge.a(-353456832);
        kge.a(-1709620101);
    }

    public nij a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nij) ipChange.ipc$dispatch("6779b671", new Object[]{this, bVar});
        }
        com.taobao.tcommon.core.b.b(!this.f31481a, "HttpLoaderBuilder has been built, not allow with() now");
        this.b = bVar;
        return this;
    }

    public synchronized b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b712086c", new Object[]{this});
        } else if (this.f31481a) {
            return this.b;
        } else {
            this.f31481a = true;
            if (this.b == null) {
                this.b = new a();
            }
            this.b.a(this.c != null ? this.c.intValue() : 15000);
            this.b.b(this.d != null ? this.d.intValue() : 10000);
            return this.b;
        }
    }
}
