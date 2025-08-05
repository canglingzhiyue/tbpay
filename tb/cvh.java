package tb;

/* loaded from: classes4.dex */
public abstract class cvh {
    public static final int MIME_CHUNK_SIZE = 76;
    public static final int PEM_CHUNK_SIZE = 64;

    /* renamed from: a  reason: collision with root package name */
    private final int f26549a;
    protected final byte b = 61;
    protected final int c;
    protected byte[] d;
    protected int e;
    protected boolean f;
    protected int g;
    protected int h;
    private final int i;
    private final int j;
    private int k;

    static {
        kge.a(-1478510593);
        kge.a(-798099291);
        kge.a(-1943265331);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cvh(int i, int i2, int i3, int i4) {
        this.f26549a = i;
        this.i = i2;
        this.c = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.j = i4;
    }

    private void c() {
        byte[] bArr = this.d;
        if (bArr == null) {
            this.d = new byte[b()];
            this.e = 0;
            this.k = 0;
            return;
        }
        byte[] bArr2 = new byte[bArr.length << 1];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.d = bArr2;
    }

    private void d() {
        this.d = null;
        this.e = 0;
        this.k = 0;
        this.g = 0;
        this.h = 0;
        this.f = false;
    }

    int a() {
        if (this.d != null) {
            return this.e - this.k;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < this.e + i) {
            c();
        }
    }

    abstract void a(byte[] bArr, int i, int i2);

    protected abstract boolean a(byte b);

    public byte[] a(byte[] bArr) {
        d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a(bArr, 0, bArr.length);
        a(bArr, 0, -1);
        byte[] bArr2 = new byte[this.e];
        b(bArr2, 0, bArr2.length);
        return bArr2;
    }

    protected int b() {
        return 8192;
    }

    int b(byte[] bArr, int i, int i2) {
        if (this.d == null) {
            return this.f ? -1 : 0;
        }
        int min = Math.min(a(), i2);
        System.arraycopy(this.d, this.k, bArr, i, min);
        this.k += min;
        if (this.k >= this.e) {
            this.d = null;
        }
        return min;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || a(b)) {
                return true;
            }
        }
        return false;
    }

    public byte[] b(String str) {
        return a(saf.a(str));
    }
}
