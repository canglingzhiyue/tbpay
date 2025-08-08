package com.taobao.trtc.utils;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcException;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(516185221);
    }

    public static void a(String str, Object... objArr) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "references is null";
        }
        for (Object obj : objArr) {
            if (obj == null) {
                throw new TrtcException(str);
            }
            if ((obj instanceof String) && StringUtils.isEmpty((String) obj)) {
                throw new TrtcException(str);
            }
        }
    }

    public static void a(String str, boolean z) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else if (z) {
        } else {
            TrtcLog.a("trtc", str);
            throw new TrtcException(str);
        }
    }

    public static void a(String str) throws TrtcException {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String str2 = str + " should run on main thread";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        a(str2, z);
    }
}
