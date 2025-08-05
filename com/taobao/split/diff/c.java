package com.taobao.split.diff;

import android.content.Context;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f19710a;
    private Map<String, DynamicFeatureDiffInfo> b;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static c f19711a;

        static {
            kge.a(-2123658093);
            f19711a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b1835f98", new Object[0]) : f19711a;
        }
    }

    static {
        kge.a(-646102083);
    }

    private c() {
        this.f19710a = false;
        this.b = new ConcurrentHashMap();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b1835f98", new Object[0]) : a.a();
    }

    public DynamicFeatureDiffInfo a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureDiffInfo) ipChange.ipc$dispatch("189ac03d", new Object[]{this, str, str2});
        }
        a(str2);
        return this.b.get(str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f19710a) {
        } else {
            b(str);
        }
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.f19710a) {
            InputStream inputStream = null;
            try {
                Context t = k.a().b().t();
                inputStream = AssetsDelegate.proxy_open(t.getAssets(), String.format("bundleInfo-%s-%s-opt.json", t.getPackageManager().getPackageInfo(t.getPackageName(), 0).versionName, str));
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                JSONArray jSONArray = new JSONArray(new String(bArr));
                for (int i = 0; i < jSONArray.length(); i++) {
                    DynamicFeatureDiffInfo dynamicFeatureDiffInfo = new DynamicFeatureDiffInfo();
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    dynamicFeatureDiffInfo.url = jSONObject.optString("url");
                    dynamicFeatureDiffInfo.md5 = jSONObject.optString("md5");
                    dynamicFeatureDiffInfo.size = jSONObject.optLong("size");
                    dynamicFeatureDiffInfo.appVersion = jSONObject.optString("appVersion");
                    dynamicFeatureDiffInfo.version = jSONObject.optString("version");
                    dynamicFeatureDiffInfo.baseMd5 = jSONObject.optString("baseMd5");
                    dynamicFeatureDiffInfo.newMd5 = jSONObject.optString("newMd5");
                    dynamicFeatureDiffInfo.baseAppVersion = jSONObject.optString("baseAppVersion");
                    dynamicFeatureDiffInfo.featureName = jSONObject.optString(com.taobao.android.behavix.feature.a.FEATURE_NAME);
                    dynamicFeatureDiffInfo.sameFile = jSONObject.optBoolean("sameFile");
                    this.b.put(dynamicFeatureDiffInfo.featureName, dynamicFeatureDiffInfo);
                }
                this.f19710a = true;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }
}
