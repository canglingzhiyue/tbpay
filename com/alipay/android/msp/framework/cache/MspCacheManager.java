package com.alipay.android.msp.framework.cache;

import android.text.TextUtils;
import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.cache.DiskLruCache;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class MspCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile MspCacheManager f4682a;
    private Strategy b;
    private boolean e;
    private volatile DiskLruCache d = null;
    private final String f = "msp";
    private final Runnable g = new Runnable() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MspCacheManager.a(MspCacheManager.this, DiskLruCache.open(GlobalHelper.getInstance().getContext().getDir("alipay_msp_disk_cache", 0), 1, 1, FileAbility.MAX_FILE_SIZE));
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "", th);
            }
        }
    };
    private MspMemoryCache c = new MspMemoryCache();

    /* renamed from: com.alipay.android.msp.framework.cache.MspCacheManager$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4686a = new int[Strategy.values().length];

        static {
            try {
                f4686a[Strategy.MEMORY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4686a[Strategy.MEMORY_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4686a[Strategy.DISK_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum Strategy {
        MEMORY_ONLY(0),
        MEMORY_FIRST(1),
        DISK_ONLY(3);
        
        int id;

        Strategy(int i) {
            this.id = i;
        }
    }

    public static /* synthetic */ DiskLruCache a(MspCacheManager mspCacheManager, DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiskLruCache) ipChange.ipc$dispatch("5799a142", new Object[]{mspCacheManager, diskLruCache});
        }
        mspCacheManager.d = diskLruCache;
        return diskLruCache;
    }

    public static /* synthetic */ Strategy a(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Strategy) ipChange.ipc$dispatch("762665d1", new Object[]{mspCacheManager}) : mspCacheManager.b;
    }

    public static /* synthetic */ boolean b(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a01a1f61", new Object[]{mspCacheManager})).booleanValue() : mspCacheManager.e;
    }

    public static /* synthetic */ MspMemoryCache c(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspMemoryCache) ipChange.ipc$dispatch("6561f5be", new Object[]{mspCacheManager}) : mspCacheManager.c;
    }

    public static MspCacheManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspCacheManager) ipChange.ipc$dispatch("581ef038", new Object[0]) : getInstance(Strategy.MEMORY_ONLY);
    }

    public static MspCacheManager getInstance(Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspCacheManager) ipChange.ipc$dispatch("8ae10577", new Object[]{strategy});
        }
        if (f4682a == null) {
            synchronized (MspCacheManager.class) {
                if (f4682a == null) {
                    f4682a = new MspCacheManager(strategy);
                }
            }
        } else {
            f4682a.setStrategy(strategy);
        }
        return f4682a;
    }

    public void setTwoLevelCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132acba5", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    private MspCacheManager(Strategy strategy) {
        this.b = Strategy.MEMORY_ONLY;
        this.b = strategy;
        TaskHelper.execute(this.g);
    }

    public void setStrategy(Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208a8509", new Object[]{this, strategy});
            return;
        }
        this.b = strategy;
        if (AnonymousClass4.f4686a[this.b.ordinal()] != 1 || !this.c.hasEvictedListener()) {
            return;
        }
        this.c.setEvictedListener(null);
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else if (AnonymousClass4.f4686a[this.b.ordinal()] != 1) {
        } else {
            this.c.clear();
        }
    }

    public String getCurStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a6d127c", new Object[]{this}) : this.b.name();
    }

    public String readCache(final String str, final String[] strArr, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fcd79fe", new Object[]{this, str, strArr, new Boolean(z), new Boolean(z2)});
        }
        try {
            return (String) TaskHelper.submitTask(new Callable<String>() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public String call() throws Exception {
                    String b;
                    String[] strArr2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this});
                    }
                    String str2 = null;
                    if (AnonymousClass4.f4686a[MspCacheManager.a(MspCacheManager.this).ordinal()] == 1) {
                        if (MspCacheManager.b(MspCacheManager.this)) {
                            str2 = MspCacheManager.c(MspCacheManager.this).getTwoLevel(str, strArr);
                        } else {
                            str2 = MspCacheManager.c(MspCacheManager.this).get(str);
                        }
                    }
                    if (!TextUtils.isEmpty(str2) || !z) {
                        return str2;
                    }
                    try {
                        if (z2) {
                            b = MspCacheManager.a(MspCacheManager.this, str);
                        } else {
                            b = MspCacheManager.b(MspCacheManager.this, str);
                        }
                        if (!TextUtils.isEmpty(b)) {
                            MspCacheManager.c(MspCacheManager.this).put(str, b);
                        }
                        if (TextUtils.isEmpty(b) || strArr == null || strArr.length <= 0) {
                            return b;
                        }
                        JSONObject parseObject = JSON.parseObject(b);
                        JSONObject jSONObject = new JSONObject();
                        for (String str3 : strArr) {
                            jSONObject.put(str3, (Object) parseObject.getString(str3));
                        }
                        return jSONObject.toJSONString();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                        return str2;
                    }
                }
            }).get();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public String readCache(String str, String[] strArr, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9488c0ae", new Object[]{this, str, strArr, new Boolean(z)}) : readCache(str, strArr, z, false);
    }

    public void writeCache(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2e9496", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            writeCache(str, str2, z, false);
        }
    }

    public void writeCache(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a4b0fe", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            writeCache(str, str2, z, z2, false);
        }
    }

    public void writeCache(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af22196", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (z && TextUtils.isEmpty(MspCacheManager.c(MspCacheManager.this).get(str))) {
                        try {
                            String a2 = z2 ? MspCacheManager.a(MspCacheManager.this, str) : MspCacheManager.b(MspCacheManager.this, str);
                            if (!TextUtils.isEmpty(a2)) {
                                MspCacheManager.c(MspCacheManager.this).put(str, a2);
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                    String str3 = str2;
                    if (AnonymousClass4.f4686a[MspCacheManager.a(MspCacheManager.this).ordinal()] == 1) {
                        if (!MspCacheManager.b(MspCacheManager.this) || z3) {
                            MspCacheManager.c(MspCacheManager.this).put(str, str2);
                        } else {
                            str3 = MspCacheManager.c(MspCacheManager.this).putTwoLevel(str, str2);
                        }
                    }
                    if (!z) {
                        return;
                    }
                    if (z2) {
                        MspCacheManager.a(MspCacheManager.this, str, str3);
                    } else {
                        MspCacheManager.b(MspCacheManager.this, str, str3);
                    }
                }
            });
        }
    }

    private String a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (this.d == null) {
            return null;
        }
        try {
            str = FileUtils.md5(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        DiskLruCache.Snapshot snapshot = this.d.get(str);
        if (snapshot == null) {
            return null;
        }
        return snapshot.getString(0);
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String string = PrefUtils.getString(str, str2, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return a(str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return string;
        }
    }

    public static /* synthetic */ String a(MspCacheManager mspCacheManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d578bba", new Object[]{mspCacheManager, str}) : PhoneCashierMspEngine.getMspBase().readSecStorage(str, "msp", false);
    }

    public static /* synthetic */ String b(MspCacheManager mspCacheManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7dd95399", new Object[]{mspCacheManager, str}) : mspCacheManager.a(str, "msp");
    }

    public static /* synthetic */ void a(MspCacheManager mspCacheManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25a75f0", new Object[]{mspCacheManager, str, str2});
        } else {
            PhoneCashierMspEngine.getMspBase().setSecStorage(str, "msp", str2, false);
        }
    }

    public static /* synthetic */ void b(MspCacheManager mspCacheManager, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e211a9f1", new Object[]{mspCacheManager, str, str2});
            return;
        }
        try {
            str3 = FileUtils.md5(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            str3 = str;
        }
        try {
            if (mspCacheManager.d != null) {
                DiskLruCache.Editor edit = mspCacheManager.d.edit(str3);
                edit.set(0, str2);
                edit.commit();
                mspCacheManager.d.flush();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        PrefUtils.putString(str, "msp", str2);
    }
}
