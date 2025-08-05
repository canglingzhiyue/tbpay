package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Queue;
import java.util.StringTokenizer;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dmp;
import tb.kge;

/* loaded from: classes6.dex */
public class h<T extends dle> extends dlg<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(424535657);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, T t, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, t, dllVar});
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.dkx a(com.alibaba.fastjson.JSONObject r19, com.alibaba.fastjson.JSONArray r20) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.dx.h.a(com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONArray):tb.dkx");
    }

    public dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)}) : new dkw(new dkv(20000, str), z);
    }

    private void a(String str, Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0aab7e", new Object[]{this, str, queue});
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            queue.offer(stringTokenizer.nextToken());
        }
    }
}
