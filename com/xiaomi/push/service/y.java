package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.hb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class y {

    /* renamed from: a  reason: collision with other field name */
    private static final Map<String, byte[]> f1034a = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<Pair<String, byte[]>> f24730a = new ArrayList<>();

    public static void a(Context context, int i, String str) {
        synchronized (f1034a) {
            for (String str2 : f1034a.keySet()) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("notify registration error. " + str2);
                a(context, str2, f1034a.get(str2), i, str);
            }
            f1034a.clear();
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, ai.a(str));
    }

    public static void a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f24730a) {
                arrayList = f24730a;
                f24730a = new ArrayList<>();
            }
            boolean a2 = com.xiaomi.push.s.a();
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair<String, byte[]> next = it.next();
                ai.a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!a2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error when process pending message. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void a(XMPushService xMPushService, boolean z) {
        try {
            synchronized (f1034a) {
                for (String str : f1034a.keySet()) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("processing pending registration request. " + str);
                    ai.a(xMPushService, str, f1034a.get(str));
                    if (z && !com.xiaomi.push.s.a()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f1034a.clear();
            }
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to deal with pending register request. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void a(String str, byte[] bArr) {
        synchronized (f1034a) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("pending registration request. " + str);
            f1034a.put(str, bArr);
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (f24730a) {
            f24730a.add(new Pair<>(str, bArr));
            if (f24730a.size() > 50) {
                f24730a.remove(0);
            }
        }
    }
}
