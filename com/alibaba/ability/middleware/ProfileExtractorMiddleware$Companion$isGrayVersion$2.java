package com.alibaba.ability.middleware;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.ruk;

/* loaded from: classes2.dex */
public final class ProfileExtractorMiddleware$Companion$isGrayVersion$2 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ProfileExtractorMiddleware$Companion$isGrayVersion$2 INSTANCE = new ProfileExtractorMiddleware$Companion$isGrayVersion$2();

    public ProfileExtractorMiddleware$Companion$isGrayVersion$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        Context d = com.alibaba.ability.e.d();
        if (d == null) {
            return 1;
        }
        try {
            String version = d.getPackageManager().getPackageInfo(d.getPackageName(), 0).versionName;
            q.b(version, "version");
            return n.b((CharSequence) version, new String[]{"."}, false, 0, 6, (Object) null).size() > 3 ? 1 : null;
        } catch (PackageManager.NameNotFoundException e) {
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            cVar.a("Megability", "获取版本信息失败，错误原因：" + kotlin.a.a(e));
            return 1;
        }
    }
}
