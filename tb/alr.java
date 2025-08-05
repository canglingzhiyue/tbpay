package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alt;

/* loaded from: classes.dex */
public class alr implements alt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f25427a;
    private Object b;
    private alu c;
    private String d;
    private final String e;

    static {
        kge.a(-1697213493);
        kge.a(803556676);
    }

    public alr(String str) {
        this(str, null, 2, null);
    }

    public alr(String businessID, String nsp) {
        q.d(businessID, "businessID");
        q.d(nsp, "nsp");
        this.d = businessID;
        String lowerCase = nsp.toLowerCase();
        q.b(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.e = lowerCase;
    }

    @Override // tb.alt
    public alt a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alt) ipChange.ipc$dispatch("34c1019d", new Object[]{this, context}) : alt.a.a((alt) this, context);
    }

    public alt b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alt) ipChange.ipc$dispatch("176556d8", new Object[]{this, obj}) : alt.a.a(this, obj);
    }

    @Override // tb.alt
    public Context f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("442389e5", new Object[]{this}) : alt.a.a(this);
    }

    public <T> T g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e4566784", new Object[]{this}) : (T) alt.a.b(this);
    }

    @Override // tb.alt
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public /* synthetic */ alr(String str, String str2, int i, o oVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    @Override // tb.alt
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    @Override // tb.alt
    public WeakReference<Context> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("989ead36", new Object[]{this}) : this.f25427a;
    }

    @Override // tb.alt
    public void a(WeakReference<Context> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.f25427a = weakReference;
        }
    }

    @Override // tb.alt
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    @Override // tb.alt
    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    @Override // tb.alt
    public void a(alu aluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0431cee", new Object[]{this, aluVar});
        } else {
            this.c = aluVar;
        }
    }

    @Override // tb.alt
    public alu c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("1e65ab72", new Object[]{this}) : this.c;
    }
}
