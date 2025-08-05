package tb;

/* loaded from: classes2.dex */
public class aci implements ack {

    /* renamed from: a  reason: collision with root package name */
    final ack f25236a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public aci(ack ackVar) {
        this.f25236a = ackVar;
    }

    public void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f25236a.onInserted(this.c, this.d);
        } else if (i == 2) {
            this.f25236a.onRemoved(this.c, this.d);
        } else if (i == 3) {
            this.f25236a.onChanged(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = 0;
    }

    @Override // tb.ack
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // tb.ack
    public void onInserted(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // tb.ack
    public void onMoved(int i, int i2) {
        a();
        this.f25236a.onMoved(i, i2);
    }

    @Override // tb.ack
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }
}
