package android.support.constraint.solver;

/* loaded from: classes2.dex */
final class g {

    /* loaded from: classes2.dex */
    interface a<T> {
        T a();

        void a(T[] tArr, int i);

        boolean a(T t);
    }

    /* loaded from: classes2.dex */
    static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f1109a;
        private int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(int i) {
            if (i > 0) {
                this.f1109a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // android.support.constraint.solver.g.a
        public T a() {
            int i = this.b;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = this.f1109a;
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.b = i - 1;
                return t;
            }
            return null;
        }

        @Override // android.support.constraint.solver.g.a
        public void a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.b;
                Object[] objArr = this.f1109a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.b = i3 + 1;
                }
            }
        }

        @Override // android.support.constraint.solver.g.a
        public boolean a(T t) {
            int i = this.b;
            Object[] objArr = this.f1109a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.b = i + 1;
                return true;
            }
            return false;
        }
    }
}
