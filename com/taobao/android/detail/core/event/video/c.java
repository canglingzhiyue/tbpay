package com.taobao.android.detail.core.event.video;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.video.GallerySourceType;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2042654608);
        emu.a("com.taobao.android.detail.core.event.video.MinVideoEventPoster");
    }

    public static void a(Context context, com.taobao.android.trade.event.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8564c7f5", new Object[]{context, cVar, new Boolean(z)});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new a(z), cVar);
        }
    }

    public static void a(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2442bf", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new d(), cVar);
        }
    }

    public static void b(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd85469e", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new i(), cVar);
        }
    }

    public static void c(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be64a7d", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new f(), cVar);
        }
    }

    public static void a(Context context, com.taobao.android.trade.event.c cVar, GallerySourceType gallerySourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9a310e", new Object[]{context, cVar, gallerySourceType});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new com.taobao.android.detail.core.event.basic.d(gallerySourceType), cVar);
        }
    }

    public static void d(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da474e5c", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new g(), cVar);
        }
    }

    public static void e(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a8523b", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new h(), cVar);
        }
    }

    public static void f(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d709561a", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new k(), cVar);
        }
    }

    public static void g(Context context, com.taobao.android.trade.event.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556a59f9", new Object[]{context, cVar});
        } else if (context == null) {
        } else {
            com.taobao.android.trade.event.f.a(context, new j(), cVar);
        }
    }
}
