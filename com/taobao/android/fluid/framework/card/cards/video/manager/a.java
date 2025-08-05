package com.taobao.android.fluid.framework.card.cards.video.manager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;
import tb.psw;
import tb.shm;
import tb.sii;
import tb.sil;
import tb.snp;
import tb.son;
import tb.spz;

/* loaded from: classes5.dex */
public class a implements shm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_CARD_MISS_DISACTIVE = 1;
    public static final int MSG_CARD_MISS_DISAPPEAR = 2;
    public static final int MSG_CARD_MISS_RECYCLE = 3;
    public static final int MSG_CARD_MISS_WILL_DISACTIVE = 0;

    /* renamed from: a  reason: collision with root package name */
    private final sii f12495a;
    private Handler b;

    static {
        kge.a(-92394014);
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
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        }
    }

    public static /* synthetic */ sii a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sii) ipChange.ipc$dispatch("6ce64e83", new Object[]{aVar}) : aVar.f12495a;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a592173", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public a(sii siiVar) {
        this.f12495a = siiVar;
        siiVar.t().a(this);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!son.k() || this.f12495a.r() < 0 || son.u()) {
            b(i);
        } else {
            if (this.b == null) {
                this.b = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.card.cards.video.manager.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                            return;
                        }
                        spz.c(sii.TAG, "cardMissDelayDestroy," + message.what + ",卡片消失，延迟处理,id=" + a.a(a.this).w());
                        a.a(a.this, message.what);
                    }
                };
            }
            if (this.b.hasMessages(i)) {
                return;
            }
            this.b.sendEmptyMessageDelayed(i, son.h());
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        } else if (!this.f12495a.J()) {
        } else {
            a(2);
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        } else {
            this.f12495a.J();
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        } else if (!sil.a(this.f12495a.z()) && !son.u()) {
        } else {
            a(0);
        }
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
        } else {
            this.f12495a.J();
        }
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
        } else if (!this.f12495a.J()) {
        } else {
            a(1);
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        } else {
            a(3);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            this.f12495a.R();
        } else if (i == 1) {
            this.f12495a.U();
            this.f12495a.b_(true);
        } else if (i == 2) {
            this.f12495a.R();
            this.f12495a.b_(true);
            this.f12495a.g().b(null);
        } else if (i == 3) {
            this.f12495a.b_(true);
            this.f12495a.g().b(null);
        }
        spz.c("DelayPauseManager", "cardMissDelayDestroyInternal,卡片消失，延迟暂停、" + i);
    }
}
