package com.etao.feimagesearch.util;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

/* loaded from: classes4.dex */
public final class am {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f7017a;
    private Integer b;
    private String c;
    private JSONObject d;
    private String e;
    private String f;
    private MtopStatistics g;

    static {
        kge.a(-1604427276);
    }

    public am() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public am(boolean z, Integer num, String str, JSONObject jSONObject, String str2, String str3, MtopStatistics mtopStatistics) {
        this.f7017a = z;
        this.b = num;
        this.c = str;
        this.d = jSONObject;
        this.e = str2;
        this.f = str3;
        this.g = mtopStatistics;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f7017a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f7017a;
    }

    public /* synthetic */ am(boolean z, Integer num, String str, JSONObject jSONObject, String str2, String str3, MtopStatistics mtopStatistics, int i, kotlin.jvm.internal.o oVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? -1 : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : jSONObject, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : mtopStatistics);
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.b;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.d = jSONObject;
        }
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public final void a(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d428be89", new Object[]{this, mtopStatistics});
        } else {
            this.g = mtopStatistics;
        }
    }

    public final MtopStatistics g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopStatistics) ipChange.ipc$dispatch("d7692709", new Object[]{this}) : this.g;
    }
}
