package com.taobao.android.live.plugin.atype.flexalocal.officialLive;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f13949a;

    static {
        kge.a(788696618);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("47581c67", new Object[0]);
        }
        if (f13949a == null) {
            synchronized (OfficialLiveEntryFrame.class) {
                if (f13949a == null) {
                    f13949a = new b();
                }
            }
        }
        return f13949a;
    }

    public boolean a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd977ce5", new Object[]{this, tBLiveDataModel})).booleanValue() : tBLiveDataModel != null && a(tBLiveDataModel.mVideoInfo);
    }

    public boolean a(VideoInfo videoInfo) {
        VideoInfo.OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{this, videoInfo})).booleanValue() : videoInfo != null && (officialLiveInfo = videoInfo.officialLiveInfo) != null && !StringUtils.isEmpty(officialLiveInfo.officialLive) && "1".equals(videoInfo.roomStatus);
    }

    public boolean b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1229aa6", new Object[]{this, tBLiveDataModel})).booleanValue() : a(tBLiveDataModel) && "official".equals(tBLiveDataModel.mVideoInfo.officialLiveInfo.officialLive);
    }

    public boolean b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18b293c8", new Object[]{this, videoInfo})).booleanValue() : a(videoInfo) && "official".equals(videoInfo.officialLiveInfo.officialLive);
    }

    public boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("689d211a", new Object[]{this, aVar, tBLiveDataModel})).booleanValue() : !a(aVar) && b(tBLiveDataModel) && hkk.o();
    }

    public boolean a(com.taobao.alilive.aliliveframework.frame.a aVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a088dbd4", new Object[]{this, aVar, videoInfo})).booleanValue() : !a(aVar) && b(videoInfo) && hkk.o();
    }

    public boolean a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{this, aVar})).booleanValue() : (aVar == null || aVar.o() == null || (!TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(aVar.o().bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(aVar.o().bizCode))) ? false : true;
    }
}
