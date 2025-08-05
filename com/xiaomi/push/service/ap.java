package com.xiaomi.push.service;

import com.xiaomi.push.gd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f24645a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f930a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(List list, boolean z) {
        this.f24645a = list;
        this.f930a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean b;
        int i;
        boolean b2;
        b = ao.b("www.baidu.com:80");
        Iterator it = this.f24645a.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!b) {
                b2 = ao.b(str);
                if (!b2) {
                    b = false;
                    if (!b && !this.f930a) {
                        break;
                    }
                }
            }
            b = true;
            if (!b) {
            }
        }
        if (!b) {
            i = 2;
        }
        gd.a(i);
    }
}
