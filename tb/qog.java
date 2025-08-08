package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.d;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tbhudong.TBHuDongServiceImp;
import java.util.ArrayList;
import java.util.List;
import tb.qog;

/* loaded from: classes9.dex */
public class qog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface a {
        void a(boolean z, String str);
    }

    public static /* synthetic */ boolean lambda$LG0YSMC7yqVTX43raGbx6cLvH98(Context context, String str, String str2, Intent intent, ShortcutManager shortcutManager, a aVar, SuccPhenixEvent succPhenixEvent) {
        return a(context, str, str2, intent, shortcutManager, aVar, succPhenixEvent);
    }

    public static /* synthetic */ boolean lambda$wk9ZUbXINGCw_QqRntPUcEfzEj8(a aVar, FailPhenixEvent failPhenixEvent) {
        return a(aVar, failPhenixEvent);
    }

    public static void a(final Context context, final String str, final String str2, String str3, String str4, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6298b2", new Object[]{context, str, str2, str3, str4, aVar});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3) && !StringUtils.isEmpty(str4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    final ShortcutManager shortcutManager = (ShortcutManager) TBHuDongServiceImp.getApplication().getSystemService(ShopConstants.PARAM_SHORTCUT);
                    if (shortcutManager != null && shortcutManager.isRequestPinShortcutSupported()) {
                        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                        intent.setFlags(268468224);
                        b.h().a(context).a(str3).succListener(new com.taobao.phenix.intf.event.a() { // from class: tb.-$$Lambda$qog$LG0YSMC7yqVTX43raGbx6cLvH98
                            @Override // com.taobao.phenix.intf.event.a
                            public final boolean onHappen(d dVar) {
                                return qog.lambda$LG0YSMC7yqVTX43raGbx6cLvH98(context, str, str2, intent, shortcutManager, aVar, (SuccPhenixEvent) dVar);
                            }
                        }).failListener(new com.taobao.phenix.intf.event.a() { // from class: tb.-$$Lambda$qog$wk9ZUbXINGCw_QqRntPUcEfzEj8
                            @Override // com.taobao.phenix.intf.event.a
                            public final boolean onHappen(d dVar) {
                                return qog.lambda$wk9ZUbXINGCw_QqRntPUcEfzEj8(qog.a.this, (FailPhenixEvent) dVar);
                            }
                        }).fetch();
                        return;
                    }
                    aVar.a(false, "SYSTEM_PIN_SHORTCUT_NOT_SUPPORT");
                    return;
                }
                aVar.a(false, "SYSTEM_LEVEL_INVALID");
                return;
            }
            aVar.a(false, "PARAM_INVALID");
        } catch (Throwable th) {
            qif.a("PinnedShortcutsManager.addShortcut.error.", th);
            aVar.a(false, "CATCH_ERROR_INVALID");
        }
    }

    public static /* synthetic */ boolean a(Context context, String str, String str2, Intent intent, ShortcutManager shortcutManager, a aVar, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3381dd6b", new Object[]{context, str, str2, intent, shortcutManager, aVar, succPhenixEvent})).booleanValue();
        }
        ShortcutInfo build = new ShortcutInfo.Builder(context, str).setIcon(Icon.createWithBitmap(succPhenixEvent.getDrawable().getBitmap())).setShortLabel(str2).setIntent(intent).build();
        if (a(shortcutManager, str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(build);
            boolean updateShortcuts = shortcutManager.updateShortcuts(arrayList);
            qif.a("PinnedShortcutsManager.updateShortcut.id=%s.updateShortcuts=%s.", str, Boolean.valueOf(updateShortcuts));
            if (updateShortcuts) {
                aVar.a(true, "");
            } else {
                aVar.a(false, "UPDATE_FAIL_RATE_LIMITED");
            }
        } else {
            shortcutManager.requestPinShortcut(build, com.android.taobao.aop.a.b(context, 0, shortcutManager.createShortcutResultIntent(build), 0).getIntentSender());
            qif.a("PinnedShortcutsManager.addShortcut.id=%s", str);
            aVar.a(true, "");
        }
        return false;
    }

    public static /* synthetic */ boolean a(a aVar, FailPhenixEvent failPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfc101fa", new Object[]{aVar, failPhenixEvent})).booleanValue();
        }
        aVar.a(false, "ICON_IMAGE_LOAD_FAIL");
        return false;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return "PARAM_INVALID";
            }
            if (Build.VERSION.SDK_INT < 26) {
                return "SYSTEM_LEVEL_INVALID";
            }
            ShortcutManager shortcutManager = (ShortcutManager) TBHuDongServiceImp.getApplication().getSystemService(ShopConstants.PARAM_SHORTCUT);
            return (shortcutManager == null || !shortcutManager.isRequestPinShortcutSupported()) ? "SYSTEM_PIN_SHORTCUT_NOT_SUPPORT" : a(shortcutManager, str) ? "" : "NOT_ADDED";
        } catch (Throwable th) {
            qif.a("PinnedShortcutsManager.isIconIdAdded.error.", th);
            return "CATCH_ERROR_INVALID";
        }
    }

    private static boolean a(ShortcutManager shortcutManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a679d3a", new Object[]{shortcutManager, str})).booleanValue();
        }
        List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
        if (pinnedShortcuts != null) {
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                if (shortcutInfo != null && str.equals(shortcutInfo.getId())) {
                    return true;
                }
            }
        }
        return false;
    }
}
