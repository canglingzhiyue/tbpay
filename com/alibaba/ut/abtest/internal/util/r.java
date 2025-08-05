package com.alibaba.ut.abtest.internal.util;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes3.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f4206a;

    static {
        kge.a(-1489509809);
    }

    private r(String str) {
        this.f4206a = Uri.parse(str);
    }

    public static r a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("548184d9", new Object[]{str}) : new r(str);
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        if (this.f4206a.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = this.f4206a.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(encodedQuery.substring(i, indexOf2));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (this.f4206a.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        if (str == null) {
            throw new NullPointerException("key");
        }
        String encodedQuery = this.f4206a.getEncodedQuery();
        if (encodedQuery == null) {
            return null;
        }
        int length = encodedQuery.length();
        int i = 0;
        while (true) {
            int indexOf = encodedQuery.indexOf(38, i);
            int i2 = indexOf != -1 ? indexOf : length;
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > i2 || indexOf2 == -1) {
                indexOf2 = i2;
            }
            if (indexOf2 - i == str.length() && encodedQuery.regionMatches(i, str, 0, str.length())) {
                return indexOf2 == i2 ? "" : encodedQuery.substring(indexOf2 + 1, i2);
            } else if (indexOf == -1) {
                return null;
            } else {
                i = indexOf + 1;
            }
        }
    }
}
