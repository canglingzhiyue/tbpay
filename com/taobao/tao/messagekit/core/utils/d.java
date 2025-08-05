package com.taobao.tao.messagekit.core.utils;

import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f20787a;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, double d);

        void a(String str, String str2, String str3, double d);

        void a(String str, String str2, String str3, String str4);

        void a(String str, String str2, List<String> list, List<String> list2);

        void a(String str, String str2, Map<String, String> map, Map<String, Double> map2);
    }

    static {
        kge.a(1856257063);
    }

    public static void a(final com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6724eb", new Object[]{bVar});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a("MKT", "MKT_MSG_DURATION", new ArrayMap<String, String>() { // from class: com.taobao.tao.messagekit.core.utils.d.1
            {
                put("MKT_DIMENS_BIZ", "" + com.taobao.tao.messagekit.core.model.b.this.f20780a.bizCode());
                put("MKT_DIMENS_DUP", "" + com.taobao.tao.messagekit.core.model.b.this.f20780a.needACK());
                put("MKT_DIMENS_MQTT", "" + com.taobao.tao.messagekit.core.model.b.this.f20780a.msgType());
                put("MKT_DIMENS_TYPE", "" + com.taobao.tao.messagekit.core.model.b.this.f20780a.type());
                put("MKT_DIMENS_SUBTYPE", "" + com.taobao.tao.messagekit.core.model.b.this.f20780a.subType());
                put("MKT_DIMENS_TOPIC", com.taobao.tao.messagekit.core.model.b.this.f20780a.topic());
            }
        }, new ArrayMap<String, Double>() { // from class: com.taobao.tao.messagekit.core.utils.d.2
            {
                put("MKT_MEASURE_FLOW", Double.valueOf(com.taobao.tao.messagekit.core.model.b.this.h));
                put("MKT_MEASURE_NET", Double.valueOf(com.taobao.tao.messagekit.core.model.b.this.g));
                put("MKT_MEASURE_PACK", Double.valueOf(com.taobao.tao.messagekit.core.model.b.this.f));
            }
        });
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afeb6104", new Object[]{aVar});
        } else {
            f20787a = aVar;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2);
    }

    public static void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, d);
    }

    public static void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, str3, d);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, str3, str4);
    }

    public static void a(String str, String str2, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9371b55e", new Object[]{str, str2, list, list2});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, list, list2);
    }

    public static void a(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{str, str2, map, map2});
            return;
        }
        a aVar = f20787a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, map, map2);
    }
}
