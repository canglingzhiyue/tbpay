package com.taobao.android.miniLive.ui;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.e;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.k;
import mtopsdk.mtop.util.ErrorConstant;
import tb.hua;
import tb.hud;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.ppt;

/* loaded from: classes6.dex */
public class c implements hua.a, ppt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBLiveVideoView f14392a;
    private Context b;
    private String c;
    private MessageTypeFilter d = new MessageTypeFilter() { // from class: com.taobao.android.miniLive.ui.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }
    };
    private hua.a e;
    private TBLiveDataModel f;
    private e g;

    static {
        kge.a(1935254362);
        kge.a(-35650602);
        kge.a(1406151845);
    }

    public c(Context context, String str, String str2, b bVar) {
        this.b = context;
        com.taobao.android.miniLive.services.c.a().a(str, pmd.a().q().a(), null, null, null, str2, null);
        this.c = str2;
        bVar.g = this.c;
        this.f14392a = new TBLiveVideoView(context);
        this.f14392a.setViewConfig(bVar);
        com.taobao.android.miniLive.services.c.a().a((ppt) this);
        com.taobao.android.miniLive.services.c.a().a(this, this.d);
        com.taobao.android.miniLive.services.c.a().b();
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (hud.A()) {
            com.taobao.android.miniLive.a.a().j();
            com.taobao.android.miniLive.a.a().h();
        }
        this.f14392a.setVideoView(com.taobao.android.miniLive.services.e.a().a(this.b, this.c, 1));
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView == null) {
            return;
        }
        tBLiveVideoView.init(this.b);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f14392a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.start();
        }
        com.taobao.android.miniLive.services.c.a().e();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView == null) {
            return false;
        }
        return tBLiveVideoView.isPlaying();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView == null) {
            return;
        }
        tBLiveVideoView.setCoverImageVisible();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.pause();
        }
        com.taobao.android.miniLive.services.c.a().f();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        TBLiveDataModel tBLiveDataModel = this.f;
        if (tBLiveDataModel == null) {
            return null;
        }
        return tBLiveDataModel.mRawData;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView == null) {
            return;
        }
        tBLiveVideoView.setMuted(z);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        e eVar = this.g;
        if (eVar != null) {
            eVar.c();
        }
        TBLiveVideoView tBLiveVideoView = this.f14392a;
        if (tBLiveVideoView != null) {
            tBLiveVideoView.destroy();
        }
        com.taobao.android.miniLive.services.c.a().b(this);
        com.taobao.android.miniLive.services.c.a().a((hua.a) this);
        com.taobao.android.miniLive.services.c.a().h();
    }

    public void a(hua.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be3f487", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    @Override // tb.ppt
    public void a_(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ba025a", new Object[]{this, new Integer(i), obj});
        } else if (i == 1) {
            pnj m = pmd.a().m();
            m.b("vanda", "STATUS_INIT_SUCCESS info = " + obj);
            a((TBLiveDataModel) obj);
            Log.e("TaoLiveRoomTest", "livedetail end:" + System.currentTimeMillis());
        } else if (i == 2) {
            String str = (String) obj;
            if (k.a(str)) {
                Toast.makeText(this.b, ErrorConstant.MappingMsg.FLOW_LIMIT_MAPPING_MSG, 0).show();
            } else if (!ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
            } else {
                Toast.makeText(this.b, R.string.minilive_network_error, 1).show();
            }
        } else if (i != 3) {
            if (i == 5) {
            }
        } else {
            TBLiveVideoView tBLiveVideoView = this.f14392a;
            if (tBLiveVideoView == null) {
                return;
            }
            tBLiveVideoView.destroy();
        }
    }

    private void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
        } else {
            this.f = tBLiveDataModel;
            TBLiveVideoView tBLiveVideoView = this.f14392a;
            if (tBLiveVideoView != null) {
                tBLiveVideoView.setVideoCover(tBLiveDataModel.mVideoInfo.coverImg);
                this.f14392a.setVideoInfo(tBLiveDataModel.mVideoInfo);
            }
            int i = tBLiveDataModel.mVideoInfo.status;
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                        }
                    }
                }
                a(tBLiveDataModel.mVideoInfo);
                return;
            }
            TBLiveVideoView tBLiveVideoView2 = this.f14392a;
            if (tBLiveVideoView2 == null) {
                return;
            }
            tBLiveVideoView2.destroy();
        }
    }

    private void a(VideoInfo videoInfo) {
        TBLiveVideoView tBLiveVideoView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
            return;
        }
        if (this.g == null) {
            this.g = new e(this.f14392a, (Activity) this.b, false);
        }
        int a2 = this.g.a(videoInfo, false);
        String a3 = this.g.a(videoInfo, a2);
        this.g.a(false);
        if ((videoInfo.status != 0 && videoInfo.status != 3) || (tBLiveVideoView = this.f14392a) == null) {
            return;
        }
        tBLiveVideoView.setVideoDefinition(this.g.b(videoInfo, a2));
        this.f14392a.playStreamUrl(a3, this.g.a(), this.g.d(), -1, true);
    }

    @Override // tb.hua.a
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        hua.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        aVar.a(i, obj);
    }
}
