package com.taobao.search.m3.flash;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f19095a;
    private final long b;
    private final String c;
    private final Integer d;
    private final String e;
    private final Integer f;

    static {
        kge.a(-1710343567);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a(this.f19095a, bVar.f19095a) || this.b != bVar.b || !q.a((Object) this.c, (Object) bVar.c) || !q.a(this.d, bVar.d) || !q.a((Object) this.e, (Object) bVar.e) || !q.a(this.f, bVar.f)) {
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
        List<c> list = this.f19095a;
        int hashCode = list != null ? list.hashCode() : 0;
        long j = this.b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.c;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.f;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FlashSaleInfo(texList=" + this.f19095a + ", onlineEndTime=" + this.b + ", soldOutTxt=" + this.c + ", textColor=" + this.d + ", iconUrl=" + this.e + ", countDownBgColor=" + this.f + riy.BRACKET_END_STR;
    }

    public b(List<c> texList, long j, String str, Integer num, String str2, Integer num2) {
        q.c(texList, "texList");
        this.f19095a = texList;
        this.b = j;
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = num2;
    }

    public final List<c> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f19095a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e4778d52", new Object[]{this}) : this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final Integer f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.f;
    }
}
