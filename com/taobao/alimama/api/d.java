package com.taobao.alimama.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f8403a = a.a();
    private transient b b = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static AtomicInteger f8404a;

        static {
            kge.a(-19678943);
            f8404a = new AtomicInteger(0);
        }

        public static int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f8404a.incrementAndGet();
        }
    }

    static {
        kge.a(-535212179);
    }

    public d a(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("7512f802", new Object[]{this, method});
        }
        b bVar = this.b;
        bVar.f8405a = method;
        bVar.b = a() + "/" + b();
        return this;
    }

    public d a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f48ad5e9", new Object[]{this, objArr});
        }
        this.b.c = objArr;
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b.f8405a.getDeclaringClass().getSimpleName();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b(this.b.f8405a);
    }

    public Object[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("69114b4b", new Object[]{this}) : this.b.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Transaction: [id: " + this.f8403a + ", " + this.b + riy.ARRAY_END_STR;
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Method f8405a;
        public String b;
        public Object[] c;

        static {
            kge.a(917466168);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return " method: " + this.b;
        }
    }

    public static String b(Method method) {
        Class<?>[] parameterTypes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eca2d6ef", new Object[]{method});
        }
        StringBuilder sb = new StringBuilder(method.getName());
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append("_");
            sb.append(cls.getSimpleName());
        }
        return sb.toString();
    }
}
