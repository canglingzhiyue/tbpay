package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.mto;

/* loaded from: classes3.dex */
public class cpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;

    /* renamed from: a  reason: collision with root package name */
    private String f26426a = "Unknown";
    private Boolean b = true;
    private String c = "";
    private String d = "";
    private String e = "";
    private Boolean f = false;

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        this.f26426a = str;
        this.b = true;
        this.e = str2;
        this.f = Boolean.valueOf(z);
        a(this);
    }

    public void a(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd749044", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
            return;
        }
        this.f26426a = str;
        this.b = false;
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        this.c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown";
        }
        this.d = str3;
        this.e = str4;
        this.f = Boolean.valueOf(z);
        a(this);
    }

    static {
        kge.a(925778420);
        h = false;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (h) {
        } else {
            h = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add("success");
            arrayList.add("failure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("ava_type");
            arrayList2.add("err_type");
            arrayList2.add("err_msg");
            arrayList2.add("pssource");
            arrayList2.add("say_bye_2_back_source");
            cox.a("PLT", "CaptureAva", arrayList, arrayList2);
        }
    }

    public static void a(cpz cpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e7720b", new Object[]{cpzVar});
        } else if (cpzVar == null) {
        } else {
            a();
            HashMap hashMap = new HashMap();
            a(cpzVar, hashMap);
            HashMap hashMap2 = new HashMap();
            if (cpzVar.b.booleanValue()) {
                hashMap2.put("success", Double.valueOf(1.0d));
                hashMap2.put("failure", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
            } else {
                hashMap2.put("success", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
                hashMap2.put("failure", Double.valueOf(1.0d));
            }
            cox.a("PLT", "CaptureAva", hashMap2, hashMap);
        }
    }

    private static void a(cpz cpzVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9cb21a", new Object[]{cpzVar, map});
            return;
        }
        map.put("pssource", cpzVar.e);
        map.put("ava_type", cpzVar.f26426a);
        map.put("device_level", String.valueOf(c.b()));
        map.put("say_bye_2_back_source", cpzVar.f.toString());
        if (cpzVar.b.booleanValue()) {
            return;
        }
        String str = "unknown";
        map.put("err_type", TextUtils.isEmpty(cpzVar.c) ? str : cpzVar.c);
        if (!TextUtils.isEmpty(cpzVar.d)) {
            str = cpzVar.d;
        }
        map.put("err_msg", str);
    }
}
