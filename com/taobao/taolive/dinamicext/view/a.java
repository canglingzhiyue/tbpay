package com.taobao.taolive.dinamicext.view;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import tb.kge;
import tb.prr;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21429a;
    private MediaLiveInfo c;
    private InterfaceC0893a f;
    private int b = 0;
    private String d = null;
    private String e = null;

    /* renamed from: com.taobao.taolive.dinamicext.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0893a {
        void retry(boolean z, boolean z2, boolean z3);
    }

    static {
        kge.a(-1833551510);
        f21429a = a.class.getSimpleName();
    }

    public a(MediaLiveInfo mediaLiveInfo) {
        this.c = mediaLiveInfo;
        a(mediaLiveInfo, a());
    }

    public void a(InterfaceC0893a interfaceC0893a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dee9a", new Object[]{this, interfaceC0893a});
        } else {
            this.f = interfaceC0893a;
        }
    }

    public boolean a(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50365aae", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue() : b(iMediaPlayer, i, i2);
    }

    private ArrayList<QualityLiveItem> a(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("83b0b883", new Object[]{this, mediaLiveInfo}) : mediaLiveInfo.liveUrlList;
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        MediaLiveInfo mediaLiveInfo = this.c;
        if (mediaLiveInfo == null) {
            return -1;
        }
        return b(mediaLiveInfo);
    }

    private int b(MediaLiveInfo mediaLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eae0295d", new Object[]{this, mediaLiveInfo})).intValue();
        }
        if (mediaLiveInfo == null) {
            return -1;
        }
        return a(a(mediaLiveInfo));
    }

    private int a(ArrayList<QualityLiveItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{this, arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        return arrayList.size() >= 2 ? 1 : -1;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        InterfaceC0893a interfaceC0893a = this.f;
        if (interfaceC0893a != null) {
            interfaceC0893a.retry(false, false, false);
        }
        this.d = null;
        this.e = null;
        return true;
    }

    private boolean b(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbff4af", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        String str = f21429a;
        TLog.loge(str, "handlePlayError  what = " + i + " extra = " + i2);
        if (TextUtils.isEmpty(this.d) && TextUtils.isEmpty(this.e)) {
            return false;
        }
        a(i);
        return -10610 != i;
    }

    private void a(MediaLiveInfo mediaLiveInfo, int i) {
        ArrayList<QualityLiveItem> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375ad4fa", new Object[]{this, mediaLiveInfo, new Integer(i)});
        } else if (mediaLiveInfo == null || mediaLiveInfo.liveUrlList == null || mediaLiveInfo.liveUrlList.size() == 0 || i < 0 || (a2 = a(mediaLiveInfo)) == null) {
        } else {
            if (this.e == null && prr.o() && a2.get(i).rtcLiveUrl != null) {
                this.e = a2.get(i).rtcLiveUrl;
            }
            if (this.d != null || !prr.n() || a2.get(i).bfrtcUrl == null) {
                return;
            }
            this.d = a2.get(i).bfrtcUrl;
        }
    }
}
