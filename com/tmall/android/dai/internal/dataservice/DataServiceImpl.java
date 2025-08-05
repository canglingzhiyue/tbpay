package com.tmall.android.dai.internal.dataservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.util.b;
import java.util.Map;
import tb.gsg;
import tb.kge;
import tb.rqk;

/* loaded from: classes9.dex */
public class DataServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DataServiceImpl instance;

    static {
        kge.a(1015147757);
    }

    private static native int nativeDataCenterSaveData(String str, String str2, String str3, Map<String, String> map);

    private static native void nativeSyncAllBatchData();

    public static /* synthetic */ void access$000(DataServiceImpl dataServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07fad19", new Object[]{dataServiceImpl});
        } else {
            dataServiceImpl.syncAllBatchData();
        }
    }

    public static synchronized DataServiceImpl getInstance() {
        synchronized (DataServiceImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataServiceImpl) ipChange.ipc$dispatch("6fa612e6", new Object[0]);
            }
            if (instance == null) {
                instance = new DataServiceImpl();
            }
            return instance;
        }
    }

    private DataServiceImpl() {
    }

    public void detectAppEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0c224f", new Object[]{this});
        } else {
            rqk.getInstance().registerAppStatusCallbacks(new gsg() { // from class: com.tmall.android.dai.internal.dataservice.DataServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gsg, tb.rqi
                public void onSwitchBackground() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("74060788", new Object[]{this});
                    } else {
                        b.b().a(new Runnable() { // from class: com.tmall.android.dai.internal.dataservice.DataServiceImpl.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    DataServiceImpl.access$000(DataServiceImpl.this);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void syncAllBatchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661ddd25", new Object[]{this});
        } else {
            syncAllDataCenterBatchData();
        }
    }

    private void syncAllDataCenterBatchData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78170e46", new Object[]{this});
        } else {
            nativeSyncAllBatchData();
        }
    }

    public int saveData(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7459acc", new Object[]{this, str, str2, str3, map})).intValue();
        }
        if (DAI.loadNativeDBBeforeStart() == 1 && map != null && map.size() != 0) {
            return nativeDataCenterSaveData(str, str2, str3, map);
        }
        return -1;
    }
}
