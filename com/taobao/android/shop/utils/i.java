package com.taobao.android.shop.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import anet.channel.util.HttpConstant;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.alibaba.aliweex.adapter.module.net.IWXConnection;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.IApmEventListener;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXPerformance;
import com.taobao.weex.common.WXResponse;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.bdx;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static i m;
    private long b;
    private com.taobao.alivfssdk.cache.b c;
    private ReentrantLock f;
    private ReentrantLock g;
    private Long h = 0L;
    private String i = "";
    private String j = "";
    private Boolean k = false;

    /* renamed from: a  reason: collision with root package name */
    public IApmEventListener f15117a = new IApmEventListener() { // from class: com.taobao.android.shop.utils.i.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (1 != i) {
            } else {
                try {
                    i.this.b();
                } catch (Throwable th) {
                    com.taobao.android.shop.utils.a.a("-73301", "error in release memory of WeexCacheHelper.", th, "IApmEventListener " + i);
                    c.b("-73301", "error in release memory of WeexCacheHelper.", bdx.F_TEMPLATE_DOWNLOAD_TAG, th, "IApmEventListener " + i);
                }
            }
        }
    };
    private ConcurrentHashMap<String, Long> d = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, SoftReference<String>> e = new ConcurrentHashMap<>();
    private List<String> l = new CopyOnWriteArrayList();

    static {
        kge.a(576055371);
    }

    public static /* synthetic */ long a(i iVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a084f1c4", new Object[]{iVar, new Long(j)})).longValue();
        }
        iVar.b = j;
        return j;
    }

    public static /* synthetic */ long a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a421211", new Object[]{map})).longValue() : b(map);
    }

    public static /* synthetic */ ReentrantLock a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantLock) ipChange.ipc$dispatch("8dc229b8", new Object[]{iVar}) : iVar.f;
    }

    public static /* synthetic */ void a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93ca83e", new Object[]{iVar, str});
        } else {
            iVar.d(str);
        }
    }

    public static /* synthetic */ void a(i iVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946b7e88", new Object[]{iVar, str, str2});
        } else {
            iVar.b(str, str2);
        }
    }

    public static /* synthetic */ Request b(i iVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("3147a2a7", new Object[]{iVar, str}) : iVar.j(str);
    }

    public static /* synthetic */ com.taobao.alivfssdk.cache.b b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alivfssdk.cache.b) ipChange.ipc$dispatch("2f4761ea", new Object[]{iVar}) : iVar.c();
    }

    public static /* synthetic */ ReentrantLock c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantLock) ipChange.ipc$dispatch("9c13ee3a", new Object[]{iVar}) : iVar.g;
    }

    public static /* synthetic */ List d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4101cd6", new Object[]{iVar}) : iVar.l;
    }

    public static /* synthetic */ long e(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc0465e4", new Object[]{iVar})).longValue() : iVar.g();
    }

    public static /* synthetic */ String f(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("960481f1", new Object[]{iVar}) : iVar.i();
    }

    private i() {
        this.b = android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE;
        this.f = null;
        this.g = null;
        if (g() > 0) {
            this.b = g();
        }
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
        com.taobao.application.common.c.a(this.f15117a);
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("16e77a74", new Object[0]);
        }
        if (m == null) {
            synchronized (i.class) {
                if (m == null) {
                    m = new i();
                }
            }
        }
        return m;
    }

    private boolean c(String str) {
        Long e;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : f() && (e = e(str)) != null && System.currentTimeMillis() - e.longValue() < this.b;
    }

    private void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            final Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (d()) {
                this.d.put(str, valueOf);
            }
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.shop.utils.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (i.a(i.this) == null) {
                        Log.e("WeexCacheHelper", "updateTimeLock不存在");
                    } else {
                        try {
                            i.a(i.this).lock();
                            i.b(i.a()).a(i.class.getClassLoader()).b().a(str, (Object) String.valueOf(valueOf));
                            com.taobao.android.shop.utils.a.c("更新js bundle时间成功：,url == ", str);
                        } catch (Exception e) {
                            com.taobao.android.shop.utils.a.a("-73303", "error in WeexCacheHelper.setJSBundleUpdateTime 更新js bundle时间失败.", e, str, valueOf);
                            c.b("-73303", "error in WeexCacheHelper.setJSBundleUpdateTime 更新js bundle时间失败.", bdx.F_TEMPLATE_DOWNLOAD_TAG, e, str, valueOf);
                        } finally {
                            i.a(i.this).unlock();
                        }
                    }
                }
            }, 20);
        }
    }

    private Long e(String str) {
        ConcurrentHashMap<String, Long> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("1505f51f", new Object[]{this, str});
        }
        if (d() && (concurrentHashMap = this.d) != null && concurrentHashMap.containsKey(str) && this.d.get(str) != null) {
            return this.d.get(str);
        }
        com.taobao.alivfssdk.cache.h b = c().a(i.class.getClassLoader()).b();
        if (b != null && b.a(str)) {
            try {
                Long valueOf = Long.valueOf(Long.parseLong((String) b.a(str, (Class<Object>) String.class)));
                this.d.put(str, valueOf);
                return valueOf;
            } catch (Throwable th) {
                com.taobao.android.shop.utils.a.a("-73304", "error in WeexCacheHelper.getJSBundleUpdateTime 更新时间到内存错误.", th, str);
                c.b("-73304", "error in WeexCacheHelper.getJSBundleUpdateTime 更新时间到内存错误.", bdx.F_TEMPLATE_DOWNLOAD_TAG, th, str);
            }
        }
        return null;
    }

    public String a(String str) {
        String str2;
        ConcurrentHashMap<String, SoftReference<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.h = -1L;
        this.i = "blankUrl";
        this.j = "unkown";
        this.k = null;
        String i = i(str);
        if (!e()) {
            return null;
        }
        boolean z = !c(i);
        if (d() && (concurrentHashMap = this.e) != null && concurrentHashMap.containsKey(i) && this.e.get(i) != null && !StringUtils.isEmpty(this.e.get(i).get())) {
            if (z) {
                h(str);
            }
            this.h = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            this.i = i;
            this.j = "内存";
            this.k = Boolean.valueOf(z);
            if (this.e.get(i) != null) {
                return this.e.get(i).get();
            }
        }
        if (!c().a(i.class.getClassLoader()).a().a(i)) {
            str2 = "";
            z = true;
        } else {
            str2 = (String) c().a(i.class.getClassLoader()).a().a(i, (Class<Object>) String.class);
            if (!StringUtils.isEmpty(str2)) {
                this.e.put(i, new SoftReference<>(str2));
            }
        }
        if (z) {
            h(str);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Object[] objArr = new Object[7];
        objArr[0] = "main-cost WeexCacheHelper 从统一存储读取结束. ";
        objArr[1] = !StringUtils.isEmpty(str2) ? ResultCode.MSG_SUCCESS : "不存在";
        objArr[2] = z ? "开启远程更新" : "不更新";
        objArr[3] = "cost ";
        long j = currentTimeMillis2 - currentTimeMillis;
        objArr[4] = Long.valueOf(j);
        objArr[5] = "ms. ";
        if (str.length() > 65) {
            str = str.substring(5, 60);
        }
        objArr[6] = str;
        com.taobao.android.shop.utils.a.a(objArr);
        this.h = Long.valueOf(j);
        this.i = i;
        this.j = StringUtils.isEmpty(str2) ? "Bundle不存在" : "统一存储-磁盘";
        this.k = Boolean.valueOf(z);
        return str2;
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -2;
        }
        if (this.e.containsKey(str) && this.e.get(str) != null && this.e.get(str).get() != null) {
            return -1;
        }
        String str2 = "";
        if (StringUtils.isEmpty(str2)) {
            str2 = (String) c().a(i.class.getClassLoader()).a().a(str, (Class<Object>) String.class);
        }
        if (StringUtils.isEmpty(str2)) {
            return 0;
        }
        this.e.put(str, new SoftReference<>(str2));
        return str2.length();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, SoftReference<String>> concurrentHashMap2 = this.e;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        List<String> list = this.l;
        if (list != null) {
            list.clear();
        }
        c().a(i.class.getClassLoader()).a().c();
    }

    public Map<String, Object> a(Context context, String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a75136df", new Object[]{this, context, str});
        }
        String i = i(str);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("lastGetWay", this.j);
            hashMap.put("lastDoUpdate", this.k);
            hashMap.put("lastCost", this.h);
            hashMap.put("lastUrl", this.i);
            if (this.e.get(i) != null) {
                bool = Boolean.valueOf(this.e.get(i).get() != null);
            } else {
                bool = "not exist";
            }
            hashMap.put("memory", bool);
            hashMap.put("file", Boolean.valueOf(c().a(i.class.getClassLoader()).a().a(i)));
            hashMap.put("dirExits", Boolean.valueOf(c().a(i.class.getClassLoader()).e().exists()));
            hashMap.put("fileLength", Long.valueOf(c().a(i.class.getClassLoader()).a().e(i)));
            hashMap.put("memorySoftRef", Boolean.valueOf(this.e.containsKey(i)));
            hashMap.put("isJSBundleValid", Boolean.valueOf(c(i)));
            hashMap.put("mMaxAgeMillis", Long.valueOf(this.b));
            hashMap.put("memoryKeys", this.e.keySet());
            File file = new File(c().a(i.class.getClassLoader()).e().getPath() + "/files");
            if (file.exists() && file.listFiles().length > 0) {
                hashMap.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_COUNT, Integer.valueOf(file.listFiles()[0].listFiles().length));
            } else if (file.exists()) {
                hashMap.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_COUNT, "-999");
            } else {
                hashMap.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_COUNT, "not exist");
            }
        } catch (Throwable th) {
            com.taobao.android.shop.utils.a.a("-73307", "error in WeexCacheHelper.reportStatus.", th, str);
            c.b("-73307", "error in WeexCacheHelper.reportStatus.", bdx.F_TEMPLATE_DOWNLOAD_TAG, th, str);
        }
        return hashMap;
    }

    private void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        final String i = i(str);
        if (d()) {
            this.e.put(i, new SoftReference<>(str2));
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.shop.utils.i.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (i.c(i.this) == null) {
                    Log.e("WeexCacheHelper", "saveJSBundleLock不存在");
                } else {
                    i.c(i.this).lock();
                    try {
                        i.b(i.a()).a(i.class.getClassLoader()).a().a(i, str2, new h.f() { // from class: com.taobao.android.shop.utils.i.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.alivfssdk.cache.h.f
                            public void onObjectSetCallback(String str3, boolean z) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("1c2b525a", new Object[]{this, str3, new Boolean(z)});
                                } else if (!z) {
                                    com.taobao.android.shop.utils.a.a("-73306", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储失败.", str, str3);
                                    c.b("-73306", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储失败.", bdx.F_TEMPLATE_DOWNLOAD_TAG, str, str3);
                                } else {
                                    com.taobao.android.shop.utils.a.c("存储完毕。是否成功：", z + ",key == ", str3);
                                    i.a(i.a(), str3);
                                }
                            }
                        });
                    } catch (Exception e) {
                        com.taobao.android.shop.utils.a.a("-73305", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储异常.", e, str);
                        c.b("-73305", "error in WeexCacheHelper.putCachedJSBundleToFile JS写存储异常.", bdx.F_TEMPLATE_DOWNLOAD_TAG, e, str);
                    } finally {
                        i.c(i.this).unlock();
                    }
                }
            }
        }, 20);
    }

    private com.taobao.alivfssdk.cache.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alivfssdk.cache.b) ipChange.ipc$dispatch("a95989f3", new Object[]{this});
        }
        if (this.c == null) {
            this.c = AVFSCacheManager.getInstance().cacheForModule("taobao_shop");
        }
        return this.c;
    }

    private IWXHttpAdapter.OnHttpListener f(final String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXHttpAdapter.OnHttpListener) ipChange.ipc$dispatch("3930e581", new Object[]{this, str}) : new IWXHttpAdapter.OnHttpListener() { // from class: com.taobao.android.shop.utils.i.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
            public void onHttpResponseProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
            public void onHttpStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5005ca2", new Object[]{this});
                }
            }

            @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
            public void onHttpUploadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39b2fe47", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
            public void onHttpFinish(WXResponse wXResponse) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9df793b5", new Object[]{this, wXResponse});
                } else if (wXResponse == null) {
                    com.taobao.android.shop.utils.a.c("----OnHttpListener-----wxResponse == null. 异步更新时发生网络错误");
                } else {
                    if ("200".equals(wXResponse.statusCode)) {
                        if (!StringUtils.isEmpty(wXResponse.data)) {
                            str2 = wXResponse.data;
                        } else {
                            str2 = wXResponse.originalData != null ? new String(wXResponse.originalData) : "";
                        }
                        i.a(i.this, str, str2);
                    } else {
                        com.taobao.android.shop.utils.a.c("异步更新时发生网络错误");
                    }
                    if (i.d(i.this) == null || !i.d(i.this).contains(str)) {
                        return;
                    }
                    i.d(i.this).remove(str);
                    com.taobao.android.shop.utils.a.c("完成，", wXResponse.statusCode, "移除正在请求中的url ", str);
                }
            }

            @Override // com.taobao.weex.adapter.IWXHttpAdapter.OnHttpListener
            public void onHeadersReceived(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
                } else if (i.e(i.this) <= 0) {
                    i.a(i.this, i.a(map));
                } else {
                    i iVar = i.this;
                    i.a(iVar, i.e(iVar));
                }
            }
        };
    }

    private static long b(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41e3e870", new Object[]{map})).longValue();
        }
        if (map != null && !map.isEmpty()) {
            List<String> a2 = a(map, HttpConstant.CACHE_CONTROL);
            if (a2.isEmpty()) {
                return android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE;
            }
            for (String str : a2) {
                long g = g(str);
                if (g != -1) {
                    return g * 1000;
                }
            }
        }
        return android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE;
    }

    private static long g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cfe3ac", new Object[]{str})).longValue();
        }
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (HttpHeaderConstant.NO_CACHE.equals(trim) || "no-store".equals(trim)) {
                break;
            }
            if (trim.startsWith("max-age=")) {
                try {
                    return Long.parseLong(trim.substring(8));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return -1L;
    }

    private static List<String> a(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("332400c0", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || StringUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey()) && entry.getValue() != null && !entry.getValue().isEmpty()) {
                arrayList.addAll(entry.getValue());
            }
        }
        return arrayList;
    }

    private void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (this.l.contains(str)) {
            com.taobao.android.shop.utils.a.c("目标url已经在请求中 ", str, " 忽略本次请求");
        } else {
            this.l.add(str);
            a(str, f(str));
        }
    }

    private String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "emptyUrl";
        }
        try {
            String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
            int indexOf = uri.indexOf("#");
            return (indexOf < 0 || indexOf >= str.length()) ? uri : uri.substring(0, indexOf);
        } catch (Exception e) {
            com.taobao.android.shop.utils.a.a("-73308", "error in WeexCacheHelper.transformUrlIntoStandard.", e, str);
            c.b("-73308", "error in WeexCacheHelper.transformUrlIntoStandard.", bdx.F_TEMPLATE_DOWNLOAD_TAG, e, str);
            return "exceptionUrl";
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "userJSBundleMemoryCache", "true"));
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "jsBundleCacheEnable", "true"));
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("shop_render", "useCacheMaxAge", "true"));
    }

    private long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : Long.parseLong(OrangeConfig.getInstance().getConfig("shop_render", "cacheMaxAge", String.valueOf(0))) * 1000;
    }

    private void a(final String str, final IWXHttpAdapter.OnHttpListener onHttpListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731b36e8", new Object[]{this, str, onHttpListener});
            return;
        }
        final WXResponse wXResponse = new WXResponse();
        if (wXResponse.extendParams == null) {
            wXResponse.extendParams = new HashMap();
        }
        Coordinator.postTask(new Coordinator.TaggedRunnable("WeexCacheHelper") { // from class: com.taobao.android.shop.utils.i.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.android.shop.utils.a.c("into--[sendRequestByHttp] url:", str);
                wXResponse.statusCode = WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode();
                wXResponse.extendParams.put(WXPerformance.CACHE_TYPE, "none");
                String f = i.f(i.this);
                wXResponse.extendParams.put("wxRequestType", f);
                wXResponse.extendParams.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, f);
                new DegradableNetwork(com.alibaba.aliweex.d.a().b()).asyncSend(i.b(i.this, str), null, null, new a(wXResponse, onHttpListener, System.currentTimeMillis()));
            }
        });
    }

    private Request j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("a9b4f409", new Object[]{this, str});
        }
        RequestImpl requestImpl = new RequestImpl(str);
        String a2 = com.taobao.weex.http.b.a(WXEnvironment.getApplication(), WXEnvironment.getConfig());
        int i = 10000;
        try {
            i = Integer.valueOf(a("wx_network_timeout_ms", "10000")).intValue();
        } catch (Throwable unused) {
        }
        requestImpl.setBizId(4102);
        requestImpl.addHeader("user-agent", a2);
        requestImpl.addHeader("f-refer", "weex");
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, h());
        requestImpl.setMethod("GET");
        requestImpl.setCharset("UTF-8");
        requestImpl.setRetryTime(2);
        requestImpl.setConnectTimeout(i);
        try {
            if (Boolean.valueOf(a("wx_network_ctl_android", "true")).booleanValue()) {
                requestImpl.setExtProperty(RequestConstant.CHECK_CONTENT_LENGTH, "true");
            }
        } catch (Exception e) {
            WXLogUtils.e(WXLogUtils.getStackTrace(e));
            WXExceptionUtils.commitCriticalExceptionRT(null, WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED, "assembleRequest", WXLogUtils.getStackTrace(e), null);
        }
        return requestImpl;
    }

    private String h() {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String str = locale.getLanguage() + "-" + locale.getCountry();
            if ("zh".equals(locale.getLanguage())) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + "," + locale.getLanguage() + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Throwable unused) {
            return "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3";
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        IWXConnection a2 = com.alibaba.aliweex.adapter.module.net.a.a(WXEnvironment.getApplication());
        String b = a2 == null ? "unknown" : a2.b();
        return ("wifi".equals(b) || "4g".equals(b) || "3g".equals(b) || "2g".equals(b)) ? b : "other";
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        return l != null ? l.getConfig("wx_network_ctl_android", str, str2) : str2;
    }

    /* loaded from: classes6.dex */
    public class a implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener, NetworkCallBack.ResponseCodeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WXResponse b;
        private IWXHttpAdapter.OnHttpListener c;
        private ByteArrayOutputStream d = new ByteArrayOutputStream();
        private long e;

        static {
            kge.a(-324382071);
            kge.a(-501869850);
            kge.a(-324998464);
            kge.a(1776397793);
        }

        public a(WXResponse wXResponse, IWXHttpAdapter.OnHttpListener onHttpListener, long j) {
            this.b = wXResponse;
            this.c = onHttpListener;
            this.e = j;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            } else {
                a(finishEvent);
            }
        }

        private void a(NetworkEvent.FinishEvent finishEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("512b11c", new Object[]{this, finishEvent});
                return;
            }
            if (StringUtils.equals(WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorCode(), this.b.statusCode)) {
                com.taobao.android.shop.utils.a.c("-----NetworkListener------onHttpFinish : 网络错误");
            } else {
                this.b.statusCode = String.valueOf(finishEvent.getHttpCode());
                byte[] byteArray = this.d.toByteArray();
                if (finishEvent.getHttpCode() == 200) {
                    this.b.originalData = byteArray;
                    this.b.extendParams.put("actualNetworkTime", Long.valueOf(System.currentTimeMillis() - this.e));
                } else if (finishEvent.getHttpCode() == 404) {
                    this.b.errorCode = String.valueOf(finishEvent.getHttpCode());
                    this.b.errorMsg = "404 NOT FOUND!";
                } else {
                    this.b.errorCode = String.valueOf(finishEvent.getHttpCode());
                    WXResponse wXResponse = this.b;
                    wXResponse.errorMsg = "networkMsg==" + finishEvent.getDesc() + "|networkErrorCode==" + finishEvent.getHttpCode() + "|mWXResponse==" + JSONObject.toJSONString(this.b);
                }
            }
            this.c.onHttpFinish(this.b);
            ByteArrayOutputStream byteArrayOutputStream = this.d;
            if (byteArrayOutputStream == null) {
                return;
            }
            try {
                byteArrayOutputStream.close();
                this.d = null;
            } catch (IOException e) {
                WXLogUtils.e("WeexCacheHelper", WXLogUtils.getStackTrace(e));
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else if (progressEvent == null) {
            } else {
                this.d.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
                this.c.onHttpResponseProgress(this.d.size());
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.c.onHeadersReceived(i, map);
            return true;
        }
    }
}
