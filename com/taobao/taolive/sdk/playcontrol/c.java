package com.taobao.taolive.sdk.playcontrol;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.utils.VideoStatus;
import tb.kge;
import tb.poy;
import tb.ppr;
import tb.pqg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        }
    }

    static {
        kge.a(-1459773325);
        TAG = c.class.getSimpleName();
    }

    public static a a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("28e3e9b6", new Object[]{aVar});
        }
        a aVar2 = null;
        if (aVar instanceof e) {
            aVar2 = ((e) aVar).A();
        }
        return aVar2 == null ? pqg.a() : aVar2;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be387a4", new Object[]{bVar});
        } else if (bVar == null) {
        } else {
            bVar.c();
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1124f665", new Object[]{bVar});
        } else if (bVar == null) {
        } else {
            bVar.b();
        }
    }

    public static com.taobao.taolive.sdk.ui.media.d c(b bVar) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("2de1cf30", new Object[]{bVar});
        }
        if (bVar != null && (a2 = bVar.a()) != null) {
            return a2.e();
        }
        return null;
    }

    public static void a(b bVar, ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9e02ee", new Object[]{bVar, iSmallWindowStrategy});
        } else if (bVar == null) {
        } else {
            bVar.a(iSmallWindowStrategy);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31b7c", new Object[]{aVar});
            return;
        }
        d dVar = new d();
        if (!(aVar instanceof e)) {
            return;
        }
        ((e) aVar).a((a) dVar);
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6cc19b", new Object[]{aVar});
            return;
        }
        a aVar2 = null;
        if (aVar instanceof e) {
            aVar2 = ((e) aVar).A();
        }
        if (!(aVar2 instanceof d)) {
            return;
        }
        ((d) aVar2).a(aVar);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15e917", new Object[]{aVar, new Boolean(z)});
            return;
        }
        a aVar2 = null;
        if (aVar instanceof e) {
            aVar2 = ((e) aVar).A();
        }
        if (!(aVar2 instanceof d)) {
            return;
        }
        aVar2.a(false, z);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fddfd5", new Object[]{aVar, iSmallWindowStrategy});
            return;
        }
        a aVar2 = null;
        if (aVar instanceof e) {
            aVar2 = ((e) aVar).A();
        }
        if (!(aVar2 instanceof d)) {
            return;
        }
        aVar2.a(iSmallWindowStrategy);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(str);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15a946", new Object[]{aVar, new Integer(i)});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(i);
    }

    public static com.taobao.taolive.sdk.ui.media.d a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("e4a3745f", new Object[]{aVar, context, str}) : a(aVar, context, str, (MediaData) null, (String) null);
    }

    public static com.taobao.taolive.sdk.ui.media.d a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, MediaData mediaData, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("1e624ecf", new Object[]{aVar, context, str, mediaData, str2});
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return null;
        }
        return a2.a(context, str, mediaData, str2);
    }

    public static boolean d(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1667be", new Object[]{aVar})).booleanValue();
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        return a2.d();
    }

    public static com.taobao.taolive.sdk.ui.media.d a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("f1bb8f62", new Object[]{aVar, context, str, new Integer(i), str2});
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return null;
        }
        return a2.a(context, str, i, str2);
    }

    public static com.taobao.taolive.sdk.ui.media.d e(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.ui.media.d) ipChange.ipc$dispatch("e75f8b23", new Object[]{aVar});
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return null;
        }
        return a2.e();
    }

    public static String f(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a65fafa8", new Object[]{aVar});
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return null;
        }
        return a2.h();
    }

    public static boolean g(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2135a1b", new Object[]{aVar})).booleanValue();
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        return a2.f();
    }

    public static void h(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bd0036", new Object[]{aVar});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.g();
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea106d8", new Object[]{aVar, new Boolean(z)});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(z);
    }

    public static VideoStatus i(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoStatus) ipChange.ipc$dispatch("e9607aea", new Object[]{aVar}) : poy.y(aVar);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b6131b", new Object[]{aVar, pprVar});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(pprVar);
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a32a3a", new Object[]{aVar, pprVar});
            return;
        }
        a aVar2 = null;
        if (aVar instanceof e) {
            aVar2 = ((e) aVar).A();
        }
        if (aVar2 == null) {
            aVar2 = pqg.a();
        }
        if (aVar2 == null) {
            return;
        }
        aVar2.a(pprVar);
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32904159", new Object[]{aVar, pprVar});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.b(pprVar);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30509926", new Object[]{aVar, videoStatus});
        } else if (aVar == null) {
            poy.a(videoStatus, n.a());
        } else {
            poy.a(videoStatus, aVar);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d17eb29", new Object[]{aVar, context, new Boolean(z)});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(context, z);
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb5a750a", new Object[]{aVar, context, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        return a2.a(context, str, i, z);
    }

    public static boolean j(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97104c78", new Object[]{aVar})).booleanValue();
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        return a2.c();
    }

    public static boolean k(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88b9f297", new Object[]{aVar})).booleanValue();
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return false;
        }
        return a2.i();
    }

    public static void l(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6398b2", new Object[]{aVar});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.p();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, d.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bad07fa", new Object[]{aVar, aVar2});
            return;
        }
        a a2 = a(aVar);
        if (a2 == null) {
            return;
        }
        a2.a(aVar2);
    }
}
