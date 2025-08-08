package tb;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.bhc;

/* loaded from: classes2.dex */
public class bhf extends bhc<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f25899a;
    private Class[] b;
    private final bhc.b c;
    private String d;
    private Object[] e;

    static {
        kge.a(1625033872);
    }

    @Override // tb.bhc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "service";
    }

    public Executor g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("2b5923f4", new Object[]{this}) : this.f25899a;
    }

    public Class[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class[]) ipChange.ipc$dispatch("45bc9a8f", new Object[]{this}) : this.b;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.d;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public Object[] j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("706c7c12", new Object[]{this}) : this.e;
    }

    private bhf(Context context, String str, Bundle bundle, Class[] clsArr, Object[] objArr, bhc.b bVar, Executor executor) {
        super(context, str, bundle);
        this.b = clsArr;
        this.e = objArr;
        this.c = bVar;
        this.f25899a = executor;
    }

    public static a a(Context context, Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9de2838c", new Object[]{context, cls}) : new a(context, cls.getName());
    }

    @Override // tb.bhc
    public bhc.b<Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("c2b5f57e", new Object[]{this}) : this.c;
    }

    /* loaded from: classes2.dex */
    public static class a extends bhc.a<bhf, a, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object[] d;
        private Class[] e;
        private bhc.b f;
        private Executor g;

        static {
            kge.a(1832211303);
        }

        public a f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c2b7527c", new Object[]{this}) : this;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhc, tb.bhf] */
        @Override // tb.bhc.a
        public /* synthetic */ bhf b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc) ipChange.ipc$dispatch("16b46940", new Object[]{this}) : e();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhf$a, tb.bhc$a] */
        @Override // tb.bhc.a
        public /* synthetic */ a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc.a) ipChange.ipc$dispatch("fefa6221", new Object[]{this}) : f();
        }

        public a(Context context, String str) {
            super(context, str);
        }

        public a a(Class<?>... clsArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a46e019", new Object[]{this, clsArr});
            }
            this.e = clsArr;
            return f();
        }

        public a a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7ec39620", new Object[]{this, objArr});
            }
            this.d = objArr;
            return f();
        }

        public bhf e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhf) ipChange.ipc$dispatch("2dc959ba", new Object[]{this}) : new bhf(this.f25896a, this.b, this.c, this.e, this.d, this.f, this.g);
        }

        public a a(bhc.b<Object> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b9eefcc", new Object[]{this, bVar});
            }
            this.f = bVar;
            return f();
        }

        @Override // tb.bhc.a
        public void c() {
            Object[] objArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (StringUtils.isEmpty(this.b)) {
                throw new IllegalArgumentException("className can not be empty!");
            } else {
                if (this.e != null && this.d == null) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                }
                if (this.e == null && this.d != null) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                }
                Class[] clsArr = this.e;
                if (clsArr != null && (objArr = this.d) != null && clsArr.length != objArr.length) {
                    throw new IllegalArgumentException("parameterTypes can not match instantce args!");
                }
            }
        }
    }
}
