package tb;

import com.huawei.hmf.tasks.a.e;

/* loaded from: classes4.dex */
public class cxs<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final e<TResult> f26587a = new e<>();

    public cxs() {
    }

    public cxs(cxm cxmVar) {
        new Runnable() { // from class: tb.cxs.1
            @Override // java.lang.Runnable
            public void run() {
                cxs.this.f26587a.f();
            }
        };
    }

    public cxr<TResult> a() {
        return this.f26587a;
    }

    public void a(Exception exc) {
        this.f26587a.a(exc);
    }

    public void a(TResult tresult) {
        this.f26587a.a((e<TResult>) tresult);
    }
}
