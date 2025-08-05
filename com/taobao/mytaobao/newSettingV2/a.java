package com.taobao.mytaobao.newSettingV2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.h;
import com.taobao.login4android.api.Login;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/taobao/mytaobao/newSettingV2/MtbSettingsCache;", "", "()V", "MODULE_NAME", "", "sCache", "Lcom/taobao/alivfssdk/cache/IAVFSCache;", "kotlin.jvm.PlatformType", "getSCache", "()Lcom/taobao/alivfssdk/cache/IAVFSCache;", "sCache$delegate", "Lkotlin/Lazy;", "readCache", "key", "writeCache", "", "value", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18389a;
    private static final d b;

    private final h a() {
        IpChange ipChange = $ipChange;
        return (h) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("2f1a026f", new Object[]{this}) : b.getValue());
    }

    static {
        kge.a(83610725);
        f18389a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "sCache", "getSCache()Lcom/taobao/alivfssdk/cache/IAVFSCache;"))};
        INSTANCE = new a();
        b = e.a(MtbSettingsCache$sCache$2.INSTANCE);
    }

    private a() {
    }

    public final String a(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, key});
        }
        q.c(key, "key");
        h a2 = a();
        return (String) a2.b(Login.getUserId() + '_' + key);
    }

    public final void a(String key, String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, key, value});
            return;
        }
        q.c(key, "key");
        q.c(value, "value");
        h a2 = a();
        a2.a(Login.getUserId() + '_' + key, (Object) value);
    }
}
