package tb;

import android.taobao.windvane.export.adapter.ILocalizationService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class hux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-400552104);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        ILocalizationService iLocalizationService = (ILocalizationService) qgm.a().a(ILocalizationService.class);
        if (iLocalizationService == null) {
            return str;
        }
        String str2 = null;
        try {
            str2 = iLocalizationService.a(str);
        } catch (Exception unused) {
        }
        return str2 == null ? str : str2;
    }
}
