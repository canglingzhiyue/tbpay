package com.alibaba.android.umbrella.link;

import android.util.Log;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.android.umbrella.link.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.x;
import java.util.HashMap;
import java.util.Map;
import tb.bps;
import tb.bpt;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f2821a = new e();
    private final g b = new g();

    public e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("415f7fff", new Object[]{this}) : this.f2821a;
    }

    public i a(String str, String str2, String str3, i iVar, int i, String str4, String str5, Map<UMDimKey, Object> map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("40501eb1", new Object[]{this, str, str2, str3, iVar, new Integer(i), str4, str5, map, cVar});
        }
        if (this.f2821a.a(str, str2, str3, str4)) {
            return null;
        }
        b b = b(str, str2, str3, iVar, i, str4, str5, map, cVar);
        a(b);
        return b.e();
    }

    private b b(String str, String str2, String str3, i iVar, int i, String str4, String str5, Map<UMDimKey, Object> map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d7726a59", new Object[]{this, str, str2, str3, iVar, new Integer(i), str4, str5, map, cVar});
        }
        b a2 = new b().a(str, str2).d(str3).a(!j.a(str4) ? 1 : 0).b(i).b(str4, str5).a(map).a(cVar);
        if (iVar == null) {
            iVar = new i(bps.a(""));
        }
        return a2.a(iVar).a(bps.a()).b(bpt.b()).c(bpt.a()).e(bpt.a(str));
    }

    private void a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77fd3a2", new Object[]{this, bVar});
        } else if (bVar.e() == null) {
        } else {
            final String b = bVar.b();
            final String c = bVar.c();
            final String i = bVar.i();
            final String j = bVar.j();
            this.b.a(new g.a() { // from class: com.alibaba.android.umbrella.link.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.umbrella.link.g.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a(a.POINT_LOG, b, c, i, j);
                    TLogger.a(bVar);
                }
            });
            a("triggerLogEntity", b, i, j);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if (this.f2821a.b(str4, str5, str, "")) {
        } else {
            a.a(str, str2, b(str4, str5, str, str3), str4, str5, map);
            a("triggerCommitSuccess", str4, str, "");
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        } else if (this.f2821a.b(str4, str5, str, str6) || com.alibaba.android.umbrella.trace.c.a(str6)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("Umbrella_Diagnose_Type", "0");
            hashMap.put("Umbrella_Diagnose_ErrorCode", str6);
            x.a().a(str4, hashMap);
            a.a(str, str2, b(str4, str5, str, str3), str4, str5, map, str6, str7);
            a("triggerCommitFailure", str4, str, str6);
        }
    }

    public void a(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693eb862", new Object[]{this, str, str2, umTypeKey, str3, str4});
        } else if (!this.f2821a.b()) {
        } else {
            a.a(str, str2, umTypeKey, str3, str4);
            a("triggerCommitFeedback", str, umTypeKey.getKey(), str3);
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (!this.f2821a.a()) {
        } else {
            if (j.a(str4)) {
                String str5 = str + ", mainBizName=" + str2 + " featureType=" + str3;
                return;
            }
            Log.e("umbrella2", str + ", mainBizName=" + str2 + " featureType=" + str3 + " errorCode=" + str4);
        }
    }

    private String b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f6525af", new Object[]{this, str, str2, str3, str4}) : this.f2821a.a(str, str2, str3) ? "umbrella2" : str4;
    }
}
