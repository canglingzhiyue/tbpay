package com.alibaba.android.ultron.vfw.storage;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.dd;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.jan;
import tb.jap;
import tb.jzb;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0002J\u0016\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J \u0010&\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/alibaba/android/ultron/vfw/storage/TradeCache;", "Lcom/alibaba/android/ultron/vfw/storage/ICacheable;", "()V", "KEY_KEYS_LIST", "", "MEM_TTL", "", "MY_BIZ_CODE", RPCDataItems.SWITCH_TAG_LOG, "keysList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getKeysList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "keysList$delegate", "Lkotlin/Lazy;", "localCache", "Lcom/taobao/android/abilityidl/abilitynative/MegaUserKVStorage;", "getLocalCache", "()Lcom/taobao/android/abilityidl/abilitynative/MegaUserKVStorage;", "localCache$delegate", "memoryCache", "Lcom/taobao/android/abilityidl/abilitynative/MegaMEMKVStorage;", "getMemoryCache", "()Lcom/taobao/android/abilityidl/abilitynative/MegaMEMKVStorage;", "memoryCache$delegate", "addKeysList", "", "key", "clearData", "bizCode", "containsKey", "", "getKeyList", "", "readData", "readKeysList", "reloadMemoryCache", "removeData", "saveData", "value", "saveKeysListToLocal", "totalSize", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final d f2730a;
    private static final d b;
    private static final d c;

    private final jan a() {
        IpChange ipChange = $ipChange;
        return (jan) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f064de7", new Object[]{this}) : f2730a.getValue());
    }

    private final jap b() {
        IpChange ipChange = $ipChange;
        return (jap) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("16b7f384", new Object[]{this}) : b.getValue());
    }

    private final CopyOnWriteArrayList<String> c() {
        IpChange ipChange = $ipChange;
        return (CopyOnWriteArrayList) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("683c5a17", new Object[]{this}) : c.getValue());
    }

    static {
        kge.a(1020533844);
        kge.a(1462978889);
        INSTANCE = new b();
        f2730a = e.a(TradeCache$memoryCache$2.INSTANCE);
        b = e.a(TradeCache$localCache$2.INSTANCE);
        c = e.a(TradeCache$keysList$2.INSTANCE);
    }

    private b() {
    }

    private final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (c().contains(str)) {
        } else {
            c().add(str);
            e();
        }
    }

    private final List<String> d() {
        List<String> b2;
        g<String, ErrorResult> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        jap b3 = b();
        String a3 = (b3 == null || (a2 = b3.a("TradeCache", "tradeKeysList")) == null) ? null : a2.a();
        return (a3 == null || (b2 = n.b((CharSequence) a3, new String[]{","}, false, 0, 6, (Object) null)) == null) ? p.a() : b2;
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        jap b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a("TradeCache", "tradeKeysList", p.a(c(), ",", null, null, 0, null, null, 62, null));
    }

    public boolean b(String key, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, key, bizCode})).booleanValue();
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        return c().contains(a.Companion.a(bizCode, key));
    }

    public void a(String key, String value, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, key, value, bizCode});
            return;
        }
        q.d(key, "key");
        q.d(value, "value");
        q.d(bizCode, "bizCode");
        dd a2 = dd.a(key, value);
        if (a2 != null) {
            a2.f8809a = 3600000L;
            a2.d = false;
            jan a3 = INSTANCE.a();
            if (a3 != null) {
                a3.a(a2, (jzb) null);
            }
        }
        jap b2 = b();
        if (b2 != null) {
            b2.a(bizCode, key, value);
        }
        b(a.Companion.a(bizCode, key));
    }

    public String a(String key, String bizCode) {
        g<String, ErrorResult> a2;
        g<String, ErrorResult> a3;
        String a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, key, bizCode});
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        if (!b(key, bizCode)) {
            return null;
        }
        jan a5 = a();
        if (a5 != null && (a3 = a5.a(key)) != null && (a4 = a3.a()) != null) {
            return a4;
        }
        jap b2 = b();
        if (b2 != null && (a2 = b2.a(bizCode, key)) != null) {
            return a2.a();
        }
        return null;
    }

    public void c(String key, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, key, bizCode});
            return;
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        if (!b(key, bizCode)) {
            return;
        }
        String a2 = a.Companion.a(bizCode, key);
        jan a3 = a();
        if (a3 != null) {
            a3.a(key, (jzb) null);
        }
        jap b2 = b();
        if (b2 != null) {
            b2.b(bizCode, key);
        }
        c().remove(a2);
        e();
    }

    public final void d(String key, String bizCode) {
        jap b2;
        g<String, ErrorResult> a2;
        String a3;
        dd a4;
        g<String, ErrorResult> a5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, key, bizCode});
            return;
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        if (!b(key, bizCode)) {
            return;
        }
        jan a6 = a();
        if (((a6 == null || (a5 = a6.a(key)) == null) ? null : a5.a()) != null || (b2 = b()) == null || (a2 = b2.a(bizCode, key)) == null || (a3 = a2.a()) == null || (a4 = dd.a(key, a3)) == null) {
            return;
        }
        a4.f8809a = 3600000L;
        a4.d = false;
        jan a7 = INSTANCE.a();
        if (a7 == null) {
            return;
        }
        a7.a(a4, (jzb) null);
    }
}
