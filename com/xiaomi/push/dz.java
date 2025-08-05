package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ dy f24440a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f249a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Throwable f250a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dz(dy dyVar, String str, Throwable th) {
        this.f24440a = dyVar;
        this.f249a = str;
        this.f250a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        SimpleDateFormat simpleDateFormat;
        String str;
        List list2;
        String str2;
        List list3;
        List list4;
        SimpleDateFormat simpleDateFormat2;
        String str3;
        List list5;
        List list6;
        String unused;
        list = dy.f246a;
        simpleDateFormat = dy.f245a;
        str = this.f24440a.b;
        list.add(new Pair(String.format("%1$s %2$s %3$s ", simpleDateFormat.format(new Date()), str, this.f249a), this.f250a));
        list2 = dy.f246a;
        if (list2.size() > 20000) {
            list3 = dy.f246a;
            int size = (list3.size() - 20000) + 50;
            for (int i = 0; i < size; i++) {
                try {
                    list5 = dy.f246a;
                    if (list5.size() > 0) {
                        list6 = dy.f246a;
                        list6.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            list4 = dy.f246a;
            simpleDateFormat2 = dy.f245a;
            str3 = this.f24440a.b;
            list4.add(new Pair(String.format("%1$s %2$s %3$s ", simpleDateFormat2.format(new Date()), str3, "flush " + size + " lines logs."), null));
        }
        try {
            if (!z.d()) {
                unused = this.f24440a.b;
            } else {
                this.f24440a.m1830a();
            }
        } catch (Exception e) {
            str2 = this.f24440a.b;
            Log.e(str2, "", e);
        }
    }
}
