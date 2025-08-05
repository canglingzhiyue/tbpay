package com.uc.webview.internal.stats;

import com.uc.webview.base.Log;
import com.uc.webview.internal.interfaces.ICoreStatsHandler;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, Map<String, String> map) {
        f.b.contains(str);
        a(!f.f23998a.contains(str), f.c.contains(str), str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z, boolean z2, String str, Map<String, String> map) {
        if (z || z2) {
            if (z2) {
                StringBuilder sb = new StringBuilder("save ");
                sb.append(str);
                sb.append(" to ucbsDepository");
                Log.b();
                i.a().a(str, map);
            }
            if (!z) {
                return;
            }
            ICoreStatsHandler iCoreStatsHandler = ICoreStatsHandler.Instance.get();
            if (iCoreStatsHandler == null) {
                StringBuilder sb2 = new StringBuilder("save ");
                sb2.append(str);
                sb2.append(" failure, defaultDepository is null");
                Log.b();
                return;
            }
            StringBuilder sb3 = new StringBuilder("save ");
            sb3.append(str);
            sb3.append(" to defaultDepository");
            Log.b();
            i.a();
            i.b(map);
            iCoreStatsHandler.stat(ICoreStatsHandler.CATEGORY, ICoreStatsHandler.EVENT_CATEGORY, str, map);
        }
    }
}
