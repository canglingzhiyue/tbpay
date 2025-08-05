package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.tab2interact.core.data.baseinfo.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class esw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(581613418);
    }

    public static void a(sus susVar, a aVar, String str, List<String> list, suu suuVar, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c1b669", new Object[]{susVar, aVar, str, list, suuVar, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "注册来自视频Tab的消息，sender=" + str + "，names=" + list);
        if (!"live".equals(aVar.a(str))) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "注册来自视频Tab的消息，sender无效");
            return;
        }
        susVar.a(str, list, suuVar);
        a(susVar, aVar, str, estVar);
    }

    public static void b(sus susVar, a aVar, String str, List<String> list, suu suuVar, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cdf0ea", new Object[]{susVar, aVar, str, list, suuVar, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "解注册来自直播Tab的消息，sender=" + str + "names=" + list);
        if (!"live".equals(aVar.a(str))) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "解注册来自直播Tab的消息，sender无效");
            return;
        }
        susVar.b(str, list, suuVar);
        if (susVar.a(str)) {
            return;
        }
        a(str, estVar);
    }

    private static void a(final sus susVar, a aVar, final String str, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b3f43b", new Object[]{susVar, aVar, str, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播注册事件处理器，sender:" + str);
        if (estVar.e(str) != null) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播注册事件处理器，已注册");
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.a d = estVar.d(str);
        if (d == null) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播注册事件处理器，没有livecomponent");
            return;
        }
        a.InterfaceC0586a interfaceC0586a = new a.InterfaceC0586a() { // from class: tb.esw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tab2liveroom.liveroom.a.InterfaceC0586a
            public void a(Map map, Map map2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
                    return;
                }
                esx a2 = esx.Companion.a(map, map2, System.currentTimeMillis(), str, "Interact", null);
                if (a2 == null) {
                    return;
                }
                susVar.a(a2);
            }
        };
        d.a(interfaceC0586a);
        estVar.a(str, interfaceC0586a);
    }

    private static void a(String str, est estVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2763255c", new Object[]{str, estVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播解注册事件处理器，sender:" + str);
        a.InterfaceC0586a e = estVar.e(str);
        if (e == null) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播解注册事件处理器，未注册或已解注册");
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.a d = estVar.d(str);
        if (d == null) {
            com.taobao.tab2interact.core.utils.a.b(null, "LiveMessageHelper", "向直播解注册事件处理器，没有livecomponent");
            return;
        }
        d.b(e);
        estVar.a(str, (a.InterfaceC0586a) null);
    }
}
