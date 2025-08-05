package com.taobao.taobao.utils;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static HashMap<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f3679248", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data != null) {
            return a(data);
        }
        return null;
    }

    public static HashMap<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("46f1a182", new Object[]{uri});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Set<String> b = b(uri);
        if (b == null || b.isEmpty()) {
            return null;
        }
        for (String str : b) {
            String queryParameter = uri.getQueryParameter(str);
            if (str != null && queryParameter != null) {
                hashMap.put(str, queryParameter);
            }
        }
        return hashMap;
    }

    public static Set<String> b(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5c6b67ed", new Object[]{uri});
        }
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
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
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
