package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;
import tb.fjp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bv extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f24384a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bv(bu buVar) {
        this.f24384a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return fjp.ERROR_CODE_RECOMMEND_ITEM_ID_EMPTY;
    }

    @Override // java.lang.Runnable
    public void run() {
        ck ckVar;
        ck ckVar2;
        Context context;
        com.xiaomi.channel.commonutils.logger.b.c("exec== mUploadJob");
        ckVar = this.f24384a.f147a;
        if (ckVar != null) {
            ckVar2 = this.f24384a.f147a;
            context = this.f24384a.f144a;
            ckVar2.a(context);
            this.f24384a.b("upload_time");
        }
    }
}
