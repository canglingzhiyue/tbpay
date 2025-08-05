package com.taobao.android.purchase.theme;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dtc;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements dtc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1270299226);
        kge.a(793826524);
    }

    @Override // tb.dtc.a
    public Map<String, List<String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("submitTextColor", Arrays.asList(a("tradeTextColor")));
        hashMap.put("gradientThemeColor", Arrays.asList(a("tradeButtonColor")));
        return hashMap;
    }

    private String a(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!FestivalMgr.a().a("trade") || (a2 = FestivalMgr.a().a("trade", str, -1)) == -1) {
            return null;
        }
        return "#" + Integer.toHexString(a2);
    }
}
