package com.alipay.android.msp.ui.web.presenters;

import android.app.Activity;
import android.os.ResultReceiver;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.contracts.MspWebContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.android.msp.ui.web.MYWebViewWindow;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MYWebPresenter extends MspBasePresenter<MspWebContract.IView> implements MspWebContract.IPresenter<MspWebActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void attachIView(MspWebContract.IView iView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf38116c", new Object[]{this, iView});
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void detachIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98beade2", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    /* renamed from: getIView */
    public MspWebActivity mo545getIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWebActivity) ipChange.ipc$dispatch("d134954d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    /* renamed from: getJsWebViewWindow  reason: collision with other method in class */
    public MYWebViewWindow mo546getJsWebViewWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MYWebViewWindow) ipChange.ipc$dispatch("2d3f2b3f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public boolean init(boolean z, String str, String str2, int i, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56448ac0", new Object[]{this, new Boolean(z), str, str2, new Integer(i), str3, jSONObject, jSONObject2})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void initWebUI(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e87cadd", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void notifyCaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e9dabb", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void pushWebviewWindow(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3d476a", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void setWebViewUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4010052a", new Object[]{this});
        }
    }

    public MYWebPresenter(int i, boolean z, String str, String str2, boolean z2, String str3, ResultReceiver resultReceiver, String str4) {
    }
}
