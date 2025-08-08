package com.alibaba.android.bindingx.core.internal;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f2242a;
    public final String b;
    public final JSONObject c;

    static {
        kge.a(1348988847);
    }

    public l(String str, String str2, JSONObject jSONObject) {
        this.f2242a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public static l a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("4873a14a", new Object[]{str, jSONObject}) : new l(str, null, jSONObject);
    }

    public static l a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("7a84ca9a", new Object[]{str, str2}) : new l(str, str2, null);
    }

    public static boolean a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e109e72c", new Object[]{lVar})).booleanValue() : lVar != null && ((!StringUtils.isEmpty(lVar.b) && !"{}".equals(lVar.b)) || lVar.c != null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            l lVar = (l) obj;
            String str = this.f2242a;
            if (str == null ? lVar.f2242a != null : !str.equals(lVar.f2242a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 != null) {
                return str2.equals(lVar.b);
            }
            if (lVar.b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f2242a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
