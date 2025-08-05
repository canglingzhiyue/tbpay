package com.taobao.bootimage.view;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import tb.kej;
import tb.kem;
import tb.keq;
import tb.kge;
import tb.pbe;
import tb.pbg;

/* loaded from: classes6.dex */
public class h extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageView m;
    private ImageView n;
    private View o;
    private ViewGroup p;
    private pbe q;
    private boolean r;
    private String s;
    private pbe.a t;

    static {
        kge.a(-15877505);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 91915245) {
            return new Boolean(super.b());
        } else {
            if (hashCode != 673877021) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.handleMessage((Message) objArr[0]));
        }
    }

    public static /* synthetic */ void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f442a2", new Object[]{hVar});
        } else {
            hVar.d();
        }
    }

    public static /* synthetic */ void a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169484a1", new Object[]{hVar, new Integer(i)});
        } else {
            hVar.a(i);
        }
    }

    public static /* synthetic */ ImageView b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("94e0e3ef", new Object[]{hVar}) : hVar.m;
    }

    public static /* synthetic */ View c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a296b22", new Object[]{hVar}) : hVar.o;
    }

    public static /* synthetic */ pbe d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pbe) ipChange.ipc$dispatch("1092054", new Object[]{hVar}) : hVar.q;
    }

    public h(Context context, BootImageInfo bootImageInfo, ViewGroup viewGroup, boolean z) {
        super(context, bootImageInfo);
        this.r = false;
        this.s = "none";
        this.t = new pbe.a() { // from class: com.taobao.bootimage.view.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pbe.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                kej.a("BootImageVideoController", "show video: on started");
                h.a(h.this);
                if (h.this.h == null) {
                    return;
                }
                h.this.a(keq.VIDEO_PLAY_START, (String) null);
            }

            @Override // tb.pbe.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                kej.a("BootImageVideoController", "show video: onComplete");
                if (h.this.f == null) {
                    return;
                }
                h.this.f.sendEmptyMessage(102);
            }

            @Override // tb.pbe.a
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                kej.a("BootImageVideoController", "show video: onError what:" + i + "extra" + i2);
                h.this.a(keq.VIDEO_PLAY_ERROR, String.valueOf(i));
                if (h.this.f == null) {
                    return;
                }
                h.this.f.sendEmptyMessage(101);
            }
        };
        if (bootImageInfo != null) {
            this.s = bootImageInfo.videoUrl;
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(context);
            if (z) {
                this.g = (ViewGroup) from.inflate(R.layout.bootimage_video_icon, viewGroup, false);
            } else {
                this.g = (ViewGroup) from.inflate(R.layout.bootimage_video, viewGroup, false);
            }
            kej.a("BootImageVideoController", "show video: icon" + z);
            this.f16713a = (TextView) this.g.findViewById(R.id.textview);
            this.p = (ViewGroup) this.g.findViewById(R.id.video_container);
            this.m = (ImageView) this.g.findViewById(R.id.default_imageview);
            this.n = (ImageView) this.g.findViewById(R.id.iv_taobao_logo);
            View findViewById = this.g.findViewById(R.id.close);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.bootimage.view.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        kej.a("BootImageVideoController", "show video: skip");
                        if (h.this.d != null) {
                            h.this.d.a(com.taobao.bootimage.d.CLOSE_TYPE_SKIP);
                        }
                        h.this.a();
                    }
                });
            }
            if (this.n != null && bootImageInfo != null && bootImageInfo.hideTBLogo) {
                this.n.setVisibility(8);
            }
            if (TextUtils.isEmpty(bootImageInfo.videoLocalPath)) {
                return;
            }
            a(context);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            this.q = (pbe) AliAdaptServiceManager.getInstance().findAliAdaptService(pbe.class);
            if (this.q != null) {
                pbg pbgVar = new pbg("tbbootimage", Login.getUserId());
                pbgVar.c = 2;
                pbgVar.d = 2;
                pbgVar.f = 0;
                this.q.initConfig(context, pbgVar);
                this.q.setVideoPath(this.h.videoLocalPath);
                pbe pbeVar = this.q;
                if (this.h.haveVoice) {
                    z = false;
                }
                pbeVar.setMuted(z);
                this.q.setListener(this.t);
                this.o = this.q.getPlayView();
                if (this.o != null) {
                    this.p.addView(this.o);
                    this.m.bringToFront();
                    this.o.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    return;
                }
                kej.a("BootImageVideoController", "show video: no player view.");
                return;
            }
            kej.a("BootImageVideoController", "show video: service error.");
        } catch (Throwable th) {
            kej.a("BootImageVideoController", "show video: service exception.", th);
            this.o = null;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null) {
        } else {
            this.f.sendEmptyMessage(100);
            if (this.h.removeBGDelayMs > 0) {
                this.f.sendEmptyMessageDelayed(103, this.h.removeBGDelayMs);
            } else {
                this.f.sendEmptyMessageDelayed(103, 300L);
            }
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        kej.a("BootImageVideoController", "show video: start");
        if (this.h == null || TextUtils.isEmpty(this.h.imgUrl) || this.i.get() == null) {
            kej.a("BootImageVideoController", "show video failed: data error.");
            return false;
        }
        this.r = false;
        if (!super.b()) {
            return false;
        }
        kej.a("BootImageVideoController", "show video: 有默认图，显示默认图");
        final String str = this.h.imgUrl;
        try {
            PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(BootImageDataMgr.IMAGE_MODULE_NAME, str);
            a2.mo1206onlyCache();
            a2.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.bootimage.view.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    kej.a("BootImageVideoController", "show video: load image success");
                    if (h.this.e) {
                        if (h.b(h.this) != null) {
                            h.b(h.this).setImageDrawable(succPhenixEvent.getDrawable());
                        }
                        if (!TextUtils.isEmpty(h.this.h.videoLocalPath) && h.c(h.this) != null && h.d(h.this) != null) {
                            try {
                                h.d(h.this).start();
                                h.this.f.sendEmptyMessageDelayed(105, kem.a().e());
                            } catch (Throwable th) {
                                kej.a("BootImageVideoController", "show video: video start exception", th);
                                h.a(h.this, 101);
                                return true;
                            }
                        } else if (h.this.f != null) {
                            h.this.f.sendEmptyMessage(100);
                        }
                        if (h.this.d != null) {
                            h.this.d.a();
                        }
                    } else {
                        kej.a("BootImageVideoController", "show video: load image fail，showed is false");
                    }
                    return true;
                }
            });
            a2.failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.bootimage.view.h.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    h.a(h.this, 102);
                    kej.a("BootImageVideoController", "show video: load video failed, code " + failPhenixEvent.getResultCode() + ", url=" + str);
                    return true;
                }
            });
            a2.fetch();
            kej.a("BootImageVideoController", "show video: load video");
            return true;
        } catch (Throwable th) {
            kej.a("BootImageVideoController", "show video: load default image exception", th);
            a();
            return false;
        }
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        kej.a("BootImageVideoController", "show video: close() ");
        if (this.f != null) {
            this.f.removeMessages(103);
            this.f.removeMessages(101);
            this.f.removeMessages(102);
            this.f.removeMessages(100);
            this.f.removeMessages(105);
        }
        pbe pbeVar = this.q;
        if (pbeVar != null) {
            pbeVar.release();
            this.q = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        super.a();
    }

    @Override // com.taobao.bootimage.view.b, com.taobao.bootimage.view.c, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 100:
                a(keq.VIDEO_PLAY_SUCCESS, (String) null);
                kej.a("BootImageVideoController", "show video video success");
                if (this.e) {
                    this.r = true;
                    c();
                    break;
                }
                break;
            case 101:
                kej.a("BootImageVideoController", "video fail");
                a(101);
                break;
            case 102:
                kej.a("BootImageVideoController", "show video video finish");
                break;
            case 103:
                kej.a("BootImageVideoController", "show video remove default image");
                if (this.m != null && this.e) {
                    this.m.setVisibility(8);
                }
                if (this.e && TextUtils.isEmpty(this.h.imgUrl) && this.d != null) {
                    kej.a("BootImageVideoController", "show video on success");
                    this.d.a();
                    break;
                }
                break;
            case 105:
                kej.a("BootImageVideoController", "show video time out");
                if (!this.r) {
                    kej.a("BootImageVideoController", "video timeout");
                    AppMonitor.Counter.commit(BootImageDataMgr.CACHE_MODULE, "videoTimeout", 1.0d);
                    a(101);
                    break;
                }
                break;
        }
        super.handleMessage(message);
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.e) {
        } else {
            if (this.d != null) {
                this.d.a(i);
            }
            a();
        }
    }
}
