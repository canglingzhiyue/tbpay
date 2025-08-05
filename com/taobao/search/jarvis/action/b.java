package com.taobao.search.jarvis.action;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.jxs;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f19061a;
    private final String b;
    private final ArrayList<BaseCellBean> c;
    private final ArrayList<BaseCellBean> d;
    private final jxs e;

    static {
        kge.a(-1241593176);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f19061a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final ArrayList<BaseCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.c;
    }

    public final ArrayList<BaseCellBean> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this}) : this.d;
    }

    public final jxs e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jxs) ipChange.ipc$dispatch("2dcd3a55", new Object[]{this}) : this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!q.a(this.f19061a, bVar.f19061a) || !q.a((Object) this.b, (Object) bVar.b) || !q.a(this.c, bVar.c) || !q.a(this.d, bVar.d) || !q.a(this.e, bVar.e)) {
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
        JSONObject jSONObject = this.f19061a;
        int hashCode = (jSONObject != null ? jSONObject.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ArrayList<BaseCellBean> arrayList = this.c;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<BaseCellBean> arrayList2 = this.d;
        int hashCode4 = (hashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        jxs jxsVar = this.e;
        if (jxsVar != null) {
            i = jxsVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RerankParams(actionParams=" + this.f19061a + ", beginVersion=" + this.b + ", rerankItemList=" + this.c + ", rerankP4pList=" + this.d + ", jarvis=" + this.e + riy.BRACKET_END_STR;
    }

    public b(JSONObject jSONObject, String beginVersion, ArrayList<BaseCellBean> rerankItemList, ArrayList<BaseCellBean> rerankP4pList, jxs jarvis) {
        q.c(beginVersion, "beginVersion");
        q.c(rerankItemList, "rerankItemList");
        q.c(rerankP4pList, "rerankP4pList");
        q.c(jarvis, "jarvis");
        this.f19061a = jSONObject;
        this.b = beginVersion;
        this.c = rerankItemList;
        this.d = rerankP4pList;
        this.e = jarvis;
    }
}
