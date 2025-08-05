package com.taobao.taolive.room.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21688a;
    public final ArrayList<TppParamFeedInfo> b = new ArrayList<>();

    static {
        kge.a(2026387963);
    }

    public i(String str) {
        this.f21688a = str;
    }

    public TppParamFeedInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TppParamFeedInfo) ipChange.ipc$dispatch("9ab8df9e", new Object[]{this});
        }
        TppParamFeedInfo tppParamFeedInfo = null;
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i) != null) {
                if (tppParamFeedInfo == null) {
                    tppParamFeedInfo = new TppParamFeedInfo();
                }
                tppParamFeedInfo.liveId = this.b.get(i).liveId;
                tppParamFeedInfo.accountId = this.b.get(i).accountId;
                tppParamFeedInfo.fansLevel = this.b.get(i).fansLevel;
                tppParamFeedInfo.roomViewCnt = this.b.get(i).roomViewCnt;
                tppParamFeedInfo.followStatus = this.b.get(i).followStatus;
                tppParamFeedInfo.enter = this.b.get(i).enter;
                tppParamFeedInfo.comment += this.b.get(i).comment;
                tppParamFeedInfo.addCart.addAll(this.b.get(i).addCart);
                tppParamFeedInfo.gotoDetail.addAll(this.b.get(i).gotoDetail);
                tppParamFeedInfo.openGoodsList += this.b.get(i).openGoodsList;
                tppParamFeedInfo.share += this.b.get(i).share;
                tppParamFeedInfo.stay += this.b.get(i).stay;
                tppParamFeedInfo.recommendBindId = this.b.get(i).recommendBindId;
                tppParamFeedInfo.timeMovingId = this.b.get(i).timeMovingId;
                tppParamFeedInfo.sjsdItemId = this.b.get(i).sjsdItemId;
                tppParamFeedInfo.clientReturnMap = this.b.get(i).clientReturnMap;
            }
        }
        return tppParamFeedInfo;
    }
}
