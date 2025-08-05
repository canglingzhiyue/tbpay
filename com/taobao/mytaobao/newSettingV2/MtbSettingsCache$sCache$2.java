package com.taobao.mytaobao.newSettingV2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.global.setting.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/taobao/alivfssdk/cache/IAVFSCache;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbSettingsCache$sCache$2 extends Lambda implements ruk<h> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbSettingsCache$sCache$2 INSTANCE = new MtbSettingsCache$sCache$2();

    public MtbSettingsCache$sCache$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final h mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d9dadd38", new Object[]{this});
        }
        b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(d.BIZ_NAME);
        if (cacheForModule == null) {
            q.a();
        }
        b a2 = cacheForModule.a(a.INSTANCE.getClass().getClassLoader()).a(new c());
        q.a((Object) a2, "AVFSCacheManager.getInst…Config(AVFSCacheConfig())");
        return a2.a();
    }
}
