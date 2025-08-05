package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;

/* loaded from: classes5.dex */
public class fjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1076839306);
    }

    public static void a(fmd fmdVar, fhi fhiVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383168bf", new Object[]{fmdVar, fhiVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!a(fhiVar)) {
        } else {
            fje.a(fmdVar).a(fhiVar, i, i2, i3);
        }
    }

    public static void a(Context context, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa30589", new Object[]{context, fhiVar});
        } else if (!a(fhiVar)) {
        } else {
            fje.a((fmd) null).a(context, fhiVar.W());
        }
    }

    public static void a(fmd fmdVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a924b64", new Object[]{fmdVar, fhiVar});
        } else if (!a(fhiVar)) {
        } else {
            fje.a(fmdVar).a();
        }
    }

    public static boolean a(fhi fhiVar) {
        MainMediaInfo W;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e88d8595", new Object[]{fhiVar})).booleanValue() : (fhiVar == null || (W = fhiVar.W()) == null || W.config == null || !W.config.enablePreDownload) ? false : true;
    }
}
