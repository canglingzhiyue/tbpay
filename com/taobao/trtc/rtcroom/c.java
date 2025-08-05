package com.taobao.trtc.rtcroom;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import anet.channel.util.ErrorConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceViewRenderer;
import tb.kge;

/* loaded from: classes9.dex */
public class c implements ITrtcObserver.a, ITrtcObserver.c, ITrtcObserver.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.trtc.api.e f23163a;
    private TrtcConfig b;
    private final Context d;
    private final b e;
    private final RelativeLayout f;
    private d h;
    private TrtcDefines.g l;
    private Map<String, SurfaceViewRenderer> g = new HashMap();
    private final ArrayList<Bundle> i = new ArrayList<>();
    private final AtomicBoolean j = new AtomicBoolean(false);
    private boolean k = false;

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83919388", new Object[]{this, trtcChannelAction, str, str2, str3});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ecc652", new Object[]{this, trtcErrorEvent, new Integer(i), str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ace7ceb", new Object[]{this, kVar});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0e582f", new Object[]{this, str, new Integer(i), str2, str3, str4});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void b(ArrayList<TrtcDefines.m> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e188d161", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void c(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3622480", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        }
    }

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5f61250d", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ Context b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("71ba16af", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ RelativeLayout c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("f07edf26", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ com.taobao.trtc.api.e d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trtc.api.e) ipChange.ipc$dispatch("3894d585", new Object[]{cVar}) : cVar.f23163a;
    }

    public static /* synthetic */ b e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("236ddb65", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ d f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b05af2c2", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : c;
    }

    static {
        kge.a(-339374662);
        kge.a(855594913);
        kge.a(509415034);
        kge.a(1847903687);
        c = c.class.getName();
    }

    public c(Context context, b bVar) {
        this.d = context;
        this.f = new RelativeLayout(context);
        this.e = bVar;
    }

    public synchronized boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("353ae13b", new Object[]{this, dVar})).booleanValue();
        }
        if (this.d != null && dVar != null && this.e != null) {
            this.h = dVar;
            this.b = new TrtcConfig.a().a(dVar.f23167a).b(dVar.b).c(dVar.d).a((ITrtcObserver.e) this).a((ITrtcObserver.c) this).a(new a()).a(false, false).e(true).b(false).c(false).d(false).a();
            if (this.f23163a == null) {
                this.f23163a = com.taobao.trtc.api.e.a(this.d);
            }
            this.f23163a.c();
            this.f23163a.a(this.b);
            return true;
        }
        TrtcLog.a(c, "init error");
        return false;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.f23163a != null) {
            this.f23163a.c();
            this.f23163a = null;
        }
        this.b = null;
        this.h = null;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f;
    }

    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this});
        }
        Iterator<SurfaceViewRenderer> it = this.g.values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else if (view == null) {
        } else {
            if (z) {
                this.f.removeView(view);
                TrtcLog.d(c, "detach remote render");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2);
            this.f.addView(view, layoutParams);
            TrtcLog.d(c, "attach remote render");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r4 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        g();
     */
    @Override // com.taobao.trtc.api.ITrtcObserver.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(boolean r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.trtc.rtcroom.c.$ipChange     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            java.lang.String r1 = "a821d36c"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L8b
            r4[r2] = r7     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r2 = new java.lang.Boolean     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L8b
            r4[r3] = r2     // Catch: java.lang.Throwable -> L8b
            r0.ipc$dispatch(r1, r4)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r7)
            return
        L1c:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.j     // Catch: java.lang.Throwable -> L8b
            r8.set(r3)     // Catch: java.lang.Throwable -> L8b
            com.taobao.trtc.api.e r8 = r7.f23163a     // Catch: java.lang.Throwable -> L8b
            if (r8 != 0) goto L27
            monitor-exit(r7)
            return
        L27:
            com.taobao.trtc.api.e r8 = r7.f23163a     // Catch: java.lang.Throwable -> L8b
            com.taobao.trtc.api.TrtcAudioDevice r8 = r8.g()     // Catch: java.lang.Throwable -> L8b
            r8.setAudioEventObserver(r7)     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList<android.os.Bundle> r8 = r7.i     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L8b
        L36:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L84
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L8b
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "api"
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L8b
            r4 = -1
            int r5 = r1.hashCode()     // Catch: java.lang.Throwable -> L8b
            r6 = -1801390983(0xffffffff94a0f479, float:-1.6252299E-26)
            if (r5 == r6) goto L62
            r6 = 1873156684(0x6fa61a4c, float:1.02812605E29)
            if (r5 == r6) goto L58
            goto L6b
        L58:
            java.lang.String r5 = "leaveChannel"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L6b
            r4 = 1
            goto L6b
        L62:
            java.lang.String r5 = "joinChannel"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L6b
            r4 = 0
        L6b:
            if (r4 == 0) goto L74
            if (r4 == r3) goto L70
            goto L36
        L70:
            r7.g()     // Catch: java.lang.Throwable -> L8b
            goto L36
        L74:
            java.lang.String r1 = "channelId"
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "extension"
            java.lang.String r0 = r0.getString(r4)     // Catch: java.lang.Throwable -> L8b
            r7.a(r1, r0)     // Catch: java.lang.Throwable -> L8b
            goto L36
        L84:
            java.util.ArrayList<android.os.Bundle> r8 = r7.i     // Catch: java.lang.Throwable -> L8b
            r8.clear()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r7)
            return
        L8b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.rtcroom.c.a(boolean):void");
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17a39c", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        b bVar = this.e;
        if (trtcNetWorkQuality != TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_GOOD && trtcNetWorkQuality != TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_NORMAL) {
            z = false;
        }
        bVar.sendNetStat(z);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void a(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8803561e", new Object[]{this, trtcMediaConnectionState});
        } else if (trtcMediaConnectionState != TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
        } else {
            this.e.sendNetStat(false);
            this.e.sendError(ErrorConstant.ERROR_GET_PROCESS_NULL, "media connection disconnect");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void a(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acbc2b1", new Object[]{this, eVar});
        } else if (eVar.b != 0) {
            this.e.sendError(BSError.BSDIFF_OLD_FILE_DEC_FAILED, eVar.c);
        } else {
            this.e.sendEnterRoom();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void c(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            new Handler(this.d.getMainLooper()).post(new Runnable() { // from class: com.taobao.trtc.rtcroom.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.a(c.this).get(str) != null) {
                    } else {
                        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(c.b(c.this));
                        c.c(c.this).addView(surfaceViewRenderer, new RelativeLayout.LayoutParams(-1, -1));
                        String h = c.h();
                        TrtcLog.d(h, "add remote view to view maps, id: " + str);
                        c.a(c.this).put(str, surfaceViewRenderer);
                        if (c.d(c.this) == null || c.d(c.this).f() == null) {
                            return;
                        }
                        c.d(c.this).f().setRemoteVideoView(surfaceViewRenderer, str);
                    }
                }
            });
            b bVar = this.e;
            if (bVar == null) {
                return;
            }
            bVar.sendRemoteJoin(str);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void d(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.taobao.trtc.api.e eVar = this.f23163a;
            if (eVar != null && eVar.f() != null) {
                this.f23163a.f().setRemoteVideoView(null, str);
            }
            b bVar = this.e;
            if (bVar != null) {
                bVar.sendRemoteLeave(str, null);
            }
            new Handler(this.d.getMainLooper()).post(new Runnable() { // from class: com.taobao.trtc.rtcroom.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.a(c.this).get(str) == null) {
                    } else {
                        String h = c.h();
                        TrtcLog.d(h, "remove remote view from maps, id: " + str);
                        c.c(c.this).removeView((View) c.a(c.this).get(str));
                        c.a(c.this).remove(str);
                    }
                }
            });
        }
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.f23163a == null) {
            this.e.sendError(BSError.BSDIFF_OLD_FILE_DEC_FAILED, "rtc engine not initialized");
        } else {
            if (TextUtils.isEmpty(str)) {
                str = this.h.c;
            }
            String str3 = c;
            TrtcLog.d(str3, "joinChannel: " + str);
            if (!this.j.get()) {
                Bundle bundle = new Bundle();
                bundle.putString("api", "joinChannel");
                bundle.putString("channelId", str);
                bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
                this.i.add(bundle);
                TrtcLog.d(c, "cached api joinChannel");
                return;
            }
            TrtcDefines.g gVar = new TrtcDefines.g();
            gVar.f23039a = str;
            gVar.b = str2;
            gVar.d = true;
            gVar.f = false;
            gVar.e = false;
            this.l = gVar;
            this.f23163a.a(gVar);
        }
    }

    public synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f23163a == null) {
            TrtcLog.a(c, "leave channel error");
        } else if (!this.j.get()) {
            Bundle bundle = new Bundle();
            bundle.putString("api", "leaveChannel");
            this.i.add(bundle);
            TrtcLog.d(c, "cached api leaveChannel");
        } else {
            if (this.l != null) {
                this.f23163a.a(this.l.f23039a, "");
                this.l = null;
            }
            for (String str : this.g.keySet()) {
                this.f23163a.f().setRemoteVideoView(null, str);
            }
            this.g.clear();
            this.e.sendLeaveRoom();
        }
    }

    public synchronized void c(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.f23163a != null && this.f23163a.g() != null) {
            TrtcAudioDevice g = this.f23163a.g();
            if (i != 2) {
                z = false;
            }
            g.enableSpeakerphone(z);
        }
    }

    public synchronized void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f23163a != null && this.f23163a.g() != null) {
            this.f23163a.g().muteLocal(z);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else if (i == 3) {
                i2 = 3;
            } else if (i == 4) {
                i2 = 4;
            }
        }
        this.e.sendAudioMode(i2);
    }

    /* loaded from: classes9.dex */
    public class a extends com.taobao.trtc.api.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1395821082);
        }

        public a() {
        }

        @Override // com.taobao.trtc.api.b
        public void a(int i, Bundle bundle, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d07ea10c", new Object[]{this, new Integer(i), bundle, map});
                return;
            }
            if (i != 105) {
                if (i == 106) {
                    if (bundle == null || c.e(c.this) == null) {
                        return;
                    }
                    c.e(c.this).sendFirstRender(bundle.getString("userId"));
                    return;
                } else if (i != 304) {
                    return;
                } else {
                    if (c.e(c.this) != null) {
                        c.e(c.this).sendFirstRender(c.f(c.this).d);
                    }
                }
            }
            if (bundle == null || c.e(c.this) == null || bundle.getInt(TrtcConstants.TRTC_PARAMS_PHONE_STATE) != 1) {
                return;
            }
            c.e(c.this).sendError(-1101, "phone active");
        }
    }
}
