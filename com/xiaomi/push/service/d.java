package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static List<a> f24708a = new CopyOnWriteArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f24709a;

        /* renamed from: a  reason: collision with other field name */
        public final long f999a;

        /* renamed from: a  reason: collision with other field name */
        public final String f1000a;

        /* renamed from: a  reason: collision with other field name */
        public final Notification.Action[] f1001a;

        a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f1000a = str;
            this.f999a = j;
            this.f24709a = i;
            this.f1001a = actionArr;
        }
    }

    private static void a() {
        for (int size = f24708a.size() - 1; size >= 0; size--) {
            a aVar = f24708a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f999a > 5000) {
                f24708a.remove(aVar);
            }
        }
        if (f24708a.size() > 10) {
            f24708a.remove(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!com.xiaomi.push.j.m2118a(context) || i <= 0 || statusBarNotification == null || Build.VERSION.SDK_INT < 20) {
            return;
        }
        a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, ax.m2300a(statusBarNotification.getNotification())));
    }

    private static void a(a aVar) {
        f24708a.add(aVar);
        a();
    }
}
