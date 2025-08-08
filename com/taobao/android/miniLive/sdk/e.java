package com.taobao.android.miniLive.sdk;

import android.app.Activity;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.ui.TBLiveVideoView;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.l;
import java.util.ArrayList;
import tb.hua;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes6.dex */
public class e implements hua.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14342a;
    private TBLiveVideoView b;
    private VideoInfo c;
    private Activity e;
    private boolean f;
    private int d = 0;
    private String g = null;

    static {
        kge.a(-478040327);
        kge.a(1406151845);
        f14342a = e.class.getSimpleName();
    }

    public e(TBLiveVideoView tBLiveVideoView, Activity activity, boolean z) {
        this.e = activity;
        this.b = tBLiveVideoView;
        com.taobao.android.miniLive.services.c.a().a(this, new MessageTypeFilter() { // from class: com.taobao.android.miniLive.sdk.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1024 || i == 1026 || i == 1017;
            }
        });
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private ArrayList<QualitySelectItem> b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("33b1ed9e", new Object[]{this, videoInfo});
        }
        if (d() && videoInfo.tbtvLiveDO != null && videoInfo.tbtvLiveDO.liveUrlList != null) {
            return videoInfo.tbtvLiveDO.liveUrlList;
        }
        return videoInfo.liveUrlList;
    }

    public int a(VideoInfo videoInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7065e602", new Object[]{this, videoInfo, new Boolean(z)})).intValue();
        }
        if (videoInfo == null) {
            return -1;
        }
        return a(videoInfo);
    }

    public int a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ead9f958", new Object[]{this, videoInfo})).intValue();
        }
        if (videoInfo == null) {
            return -1;
        }
        return a(b(videoInfo));
    }

    public static int a(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        return arrayList.size() >= 2 ? 1 : -1;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        boolean d = l.d(pmd.a().d().a("tblive", "TBLIVE_ORANGE_ARTP_Enable_NewV2", "false"));
        if (d && b()) {
            return false;
        }
        return d;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String a2 = pmd.a().d().a("tblive", "ARTPDeviceBlackist", "");
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        String str = Build.MODEL;
        String[] split = a2.split(";");
        if (split != null && split.length > 0 && !StringUtils.isEmpty(str)) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String a(VideoInfo videoInfo, int i) {
        ArrayList<QualitySelectItem> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4369d222", new Object[]{this, videoInfo, new Integer(i)});
        }
        if (videoInfo == null || videoInfo.liveUrlList == null || videoInfo.liveUrlList.size() == 0) {
            return null;
        }
        this.c = videoInfo;
        this.d = i;
        if (i >= 0 && (b = b(videoInfo)) != null) {
            if (this.g == null && a() && b.get(i).artpUrl != null) {
                this.g = b.get(i).artpUrl;
                return this.g;
            }
            return b.get(i).flvUrl;
        }
        return videoInfo.liveUrl;
    }

    public String b(VideoInfo videoInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4a32c1", new Object[]{this, videoInfo, new Integer(i)});
        }
        ArrayList<QualitySelectItem> b = b(videoInfo);
        if (b != null && i >= 0 && i < b.size()) {
            return b.get(i).name;
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.android.miniLive.services.c.a().a(this);
        }
    }

    @Override // tb.hua.a
    public void a(int i, Object obj) {
        LiveSystemMessage liveSystemMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        pnj m = pmd.a().m();
        String str = f14342a;
        m.b(str, "onMessageReceived----- msgType = " + i);
        if (obj == null) {
            return;
        }
        if (i == 1024) {
            if (!"useH264".equals(((LiveSystemMessage) obj).type)) {
                return;
            }
            pmd.a().m().b(f14342a, "useH264");
            if (this.f) {
                return;
            }
            this.g = "DEFAULT";
            String a2 = a(this.c, this.d);
            this.g = null;
            this.b.playStreamUrl(a2, false, d(), -1, false);
        } else if (i == 1026 || i != 1017 || (liveSystemMessage = (LiveSystemMessage) obj) == null || this.f || this.g != null || this.b == null || !a(liveSystemMessage)) {
        } else {
            a(liveSystemMessage.playerQuality);
        }
    }

    private boolean a(LiveSystemMessage liveSystemMessage) {
        int intValue;
        int intValue2;
        int intValue3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a3a3c26", new Object[]{this, liveSystemMessage})).booleanValue();
        }
        if (liveSystemMessage == null || StringUtils.isEmpty(liveSystemMessage.low) || StringUtils.isEmpty(liveSystemMessage.high) || !StringUtils.isDigitsOnly(liveSystemMessage.low) || !StringUtils.isDigitsOnly(liveSystemMessage.high) || pmd.a().q() == null) {
            return false;
        }
        String a2 = pmd.a().q().a();
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        try {
            intValue = Integer.valueOf(liveSystemMessage.low).intValue();
            intValue2 = Integer.valueOf(liveSystemMessage.high).intValue();
            if (a2.length() >= 2) {
                a2 = a2.substring(a2.length() - 2, a2.length());
            }
            intValue3 = Integer.valueOf(a2).intValue();
        } catch (Exception unused) {
        }
        return intValue <= intValue3 && intValue3 <= intValue2;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.c;
        return videoInfo != null && videoInfo.roomType == 13;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String b = b(str);
        if (StringUtils.isEmpty(b)) {
            return;
        }
        this.b.playStreamUrl(b, false, d(), l.a(str), true);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int a2 = l.a(str);
        ArrayList<QualitySelectItem> b = b(this.c);
        if (b == null || a2 < 0 || a2 >= b.size()) {
            return null;
        }
        this.d = a2;
        String a3 = a(this.c, this.d);
        this.b.setVideoDefinition(b(this.c, this.d));
        return a3;
    }
}
