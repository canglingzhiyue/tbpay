package com.taobao.android.live.plugin.proxy.universal;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.IBTypeProxy;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;
import tb.phf;

/* loaded from: classes6.dex */
public interface IUniversalProxy extends IBTypeProxy {
    public static final String KEY = "IUniversalProxy";

    /* loaded from: classes6.dex */
    public interface b {
        void a(String str, String str2, String str3);

        TrivialQueryResponseData b();
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(long j, long j2);

        void b(long j, long j2);
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a();

        void a(Context context);

        void a(String str);
    }

    phf createNegativeFeedbackHandler(Context context, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar);

    a createQAPublishBusiness(com.taobao.taolive.sdk.adapter.network.d dVar);

    DialogFragment createStreamSwitchDialog(String str, String str2);

    DialogFragment createTaoliveQualityDialog(com.taobao.alilive.aliliveframework.frame.a aVar, String str);

    b getLiveBizRequestManager();

    c getLiveEventReportInstance();

    d getVolumeChangeUploadManager();

    /* loaded from: classes6.dex */
    public static abstract class a extends com.taobao.taolive.sdk.business.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-213420458);
        }

        public abstract void a(String str, String str2, String str3);

        public a(com.taobao.taolive.sdk.adapter.network.d dVar) {
            super(dVar);
        }
    }
}
