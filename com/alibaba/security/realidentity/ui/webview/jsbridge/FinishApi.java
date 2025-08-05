package com.alibaba.security.realidentity.ui.webview.jsbridge;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.f;
import com.alibaba.security.realidentity.g;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsgPage;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

@JSTopic(topic = "finish")
/* loaded from: classes3.dex */
public class FinishApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FinishJSApi";

    public FinishApi(u4 u4Var) {
        super(u4Var);
    }

    private LastExitTrackMsg createLastExitTrackMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LastExitTrackMsg) ipChange.ipc$dispatch("f8962105", new Object[]{this});
        }
        LastExitTrackMsg lastExitTrackMsg = new LastExitTrackMsg();
        lastExitTrackMsg.page = LastExitTrackMsgPage.H5.getMsg();
        lastExitTrackMsg.view = "";
        lastExitTrackMsg.params = b.a(createLastExitTrackParams());
        return lastExitTrackMsg;
    }

    private RPTrack.LastExitTrackParams createLastExitTrackParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPTrack.LastExitTrackParams) ipChange.ipc$dispatch("fd85adb6", new Object[]{this});
        }
        RPTrack.LastExitTrackParams lastExitTrackParams = new RPTrack.LastExitTrackParams();
        lastExitTrackParams.url = this.mVerifyBizCapacity.d();
        return lastExitTrackParams;
    }

    private void deleteCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e6d9e", new Object[]{this});
        } else if (g.a() == null) {
        } else {
            f.c(new File(g.a()));
        }
    }

    public static /* synthetic */ Object ipc$super(FinishApi finishApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r10, com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.ui.webview.jsbridge.FinishApi.execute(java.lang.String, com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter):boolean");
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "finish";
    }
}
