package com.taobao.mytaobao.footprint;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.muh;
import tb.mxj;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0004H\u0002J\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010J\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010J&\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0003J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0003J,\u0010*\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/taobao/mytaobao/footprint/FootprintRecorder;", "", "()V", "CACHE_KEY", "", "GOODS_REGEX", "GOODS_TYPE", "ORANGE_KEY_FOOTPRINT_DETAIL_URL_PATTERN", "ORANGE_KEY_FOOTPRINT_SHOP_URL_PATTERN", "ORANGE_KEY_MAX_RECORD_COUNT", "ORANGE_KEY_RECORD_ENABLE", "SHOP_REGEX", "SHOP_TYPE", RPCDataItems.SWITCH_TAG_LOG, "mGoodsData", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/LinkedHashMap;", "", "mGoodsPattern", "Ljava/util/regex/Pattern;", "mShopData", "mShopPattern", "enableRecord", "", "getCacheKey", "type", "uid", "getCachedDataByType", "getGoodsList", "getGoodsRegex", "getMaxRecordCount", "", "getShopList", "getShopRegex", "queryGoodsFootprint", "queryShopFootprint", "readCache", "record", "", "recordInternal", "uri", "Landroid/net/Uri;", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_SAVE_CACHE, "data", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f18375a;
    private static final Pattern b;
    private static final ConcurrentHashMap<String, LinkedHashMap<String, Long>> c;
    private static final ConcurrentHashMap<String, LinkedHashMap<String, Long>> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/taobao/mytaobao/footprint/FootprintRecorder$readCache$1", "Lcom/alibaba/fastjson/TypeReference;", "Ljava/util/LinkedHashMap;", "", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.footprint.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0731a extends TypeReference<LinkedHashMap<String, Long>> {
    }

    static {
        Pattern pattern;
        kge.a(-640075861);
        a aVar = new a();
        INSTANCE = aVar;
        Pattern pattern2 = null;
        try {
            pattern = Pattern.compile(aVar.e());
        } catch (Exception unused) {
            pattern = null;
        }
        f18375a = pattern;
        try {
            pattern2 = Pattern.compile(aVar.f());
        } catch (Exception unused2) {
        }
        b = pattern2;
        c = new ConcurrentHashMap<>();
        d = new ConcurrentHashMap<>();
    }

    private a() {
    }

    public static final /* synthetic */ void a(a aVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aad37dd", new Object[]{aVar, uri});
        } else {
            aVar.a(uri);
        }
    }

    public static final /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e88d46ae", new Object[]{aVar})).booleanValue() : aVar.d();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!d()) {
        } else {
            c.a(new b(), false);
            TLog.loge("FootprintRecorder", "start record footprint");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/taobao/mytaobao/footprint/FootprintRecorder$record$1", "Lcom/taobao/application/common/Apm$OnActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements a.InterfaceC0630a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.taobao.mytaobao.footprint.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class RunnableC0732a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f18376a;

            public RunnableC0732a(Intent intent) {
                this.f18376a = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Uri data = this.f18376a.getData();
                    if (data == null) {
                        String stringExtra = this.f18376a.getStringExtra(g.KEY_FIRST_IN_SHOP_URL);
                        String str = stringExtra;
                        if (str == null || str.length() == 0) {
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                        TLog.loge("FootprintRecorder", "尝试获取店铺url: " + stringExtra);
                        data = Uri.parse(stringExtra);
                    }
                    if (data == null) {
                        TLog.loge("FootprintRecorder", "获取不到url，不进行足迹记录");
                    } else {
                        a.a(a.INSTANCE, data);
                    }
                } catch (Throwable th) {
                    TLog.loge("FootprintRecorder", "record footprint error", th);
                    if (Versions.isDebug()) {
                        throw th;
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                q.c(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                q.c(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.c(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.c(activity, "activity");
            q.c(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.c(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.c(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            q.c(activity, "activity");
            if (!a.a(a.INSTANCE) || !Login.checkSessionValid() || (intent = activity.getIntent()) == null) {
                return;
            }
            com.taobao.mytaobao.base.b.c(new RunnableC0732a(intent));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x01c0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:10:0x001e, B:12:0x002a, B:14:0x0030, B:16:0x0052, B:22:0x005e, B:24:0x0064, B:32:0x0075, B:34:0x0093, B:35:0x00a5, B:42:0x00d2, B:44:0x00d6, B:46:0x00e2, B:48:0x00e8, B:50:0x010b, B:56:0x0117, B:57:0x0135, B:59:0x013a, B:65:0x0146, B:67:0x014c, B:75:0x015d, B:77:0x017b, B:78:0x018e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: all -> 0x01c0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:10:0x001e, B:12:0x002a, B:14:0x0030, B:16:0x0052, B:22:0x005e, B:24:0x0064, B:32:0x0075, B:34:0x0093, B:35:0x00a5, B:42:0x00d2, B:44:0x00d6, B:46:0x00e2, B:48:0x00e8, B:50:0x010b, B:56:0x0117, B:57:0x0135, B:59:0x013a, B:65:0x0146, B:67:0x014c, B:75:0x015d, B:77:0x017b, B:78:0x018e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146 A[Catch: all -> 0x01c0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:10:0x001e, B:12:0x002a, B:14:0x0030, B:16:0x0052, B:22:0x005e, B:24:0x0064, B:32:0x0075, B:34:0x0093, B:35:0x00a5, B:42:0x00d2, B:44:0x00d6, B:46:0x00e2, B:48:0x00e8, B:50:0x010b, B:56:0x0117, B:57:0x0135, B:59:0x013a, B:65:0x0146, B:67:0x014c, B:75:0x015d, B:77:0x017b, B:78:0x018e), top: B:92:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void a(android.net.Uri r9) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.footprint.a.a(android.net.Uri):void");
    }

    private final void a(String str, String str2, LinkedHashMap<String, Long> linkedHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fae7f0", new Object[]{this, str, str2, linkedHashMap});
        } else {
            muh.a(b(str, str2), JSON.toJSONString(linkedHashMap));
        }
    }

    private final LinkedHashMap<String, Long> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("333c7798", new Object[]{this, str, str2});
        }
        Object b2 = muh.b(b(str, str2));
        if (!(b2 instanceof String)) {
            return null;
        }
        try {
            return (LinkedHashMap) JSON.parseObject((String) b2, new C0731a(), new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        return "footprintRecord_" + str2 + '_' + str;
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : mxj.a("footprint_record_enable", true);
    }

    private final String e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        String a2 = mxj.a("footprint_detail_url_pattern", "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$");
        if (a2 == null) {
            return "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$";
        }
        if (a2.length() > 0) {
            z = true;
        }
        if (!z) {
            a2 = null;
        }
        return a2 == null ? "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$" : a2;
    }

    private final String f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String a2 = mxj.a("footprint_shop_url_pattern", "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$");
        if (a2 == null) {
            return "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$";
        }
        if (a2.length() > 0) {
            z = true;
        }
        if (!z) {
            a2 = null;
        }
        return a2 == null ? "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$" : a2;
    }

    private final int g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        Integer valueOf = Integer.valueOf(mxj.a("footprint_max_record_count", 50));
        if (valueOf.intValue() > 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 50;
        }
        return valueOf.intValue();
    }

    private final LinkedHashMap<String, Long> c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("cebb679a", new Object[]{this, str, str2});
        }
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        LinkedHashMap<String, Long> a2 = a(str, str2);
        if (a2 != null) {
            linkedHashMap.putAll(a2);
        }
        return linkedHashMap;
    }

    private final LinkedHashMap<String, Long> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("3727f44e", new Object[]{this, str});
        }
        LinkedHashMap<String, Long> linkedHashMap = c.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap<String, Long> c2 = c("goods", str);
        c.put(str, c2);
        return c2;
    }

    private final LinkedHashMap<String, Long> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("aca21a8f", new Object[]{this, str});
        }
        LinkedHashMap<String, Long> linkedHashMap = d.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap<String, Long> c2 = c("shop", str);
        d.put(str, c2);
        return c2;
    }

    public final synchronized LinkedHashMap<String, Long> b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ec0e3705", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (userId != null) {
            if (userId.length() > 0) {
                z = true;
            }
            if (!z) {
                userId = null;
            }
            if (userId != null) {
                return new LinkedHashMap<>(a(userId));
            }
        }
        return new LinkedHashMap<>();
    }

    public final synchronized LinkedHashMap<String, Long> c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("155e1b86", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (userId != null) {
            if (userId.length() > 0) {
                z = true;
            }
            if (!z) {
                userId = null;
            }
            if (userId != null) {
                return new LinkedHashMap<>(b(userId));
            }
        }
        return new LinkedHashMap<>();
    }
}
