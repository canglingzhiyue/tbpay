package com.alibaba.poplayer.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, d> f3218a;
    private Matcher b;

    static {
        kge.a(-1283649042);
        f3218a = new HashMap<>();
    }

    private d(String str) {
        this.b = Pattern.compile(str).matcher("");
    }

    public static synchronized boolean a(String str, String str2) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
            }
            try {
                d dVar = f3218a.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    f3218a.put(str, dVar);
                }
                return dVar.b.reset(str2).find();
            } catch (Exception e) {
                c.a("PatternMatcher.match %s --> %s error", str, str2);
                c.a("PatternMatcher.match", e);
                return false;
            }
        }
    }
}
