package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class hf extends hh {

    /* renamed from: a  reason: collision with root package name */
    private a f24519a;

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, String> f464a;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24520a = new a("get");
        public static final a b = new a("set");
        public static final a c = new a("result");
        public static final a d = new a("error");
        public static final a e = new a("command");

        /* renamed from: a  reason: collision with other field name */
        private String f465a;

        private a(String str) {
            this.f465a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (f24520a.toString().equals(lowerCase)) {
                return f24520a;
            }
            if (b.toString().equals(lowerCase)) {
                return b;
            }
            if (d.toString().equals(lowerCase)) {
                return d;
            }
            if (c.toString().equals(lowerCase)) {
                return c;
            }
            if (!e.toString().equals(lowerCase)) {
                return null;
            }
            return e;
        }

        public String toString() {
            return this.f465a;
        }
    }

    public hf() {
        this.f24519a = a.f24520a;
        this.f464a = new HashMap();
    }

    public hf(Bundle bundle) {
        super(bundle);
        this.f24519a = a.f24520a;
        this.f464a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f24519a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public Bundle mo2009a() {
        Bundle mo2009a = super.mo2009a();
        a aVar = this.f24519a;
        if (aVar != null) {
            mo2009a.putString("ext_iq_type", aVar.toString());
        }
        return mo2009a;
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a  reason: collision with other method in class */
    public a mo2009a() {
        return this.f24519a;
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public String mo2009a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (j() != null) {
            sb.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb.append("to=\"");
            sb.append(hs.a(l()));
            sb.append("\" ");
        }
        if (m() != null) {
            sb.append("from=\"");
            sb.append(hs.a(m()));
            sb.append("\" ");
        }
        if (k() != null) {
            sb.append("chid=\"");
            sb.append(hs.a(k()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f464a.entrySet()) {
            sb.append(hs.a(entry.getKey()));
            sb.append("=\"");
            sb.append(hs.a(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f24519a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(mo2009a());
            str = "\">";
        }
        sb.append(str);
        String b = b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(o());
        hl a2 = mo2009a();
        if (a2 != null) {
            sb.append(a2.m2010a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.f24519a = a.f24520a;
        } else {
            this.f24519a = aVar;
        }
    }

    public synchronized void a(Map<String, String> map) {
        this.f464a.putAll(map);
    }

    @Override // com.xiaomi.push.hh
    public String b() {
        return null;
    }
}
