package com.loc;

/* loaded from: classes4.dex */
public final class cf extends ci {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f7720a;
    private boolean b;

    public cf() {
        this.f7720a = new StringBuilder();
        this.b = true;
    }

    public cf(ci ciVar) {
        super(ciVar);
        this.f7720a = new StringBuilder();
        this.b = true;
    }

    @Override // com.loc.ci
    protected final byte[] a(byte[] bArr) {
        byte[] a2 = x.a(this.f7720a.toString());
        this.d = a2;
        this.b = true;
        StringBuilder sb = this.f7720a;
        sb.delete(0, sb.length());
        return a2;
    }

    @Override // com.loc.ci
    public final void b(byte[] bArr) {
        String a2 = x.a(bArr);
        if (this.b) {
            this.b = false;
        } else {
            this.f7720a.append(",");
        }
        StringBuilder sb = this.f7720a;
        sb.append("{\"log\":\"");
        sb.append(a2);
        sb.append("\"}");
    }
}
