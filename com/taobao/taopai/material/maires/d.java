package com.taobao.taopai.material.maires;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import io.reactivex.disposables.Disposable;
import java.io.File;
import tb.izk;
import tb.kge;
import tb.qbr;
import tb.qbs;
import tb.qbt;
import tb.rsj;
import tb.rsk;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1455709708);
    }

    public static /* synthetic */ void lambda$OEumU8EqqXBYRpw4E70Ehj7Eowc(qbt qbtVar, MaiResResponseModel maiResResponseModel) {
        a(qbtVar, maiResResponseModel);
    }

    public static /* synthetic */ void lambda$UCyHZTMCjiZitppfcUFUX0omz_Y(qbt qbtVar, Throwable th) {
        a(qbtVar, th);
    }

    public static Disposable a(String str, final qbt<MaterialDetailBean> qbtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("f8b97c5b", new Object[]{str, qbtVar}) : MaterialDataServer.a(izk.c(), izk.b(), 1).a(158001, 104, str).subscribe(new rsk() { // from class: com.taobao.taopai.material.maires.-$$Lambda$d$OEumU8EqqXBYRpw4E70Ehj7Eowc
            public final void accept(Object obj) {
                d.lambda$OEumU8EqqXBYRpw4E70Ehj7Eowc(qbt.this, (MaiResResponseModel) obj);
            }
        }, new rsk() { // from class: com.taobao.taopai.material.maires.-$$Lambda$d$UCyHZTMCjiZitppfcUFUX0omz_Y
            public final void accept(Object obj) {
                d.lambda$UCyHZTMCjiZitppfcUFUX0omz_Y(qbt.this, (Throwable) obj);
            }
        });
    }

    public static /* synthetic */ void a(qbt qbtVar, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5309ca6", new Object[]{qbtVar, maiResResponseModel});
        } else if (maiResResponseModel != null && !TextUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            qbtVar.a(maiResResponseModel);
        } else {
            qbtVar.a("", com.taobao.vessel.utils.c.LOAD_DATA_NULL);
        }
    }

    public static /* synthetic */ void a(qbt qbtVar, Throwable th) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3557a0", new Object[]{qbtVar, th});
            return;
        }
        if (th.getMessage() != null) {
            str = "get url error " + th.getMessage();
        } else {
            str = "get url error";
        }
        qbtVar.a("", str);
    }

    public static rsj a(String str, MaterialDetailBean materialDetailBean, com.taobao.taopai.material.request.materialfile.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rsj) ipChange.ipc$dispatch("7c10fe2", new Object[]{str, materialDetailBean, aVar});
        }
        com.taobao.taopai.material.request.materialfile.b bVar = new com.taobao.taopai.material.request.materialfile.b(materialDetailBean.getMaterialType(), materialDetailBean.getVersion(), String.valueOf(materialDetailBean.getTid()), materialDetailBean.getResourceUrl());
        bVar.a(false);
        bVar.d(qbs.a(str, materialDetailBean.resourceUrl));
        com.taobao.taopai2.material.business.res.d dVar = new com.taobao.taopai2.material.business.res.d(bVar, aVar);
        dVar.a();
        return dVar;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String b = qbs.b(str, false);
            if (!TextUtils.isEmpty(b) && new File(b).exists()) {
                String valueOf = String.valueOf(str2.hashCode());
                File[] listFiles = new File(b).listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file : listFiles) {
                        if (TextUtils.equals(valueOf, file.getName()) && qbr.a(file)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
