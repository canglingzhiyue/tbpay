package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ah;
import tb.fjp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bx extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f24386a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bx(bu buVar) {
        this.f24386a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return fjp.ERROR_CODE_RECOMMEND_SECTION_DUPLICATE_ID;
    }

    @Override // java.lang.Runnable
    public void run() {
        ck ckVar;
        ck ckVar2;
        Context context;
        ckVar = this.f24386a.f147a;
        if (ckVar != null) {
            ckVar2 = this.f24386a.f147a;
            context = this.f24386a.f144a;
            ckVar2.b(context);
            this.f24386a.b("delete_time");
        }
    }
}
