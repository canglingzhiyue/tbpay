package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.apr;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class h extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-347211143);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "in";
    }

    @Override // com.ut.mini.behavior.expression.a
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == null || !(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        if (!(obj2 instanceof List)) {
            return false;
        }
        try {
            List<String> list = (List) obj2;
            if (list != null && list.size() > 0) {
                for (String str2 : list) {
                    if (str2.startsWith(riy.MOD) && str2.endsWith(riy.MOD)) {
                        if (str.contains(str2.substring(1, str2.length() - 1))) {
                            return true;
                        }
                    } else if (str2.startsWith(riy.MOD)) {
                        if (str.endsWith(str2.substring(1))) {
                            return true;
                        }
                    } else if (str2.endsWith(riy.MOD)) {
                        if (str.startsWith(str2.substring(0, str2.length() - 1))) {
                            return true;
                        }
                    } else if (str.equals(str2)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            apr.b("InOperator", e, new Object[0]);
            return false;
        }
    }
}
