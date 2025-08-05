package com.taobao.accs.client;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;

    /* renamed from: a  reason: collision with root package name */
    public static int f8207a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static IProcessName f;
    public static AtomicInteger g;

    static {
        kge.a(-1730793295);
        f8207a = 0;
        b = null;
        g = new AtomicInteger(-1);
    }

    public static String a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(b)) {
            str2 = str + TaobaoConstants.DEFAULT_INTENT_SERVICE_CLASS_NAME;
        } else {
            str2 = b;
        }
        ALog.d("AdapterGlobalClientInfo", "getAgooCustomServiceName", FluidException.SERVICE_NAME, str2);
        return str2;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : g.intValue() == 0;
    }
}
