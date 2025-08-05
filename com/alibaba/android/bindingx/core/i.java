package com.alibaba.android.bindingx.core;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f2230a;
    private d b;
    private e c;
    private c d;

    /* loaded from: classes.dex */
    public interface b {
        double a(double d, Object... objArr);

        double b(double d, Object... objArr);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(String str, f fVar);

        void b(String str, f fVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        View a(String str, Object... objArr);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(View view, String str, Object obj, b bVar, Map<String, Object> map, Object... objArr);
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(float f, float f2);

        void b(float f, float f2);

        void h_();
    }

    static {
        kge.a(1284224773);
    }

    public static /* synthetic */ b a(i iVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f8e0d8a9", new Object[]{iVar, bVar});
        }
        iVar.f2230a = bVar;
        return bVar;
    }

    public static /* synthetic */ c a(i iVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("460de7", new Object[]{iVar, cVar});
        }
        iVar.d = cVar;
        return cVar;
    }

    public static /* synthetic */ d a(i iVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7ab4325", new Object[]{iVar, dVar});
        }
        iVar.b = dVar;
        return dVar;
    }

    public static /* synthetic */ e a(i iVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("f107863", new Object[]{iVar, eVar});
        }
        iVar.c = eVar;
        return eVar;
    }

    private i() {
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d7a86187", new Object[]{this}) : this.f2230a;
    }

    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bce9d086", new Object[]{this}) : this.b;
    }

    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a22b3f66", new Object[]{this}) : this.c;
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("876cade9", new Object[]{this}) : this.d;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f2231a;
        private d b;
        private e c;
        private c d;

        static {
            kge.a(1860286684);
        }

        public i a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("aafad905", new Object[]{this});
            }
            i iVar = new i();
            i.a(iVar, this.b);
            i.a(iVar, this.f2231a);
            i.a(iVar, this.c);
            i.a(iVar, this.d);
            return iVar;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1607547", new Object[]{this, bVar});
            }
            this.f2231a = bVar;
            return this;
        }

        public a a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e02adf85", new Object[]{this, dVar});
            }
            this.b = dVar;
            return this;
        }

        public a a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e79014a4", new Object[]{this, eVar});
            }
            this.c = eVar;
            return this;
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8c5aa66", new Object[]{this, cVar});
            }
            this.d = cVar;
            return this;
        }
    }
}
