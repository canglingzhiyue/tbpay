package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.m;
import tb.moq;

/* loaded from: classes.dex */
public abstract class mop implements moq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31171a;
    private moq.a b;
    private volatile boolean c;

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        }
    }

    public mop() {
        this(true);
    }

    public mop(boolean z) {
        this.f31171a = a.a();
        this.c = false;
    }

    public m a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("386f9167", new Object[]{this, str}) : a.a(str);
    }

    public void a(moq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5131fb4c", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c) {
        } else {
            this.c = true;
            moq.a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a(this);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e.a().d().post(new Runnable() { // from class: tb.mop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mop.this.a();
                    }
                }
            });
        }
    }
}
