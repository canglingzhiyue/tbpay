package com.taobao.android.purchase.theme;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bnl;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements bnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1038354258);
        kge.a(-990204072);
    }

    @Override // tb.bnl
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    @Override // tb.bnl
    public Map<String, List<String>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        final String a2 = a("tradeTextColor");
        final String a3 = a("tradeButtonColor");
        if (a2 == null) {
            return null;
        }
        return new HashMap<String, List<String>>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration$1
            {
                b.this = this;
                put("submitTextColor", new ArrayList<String>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration$1.1
                    {
                        ThemeConfiguration$1.this = this;
                        add(a2);
                    }
                });
                put("gradientThemeColor", new ArrayList<String>() { // from class: com.taobao.android.purchase.theme.ThemeConfiguration$1.2
                    {
                        ThemeConfiguration$1.this = this;
                        add(a3);
                    }
                });
            }
        };
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
