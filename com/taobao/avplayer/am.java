package com.taobao.avplayer;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.kge;

/* loaded from: classes6.dex */
public class am implements v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public j f16467a;
    public a b;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, int i2, String str);

        void a(long j, long j2, long j3, Object obj, String str);

        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);

        void h(String str);
    }

    static {
        kge.a(-662534524);
        kge.a(747109490);
    }

    public am(Context context) {
        this.f16467a = new j(context);
        this.f16467a.a(this);
    }

    public String a(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        j jVar = this.f16467a;
        return jVar != null ? jVar.a(str, str2) : "";
    }

    public void i(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a(str);
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.b(str);
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.c(str);
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a(str, j);
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a(str, z);
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.d(str);
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.b(str, j);
    }

    public long m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6df97b32", new Object[]{this, str})).longValue();
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return -1L;
        }
        return jVar.e(str);
    }

    public long n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b82b1473", new Object[]{this, str})).longValue();
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return -1L;
        }
        return jVar.f(str);
    }

    public void a(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a350ffb2", new Object[]{this, str, new Float(f), new Float(f2)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a(str, f, f2);
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.b(str, z);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a(z);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        j jVar = this.f16467a;
        if (jVar == null) {
            return;
        }
        jVar.a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ed1248", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // com.taobao.avplayer.v
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(str);
    }

    @Override // com.taobao.avplayer.v
    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(i, i2, str);
    }

    @Override // com.taobao.avplayer.v
    public void a(long j, long j2, long j3, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f52582", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(j, j2, j3, obj, str);
    }

    @Override // com.taobao.avplayer.v
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.b(str);
    }

    @Override // com.taobao.avplayer.v
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.c(str);
    }

    @Override // com.taobao.avplayer.v
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.d(str);
    }

    @Override // com.taobao.avplayer.v
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.e(str);
    }

    @Override // com.taobao.avplayer.v
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.f(str);
    }

    @Override // com.taobao.avplayer.v
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.g(str);
    }

    @Override // com.taobao.avplayer.v
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.h(str);
    }
}
