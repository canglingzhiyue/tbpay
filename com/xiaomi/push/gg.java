package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.gj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class gg {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f24497a = Log.isLoggable("BCompressed", 3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(gf gfVar, byte[] bArr) {
        try {
            byte[] a2 = gj.a.a(bArr);
            if (f24497a) {
                com.xiaomi.channel.commonutils.logger.b.m1617a("BCompressed", "decompress " + bArr.length + " to " + a2.length + " for " + gfVar);
                if (gfVar.f402a == 1) {
                    com.xiaomi.channel.commonutils.logger.b.m1617a("BCompressed", "decompress not support upStream");
                }
            }
            return a2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1617a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
