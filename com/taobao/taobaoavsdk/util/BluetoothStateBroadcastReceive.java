package com.taobao.taobaoavsdk.util;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.WeakHashMap;
import tb.kge;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class BluetoothStateBroadcastReceive extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f21341a;
    private BLUESTATUS c;
    private BluetoothAdapter d;
    private final WeakHashMap<com.taobao.mediaplay.player.c, Boolean> b = new WeakHashMap<>();
    private int e = 0;
    private int f = -1;
    private int g = 0;

    /* loaded from: classes8.dex */
    public enum BLUESTATUS {
        NOTOPEN,
        NOTCONNECT,
        NOTCONNECT_NOT_SETAVSYNC,
        CONNECT,
        CONNECT_NOT_SETAVSYNC
    }

    static {
        kge.a(-494178777);
    }

    public BluetoothStateBroadcastReceive() {
        this.f21341a = false;
        this.c = BLUESTATUS.NOTOPEN;
        this.d = null;
        if (this.d == null) {
            this.d = BluetoothAdapter.getDefaultAdapter();
            int profileConnectionState = this.d.getProfileConnectionState(1);
            if (this.d.getProfileConnectionState(2) == 2 || profileConnectionState == 2) {
                this.c = BLUESTATUS.CONNECT;
                this.f21341a = true;
                return;
            }
            this.c = BLUESTATUS.NOTCONNECT;
            this.f21341a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " BluetoothReceiver onReceive" + intent.getAction() + "mListenersWeakMap size is" + this.b.size());
        synchronized (BluetoothStateBroadcastReceive.class) {
            String action = intent.getAction();
            intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            switch (action.hashCode()) {
                case -1692127708:
                    if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -301431627:
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            this.e = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED: " + this.e);
                            if (this.e == 2) {
                                if (!this.f21341a) {
                                    for (com.taobao.mediaplay.player.c cVar : this.b.keySet()) {
                                        if (cVar instanceof TaobaoMediaPlayer) {
                                            ((TaobaoMediaPlayer) cVar).setBluetoothStatus(true);
                                        }
                                    }
                                    this.c = BLUESTATUS.CONNECT;
                                    this.f21341a = true;
                                }
                            } else if (this.e == 0 && this.f21341a) {
                                for (com.taobao.mediaplay.player.c cVar2 : this.b.keySet()) {
                                    if (cVar2 instanceof TaobaoMediaPlayer) {
                                        ((TaobaoMediaPlayer) cVar2).setBluetoothStatus(false);
                                    }
                                }
                                this.c = BLUESTATUS.NOTCONNECT;
                                this.f21341a = false;
                            }
                        } else if (c == 4) {
                            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                            int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ACTION_SCO_AUDIO_STATE_UPDATED, state: " + intExtra + ", prev state: " + intExtra2);
                            if (intExtra == 0 && this.f != -1 && intExtra2 == 1 && this.f21341a) {
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is disconnected");
                                for (com.taobao.mediaplay.player.c cVar3 : this.b.keySet()) {
                                    if (cVar3 instanceof TaobaoMediaPlayer) {
                                        ((TaobaoMediaPlayer) cVar3).setBluetoothStatus(false);
                                    }
                                }
                                this.c = BLUESTATUS.NOTCONNECT;
                                this.f21341a = false;
                            }
                            this.f = intExtra;
                            this.g = intExtra2;
                            if (this.f == 1 && this.g == 2) {
                                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is connected");
                                if (!this.f21341a) {
                                    for (com.taobao.mediaplay.player.c cVar4 : this.b.keySet()) {
                                        if (cVar4 instanceof TaobaoMediaPlayer) {
                                            ((TaobaoMediaPlayer) cVar4).setBluetoothStatus(true);
                                        }
                                    }
                                    this.c = BLUESTATUS.CONNECT;
                                    this.f21341a = true;
                                }
                            }
                        }
                    } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 10 && this.f21341a) {
                        for (com.taobao.mediaplay.player.c cVar5 : this.b.keySet()) {
                            if (cVar5 instanceof TaobaoMediaPlayer) {
                                ((TaobaoMediaPlayer) cVar5).setBluetoothStatus(false);
                            }
                        }
                        this.c = BLUESTATUS.NOTCONNECT;
                        this.f21341a = false;
                    }
                } else if (this.f21341a) {
                    for (com.taobao.mediaplay.player.c cVar6 : this.b.keySet()) {
                        if (cVar6 instanceof TaobaoMediaPlayer) {
                            ((TaobaoMediaPlayer) cVar6).setBluetoothStatus(false);
                        }
                    }
                    this.c = BLUESTATUS.NOTCONNECT;
                    this.f21341a = false;
                }
            } else if (!this.f21341a) {
                for (com.taobao.mediaplay.player.c cVar7 : this.b.keySet()) {
                    if (cVar7 instanceof TaobaoMediaPlayer) {
                        ((TaobaoMediaPlayer) cVar7).setBluetoothStatus(true);
                    }
                }
                this.c = BLUESTATUS.CONNECT;
                this.f21341a = true;
            }
        }
    }

    public void a(com.taobao.mediaplay.player.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb800fa", new Object[]{this, cVar});
            return;
        }
        synchronized (BluetoothStateBroadcastReceive.class) {
            if (cVar != null) {
                this.b.put(cVar, Boolean.TRUE);
            }
        }
    }

    public void b(com.taobao.mediaplay.player.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff73959", new Object[]{this, cVar});
            return;
        }
        synchronized (BluetoothStateBroadcastReceive.class) {
            if (cVar != null) {
                this.b.remove(cVar);
            }
        }
    }

    public BLUESTATUS a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BLUESTATUS) ipChange.ipc$dispatch("bcc443d0", new Object[]{this});
        }
        if (this.d == null) {
            this.d = BluetoothAdapter.getDefaultAdapter();
        }
        int profileConnectionState = this.d.getProfileConnectionState(1);
        if (this.d.getProfileConnectionState(2) == 2 || profileConnectionState == 2) {
            this.c = BLUESTATUS.CONNECT;
            this.f21341a = true;
        } else {
            this.c = BLUESTATUS.NOTCONNECT;
            this.f21341a = false;
        }
        return this.c;
    }
}
