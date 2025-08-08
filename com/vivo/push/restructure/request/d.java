package com.vivo.push.restructure.request;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.vivo.push.i;
import com.vivo.push.util.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, b> f24237a;
    private Integer b;
    private HandlerThread c;
    private Handler d;

    /* loaded from: classes9.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static d f24238a = new d((byte) 0);
    }

    private d() {
        this.f24237a = new ConcurrentHashMap();
        this.b = null;
        this.c = new HandlerThread("request_timer_task——thread");
        this.c.start();
        this.d = new e(this, this.c.getLooper());
    }

    /* synthetic */ d(byte b) {
        this();
    }

    private static int a(Intent intent) {
        Context b = com.vivo.push.restructure.a.a().b();
        if (b == null) {
            return JosStatusCodes.RNT_CODE_NO_JOS_INFO;
        }
        i a2 = i.a(b, "com.vivo.vms.aidlservice");
        if (a2.a() && !"com.vivo.pushservice".equals(b.getPackageName())) {
            if (a2.a(intent.getExtras())) {
                return 0;
            }
            u.b("RequestManager", "send command error by aidl");
            u.c(b, "send command error by aidl");
        }
        String k = com.vivo.push.restructure.a.a().e().k();
        if (StringUtils.isEmpty(k)) {
            return 8001;
        }
        Intent intent2 = new Intent("com.vivo.pushservice.action.METHOD");
        intent2.setPackage(k);
        intent2.setClassName(k, "com.vivo.push.sdk.service.PushService");
        try {
            com.vivo.push.a.a.a(b, intent2);
        } catch (Exception e) {
            u.a("RequestManager", "CommandBridge startService exception: ", e);
        }
        return 0;
    }

    public static d a() {
        return a.f24238a;
    }

    private synchronized Integer b() {
        Integer valueOf;
        if (this.b == null) {
            this.b = 0;
        }
        if (this.b.intValue() < 0 || this.b.intValue() >= Integer.MAX_VALUE) {
            this.b = 0;
        }
        valueOf = Integer.valueOf(this.b.intValue() + 1);
        this.b = valueOf;
        return new Integer(valueOf.intValue());
    }

    public final void a(com.vivo.push.restructure.a.a aVar) {
        com.vivo.push.restructure.request.a.a h;
        int b;
        com.vivo.push.restructure.request.a.a.a aVar2;
        if (aVar == null || !aVar.g() || (b = (h = aVar.h()).b()) <= 0) {
            return;
        }
        this.d.removeMessages(b);
        b remove = this.f24237a.remove(Integer.valueOf(b));
        if (remove == null || remove.b() == null || remove.a() == null) {
            return;
        }
        if (h.c() != 0) {
            remove.b().a(h.c());
            return;
        }
        try {
            aVar2 = new com.vivo.push.restructure.request.a.a.a(aVar.i());
        } catch (JSONException e) {
            e.printStackTrace();
            aVar2 = null;
        }
        if (aVar2 != null) {
            remove.b().a((c) remove.a().a(aVar2));
        } else {
            remove.b().a(8003);
        }
    }

    public final void a(b bVar) {
        Integer b = b();
        int a2 = a(bVar.a().a(b.intValue()));
        if (a2 != 0) {
            if (bVar.b() == null) {
                return;
            }
            bVar.b().a(a2);
        } else if (bVar.c() <= 0 || bVar.b() == null) {
        } else {
            this.f24237a.put(b, bVar);
            this.d.sendEmptyMessageDelayed(b.intValue(), bVar.c());
        }
    }
}
