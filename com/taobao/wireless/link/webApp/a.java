package com.taobao.wireless.link.webApp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.UUID;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.rkg;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1580190496);
    }

    public static void a(final Context context, final String str, String str2, final String str3) {
        PhenixCreator succListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        try {
        } catch (Exception e) {
            rkg.a("WebApp", "ShortCutUtils === addShortcut === 创建异常：" + e.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final String uuid = UUID.randomUUID().toString();
            final ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShopConstants.PARAM_SHORTCUT);
            if (shortcutManager == null || !shortcutManager.isRequestPinShortcutSupported()) {
                rkg.a("WebApp", "ShortCutUtils === addShortcut === 设备不支持在桌面创建快捷图标！！");
                rkg.a("WebApp", "ShortCutUtils === addShortcut === 创建快捷方式成功");
            }
            final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
            intent.setAction("android.intent.action.VIEW");
            succListener = com.taobao.phenix.intf.b.h().a(context).a(str2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.webApp.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    ShortcutInfo build = new ShortcutInfo.Builder(context, uuid).setIcon(Icon.createWithBitmap(succPhenixEvent.getDrawable().getBitmap())).setShortLabel(str).setIntent(intent).build();
                    shortcutManager.requestPinShortcut(build, com.android.taobao.aop.a.b(context, 0, shortcutManager.createShortcutResultIntent(build), 0).getIntentSender());
                    rkg.a("WebApp", "ShortCutUtils === addShortcut === 创建桌面创建快捷图标");
                    return false;
                }
            });
        } else {
            final Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            intent2.putExtra(AgooConstants.MESSAGE_DUPLICATE, false);
            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
            succListener = com.taobao.phenix.intf.b.h().a(context).a(str2).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.webApp.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    intent2.putExtra("android.intent.extra.shortcut.ICON", succPhenixEvent.getDrawable().getBitmap());
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                    context.sendBroadcast(intent2);
                    rkg.a("WebApp", "ShortCutUtils === addShortcut === 创建桌面创建快捷图标 8.0以下版本");
                    return false;
                }
            });
        }
        succListener.fetch();
        rkg.a("WebApp", "ShortCutUtils === addShortcut === 创建快捷方式成功");
    }
}
