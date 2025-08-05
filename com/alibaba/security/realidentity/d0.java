package com.alibaba.security.realidentity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABImageResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class d0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String c = "ABListenerOperator";

    /* renamed from: a  reason: collision with root package name */
    public final a f3376a = new a(this);
    public i0 b;

    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final d0 f3377a;

        public a(d0 d0Var) {
            super(Looper.getMainLooper());
            this.f3377a = d0Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            switch (message.what) {
                case 1:
                    d0.a(this.f3377a, message);
                    return;
                case 2:
                    d0.b(this.f3377a, message);
                    return;
                case 3:
                    d0.d(this.f3377a, message);
                    return;
                case 4:
                    d0.e(this.f3377a, message);
                    return;
                case 5:
                    d0.f(this.f3377a, message);
                    return;
                case 6:
                    d0.g(this.f3377a, message);
                    return;
                case 7:
                    d0.h(this.f3377a, message);
                    return;
                case 8:
                    d0.i(this.f3377a, message);
                    return;
                case 9:
                case 10:
                default:
                    super.handleMessage(message);
                    return;
                case 11:
                    d0.j(this.f3377a, message);
                    return;
                case 12:
                    d0.k(this.f3377a, message);
                    return;
                case 13:
                    d0.c(this.f3377a, message);
                    return;
            }
        }
    }

    public d0(i0 i0Var) {
        this.b = i0Var;
    }

    public static /* synthetic */ void a(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1f8859", new Object[]{d0Var, message});
        } else {
            d0Var.f(message);
        }
    }

    public static /* synthetic */ void b(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaf0c9a", new Object[]{d0Var, message});
        } else {
            d0Var.e(message);
        }
    }

    public static /* synthetic */ void c(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13e90db", new Object[]{d0Var, message});
        } else {
            d0Var.g(message);
        }
    }

    public static /* synthetic */ void d(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ce151c", new Object[]{d0Var, message});
        } else {
            d0Var.d(message);
        }
    }

    public static /* synthetic */ void e(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985d995d", new Object[]{d0Var, message});
        } else {
            d0Var.c(message);
        }
    }

    public static /* synthetic */ void f(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bed1d9e", new Object[]{d0Var, message});
        } else {
            d0Var.b(message);
        }
    }

    public static /* synthetic */ void g(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7ca1df", new Object[]{d0Var, message});
        } else {
            d0Var.a(message);
        }
    }

    public static /* synthetic */ void h(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c2620", new Object[]{d0Var, message});
        } else {
            d0Var.k(message);
        }
    }

    public static /* synthetic */ void i(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669baa61", new Object[]{d0Var, message});
        } else {
            d0Var.j(message);
        }
    }

    public static /* synthetic */ void j(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2b2ea2", new Object[]{d0Var, message});
        } else {
            d0Var.h(message);
        }
    }

    public static /* synthetic */ void k(d0 d0Var, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbab2e3", new Object[]{d0Var, message});
        } else {
            d0Var.i(message);
        }
    }

    public void l(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ad28c6", new Object[]{this, message});
        } else if (message == null) {
        } else {
            this.f3376a.sendMessage(message);
        }
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        f0 f0Var = (f0) message.obj;
        i0Var.a(f0Var.f3395a, f0Var.b, f0Var.c);
    }

    private void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        f0 f0Var = (f0) message.obj;
        i0Var.b(f0Var.f3395a, f0Var.b, f0Var.c);
    }

    private void c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fa73bd", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.a();
    }

    private void d(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72ac0be", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.b();
    }

    private void e(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5b0dbf", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.a((ABImageResult) message.obj);
    }

    private void f(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b5ac0", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.f();
    }

    private void g(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bba7c1", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        g0 g0Var = (g0) message.obj;
        i0Var.c(g0Var.f3404a, g0Var.b);
    }

    private void h(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebf4c2", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.a((z) message.obj);
    }

    private void i(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1c41c3", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        g0 g0Var = (g0) message.obj;
        i0Var.a(g0Var.f3404a, g0Var.b);
    }

    private void j(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104c8ec4", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.c();
    }

    private void k(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947cdbc5", new Object[]{this, message});
            return;
        }
        i0 i0Var = this.b;
        if (i0Var == null) {
            return;
        }
        i0Var.k();
    }

    public Message a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("107d762e", new Object[]{this, new Integer(i)}) : Message.obtain(this.f3376a, i);
    }

    public Message a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("bab02992", new Object[]{this, new Integer(i), obj}) : Message.obtain(this.f3376a, i, obj);
    }
}
