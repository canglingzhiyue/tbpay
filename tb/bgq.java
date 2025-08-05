package tb;

import com.alibaba.android.split.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;
import tb.bnk;

/* loaded from: classes2.dex */
public class bgq extends asa implements bgo<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bhf f25880a;
    private bgu b = (bgu) a.b(bgu.class, "ServiceInstantiator");

    static {
        kge.a(-5877029);
        kge.a(503218550);
    }

    public static /* synthetic */ bgu a(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("1a9b8faa", new Object[]{bgqVar}) : bgqVar.b;
    }

    public static /* synthetic */ bhf b(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhf) ipChange.ipc$dispatch("23d67f9", new Object[]{bgqVar}) : bgqVar.f25880a;
    }

    public bgq(bhf bhfVar) {
        this.f25880a = bhfVar;
    }

    @Override // tb.bgo
    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        try {
            bnk c = this.d.c();
            c.i = this.f25880a.b();
            c.h = this.f25880a.d();
            c.f = this;
            c.d = this.f25880a.i();
            c.g = this.f25880a.h();
            c.f26000a = this.f25880a.j();
            c.b = new bnk.b() { // from class: tb.bgq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bnk.b
                public void a(final Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    bgq.a(bgq.this).d("ServiceInstantiator  Instance %s created onFinished", obj);
                    if (bgq.b(bgq.this).f() == null || obj == null) {
                        return;
                    }
                    if (bgq.b(bgq.this).g() != null) {
                        bgq.b(bgq.this).g().execute(new Runnable() { // from class: tb.bgq.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    bgq.b(bgq.this).f().a((bhc.b<Object>) obj, bgq.b(bgq.this).e());
                                }
                            }
                        });
                    } else {
                        bgq.b(bgq.this).f().a((bhc.b<Object>) obj, bgq.b(bgq.this).e());
                    }
                }
            };
            c.c = new bnk.a() { // from class: tb.bgq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bnk.a
                public void a(final String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    bgq.a(bgq.this).d("ServiceInstantiator", "Instance %s created failed", bgq.b(bgq.this).a());
                    if (bgq.b(bgq.this).f() == null) {
                        return;
                    }
                    if (bgq.b(bgq.this).g() != null) {
                        bgq.b(bgq.this).g().execute(new Runnable() { // from class: tb.bgq.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    bgq.b(bgq.this).f().a(str, bgq.b(bgq.this).e());
                                }
                            }
                        });
                    } else {
                        bgq.b(bgq.this).f().a(str, bgq.b(bgq.this).e());
                    }
                }
            };
            this.d.b(c);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
