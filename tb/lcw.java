package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;

/* loaded from: classes.dex */
public class lcw implements ljt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30485a;
    private final ISceneService b;
    private lkl c;
    private lkm d;
    private lkj e;
    private lki f;

    static {
        kge.a(628970615);
        kge.a(42346437);
    }

    public lcw(ljs ljsVar) {
        this.f30485a = ljsVar;
        this.b = (ISceneService) ljsVar.a(ISceneService.class);
    }

    @Override // tb.ljt
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context}) : this.b.createView(context);
    }

    @Override // tb.ljt
    public lkl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkl) ipChange.ipc$dispatch("f075bf1", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new ldo(this.f30485a, this.b);
        }
        return this.c;
    }

    @Override // tb.ljt
    public lkm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkm) ipChange.ipc$dispatch("16b9016f", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new ldp(this.f30485a, this.b);
        }
        return this.d;
    }

    @Override // tb.ljt
    public lkj c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkj) ipChange.ipc$dispatch("1e6aa671", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new ldn(this.f30485a, this.b);
        }
        return this.e;
    }

    @Override // tb.ljt
    public lki d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lki) ipChange.ipc$dispatch("261c4bb1", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new ldm(this.f30485a, this.b);
        }
        return this.f;
    }
}
