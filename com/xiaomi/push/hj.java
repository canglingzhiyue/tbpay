package com.xiaomi.push;

import android.os.Bundle;

/* loaded from: classes9.dex */
public class hj extends hh {

    /* renamed from: a  reason: collision with root package name */
    private int f24523a;

    /* renamed from: a  reason: collision with other field name */
    private a f473a;

    /* renamed from: a  reason: collision with other field name */
    private b f474a;
    private String b;

    /* loaded from: classes9.dex */
    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* loaded from: classes9.dex */
    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hj(Bundle bundle) {
        super(bundle);
        this.f474a = b.available;
        this.b = null;
        this.f24523a = Integer.MIN_VALUE;
        this.f473a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f474a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f24523a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f473a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public hj(b bVar) {
        this.f474a = b.available;
        this.b = null;
        this.f24523a = Integer.MIN_VALUE;
        this.f473a = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public Bundle mo2009a() {
        Bundle mo2009a = super.mo2009a();
        b bVar = this.f474a;
        if (bVar != null) {
            mo2009a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.b;
        if (str != null) {
            mo2009a.putString("ext_pres_status", str);
        }
        int i = this.f24523a;
        if (i != Integer.MIN_VALUE) {
            mo2009a.putInt("ext_pres_prio", i);
        }
        a aVar = this.f473a;
        if (aVar != null && aVar != a.available) {
            mo2009a.putString("ext_pres_mode", this.f473a.toString());
        }
        return mo2009a;
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a  reason: collision with other method in class */
    public String mo2009a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"");
            sb.append(j());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"");
            sb.append(hs.a(l()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"");
            sb.append(hs.a(m()));
            sb.append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"");
            sb.append(hs.a(k()));
            sb.append("\"");
        }
        if (this.f474a != null) {
            sb.append(" type=\"");
            sb.append(this.f474a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.b != null) {
            sb.append("<status>");
            sb.append(hs.a(this.b));
            sb.append("</status>");
        }
        if (this.f24523a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f24523a);
            sb.append("</priority>");
        }
        a aVar = this.f473a;
        if (aVar != null && aVar != a.available) {
            sb.append("<show>");
            sb.append(this.f473a);
            sb.append("</show>");
        }
        sb.append(o());
        hl a2 = mo2009a();
        if (a2 != null) {
            sb.append(a2.m2010a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    public void a(int i) {
        if (i >= -128 && i <= 128) {
            this.f24523a = i;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
    }

    public void a(a aVar) {
        this.f473a = aVar;
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.f474a = bVar;
            return;
        }
        throw new NullPointerException("Type cannot be null");
    }

    @Override // com.xiaomi.push.hh
    public void a(String str) {
        this.b = str;
    }
}
