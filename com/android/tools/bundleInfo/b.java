package com.android.tools.bundleInfo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.split.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.android.behavix.feature.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.bhm;
import tb.bho;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BundleInfoManager";

    /* renamed from: a  reason: collision with root package name */
    private static b f6418a;
    private final ThreadPoolExecutor b;
    private BundleListing c;
    private Context e;
    private volatile boolean d = false;
    private Map<String, DynamicFeatureInfo> f = new ConcurrentHashMap();

    public static /* synthetic */ int a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4844472f", new Object[]{bVar, str})).intValue() : bVar.t(str);
    }

    private DynamicFeatureInfo a(DynamicFeatureInfo dynamicFeatureInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("9c367bc6", new Object[]{this, dynamicFeatureInfo});
        }
        DynamicFeatureInfo dynamicFeatureInfo2 = new DynamicFeatureInfo();
        dynamicFeatureInfo2.bindingActivities = dynamicFeatureInfo.bindingActivities;
        dynamicFeatureInfo2.appVersion = dynamicFeatureInfo.appVersion;
        dynamicFeatureInfo2.dependencies = dynamicFeatureInfo.dependencies;
        dynamicFeatureInfo2.matchedAppVersion = dynamicFeatureInfo.matchedAppVersion;
        dynamicFeatureInfo2.matchedFeatureMd5 = dynamicFeatureInfo.matchedFeatureMd5;
        dynamicFeatureInfo2.matchedAppFeatureMd5 = dynamicFeatureInfo.matchedAppFeatureMd5;
        dynamicFeatureInfo2.featureName = dynamicFeatureInfo.featureName;
        dynamicFeatureInfo2.md5 = dynamicFeatureInfo.md5;
        dynamicFeatureInfo2.priority = dynamicFeatureInfo.priority;
        dynamicFeatureInfo2.size = dynamicFeatureInfo.size;
        dynamicFeatureInfo2.status = dynamicFeatureInfo.status;
        dynamicFeatureInfo2.version = dynamicFeatureInfo.version;
        dynamicFeatureInfo2.url = dynamicFeatureInfo.url;
        dynamicFeatureInfo2.views = dynamicFeatureInfo.views;
        dynamicFeatureInfo2.fragments = dynamicFeatureInfo.fragments;
        dynamicFeatureInfo2.classes = dynamicFeatureInfo.classes;
        dynamicFeatureInfo2.implServices = dynamicFeatureInfo.implServices;
        dynamicFeatureInfo2.featureInitalClass = dynamicFeatureInfo.featureInitalClass;
        return dynamicFeatureInfo2;
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ff9f21b8", new Object[0]);
            }
            if (f6418a == null) {
                f6418a = new b();
            }
            return f6418a;
        }
    }

    private b() {
        if (this.c == null) {
            try {
                this.c = BundleInfoGenerator.a();
                Log.e(TAG, "generate info from generator");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.b = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.android.tools.bundleInfo.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "loaddffromdisk");
            }
        });
        this.b.allowCoreThreadTimeOut(true);
        bhm.a().a(new bho() { // from class: com.android.tools.bundleInfo.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bho
            public void a(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                } else {
                    b.this.a(str, i);
                }
            }
        }, null);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        synchronized (this.f) {
            if (this.f.containsKey(str)) {
                this.f.get(str).status = i;
            }
        }
    }

    public synchronized void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.d) {
            this.e = context;
            long currentTimeMillis = System.currentTimeMillis();
            InputStream inputStream = null;
            try {
                inputStream = context.getAssets().open(String.format("bundleInfo-%s.json", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                JSONArray jSONArray = new JSONArray(new String(bArr));
                for (int i = 0; i < jSONArray.length(); i++) {
                    DynamicFeatureInfo dynamicFeatureInfo = new DynamicFeatureInfo();
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    dynamicFeatureInfo.url = jSONObject.optString("url");
                    if (jSONObject.optJSONArray("views") != null) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("views");
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            dynamicFeatureInfo.views.add(optJSONArray.getString(i2));
                        }
                    }
                    if (jSONObject.optJSONArray("fragments") != null) {
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("fragments");
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            dynamicFeatureInfo.fragments.add(optJSONArray2.getString(i3));
                        }
                    }
                    if (jSONObject.optJSONObject("implServices") != null) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("implServices");
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            dynamicFeatureInfo.implServices.put(next, optJSONObject.getString(next));
                        }
                    }
                    if (jSONObject.optJSONArray("classes") != null) {
                        JSONArray optJSONArray3 = jSONObject.optJSONArray("classes");
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            dynamicFeatureInfo.classes.add(optJSONArray3.getString(i4));
                        }
                    }
                    if (jSONObject.optJSONArray("dependencies") != null) {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray("dependencies");
                        for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                            dynamicFeatureInfo.dependencies.add(optJSONArray4.getString(i5));
                        }
                    }
                    if (jSONObject.optJSONArray("bindingActivities") != null) {
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("bindingActivities");
                        for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                            dynamicFeatureInfo.bindingActivities.add(optJSONArray5.getString(i6));
                        }
                    }
                    dynamicFeatureInfo.priority = jSONObject.optInt("priority", -1);
                    dynamicFeatureInfo.version = jSONObject.optString("version");
                    dynamicFeatureInfo.featureInitalClass = jSONObject.optString("featureInitalClass");
                    dynamicFeatureInfo.matchedAppVersion = jSONObject.optString("matchedAppVersion");
                    dynamicFeatureInfo.matchedFeatureMd5 = jSONObject.optString("matchedFeatureMd5");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("matchedAppFeatureMd5");
                    if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            dynamicFeatureInfo.matchedAppFeatureMd5.put(next2, optJSONObject2.optString(next2));
                        }
                    }
                    dynamicFeatureInfo.appVersion = jSONObject.optString("appVersion");
                    dynamicFeatureInfo.md5 = jSONObject.optString("md5");
                    dynamicFeatureInfo.size = jSONObject.optLong("size");
                    dynamicFeatureInfo.featureName = jSONObject.optString(a.FEATURE_NAME);
                    this.f.put(dynamicFeatureInfo.featureName, dynamicFeatureInfo);
                }
                this.d = true;
                try {
                    a("Merge", true, System.currentTimeMillis() - currentTimeMillis, "", context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                try {
                    a("Merge", false, 0L, e3.getMessage(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.c != null && this.c.getBundles().size() > 0) {
                    for (BundleListing.a aVar : this.c.getBundles().values()) {
                        if (aVar.b.booleanValue()) {
                            DynamicFeatureInfo dynamicFeatureInfo2 = new DynamicFeatureInfo();
                            try {
                                dynamicFeatureInfo2.appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                            } catch (Exception unused) {
                                e3.printStackTrace();
                            }
                            dynamicFeatureInfo2.dependencies = aVar.o;
                            dynamicFeatureInfo2.matchedAppVersion = "";
                            dynamicFeatureInfo2.featureName = aVar.d;
                            dynamicFeatureInfo2.priority = aVar.t;
                            dynamicFeatureInfo2.size = aVar.s;
                            dynamicFeatureInfo2.status = 0;
                            dynamicFeatureInfo2.version = aVar.c;
                            dynamicFeatureInfo2.views = aVar.k;
                            dynamicFeatureInfo2.fragments = aVar.l;
                            dynamicFeatureInfo2.classes = aVar.n;
                            dynamicFeatureInfo2.implServices = aVar.m;
                            dynamicFeatureInfo2.featureInitalClass = aVar.q;
                            this.f.put(aVar.d, dynamicFeatureInfo2);
                        }
                    }
                }
                e3.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    public Collection<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo.priority == 0) {
                    arrayList.add(dynamicFeatureInfo.featureName);
                }
            }
        }
        return arrayList;
    }

    public Collection<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a1fc79d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo.priority == 1) {
                    arrayList.add(dynamicFeatureInfo.featureName);
                }
            }
        }
        return arrayList;
    }

    private int t(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7554abf8", new Object[]{this, str})).intValue() : this.f.get(str).priority;
    }

    public Collection<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("bf91abc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo.priority > 1 && dynamicFeatureInfo.priority < 10) {
                    arrayList.add(dynamicFeatureInfo.featureName);
                }
            }
        }
        Collections.sort(arrayList, new Comparator<String>() { // from class: com.android.tools.bundleInfo.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
            }

            public int a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : b.a(b.this, str) - b.a(b.this, str2);
            }
        });
        return arrayList;
    }

    public Collection<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("dd26ddb", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo.priority > 9) {
                    arrayList.add(dynamicFeatureInfo.featureName);
                }
            }
        }
        return arrayList;
    }

    private void a(final String str, final boolean z, final long j, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79971517", new Object[]{this, str, new Boolean(z), new Long(j), str2, new Integer(i)});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.tools.bundleInfo.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (com.alibaba.android.split.a.a((Class<? extends Object>) j.class, new Object[0]) == null) {
                    } else {
                        try {
                            ((j) com.alibaba.android.split.a.a((Class<? extends Object>) j.class, new Object[0])).a("MergeFeatureInfo", z, str, j, z ? 0 : -1, str2, i);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, 5000L);
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing == null || bundleListing.getBundles().size() <= 0) {
            return "";
        }
        for (BundleListing.a aVar : this.c.bundles.values()) {
            if (aVar.b.booleanValue() && aVar.d.equals(str)) {
                return aVar.e;
            }
        }
        return "";
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing == null || bundleListing.getBundles().size() <= 0) {
            return "";
        }
        for (BundleListing.a aVar : this.c.bundles.values()) {
            if (aVar.b.booleanValue() && aVar.d.equals(str)) {
                return aVar.f;
            }
        }
        return "";
    }

    public DynamicFeatureInfo c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("fde10c43", new Object[]{this, str});
        }
        if (!this.d) {
            a(com.android.tools.ir.runtime.d.b().a());
        }
        synchronized (this.f) {
            DynamicFeatureInfo dynamicFeatureInfo = this.f.get(str);
            if (dynamicFeatureInfo == null) {
                return null;
            }
            return a(dynamicFeatureInfo);
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : BundleInfoGenerator.f6416a.booleanValue();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : BundleInfoGenerator.b.booleanValue();
    }

    public Set<String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("3fc01e9e", new Object[]{this}) : BundleInfoGenerator.lastestAppVersions;
    }

    public BundleListing.a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("590f394e", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            BundleListing.a aVar = this.c.getBundles().get(str);
            if (aVar != null) {
                return aVar;
            }
            String str2 = "Could not find info for: " + str;
        }
        return null;
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.views.contains(str)) {
                    return dynamicFeatureInfo.featureName;
                }
            }
            return null;
        }
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.fragments.contains(str)) {
                    return dynamicFeatureInfo.featureName;
                }
            }
            return null;
        }
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.classes.contains(str)) {
                    return dynamicFeatureInfo.featureName;
                }
            }
            return null;
        }
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.implServices.containsKey(str)) {
                    return dynamicFeatureInfo.implServices.get(str);
                }
            }
            for (BundleListing.a aVar : this.c.getBundles().values()) {
                String str2 = aVar.m.get(str);
                if (!StringUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return null;
        }
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.implServices.containsKey(str)) {
                    return dynamicFeatureInfo.featureName;
                }
            }
            return null;
        }
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && !StringUtils.isEmpty(dynamicFeatureInfo.featureInitalClass) && dynamicFeatureInfo.featureInitalClass.equals(str)) {
                    return dynamicFeatureInfo.featureName;
                }
            }
            return null;
        }
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711ebb64", new Object[]{this, str});
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.featureName.equals(str)) {
                    return dynamicFeatureInfo.featureInitalClass;
                }
            }
            return null;
        }
    }

    public BundleListing.a l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("3c7f1c46", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.h.containsKey(str)) {
                    return aVar;
                }
            }
            String str2 = "Could not find info for: " + str;
        }
        return null;
    }

    public BundleListing.a m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("d8ed18a5", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.j.containsKey(str)) {
                    return aVar;
                }
            }
            String str2 = "Could not find info for: " + str;
        }
        return null;
    }

    public BundleListing.a n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleListing.a) ipChange.ipc$dispatch("755b1504", new Object[]{this, str});
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.g.containsKey(str)) {
                    return aVar;
                }
            }
            String str2 = "Could not find info for: " + str;
        }
        return null;
    }

    public boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25cadc4", new Object[]{this, str})).booleanValue();
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.b.booleanValue() && aVar.h.containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf86454a", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.views.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8e4705", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.f) {
            for (DynamicFeatureInfo dynamicFeatureInfo : this.f.values()) {
                if (dynamicFeatureInfo != null && dynamicFeatureInfo.fragments.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96bfe046", new Object[]{this, str})).booleanValue();
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.b.booleanValue() && aVar.j.containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0f17987", new Object[]{this, str})).booleanValue();
        }
        BundleListing bundleListing = this.c;
        if (bundleListing != null && bundleListing.getBundles() != null) {
            for (BundleListing.a aVar : this.c.bundles.values()) {
                if (aVar.b.booleanValue() && aVar.g.containsKey(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : new ArrayList(this.f.keySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s(java.lang.String r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.android.tools.bundleInfo.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "2b2312c8"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            com.android.tools.bundleInfo.BundleListing r0 = r5.c
            if (r0 == 0) goto L58
            java.util.concurrent.ConcurrentHashMap r0 = r0.getBundles()
            if (r0 != 0) goto L27
            goto L58
        L27:
            com.android.tools.bundleInfo.BundleListing r0 = r5.c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.android.tools.bundleInfo.BundleListing$a> r0 = r0.bundles
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.android.tools.bundleInfo.BundleListing$a r1 = (com.android.tools.bundleInfo.BundleListing.a) r1
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r1.g
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L57
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r1.h
            boolean r4 = r4.containsKey(r6)
            if (r4 != 0) goto L57
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r1.j
            boolean r1 = r1.containsKey(r6)
            if (r1 == 0) goto L33
        L57:
            return r2
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tools.bundleInfo.b.s(java.lang.String):boolean");
    }
}
