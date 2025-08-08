package com.taobao.share.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.wireless.aliprivacyext.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.kge;
import tb.nyg;
import tb.nyy;
import tb.obm;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-591833382);
    }

    public static String a(ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f48aa576", new Object[]{clipboardManager});
        }
        if (!obm.f31892a) {
            if (obm.a()) {
                return c.a(ShareBizAdapter.getInstance().getAppEnv().b());
            }
            return null;
        } else if (clipboardManager == null) {
            return null;
        } else {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    if (primaryClip.getDescription() != null && primaryClip.getDescription().getLabel() != null) {
                        if (StringUtils.equals(nyg.TAO_FLAG + ShareBizAdapter.getInstance().getAppEnv().b().getPackageName(), primaryClip.getDescription().getLabel())) {
                            nyy.a("ClipUrlWatcherControl", b.a(R.string.taobao_app_1010_1_18131));
                            return null;
                        }
                    }
                    ClipData.Item itemAt = primaryClip.getItemAt(0);
                    if (itemAt == null) {
                        return null;
                    }
                    CharSequence text = itemAt.getText();
                    if (!StringUtils.isEmpty(text)) {
                        return text.toString();
                    }
                    return null;
                }
                return null;
            } catch (Exception e) {
                TLog.loge("ShareClipboardManager", "get clickboard text failed: " + e);
                return null;
            }
        }
    }

    public static void b(ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e095e7ab", new Object[]{clipboardManager});
            return;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ""));
        } catch (Exception unused) {
            TLog.loge("setPrimaryClip", "clear clip failed");
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (Build.VERSION.SDK_INT >= 11) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(nyg.TAO_FLAG + ShareBizAdapter.getInstance().getAppEnv().b().getPackageName(), str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            ((android.text.ClipboardManager) context.getSystemService("clipboard")).setText(str);
        }
    }
}
