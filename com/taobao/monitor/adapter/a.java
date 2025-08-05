package com.taobao.monitor.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final C0724a f18140a = new C0724a();

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("54729e9a", new Object[0]);
        }
        C0724a.a(f18140a);
        C0724a.a(f18140a, s.f18233a.d());
        C0724a.a(f18140a, s.f18233a.a());
        C0724a.a(f18140a, s.f18233a.b());
        return f18140a;
    }

    /* renamed from: com.taobao.monitor.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0724a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<g> f18141a = new ArrayList<>();

        public static /* synthetic */ void a(C0724a c0724a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9028781", new Object[]{c0724a});
            } else {
                c0724a.e();
            }
        }

        public static /* synthetic */ void a(C0724a c0724a, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9585396d", new Object[]{c0724a, gVar});
            } else {
                c0724a.a(gVar);
            }
        }

        @Override // com.taobao.monitor.procedure.g
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.taobao.monitor.procedure.g
        public g b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("1473508f", new Object[]{this, str, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("56cd4cf0", new Object[]{this, str, new Long(j)});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, j);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g b(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("8021a231", new Object[]{this, str, new Long(j)});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().b(str, j);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("5c4e010", new Object[]{this, str, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().b(str, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g c(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("f7166f91", new Object[]{this, str, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().c(str, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g d(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("e867ff12", new Object[]{this, str, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().d(str, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("5d552b4", new Object[]{this, str, obj});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, obj);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g c(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("a6abc72", new Object[]{this, str, obj});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().c(str, obj);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("88200793", new Object[]{this, str, obj});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().b(str, obj);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("9c903190", new Object[]{this, str, new Long(j), new Long(j2)});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, j, j2);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g c(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("a975f772", new Object[]{this, str, new Long(j)});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().c(str, j);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g e(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("d9b98e93", new Object[]{this, str, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().e(str, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, long j, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("b2799d2f", new Object[]{this, str, new Long(j), map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, j, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("dd49e059", new Object[]{this, str, str2, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(String str, long j, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("655244f9", new Object[]{this, str, new Long(j), str2, map});
            }
            Iterator<g> it = this.f18141a.iterator();
            while (it.hasNext()) {
                it.next().a(str, j, str2, map);
            }
            return this;
        }

        @Override // com.taobao.monitor.procedure.g
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.taobao.monitor.procedure.g
        public g d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this});
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.taobao.monitor.procedure.g
        public g a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("25915716", new Object[]{this, new Boolean(z)});
            }
            throw new UnsupportedOperationException();
        }

        private void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f09c254", new Object[]{this, gVar});
            } else if (gVar == null) {
            } else {
                this.f18141a.add(gVar);
            }
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.f18141a.clear();
            }
        }
    }
}
