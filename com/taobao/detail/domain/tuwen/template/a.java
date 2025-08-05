package com.taobao.detail.domain.tuwen.template;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.noa;
import tb.onk;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f17003a;

    static {
        kge.a(429784939);
        f17003a = 0;
    }

    public static TuwenTemplate a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TuwenTemplate) ipChange.ipc$dispatch("9cafdc4b", new Object[]{str, str2, str3, str4, str5, str6, str7});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("titleColor", str5);
        hashMap.put("lineColor", str4);
        hashMap.put("title", str7);
        hashMap.put("backgroundColor", str6);
        return new TuwenTemplate(str, str2, str3, hashMap, null);
    }

    public static TuwenTemplate a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TuwenTemplate) ipChange.ipc$dispatch("b131f8ed", new Object[]{str, str2, str3, str4});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("loopStyle", str4);
        return new TuwenTemplate(str, str2, str3, hashMap, null);
    }

    public static TuwenTemplate a(String str, String str2, String str3, String str4, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TuwenTemplate) ipChange.ipc$dispatch("3284bf8b", new Object[]{str, str2, str3, str4, new Double(d)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("loopStyle", str4);
        hashMap.put("widthRatio", Double.valueOf(d));
        return new TuwenTemplate(str, str2, str3, hashMap, null);
    }

    public static List<TuwenTemplate> a(TuwenTemplate... tuwenTemplateArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43c46b67", new Object[]{tuwenTemplateArr});
        }
        ArrayList arrayList = new ArrayList();
        for (TuwenTemplate tuwenTemplate : tuwenTemplateArr) {
            arrayList.add(tuwenTemplate);
        }
        return arrayList;
    }

    public static TuwenTemplate a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TuwenTemplate) ipChange.ipc$dispatch("6b5c430f", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", noa.VALUE_CLICK_AREA_BLANK);
        hashMap.put("height", str);
        hashMap.put("bgcolor", "0xeeeeee");
        StringBuilder sb = new StringBuilder();
        sb.append("division_b");
        int i = f17003a + 1;
        f17003a = i;
        sb.append(i);
        return new TuwenTemplate(sb.toString(), "native", onk.NAME, hashMap, null);
    }
}
