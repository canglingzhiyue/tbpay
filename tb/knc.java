package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;

/* loaded from: classes7.dex */
public class knc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static klz a(kmo kmoVar, kly klyVar) {
        if (a.n == null) {
            return new kmd();
        }
        if (a(kmoVar.b, klyVar)) {
            try {
                return a.n.newInstance();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
        return new kmd();
    }

    public static klx a() {
        try {
            return a.o.newInstance();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static boolean a(long j, kly klyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a7a5b98", new Object[]{new Long(j), klyVar})).booleanValue();
        }
        if (a.l == null) {
            return true;
        }
        boolean equals = "".equals(a.l.b("dlconnection_anet"));
        String b = a.l.b("sizeSwitch_anet");
        return equals && (0 == j || j > ((long) ((TextUtils.isEmpty(b) || !TextUtils.isDigitsOnly(b)) ? 0 : Integer.valueOf(b).intValue()))) && (!("".equals(a.l.b("lastUseHuc_anet")) ^ true) || (!klyVar.c() && !klyVar.d()));
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (a.l == null) {
            return kly.f30154a;
        }
        String b = a.l.b("dl_buffersize");
        if (!TextUtils.isEmpty(b) && TextUtils.isDigitsOnly(b)) {
            return Integer.valueOf(b).intValue();
        }
        return kly.f30154a;
    }
}
