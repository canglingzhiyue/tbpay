package com.taobao.taolive.room.ui.input.view;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;
import tb.ply;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-726227209);
    }

    public static boolean a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd977ce5", new Object[]{tBLiveDataModel})).booleanValue();
        }
        if (ply.G() && tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.broadCaster != null && tBLiveDataModel.mVideoInfo.broadCaster.atmosphere != null) {
            return tBLiveDataModel.mVideoInfo.broadCaster.atmosphere.questionChallenge;
        }
        return false;
    }

    public static String c(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("331dae9d", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.broadCaster != null && tBLiveDataModel.mVideoInfo.broadCaster.atmosphere != null) {
            return tBLiveDataModel.mVideoInfo.broadCaster.atmosphere.questionUrl;
        }
        return null;
    }
}
