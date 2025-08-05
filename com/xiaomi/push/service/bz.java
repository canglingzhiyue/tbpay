package com.xiaomi.push.service;

import com.xiaomi.push.service.by;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ by f24686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bz(by byVar) {
        this.f24686a = byVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentHashMap concurrentHashMap;
        try {
            concurrentHashMap = this.f24686a.f982a;
            for (by.a aVar : concurrentHashMap.values()) {
                aVar.run();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Sync job exception :" + e.getMessage());
        }
        this.f24686a.f983a = false;
    }
}
