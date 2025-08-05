package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.ak;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class hw extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24536a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hw(Context context) {
        this.f24536a = context;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo1827b() {
        Object obj;
        ArrayList arrayList;
        List list;
        List list2;
        obj = hv.f485a;
        synchronized (obj) {
            list = hv.f487a;
            arrayList = new ArrayList(list);
            list2 = hv.f487a;
            list2.clear();
        }
        hv.b(this.f24536a, arrayList);
    }
}
