package com.taobao.mediaplay;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.media.MediaDeviceUtils;
import com.taobao.media.MediaMeasureAdapter;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaVideoResponse;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taolive.room.utils.aw;
import com.taobao.vpm.VPMManagerInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.ado;
import tb.ddg;
import tb.kge;
import tb.mka;
import tb.mto;
import tb.oyu;
import tb.oyw;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean M;
    private static Map<String, String> O;
    private int A;
    private String B;
    private String C;
    private boolean N;
    private boolean P;
    private String Q;
    private boolean R;
    private boolean S;
    private volatile boolean g;
    private MediaPlayControlContext h;
    private long y;
    private long z;
    private int f = 0;
    private final String[] i = {"ud", "hd", "sd", "ld"};
    private final String[] j = {"hd", "sd", "ld", "ud"};
    private final String[] k = {"sd", "ld", "hd", "ud"};
    private final String[] l = {"ld", "sd", "hd", "ud"};
    private final String[][] T = {new String[]{MediaConstant.DEFINITION_UD_H266, "ud_265", "ud"}, new String[]{MediaConstant.DEFINITION_HD_H266, "hd_265", "hd"}, new String[]{MediaConstant.DEFINITION_SD_H266, "sd_265", "sd"}, new String[]{MediaConstant.DEFINITION_LD_H266, "ld_265", "ld"}};
    private final String[][] m = {new String[]{"ud_265", "ud"}, new String[]{"hd_265", "hd"}, new String[]{"sd_265", "sd"}, new String[]{"ld_265", "ld"}};
    private final String[][] n = {new String[]{"hd_265", "hd"}, new String[]{"sd_265", "sd"}, new String[]{"ld_265", "ld"}};
    private final String[][] o = {new String[]{"sd_265", "sd"}, new String[]{"ld_265", "ld"}};
    private final String[][] p = {new String[]{"ld_265", "ld"}};
    private final String q = "ud#hd#sd#ld";
    private final String r = "hd#sd#ld#ud";
    private final String s = "sd#ld#hd#ud";
    private final String t = "ld#sd#hd#ud";
    private final String[] u = {"sd", MediaConstant.DEFINITION_MD};
    private final String[] v = {MediaConstant.DEFINITION_MD};
    private final String[] w = {MediaConstant.DEFINITION_LLD};
    private final String[] x = {"ud", "hd", "sd", "ld", MediaConstant.DEFINITION_MD, MediaConstant.DEFINITION_2K, MediaConstant.DEFINITION_4K};
    private int D = -1;
    private int E = -1;
    private int F = -1;
    private double G = -1.0d;
    private double H = -1.0d;
    private String I = "";
    private String J = "";
    private String K = "";
    private String L = "-1";

    /* renamed from: a  reason: collision with root package name */
    public int f18020a = -1;
    public int b = -1;
    public int c = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int d = 2;
    public String e = "";
    public long U = 0;

    static {
        kge.a(-891204866);
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46abb25c", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.A = i;
        return i;
    }

    public static /* synthetic */ long a(g gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46abb61e", new Object[]{gVar, new Long(j)})).longValue();
        }
        gVar.z = j;
        return j;
    }

    public static /* synthetic */ MediaPlayControlContext a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayControlContext) ipChange.ipc$dispatch("8789656b", new Object[]{gVar}) : gVar.h;
    }

    public static /* synthetic */ void a(g gVar, com.taobao.mediaplay.model.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6568c6b6", new Object[]{gVar, cVar});
        } else {
            gVar.b(cVar);
        }
    }

    public static /* synthetic */ void a(g gVar, com.taobao.mediaplay.model.c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b077ca", new Object[]{gVar, cVar, new Float(f)});
        } else {
            gVar.a(cVar, f);
        }
    }

    public static /* synthetic */ void a(g gVar, com.taobao.mediaplay.model.c cVar, MediaPlayControlContext mediaPlayControlContext, Map map, Map map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a1e5b4", new Object[]{gVar, cVar, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else {
            gVar.a(cVar, mediaPlayControlContext, map, map2, z, i);
        }
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46abf23e", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.g = z;
        return z;
    }

    public static /* synthetic */ void b(g gVar, com.taobao.mediaplay.model.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761e9377", new Object[]{gVar, cVar});
        } else {
            gVar.a(cVar);
        }
    }

    public static /* synthetic */ void b(g gVar, com.taobao.mediaplay.model.c cVar, MediaPlayControlContext mediaPlayControlContext, Map map, Map map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b544b5", new Object[]{gVar, cVar, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else {
            gVar.b(cVar, mediaPlayControlContext, map, map2, z, i);
        }
    }

    public static /* synthetic */ boolean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e2c205f", new Object[]{gVar})).booleanValue() : gVar.R;
    }

    public static /* synthetic */ boolean c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a77c04e0", new Object[]{gVar})).booleanValue() : gVar.S;
    }

    public static /* synthetic */ boolean d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0cbe961", new Object[]{gVar})).booleanValue() : gVar.p();
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f;
    }

    private void a(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d4dae9", new Object[]{this, qualityLiveItem});
            return;
        }
        if (!TextUtils.isEmpty(qualityLiveItem.unitType) && qualityLiveItem.unitType.startsWith("sub_")) {
            try {
                i = Integer.parseInt(qualityLiveItem.unitType.substring(4));
            } catch (NumberFormatException unused) {
                AVSDKLog.w("MediaPlayControlManager", "exception parsing unit number from " + qualityLiveItem.unitType);
            }
        }
        this.f = i;
    }

    public g(MediaPlayControlContext mediaPlayControlContext) {
        this.P = true;
        this.Q = "*";
        this.R = true;
        this.S = false;
        this.h = mediaPlayControlContext;
        f();
        this.P = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "GRTNFixTsReset", "true"));
        this.Q = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_FALLBACK_IN_PLAY_CONTROL, "*");
        this.R = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE, "true"));
        this.S = com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_CONTROL_RESULT_CACHE_SBT, "[\"newdetail_main\", \"newdetail_native\", \"myorder\"]"));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (M) {
        } else {
            M = true;
            HashMap hashMap = new HashMap();
            O = hashMap;
            hashMap.put(MediaConstant.DEFINITION_UD_H266, "ud");
            O.put("ud_265", "ud");
            O.put("hd_265", "hd");
            O.put("sd_265", "sd");
            O.put("ld_265", "ld");
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "EnableUD", "false"))) {
            return false;
        }
        return com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_1080P_MP4_FROM_WHITELIST, "[\"TimeMovingPlay\"]")) ? !((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).isLowPerformanceByAB(this.h) : com.taobao.taobaoavsdk.util.b.b(Build.MODEL, MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "UDModelWhiteList", ""));
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54da6a5e", new Object[]{this, cVar});
        } else if (this.g) {
        } else {
            MediaPlayControlContext mediaPlayControlContext = this.h;
            if (mediaPlayControlContext != null) {
                ddg ddgVar = mediaPlayControlContext.mTLogAdapter;
                com.taobao.taobaoavsdk.util.c.a(ddgVar, "pickVideoUrl##VideoSource:" + this.h.getVideoSource());
            }
            if (cVar == null) {
                com.taobao.taobaoavsdk.util.c.a(this.h.mTLogAdapter, "pickVideoUrl##videoUrlPickCallBack = null");
                return;
            }
            MediaPlayControlContext mediaPlayControlContext2 = this.h;
            if (mediaPlayControlContext2 != null && !mediaPlayControlContext2.mTBLive) {
                if (MediaAdapteManager.mMeasureAdapter != null) {
                    this.h.setNetSpeed(MediaAdapteManager.mMeasureAdapter.getNetSpeedValue());
                }
                this.h.setNetWorkQuality(com.taobao.taobaoavsdk.util.f.c());
                this.h.setGlobalCurrentBandWidth(com.taobao.taobaoavsdk.util.f.d());
                this.h.setGlobalPredictBandWidth(com.taobao.taobaoavsdk.util.f.e());
            }
            this.h.setTopAnchor(false);
            boolean equals = "TBVideo".equals(this.h.getVideoSource());
            boolean equals2 = "TBAudio".equals(this.h.getVideoSource());
            if (this.R && this.S && this.h.getMediaInfoParams() == null) {
                JSONObject a2 = h.a(this.h.mVideoId);
                if ((equals || equals2) && a2 != null) {
                    this.h.setMediaInfoParams(a2);
                }
            }
            if ((equals || equals2) && this.h.getMediaInfoParams() != null) {
                if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.USE_INPUT_MEDIA_INFO_BLACK_LIST, ""))) {
                    MediaPlayControlContext mediaPlayControlContext3 = this.h;
                    if (mediaPlayControlContext3 != null) {
                        com.taobao.taobaoavsdk.util.c.a(mediaPlayControlContext3.mTLogAdapter, "pickTBMediaUrlFromMediaInfo##mFrom is in useInputMediaInfo blacklist");
                    }
                } else {
                    b(cVar);
                    return;
                }
            }
            if ((!TextUtils.isEmpty(this.h.mVideoId) && equals) || this.h.mTBLive) {
                if (!equals && !this.h.mTBLive) {
                    return;
                }
                if (equals && (this.h == null || MediaAdapteManager.mConfigAdapter == null || com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.PLAY_MANAGER_BIZCODES_BLACK_LIST, "[\"TRAVEL_HOME\"]")))) {
                    cVar.a(false, "");
                    MediaPlayControlContext mediaPlayControlContext4 = this.h;
                    if (mediaPlayControlContext4 == null) {
                        return;
                    }
                    com.taobao.taobaoavsdk.util.c.a(mediaPlayControlContext4.mTLogAdapter, "pickTBVideoUrl##PlayManager is not available");
                    return;
                }
                c(cVar);
                return;
            }
            if (this.h.mEmbed) {
                m();
                i();
            }
            cVar.a(false, "");
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.h.setHandleVVCError();
        }
    }

    private void a(c cVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ff658d", new Object[]{this, cVar, new Boolean(z), new Integer(i)});
            return;
        }
        cVar.a(b(z, i), "");
        this.g = false;
    }

    private boolean b(c cVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce82dd2", new Object[]{this, cVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!a(z, i)) {
            return false;
        }
        cVar.a(true, "");
        this.g = false;
        return true;
    }

    private boolean a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c190d1b", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (this.h.mMediaLiveInfo != null && this.h.mMediaLiveInfo.liveUrlList != null && this.h.mMediaLiveInfo.liveUrlList.size() > 0) {
            return b(this.h.mMediaLiveInfo, z);
        }
        return false;
    }

    private boolean b(boolean z, int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ff485c", new Object[]{this, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (this.h.mMediaLiveInfo == null || this.h.mMediaLiveInfo.liveUrlList == null || this.h.mMediaLiveInfo.liveUrlList.size() <= 0) {
            return false;
        }
        a(this.h.mMediaLiveInfo, z, i);
        String a2 = com.taobao.taobaoavsdk.util.f.a(MediaAdapteManager.mMediaNetworkUtilsAdapter, this.h.mContext);
        if (((MediaAdapteManager.mConfigAdapter != null && !TextUtils.isEmpty(this.h.getVideoUrl()) && !this.h.getVideoUrl().contains(".m3u8") && this.h.mTBLive && this.h.getVideoUrl().contains("liveng.alicdn.com") && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "lowDeviceSVCEnable", "false"))) && this.h.mMediaLiveInfo.mMediaConfigData != null && this.h.mMediaLiveInfo.mMediaConfigData.enableSVC(this.h.getFrom())) && ((!this.h.isLiveRoom() && com.taobao.taobaoavsdk.util.b.a(this.h.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "SVCFromWhiteList", ""), "ALL_FROM")) || (this.h.isLiveRoom() && !TextUtils.isEmpty(a2) && ("low".equals(this.h.getDevicePerformanceLevel()) || a2.equals("3G") || a2.equals("2G") || (this.h.getNetSpeed() > 0 && ((("WIFI".equals(a2) && this.h.getNetSpeed() <= 1500) || (("4G".equals(a2) || "5G".equals(a2)) && this.h.getNetSpeed() <= 2000)) && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "lowNetSpeedSVCEnable", "false")))))))) {
            this.h.mSVCEnable = true;
        }
        if ((this.h.isMute() && MediaAdapteManager.mConfigAdapter != null && !TextUtils.isEmpty(this.h.getVideoUrl()) && !this.h.getVideoUrl().contains(".m3u8") && this.h.mTBLive && this.h.getVideoUrl().contains("liveng.alicdn.com")) && this.h.mMediaLiveInfo.mMediaConfigData != null && this.h.mMediaLiveInfo.mMediaConfigData.enableOnlyVideo(this.h.getFrom())) {
            z2 = true;
        }
        if (z2 && !TextUtils.isEmpty(this.h.getFrom()) && !this.h.isLiveRoom() && com.taobao.taobaoavsdk.util.b.a(this.h.getFrom(), MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "OnlyVideoFromWhiteList", ""), "ALL_FROM")) {
            this.h.mOnlyVideoEnable = true;
        }
        MediaPlayControlContext mediaPlayControlContext = this.h;
        if (mediaPlayControlContext != null && mediaPlayControlContext.getNetSpeed() > 2000 && !TextUtils.isEmpty(this.h.getVideoUrl()) && !this.h.getVideoUrl().contains(".m3u8") && !this.h.getVideoUrl().contains("artp") && !this.h.getVideoUrl().contains("artc") && this.h.mTBLive && this.h.mMediaLiveInfo.mMediaConfigData != null && this.h.mMediaLiveInfo.mMediaConfigData.getplayBuffer(this.h.getFrom()) > 0) {
            MediaPlayControlContext mediaPlayControlContext2 = this.h;
            mediaPlayControlContext2.setAvdataBufferedMaxMBytes(mediaPlayControlContext2.mMediaLiveInfo.mMediaConfigData.getplayBuffer(this.h.getFrom()));
        }
        return true;
    }

    private void b(c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2a4edf", new Object[]{this, cVar});
            return;
        }
        this.g = true;
        int i = Integer.MAX_VALUE;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        String a2 = com.taobao.taobaoavsdk.util.f.a(MediaAdapteManager.mMediaNetworkUtilsAdapter, this.h.mContext);
        if (MediaAdapteManager.mMeasureAdapter != null) {
            i = MediaAdapteManager.mMeasureAdapter.getNetSpeedValue();
            if (this.h != null && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "videoDeviceScoreEnable", "false"))) {
                booleanValue = ((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).isLowPerformanceByAB(this.h);
                ((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).addLowDeviceExpInfo(this.h);
            }
            this.h.setLowPerformance(booleanValue);
            this.h.setDevicePerformanceLevel(booleanValue ? "low" : "high");
            this.h.setNetSpeed(i);
            this.h.setNetWorkQuality(com.taobao.taobaoavsdk.util.f.c());
            this.h.setGlobalCurrentBandWidth(com.taobao.taobaoavsdk.util.f.d());
            this.h.setGlobalPredictBandWidth(com.taobao.taobaoavsdk.util.f.e());
        }
        i();
        m();
        this.h.setH265(this.N);
        if (this.h.getMediaInfoParams() == null) {
            cVar.a(false, "");
            this.g = false;
            return;
        }
        this.h.setH265(TaobaoMediaPlayer.isDecoderLoaded() ? this.N : false);
        int a3 = a(a2, i, booleanValue);
        if (!this.h.mHighPerformancePlayer || !this.h.mBackgroundMode) {
            z = false;
        }
        a(cVar, this.h.isH265(), a3, z);
    }

    private void c(c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77a3360", new Object[]{this, cVar});
            return;
        }
        this.g = true;
        int i = Integer.MAX_VALUE;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        String a2 = com.taobao.taobaoavsdk.util.f.a(MediaAdapteManager.mMediaNetworkUtilsAdapter, this.h.mContext);
        if (MediaAdapteManager.mMeasureAdapter != null) {
            i = MediaAdapteManager.mMeasureAdapter.getNetSpeedValue();
            if (this.h != null && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "videoDeviceScoreEnable", "false"))) {
                booleanValue = ((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).isLowPerformanceByAB(this.h);
                ((MediaMeasureAdapter) MediaAdapteManager.mMeasureAdapter).addLowDeviceExpInfo(this.h);
            }
            this.h.setLowPerformance(booleanValue);
            this.h.setDevicePerformanceLevel(booleanValue ? "low" : "high");
            this.h.setNetSpeed(i);
            if (!this.h.mTBLive) {
                this.h.setNetWorkQuality(com.taobao.taobaoavsdk.util.f.c());
                this.h.setGlobalCurrentBandWidth(com.taobao.taobaoavsdk.util.f.d());
                this.h.setGlobalPredictBandWidth(com.taobao.taobaoavsdk.util.f.e());
            }
        }
        i();
        m();
        this.h.setH265(this.N);
        if (this.h.mTBLive && this.h.mMediaLiveInfo == null) {
            cVar.a(false, "");
            this.g = false;
            return;
        }
        int a3 = a(a2, i, booleanValue);
        if (this.h.mTBLive && this.h.mMediaLiveInfo != null) {
            if (!l() || a() == 0) {
                a(cVar, this.h.isH265(), a3);
                return;
            } else if (b(cVar, this.h.isH265(), a3)) {
                AVSDKLog.d("MediaPlayControlManager", "succ to pick sub_ " + a());
                return;
            } else {
                AVSDKLog.d("MediaPlayControlManager", "failed to pick sub " + a() + ", fallback to default");
                a(cVar, this.h.isH265(), a3);
                return;
            }
        }
        this.h.setH265(TaobaoMediaPlayer.isDecoderLoaded() ? this.N : false);
        if (!this.h.mHighPerformancePlayer || !this.h.mBackgroundMode) {
            z = false;
        }
        b(cVar, this.h.isH265(), a3, z);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.h.getPlayerType() != 2 && MediaAdapteManager.mConfigAdapter != null && this.h.mConfigGroup != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265Enable", "true"))) {
            z = true;
        }
        this.N = z;
    }

    private void a(com.taobao.mediaplay.model.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a40ac4", new Object[]{this, cVar});
        } else if (!"false".equals(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_DISABLE_AUDIO_GAIN, "false"))) {
        } else {
            this.h.setAudioGainEnble(true);
            this.h.setAudioGainCoef(cVar.k());
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        h();
        this.h.setHardwareHevc(true);
        if (MediaAdapteManager.mConfigAdapter == null) {
            return;
        }
        if (com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H265_BLACKLIST_POLICY, "true"))) {
            j();
        } else {
            k();
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (this.N && MediaAdapteManager.mConfigAdapter != null) {
            boolean a2 = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
            if (Build.VERSION.SDK_INT >= 21) {
                String config = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BLACK, MediaConstant.DEFAULT_H265_HW_DECODE_BLACK_LIST_NEW);
                String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_AUTHEN_BIZCODE_BLACK, "[\"WEITAO\"]");
                boolean b = com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config);
                boolean isEmpty = TextUtils.isEmpty(this.h.getFrom());
                boolean z = Build.VERSION.SDK_INT < 23 && com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config2);
                if (b || ((isEmpty && a2) || z)) {
                    this.h.setHardwareHevc(false);
                } else {
                    this.h.setHardwareHevc(true);
                }
                boolean z2 = Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23 && this.h.mTBLive;
                boolean z3 = MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "useHardwareForL", "false"));
                if (z2 && z3) {
                    String config3 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BLACK_FOR_L, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO A59\",\"vivo X9\",\"OPPO R9tm\",\"OPPO R9sk\"]");
                    String config4 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BIZCODE_BLACK_FOR_L, "");
                    boolean b2 = com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config3);
                    boolean b3 = com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config4);
                    if (b2 || ((isEmpty && a2) || b3)) {
                        this.h.setHardwareHevc(false);
                    } else {
                        this.h.setHardwareHevc(true);
                    }
                }
                if (!this.h.isHardwareHevc()) {
                    this.N = MediaDeviceUtils.isSupportH265(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265MaxFreq", "1.8"));
                }
            }
            if (!this.N && this.h.mTBLive && MediaAdapteManager.mConfigAdapter != null) {
                this.N = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "lowDeviceH265Enable", "true"));
                String config5 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_LIVE_HARDWARE_HEVC_BLACK, "");
                if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config5) || com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), config5)) {
                    this.N = false;
                }
                if (this.N && "low".equals(this.h.getDevicePerformanceLevel())) {
                    this.h.mDropFrameForH265 = true;
                }
            }
        }
        this.h.setH265AuthenStrategy(H265AuthenStrategy.BLACKLIST);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.N) {
            if (Build.VERSION.SDK_INT >= 21 && MediaAdapteManager.mConfigAdapter != null) {
                boolean a2 = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
                this.h.setHardwareHevc(((Build.VERSION.SDK_INT >= 23 && this.h.mTBLive) || (Build.VERSION.SDK_INT >= 21 && !this.h.mTBLive)) && com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265HardwareDecodeWhiteList2", "")));
                boolean isEmpty = TextUtils.isEmpty(this.h.getFrom());
                if (this.h.isHardwareHevc()) {
                    String config = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265HardwareDecodeBlackList2", "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
                    String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265HardwareDecodeBlackBizCodeList2", "[\"WEITAO\"]");
                    boolean b = com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config);
                    boolean z = Build.VERSION.SDK_INT < 23 && com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config2);
                    if (b || ((isEmpty && a2) || z)) {
                        this.h.setHardwareHevc(false);
                    }
                }
                boolean z2 = Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23 && this.h.mTBLive;
                boolean z3 = MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "useHardwareForL", "false"));
                if (z2 && z3) {
                    this.h.setHardwareHevc(com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_WHITE_FOR_L, "")));
                    if (this.h.isHardwareHevc()) {
                        String config3 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BLACK_FOR_L, "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO A59\",\"vivo X9\",\"OPPO R9tm\",\"OPPO R9sk\"]");
                        String config4 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_HEVC_BIZCODE_BLACK_FOR_L, "");
                        boolean b2 = com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config3);
                        boolean z4 = Build.VERSION.SDK_INT < 23 && com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config4);
                        if (b2 || ((isEmpty && a2) || z4)) {
                            this.h.setHardwareHevc(false);
                        }
                    }
                }
                if (!this.h.isHardwareHevc()) {
                    this.N = MediaDeviceUtils.isSupportH265(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h265MaxFreq", "1.8"));
                }
            }
            if (!this.N && this.h.mTBLive && MediaAdapteManager.mConfigAdapter != null) {
                this.N = com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "lowDeviceH265Enable", "true"));
                String config5 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_LIVE_HARDWARE_HEVC_BLACK, "");
                if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config5) || com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), config5)) {
                    this.N = false;
                }
                if (this.N && "low".equals(this.h.getDevicePerformanceLevel())) {
                    this.h.mDropFrameForH265 = true;
                }
            }
        }
        this.h.setH265AuthenStrategy(H265AuthenStrategy.WHITLIST);
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_PC_UNIT, "false"));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (MediaAdapteManager.mConfigAdapter == null) {
        } else {
            if (com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H264_BLACKLIST_POLICY, "true"))) {
                n();
            } else {
                o();
            }
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        boolean z2 = MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
        boolean z3 = !TextUtils.isEmpty(this.h.getFrom());
        if (((Build.VERSION.SDK_INT >= 23 && this.h.mTBLive) || (Build.VERSION.SDK_INT >= 21 && !this.h.mTBLive)) && MediaAdapteManager.mConfigAdapter != null) {
            String config = MediaAdapteManager.mConfigAdapter.getConfig("", "h264HardwareDecodeBlackList", "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            String config2 = MediaAdapteManager.mConfigAdapter.getConfig("", "h264HardwareDecodeBlackBizCodeList", "[\"WEITAO\"]");
            boolean z4 = !com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config);
            boolean z5 = Build.VERSION.SDK_INT >= 23 || !com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config2);
            if (z4 && ((z3 || !z2) && z5)) {
                this.h.setHardwareAvc(Boolean.TRUE.booleanValue());
            }
            if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config) || !z5) {
                this.h.setHardwareAvc(Boolean.FALSE.booleanValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23 && this.h.mTBLive && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("", "useHardwareForL", "false"))) {
            String config3 = MediaAdapteManager.mConfigAdapter.getConfig("", MediaConstant.ORANGE_HARDWARE_H264_BLACK_FOR_L, "");
            String config4 = MediaAdapteManager.mConfigAdapter.getConfig("", MediaConstant.ORANGE_HARDWARE_H264_BIZCODE_BLACK_FOR_L, "");
            boolean z6 = !com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config3);
            if (!TextUtils.isEmpty(this.h.getFrom()) && (Build.VERSION.SDK_INT >= 23 || !com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config4))) {
                z = true;
            }
            if (z6 && ((z3 || !z2) && z)) {
                this.h.setHardwareAvc(Boolean.TRUE.booleanValue());
            }
            if (com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config3) || !z) {
                this.h.setHardwareAvc(Boolean.FALSE.booleanValue());
            }
        }
        this.h.setH264AuthenStrategy(H264AuthenStrategy.BLACKLIST);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        boolean z2 = MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_DISABLE_SET_HW_DECODER_FROM_BLACKLIST, "false"));
        boolean z3 = !TextUtils.isEmpty(this.h.getFrom());
        if (((Build.VERSION.SDK_INT >= 23 && this.h.mTBLive) || (Build.VERSION.SDK_INT >= 21 && !this.h.mTBLive)) && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h264HardwareDecodeWhiteList", ""))) {
            String config = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h264HardwareDecodeBlackList", "[\"m1 note\",\"PRO 7 Plus\",\"PRO 7-H\",\"OPPO A73\",\"OPPO R9tm\",\"OPPO R9sk\",\"Redmi Note 4X\" , \"JMM-AL00\", \"JMM-AL10\", \"m3 note\", \"M5 Note\", \"MEIZU M6\", \"MI NOTE LTE\", \"OPPO A37m\", \"OPPO A59m\", \"OPPO A59s\", \"OPPO A59st\", \"OPPO A59t\", \"OPPO R9km\", \"OPPO R9m\", \"OPPO R9t\", \"Redmi 6A\", \"vivi Y67\", \"vivi Y67A\", \"vivo V3M A\", \"vivo X6D\", \"vivo X6L\", \"vivo X6Plus L\", \"vivo Y67\", \"vivo Y67\", \"vivo Y67L\", \"vivo Y69A\", \"vivo Y67A\"]");
            String config2 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "h264HardwareDecodeBlackBizCodeList", "[\"WEITAO\"]");
            boolean z4 = !com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config);
            boolean z5 = Build.VERSION.SDK_INT >= 23 || !com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config2);
            if (z4 && ((z3 || !z2) && z5)) {
                this.h.setHardwareAvc(Boolean.TRUE.booleanValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23 && this.h.mTBLive && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("MediaLive", "useHardwareForL", "false")) && com.taobao.taobaoavsdk.util.b.b(com.taobao.taobaoavsdk.util.b.a(), MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_WHITE_FOR_L, ""))) {
            String config3 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_BLACK_FOR_L, "");
            String config4 = MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_HARDWARE_H264_BIZCODE_BLACK_FOR_L, "");
            boolean z6 = !com.taobao.taobaoavsdk.util.b.b(Build.MODEL, config3);
            if (Build.VERSION.SDK_INT >= 23 || !com.taobao.taobaoavsdk.util.b.b(this.h.getFrom(), config4)) {
                z = true;
            }
            if (z6 && ((z3 || !z2) && z)) {
                this.h.setHardwareAvc(Boolean.TRUE.booleanValue());
            }
        }
        this.h.setH264AuthenStrategy(H264AuthenStrategy.WHITLIST);
    }

    private void b(com.taobao.mediaplay.model.c cVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7cca85", new Object[]{this, cVar});
            return;
        }
        this.B = cVar.i();
        String videoDefinition = this.h.getVideoDefinition();
        String str = "";
        if (videoDefinition != null) {
            while (true) {
                String[] strArr = this.x;
                if (i >= strArr.length) {
                    break;
                } else if (videoDefinition.contains(strArr[i])) {
                    str = str + this.x[i];
                    break;
                } else {
                    i++;
                }
            }
            if (videoDefinition.contains("265")) {
                str = str + "_265";
            }
        }
        this.C = cVar.a(str);
    }

    private void a(c cVar, boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77edfee7", new Object[]{this, cVar, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        this.h.setRateAdaptePriority(a(i, z2));
        if (!this.h.mLocalVideo && TextUtils.isEmpty(this.h.getVideoToken())) {
            this.h.setVideoUrl("");
            this.h.setVideoDefinition("");
            this.h.setPlayableBytes(0);
        }
        if (this.h.getMediaInfoParams() != null) {
            if (!TextUtils.isEmpty(this.h.getVideoToken())) {
                this.g = false;
                cVar.a(true, "");
                return;
            }
            com.taobao.mediaplay.model.c cVar2 = new com.taobao.mediaplay.model.c(this.h.getMediaInfoParams());
            this.h.setUseTBNet(p());
            int b = com.taobao.taobaoavsdk.util.b.b(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.ORANGE_PC_CLOUD_SIGNATURE_CHECK_TYPE, "1"));
            if (b > 0) {
                this.d = cVar2.n() ? 1 : 0;
            }
            if (this.d == 0) {
                if (b == 2) {
                    this.h.setVideoUrl("");
                    cVar.a(true, "4002");
                    return;
                } else if (b == 3) {
                    this.e = "4002";
                }
            }
            if (cVar2.d() && this.h.mEnableVodABRbyOrange) {
                a(cVar2, this.h, cVar2.a(), cVar2.b(), z, i);
            } else {
                b(cVar2, this.h, cVar2.a(), cVar2.b(), z, i);
            }
            a(cVar2, this.h.getCurrentBitRate());
            b(cVar2);
            a(cVar2);
            this.h.setForceMuteMode(cVar2.m());
            this.g = false;
            cVar.a(true, this.e);
            return;
        }
        MediaPlayControlContext mediaPlayControlContext = this.h;
        if (mediaPlayControlContext != null) {
            com.taobao.taobaoavsdk.util.c.c(mediaPlayControlContext.mTLogAdapter, "parseAndPickVideoUrl.onError## mediaInfoParam is empty");
        }
        b(cVar, z, i, z2);
    }

    private void b(final c cVar, final boolean z, final int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3ec6", new Object[]{this, cVar, new Boolean(z), new Integer(i), new Boolean(z2)});
            return;
        }
        this.h.setRateAdaptePriority(a(i, z2));
        if (!this.h.mLocalVideo && TextUtils.isEmpty(this.h.getVideoToken())) {
            this.h.setVideoUrl("");
            this.h.setVideoDefinition("");
            this.h.setPlayableBytes(0);
        }
        this.y = System.currentTimeMillis();
        this.h.mTBVideoSourceAdapter.a(new mka() { // from class: com.taobao.mediaplay.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mka
            public void a(MediaVideoResponse mediaVideoResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad227df1", new Object[]{this, mediaVideoResponse});
                    return;
                }
                g.a(g.this, System.currentTimeMillis());
                if (mediaVideoResponse != null && mediaVideoResponse.data != null) {
                    if (!TextUtils.isEmpty(g.a(g.this).getVideoToken())) {
                        g.a(g.this, false);
                        cVar.a(true, "");
                        return;
                    }
                    if (g.b(g.this) && g.c(g.this)) {
                        h.a(g.a(g.this).mVideoId, mediaVideoResponse.data);
                    }
                    com.taobao.mediaplay.model.c cVar2 = new com.taobao.mediaplay.model.c(mediaVideoResponse.data);
                    g.a(g.this).setUseTBNet(g.d(g.this));
                    if (cVar2.d() && g.a(g.this).mEnableVodABRbyOrange) {
                        g gVar = g.this;
                        g.a(gVar, cVar2, g.a(gVar), cVar2.a(), cVar2.b(), z, i);
                    } else {
                        g gVar2 = g.this;
                        g.b(gVar2, cVar2, g.a(gVar2), cVar2.a(), cVar2.b(), z, i);
                    }
                    g gVar3 = g.this;
                    g.a(gVar3, cVar2, g.a(gVar3).getCurrentBitRate());
                    g.a(g.this, cVar2);
                    g.b(g.this, cVar2);
                    g.a(g.this).setForceMuteMode(cVar2.m());
                } else if (g.a(g.this) != null) {
                    g.a(g.this, -1);
                    com.taobao.taobaoavsdk.util.c.c(g.a(g.this).mTLogAdapter, "pickTBVideoUrl.onSuccess##Response no data");
                }
                if (g.a(g.this) != null) {
                    ddg ddgVar = g.a(g.this).mTLogAdapter;
                    com.taobao.taobaoavsdk.util.c.a(ddgVar, "pickTBVideoUrl.onSuccess##UseH265:" + z + " videoUrl:" + g.a(g.this).getVideoUrl() + " BackupVideoUrl:" + g.a(g.this).getBackupVideoUrl() + " playerType:" + g.a(g.this).getPlayerType());
                }
                g.a(g.this, false);
                cVar.a(true, "");
            }

            @Override // tb.mka
            public void b(MediaVideoResponse mediaVideoResponse) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dafb1850", new Object[]{this, mediaVideoResponse});
                    return;
                }
                g.a(g.this, -2);
                if (g.a(g.this) != null) {
                    ddg ddgVar = g.a(g.this).mTLogAdapter;
                    if (("pickTBVideoUrl.onError##Response msg:" + mediaVideoResponse) == null) {
                        str = null;
                    } else {
                        str = mediaVideoResponse.errorMsg + "code:" + mediaVideoResponse.errorCode;
                    }
                    com.taobao.taobaoavsdk.util.c.c(ddgVar, str);
                }
                g.a(g.this, false);
                cVar.a(true, mediaVideoResponse.errorCode);
            }
        });
    }

    private void a(MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.a> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ffa8e2", new Object[]{this, mediaPlayControlContext, map, str, str2});
        } else if (TextUtils.isEmpty(str) || map == null || map.get(str) == null) {
        } else {
            String a2 = map.get(str).a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            String b = oyw.b(mediaPlayControlContext.mContext, a2);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            mediaPlayControlContext.setHighCachePath(b);
            mediaPlayControlContext.mHighVideoDefinition = str2;
        }
    }

    private void a(com.taobao.mediaplay.model.c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bddb57c", new Object[]{this, cVar, new Float(f)});
        } else if (cVar == null || this.h == null) {
        } else {
            int g = cVar.g();
            if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, MediaConstant.BUFFER_CONTROLLER_ENABLE, "false")) && this.h.getNetSpeed() >= 3.0f * f && f > 10.0f && cVar.e() > 0 && cVar.f() > cVar.e()) {
                g = cVar.e() * ((int) (g / cVar.f()));
            }
            this.h.setMaxLevel(cVar.f());
            this.h.setCurrentLevel(cVar.e());
            this.h.setAvdataBufferedMaxMBytes(g);
            this.h.setAvdataBufferedMaxTime(cVar.h());
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(ado.URL_SEPARATOR)) {
            return str;
        }
        return "http:" + str;
    }

    private boolean a(MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.b> map, List<String> list) {
        String str;
        String str2;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786473c3", new Object[]{this, mediaPlayControlContext, map, list})).booleanValue();
        }
        String str3 = null;
        String str4 = null;
        com.taobao.mediaplay.model.b bVar = null;
        String str5 = null;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                str = null;
                str2 = null;
                i = 0;
                i2 = -1;
                break;
            }
            str5 = list.get(i3);
            if (str5 != null && !str5.isEmpty() && (bVar = map.get(str5)) != null && !TextUtils.isEmpty(bVar.a())) {
                str3 = bVar.a();
                str = bVar.c();
                str2 = O.get(str5);
                i = bVar.e();
                i2 = bVar.d();
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "the chosen DWVideoDefinition=" + bVar.g());
                str4 = str5;
                break;
            }
            i3++;
            str4 = str5;
        }
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str3)) {
            mediaPlayControlContext.setVideoUrl(a(str3));
            if (str5.contains("266")) {
                mediaPlayControlContext.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H266, str2));
            } else if (str5.contains("265")) {
                mediaPlayControlContext.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h265", str2));
                mediaPlayControlContext.setH265(true);
            } else {
                mediaPlayControlContext.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str4));
            }
            mediaPlayControlContext.setCacheKey(str);
            mediaPlayControlContext.setCurrentBitRate(i);
            mediaPlayControlContext.setVideoLength(i2);
            mediaPlayControlContext.setPlayableBytes(bVar.f());
            return true;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setDefinitionPriorityAdapterUrl failed with priority=" + str5 + ",videoUrl=" + str3);
        return false;
    }

    public double c() {
        ArrayList<Double> m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue();
        }
        this.G = d();
        ArrayList<Double> p = oyu.p();
        ArrayList<Double> l = oyu.l();
        ArrayList<Double> n = oyu.n();
        if (oyu.s) {
            m = oyu.o();
        } else {
            m = oyu.m();
        }
        if (l != null && m != null && n != null && l.size() > 0) {
            int size = l.size() - 1;
            double doubleValue = ((l.get(size).doubleValue() / 1000.0d) / Math.max(oyu.s ? m.get(size).doubleValue() + n.get(size).doubleValue() : m.get(size).doubleValue() - n.get(size).doubleValue(), 1.0d)) * 8.0d * 1000.0d;
            oyu.a(this.G, (p == null || p.size() == 0) ? 0.0d : Math.abs(doubleValue - p.get(p.size() - 1).doubleValue()) / (doubleValue + 1.0E-4d));
            ArrayList<Double> q = oyu.q();
            if (q != null && q.size() > 0) {
                double d = Double.MIN_VALUE;
                for (int max = Math.max(0, q.size() - 5); max < q.size(); max++) {
                    double doubleValue2 = q.get(max).doubleValue();
                    if (doubleValue2 > d) {
                        d = doubleValue2;
                    }
                }
                double d2 = this.G * (1.0d / (d + 1.0d));
                if (Double.compare(d2, mto.a.GEO_NOT_SUPPORT) != 0) {
                    this.F = 2;
                    return d2;
                }
            }
        }
        return this.G;
    }

    public double d() {
        ArrayList<Double> m;
        double max;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2d9", new Object[]{this})).doubleValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Double> l = oyu.l();
        ArrayList<Double> n = oyu.n();
        if (oyu.s) {
            m = oyu.o();
        } else {
            m = oyu.m();
        }
        double netSpeed = this.h.getNetSpeed();
        if (l != null && m != null && n != null) {
            for (int i = 0; i < l.size(); i++) {
                double doubleValue = l.get(i).doubleValue() / 1000.0d;
                double doubleValue2 = m.get(i).doubleValue();
                double doubleValue3 = n.get(i).doubleValue();
                double max2 = Math.max(doubleValue2, 1.0d);
                if (oyu.s) {
                    max = Math.max(max2 + doubleValue3, 1.0d);
                } else {
                    max = Math.max(max2 - doubleValue3, 1.0d);
                }
                arrayList.add(Double.valueOf((doubleValue / (max / 1000.0d)) * 8.0d * 1000.0d * doubleValue));
            }
            double d = 0.0d;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d += ((Double) arrayList.get(i2)).doubleValue();
            }
            Iterator<Double> it = l.iterator();
            double d2 = 0.0d;
            while (it.hasNext()) {
                d2 += it.next().doubleValue();
            }
            if (this.h.mCheckInvalidCalBitRateByAB) {
                double max3 = d / Math.max(d2, 1.0d);
                if (Double.compare(max3, mto.a.GEO_NOT_SUPPORT) != 0 && max3 > netSpeed) {
                    this.F = 0;
                    return max3;
                }
            } else {
                this.F = 0;
                return d / Math.max(d2, 1.0d);
            }
        }
        this.F = 1;
        return netSpeed;
    }

    private String a(boolean z, Map<String, Integer> map, double d) {
        double d2;
        String str;
        boolean z2;
        Iterator<Map.Entry<String, Integer>> it;
        boolean z3 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f29b867b", new Object[]{this, new Boolean(z3), map, new Double(d)});
        }
        if (oyu.r) {
            this.H = c() * d;
            d2 = this.H;
        } else {
            this.G = d() * d;
            d2 = this.G;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getSelectedDefinitionByBitratePolicy bitRateMap=" + map.toString());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if ("ud_265".equals(entry.getKey())) {
                this.b = entry.getValue().intValue();
            } else if (MediaConstant.DEFINITION_UD_H266.equals(entry.getKey())) {
                this.W = entry.getValue().intValue();
            } else if ("hd_265".equals(entry.getKey())) {
                this.c = entry.getValue().intValue();
            } else if ("hd".equals(entry.getKey())) {
                this.V = entry.getValue().intValue();
            } else if (MediaConstant.DEFINITION_HD_H266.equals(entry.getKey())) {
                this.X = entry.getValue().intValue();
            }
        }
        if (!z3 || !map.containsKey(MediaConstant.DEFINITION_UD_H266)) {
            str = "";
        } else {
            this.h.selecte266ToPlay();
            str = MediaConstant.DEFINITION_UD_H266;
        }
        if (TextUtils.isEmpty(str)) {
            Iterator<Map.Entry<String, Integer>> it2 = map.entrySet().iterator();
            double d3 = Double.MAX_VALUE;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it2.next();
                if (z3 || !MediaConstant.DEFINITION_UD_H266.equals(next.getKey())) {
                    double intValue = d2 - next.getValue().intValue();
                    if (this.h.mEnableUdFirstWhenNetSatisfied && intValue >= mto.a.GEO_NOT_SUPPORT && next.getKey() != null && next.getKey().contains("ud")) {
                        str = next.getKey();
                        break;
                    } else if (d3 > intValue && intValue >= mto.a.GEO_NOT_SUPPORT && next.getKey() != null && next.getKey().contains("265")) {
                        str = next.getKey();
                        d3 = intValue;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            Iterator<Map.Entry<String, Integer>> it3 = map.entrySet().iterator();
            double d4 = Double.MAX_VALUE;
            z2 = false;
            while (it3.hasNext()) {
                Map.Entry<String, Integer> next2 = it3.next();
                if (z3 || !MediaConstant.DEFINITION_UD_H266.equals(next2.getKey())) {
                    it = it3;
                    double intValue2 = next2.getValue().intValue();
                    if (intValue2 < d4 && intValue2 > mto.a.GEO_NOT_SUPPORT && !TextUtils.isEmpty(next2.getKey()) && next2.getKey() != "null") {
                        str = next2.getKey();
                        d4 = intValue2;
                        z2 = true;
                    } else {
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getSelectedDefinitionByBitratePolicy failed with currBitRate=" + intValue2 + ",minBitRate=" + d4 + ",entry.getKey()=" + next2.getKey());
                    }
                } else {
                    it = it3;
                }
                z3 = z;
                it3 = it;
            }
            if (!TextUtils.isEmpty(str) && !str.contains("ud")) {
                this.f18020a = 1;
            }
        } else {
            if (!str.contains("ud")) {
                if (Double.compare(this.b, -1.0d) == 0) {
                    this.f18020a = 3;
                } else {
                    int i = this.b;
                    if (i < this.c) {
                        this.f18020a = 2;
                    } else if (d2 < i) {
                        z2 = false;
                        this.f18020a = 0;
                    }
                }
            }
            z2 = false;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getSelectedDefinitionByBitratePolicy speedEst=" + d2 + ",selectedDefinition=" + str + ",selectWithLowNetspeed=" + z2);
        return str;
    }

    private void a(com.taobao.mediaplay.model.c cVar, MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.b> map, Map<String, com.taobao.mediaplay.model.a> map2, boolean z, int i) {
        String[][] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f28942", new Object[]{this, cVar, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else if (map == null || map.size() == 0 || mediaPlayControlContext == null) {
            if (mediaPlayControlContext != null) {
                com.taobao.taobaoavsdk.util.c.c(this.h.mTLogAdapter, "pickTBVideoUrl.setVideoUrlByNewNetPolicy##VideoDefinitionMap empty");
            }
            this.E = 0;
        } else {
            this.h.initVodSelectPolicyABIfNeed();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getIn setVideoUrlByNewNetPolicy with cacheFirst=" + this.h.mEnableCacheFirstByAB + ", qualityFirst=" + this.h.mEnableQualityFirstByAB);
            if (!TextUtils.isEmpty(this.h.mVideoId) && l.a().b(this.h.mVideoId)) {
                Map<String, String> a2 = l.a().a(this.h.mVideoId);
                this.J = a2.get("videoDefinition");
                if (this.h.mEnableCacheFirstByAB) {
                    if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_UPDATE_URL_WHEN_PLAY_AFTER_PREDOWNLOAD, "true"))) {
                        String str = a2.get("cacheKey");
                        String str2 = a2.get("url");
                        this.U = oyu.a(mediaPlayControlContext.mContext, str, str2);
                        if (!TextUtils.isEmpty(str) && cVar.o() != null) {
                            String str3 = cVar.o().get(str);
                            if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, str2)) {
                                mediaPlayControlContext.setVideoUrl(str3);
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrlByNewNetPolicy: use new url=" + mediaPlayControlContext.getVideoUrl() + " insteadOf cacheUrl=" + a2.get("url") + "when getCache.");
                            }
                        }
                        if (TextUtils.isEmpty(mediaPlayControlContext.getVideoUrl())) {
                            mediaPlayControlContext.setVideoUrl(str2);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrlByNewNetPolicy: getUrl From New MediaInfo failed, set url in cache, url=" + mediaPlayControlContext.getVideoUrl());
                        }
                    } else {
                        mediaPlayControlContext.setVideoUrl(a2.get("url"));
                    }
                    mediaPlayControlContext.setVideoDefinition(a2.get("videoDefinition"));
                    mediaPlayControlContext.setCacheKey(a2.get("cacheKey"));
                    mediaPlayControlContext.setCurrentBitRate(Integer.parseInt(a2.get("bitrate")));
                    mediaPlayControlContext.setVideoLength(Integer.parseInt(a2.get(com.taobao.android.weex_framework.util.a.ATOM_length)));
                    this.L = a2.get("selectReason");
                    this.E = 1;
                    this.K = a2.get("bitRateMap");
                    this.G = Double.valueOf(a2.get("calNetSpeed")).doubleValue();
                    this.H = Double.valueOf(a2.get("calNetSpeedByRobust")).doubleValue();
                    this.F = Integer.parseInt(a2.get("calNetSpeedReason"));
                    this.f18020a = Integer.parseInt(a2.get("defDegradeReason"));
                    this.b = Integer.parseInt(a2.get("ud265BitRate"));
                    this.c = Integer.parseInt(a2.get("hd265BitRate"));
                    this.W = Integer.parseInt(a2.get("ud266BitRate"));
                    this.X = Integer.parseInt(a2.get("hd266BitRate"));
                    this.V = Integer.parseInt(a2.get("hd264BitRate"));
                    if (com.taobao.taobaoavsdk.util.b.a(a2.get("hasChooseS266"))) {
                        this.h.selecte266ToPlay();
                    }
                    mediaPlayControlContext.mSelectReasonForPreDownload = 1;
                    return;
                }
            }
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_LOCAL_FILE_PLAY_FIRST_AT_NEW_SELECT_POLICY, "true")) && oyu.W && cVar != null && cVar.o() != null) {
                for (Map.Entry<String, String> entry : cVar.o().entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    this.U = oyu.a(mediaPlayControlContext.mContext, key, value);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrlByNewNetPolicy: mCacheLengthAtSelect=" + this.U + ", ApplicationUtils.mMinLengthToUseCache=" + (oyu.aF << 10));
                    if (this.U > (oyu.aF << 10)) {
                        mediaPlayControlContext.setVideoUrl(value);
                        mediaPlayControlContext.setCacheKey(key);
                        if (cVar.p() != null) {
                            String str4 = cVar.p().get(key);
                            if (!TextUtils.isEmpty(str4)) {
                                mediaPlayControlContext.setVideoDefinition(str4);
                                com.taobao.mediaplay.model.b bVar = map.get(str4);
                                if (bVar != null && !TextUtils.isEmpty(bVar.a())) {
                                    mediaPlayControlContext.setCurrentBitRate(bVar.e());
                                    mediaPlayControlContext.setVideoLength(bVar.d());
                                    this.E = 11;
                                    mediaPlayControlContext.mSelectReasonForPreDownload = 11;
                                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrlByNewNetPolicy: select definition=" + str4 + " by hit the local file cache. Select and return.");
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (Boolean.valueOf(com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H264_BY_CODEC_LIST, "true"))).booleanValue() && (!oyu.s() || oyu.t() || oyu.n)) {
                if (!oyu.s()) {
                    mediaPlayControlContext.mSelectReasonForPreDownload = 10;
                    this.E = 10;
                } else if (oyu.t()) {
                    mediaPlayControlContext.mSelectReasonForPreDownload = 3;
                    this.E = 3;
                } else if (oyu.n) {
                    mediaPlayControlContext.mSelectReasonForPreDownload = 9;
                    this.E = 9;
                }
                a(mediaPlayControlContext, map, false, i);
                a(mediaPlayControlContext, map2);
                return;
            }
            boolean u = u();
            if (cVar.c() != null) {
                this.I = a(u, cVar.c(), this.h.mBetaForVodSelect);
                this.K = cVar.c().toString();
                mediaPlayControlContext.mBitRateMapStr = this.K;
                mediaPlayControlContext.mNetSpeedForPreDownload = this.G;
                mediaPlayControlContext.mNetSpeedByRobustAtPreDL = this.H;
                mediaPlayControlContext.mNetSpeedCalReasonForPreDL = this.F;
                mediaPlayControlContext.mDefDegradeReason = this.f18020a;
                mediaPlayControlContext.mUD265BitRate = this.b;
                mediaPlayControlContext.mHD265BitRate = this.c;
                mediaPlayControlContext.mUD266BitRate = this.W;
                mediaPlayControlContext.mHD266BitRate = this.X;
                mediaPlayControlContext.mHD264BitRate = this.V;
            }
            ArrayList arrayList = new ArrayList();
            if (this.h.mEnableQualityFirstByAB && !this.J.equals("") && !this.I.equals("") && !this.I.equals(this.J)) {
                if (u && (MediaConstant.DEFINITION_UD_H266.equals(this.J) || MediaConstant.DEFINITION_UD_H266.equals(this.I))) {
                    strArr = this.T;
                } else {
                    strArr = this.m;
                    this.h.unselectS266OfPlay();
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    for (int i3 = 0; i3 < strArr[i2].length; i3++) {
                        if (strArr[i2][i3].equals(this.I) || strArr[i2][i3].equals(this.J)) {
                            arrayList.add(strArr[i2][i3]);
                        }
                    }
                    if (arrayList.size() > 0) {
                        mediaPlayControlContext.mSelectReasonForPreDownload = 8;
                        this.E = 8;
                        break;
                    }
                    i2++;
                }
            } else {
                mediaPlayControlContext.mSelectReasonForPreDownload = 7;
                this.E = 7;
                arrayList.add(this.I);
            }
            boolean a3 = a(mediaPlayControlContext, map, arrayList);
            a(mediaPlayControlContext, map2);
            if (a3) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setDefinitionPriorityAdapterUrl success and return.");
                if (!mediaPlayControlContext.getVideoDefinition().contains("266")) {
                    this.h.unselectS266OfPlay();
                }
                a(mediaPlayControlContext, map, true, i);
                return;
            }
            if (z) {
                a(mediaPlayControlContext, map, i);
                a(mediaPlayControlContext, map2);
                if (mediaPlayControlContext.isH265()) {
                    mediaPlayControlContext.mSelectReasonForPreDownload = 5;
                    this.E = 5;
                    a(mediaPlayControlContext, map, true, i);
                    return;
                }
            }
            a(mediaPlayControlContext, map, false, i);
            mediaPlayControlContext.mSelectReasonForPreDownload = 6;
            this.E = 6;
            a(mediaPlayControlContext, map2);
        }
    }

    private void b(com.taobao.mediaplay.model.c cVar, MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.b> map, Map<String, com.taobao.mediaplay.model.a> map2, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6b9b43", new Object[]{this, cVar, mediaPlayControlContext, map, map2, new Boolean(z), new Integer(i)});
        } else if (map == null || map.size() == 0 || mediaPlayControlContext == null) {
            if (mediaPlayControlContext != null) {
                com.taobao.taobaoavsdk.util.c.c(this.h.mTLogAdapter, "pickTBVideoUrl.setVideoUrl##VideoDefinitionMap empty");
            }
            this.D = 0;
        } else {
            if (!u() && map != null && map.size() > 0) {
                map.remove(MediaConstant.DEFINITION_UD_H266);
                map.remove(MediaConstant.DEFINITION_HD_H266);
                map.remove(MediaConstant.DEFINITION_SD_H266);
                map.remove(MediaConstant.DEFINITION_LD_H266);
            }
            if (!TextUtils.isEmpty(this.h.mVideoId) && l.a().b(this.h.mVideoId)) {
                Map<String, String> a2 = l.a().a(this.h.mVideoId);
                if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_UPDATE_URL_WHEN_PLAY_AFTER_PREDOWNLOAD, "true"))) {
                    String str = a2.get("cacheKey");
                    if (!TextUtils.isEmpty(str) && cVar.o() != null) {
                        String str2 = cVar.o().get(str);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, a2.get("url"))) {
                            mediaPlayControlContext.setVideoUrl(str2);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrl: use new url=" + mediaPlayControlContext.getVideoUrl() + " insteadOf cacheUrl=" + a2.get("url") + "when getCache.");
                        }
                    }
                    if (TextUtils.isEmpty(mediaPlayControlContext.getVideoUrl())) {
                        mediaPlayControlContext.setVideoUrl(a2.get("url"));
                        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setVideoUrl: getUrl From New MediaInfo failed, set url in cache, url=" + mediaPlayControlContext.getVideoUrl());
                    }
                } else {
                    mediaPlayControlContext.setVideoUrl(a2.get("url"));
                }
                mediaPlayControlContext.setVideoDefinition(a2.get("videoDefinition"));
                mediaPlayControlContext.setCacheKey(a2.get("cacheKey"));
                mediaPlayControlContext.setCurrentBitRate(Integer.parseInt(a2.get("bitrate")));
                mediaPlayControlContext.setVideoLength(Integer.parseInt(a2.get(com.taobao.android.weex_framework.util.a.ATOM_length)));
                this.D = 1;
            } else if (this.h.mHighPerformancePlayer && this.h.mBackgroundMode && b(mediaPlayControlContext, map)) {
                this.D = 2;
            } else {
                if (cVar.c() != null) {
                    this.K = cVar.c().toString();
                }
                if (Boolean.valueOf(com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_H264_BY_CODEC_LIST, "true"))).booleanValue() && (!oyu.s() || oyu.t())) {
                    this.D = 3;
                    a(mediaPlayControlContext, map, false, i);
                    a(mediaPlayControlContext, map2);
                    return;
                }
                if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_USE_SERVER_DEFINITIONPRIORITY, "false")) && cVar != null && cVar.j() != null && cVar.j().size() > 0) {
                    boolean a3 = a(mediaPlayControlContext, map, cVar.j());
                    a(mediaPlayControlContext, map2);
                    if (a3) {
                        this.D = 4;
                        a(mediaPlayControlContext, map, true, i);
                        return;
                    }
                }
                if (z) {
                    a(mediaPlayControlContext, map, i);
                    a(mediaPlayControlContext, map2);
                    if (mediaPlayControlContext.isH265()) {
                        this.D = 5;
                        a(mediaPlayControlContext, map, true, i);
                        return;
                    }
                }
                a(mediaPlayControlContext, map, false, i);
                this.D = 6;
                a(mediaPlayControlContext, map2);
            }
        }
    }

    private void a(MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.a> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8942ce", new Object[]{this, mediaPlayControlContext, map});
        } else if (TextUtils.isEmpty(this.h.getVideoDefinition())) {
        } else {
            if (mediaPlayControlContext.isH265()) {
                if (!com.taobao.taobaoavsdk.util.b.f("h265", "sd").equals(this.h.getVideoDefinition())) {
                    return;
                }
                a(mediaPlayControlContext, map, "hd_265", com.taobao.taobaoavsdk.util.b.f("h265", "hd"));
            } else if (com.taobao.taobaoavsdk.util.b.f("h264", "sd").equals(this.h.getVideoDefinition())) {
                a(mediaPlayControlContext, map, "hd", com.taobao.taobaoavsdk.util.b.f("h264", "hd"));
            } else if (!com.taobao.taobaoavsdk.util.b.f("h264", "ld").equals(this.h.getVideoDefinition())) {
            } else {
                a(mediaPlayControlContext, map, "hd", com.taobao.taobaoavsdk.util.b.f("h264", "hd"));
                if (!TextUtils.isEmpty(mediaPlayControlContext.getHighCachePath())) {
                    return;
                }
                a(mediaPlayControlContext, map, "sd", com.taobao.taobaoavsdk.util.b.f("h264", "sd"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.mediaplay.MediaPlayControlContext r10, java.util.Map<java.lang.String, com.taobao.mediaplay.model.b> r11, boolean r12, int r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.g.a(com.taobao.mediaplay.MediaPlayControlContext, java.util.Map, boolean, int):void");
    }

    private String a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f6ec727", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        String str = i != 1 ? i != 2 ? i != 4 ? "ld#sd#hd#ud" : "ud#hd#sd#ld" : "sd#ld#hd#ud" : "hd#sd#ld#ud";
        if (!z) {
            return str;
        }
        return "custom#" + str;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : (this.h == null || MediaAdapteManager.mConfigAdapter == null || MediaAdapteManager.mMeasureAdapter == null || MediaAdapteManager.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "tbNetEnable", "true"))) ? false : true;
    }

    private boolean b(MediaPlayControlContext mediaPlayControlContext, Map<String, com.taobao.mediaplay.model.b> map) {
        com.taobao.mediaplay.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b8caf1", new Object[]{this, mediaPlayControlContext, map})).booleanValue();
        }
        if (map == null || map.size() == 0 || (bVar = map.get("custom")) == null || TextUtils.isEmpty(bVar.a())) {
            return false;
        }
        mediaPlayControlContext.setVideoUrl(a(bVar.a()));
        mediaPlayControlContext.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", "custom"));
        mediaPlayControlContext.setCacheKey(bVar.c());
        mediaPlayControlContext.setCurrentBitRate(bVar.e());
        mediaPlayControlContext.setVideoLength(bVar.d());
        mediaPlayControlContext.setPlayableBytes(bVar.f());
        return true;
    }

    private boolean a(HashMap<String, Integer> hashMap, MediaLiveInfo mediaLiveInfo, boolean z, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("651a031b", new Object[]{this, hashMap, mediaLiveInfo, new Boolean(z), strArr})).booleanValue();
        }
        if (hashMap.size() == 0) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (hashMap.containsKey(strArr[i])) {
                int intValue = hashMap.get(strArr[i]).intValue();
                if (b(mediaLiveInfo.h265, mediaLiveInfo.liveUrlList.get(intValue), z && this.h.mH265Enable)) {
                    this.h.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(intValue), intValue);
                    return true;
                }
            }
        }
        return false;
    }

    private void a(MediaLiveInfo mediaLiveInfo, boolean z, HashMap<String, Integer> hashMap) {
        String str;
        boolean z2;
        HashMap<String, MediaPlayControlContext.a> hashMap2;
        QualityLiveItem qualityLiveItem;
        List<String> list;
        HashMap<String, Integer> hashMap3 = hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a901fb08", new Object[]{this, mediaLiveInfo, new Boolean(z), hashMap3});
            return;
        }
        try {
            str = com.taobao.taobaoavsdk.util.f.a(MediaAdapteManager.mMediaNetworkUtilsAdapter, this.h.mContext);
        } catch (Exception unused) {
            str = "";
        }
        if (!TaobaoMediaPlayer.isVPMLibLoaded()) {
            return;
        }
        HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics("RefNetSpeed");
        float f = -1.0f;
        float d = hAMetrics.containsKey("definition_media_speed_max") ? com.taobao.taobaoavsdk.util.b.d(hAMetrics.get("definition_media_speed_max")) * 8.0f : -1.0f;
        HashMap<String, String> hAMetrics2 = VPMManagerInstance.getInstance().getHAMetrics("ArtcMetrics");
        if (hAMetrics2.containsKey("definition_rtt_mean")) {
            f = com.taobao.taobaoavsdk.util.b.d(hAMetrics2.get("definition_rtt_mean"));
        }
        float d2 = hAMetrics2.containsKey("definition_v_avg_loss_rate_mean") ? com.taobao.taobaoavsdk.util.b.d(hAMetrics2.get("definition_v_avg_loss_rate_mean")) : 0.0f;
        HashMap<String, String> hAMetrics3 = VPMManagerInstance.getInstance().getHAMetrics("PlayerBufferRate");
        float d3 = hAMetrics3.containsKey("definition_v_buf_mps_mean") ? com.taobao.taobaoavsdk.util.b.d(hAMetrics3.get("definition_v_buf_mps_mean")) : 0.0f;
        HashMap<String, MediaPlayControlContext.a> hashMap4 = this.h.mLiveRateAdapteUrlNewPolicyMap;
        if (this.h.mEnableLiveRtcWeakNetFlag) {
            z2 = TaobaoMediaPlayer.getRtcWeakNetFlag();
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setLiveRateAdapteUrlByNewPolicy use rtc_weak_net_flag: " + z2 + ", svc_drop: " + this.h.mEnableLiveRtcWeakNetSVCDrop);
            if (z2) {
                MediaPlayControlContext mediaPlayControlContext = this.h;
                mediaPlayControlContext.mLiveRtcWeakNetFlag = true;
                mediaPlayControlContext.mLiveRtcWeakNetSVCDrop = mediaPlayControlContext.mEnableLiveRtcWeakNetSVCDrop;
            }
        } else {
            z2 = false;
        }
        String[] strArr = MediaPlayControlContext.PRIORITY_OF_NEW_DEFINITION;
        int i = 0;
        boolean z3 = false;
        int i2 = -1;
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            String str2 = strArr[i];
            if (hashMap3.containsKey(str2)) {
                int intValue = hashMap3.get(str2).intValue();
                if (this.h.mEnableLiveRtcWeakNetFlag) {
                    if (!z2) {
                        if (!hashMap4.containsKey(str2)) {
                            i2 = intValue;
                            break;
                        }
                    }
                    hashMap2 = hashMap4;
                    i2 = intValue;
                }
                if (hashMap4.containsKey(str2) && (qualityLiveItem = mediaLiveInfo.liveUrlList.get(intValue)) != null) {
                    MediaPlayControlContext.a aVar = hashMap4.get(str2);
                    hashMap2 = hashMap4;
                    if (aVar.d == 2) {
                        int i3 = this.h.mSelectDefinitionSpeed;
                        i2 = intValue;
                        long streamAvgBitrate = qualityLiveItem.getStreamAvgBitrate();
                        if (i3 <= 0 || i3 * 1000 >= ((float) streamAvgBitrate) * aVar.e) {
                            list = aVar.f;
                            if (list.contains("*") && !list.contains(str)) {
                                break;
                            }
                            z3 = true;
                            i++;
                            hashMap3 = hashMap;
                            hashMap4 = hashMap2;
                        }
                    } else {
                        i2 = intValue;
                        long streamMaxBitrate = qualityLiveItem.getStreamMaxBitrate();
                        if (d < 0.0f || streamMaxBitrate <= 0 || d >= ((float) streamMaxBitrate)) {
                            int i4 = aVar.f18012a;
                            if (f < 0.0f || i4 < 0 || f <= i4) {
                                float f2 = aVar.b;
                                if (d2 < 0.0f || f2 < 0.0f || d2 <= f2) {
                                    int i5 = aVar.c;
                                    if (d3 >= 0.0f && i5 >= 0 && d3 > i5) {
                                    }
                                    list = aVar.f;
                                    if (list.contains("*")) {
                                    }
                                    z3 = true;
                                }
                            }
                            i++;
                            hashMap3 = hashMap;
                            hashMap4 = hashMap2;
                        }
                    }
                }
                hashMap2 = hashMap4;
                i2 = intValue;
            } else {
                hashMap2 = hashMap4;
            }
            i++;
            hashMap3 = hashMap;
            hashMap4 = hashMap2;
        }
        int i6 = i2;
        if (i6 < 0 || i6 >= mediaLiveInfo.liveUrlList.size()) {
            return;
        }
        QualityLiveItem qualityLiveItem2 = mediaLiveInfo.liveUrlList.get(i6);
        if (!b(mediaLiveInfo.h265, qualityLiveItem2, z && this.h.mH265Enable)) {
            return;
        }
        this.h.mSelectDefinitionReason |= 32;
        this.h.mSelectDefinitionReason |= 8;
        if (z3) {
            this.h.mSelectDefinitionReason |= 128;
        }
        if (z2) {
            this.h.mSelectDefinitionReason |= 1024;
        }
        this.h.setCurrentPlayerQualityItem(qualityLiveItem2, i6);
    }

    private void a(MediaLiveInfo mediaLiveInfo, boolean z) {
        HashMap<String, Integer> hashMap;
        HashMap<String, Integer> hashMap2;
        HashMap<String, Integer> hashMap3;
        HashMap<String, Integer> hashMap4;
        HashMap<String, Integer> hashMap5;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375b14cb", new Object[]{this, mediaLiveInfo, new Boolean(z)});
        } else if (mediaLiveInfo.liveUrlList != null && com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SELECT_LIVE_URL_BY_NEW_DEFINITION, "true"))) {
            int i = 0;
            for (int i2 = 0; i2 < mediaLiveInfo.liveUrlList.size(); i2++) {
                if (!TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i2).newDefinition)) {
                    i++;
                }
            }
            if (i == 1) {
                this.h.mSelectDefinitionReason |= 64;
            }
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enablegetCdnSpeed", "false"))) {
                this.h.mSelectDefinitionSpeed = (int) TaobaoMediaPlayer.getCdnSpeed();
            }
            HashMap<String, Integer> hashMap6 = new HashMap<>();
            HashMap<String, Integer> hashMap7 = new HashMap<>();
            HashMap<String, Integer> hashMap8 = new HashMap<>();
            boolean isLowPerformance = this.h.isLowPerformance();
            int i3 = 0;
            while (i3 < mediaLiveInfo.liveUrlList.size()) {
                QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i3);
                if ("ud".equals(qualityLiveItem.newDefinition) || MediaConstant.DEFINITION_UD_60.equals(qualityLiveItem.newDefinition)) {
                    this.h.mLiveDefinition1080AvgBitrate = qualityLiveItem.getStreamAvgBitrate();
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    this.h.mLiveDefinition1080MaxBitrate = qualityLiveItem.getStreamMaxBitrate();
                } else {
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                }
                if (!TextUtils.isEmpty(qualityLiveItem.newDefinition)) {
                    long streamMaxBitrate = qualityLiveItem.getStreamMaxBitrate();
                    if (streamMaxBitrate > 0) {
                        hashMap3 = hashMap;
                        if (streamMaxBitrate > this.h.mLiveMaxBitrate) {
                            this.h.mLiveMaxBitrate = streamMaxBitrate;
                        }
                    } else {
                        hashMap3 = hashMap;
                    }
                    if (MediaConstant.DEFINITION_UD_60.equals(qualityLiveItem.newDefinition)) {
                        String config = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LEVEL, "[0,1]");
                        if (TextUtils.isEmpty(config) || !config.contains(String.valueOf(oyu.c()))) {
                            z2 = false;
                        } else {
                            this.h.mSelectDefinitionReason |= 256;
                            z2 = true;
                        }
                        String config2 = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_PLAY_60FPS_DEVICE_LIST, "");
                        com.taobao.taobaoavsdk.util.d dVar = new com.taobao.taobaoavsdk.util.d();
                        boolean z3 = z2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        hashMap5 = hashMap2;
                        sb.append(Build.MODEL);
                        dVar.a("model", sb.toString());
                        dVar.a(config2);
                        if (!TextUtils.isEmpty(config2) && dVar.b()) {
                            this.h.mSelectDefinitionReason |= 512;
                            z3 = true;
                        }
                        if (!z3) {
                            hashMap4 = hashMap5;
                        }
                    } else {
                        hashMap5 = hashMap2;
                    }
                    if (!TextUtils.isEmpty(this.h.mInitDefinition) && this.h.mInitDefinition.equals(qualityLiveItem.newDefinition)) {
                        if (b(mediaLiveInfo.h265, qualityLiveItem, z && this.h.mH265Enable)) {
                            this.h.setCurrentPlayerQualityItem(qualityLiveItem, i3);
                            this.h.mSelectDefinitionReason |= 16;
                            this.h.mSelectDefinitionReason |= 8;
                            return;
                        }
                    }
                    if (isLowPerformance && ("ud".equals(qualityLiveItem.newDefinition) || (qualityLiveItem.newDefinition != null && qualityLiveItem.newDefinition.contains("_60")))) {
                        String config3 = OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_ENABLE_SELECT_LIVE_URL_BY_NEW_DEFINITION_WHITE_MODEL_AND_SDK, MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
                        com.taobao.taobaoavsdk.util.d dVar2 = new com.taobao.taobaoavsdk.util.d();
                        dVar2.a("model", "" + Build.MODEL);
                        dVar2.a(g4.a.f3423a, "" + Build.VERSION.SDK_INT);
                        dVar2.a(config3);
                        if (TextUtils.isEmpty(config3) || !dVar2.b()) {
                            this.h.mSelectDefinitionReason |= 1;
                            hashMap4 = hashMap5;
                            i3++;
                            hashMap8 = hashMap4;
                            hashMap7 = hashMap3;
                        }
                    }
                    HashMap<String, Integer> hashMap9 = "true".equals(qualityLiveItem.recomm) ? hashMap6 : hashMap3;
                    if (!hashMap9.containsKey(qualityLiveItem.newDefinition)) {
                        hashMap9.put(qualityLiveItem.newDefinition, Integer.valueOf(i3));
                    }
                    hashMap4 = hashMap5;
                    if (!hashMap4.containsKey(qualityLiveItem.newDefinition)) {
                        hashMap4.put(qualityLiveItem.newDefinition, Integer.valueOf(i3));
                    }
                    i3++;
                    hashMap8 = hashMap4;
                    hashMap7 = hashMap3;
                } else {
                    hashMap3 = hashMap;
                    hashMap4 = hashMap2;
                }
                i3++;
                hashMap8 = hashMap4;
                hashMap7 = hashMap3;
            }
            HashMap<String, Integer> hashMap10 = hashMap7;
            HashMap<String, Integer> hashMap11 = hashMap8;
            this.h.initLowSpeedPolicyABIfNeeded();
            if (this.h.mEnableLiveRateAdapteUrlByNewPolicy) {
                a(mediaLiveInfo, z, hashMap11);
                return;
            }
            MediaPlayControlContext mediaPlayControlContext = this.h;
            mediaPlayControlContext.mUseLowSpeedPolicy = false;
            boolean isLowNetSpeedByVpm = mediaPlayControlContext.isLowNetSpeedByVpm();
            if (isLowNetSpeedByVpm && a(hashMap11, mediaLiveInfo, z, MediaPlayControlContext.PRIORITY_OF_NEW_DEFINITION_REVERT)) {
                MediaPlayControlContext mediaPlayControlContext2 = this.h;
                mediaPlayControlContext2.mUseLowSpeedPolicy = isLowNetSpeedByVpm;
                mediaPlayControlContext2.mSelectDefinitionReason |= 2;
                this.h.mSelectDefinitionReason |= 8;
                return;
            }
            String[] strArr = MediaPlayControlContext.PRIORITY_OF_NEW_DEFINITION;
            if (!a(hashMap6, mediaLiveInfo, z, strArr)) {
                if (!a(hashMap10, mediaLiveInfo, z, strArr)) {
                    return;
                }
                this.h.mSelectDefinitionReason |= 8;
                return;
            }
            this.h.mSelectDefinitionReason |= 4;
            this.h.mSelectDefinitionReason |= 8;
        }
    }

    private void a(MediaLiveInfo mediaLiveInfo, boolean z, int i) {
        int a2;
        String[] strArr;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b407f798", new Object[]{this, mediaLiveInfo, new Boolean(z), new Integer(i)});
            return;
        }
        this.h.setVideoUrl("");
        mediaLiveInfo.rateAdapte = false;
        this.h.setTopAnchor(mediaLiveInfo.rateAdapte);
        this.h.setRateAdapte(Boolean.FALSE.booleanValue());
        if (!TextUtils.isEmpty(mediaLiveInfo.mediaSourceType)) {
            this.h.mMediaSourceType = mediaLiveInfo.mediaSourceType;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.liveId)) {
            this.h.mVideoId = mediaLiveInfo.liveId;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.anchorId)) {
            this.h.mAccountId = mediaLiveInfo.anchorId;
        }
        if (MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "useRateAdapte", "true"))) {
            if (!mediaLiveInfo.rateAdapte) {
                strArr = this.v;
            } else if (i == 1 || i == 2) {
                strArr = this.v;
            } else {
                this.h.setRateAdapte(Boolean.TRUE.booleanValue());
                strArr = this.u;
            }
            if (!this.h.isLowPerformance() && Build.VERSION.SDK_INT >= 23) {
                for (String str : this.w) {
                    for (int i2 = 0; i2 < mediaLiveInfo.liveUrlList.size(); i2++) {
                        String str2 = mediaLiveInfo.liveUrlList.get(i2).definition;
                        if (mediaLiveInfo.liveUrlList.get(i2) != null && str.equals(str2) && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i2).flvUrl)) {
                            this.h.mLowQualityUrl = mediaLiveInfo.liveUrlList.get(i2).flvUrl;
                        }
                    }
                }
            }
            a(mediaLiveInfo, z);
            if (TextUtils.isEmpty(this.h.getVideoUrl())) {
                for (String str3 : strArr) {
                    for (int i3 = 0; i3 < mediaLiveInfo.liveUrlList.size(); i3++) {
                        String str4 = mediaLiveInfo.liveUrlList.get(i3).definition;
                        if (mediaLiveInfo.liveUrlList.get(i3) != null && str3.equals(str4)) {
                            if (b(mediaLiveInfo.h265, mediaLiveInfo.liveUrlList.get(i3), z && this.h.mH265Enable)) {
                                this.h.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(i3), i3);
                                MediaPlayControlContext mediaPlayControlContext = this.h;
                                mediaPlayControlContext.mSelectDefinitionReason = mediaPlayControlContext.mSelectDefinitionReason;
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(this.h.getVideoUrl()) || (a2 = a(this.h.mMediaLiveInfo)) < 0) {
            return;
        }
        boolean z3 = mediaLiveInfo.h265;
        QualityLiveItem qualityLiveItem = this.h.mMediaLiveInfo.liveUrlList.get(a2);
        if (!z || !this.h.mH265Enable) {
            z2 = false;
        }
        if (!b(z3, qualityLiveItem, z2)) {
            return;
        }
        this.h.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(a2), a2);
        MediaPlayControlContext mediaPlayControlContext2 = this.h;
        mediaPlayControlContext2.mSelectDefinitionReason = mediaPlayControlContext2.mSelectDefinitionReason;
    }

    private boolean b(MediaLiveInfo mediaLiveInfo, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7125b6ae", new Object[]{this, mediaLiveInfo, new Boolean(z)})).booleanValue();
        }
        this.h.setVideoUrl("");
        mediaLiveInfo.rateAdapte = false;
        this.h.setTopAnchor(mediaLiveInfo.rateAdapte);
        this.h.setRateAdapte(Boolean.FALSE.booleanValue());
        if (!TextUtils.isEmpty(mediaLiveInfo.mediaSourceType)) {
            this.h.mMediaSourceType = mediaLiveInfo.mediaSourceType;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.liveId)) {
            this.h.mVideoId = mediaLiveInfo.liveId;
        }
        if (!TextUtils.isEmpty(mediaLiveInfo.anchorId)) {
            this.h.mAccountId = mediaLiveInfo.anchorId;
        }
        for (int i = 0; i < mediaLiveInfo.liveUrlList.size(); i++) {
            String str = "sub_" + a();
            if (mediaLiveInfo.liveUrlList.get(i) != null && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i).flvUrl) && !TextUtils.isEmpty(mediaLiveInfo.liveUrlList.get(i).unitType) && mediaLiveInfo.liveUrlList.get(i).unitType.equals(str)) {
                boolean z3 = mediaLiveInfo.h265;
                QualityLiveItem qualityLiveItem = mediaLiveInfo.liveUrlList.get(i);
                if (z && this.h.mH265Enable) {
                    z2 = true;
                }
                if (a(z3, qualityLiveItem, z2)) {
                    this.h.setCurrentPlayerQualityItem(mediaLiveInfo.liveUrlList.get(i), i);
                }
                return true;
            }
        }
        return false;
    }

    public void a(int i, c cVar) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e9e891", new Object[]{this, new Integer(i), cVar});
            return;
        }
        i();
        m();
        this.h.setH265(this.N);
        MediaPlayControlContext mediaPlayControlContext = this.h;
        mediaPlayControlContext.mSVCEnable = false;
        mediaPlayControlContext.mLowQualityUrl = "";
        if (MediaAdapteManager.mMeasureAdapter != null) {
            this.h.setNetSpeed(MediaAdapteManager.mMeasureAdapter.getNetSpeedValue());
        }
        this.h.setVideoUrl("");
        if (this.h.mMediaLiveInfo != null && this.h.mMediaLiveInfo.liveUrlList != null && this.h.mMediaLiveInfo.liveUrlList.get(i) != null) {
            QualityLiveItem qualityLiveItem = this.h.mMediaLiveInfo.liveUrlList.get(i);
            AVSDKLog.d("MediaPlayControlManager", "change live quality index: " + i);
            a(qualityLiveItem);
            boolean b = b(this.h.mMediaLiveInfo.h265, qualityLiveItem, this.N);
            if (b) {
                this.h.setCurrentPlayerQualityItem(qualityLiveItem, i);
            }
            cVar.a(b, "");
        } else if (!TextUtils.isEmpty(this.h.getVideoUrl()) || (a2 = a(this.h.mMediaLiveInfo)) <= 0) {
        } else {
            QualityLiveItem qualityLiveItem2 = this.h.mMediaLiveInfo.liveUrlList.get(a2);
            AVSDKLog.d("MediaPlayControlManager", "get default live index: " + a2);
            a(qualityLiveItem2);
            if (!b(this.h.mMediaLiveInfo.h265, qualityLiveItem2, this.N)) {
                return;
            }
            this.h.setCurrentPlayerQualityItem(qualityLiveItem2, i);
        }
    }

    private boolean a(boolean z, QualityLiveItem qualityLiveItem, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180b648b", new Object[]{this, new Boolean(z), qualityLiveItem, new Boolean(z2)})).booleanValue();
        }
        this.h.mSVCEnable = false;
        String str = (qualityLiveItem.newDefinition == null || qualityLiveItem.newDefinition.equals("")) ? qualityLiveItem.definition : qualityLiveItem.newDefinition;
        if (!TextUtils.isEmpty(qualityLiveItem.videoUrl)) {
            this.h.setVideoUrl(qualityLiveItem.videoUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
            this.h.mSelectedUrlName = "videoUrl";
            return true;
        } else if (!TextUtils.isEmpty(qualityLiveItem.replayUrl)) {
            this.h.setVideoUrl(qualityLiveItem.replayUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
            this.h.mSelectedUrlName = "replayUrl";
            return true;
        } else {
            if (z2 && z && this.h.useArtp() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl)) {
                this.h.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H265_ARTP, str));
                this.h.mSelectedUrlName = aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl;
            } else if (z2 && z && !TextUtils.isEmpty(qualityLiveItem.wholeH265FlvUrl)) {
                this.h.setVideoUrl(qualityLiveItem.wholeH265FlvUrl);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h265", str));
                this.h.mSelectedUrlName = "wholeH265FlvUrl";
                return true;
            } else if (z2 && !z && !TextUtils.isEmpty(qualityLiveItem.h265Url) && this.h.useTransH265()) {
                this.h.setVideoUrl(qualityLiveItem.h265Url);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h265", str));
                this.h.mSelectedUrlName = "h265Url";
                return true;
            } else if (this.h.useBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
                this.h.setVideoUrl(qualityLiveItem.bfrtcUrl);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_BFRTC, str));
                this.h.mSelectedUrlName = MediaConstant.BFRTC_URL_NAME;
                return true;
            } else if (this.h.useArtp() && !z && !TextUtils.isEmpty(qualityLiveItem.artpUrl)) {
                this.h.setVideoUrl(qualityLiveItem.artpUrl);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_ARTP, str));
                this.h.mSelectedUrlName = "artpUrl";
                return true;
            } else if (!TextUtils.isEmpty(qualityLiveItem.flvUrl)) {
                this.h.setVideoUrl(qualityLiveItem.flvUrl);
                this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
                this.h.mSelectedUrlName = "flvUrl";
                return true;
            }
            return false;
        }
    }

    private void b(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15e74ea", new Object[]{this, qualityLiveItem});
            return;
        }
        this.h.mQualityLiveItem = qualityLiveItem;
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "setLiveUrl rtcLiveUrl: " + qualityLiveItem.rtcLiveUrl + ", bfrtcUrl: " + qualityLiveItem.bfrtcUrl + ", liveUrlMiniBfrtc: " + qualityLiveItem.liveUrlMiniBfrtc);
    }

    private boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.h.canSelectS266UrlForLive();
    }

    private boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.h.canSelectS266UrlForVideo();
    }

    private boolean b(boolean z, QualityLiveItem qualityLiveItem, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b96824c", new Object[]{this, new Boolean(z), qualityLiveItem, new Boolean(z2)})).booleanValue();
        }
        if (qualityLiveItem == null) {
            return false;
        }
        this.h.mSVCEnable = false;
        b(qualityLiveItem);
        boolean b = com.taobao.taobaoavsdk.c.b();
        String str = (qualityLiveItem.newDefinition == null || qualityLiveItem.newDefinition.equals("")) ? qualityLiveItem.definition : qualityLiveItem.newDefinition;
        if (!this.h.useTransCodeRtcLive()) {
            if ((!"蓝光".equals(qualityLiveItem.newDefinition) && !MediaConstant.DEFINITION_MD.equals(qualityLiveItem.newName)) || !b || !this.h.useRtcLive() || z || TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl) || com.taobao.taobaoavsdk.util.b.b("transcode", qualityLiveItem.rtcLiveUrl)) {
                return false;
            }
            if (this.P) {
                MediaPlayControlContext mediaPlayControlContext = this.h;
                mediaPlayControlContext.setVideoUrl(qualityLiveItem.rtcLiveUrl + "&grtn_fix_ts_reset=off");
            } else {
                this.h.setVideoUrl(qualityLiveItem.rtcLiveUrl);
            }
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_RTCLIVE, str));
            this.h.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
            return true;
        }
        this.h.mSelectFlvUrlReason = 1;
        if (t()) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(qualityLiveItem.additionUrlMap);
                if (oyu.u() && b && !TextUtils.isEmpty(parseObject.getString("rtc266Url")) && parseObject.getString("rtc266Url").contains("encoder_type=266")) {
                    this.h.selecte266ToPlay();
                    this.h.setVideoUrl(parseObject.getString("rtc266Url"));
                    this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H266, str));
                    this.h.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
                    this.h.isRtcVVC = true;
                    return true;
                } else if (!TextUtils.isEmpty(parseObject.getString("rtmp266Url")) && parseObject.getString("rtmp266Url").contains("encoder_type=266")) {
                    this.h.selecte266ToPlay();
                    this.h.setVideoUrl(parseObject.getString("rtmp266Url"));
                    this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H266, str));
                    this.h.mSelectedUrlName = "266FlvUrl";
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        if (oyu.u() && b && t() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl) && qualityLiveItem.wholeH265ArtpUrl.contains("encoder_type=266")) {
            this.h.selecte266ToPlay();
            this.h.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H266, str));
            MediaPlayControlContext mediaPlayControlContext2 = this.h;
            mediaPlayControlContext2.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
            mediaPlayControlContext2.isRtcVVC = true;
            return true;
        } else if (t() && !TextUtils.isEmpty(qualityLiveItem.h265Url) && qualityLiveItem.h265Url.contains("encoder_type=266")) {
            this.h.selecte266ToPlay();
            this.h.setVideoUrl(qualityLiveItem.h265Url);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H266, str));
            this.h.mSelectedUrlName = "266FlvUrl";
            return true;
        } else if (!TextUtils.isEmpty(qualityLiveItem.videoUrl)) {
            this.h.setVideoUrl(qualityLiveItem.videoUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
            this.h.mSelectedUrlName = "videoUrl";
            return true;
        } else if (!TextUtils.isEmpty(qualityLiveItem.replayUrl)) {
            this.h.setVideoUrl(qualityLiveItem.replayUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
            this.h.mSelectedUrlName = "replayUrl";
            return true;
        } else if (b && z2 && z && this.h.useArtp() && !TextUtils.isEmpty(qualityLiveItem.wholeH265ArtpUrl)) {
            this.h.setVideoUrl(qualityLiveItem.wholeH265ArtpUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H265_ARTP, str));
            this.h.mSelectedUrlName = aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl;
            return false;
        } else if (z2 && z && !TextUtils.isEmpty(qualityLiveItem.wholeH265FlvUrl)) {
            this.h.setVideoUrl(qualityLiveItem.wholeH265FlvUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h265", str));
            this.h.mSelectedUrlName = "wholeH265FlvUrl";
            return true;
        } else if (z2 && !z && !TextUtils.isEmpty(qualityLiveItem.h265Url) && this.h.useTransH265() && !qualityLiveItem.h265Url.contains("encoder_type=266")) {
            this.h.setVideoUrl(qualityLiveItem.h265Url);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h265", str));
            this.h.mSelectedUrlName = "h265Url";
            return true;
        } else if (b && this.h.useMiniBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.liveUrlMiniBfrtc)) {
            this.h.setVideoUrl(qualityLiveItem.liveUrlMiniBfrtc);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_MINI_BFRTC, str));
            this.h.mSelectedUrlName = MediaConstant.MINI_BFRTC_URL_NAME;
            return true;
        } else if (b && this.h.useRtcLive() && !z && !TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
            if (this.P) {
                MediaPlayControlContext mediaPlayControlContext3 = this.h;
                mediaPlayControlContext3.setVideoUrl(qualityLiveItem.rtcLiveUrl + "&grtn_fix_ts_reset=off");
            } else {
                this.h.setVideoUrl(qualityLiveItem.rtcLiveUrl);
            }
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_RTCLIVE, str));
            MediaPlayControlContext mediaPlayControlContext4 = this.h;
            mediaPlayControlContext4.mSelectedUrlName = MediaConstant.RTCLIVE_URL_NAME;
            mediaPlayControlContext4.isRtcVVC = false;
            return true;
        } else if (b && this.h.useBfrtc() && !z && !TextUtils.isEmpty(qualityLiveItem.bfrtcUrl)) {
            this.h.setVideoUrl(qualityLiveItem.bfrtcUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_BFRTC, str));
            this.h.mSelectedUrlName = MediaConstant.BFRTC_URL_NAME;
            return true;
        } else if (b && this.h.useArtp() && !z && !TextUtils.isEmpty(qualityLiveItem.artpUrl)) {
            this.h.setVideoUrl(qualityLiveItem.artpUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f(MediaConstant.H264_ARTP, str));
            this.h.mSelectedUrlName = "artpUrl";
            return true;
        } else if (TextUtils.isEmpty(qualityLiveItem.flvUrl)) {
            return false;
        } else {
            this.h.setVideoUrl(qualityLiveItem.flvUrl);
            this.h.setVideoDefinition(com.taobao.taobaoavsdk.util.b.f("h264", str));
            MediaPlayControlContext mediaPlayControlContext5 = this.h;
            mediaPlayControlContext5.mSelectedUrlName = "flvUrl";
            if (!mediaPlayControlContext5.useRtcLive()) {
                this.h.mSelectFlvUrlReason = 2;
            } else if (z) {
                this.h.mSelectFlvUrlReason = 3;
            } else if (TextUtils.isEmpty(qualityLiveItem.rtcLiveUrl)) {
                this.h.mSelectFlvUrlReason = 4;
            }
            if (!b) {
                MediaPlayControlContext mediaPlayControlContext6 = this.h;
                z3 = true;
                mediaPlayControlContext6.mDegradeToFlvByArtoSoNoReady = true;
                mediaPlayControlContext6.mSelectFlvUrlReason = 9;
            } else {
                z3 = true;
            }
            this.h.isRtcVVC = false;
            return z3;
        }
    }

    public static int a(MediaLiveInfo mediaLiveInfo) {
        ArrayList<QualityLiveItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7566031c", new Object[]{mediaLiveInfo})).intValue();
        }
        if (mediaLiveInfo == null || (arrayList = mediaLiveInfo.liveUrlList) == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        return arrayList.size() >= 2 ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.taobao.mediaplay.MediaPlayControlContext r12, java.util.Map<java.lang.String, com.taobao.mediaplay.model.b> r13, int r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mediaplay.g.a(com.taobao.mediaplay.MediaPlayControlContext, java.util.Map, int):void");
    }

    public int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352a7d6", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        if (g()) {
            return 4;
        }
        if (!TextUtils.isEmpty(str) && i > 0 && this.h != null && MediaAdapteManager.mMeasureAdapter != null && MediaAdapteManager.mConfigAdapter != null && com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig(this.h.mConfigGroup, "videoDeviceMeaseureEnable", "true"))) {
            return this.h.mTBLive ? b(str, 20000, z) : b(str, i, z);
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1652) {
            if (hashCode != 1683) {
                if (hashCode != 1714) {
                    if (hashCode != 2664213) {
                        if (hashCode == 1379812394 && str.equals("Unknown")) {
                            c = 3;
                        }
                    } else if (str.equals("WIFI")) {
                        c = 0;
                    }
                } else if (str.equals("5G")) {
                    c = 2;
                }
            } else if (str.equals("4G")) {
                c = 1;
            }
        } else if (str.equals("3G")) {
            c = 4;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            return 1;
        }
        return c != 4 ? 3 : 2;
    }

    private int b(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2782f4d7", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        MediaPlayControlContext mediaPlayControlContext = this.h;
        if (mediaPlayControlContext != null) {
            mediaPlayControlContext.setVdeoDeviceMeaseureEnable(true);
        }
        if (g()) {
            return 4;
        }
        if ((("WIFI".equals(str) && i > 1500) || "4G".equals(str) || ("5G".equals(str) && i > 2000)) && !z) {
            return 1;
        }
        return (i <= 1000 || "2G".equals(str)) ? 3 : 2;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pctime", "" + (this.z - this.y));
        hashMap.put("pcend", "" + this.z);
        hashMap.put("pcerror", "" + this.A);
        hashMap.put("videoPassThroughData", "" + this.B);
        hashMap.put("resourcePassThroughData", "" + this.C);
        hashMap.put("mSelectVodUrlReason", "" + this.D);
        hashMap.put("SelectVodUrlReasonNew", "" + this.E);
        hashMap.put("NetSpeedCalReason", "" + this.F);
        hashMap.put("BitRateForVodSelect", "" + this.G);
        hashMap.put("BitRateForVodSelectByRobust", "" + this.H);
        hashMap.put("defSelectByCache", "" + this.J);
        hashMap.put("defSelectByPolicy", "" + this.I);
        hashMap.put("useRecDataTime", "" + oyu.s);
        hashMap.put("selectReasonAtPreDL", this.L);
        hashMap.put("defDegradeReason", "" + this.f18020a);
        hashMap.put("ud265BitRate", "" + this.b);
        hashMap.put("hd265BitRate", "" + this.c);
        hashMap.put("ud266BitRate", "" + this.W);
        hashMap.put("hd266BitRate", "" + this.X);
        hashMap.put("hd264BitRate", "" + this.V);
        hashMap.put("clientVerify", "" + this.d);
        hashMap.put("pre_cache_bytes", "" + this.U);
        try {
            String replaceAll = this.K.replaceAll(",", "*");
            hashMap.put("bitRateMap", "" + replaceAll);
            if (!TextUtils.isEmpty(replaceAll) && (replaceAll.contains("ud") || replaceAll.contains(MediaConstant.DEFINITION_2K) || replaceAll.contains(MediaConstant.DEFINITION_4K))) {
                z = true;
            }
            hashMap.put("has_1080p_url", z ? "1" : "0");
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "BitRateMap replace failed." + e.toString());
        }
        return hashMap;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            this.h.unselectS266OfPlay();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            r();
        }
    }
}
