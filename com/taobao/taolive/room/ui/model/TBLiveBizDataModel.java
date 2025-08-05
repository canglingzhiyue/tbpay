package com.taobao.taolive.room.ui.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.tbliveinteractive.e;
import tb.kge;
import tb.pkm;

/* loaded from: classes8.dex */
public class TBLiveBizDataModel extends TBLiveDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public e liveInteractiveManager;
    public pkm perfomenceTrackManager;

    static {
        kge.a(2079267207);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBizDataModel tBLiveBizDataModel, String str, Object... objArr) {
        if (str.hashCode() == 1927931175) {
            super.clearManager();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBLiveBizDataModel() {
    }

    public TBLiveBizDataModel(TBLiveDataModel tBLiveDataModel) {
        this.mVideoInfo = tBLiveDataModel.mVideoInfo;
        this.mRoomInfo = tBLiveDataModel.mRoomInfo;
        this.mRawData = tBLiveDataModel.mRawData;
        this.mFandomInfo = tBLiveDataModel.mFandomInfo;
        this.mInitParams = tBLiveDataModel.mInitParams;
        this.mActionUrl = tBLiveDataModel.mActionUrl;
        this.mViewItemId = tBLiveDataModel.mViewItemId;
    }

    @Override // com.taobao.taolive.sdk.model.TBLiveDataModel
    public void clearManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e9e527", new Object[]{this});
            return;
        }
        super.clearManager();
        this.perfomenceTrackManager = null;
        this.liveInteractiveManager = null;
    }
}
