package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class TBTVProgramInfo implements INetDataObject {
    public AccountInfo accountDo;
    public String backgroundImageURL;
    public String coverImg;
    public String descInfo;
    public boolean h265;
    public String headWeex;
    public boolean landScape;
    public String liveId;
    public VideoInfo.SubLiveInfo liveSubView;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String location;
    public String menuWeex;
    public MillionbabyInfo millionBaby;
    public String nativeFeedDetailUrl;
    public boolean rateAdapte;
    public VideoInfo.RoomExtendInfo roomExtend;
    public int roomStatus;
    public String shareUrl;
    public String standbyPic;
    public long startTime;
    public String supportNewLogo;
    public String supportNewUrl;
    public bannerDO tbtvHeadBannerDO;
    public String title;

    /* loaded from: classes8.dex */
    public class bannerDO {
        public String bkUrl;
        public String iconUrl;

        static {
            kge.a(822451438);
        }

        public bannerDO() {
        }
    }

    static {
        kge.a(1676212877);
        kge.a(-540945145);
    }
}
