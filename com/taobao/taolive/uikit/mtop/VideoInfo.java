package com.taobao.taolive.uikit.mtop;

import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoInfo implements IMTOPDataObject {
    public String coverImg;
    public String curItemNum;
    public boolean h265;
    public String liveFlagPic;
    public String liveId;
    public String liveUrl;
    public ArrayList<LiveUrlData> liveUrlList;
    public String mediaConfig;
    public String nativeFeedDetailUrl;
    public String praiseCount;
    public boolean rateAdapte;
    public String roomStatus;
    public ArrayList<LiveItem> showItemList;
    public boolean shownOnceFlg;
    public String title;
    public String viewCount;

    static {
        kge.a(-960299613);
        kge.a(-350052935);
    }

    public int describeContents() {
        return 0;
    }
}
