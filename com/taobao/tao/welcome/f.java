package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.d;
import tb.kge;

/* loaded from: classes.dex */
public class f extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public d c;
    public d d;

    static {
        kge.a(241460802);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261cd43e", new Object[]{fVar});
        } else {
            fVar.c();
        }
    }

    public f(Activity activity, d.a aVar) {
        super(activity, aVar);
    }

    @Override // com.taobao.tao.welcome.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new a(this.b);
            this.c.a(new d.a() { // from class: com.taobao.tao.welcome.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.welcome.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    f.this.c.dismiss();
                    f.this.f21197a.a();
                }

                @Override // com.taobao.tao.welcome.d.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    f.this.c.dismiss();
                    f.a(f.this);
                }
            });
        }
        this.c.show();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new b(this.b);
            this.d.a(new d.a() { // from class: com.taobao.tao.welcome.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.welcome.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    f.this.d.dismiss();
                    f.this.f21197a.a();
                }

                @Override // com.taobao.tao.welcome.d.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    f.this.d.dismiss();
                    f.this.f21197a.a(i);
                }
            });
        }
        this.d.show();
    }
}
