package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.business.f;
import com.taobao.taolive.sdk.business.i;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class tjw implements f, tnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f34164a;
    private boolean b = true;

    static {
        kge.a(-1748595539);
        kge.a(-174049062);
        kge.a(-1107739425);
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        }
    }

    @Override // tb.tnc
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("id");
        if (!tnn.a().c(queryParameter)) {
            tnn.a().b(context, queryParameter);
            return;
        }
        this.f34164a = new WeakReference<>(context);
        new i(this).a("https://alive-interact.alicdn.com/livedetail/common/" + queryParameter);
    }

    @Override // tb.tnc
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        this.b = z;
        a(context, str);
    }

    @Override // com.taobao.taolive.sdk.business.f
    public void onSuccess(Object obj) {
        com.taobao.taolive.sdk.ui.media.f a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) pqj.a((String) obj, SimpleLiveInfo.class);
        if (simpleLiveInfo == null) {
            TLog.loge("tblive", "CDNPreCreateImpl", "CDN video Info 为空");
            return;
        }
        MediaData mediaData = new MediaData();
        int size = simpleLiveInfo.liveUrlList.size();
        mediaData.h265 = simpleLiveInfo.h265;
        mediaData.rateAdapte = simpleLiveInfo.rateAdapte;
        mediaData.edgePcdn = simpleLiveInfo.edgePcdn;
        mediaData.mediaConfig = simpleLiveInfo.mediaConfig;
        if (simpleLiveInfo.broadCaster != null) {
            mediaData.anchorId = simpleLiveInfo.broadCaster.accountId;
        }
        mediaData.liveId = simpleLiveInfo.liveId;
        mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
        mediaData.liveUrlList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
            MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
            qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
            qualityLiveItem.definition = qualitySelectItem.definition;
            qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
            qualityLiveItem.h265Url = qualitySelectItem.h265Url;
            qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
            qualityLiveItem.name = qualitySelectItem.name;
            qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
            qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
            qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
            qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
            qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
            qualityLiveItem.unit = qualitySelectItem.unit;
            qualityLiveItem.unitType = qualitySelectItem.unitType;
            qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
            qualityLiveItem.recomm = qualitySelectItem.recomm;
            qualityLiveItem.newName = qualitySelectItem.newName;
            qualityLiveItem.liveStreamStatsInfo = qualitySelectItem.liveStreamStatsInfo;
            mediaData.liveUrlList.add(qualityLiveItem);
            if (i == 0) {
                mediaData.dataTracks = qualitySelectItem.dataTracks;
            }
        }
        tno tnoVar = new tno();
        tnoVar.f34232a = simpleLiveInfo.liveId;
        tnoVar.b = mediaData;
        WeakReference<Context> weakReference = this.f34164a;
        if (weakReference != null && weakReference.get() != null && this.b && (a2 = new tla().a(this.f34164a.get(), mediaData)) != null) {
            tnoVar.c = a2.L();
        }
        tnn.a().a(simpleLiveInfo.liveId, tnoVar);
    }
}
