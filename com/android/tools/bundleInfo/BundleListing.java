package com.android.tools.bundleInfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class BundleListing implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ConcurrentHashMap<String, a> bundles = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6417a;
        public Boolean b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String p;
        public String q;
        public long s;
        public int t;
        public Map<String, Boolean> g = new HashMap();
        public Map<String, Boolean> h = new HashMap();
        public Map<String, Boolean> i = new HashMap();
        public Map<String, Boolean> j = new HashMap();
        public List<String> k = new ArrayList();
        public List<String> l = new ArrayList();
        public Map<String, String> m = new HashMap();
        public List<String> n = new ArrayList();
        public List<String> o = new ArrayList();
        public List<String> u = new ArrayList();
        public boolean r = false;
    }

    public ConcurrentHashMap<String, a> getBundles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("407a46a4", new Object[]{this}) : this.bundles;
    }

    public void setBundles(ConcurrentHashMap<String, a> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d5e846", new Object[]{this, concurrentHashMap});
        } else {
            this.bundles = concurrentHashMap;
        }
    }
}
