package com.taobao.android.fluid.framework.mute.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.mute.helper.i;
import java.util.HashMap;
import tb.kge;
import tb.oeb;
import tb.snd;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class h implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FluidContext b;
    private i c;
    private i.a d;
    private Handler e;

    /* renamed from: a  reason: collision with root package name */
    public final int f12606a = 200;
    private long f = 0;
    private long g = 0;

    static {
        kge.a(759068914);
        kge.a(1755210026);
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ long a(h hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5ecca35", new Object[]{hVar, new Long(j)})).longValue();
        }
        hVar.g = j;
        return j;
    }

    public static /* synthetic */ FluidContext a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("25041d85", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ long b(h hVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7231d14", new Object[]{hVar, new Long(j)})).longValue();
        }
        hVar.f = j;
        return j;
    }

    public static /* synthetic */ Handler b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7c13f622", new Object[]{hVar}) : hVar.e;
    }

    public static /* synthetic */ long c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("72557359", new Object[]{hVar})).longValue() : hVar.g;
    }

    public static /* synthetic */ long d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ba9c89a", new Object[]{hVar})).longValue() : hVar.f;
    }

    public h(FluidContext fluidContext) {
        this.b = fluidContext;
        ((ILifecycleService) this.b.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        if (oeb.a("ShortVideo.enableVolumeChangeObserver", true)) {
            this.c = new i(fluidContext.getContext());
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            ci_();
        }
    }

    public void ci_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8600c0", new Object[]{this});
            return;
        }
        spz.c("VolumeChangeForMuteHelper", "解注册的VolumeChangeForMuteHelper = " + this);
        i iVar = this.c;
        if (iVar == null) {
            return;
        }
        iVar.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.e = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.framework.mute.helper.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    a.c a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) h.a(h.this).getService(IDataService.class)).getCurrentMediaSetData();
                    if (currentMediaSetData == null || (a2 = currentMediaSetData.a()) == null) {
                        return;
                    }
                    HashMap hashMap = (HashMap) message.obj;
                    h.b(h.this).removeCallbacksAndMessages(null);
                    ((IMessageService) h.a(h.this).getService(IMessageService.class)).sendMessage(new spy("VSMSG_volumeChanged", a2.c, hashMap));
                    spz.c("VolumeChangeForMuteHelper", "成功发送了消息，内容为 = " + hashMap.get("old"));
                }
            };
            this.d = new i.a() { // from class: com.taobao.android.fluid.framework.mute.helper.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.mute.helper.i.a
                public void a(int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    Message obtain = Message.obtain();
                    hashMap.put("old", Integer.valueOf(i));
                    hashMap.put("new", Integer.valueOf(i2));
                    h.a(h.this, System.currentTimeMillis());
                    obtain.obj = hashMap;
                    if (Math.abs(h.c(h.this) - h.d(h.this)) < 200) {
                        return;
                    }
                    h.b(h.this).sendMessage(obtain);
                    h.b(h.this, System.currentTimeMillis());
                }
            };
            spz.c("VolumeChangeForMuteHelper", "音频广播注册");
            this.c.a(this.d);
        }
    }
}
