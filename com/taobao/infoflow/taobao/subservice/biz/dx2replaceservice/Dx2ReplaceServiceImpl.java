package com.taobao.infoflow.taobao.subservice.biz.dx2replaceservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lkq;
import tb.lnm;

/* loaded from: classes.dex */
public class Dx2ReplaceServiceImpl implements IDx2ReplaceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Dx2ReplaceServiceImpl";

    static {
        kge.a(-263633606);
        kge.a(71244859);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            initRegister(ljsVar);
        }
    }

    private void initRegister(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949ba075", new Object[]{this, ljsVar});
            return;
        }
        IContainerService iContainerService = (IContainerService) ljsVar.a(IContainerService.class);
        if (iContainerService == null) {
            ldf.d(TAG, "containerService is null");
        } else {
            iContainerService.addOnContainerListener(new lkq.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.dx2replaceservice.Dx2ReplaceServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lkq.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    }
                }

                @Override // tb.lkq.a
                public void a(Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9e1d6460", new Object[]{this, context});
                    } else {
                        lnm.a();
                    }
                }
            });
        }
    }
}
