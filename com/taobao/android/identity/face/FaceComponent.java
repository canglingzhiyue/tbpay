package com.taobao.android.identity.face;

import android.util.Log;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.model.FaceVerifyCallback;
import com.ali.user.mobile.service.FaceService;
import com.alibaba.security.rp.RPSDK;
import com.alibaba.security.rp.scanface.AuditResultCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes5.dex */
public class FaceComponent implements FaceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.FaceComponent";

    static {
        kge.a(1544867084);
        kge.a(799607542);
    }

    @Override // com.ali.user.mobile.service.FaceService
    public void nativeLogin(String str, final FaceVerifyCallback faceVerifyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362f5a9", new Object[]{this, str, faceVerifyCallback});
        } else {
            RPSDK.startVerifyByNative(str, new AuditResultCallback() { // from class: com.taobao.android.identity.face.FaceComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.security.rp.scanface.AuditResultCallback
                public void onAuditStatus(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f1e42fce", new Object[]{this, new Integer(i)});
                        return;
                    }
                    Log.e("onAuditStatus", "onAuditStatus i = " + i);
                    if (i == 1) {
                        faceVerifyCallback.onSuccess();
                        return;
                    }
                    FaceVerifyCallback faceVerifyCallback2 = faceVerifyCallback;
                    faceVerifyCallback2.onFail(i, "verify error code = " + i);
                }
            });
        }
    }

    @Override // com.ali.user.mobile.service.FaceService
    public String getDeviceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("10d90f1f", new Object[]{this}) : RPSDK.getDeviceInfo();
    }

    @Override // com.ali.user.mobile.service.FaceService
    public void activeFaceLogin(String str, FaceVerifyCallback faceVerifyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94748bd", new Object[]{this, str, faceVerifyCallback});
            return;
        }
        try {
            Nav.from(DataProviderFactory.getApplicationContext()).toUri(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
