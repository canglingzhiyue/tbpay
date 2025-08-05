package com.taobao.fscrmid.nav;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.d;
import tb.kge;

/* loaded from: classes7.dex */
public class ShotVideoNavProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17201a;
    public static long b;
    public static long c;

    static {
        kge.a(868082062);
        f17201a = false;
        b = -1L;
        c = -1L;
    }

    public static void a(Intent intent, d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d54a2f", new Object[]{intent, dVar});
        } else if (f17201a || (data = intent.getData()) == null) {
        } else {
            String host = data.getHost();
            String path = data.getPath();
            if ((!"market.m.taobao.com".equals(host) && !"market.wapa.taobao.com".equals(host)) || !"/app/tb-source-app/video-fullpage/pages/index2".equals(path)) {
                return;
            }
            b = SystemClock.elapsedRealtime();
            c = System.currentTimeMillis();
            f17201a = true;
            intent.setData(data);
        }
    }

    public static void setNavStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2f0375", new Object[0]);
        } else if (f17201a) {
        } else {
            b = SystemClock.elapsedRealtime();
            c = System.currentTimeMillis();
            f17201a = true;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b = -1L;
        c = -1L;
        f17201a = false;
    }
}
