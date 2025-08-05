package android.taobao.windvane.export.network;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-894566318);
        kge.a(56054570);
    }

    @Override // android.taobao.windvane.export.network.c
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null || !str.contains("ignore_prefetch_query_match=true")) {
            return str != null && str.equals(str2);
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse.getScheme().equals(parse2.getScheme()) && parse.getHost().equals(parse2.getHost())) {
                if (parse.getPath().equals(parse2.getPath())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
