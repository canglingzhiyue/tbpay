package com.taobao.android.live.plugin.proxy.recommendpop;

import android.content.Context;
import android.view.ViewGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import tb.qmn;
import tb.qmp;

/* loaded from: classes6.dex */
public interface IRecommendPopProxy extends IProxy {
    public static final String EventType_SHOW_POPVIEW = "EventType_show_recommend_popview";
    public static final String KEY = "IRecommendPopProxy";

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7);

        void a(qmn qmnVar);

        void a(qmp qmpVar);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(HashMap<String, String> hashMap);

        void b(HashMap<String, String> hashMap);

        void c(HashMap<String, String> hashMap);

        void d(HashMap<String, String> hashMap);
    }

    a createRecommendPop(Context context, ViewGroup viewGroup, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, BaseFrame baseFrame, b bVar);

    String getDXBizType();
}
