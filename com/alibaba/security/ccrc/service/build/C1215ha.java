package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.security.ccrc.service.build.ha  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1215ha extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.alibaba.security.ccrc.service.build.ha$a */
    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final String f3308a = "JsDispatcher";
        public static final List<Class<? extends AbstractC1200ca>> b;

        static {
            ArrayList arrayList = new ArrayList();
            b = arrayList;
            arrayList.add(C1218ia.class);
            b.add(C1221ja.class);
            b.add(C1224ka.class);
        }

        public static boolean a(Context context, String str, String str2, InterfaceC1203da interfaceC1203da) {
            String[] name;
            Logging.d(f3308a, "action:" + str + "\n params:" + str2);
            try {
                for (Class<? extends AbstractC1200ca> cls : b) {
                    InterfaceC1206ea interfaceC1206ea = (InterfaceC1206ea) cls.getAnnotation(InterfaceC1206ea.class);
                    if (interfaceC1206ea != null && (name = interfaceC1206ea.name()) != null) {
                        for (String str3 : name) {
                            if (str3.equals(str)) {
                                return cls.newInstance().a(context, str, str2, interfaceC1203da);
                            }
                        }
                        continue;
                    }
                }
                AbstractC1200ca.a(interfaceC1203da, AbstractC1200ca.b, null);
            } catch (Throwable th) {
                Logging.e(f3308a, "dispatch fail", th);
                AbstractC1200ca.a(interfaceC1203da, AbstractC1200ca.d, null);
            }
            return false;
        }
    }

    public static /* synthetic */ Object ipc$super(C1215ha c1215ha, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a.a(this.mContext, str, str2, new C1212ga(this, wVCallBackContext));
    }

    private android.taobao.windvane.jsbridge.r a(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.taobao.windvane.jsbridge.r) ipChange.ipc$dispatch("e9c97d75", new Object[]{this, map, new Boolean(z)});
        }
        android.taobao.windvane.jsbridge.r rVar = new android.taobao.windvane.jsbridge.r(z ? "HY_SUCCESS" : "HY_FAILED");
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                rVar.a(entry.getKey(), entry.getValue());
            }
        }
        return rVar;
    }
}
