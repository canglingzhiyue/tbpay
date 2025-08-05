package com.taobao.android.detail.ttdetail.skeleton.desc.web;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f10905a;

    static {
        kge.a(1734798582);
    }

    public c(String str) {
        this.f10905a = new StringBuilder(str);
    }

    public c a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("454f8a30", new Object[]{this, str, str2});
        }
        this.f10905a.append(a());
        try {
            this.f10905a.append(URLEncoder.encode(str, "UTF-8"));
            this.f10905a.append("=");
            this.f10905a.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (Exception unused) {
        }
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f10905a.toString();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        char a2 = a(this.f10905a);
        return ('?' == a2 || '&' == a2) ? "" : this.f10905a.indexOf("?") >= 0 ? "&" : "?";
    }

    private char a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("5279f0b0", new Object[]{this, sb})).charValue() : sb.charAt(sb.length() - 1);
    }
}
