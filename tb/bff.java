package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TTPY_ERROR_DISMISS = 3;
    public static final int TYPE_ADD_CART_REQUEST = 4;
    public static final int TYPE_ADJUST_REQUEST = 2;
    public static final int TYPE_DESTROY = 5;
    public static final int TYPE_QUERY_REQUEST = 1;

    /* renamed from: a  reason: collision with root package name */
    private bbz f25848a;
    private bfe b;
    private bfd c;
    private bfc d;

    static {
        kge.a(-1687036513);
    }

    private bff() {
    }

    public bff(bbz bbzVar) {
        this.f25848a = bbzVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = new xic();
        this.c = new bfh();
        this.d = new bfg();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        bfe bfeVar = this.b;
        if (bfeVar == null) {
            return;
        }
        bbz bbzVar = this.f25848a;
        bfeVar.a(bbzVar, bbzVar.m(), i);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        bfe bfeVar = this.b;
        if (bfeVar == null) {
            return;
        }
        bbz bbzVar = this.f25848a;
        bfeVar.b(bbzVar, bbzVar.m(), i);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        bfe bfeVar = this.b;
        return bfeVar != null && bfeVar.a();
    }

    public void a(int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31568a0", new Object[]{this, new Integer(i), mtopResponse});
        } else {
            a(i, mtopResponse, true);
        }
    }

    public void a(int i, MtopResponse mtopResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f985e34", new Object[]{this, new Integer(i), mtopResponse, new Boolean(z)});
            return;
        }
        bfd bfdVar = this.c;
        if (bfdVar == null) {
            return;
        }
        bbz bbzVar = this.f25848a;
        bfdVar.a(bbzVar, bbzVar.m(), i, mtopResponse, z);
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        bfd bfdVar = this.c;
        if (bfdVar == null) {
            return;
        }
        bbz bbzVar = this.f25848a;
        bfdVar.a(bbzVar, bbzVar.m(), 3, mtopResponse);
    }

    public void a(bfd bfdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19bae38", new Object[]{this, bfdVar});
        } else {
            this.c = bfdVar;
        }
    }
}
