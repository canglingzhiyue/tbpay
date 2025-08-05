package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/management/UltronTradeHybridCacheManager;", "", "()V", "getStorage", "", "key", "bizCode", "getStorageRefreshState", "", "isNullOrNeedRefresh", "setStorage", "", "data", "setStorageRefreshState", "needRefresh", "Companion", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2785a = "_SPLIT_SAVE_TIME_";
    public static final String b = "$NEED_REFRESH";
    private static final HashMap<String, Long> c;

    public final String a(String key, String bizCode) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, key, bizCode});
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        String a2 = com.alibaba.android.ultron.vfw.storage.b.INSTANCE.a(key, bizCode);
        String str = a2;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z || !n.b((CharSequence) str, (CharSequence) f2785a, false, 2, (Object) null)) {
            return null;
        }
        int a3 = n.a((CharSequence) str, f2785a, 0, false, 6, (Object) null);
        if (a2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = a2.substring(0, a3);
        q.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Long l = c.get(bizCode);
        if (l != null && System.currentTimeMillis() - Long.parseLong(substring) > l.longValue()) {
            com.alibaba.android.ultron.vfw.storage.b.INSTANCE.c(key, bizCode);
            return null;
        }
        int a4 = n.a((CharSequence) str, f2785a, 0, false, 6, (Object) null) + 17;
        if (a2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring2 = a2.substring(a4);
        q.b(substring2, "(this as java.lang.String).substring(startIndex)");
        return substring2;
    }

    public final void a(String key, String data, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, key, data, bizCode});
            return;
        }
        q.d(key, "key");
        q.d(data, "data");
        q.d(bizCode, "bizCode");
        com.alibaba.android.ultron.vfw.storage.b.INSTANCE.a(key, String.valueOf(System.currentTimeMillis()) + f2785a + data, bizCode);
        a(key, false, bizCode);
    }

    private final void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        com.alibaba.android.ultron.vfw.storage.b.INSTANCE.a(str + b, String.valueOf(z), str2);
    }

    public final boolean b(String key, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, key, bizCode})).booleanValue();
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        String a2 = com.alibaba.android.ultron.vfw.storage.b.INSTANCE.a(key + b, bizCode);
        return a2 != null && q.a((Object) a2, (Object) "true");
    }

    public final boolean c(String key, String bizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, key, bizCode})).booleanValue();
        }
        q.d(key, "key");
        q.d(bizCode, "bizCode");
        String a2 = a(key, bizCode);
        return (a2 == null || a2.length() == 0) || b(key, bizCode);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/management/UltronTradeHybridCacheManager$Companion;", "", "()V", "MARK_STORAGE_STATE", "", "SPLIT_SAVE_TIME", "bizTimeMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1315259500);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(24674124);
        Companion = new a(null);
        c = new HashMap<>();
    }
}
