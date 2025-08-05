package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.assistant.display.AssistantCheckService;
import com.taobao.wireless.link.assistant.jsbridge.AssistantCloseJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantHomeJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantOpenJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge;
import com.taobao.wireless.link.assistant.jsbridge.AssistantSupportJsBridge;
import com.taobao.wireless.link.common.c;
import com.taobao.wireless.link.model.MessageData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class rju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f33188a;
    public Map<String, rjv> b;
    public Map<String, String> c;
    public Map<String, Object> d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static rju f33192a;

        static {
            kge.a(-1218073730);
            f33192a = new rju();
        }

        public static /* synthetic */ rju a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rju) ipChange.ipc$dispatch("f0a1381", new Object[0]) : f33192a;
        }
    }

    static {
        kge.a(1338423467);
    }

    public static /* synthetic */ void a(rju rjuVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430a2bad", new Object[]{rjuVar, context});
        } else {
            rjuVar.d(context);
        }
    }

    public static rju a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rju) ipChange.ipc$dispatch("f0a1381", new Object[0]) : a.a();
    }

    private rju() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        rkg.a("link_tag", "AssistantCenter === init === 小助手模块开始初始化");
        rjt.a().a(application);
        q.a(AssistantHomeJsBridge.CLASSNAME_ASSISTANT_HOME, (Class<? extends e>) AssistantHomeJsBridge.class);
        q.a(AssistantOpenJsBridge.CLASSNAME_ASSISTANT_OPEN, (Class<? extends e>) AssistantOpenJsBridge.class);
        q.a(AssistantCloseJsBridge.CLASSNAME_ASSISTANT_CLOSE, (Class<? extends e>) AssistantCloseJsBridge.class);
        q.a(AssistantPermissionJsBridge.CLASSNAME_ASSISTANT_PERMISSION, (Class<? extends e>) AssistantPermissionJsBridge.class);
        q.a(AssistantSupportJsBridge.CLASSNAME_ASSISTANT_SUPPORT, (Class<? extends e>) AssistantSupportJsBridge.class);
        c(application);
        rkg.a("link_tag", "AssistantCenter === init === 小助手模块初始化结束");
    }

    private void c(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else {
            rkj.a(context, new c() { // from class: tb.rju.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.wireless.link.common.c
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i == 2) {
                        rkg.a("link_tag", "AssistantCenter === registerBfMonitor === 后台切前台，检测小助手流程");
                        rju.a(rju.this, context);
                    } else if (i != 1) {
                    } else {
                        rjx.b = false;
                        rjt.a().f = mpa.HOT;
                    }
                }
            });
        }
    }

    public void a(Context context, String str, boolean z, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7cb485b", new Object[]{this, context, str, new Boolean(z), map});
            return;
        }
        this.d = map;
        rkg.a("link_tag", "AssistantCenter === openAssistant === 小助手开通参数：id=" + str + " needEquity=" + z + " extraInfo=" + map);
        if (!rjw.c(context)) {
            rkg.a("link_tag", "AssistantCenter === openAssistant === 当前设备不支持小助手，开启失败");
        } else if (context == null || TextUtils.isEmpty(str)) {
            rkg.a("link_tag", "AssistantCenter === openAssistant === 活动id为空，开启失败");
        } else {
            rkk a2 = rkk.a(context);
            String a3 = rjw.a(context);
            Map<String, String> a4 = a2.a("growth_assistant_activityList_" + a3);
            a4.put(str, String.valueOf(z));
            rjw.a(a2, a4, a3);
            rjv rjvVar = new rjv();
            rjvVar.b = str;
            rjvVar.d = rkj.a();
            if (map != null) {
                rjvVar.f33193a = (String) map.get("baseUrl");
                rjvVar.c = (String) map.get("assistantLogoUrl");
            }
            rjw.a(a2, str, a3, rjvVar);
            rjw.a(context, str, a3, rjvVar.d + "");
            rjw.a(context, a2);
            if (rkj.c(context)) {
                rkg.a("link_tag", "AssistantCenter === openAssistant === 绘制小助手");
                com.taobao.wireless.link.assistant.display.a.a(context);
                rkj.g(context);
                return;
            }
            rjw.b(context);
        }
    }

    private void d(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else if (rjw.f(context)) {
            rkg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前设备支持小助手，开始绘制小助手");
            if (rjx.f33194a < 3 && rjx.b) {
                com.taobao.wireless.link.controller.a.a().b().post(new Runnable() { // from class: tb.rju.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        rkg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前设备支持小助手，强制渲染小助手");
                        MessageData a2 = rjw.a(rkk.a(context));
                        Context context2 = context;
                        rjv a3 = rjw.a(context2, rkk.a(context2), rjw.a(context), rju.this.a(context));
                        if (a3 != null && a3.b != null && a3.c != null) {
                            a2.activity_id = a3.b;
                            a2.assistant_logo_url = a3.c;
                        }
                        com.taobao.wireless.link.assistant.display.a.a(context, a2);
                        rkk a4 = rkk.a(context);
                        a4.a("growth_assistant_first_click_" + rjw.a(context), Integer.valueOf(rjx.f33194a + 1));
                        rkg.a("link_tag", "AssistantCenter === startAndShowAssistant === 当前点击次数=" + rjx.f33194a + 1);
                    }
                });
                return;
            }
            a(context, rjw.e(context), null);
            com.taobao.wireless.link.assistant.display.a.a(context);
        } else if (!rkj.a(context, AssistantCheckService.class.getName())) {
        } else {
            rkg.a("link_tag", "DisplayCenter === drawAssistant === service存活，不支持小助手，关闭service");
            try {
                context.stopService(new Intent(context, AssistantCheckService.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(final Context context, final Map<String, String> map, final rjz rjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09a4813", new Object[]{this, context, map, rjzVar});
        } else {
            rkf.f33202a.a(new Runnable() { // from class: tb.rju.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rkg.a("link_tag", "AssistantCenter === startAndShowAssistant === 调用权益交互模块");
                    rjy.a(context, map, rjzVar);
                }
            });
        }
    }

    public String a(Context context) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        try {
            a2 = rjw.a(context, rjw.a(context));
        } catch (Exception e) {
            rkg.b("link_tag", "AssistantCenter === getRecentLyId === 获取最近的活动id异常：" + e);
        }
        if (a2.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, String>> entrySet = a2.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            arrayList.add(entry.getValue());
        }
        Collections.sort(arrayList);
        for (Map.Entry<String, String> entry2 : entrySet) {
            if (entry2.getValue().equals(arrayList.get(0))) {
                return entry2.getKey();
            }
        }
        return "";
    }

    public void a(Context context, String str) {
        Map<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        rkg.a("link_tag", "AssistantCenter === closeAssistant === 关闭小助手");
        if (TextUtils.isEmpty(str) || (e = rjw.e(context)) == null) {
            return;
        }
        e.remove(str);
        rkg.a("link_tag", "AssistantCenter === closeAssistant === 关闭小助手，移除id=" + str);
        rjw.a(rkk.a(context), e, rjw.a(context));
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        e(context);
        b(context, false);
    }

    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        rkg.a("link_tag", "AssistantCenter === writeAssistantSetting === isOpen=" + z);
        String a2 = a(context);
        rki.a(rki.ARG1_ASSISTANT_SWITCH_STATE, a2, z + "", new HashMap());
        if (z) {
            b(context, true);
            d(context);
            return;
        }
        b(context);
    }

    private void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
            return;
        }
        try {
            com.taobao.wireless.link.assistant.display.a.b(context);
            context.stopService(new Intent(context, AssistantCheckService.class));
        } catch (Throwable th) {
            rkg.a("link_tag", "AssistantCenter === closeAssistanInner === 关闭小助手异常：" + th);
        }
    }

    public void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{this, context, new Boolean(z)});
            return;
        }
        com.taobao.wireless.link.controller.a.a().m = z + "";
        String a2 = rjw.a(context);
        rkk.a(context).a("growth_assistant_switch_open_" + a2, z + "");
    }
}
