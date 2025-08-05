package com.taobao.search.m3.interactive;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f19118a;
    private final String b;
    private final Integer c;
    private final String d;
    private final Integer e;
    private final String f;
    private final Integer g;
    private final String h;
    private final String i;
    private final String j;
    private final JSONObject k;

    static {
        kge.a(643443944);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!q.a((Object) this.f19118a, (Object) cVar.f19118a) || !q.a((Object) this.b, (Object) cVar.b) || !q.a(this.c, cVar.c) || !q.a((Object) this.d, (Object) cVar.d) || !q.a(this.e, cVar.e) || !q.a((Object) this.f, (Object) cVar.f) || !q.a(this.g, cVar.g) || !q.a((Object) this.h, (Object) cVar.h) || !q.a((Object) this.i, (Object) cVar.i) || !q.a((Object) this.j, (Object) cVar.j) || !q.a(this.k, cVar.k)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f19118a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num3 = this.g;
        int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.j;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveTagInfo(tagPic=" + this.f19118a + ", rightIcon=" + this.b + ", typeColor=" + this.c + ", query=" + this.d + ", textColor=" + this.e + ", type=" + this.f + ", bgColor=" + this.g + ", text=" + this.h + ", key=" + this.i + ", tagTrace=" + this.j + ", params=" + this.k + riy.BRACKET_END_STR;
    }

    public c(String str, String str2, Integer num, String query, Integer num2, String str3, Integer num3, String text, String str4, String str5, JSONObject jSONObject) {
        q.c(query, "query");
        q.c(text, "text");
        this.f19118a = str;
        this.b = str2;
        this.c = num;
        this.d = query;
        this.e = num2;
        this.f = str3;
        this.g = num3;
        this.h = text;
        this.i = str4;
        this.j = str5;
        this.k = jSONObject;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19118a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9a45f411", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this}) : this.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final Integer g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("c30c5915", new Object[]{this}) : this.g;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    public final JSONObject k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this}) : this.k;
    }
}
