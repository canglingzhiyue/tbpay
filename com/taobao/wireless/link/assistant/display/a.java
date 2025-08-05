package com.taobao.wireless.link.assistant.display;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;
import tb.kge;
import tb.rju;
import tb.rjv;
import tb.rjw;
import tb.rjx;
import tb.rkg;
import tb.rki;
import tb.rkj;
import tb.rkk;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23576a;
    private static AssistantView b;
    private static WindowManager.LayoutParams c;
    private static WindowManager d;

    static {
        kge.a(-967007486);
    }

    public static /* synthetic */ AssistantView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AssistantView) ipChange.ipc$dispatch("ac46e16f", new Object[0]) : b;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f23576a = z;
        return z;
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (!rkj.a(context, AssistantCheckService.class.getName())) {
            rkg.a("link_tag", "DisplayCenter === drawAssistant === service未存活，开启轮询");
            try {
                context.startService(new Intent(context, AssistantCheckService.class));
            } catch (Exception e) {
                rkg.b("link_tag", "DisplayCenter === drawAssistant === service未存活，开启失败：" + e);
            }
        }
        com.taobao.wireless.link.controller.a.a().b().post(new Runnable() { // from class: com.taobao.wireless.link.assistant.display.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MessageData a2 = rjw.a(rkk.a(context));
                if (a2.activity_id == null) {
                    Context context2 = context;
                    rjv a3 = rjw.a(context2, rkk.a(context2), rjw.a(context), rju.a().a(context));
                    if (a3 != null && a3.b != null && a3.c != null) {
                        a2.assistant_logo_url = a3.c;
                        a2.activity_id = a3.b;
                    }
                }
                if (!rkj.d(context) && a.a() != null) {
                    if (!rjx.b) {
                        a.a().setVisibility(8);
                        return;
                    } else if (rjx.f33194a >= 3) {
                        a.a().setVisibility(8);
                        return;
                    }
                }
                a.a(context, a2);
            }
        });
    }

    public static void a(final Context context, final MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28b6b9b", new Object[]{context, messageData});
            return;
        }
        AssistantView assistantView = b;
        if (assistantView != null) {
            assistantView.setVisibility(0);
        }
        boolean z = messageData.activity_id == null || rjw.b(context, messageData) || !rkj.a(messageData.msg_arrive_time, messageData.validTime);
        rkg.a("link_tag", "DisplayCenter === showAssistant === isDefault=" + z);
        b(context, messageData);
        if (!z) {
            f23576a = true;
            AssistantView.updateAssistantView(0, messageData.assistant_title, messageData.assistant_pic_url);
            com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.assistant.display.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rkg.a("link_tag", "DisplayCenter === showAssistant === 开始复原");
                    AssistantView.updateAssistantView(4, "", rjw.a(context, messageData));
                    a.a(false);
                }
            }, rjw.a(messageData));
        } else if (!f23576a) {
            AssistantView.updateAssistantView(4, messageData.assistant_title, rjw.a(context, messageData));
        }
        rjw.d(rkk.a(context));
    }

    public static void b(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfc64ba", new Object[]{context, messageData});
            return;
        }
        try {
            WindowManager c2 = c(context);
            int width = c2.getDefaultDisplay().getWidth();
            int height = c2.getDefaultDisplay().getHeight();
            if (b != null) {
                return;
            }
            rkg.a("link_tag", "DisplayCenter === createAssistantWindow === 小助手View不存在开始创建");
            b = new AssistantView(context);
            if (c == null) {
                c = new WindowManager.LayoutParams();
                if (Build.VERSION.SDK_INT >= 26) {
                    c.type = 2038;
                } else {
                    c.type = 2003;
                }
                c.format = 1;
                c.flags = 40;
                c.gravity = 51;
                c.width = AssistantView.viewWidth;
                c.height = AssistantView.viewHeight;
                c.x = width;
                c.y = height / 2;
            }
            b.setParams(c);
            c2.addView(b, c);
            rkg.a("link_tag", "DisplayCenter === createAssistantWindow === 小助手View创建成功");
            rki.a(rki.ARG1_ASSISTANT_EXPOSE, messageData.activity_id, "", null);
        } catch (Exception unused) {
            if (messageData == null) {
                return;
            }
            rki.a(rki.ARG1_ASSISTANT_EXPOSE_EXCEPTION, messageData.message_id, "", null);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            c(context).removeView(b);
            b = null;
        } catch (Exception e) {
            rkg.a("link_tag", "DisplayCenter === removeAssistantWindow === 移除小助手异常=" + e.getMessage());
            rki.a(rki.ARG1_ASSISTANT_REMOVE_EXCEPTION, "", "", null);
        }
    }

    private static WindowManager c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("39bb754", new Object[]{context});
        }
        if (d == null) {
            d = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        }
        return d;
    }
}
