package com.taobao.android.sku.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.jpd;
import tb.jpe;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f15206a;
    private static Pattern b;

    static {
        kge.a(1864890182);
        f15206a = Pattern.compile("\\$dxArgs\\[\\d+\\]\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");
        b = Pattern.compile("\\$\\{\\s*\\}");
    }

    public static Object a(Object obj, Object obj2, String str) {
        Object a2;
        Object obj3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ba76d88", new Object[]{obj, obj2, str});
        }
        if ((obj == null && obj2 == null) || str == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = f15206a.matcher(sb);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int length = sb.length();
            String group = matcher.group();
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int a3 = a(group);
                if (a3 >= list.size() || a3 < 0) {
                    obj3 = str;
                } else {
                    obj3 = list.get(a3);
                    String replaceAll = group.replaceAll("\\$dxArgs\\[\\d+\\]", "\\$");
                    if (!b.matcher(replaceAll).matches()) {
                        a2 = jpd.a(obj3, replaceAll);
                    }
                }
                a2 = obj3;
            } else {
                String replaceAll2 = group.replaceAll("\\$dxArgs\\[0\\]", "\\$");
                a2 = b.matcher(replaceAll2).matches() ? obj2 : jpd.a(obj2, replaceAll2);
            }
            if (start == 0 && end == length) {
                return a2;
            }
            sb.replace(start, end, a2 == null ? "" : a2.toString());
            matcher = f15206a.matcher(sb);
            z = true;
        }
        if (z) {
            return sb.toString();
        }
        return jpe.a(obj, str);
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        Matcher matcher = Pattern.compile("\\$dxArgs\\[(.*?)\\]").matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        return Integer.parseInt(matcher.group(1));
    }
}
