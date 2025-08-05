package com.taobao.taobaoavsdk.Tracer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import com.taobao.taobaoavsdk.util.f;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-874974658);
    }

    public static void a(BaseAnalysis baseAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e864c973", new Object[]{baseAnalysis});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.a();
        }
    }

    public static void a(BaseAnalysis baseAnalysis, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c7364", new Object[]{baseAnalysis, aVar});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.a(aVar);
        }
    }

    public static void a(BaseAnalysis baseAnalysis, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2434d7f0", new Object[]{baseAnalysis, new Integer(i)});
        } else if (baseAnalysis == null) {
        } else {
            a aVar = null;
            if (i == 0) {
                aVar = ((d) baseAnalysis).d();
            } else if (i == 2) {
                aVar = ((e) baseAnalysis).d();
            }
            if (aVar != null) {
                baseAnalysis.b("index", String.valueOf(aVar.f21315a));
                baseAnalysis.b("videoId", aVar.g);
                baseAnalysis.b("url", aVar.b);
                baseAnalysis.b("SubBusinessId", String.valueOf(aVar.h));
                baseAnalysis.b("duration", aVar.c);
                baseAnalysis.b("setMute", String.valueOf(aVar.d));
                baseAnalysis.b("setLoop", String.valueOf(aVar.e));
                baseAnalysis.b("encodeType", String.valueOf(aVar.f));
                baseAnalysis.b("quality", aVar.o);
                baseAnalysis.b("bandwidth", aVar.p);
                baseAnalysis.b("startPos", aVar.i);
                baseAnalysis.b("fristRenderTime", aVar.j);
                baseAnalysis.b("totalPlayTime", aVar.k);
                baseAnalysis.b("videoCodec", aVar.l);
                baseAnalysis.b("warmupFlag", String.valueOf(aVar.m));
                baseAnalysis.b("useSurfaceView", String.valueOf(aVar.n));
            }
            baseAnalysis.a("succeed");
            baseAnalysis.e();
        }
    }

    public static void a(BaseAnalysis baseAnalysis, boolean z, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5d0040", new Object[]{baseAnalysis, new Boolean(z), new Long(j), new Integer(i)});
        } else if (baseAnalysis == null) {
        } else {
            if (z) {
                b(baseAnalysis, BaseAnalysis.Stage.FIRST_FRAME.name(), String.valueOf(j));
                c(baseAnalysis, BaseAnalysis.Stage.FIRST_FRAME.name());
                return;
            }
            a(baseAnalysis, BaseAnalysis.Stage.FIRST_FRAME.name(), String.valueOf(i));
        }
    }

    public static void a(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4739c7d", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.d("start" + str);
            baseAnalysis.b(str);
        }
    }

    public static void b(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a035183e", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.b(str);
            if (!TextUtils.equals(str, "VIDEO_STALL")) {
                return;
            }
            int c = f.c();
            double d = f.d();
            baseAnalysis.b("quality", String.valueOf(c));
            baseAnalysis.b("bandwidth", String.valueOf(d));
            c(baseAnalysis, "VIDEO_STALL", "quality" + c + "bandwidth" + d);
        }
    }

    public static void c(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf693ff", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.d("success " + str);
            baseAnalysis.c(str);
        }
    }

    public static void a(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703b8107", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.d("failed " + str);
            baseAnalysis.a(str, str2);
        }
    }

    public static void b(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2827ee88", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis == null) {
        } else {
            baseAnalysis.b(str, str2);
        }
    }

    public static void c(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0145c09", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis == null) {
        } else {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            baseAnalysis.d(str);
        }
    }
}
