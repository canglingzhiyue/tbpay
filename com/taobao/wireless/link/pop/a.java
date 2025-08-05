package com.taobao.wireless.link.pop;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.wireless.link.pop.view.FullPopView;
import com.taobao.wireless.link.pop.view.TablePushView;
import tb.kge;
import tb.rjt;
import tb.rkc;
import tb.rkg;
import tb.rki;
import tb.rkj;
import tb.rkk;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static FullPopView f23613a;
    private static TablePushView b;
    private static WindowManager.LayoutParams c;
    private static WindowManager.LayoutParams d;
    private static WindowManager e;

    /* renamed from: com.taobao.wireless.link.pop.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1021a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f23616a;

        static {
            kge.a(-1833763836);
            f23616a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b2a169d1", new Object[0]) : f23616a;
        }
    }

    static {
        kge.a(-203303631);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b2a169d1", new Object[0]) : C1021a.a();
    }

    private a() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            a(context, 0);
        }
    }

    public void a(Context context, int i) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        rkg.a("link_tag", "PopManager === showMessage == 开始消息校验");
        PopMessageData c2 = d.c(context);
        if (c2 != null) {
            if (c2.messageType == 1) {
                a2 = com.taobao.wireless.link.common.b.a(context, "openPushMessageDispose", "true");
            } else {
                a2 = c2.messageType == 2 ? com.taobao.wireless.link.common.b.a(context, "openPopMessageDispose", "true") : "true";
            }
            if (TextUtils.equals(a2, "false")) {
                rkg.a("link_tag", "PopManager === showMessage == 开关关闭，不展示pop消息");
                return;
            }
        }
        if (!b.a().a(context, i, c2)) {
            rkg.a("link_tag", "PopManager === showMessage == 校验失败，不展示pop消息");
            return;
        }
        if (!Boolean.parseBoolean(com.taobao.wireless.link.common.b.a(context, "popMessageInternalDisable", "true"))) {
            long j = 0;
            long longValue = ((Long) rkk.a(context).b("msg_last_show_time", 0L)).longValue();
            try {
                j = Long.parseLong(com.taobao.wireless.link.common.b.a(context, "messageInterval", "10"));
            } catch (Exception e2) {
                rkg.b("link_tag", "PopManager === showMessage == 类型转换异常：" + e2);
            }
            if (!rjt.a().b() && rkj.a() - longValue < 60 * j * 1000) {
                rkg.a("link_tag", "PopManager === showMessage == 距离上次显示小于" + j + "分钟，不显示pop");
                return;
            }
        }
        rkc.a(c2.messageType).a(context, c2);
        d.b(context);
    }

    public static void a(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25949ec", new Object[]{context, popMessageData});
            return;
        }
        try {
            WindowManager b2 = b(context);
            int height = b2.getDefaultDisplay().getHeight();
            if (1 == popMessageData.messageType) {
                a(context, popMessageData, b2);
            } else {
                a(context, popMessageData, b2, height);
            }
        } catch (Throwable th) {
            if (popMessageData != null) {
                rki.a(rki.POP_EXPOSE_EXCEPTION, popMessageData.messageId, th.getMessage(), null);
            }
            rkg.b("link_tag", "PopManager === createPop == 创建pop异常：" + th);
        }
    }

    private static void a(Context context, PopMessageData popMessageData, WindowManager windowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717dfe08", new Object[]{context, popMessageData, windowManager});
            return;
        }
        if (b == null) {
            rkg.a("link_tag", "PopManager === showTableView == 开始绘制桌面push");
            b = new TablePushView(context, popMessageData);
            if (d == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                d = layoutParams;
                layoutParams.x = d.a(10.0f);
                d.y = d.a(10.0f);
                if (Build.VERSION.SDK_INT >= 26) {
                    d.type = 2038;
                } else {
                    d.type = 2003;
                }
                WindowManager.LayoutParams layoutParams2 = d;
                layoutParams2.format = 1;
                layoutParams2.flags = 40;
                layoutParams2.gravity = 51;
                layoutParams2.width = TablePushView.viewWidth;
                d.height = TablePushView.viewHeight;
            }
            windowManager.addView(b, d);
        }
        rki.a(rki.TABLE_PUSH_EXPOSE, popMessageData.messageId, "", null);
        TaobaoRegister.exposureMessage(context, popMessageData.messageId, "");
        rkg.a("link_tag", "PopManager === showTableView == 不需要绘制view");
    }

    private static void a(Context context, PopMessageData popMessageData, WindowManager windowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4235fb", new Object[]{context, popMessageData, windowManager, new Integer(i)});
        } else if (f23613a != null) {
        } else {
            rkg.a("link_tag", "PopManager === showTableView == 开始绘制全屏pop");
            f23613a = new FullPopView(context, popMessageData);
            if (c == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                c = layoutParams;
                layoutParams.x = 0;
                c.y = (i / 2) - (FullPopView.viewHeight / 2);
                if (Build.VERSION.SDK_INT >= 26) {
                    c.type = 2038;
                } else {
                    c.type = 2003;
                }
                WindowManager.LayoutParams layoutParams2 = c;
                layoutParams2.format = 1;
                layoutParams2.flags = 40;
                layoutParams2.gravity = 51;
                layoutParams2.width = FullPopView.viewWidth;
                c.height = FullPopView.viewHeight;
            }
            windowManager.addView(f23613a, c);
            rki.a(rki.ARG1_FULL_POP_EXPOSE, "", "", null);
            TaobaoRegister.exposureMessage(context, popMessageData.messageId, "");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.taobao.wireless.link.pop.view.FullPopView, com.taobao.wireless.link.pop.view.TablePushView] */
    public static void b(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60774ad", new Object[]{context, popMessageData});
            return;
        }
        try {
            rkg.a("link_tag", "PopManager === removePopWindow == 移除桌面view,类型：" + popMessageData.messageType);
            if (1 == popMessageData.messageType) {
                if (b != null) {
                    b(context).removeView(b);
                    b = null;
                }
            } else if (2 == popMessageData.messageType && f23613a != null) {
                b(context).removeView(f23613a);
                f23613a = null;
            }
        } catch (Throwable th) {
            if (popMessageData != null) {
                try {
                    rki.a(rki.POP_DISAPPEAR_EXCEPTION, popMessageData.messageId, th.getMessage(), null);
                } finally {
                    f23613a = null;
                    b = null;
                }
            }
            rkg.b("link_tag", "PopManager === removePopWindow == 移除桌面View异常:" + th);
        }
    }

    private static WindowManager b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("de07ae53", new Object[]{context});
        }
        if (e == null) {
            e = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        }
        return e;
    }

    public static void c(final Context context, final PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b59f6e", new Object[]{context, popMessageData});
            return;
        }
        a(context, popMessageData);
        FullPopView.updatePopView();
        com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.pop.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.b(context, popMessageData);
                }
            }
        }, d.a(popMessageData));
    }

    public static void d(final Context context, final PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d63ca2f", new Object[]{context, popMessageData});
            return;
        }
        a(context, popMessageData);
        TablePushView.updateTablePush(context, popMessageData);
        com.taobao.wireless.link.controller.a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.pop.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.b(context, popMessageData);
                }
            }
        }, d.a(popMessageData));
    }
}
