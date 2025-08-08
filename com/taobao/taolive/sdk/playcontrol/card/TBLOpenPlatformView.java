package com.taobao.taolive.sdk.playcontrol.card;

import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.k;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.uikit.api.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pnn;
import tb.pqh;
import tb.pqq;
import tb.prw;

/* loaded from: classes8.dex */
public class TBLOpenPlatformView extends RelativeLayout implements d.a, com.taobao.taolive.uikit.api.a, b, pnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String account_id;
    private String entryLiveSource;
    private String entrySpm;
    private String feed_id;
    private String ignorePV;
    private String isAD;
    private String liveServerParams;
    private String liveSource;
    private String livestatus;
    private d.a mIMessageListener;
    private a mOpenPlatformViewEvent;
    private String mPMID;
    private Map<String, String> mPMParams;
    private b mPlayerCallback;
    private RelativeLayout mRootView;
    private TBLiveMediaCardView mTBLiveOpenCardView;
    private com.taobao.taolive.uikit.api.a mTBLiveOpenCardViewCallback;
    private k mTBLiveQueueMessageProvider;
    private String newRoomType;
    private String playerScene;
    private String product_type;
    private String roomStatus;
    private String roomType;
    private String spm_cnt;
    private String spm_url;
    private String streamStatus;
    private String subBusinessType;
    private String topic;
    private String trackInfo;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2, String str3);
    }

    static {
        kge.a(-2044425904);
        kge.a(1815627080);
        kge.a(-2101054629);
        kge.a(1591031764);
        kge.a(-905470315);
    }

    public static /* synthetic */ Object ipc$super(TBLOpenPlatformView tBLOpenPlatformView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String getAlogParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb6bdba", new Object[]{this});
        }
        return null;
    }

    public String getHearParamsServer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86a5082c", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        }
    }

    public TBLOpenPlatformView(Context context) {
        super(context);
        initView(context);
    }

    public TBLOpenPlatformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TBLOpenPlatformView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        try {
            this.mRootView = new RelativeLayout(context);
            this.mRootView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mTBLiveOpenCardView = new TBLiveMediaCardView(context);
            this.mTBLiveOpenCardView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mTBLiveOpenCardView.setEnableReport(true);
            this.mRootView.addView(this.mTBLiveOpenCardView);
            addView(this.mRootView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPageId(obj);
    }

    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setAnimateTime(i);
    }

    public void setOpenPlatformViewEvent(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78ab057", new Object[]{this, aVar});
        } else {
            this.mOpenPlatformViewEvent = aVar;
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPlayUrl(str);
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("playParams");
            if (jSONObject2 != null && this.mTBLiveOpenCardView != null) {
                setCoverByData(jSONObject2);
                this.mTBLiveOpenCardView.setPlayerData(jSONObject2);
                this.mTBLiveOpenCardView.setPlayVideo(true);
                String string = jSONObject.getString("forceAutoPlay");
                if (!StringUtils.isEmpty(string)) {
                    this.mTBLiveOpenCardView.closeSkipPlaySwitch = v.a(string, false);
                }
                String string2 = jSONObject.getString(MusLiveVideo.ATTR_MUTE);
                if (!StringUtils.isEmpty(string2)) {
                    this.mTBLiveOpenCardView.setMuted(v.a(string2, true));
                }
            }
            this.topic = jSONObject.getString("topic");
            this.liveSource = jSONObject.getString(pqq.KEY_LIVE_SOURCE);
            this.entryLiveSource = jSONObject.getString("entryLiveSource");
            this.spm_url = jSONObject.getString("spm_url");
            this.spm_cnt = jSONObject.getString("spm_cnt");
            this.livestatus = jSONObject.getString(ag.KEY_LIVE_STATUS);
            this.entrySpm = jSONObject.getString("entrySpm");
            this.isAD = jSONObject.getString("isAD");
            this.feed_id = jSONObject.getString("feed_id");
            this.account_id = jSONObject.getString("account_id");
            this.product_type = jSONObject.getString("product_type");
            this.ignorePV = jSONObject.getString("ignorePV");
            this.subBusinessType = jSONObject.getString("subBusinessType");
            this.playerScene = jSONObject.getString("playerScene");
            this.roomType = jSONObject.getString("roomType");
            this.newRoomType = jSONObject.getString("newRoomType");
            this.roomStatus = jSONObject.getString("roomStatus");
            this.streamStatus = jSONObject.getString("streamStatus");
            this.trackInfo = jSONObject.getString("trackInfo");
            this.liveServerParams = jSONObject.getString("liveServerParams");
            TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
            if (tBLiveMediaCardView == null) {
                return;
            }
            String str = this.subBusinessType;
            if (str != null) {
                tBLiveMediaCardView.setSubBusinessType(str);
            }
            if (this.mTBLiveOpenCardView.getCardPlayPerformanceTracker() == null) {
                return;
            }
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().a(this.feed_id);
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().i(this.livestatus);
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().b(this.liveSource);
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().c("defaultInit");
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().e("liveUrlList");
            this.mTBLiveOpenCardView.getCardPlayPerformanceTracker().d("didAppear");
            prw cardPlayPerformanceTracker = this.mTBLiveOpenCardView.getCardPlayPerformanceTracker();
            String str2 = this.playerScene;
            if (str2 == null) {
                str2 = "tblive_open_h5card";
            }
            cardPlayPerformanceTracker.j(str2);
        }
    }

    public void setPMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9558116", new Object[]{this, str});
        } else {
            this.mPMParams = convertToMap(str);
        }
    }

    public void updatePMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b8f3d", new Object[]{this, str});
        } else {
            this.mPMParams = convertToMap(str);
        }
    }

    public void warmVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e127767d", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.warmVideo();
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setViewInfoLifeCycleSyncOpenCard(dinamicXEngine, dXWidgetNode, str);
    }

    public boolean playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4075d2b2", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return false;
        }
        return tBLiveMediaCardView.playVideo(this, this);
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.stopVideo();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.destroy();
    }

    public void startSubscribePM(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbc45be", new Object[]{this, str, new Boolean(z)});
        } else if (p.r()) {
            startSubscribePMByQueue(str, z);
        } else {
            startSubscribePMManager(str, z);
        }
    }

    public void addPowerMessageInterceptor(com.taobao.taolive.sdk.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9565e9b", new Object[]{this, dVar});
        } else if (p.r()) {
            addPowerMessageInterceptorByQueue(dVar);
        } else {
            addPowerMessageInterceptorByManager(dVar);
        }
    }

    public void setIMessageListener(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aad698", new Object[]{this, aVar});
        } else {
            this.mIMessageListener = aVar;
        }
    }

    public void stopSubscribePM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8f16c", new Object[]{this});
        } else if (p.r()) {
            stopSubscribePMByQueue();
        } else {
            stopSubscribePMByManager();
        }
    }

    private void addPowerMessageInterceptorByQueue(com.taobao.taolive.sdk.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace08d85", new Object[]{this, dVar});
            return;
        }
        k kVar = this.mTBLiveQueueMessageProvider;
        if (kVar == null) {
            return;
        }
        kVar.a(dVar);
    }

    private void stopSubscribePMByQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc691dc", new Object[]{this});
            return;
        }
        k kVar = this.mTBLiveQueueMessageProvider;
        if (kVar == null) {
            return;
        }
        kVar.c();
        this.mTBLiveQueueMessageProvider.g();
        this.mTBLiveQueueMessageProvider = null;
    }

    private void startSubscribePMByQueue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fd7a8e", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mTBLiveQueueMessageProvider = new k(1, this.topic, null, str, false, true, false, false, z, false, false, this);
        this.mTBLiveQueueMessageProvider.c(this.feed_id);
        this.mTBLiveQueueMessageProvider.a((pnn) this);
        this.mTBLiveQueueMessageProvider.d();
        this.mTBLiveQueueMessageProvider.a();
    }

    private void startSubscribePMManager(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63060c7b", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.mPMID = pqh.a().b();
        pqh.a().a(this.mPMID, this.topic, z, str, this.feed_id, this, this);
    }

    private void stopSubscribePMByManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a5b978", new Object[]{this});
        } else {
            pqh.a().a(this.mPMID);
        }
    }

    private void addPowerMessageInterceptorByManager(com.taobao.taolive.sdk.core.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135d6729", new Object[]{this, dVar});
        } else {
            pqh.a().a(dVar);
        }
    }

    public void setTBLiveOpenCardViewCallback(com.taobao.taolive.uikit.api.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23112d6b", new Object[]{this, aVar});
        } else {
            this.mTBLiveOpenCardViewCallback = aVar;
        }
    }

    public void setPlayerCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64257f2", new Object[]{this, bVar});
        } else {
            this.mPlayerCallback = bVar;
        }
    }

    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setEnableCoverFade(z);
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setEnableKeepLastFrame(z);
    }

    public boolean isMuted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return false;
        }
        return tBLiveMediaCardView.isMute();
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setMuted(z);
    }

    public String getPlayerSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getPlayerSession();
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getPlayerRootView();
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getCurrentFrame();
    }

    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getPlayerToken();
    }

    public String getRecycleToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7687add", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getRecycleToken();
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPlayVideo(z);
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setVideoLoop(z);
    }

    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setCloseSkipPlaySwitch(z);
    }

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPlayDuration(i);
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return false;
        }
        return tBLiveMediaCardView.isPlayVideo();
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setSubBusinessType(str);
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setEnableConsumePlayer(z);
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return false;
        }
        return tBLiveMediaCardView.isPlaying();
    }

    @Override // tb.pnn
    public Map<String, String> getHeartParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("livesource", this.liveSource);
        hashMap.put("entryLiveSource", this.entryLiveSource);
        hashMap.put("spm-url", this.spm_url);
        hashMap.put("spm_cnt", this.spm_cnt);
        hashMap.put(ag.KEY_LIVE_STATUS, this.livestatus);
        hashMap.put("entrySpm", this.entrySpm);
        hashMap.put("isAD", this.isAD);
        hashMap.put("account_id", this.account_id);
        hashMap.put("feed_id", this.feed_id);
        hashMap.put("product_type", this.product_type);
        hashMap.put("ignorePV", this.ignorePV);
        hashMap.put("roomType", this.roomType);
        hashMap.put("newRoomType", this.newRoomType);
        hashMap.put("roomStatus", this.roomStatus);
        hashMap.put("streamStatus", this.streamStatus);
        hashMap.put("trackInfo", this.trackInfo);
        hashMap.put("liveServerParams", this.liveServerParams);
        hashMap.put("pmSession", this.mPMID);
        Map<String, String> map = this.mPMParams;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            return;
        }
        if (i == 1004) {
            notifyH5Event("PowerMsg", "TBL200001", null);
        } else if (i == 1006) {
            notifyH5Event("PowerMsg", "TBL200002", null);
        }
        d.a aVar = this.mIMessageListener;
        if (aVar == null) {
            return;
        }
        aVar.onMessageReceived(i, obj);
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onInfo(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case 100001:
                str = "TBL100005";
                break;
            case 100002:
                str = "TBL100007";
                break;
            case 100003:
                str = "TBL100008";
                break;
            case 100004:
                str = "TBL100009";
                break;
            case com.alibaba.android.ultron.engine.template.b.ERROR_TEMPLATE_INIT_FAILED /* 100005 */:
                str = "TBL100004";
                break;
            case 100006:
                str = "TBL000001";
                break;
            case 100007:
                str = "TBL000002";
                break;
            default:
                str = null;
                break;
        }
        notifyH5Event("player", str, null);
        com.taobao.taolive.uikit.api.a aVar = this.mTBLiveOpenCardViewCallback;
        if (aVar == null) {
            return;
        }
        aVar.onInfo(i);
    }

    @Override // com.taobao.taolive.uikit.api.a
    public void onError(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        switch (i) {
            case -90001:
                str = "TBL200002";
                break;
            case -90000:
                str = "TBL200001";
                break;
            default:
                str = null;
                break;
        }
        notifyH5Event("liveCard", str, null);
        com.taobao.taolive.uikit.api.a aVar = this.mTBLiveOpenCardViewCallback;
        if (aVar == null) {
            return;
        }
        aVar.onError(i);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        notifyH5Event("player", "TBL100006", String.valueOf(i));
        b bVar = this.mPlayerCallback;
        if (bVar == null) {
            return;
        }
        bVar.onMediaError(i, i2);
    }

    @Override // com.taobao.taolive.uikit.api.b
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        b bVar = this.mPlayerCallback;
        if (bVar == null) {
            return;
        }
        bVar.onMediaInfo(j, j2, j3, obj);
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.getCover();
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setImageUrl(str);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setScaleType(scaleType);
    }

    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setImageResource(i);
    }

    public void setPlayerCover(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPlayerCover(str, i);
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return null;
        }
        return tBLiveMediaCardView.findFeature(cls);
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return false;
        }
        return tBLiveMediaCardView.addFeature(absFeature);
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setPlaceHoldImageResId(i);
    }

    @Deprecated
    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setCornerRadius(i, i2, i3, i4);
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TBLiveMediaCardView tBLiveMediaCardView = this.mTBLiveOpenCardView;
        if (tBLiveMediaCardView == null) {
            return;
        }
        tBLiveMediaCardView.setColorFilter(i);
    }

    private void setCoverByData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e303f393", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString(MusLiveVideo.ATTR_POSTER);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        this.mTBLiveOpenCardView.setImageUrl(string);
        this.mTBLiveOpenCardView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private void notifyH5Event(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80397869", new Object[]{this, str, str2, str3});
            return;
        }
        a aVar = this.mOpenPlatformViewEvent;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, str3);
    }

    private Map<String, String> convertToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf456ef4", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, parseObject.getString(valueOf));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
