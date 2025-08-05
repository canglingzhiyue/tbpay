package com.ut.mini.behavior.data;

import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f24090a;

    /* renamed from: com.ut.mini.behavior.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1048a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f24091a;

        static {
            kge.a(-1960965654);
            f24091a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("66892136", new Object[0]) : f24091a;
        }
    }

    static {
        kge.a(201420567);
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f538cae0", new Object[0]) : C1048a.a();
    }

    private a() {
        HashMap hashMap = new HashMap();
        hashMap.put("eid", LogField.EVENTID.toString());
        hashMap.put("pg", LogField.PAGE.toString());
        hashMap.put("arg1", LogField.ARG1.toString());
        hashMap.put("arg2", LogField.ARG2.toString());
        hashMap.put("arg3", LogField.ARG3.toString());
        this.f24090a = Collections.unmodifiableMap(hashMap);
    }

    public String getDataKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bed79f30", new Object[]{this, str});
        }
        String str2 = this.f24090a.get(str);
        return (str2 == null || str2.length() == 0) ? str : str2;
    }
}
