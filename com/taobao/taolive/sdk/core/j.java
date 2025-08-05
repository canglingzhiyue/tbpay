package com.taobao.taolive.sdk.core;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.w;
import java.util.ArrayList;
import tb.kge;
import tb.pmd;
import tb.pnn;
import tb.pns;
import tb.ppt;

/* loaded from: classes8.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1729421176);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58702c20", new Object[]{aVar, str, tBLiveDataModel});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(aVar, str, tBLiveDataModel);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.g();
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31b7c", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.f();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f9f2d4", new Object[]{aVar, liveEmbedType});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(liveEmbedType);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe19b21", new Object[]{aVar, new Boolean(z), str});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(aVar, z, str);
    }

    public static TBLiveDataModel c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("ace7ecd4", new Object[]{aVar});
        }
        i b = b(aVar, false);
        if (b == null) {
            return null;
        }
        return b.a();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689d2116", new Object[]{aVar, tBLiveDataModel});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(tBLiveDataModel);
    }

    public static boolean d(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed1667be", new Object[]{aVar})).booleanValue();
        }
        i p = p(aVar);
        if (p == null) {
            return false;
        }
        return p.b();
    }

    public static pns e(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pns) ipChange.ipc$dispatch("19f346f8", new Object[]{aVar});
        }
        i p = p(aVar);
        if (p == null) {
            return null;
        }
        return p.c();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, c cVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138218b5", new Object[]{aVar, cVar, messageTypeFilter});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.registerMessageListener(cVar, messageTypeFilter);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbabed88", new Object[]{aVar, cVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.unRegisterMessageListener(cVar);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1898129d", new Object[]{aVar, pnnVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(pnnVar);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15e917", new Object[]{aVar, new Boolean(z)});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(z);
    }

    public static void f(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d069b3f8", new Object[]{aVar});
            return;
        }
        i b = b(aVar, false);
        if (b == null) {
            return;
        }
        b.d();
    }

    public static void g(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2135a17", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.e();
    }

    public static ArrayList<ChatMessage> a(com.taobao.alilive.aliliveframework.frame.a aVar, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1acf44b6", new Object[]{aVar, new Long(j), new Integer(i)});
        }
        i p = p(aVar);
        if (p == null) {
            return null;
        }
        return p.getMessagesFromPool(j, i);
    }

    public static void i(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a566a655", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.startGetNewMessage();
    }

    public static void j(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97104c74", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.pauseGetNewMessage();
    }

    public static void k(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b9f293", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.resumeGetNewMessage();
    }

    public static void l(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6398b2", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.stopGetNewMessage();
    }

    public static void m(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0d3ed1", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.i();
    }

    public static void n(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db6e4f0", new Object[]{aVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.j();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, ppt pptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b6fbd9", new Object[]{aVar, pptVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.a(pptVar);
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, ppt pptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a412f8", new Object[]{aVar, pptVar});
            return;
        }
        i p = p(aVar);
        if (p == null) {
            return;
        }
        p.b(pptVar);
    }

    private static i p(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("7986989d", new Object[]{aVar}) : b(aVar, true);
    }

    private static i b(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8dcfa8c7", new Object[]{aVar, new Boolean(z)});
        }
        i iVar = null;
        if (aVar == null) {
            com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
            if (a2 != null && (a2.f() instanceof i)) {
                iVar = (i) a2.f();
            }
            if (z && iVar == null && com.taobao.taolive.room.utils.d.a()) {
                pmd.a().m().a("VideoEngineABSwitcher", Log.getStackTraceString(new Throwable()));
                w.a(pmd.a().u().c(), "SingleRoomManageEngine为空，请关注");
            }
        } else if (aVar.f() instanceof i) {
            return (i) aVar.f();
        }
        return iVar;
    }
}
