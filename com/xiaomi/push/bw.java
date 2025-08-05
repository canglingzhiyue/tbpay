package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;
import java.lang.ref.WeakReference;
import tb.fjp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bw extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f24385a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(bu buVar) {
        this.f24385a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return fjp.ERROR_CODE_RECOMMEND_SECTION_BUFFER_DUPLICATE_ID;
    }

    @Override // java.lang.Runnable
    public void run() {
        String c;
        Context context;
        Context context2;
        com.xiaomi.channel.commonutils.logger.b.c("exec== DbSizeControlJob");
        c = this.f24385a.c();
        context = this.f24385a.f144a;
        bz bzVar = new bz(c, new WeakReference(context));
        context2 = this.f24385a.f144a;
        cg.a(context2).a(bzVar);
        this.f24385a.b("check_time");
    }
}
