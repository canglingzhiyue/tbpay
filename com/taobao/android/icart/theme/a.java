package com.taobao.android.icart.theme;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bnl;
import tb.kge;
import tb.mxw;

/* loaded from: classes5.dex */
public class a implements bnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f12866a = "trade";

    static {
        kge.a(290253740);
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
        HashMap hashMap = new HashMap();
        final String a2 = a("tradeButtonColor");
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("gradientThemeColor", new ArrayList<String>() { // from class: com.taobao.android.icart.theme.ThemeConfiguration$1
                {
                    a.this = this;
                    add(a2);
                    add(a2);
                }
            });
        }
        final String d = FestivalMgr.a().d("mytaobao", mxw.KEY_SKIN_PIC);
        if (!TextUtils.isEmpty(d)) {
            hashMap.put(mxw.KEY_SKIN_PIC, new ArrayList<String>() { // from class: com.taobao.android.icart.theme.ThemeConfiguration$2
                {
                    a.this = this;
                    add(d);
                }
            });
        }
        final String d2 = FestivalMgr.a().d("global", "actionBarBackgroundColor");
        if (!TextUtils.isEmpty(d2)) {
            hashMap.put("actionBarColor", new ArrayList<String>() { // from class: com.taobao.android.icart.theme.ThemeConfiguration$3
                {
                    a.this = this;
                    add(d2);
                }
            });
        }
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
