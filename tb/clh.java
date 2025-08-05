package tb;

import android.content.Context;
import com.alipay.security.mobile.module.http.UploadFactory;
import com.alipay.tscenterdata.biz.service.pb.model.ReportPbRequest;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class clh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile clh f26348a;

    private clh() {
    }

    public static int a(Context context, cli cliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75bcd9a3", new Object[]{context, cliVar})).intValue();
        }
        try {
            ReportPbRequest reportPbRequest = new ReportPbRequest();
            reportPbRequest.biz = cliVar.f26349a;
            reportPbRequest.scene = cliVar.b;
            reportPbRequest.appName = cliVar.c;
            reportPbRequest.appVersion = cliVar.d;
            reportPbRequest.sdkVersion = cliVar.e;
            reportPbRequest.os = cliVar.f;
            reportPbRequest.brand = cliVar.g;
            reportPbRequest.model = cliVar.h;
            reportPbRequest.apdidToken = cliVar.i;
            reportPbRequest.apdid = cliVar.j;
            reportPbRequest.tid = cliVar.k;
            reportPbRequest.lbs = cliVar.l;
            reportPbRequest.behavior = cliVar.m;
            reportPbRequest.edgeRisk = cliVar.n;
            reportPbRequest.extData = cliVar.o;
            return UploadFactory.createV2(context, ckm.a().b()).uploadRiskData(reportPbRequest);
        } catch (Throwable th) {
            th.printStackTrace();
            return 404;
        }
    }

    public static synchronized clh a() {
        synchronized (clh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (clh) ipChange.ipc$dispatch("f0347df", new Object[0]);
            }
            if (f26348a == null) {
                f26348a = new clh();
            }
            return f26348a;
        }
    }
}
