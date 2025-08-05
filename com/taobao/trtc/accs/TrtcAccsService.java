package com.taobao.trtc.accs;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(609043208);
    }

    public static /* synthetic */ Object ipc$super(TrtcAccsService trtcAccsService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    public static /* synthetic */ void lambda$onData$0(String str, String str2, String str3, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45b345e", new Object[]{str, str2, str3, bArr});
        } else {
            a.a(str, str2, str3, bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(final String str, final String str2, final String str3, final byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.accs.-$$Lambda$TrtcAccsService$cylKrb_pXLIdVCDIGCK2uOx6ZRQ
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcAccsService.lambda$onData$0(str, str2, str3, bArr);
                }
            }, 0L);
        }
    }

    public static /* synthetic */ void lambda$onBind$1(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65df2725", new Object[]{str, new Integer(i), extraInfo});
        } else {
            a.a(str, i, extraInfo);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(final String str, final int i, final TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.accs.-$$Lambda$TrtcAccsService$K_lmX7pZC5Hway5iTyQ5IvA0uY8
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcAccsService.lambda$onBind$1(str, i, extraInfo);
                }
            }, 0L);
        }
    }

    public static /* synthetic */ void lambda$onUnbind$2(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ef47f", new Object[]{str, new Integer(i), extraInfo});
        } else {
            a.b(str, i, extraInfo);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(final String str, final int i, final TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.accs.-$$Lambda$TrtcAccsService$92UATTEGe_5ktatXY2xQyHZzjdg
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcAccsService.lambda$onUnbind$2(str, i, extraInfo);
                }
            }, 0L);
        }
    }

    public static /* synthetic */ void lambda$onSendData$3(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be4888b", new Object[]{str, str2, new Integer(i)});
        } else {
            a.a(str, str2, i);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(final String str, final String str2, final int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.accs.-$$Lambda$TrtcAccsService$CujSjs5YNLqIwKrnsS5np_S_k5E
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcAccsService.lambda$onSendData$3(str, str2, i);
                }
            }, 0L);
        }
    }

    public static /* synthetic */ void lambda$onResponse$4(String str, String str2, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc234362", new Object[]{str, str2, new Integer(i), bArr});
        } else {
            a.a(str, str2, i, bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(final String str, final String str2, final int i, final byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.accs.-$$Lambda$TrtcAccsService$99FK2Z2UR4wm8TSAbmPiOK3bYHs
                @Override // java.lang.Runnable
                public final void run() {
                    TrtcAccsService.lambda$onResponse$4(str, str2, i, bArr);
                }
            }, 0L);
        }
    }
}
