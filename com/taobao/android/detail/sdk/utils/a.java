package com.taobao.android.detail.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.alj;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BizID = "taobao_detail";

    static {
        kge.a(711164152);
        tpc.a("com.taobao.android.detail.sdk.utils.ApmTracker");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        a("mtopStart");
        j.a("mMtop");
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a("mtopEnd");
        j.b("mMtop");
    }

    public static void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
        } else if (!com.taobao.android.detail.sdk.structure.f.v) {
        } else {
            alj.a().b("taobao_detail", hashMap);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!com.taobao.android.detail.sdk.structure.f.v) {
        } else {
            alj.a().a("taobao_detail", str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        b(hashMap);
    }

    public static void b(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d4b2a", new Object[]{hashMap});
        } else if (!com.taobao.android.detail.sdk.structure.f.v) {
        } else {
            alj.a().a("taobao_detail", hashMap);
        }
    }
}
