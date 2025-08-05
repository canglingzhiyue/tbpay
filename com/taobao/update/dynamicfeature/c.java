package com.taobao.update.dynamicfeature;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.processor.FeatureCheckProcessor;
import com.taobao.update.dynamicfeature.processor.d;
import com.taobao.update.dynamicfeature.processor.e;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.rfx;
import tb.rfy;
import tb.rgg;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final c b;

    /* renamed from: a */
    private List<com.taobao.update.framework.b> f23401a = new ArrayList();

    /* renamed from: lambda$WDyuh-LaI4FS6o99Plc9L1a1Oc0 */
    public static /* synthetic */ void m1579lambda$WDyuhLaI4FS6o99Plc9L1a1Oc0(String str) {
        a(str);
    }

    static {
        kge.a(842641864);
        b = new c();
    }

    private c() {
        this.f23401a.add(new com.taobao.update.dynamicfeature.processor.a());
        this.f23401a.add(new e());
        this.f23401a.add(new com.taobao.update.dynamicfeature.processor.c());
        this.f23401a.add(new FeatureCheckProcessor());
        this.f23401a.add(new com.taobao.update.dynamicfeature.processor.b());
        this.f23401a.add(new d());
    }

    public static c getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3105a2d5", new Object[0]) : b;
    }

    public void execute(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb58b8", new Object[]{this, bVar, str});
            return;
        }
        for (com.taobao.update.framework.b bVar2 : this.f23401a) {
            long currentTimeMillis = System.currentTimeMillis();
            bVar2.execute(bVar);
            if (!bVar.success) {
                if (str.equals(rfx.SCAN)) {
                    a(bVar2, bVar);
                    return;
                } else {
                    rgg.stat(false, bVar.stage, System.currentTimeMillis() - currentTimeMillis, bVar.errorCode, bVar.errorMsg, bVar.featureUpdateData.featureUpdateVersion);
                    return;
                }
            } else if (str.equals(rfx.SCAN)) {
                a(bVar2, bVar);
            } else {
                rgg.stat(true, bVar.stage, System.currentTimeMillis() - currentTimeMillis, 0, "", bVar.featureUpdateData.featureUpdateVersion);
            }
        }
    }

    private void a(com.taobao.update.framework.b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9010d8d", new Object[]{this, bVar, bVar2});
        } else if (bVar instanceof com.taobao.update.dynamicfeature.processor.a) {
            showToast(bVar2.success ? "网络正常" : "网络异常");
        } else if (bVar instanceof com.taobao.update.dynamicfeature.processor.b) {
            showToast(bVar2.success ? "feature解压成功" : "feature解压失败");
        } else if (bVar instanceof FeatureCheckProcessor) {
            showToast(bVar2.success ? "feature验证成功" : "feature验证失败");
        } else if (bVar instanceof com.taobao.update.dynamicfeature.processor.c) {
            showToast(bVar2.success ? "feature下载成功" : "feature下载失败");
        } else if (!(bVar instanceof d)) {
        } else {
            showToast(bVar2.success ? "feature安装成功" : "feature安装失败");
        }
    }

    public void showToast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.update.dynamicfeature.-$$Lambda$c$WDyuh-LaI4FS6o99Plc9L1a1Oc0
                @Override // java.lang.Runnable
                public final void run() {
                    c.m1579lambda$WDyuhLaI4FS6o99Plc9L1a1Oc0(str);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Toast.makeText(rfy.sContext, str, 0).show();
        }
    }

    public void rollBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6fd295", new Object[]{this, str});
        } else {
            new d().deprecatedHisUpdateVersion(str);
        }
    }
}
