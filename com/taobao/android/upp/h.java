package com.taobao.android.upp;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.e;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15797a;
    private String b;
    private String c;
    private WeakReference<e.a> d;
    private a e;
    private JSONObject f;

    static {
        kge.a(1732215931);
    }

    public h(String str, JSONObject jSONObject, String str2, e.a aVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.f15797a = str;
        this.b = str2;
        this.c = this.f15797a + this.b;
        this.f = jSONObject;
        this.d = new WeakReference<>(aVar);
    }

    public h(String str, JSONObject jSONObject, String str2, e.a aVar, a aVar2) {
        this(str, jSONObject, str2, aVar);
        this.e = aVar2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15797a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UPPResourceScheme{mSchemeId='");
        sb.append(this.f15797a);
        sb.append('\'');
        sb.append(", mInstanceId='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mUniqueId='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mCallback=");
        WeakReference<e.a> weakReference = this.d;
        sb.append(weakReference == null ? "null" : Integer.valueOf(weakReference.hashCode()));
        sb.append(", mBizParams=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
