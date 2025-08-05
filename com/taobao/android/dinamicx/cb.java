package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class cb {

    /* loaded from: classes5.dex */
    public interface a<T> {
        T a();

        boolean a(T t);

        int b();
    }

    static {
        kge.a(631617894);
    }

    /* loaded from: classes5.dex */
    public static class b<T> implements a<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f11834a;
        private int b;

        static {
            kge.a(-735469812);
            kge.a(-97152838);
        }

        public b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f11834a = new Object[i];
        }

        @Override // com.taobao.android.dinamicx.cb.a
        public T a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
            }
            int i = this.b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f11834a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }

        @Override // com.taobao.android.dinamicx.cb.a
        public boolean a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
            }
            if (b(t)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.b;
            Object[] objArr = this.f11834a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }

        private boolean b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
            }
            for (int i = 0; i < this.b; i++) {
                if (this.f11834a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.taobao.android.dinamicx.cb.a
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }
    }

    /* loaded from: classes5.dex */
    public static class c<T> extends b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f11835a;

        static {
            kge.a(-961158418);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1507519928) {
                if (hashCode != -1120663606) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return super.a();
            }
            return new Boolean(super.a(objArr[0]));
        }

        public c(int i) {
            super(i);
            this.f11835a = new Object();
        }

        @Override // com.taobao.android.dinamicx.cb.b, com.taobao.android.dinamicx.cb.a
        public T a() {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
            }
            synchronized (this.f11835a) {
                t = (T) super.a();
            }
            return t;
        }

        @Override // com.taobao.android.dinamicx.cb.b, com.taobao.android.dinamicx.cb.a
        public boolean a(T t) {
            boolean a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
            }
            synchronized (this.f11835a) {
                a2 = super.a(t);
            }
            return a2;
        }
    }
}
