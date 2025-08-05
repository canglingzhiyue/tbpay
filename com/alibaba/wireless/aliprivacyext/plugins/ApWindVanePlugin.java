package com.alibaba.wireless.aliprivacyext.plugins;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.wireless.aliprivacy.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class ApWindVanePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ApWindVanePlugin";

    /* loaded from: classes3.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f4246a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f4246a = wVCallBackContext;
        }

        @Override // com.alibaba.wireless.aliprivacyext.plugins.b
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.f4246a.success(ApWindVanePlugin.access$000(ApWindVanePlugin.this, map, true));
            }
        }

        @Override // com.alibaba.wireless.aliprivacyext.plugins.b
        public void b(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            } else {
                this.f4246a.error(ApWindVanePlugin.access$000(ApWindVanePlugin.this, map, false));
            }
        }
    }

    public static /* synthetic */ r access$000(ApWindVanePlugin apWindVanePlugin, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("a7040a36", new Object[]{apWindVanePlugin, map, new Boolean(z)}) : apWindVanePlugin.buildWVResultFromMap(map, z);
    }

    private r buildWVResultFromMap(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("3bb0a04e", new Object[]{this, map, new Boolean(z)});
        }
        r rVar = new r(z ? "HY_SUCCESS" : "HY_FAILED");
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                rVar.a(entry.getKey(), entry.getValue());
            }
        }
        c.a(TAG, rVar.d());
        return rVar;
    }

    public static /* synthetic */ Object ipc$super(ApWindVanePlugin apWindVanePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : com.alibaba.wireless.aliprivacyext.jsbridge.b.a(this.mContext, str, str2, new a(wVCallBackContext));
    }
}
