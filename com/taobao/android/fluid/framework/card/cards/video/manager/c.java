package com.taobao.android.fluid.framework.card.cards.video.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.List;
import tb.hni;
import tb.kge;
import tb.obw;
import tb.oec;
import tb.psw;
import tb.shm;
import tb.sii;
import tb.sil;
import tb.skl;
import tb.smm;
import tb.snp;
import tb.spy;
import tb.spz;
import tb.suz;

/* loaded from: classes5.dex */
public class c extends hni.a implements shm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f12498a = new HashMap<>();
    public final Runnable b = new Runnable() { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.this.a("3");
            }
        }
    };
    public int c = 0;
    public boolean d = false;
    private final FluidContext e;
    private final sii f;
    private long g;

    static {
        kge.a(390664857);
        kge.a(267465044);
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        }
    }

    public c(sii siiVar) {
        this.e = siiVar.z();
        this.f = siiVar;
        a(siiVar);
        b(siiVar);
    }

    public static void a(sii siiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa2a7af", new Object[]{siiVar, str});
            return;
        }
        siiVar.ab().f12498a.put("state", str);
        ((IMessageService) siiVar.z().getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, siiVar.f(), siiVar.ab().f12498a));
        b(siiVar, str);
    }

    public static void b(sii siiVar, String str) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8b6ff0", new Object[]{siiVar, str});
        } else if (str == null || (a2 = smm.a(str)) == null) {
        } else {
            ((IMessageService) siiVar.z().getService(IMessageService.class)).sendMessage(new spy(a2, siiVar.f(), siiVar.ab().f12498a));
        }
    }

    public void a(String str, String str2, sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3d6a39", new Object[]{this, str, str2, siiVar});
            return;
        }
        this.f12498a.put(obw.NOTIFY_TNODE_VIDEO_NEXT_STATE, str2);
        a(siiVar, str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!((IDataService) this.e.getService(IDataService.class)).getConfig().h()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("shouldShow", String.valueOf(!this.f.Y().b));
            HashMap hashMap2 = new HashMap();
            if (this.f.k().f() != null) {
                hashMap2.put(aw.PARAM_PLAYER_TOKEN, this.f.k().f().h());
            }
            hashMap.put("info", hashMap2);
            ((IMessageService) this.f.z().getService(IMessageService.class)).sendMessage(new spy("VSMSG_playFeedback", this.f.f(), hashMap));
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.d || i2 <= i / 3 || i2 < ((IDataService) this.f.z().getService(IDataService.class)).getConfig().j().A) {
        } else {
            this.d = true;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("time", Integer.valueOf(i2));
            hashMap2.put("type", this.f.af().d() != null ? this.f.af().d().toLowerCase() : "");
            hashMap.put(this.f.af().l(), hashMap2);
            ((IMessageService) this.f.z().getService(IMessageService.class)).sendMessage(new spy("VSMSG_positiveFeedBack", this.f.f(), hashMap));
        }
    }

    private void a(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feca9d25", new Object[]{this, siiVar});
        } else {
            siiVar.t().a(this);
        }
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        this.f12498a.put("totalTime", "0");
        this.f12498a.put("currentTime", "0");
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
        } else if (!this.f.J()) {
        } else {
            if (this.f.k().f() != null && this.f.k().f().i() != null && oec.a((Object) this.f.k().f().i().get("first_frame_rendering_time"), 0) > 0) {
                return;
            }
            sii.mHandler.removeCallbacks(this.f.ab().b);
            skl j = ((IDataService) this.f.z().getService(IDataService.class)).getConfig().j();
            this.g = System.nanoTime() / 1000000;
            sii.mHandler.postDelayed(this.f.ab().b, j == null ? 5000L : j.ai);
        }
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
        } else if (!this.f.J()) {
        } else {
            sii.mHandler.removeCallbacks(this.f.ab().b);
        }
    }

    private void b(sii siiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed4da3a6", new Object[]{this, siiVar});
        } else {
            siiVar.P().addVideoPlayerListener(this);
        }
    }

    @Override // tb.hni.a, tb.hni
    public void onVideoError(psw pswVar, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
            return;
        }
        sii.mHandler.removeCallbacks(this.b);
        a("2");
    }

    @Override // tb.hni.a, tb.hni
    public void onVideoInfo(psw pswVar, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93966fd7", new Object[]{this, pswVar, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        if ((System.nanoTime() / 1000000) - this.g > (((IDataService) this.f.z().getService(IDataService.class)).getConfig().j() == null ? 5000 : ((IDataService) this.f.z().getService(IDataService.class)).getConfig().j().ai)) {
            return;
        }
        sii.mHandler.removeCallbacks(this.b);
    }

    @Override // tb.hni.a, tb.hni
    public void onVideoPause(psw pswVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec8357", new Object[]{this, pswVar, new Boolean(z)});
        } else {
            a(this.f, "pause");
        }
    }

    @Override // tb.hni.a, tb.hni
    public void onVideoPlay(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653637d3", new Object[]{this, pswVar});
        } else {
            a(this.f, "play");
        }
    }

    @Override // tb.hni.a, tb.hni
    public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int i4 = i / 1000;
        if (this.c != i4) {
            this.c = i4;
            this.f12498a.put("state", suz.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
            this.f12498a.put("totalTime", String.valueOf(i3 / 1000));
            this.f12498a.put("currentTime", String.valueOf(this.c));
            ((IMessageService) this.f.z().getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, this.f.f(), this.f12498a));
        }
        boolean z = this.f.A().c().b().f12487a;
        if (!sil.b() || !z) {
            return;
        }
        spz.a("商品预透出", "可以发重复的消息");
        this.f.A().c().b().f12487a = false;
        this.c = i4;
        this.f12498a.put("state", "timeUpdateSeekToAndPause");
        this.f12498a.put("totalTime", String.valueOf(i3 / 1000));
        this.f12498a.put("currentTime", String.valueOf(this.c));
        ((IMessageService) this.f.z().getService(IMessageService.class)).sendMessage(new spy(suz.VIDEO_STATE_CHANGE_NAME, this.f.f(), this.f12498a));
    }
}
