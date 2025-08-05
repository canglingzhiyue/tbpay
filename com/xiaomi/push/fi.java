package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class fi {

    /* renamed from: a  reason: collision with root package name */
    private static Vector<Pair<String, Long>> f24472a = new Vector<>();

    /* renamed from: a  reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f354a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f24472a) {
            for (int i = 0; i < f24472a.size(); i++) {
                Pair<String, Long> elementAt = f24472a.elementAt(i);
                sb.append((String) elementAt.first);
                sb.append(":");
                sb.append(elementAt.second);
                if (i < f24472a.size() - 1) {
                    sb.append(";");
                }
            }
            f24472a.clear();
        }
        return sb.toString();
    }
}
