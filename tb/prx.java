package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.c;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.taolive.uikit.homepage.d;
import com.taobao.taolive.uikit.mtop.LiveInfoItem;
import com.taobao.taolive.uikit.mtop.QualitySelectItem;
import java.util.ArrayList;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class prx implements pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static prx f;
    private k b;
    private View c;
    private int e;
    private pqy d = new pqy(this);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f32838a = new ArrayList<>();

    /* loaded from: classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public b f32842a;
        public int b;

        static {
            kge.a(34952496);
        }

        public a() {
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void onLiveVideoEvent(com.taobao.taolive.uikit.livecard.a aVar);
    }

    static {
        kge.a(-1106874699);
        kge.a(-1317704444);
    }

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ k a(prx prxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("cc41fe2", new Object[]{prxVar}) : prxVar.b;
    }

    public static /* synthetic */ void a(prx prxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c05c6e1", new Object[]{prxVar, new Integer(i)});
        } else {
            prxVar.a(i);
        }
    }

    public static /* synthetic */ pqy b(prx prxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("745142ab", new Object[]{prxVar}) : prxVar.d;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar == null) {
            return;
        }
        kVar.l();
    }

    public void a(MediaLiveInfo mediaLiveInfo, String str, int i) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a928f4b0", new Object[]{this, mediaLiveInfo, str, new Integer(i)});
        } else if (!prc.a() || mediaLiveInfo == null || (kVar = this.b) == null) {
        } else {
            kVar.e(str);
            this.b.a(mediaLiveInfo, (String) null);
            this.b.p();
            this.b.f();
            if (i == this.e) {
                return;
            }
            this.e = i;
            if (Build.VERSION.SDK_INT < 21 || this.b.q() == null) {
                return;
            }
            this.b.q().setOutlineProvider(new d(this.e));
            this.b.q().setClipToOutline(true);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.l();
        }
        pqy pqyVar = this.d;
        if (pqyVar == null) {
            return;
        }
        pqyVar.removeCallbacksAndMessages(null);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    private prx(Context context, String str, int i) {
        this.c = LayoutInflater.from(context).inflate(R.layout.tbliveuikit_home_card_video_frame, (ViewGroup) null);
        this.b = new k((Activity) context, false, MediaConstant.LBLIVE_SOURCE);
        ((RelativeLayout) this.c).addView(this.b.q(), new RelativeLayout.LayoutParams(-1, -2));
        com.taobao.taolive.uikit.livecard.d dVar = new com.taobao.taolive.uikit.livecard.d();
        this.b.a((ddc) dVar);
        this.b.a((ddh) dVar);
        this.b.a(false, 2, 0, 0, 0);
        this.b.c(str);
        this.b.a(i);
        this.b.e(true);
        this.b.a(new IMediaPlayer.OnInfoListener() { // from class: tb.prx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (((int) j) == 3 && prx.a(prx.this) != null) {
                    prx.a(prx.this, 1);
                    if (prx.b(prx.this) != null) {
                        prx.b(prx.this).postDelayed(new Runnable() { // from class: tb.prx.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (prx.a(prx.this) == null) {
                                } else {
                                    prx.this.b();
                                    prx.a(prx.this, 2);
                                }
                            }
                        }, 10000L);
                    }
                }
                return false;
            }
        });
        this.b.a(new TaoLiveVideoView.d() { // from class: tb.prx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.d
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.d
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                prx.a(prx.this, 8);
                if (prx.b(prx.this) != null) {
                    prx.b(prx.this).removeCallbacksAndMessages(null);
                }
                if (prx.a(prx.this) == null) {
                    return;
                }
                prx.a(prx.this).l();
            }
        });
    }

    public static MediaLiveInfo a(LiveInfoItem liveInfoItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("b5c6b2f3", new Object[]{liveInfoItem});
        }
        if (liveInfoItem == null || liveInfoItem.liveUrlList == null || liveInfoItem.liveUrlList.size() <= 0) {
            return null;
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        int i = liveInfoItem.roomStatus;
        if (i == 1) {
            int size = liveInfoItem.liveUrlList.size();
            mediaLiveInfo.h265 = liveInfoItem.h265;
            mediaLiveInfo.mediaConfig = liveInfoItem.mediaConfig;
            mediaLiveInfo.rateAdapte = liveInfoItem.rateAdapte;
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i2 = 0; i2 < size; i2++) {
                QualitySelectItem qualitySelectItem = liveInfoItem.liveUrlList.get(i2);
                QualityLiveItem qualityLiveItem = new QualityLiveItem();
                qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
                qualityLiveItem.definition = qualitySelectItem.definition;
                qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
                qualityLiveItem.h265Url = qualitySelectItem.h265Url;
                qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
                qualityLiveItem.name = qualitySelectItem.name;
                qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
                mediaLiveInfo.liveUrlList.add(qualityLiveItem);
            }
        } else if (i == 2) {
            mediaLiveInfo.h265 = false;
            mediaLiveInfo.rateAdapte = false;
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
            qualityLiveItem2.replayUrl = liveInfoItem.replayUrl;
            mediaLiveInfo.liveUrlList.add(qualityLiveItem2);
        }
        return mediaLiveInfo;
    }

    public static prx a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prx) ipChange.ipc$dispatch("34c7ea30", new Object[]{context});
        }
        if (prr.g() || !prc.a() || prc.d(context)) {
            return null;
        }
        if (f == null) {
            f = new prx(context, c.PLAY_SUBBUSINESS_TYPE, 0);
        }
        return f;
    }

    private void b(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4c75b6", new Object[]{this, new Integer(i), bVar});
        } else if (bVar == null || this.f32838a == null) {
        } else {
            a aVar = new a();
            aVar.f32842a = bVar;
            aVar.b = i;
            this.f32838a.add(aVar);
        }
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ba97d7", new Object[]{this, new Integer(i), bVar});
            return;
        }
        e();
        b(i, bVar);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f32838a != null) {
            for (int i2 = 0; i2 < this.f32838a.size(); i2++) {
                a aVar = this.f32838a.get(i2);
                if (aVar != null && (aVar.b & i) != 0 && aVar.f32842a != null) {
                    aVar.f32842a.onLiveVideoEvent(new com.taobao.taolive.uikit.livecard.a(i));
                }
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ArrayList<a> arrayList = this.f32838a;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }
}
