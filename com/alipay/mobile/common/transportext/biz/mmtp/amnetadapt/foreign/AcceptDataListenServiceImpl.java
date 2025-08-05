package com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign;

import com.alipay.mobile.common.amnet.api.AcceptDataManager;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AcceptDataListenServiceImpl implements MainProcDataListenService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AcceptDataListenServiceImpl f5679a;
    private AcceptDataManager b;

    public static final MainProcDataListenService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcDataListenService) ipChange.ipc$dispatch("a354d359", new Object[0]);
        }
        if (f5679a == null) {
            synchronized (MainProcDataListenService.class) {
                if (f5679a == null) {
                    f5679a = new AcceptDataListenServiceImpl();
                }
            }
        }
        return f5679a;
    }

    private AcceptDataListenServiceImpl() {
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService
    public void onAcceptedDataEvent(final AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AcceptDataListenServiceImpl.this.getAcceptDataManager().notifyAcceptedData(acceptedData);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService
    public void recycle(final byte b, final Map<String, String> map, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67573cea", new Object[]{this, new Byte(b), map, bArr});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AcceptDataListenServiceImpl.this.getAcceptDataManager().notifyRecycle(b, map, bArr);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService
    public void tell(final byte b, final long j, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d83fa0", new Object[]{this, new Byte(b), new Long(j), new Integer(i), new Integer(i2)});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AcceptDataListenServiceImpl.this.getAcceptDataManager().notifyReqPacketSize(b, j, i, i2);
                    }
                }
            });
        }
    }

    public AcceptDataManager getAcceptDataManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AcceptDataManager) ipChange.ipc$dispatch("66f9753f", new Object[]{this});
        }
        if (this.b == null) {
            this.b = AmnetHelper.getAmnetManager().getAcceptDataManager();
        }
        return this.b;
    }
}
