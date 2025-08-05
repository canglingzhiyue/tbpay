package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.os.SystemClock;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.uc.webview.export.WebView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bte;
import tb.kge;
import tb.mtc;
import tb.mtd;
import tb.mtf;
import tb.mtj;
import tb.mtk;

/* loaded from: classes2.dex */
public class FirstTruckCacheSSRService implements mtd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_HTML = "fcc-html";
    public static final String CACHE_HTML_LENGTH = "html-byte-size";
    public static final String CACHE_PRIORITY = "cache-priority";
    public static final String CACHE_URL = "fcc-url";
    private static final String FCC_SEPARATOR = "<div><!--fcc--></div>";
    private static final String INVALIDATE_CACHE_SCRIPT = "<script>document.getRootNode().activeElement.innerHTML=null;document.head.innerHTML=null</script>";
    private static final String INVALIDATE_CACHE_SCRIPT_WITH_RELOAD = "<script>window.location.reload();</script>";
    public static final String RESPONSE_HEADER_ENABLE_FCC = "fcc-enable";
    public static final String RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP = "fcc-expire-time";
    public static final String RESPONSE_HEADER_FCC_RULE = "fcc-url-query-rule";
    public static final String RESPONSE_HEADER_FCC_VERSION = "fcc-version";
    public static final String SNAPSHOT_TAG = "Themis/Performance/Snapshot";
    public static final String TAG = "WindVane/NetworkSSRCache";
    private final mtd mService;

    static {
        kge.a(-263976488);
        kge.a(-1825485896);
    }

    private String translateType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2636086c", new Object[]{this, new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unexpected type" : "过期" : "覆盖" : "命中缓存" : "无缓存";
    }

    public static /* synthetic */ void access$000(FirstTruckCacheSSRService firstTruckCacheSSRService, ResponseContext responseContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886fd0a9", new Object[]{firstTruckCacheSSRService, responseContext, map});
        } else {
            firstTruckCacheSSRService.parseResponseHeaders(responseContext, map);
        }
    }

    public static /* synthetic */ String access$100(FirstTruckCacheSSRService firstTruckCacheSSRService, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68ba24c", new Object[]{firstTruckCacheSSRService, new Integer(i)}) : firstTruckCacheSSRService.translateType(i);
    }

    public static /* synthetic */ void access$200(FirstTruckCacheSSRService firstTruckCacheSSRService, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157cf4a9", new Object[]{firstTruckCacheSSRService, str, new Integer(i)});
        } else {
            firstTruckCacheSSRService.reportFirstChunkCache(str, i);
        }
    }

    public FirstTruckCacheSSRService() {
        if (j.commonConfig.cF) {
            this.mService = new SSRPrerenderService();
        } else {
            this.mService = mtf.b();
        }
    }

    private static List<String> listOf(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae8a9512", new Object[]{objArr});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return arrayList;
    }

    @Override // tb.mtd
    public boolean asyncSend(mtj mtjVar, final mtc mtcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d571220", new Object[]{this, mtjVar, mtcVar, handler})).booleanValue();
        }
        if (mtjVar == null) {
            e.a(RVLLevel.Error, TAG, "ssrRequest is null.");
            return false;
        }
        if (j.commonConfig.cG) {
            try {
                mtjVar.c.put("Browser-User-Agent", UCDefaultUserAgent.VALUE);
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                e.a(rVLLevel, TAG, "failed to add Browser-User-Agent header: " + e);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        final FirstChunkStorage firstChunkStorage = new FirstChunkStorage(mtjVar.f31244a);
        final ResponseContext read = firstChunkStorage.read(mtjVar.f31244a);
        final boolean z = read != null && read.isExpired();
        if (z) {
            firstChunkStorage.remove();
        }
        final boolean z2 = read != null && !TextUtils.isEmpty(read.getHtml()) && !z;
        if (z2) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", listOf("text/html"));
            mtcVar.onResponse(mtjVar, 200, hashMap);
            mtcVar.onReceiveData(mtjVar, read.getHtml().getBytes(StandardCharsets.UTF_8));
        }
        if (j.commonConfig.di && (mtcVar instanceof ChunkCacheRequestCallback)) {
            ((ChunkCacheRequestCallback) mtcVar).onCustomCallback(1, Boolean.valueOf(z2));
        }
        final long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        final ResponseContext responseContext = new ResponseContext();
        responseContext.setUrl(mtjVar.f31244a);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        return this.mService.asyncSend(mtjVar, new mtc() { // from class: android.taobao.windvane.extra.uc.FirstTruckCacheSSRService.1
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtc
            public void onResponse(mtj mtjVar2, int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                int i2 = 3;
                boolean z3 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a35e9ad6", new Object[]{this, mtjVar2, new Integer(i), map});
                    return;
                }
                FirstTruckCacheSSRService.access$000(FirstTruckCacheSSRService.this, responseContext, map);
                if (z2) {
                    i2 = (!responseContext.isEnable() || !TextUtils.equals(responseContext.getVersion(), read.getVersion())) ? 2 : 1;
                } else if (!z) {
                    i2 = 0;
                }
                b a2 = e.a(RVLLevel.Info, FirstTruckCacheSSRService.SNAPSHOT_TAG).a(bte.TAG_ACCESS).a("message", (Object) FirstTruckCacheSSRService.access$100(FirstTruckCacheSSRService.this, i2)).a("enable", Boolean.valueOf(responseContext.isEnable())).a("url", (Object) mtjVar2.f31244a).a("cost", Long.valueOf(uptimeMillis2)).a("responseHeaders", map).a("serverVersion", (Object) responseContext.getVersion());
                ResponseContext responseContext2 = read;
                b a3 = a2.a(a.CONFIG_LOCAL_VERSION, (Object) (responseContext2 == null ? "" : responseContext2.getVersion()));
                ResponseContext responseContext3 = read;
                a3.a("localPriority", Integer.valueOf(responseContext3 == null ? 0 : responseContext3.getPriority())).a();
                if (mtcVar instanceof ChunkCacheRequestCallback) {
                    if (j.commonConfig.di) {
                        ((ChunkCacheRequestCallback) mtcVar).onCustomCallback(0, Integer.valueOf(i2));
                    }
                    ((ChunkCacheRequestCallback) mtcVar).onNetworkResponse(i, map);
                }
                FirstTruckCacheSSRService.access$200(FirstTruckCacheSSRService.this, mtjVar2.f31244a, i2);
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                if (!z2 || !responseContext.isEnable() || TextUtils.equals(responseContext.getVersion(), read.getVersion())) {
                    z3 = false;
                }
                atomicBoolean3.set(z3);
                if (z2) {
                    if (responseContext.isEnable()) {
                        return;
                    }
                    e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("disableCache").a();
                    firstChunkStorage.remove();
                    String str = mtjVar2.f31244a;
                    if (str != null && str.contains("fcc-downgrade-failover=true")) {
                        e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("downgradeFailover").a();
                        mtcVar.onReceiveData(mtjVar2, FirstTruckCacheSSRService.INVALIDATE_CACHE_SCRIPT_WITH_RELOAD.getBytes(StandardCharsets.UTF_8));
                        return;
                    }
                    e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("downgradeDefault").a();
                    mtcVar.onReceiveData(mtjVar2, FirstTruckCacheSSRService.INVALIDATE_CACHE_SCRIPT.getBytes(StandardCharsets.UTF_8));
                    return;
                }
                mtcVar.onResponse(mtjVar2, i, map);
            }

            @Override // tb.mtc
            public void onReceiveData(mtj mtjVar2, byte[] bArr) {
                String str;
                int indexOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8d536689", new Object[]{this, mtjVar2, bArr});
                } else if (bArr == null) {
                } else {
                    if ((responseContext.isEnable() || atomicBoolean2.get()) && !atomicBoolean.get()) {
                        try {
                            byteArrayOutputStream.write(Arrays.copyOf(bArr, bArr.length));
                        } catch (IOException unused) {
                            e.a(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "failed to write bytes.");
                        }
                        String str2 = null;
                        try {
                            str = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        } catch (UnsupportedEncodingException e2) {
                            RVLLevel rVLLevel2 = RVLLevel.Error;
                            e.a(rVLLevel2, FirstTruckCacheSSRService.TAG, "toString error: " + e2.getMessage());
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(FirstTruckCacheSSRService.FCC_SEPARATOR)) >= 0) {
                            int i = indexOf + 21;
                            try {
                                str2 = str.substring(0, i);
                            } catch (Exception unused2) {
                                e.a(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "failed to substring firstTrunkHtml");
                            }
                            if (str2 != null) {
                                e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("fccIndexed").a();
                                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                                if (atomicBoolean2.get()) {
                                    e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("invalidateCache").a();
                                    mtcVar.onReceiveData(mtjVar2, FirstTruckCacheSSRService.INVALIDATE_CACHE_SCRIPT.getBytes(StandardCharsets.UTF_8));
                                    mtcVar.onReceiveData(mtjVar2, bytes);
                                }
                                int length = bytes.length - atomicInteger.get();
                                if (z2 && length >= 0 && length < bArr.length) {
                                    byte[] copyOfRange = Arrays.copyOfRange(bArr, length, bArr.length);
                                    if (copyOfRange.length > 0) {
                                        mtcVar.onReceiveData(mtjVar2, copyOfRange);
                                    }
                                } else {
                                    RVLLevel rVLLevel3 = RVLLevel.Error;
                                    e.a(rVLLevel3, FirstTruckCacheSSRService.TAG, "no remaining bytes fccByteIndex=" + length + ", bytes.length=" + bArr.length);
                                }
                                responseContext.setHtml(str2);
                                atomicBoolean.set(true);
                                long uptimeMillis3 = SystemClock.uptimeMillis();
                                if (j.commonConfig.db) {
                                    if (z2 && !atomicBoolean2.get()) {
                                        if (responseContext.getPriority() >= read.getPriority()) {
                                            firstChunkStorage.write(responseContext);
                                            e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("updateCache").a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).a();
                                        } else {
                                            e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("ignoreCacheUpdate").a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).a();
                                        }
                                    } else {
                                        firstChunkStorage.write(responseContext);
                                        e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("writeCache").a("index", Integer.valueOf(i)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).a();
                                    }
                                } else {
                                    firstChunkStorage.write(responseContext);
                                    e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG).a("writeCache").a("index", Integer.valueOf(i)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis3)).a();
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException unused3) {
                                    e.a(RVLLevel.Info, FirstTruckCacheSSRService.TAG, "failed to close byteArrayOutputStream");
                                }
                            }
                        }
                        if (!z2) {
                            mtcVar.onReceiveData(mtjVar2, bArr);
                        }
                    } else {
                        mtcVar.onReceiveData(mtjVar2, bArr);
                    }
                    atomicInteger.addAndGet(bArr.length);
                }
            }

            @Override // tb.mtc
            public void onError(mtj mtjVar2, mtk mtkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab769ea9", new Object[]{this, mtjVar2, mtkVar});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onError(mtjVar2, mtkVar);
            }

            @Override // tb.mtc
            public void onFinish(mtj mtjVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cfd81c6", new Object[]{this, mtjVar2});
                    return;
                }
                mtc mtcVar2 = mtcVar;
                if (mtcVar2 == null) {
                    return;
                }
                mtcVar2.onFinish(mtjVar2);
            }
        }, handler);
    }

    @Override // tb.mtd
    public boolean cancel(mtj mtjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9299d0f2", new Object[]{this, mtjVar})).booleanValue() : this.mService.cancel(mtjVar);
    }

    private void parseResponseHeaders(ResponseContext responseContext, Map<String, List<String>> map) {
        List list;
        List list2;
        List list3;
        List list4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22ec474", new Object[]{this, responseContext, map});
            return;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_ENABLE_FCC) && (list4 = (List) treeMap.get(RESPONSE_HEADER_ENABLE_FCC)) != null && list4.size() > 0) {
            String str = (String) list4.get(0);
            if (!TextUtils.isEmpty(str)) {
                responseContext.setEnable("true".equals(str));
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_RULE) && (list3 = (List) treeMap.get(RESPONSE_HEADER_FCC_RULE)) != null && list3.size() > 0) {
            String str2 = (String) list3.get(0);
            if (!TextUtils.isEmpty(str2)) {
                responseContext.setRule(str2);
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_VERSION) && (list2 = (List) treeMap.get(RESPONSE_HEADER_FCC_VERSION)) != null && list2.size() > 0) {
            String str3 = (String) list2.get(0);
            if (!TextUtils.isEmpty(str3)) {
                responseContext.setVersion(str3);
            }
        }
        if (treeMap.containsKey(RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP) && (list = (List) treeMap.get(RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP)) != null && list.size() > 0) {
            String str4 = (String) list.get(0);
            if (!TextUtils.isEmpty(str4)) {
                try {
                    responseContext.setExpiredTime(Long.parseLong(str4));
                } catch (Exception unused) {
                }
            }
        }
        if (responseContext.getExpiredTime() != 0) {
            return;
        }
        responseContext.setExpiredTime(ResponseContext.getDefaultExpiredTime());
    }

    private void reportFirstChunkCache(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6380761", new Object[]{this, str, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("type", (Object) Integer.valueOf(i));
        android.taobao.windvane.monitor.a.commitSuccess("firstChunkCache", jSONObject.toJSONString());
    }

    public static void reportType(WebView webView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e830be", new Object[]{webView, new Integer(i)});
        } else if (webView == null || i < 0 || !(webView instanceof WVUCWebView)) {
        } else {
            ((WVUCWebView) webView).getWebViewContext().getWebViewPageModel().onProperty("firstChunkCache", Integer.valueOf(i));
        }
    }
}
