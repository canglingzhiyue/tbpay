package com.taobao.android.live.plugin.proxy.universal;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.android.live.plugin.proxy.g;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;
import tb.phf;

/* loaded from: classes6.dex */
public class UniversalProxy extends g<IUniversalProxy> implements IUniversalProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UniversalProxy";

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final UniversalProxy f14130a;

        static {
            kge.a(926987804);
            f14130a = new UniversalProxy();
        }

        public static /* synthetic */ UniversalProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UniversalProxy) ipChange.ipc$dispatch("42467445", new Object[0]) : f14130a;
        }
    }

    static {
        kge.a(1415434836);
        kge.a(1409262171);
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this}) : IUniversalProxy.KEY;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this}) : "com.taobao.android.live.plugin.btype.flexaremote.proxy.UniversalProxyX";
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.g
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this}) : "统一架构其它 BType 功能";
    }

    public static UniversalProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UniversalProxy) ipChange.ipc$dispatch("c7bb336f", new Object[0]) : a.a();
    }

    private UniversalProxy() {
        try {
            initBType();
        } catch (Throwable th) {
            e.c("[UniversalProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public phf createNegativeFeedbackHandler(Context context, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (phf) ipChange.ipc$dispatch("fbc37259", new Object[]{this, context, tBLiveDataModel, aVar});
        }
        IUniversalProxy real = getReal();
        phf createNegativeFeedbackHandler = real != null ? real.createNegativeFeedbackHandler(context, tBLiveDataModel, aVar) : null;
        e.c("[UniversalProxy#createNegativeFeedbackHandler]  value: " + createNegativeFeedbackHandler);
        return createNegativeFeedbackHandler;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public DialogFragment createTaoliveQualityDialog(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogFragment) ipChange.ipc$dispatch("640521ed", new Object[]{this, aVar, str});
        }
        IUniversalProxy real = getReal();
        DialogFragment createTaoliveQualityDialog = real != null ? real.createTaoliveQualityDialog(aVar, str) : null;
        e.c("[UniversalProxy#createTaoliveQualityDialog]  value: " + createTaoliveQualityDialog);
        return createTaoliveQualityDialog;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public DialogFragment createStreamSwitchDialog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogFragment) ipChange.ipc$dispatch("5480a6ed", new Object[]{this, str, str2});
        }
        IUniversalProxy real = getReal();
        DialogFragment createStreamSwitchDialog = real != null ? real.createStreamSwitchDialog(str, str2) : null;
        e.c("[UniversalProxy#createStreamSwitchDialog]  value: " + createStreamSwitchDialog);
        return createStreamSwitchDialog;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.d getVolumeChangeUploadManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.d) ipChange.ipc$dispatch("da1f4177", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        IUniversalProxy.d volumeChangeUploadManager = real != null ? real.getVolumeChangeUploadManager() : null;
        e.c("[UniversalProxy#getVolumeChangeUploadManager]  value: " + volumeChangeUploadManager);
        return volumeChangeUploadManager;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.c getLiveEventReportInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.c) ipChange.ipc$dispatch("a639bc83", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        IUniversalProxy.c liveEventReportInstance = real != null ? real.getLiveEventReportInstance() : null;
        e.c("[UniversalProxy#getLiveEventReportInstance]  value: " + liveEventReportInstance);
        return liveEventReportInstance;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.a createQAPublishBusiness(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.a) ipChange.ipc$dispatch("b7fb3d6e", new Object[]{this, dVar});
        }
        IUniversalProxy real = getReal();
        IUniversalProxy.a createQAPublishBusiness = real != null ? real.createQAPublishBusiness(dVar) : null;
        e.c("[UniversalProxy#createQAPublishBusiness]  value: " + createQAPublishBusiness);
        return createQAPublishBusiness;
    }

    @Override // com.taobao.android.live.plugin.proxy.universal.IUniversalProxy
    public IUniversalProxy.b getLiveBizRequestManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUniversalProxy.b) ipChange.ipc$dispatch("db01dab6", new Object[]{this});
        }
        IUniversalProxy real = getReal();
        IUniversalProxy.b liveBizRequestManager = real != null ? real.getLiveBizRequestManager() : null;
        e.c("[UniversalProxy#getLiveBizRequestManager]  value: " + liveBizRequestManager);
        return liveBizRequestManager;
    }
}
