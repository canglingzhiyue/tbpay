package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes9.dex */
public class hb extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private hk f24517a;

    /* renamed from: a  reason: collision with other field name */
    private hl f459a;

    /* renamed from: a  reason: collision with other field name */
    private Throwable f460a;

    public hb() {
        this.f24517a = null;
        this.f459a = null;
        this.f460a = null;
    }

    public hb(hk hkVar) {
        this.f24517a = null;
        this.f459a = null;
        this.f460a = null;
        this.f24517a = hkVar;
    }

    public hb(String str) {
        super(str);
        this.f24517a = null;
        this.f459a = null;
        this.f460a = null;
    }

    public hb(String str, Throwable th) {
        super(str);
        this.f24517a = null;
        this.f459a = null;
        this.f460a = null;
        this.f460a = th;
    }

    public hb(Throwable th) {
        this.f24517a = null;
        this.f459a = null;
        this.f460a = null;
        this.f460a = th;
    }

    public Throwable a() {
        return this.f460a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        hk hkVar;
        hl hlVar;
        String message = super.getMessage();
        return (message != null || (hlVar = this.f459a) == null) ? (message != null || (hkVar = this.f24517a) == null) ? message : hkVar.toString() : hlVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f460a != null) {
            printStream.println("Nested Exception: ");
            this.f460a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f460a != null) {
            printWriter.println("Nested Exception: ");
            this.f460a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(ResponseProtocolType.COMMENT);
        }
        hl hlVar = this.f459a;
        if (hlVar != null) {
            sb.append(hlVar);
        }
        hk hkVar = this.f24517a;
        if (hkVar != null) {
            sb.append(hkVar);
        }
        if (this.f460a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f460a);
        }
        return sb.toString();
    }
}
