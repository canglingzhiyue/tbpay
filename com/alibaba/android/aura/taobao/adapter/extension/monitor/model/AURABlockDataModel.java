package com.alibaba.android.aura.taobao.adapter.extension.monitor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AURABlockDataModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mLinkId;
    private final List<AURASliceDataModel> mSliceDataList;

    static {
        kge.a(1024854774);
    }

    public AURABlockDataModel(String str, List<AURASliceDataModel> list) {
        this.mLinkId = str;
        this.mSliceDataList = list;
    }

    public String getLinkId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fe322e", new Object[]{this}) : this.mLinkId;
    }

    public List<AURASliceDataModel> getSliceDataList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("80a4d0fc", new Object[]{this}) : this.mSliceDataList;
    }

    /* loaded from: classes2.dex */
    public static class AURASliceDataModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String mData;
        private final String mSliceLinkId;
        private final String mSliceNum;

        static {
            kge.a(-31209250);
        }

        public AURASliceDataModel(String str, String str2, String str3) {
            this.mSliceLinkId = str;
            this.mSliceNum = str2;
            this.mData = str3;
        }

        public String getSliceNum() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("664e472f", new Object[]{this}) : this.mSliceNum;
        }

        public String getSliceLinkId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14d039e8", new Object[]{this}) : this.mSliceLinkId;
        }

        public String getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.mData;
        }
    }
}
