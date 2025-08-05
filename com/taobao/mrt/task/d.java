package com.taobao.mrt.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.mrt.service.a;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d f18254a;
    public com.taobao.mrt.service.a b;

    static {
        kge.a(-691230355);
        f18254a = null;
    }

    private d() {
        this.b = null;
        this.b = com.taobao.mrt.f.a().b;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("497c744c", new Object[0]);
        }
        d dVar = f18254a;
        if (dVar != null) {
            return dVar;
        }
        synchronized (d.class) {
            if (f18254a != null) {
                return f18254a;
            }
            f18254a = new d();
            return f18254a;
        }
    }

    public void a(final MRTResourceDescription mRTResourceDescription, final a.InterfaceC0727a interfaceC0727a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d570d311", new Object[]{this, mRTResourceDescription, interfaceC0727a});
        } else if (mRTResourceDescription == null) {
            interfaceC0727a.a(false, new MRTRuntimeException(503, "Resource is null"), null);
        } else if (this.b == null) {
            interfaceC0727a.a(false, new MRTRuntimeException(501, "No download service provider registered"), null);
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            com.taobao.mrt.utils.a.b("MRTDownloader", "下载:" + mRTResourceDescription.furl);
            this.b.a(mRTResourceDescription.furl, mRTResourceDescription.fmd5, new a.InterfaceC0727a() { // from class: com.taobao.mrt.task.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mrt.service.a.InterfaceC0727a
                public void a(boolean z, Exception exc, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("daac2de4", new Object[]{this, new Boolean(z), exc, str});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("下载结束:");
                    sb.append(mRTResourceDescription.furl);
                    sb.append(" ，结果:");
                    sb.append(exc == null ? ResultCode.MSG_SUCCESS : ResultCode.MSG_FAILED);
                    com.taobao.mrt.utils.a.b("MRTDownloader", sb.toString());
                    long currentTimeMillis2 = System.currentTimeMillis();
                    int i = exc == null ? 0 : 1;
                    int i2 = exc == null ? 1 : 0;
                    int i3 = 1 - i2;
                    long j = currentTimeMillis2 - currentTimeMillis;
                    String str2 = mRTResourceDescription.resourceType;
                    String str3 = mRTResourceDescription.resourceName;
                    String str4 = mRTResourceDescription.furl;
                    com.taobao.mrt.utils.c.a(i, i2, i3, j, str2 == null ? "" : str2, str3 == null ? "" : str3, str4 == null ? "" : str4, "");
                    a.InterfaceC0727a interfaceC0727a2 = interfaceC0727a;
                    if (interfaceC0727a2 == null) {
                        return;
                    }
                    interfaceC0727a2.a(z, exc, str);
                }
            });
        }
    }
}
