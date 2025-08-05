package com.taobao.trtc.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.h;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class TrtcAudioManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int u;

    /* renamed from: a  reason: collision with root package name */
    private Context f23057a;
    private final Runnable b;
    private AudioManager d;
    private b j;
    private BroadcastReceiver m;
    private AudioManager.OnAudioFocusChangeListener n;
    private boolean c = false;
    private int e = 0;
    private boolean f = false;
    private boolean g = false;
    private TrtcDefines.TrtcAudioRouteDevice h = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
    private final Set<AudioDevice> l = new HashSet();
    private BroadcastReceiver o = null;
    private boolean p = false;
    private boolean q = false;
    private Handler r = null;
    private boolean s = false;
    private a t = null;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = -1;
    private int z = 0;
    private boolean A = false;
    private String i = "speaker";
    private AudioDevice k = AudioDevice.UNKNOWN;

    /* renamed from: com.taobao.trtc.audio.TrtcAudioManager$6  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23063a = new int[AudioDevice.values().length];

        static {
            try {
                f23063a[AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23063a[AudioDevice.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23063a[AudioDevice.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23063a[AudioDevice.BLUETOOTH_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum AudioDevice {
        UNKNOWN,
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH_HEADSET
    }

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(int i);

        void a(boolean z);

        void b();
    }

    public static /* synthetic */ int a(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36d5cecb", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.x = i;
        return i;
    }

    public static /* synthetic */ void a(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d5558b", new Object[]{trtcAudioManager});
        } else {
            trtcAudioManager.e();
        }
    }

    public static /* synthetic */ void a(TrtcAudioManager trtcAudioManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d60ea9", new Object[]{trtcAudioManager, new Boolean(z)});
        } else {
            trtcAudioManager.e(z);
        }
    }

    public static /* synthetic */ int b(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f04d5c6a", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.y = i;
        return i;
    }

    public static /* synthetic */ AudioManager b(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioManager) ipChange.ipc$dispatch("d984b037", new Object[]{trtcAudioManager}) : trtcAudioManager.d;
    }

    public static /* synthetic */ boolean b(TrtcAudioManager trtcAudioManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04d9c4c", new Object[]{trtcAudioManager, new Boolean(z)})).booleanValue();
        }
        trtcAudioManager.A = z;
        return z;
    }

    public static /* synthetic */ int c(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7916da80", new Object[]{trtcAudioManager})).intValue() : trtcAudioManager.x;
    }

    public static /* synthetic */ int c(TrtcAudioManager trtcAudioManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9c4ea09", new Object[]{trtcAudioManager, new Integer(i)})).intValue();
        }
        trtcAudioManager.z = i;
        return i;
    }

    public static /* synthetic */ boolean d(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13b79d12", new Object[]{trtcAudioManager})).booleanValue() : trtcAudioManager.p;
    }

    public static /* synthetic */ boolean e(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae585f93", new Object[]{trtcAudioManager})).booleanValue() : trtcAudioManager.q;
    }

    public static /* synthetic */ Handler f(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("37d0b2b6", new Object[]{trtcAudioManager}) : trtcAudioManager.r;
    }

    public static /* synthetic */ int g(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e399e484", new Object[]{trtcAudioManager})).intValue() : trtcAudioManager.y;
    }

    public static /* synthetic */ a h(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2e02328a", new Object[]{trtcAudioManager}) : trtcAudioManager.t;
    }

    public static /* synthetic */ boolean i(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18db6997", new Object[]{trtcAudioManager})).booleanValue() : trtcAudioManager.l();
    }

    public static /* synthetic */ void j(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37c2c14", new Object[]{trtcAudioManager});
        } else {
            trtcAudioManager.j();
        }
    }

    public static /* synthetic */ int k(TrtcAudioManager trtcAudioManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e1cee88", new Object[]{trtcAudioManager})).intValue() : trtcAudioManager.z;
    }

    static {
        kge.a(872896268);
        u = 0;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.i.equals("auto")) {
        } else {
            TrtcLog.d("TrtcAudioManager", "onProximitySensorChangedState, effective");
            if (this.l.size() != 2 || !this.l.contains(AudioDevice.EARPIECE) || !this.l.contains(AudioDevice.SPEAKER_PHONE)) {
                return;
            }
            if (this.j.c()) {
                if (k()) {
                    a(AudioDevice.EARPIECE);
                }
            } else {
                a(AudioDevice.SPEAKER_PHONE);
            }
            c();
        }
    }

    public static TrtcAudioManager a(Context context, Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcAudioManager) ipChange.ipc$dispatch("712e55b", new Object[]{context, runnable}) : new TrtcAudioManager(context, runnable);
    }

    private TrtcAudioManager(Context context, Runnable runnable) {
        this.j = null;
        this.f23057a = context;
        this.b = runnable;
        this.d = (AudioManager) context.getSystemService("audio");
        this.j = b.a(context, new Runnable() { // from class: com.taobao.trtc.audio.TrtcAudioManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TrtcAudioManager.a(TrtcAudioManager.this);
                }
            }
        });
        com.taobao.trtc.audio.a.a("TrtcAudioManager");
    }

    public void a(boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb578f2", new Object[]{this, new Boolean(z), aVar});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "init, preferBlueTooth:" + z);
        if (this.c) {
            return;
        }
        if (this.j == null) {
            this.j = b.a(this.f23057a, new Runnable() { // from class: com.taobao.trtc.audio.TrtcAudioManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrtcAudioManager.a(TrtcAudioManager.this);
                    }
                }
            });
        }
        this.e = this.d.getMode();
        this.f = this.d.isSpeakerphoneOn();
        this.g = this.d.isMicrophoneMute();
        TrtcLog.d("TrtcAudioManager", "init, saved audiomanager mode:" + this.e + ", speakeron:" + this.f + ", micmute:" + this.g);
        this.n = new AudioManager.OnAudioFocusChangeListener() { // from class: com.taobao.trtc.audio.TrtcAudioManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAudioFocusChange(int r6) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.trtc.audio.TrtcAudioManager.AnonymousClass3.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L1a
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r1[r4] = r5
                    java.lang.Integer r2 = new java.lang.Integer
                    r2.<init>(r6)
                    r1[r3] = r2
                    java.lang.String r6 = "6a40fd0b"
                    r0.ipc$dispatch(r6, r1)
                    return
                L1a:
                    r0 = -3
                    if (r6 == r0) goto L42
                    r0 = -2
                    if (r6 == r0) goto L3f
                    r0 = -1
                    if (r6 == r0) goto L3c
                    if (r6 == r3) goto L39
                    if (r6 == r2) goto L36
                    r0 = 3
                    if (r6 == r0) goto L33
                    r0 = 4
                    if (r6 == r0) goto L30
                    java.lang.String r6 = "AUDIOFOCUS_INVALID"
                    goto L45
                L30:
                    java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE"
                    goto L45
                L33:
                    java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK"
                    goto L45
                L36:
                    java.lang.String r6 = "AUDIOFOCUS_GAIN_TRANSIENT"
                    goto L45
                L39:
                    java.lang.String r6 = "AUDIOFOCUS_GAIN"
                    goto L45
                L3c:
                    java.lang.String r6 = "AUDIOFOCUS_LOSS"
                    goto L44
                L3f:
                    java.lang.String r6 = "AUDIOFOCUS_LOSS_TRANSIENT"
                    goto L44
                L42:
                    java.lang.String r6 = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK"
                L44:
                    r3 = 0
                L45:
                    com.taobao.trtc.audio.TrtcAudioManager$a r0 = r2
                    if (r0 == 0) goto L4c
                    r0.a(r3)
                L4c:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "onAudioFocusChange: "
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r6 = r0.toString()
                    java.lang.String r0 = "TrtcAudioManager"
                    com.taobao.trtc.utils.TrtcLog.d(r0, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.trtc.audio.TrtcAudioManager.AnonymousClass3.onAudioFocusChange(int):void");
            }
        };
        int requestAudioFocus = this.d.requestAudioFocus(this.n, 0, 2);
        if (requestAudioFocus == 1) {
            TrtcLog.d("TrtcAudioManager", "Audio focus request granted for VOICE_CALL streams");
        } else {
            TrtcLog.a("TrtcAudioManager", "Audio focus request failed");
        }
        if (aVar != null) {
            aVar.a(requestAudioFocus == 1);
        }
        d(false);
        boolean l = l();
        TrtcLog.d("TrtcAudioManager", "init, has headset:" + l);
        e(l);
        f();
        this.p = z;
        if (z) {
            BluetoothAdapter bluetoothAdapter = null;
            if (Build.VERSION.SDK_INT >= 31) {
                if (ContextCompat.checkSelfPermission(this.f23057a, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    bluetoothAdapter = ((BluetoothManager) this.f23057a.getSystemService("bluetooth")).getAdapter();
                } else {
                    h.b("TrtcAudioManager", "android.permission.BLUETOOTH_CONNECT not granted");
                }
            } else {
                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            }
            if (bluetoothAdapter != null) {
                for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                    BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                    if (bluetoothClass != null) {
                        int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
                        int deviceClass = bluetoothClass.getDeviceClass();
                        TrtcLog.d("TrtcAudioManager", "bonded bluetooth device:" + majorDeviceClass + "/" + deviceClass);
                    }
                }
            }
            this.s = true;
            this.t = aVar;
            h();
        }
        this.c = true;
        this.h = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_NONE;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "close");
        if (!this.c) {
            return;
        }
        g();
        if (this.p) {
            i();
        }
        c(this.f);
        d(this.g);
        this.d.setMode(this.e);
        this.d.abandonAudioFocus(this.n);
        this.n = null;
        TrtcLog.d("TrtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
            this.j = null;
        }
        this.c = false;
    }

    public void a(AudioDevice audioDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a290b503", new Object[]{this, audioDevice});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "setAudioDevice(device=" + audioDevice + riy.BRACKET_END_STR);
        com.taobao.trtc.audio.a.a(this.l.contains(audioDevice));
        int i = AnonymousClass6.f23063a[audioDevice.ordinal()];
        if (i == 1) {
            c(true);
            this.k = AudioDevice.SPEAKER_PHONE;
        } else if (i == 2) {
            c(false);
            this.k = AudioDevice.EARPIECE;
        } else if (i == 3) {
            c(false);
            this.k = AudioDevice.WIRED_HEADSET;
        } else if (i == 4) {
            this.k = AudioDevice.BLUETOOTH_HEADSET;
        } else {
            TrtcLog.a("TrtcAudioManager", "Invalid audio device selection");
            this.k = AudioDevice.UNKNOWN;
        }
        m();
    }

    public AudioDevice b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioDevice) ipChange.ipc$dispatch("8ad99c68", new Object[]{this}) : this.k;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.m = new BroadcastReceiver() { // from class: com.taobao.trtc.audio.TrtcAudioManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                int intExtra = intent.getIntExtra("state", 0);
                int intExtra2 = intent.getIntExtra("microphone", 0);
                String stringExtra = intent.getStringExtra("name");
                StringBuilder sb = new StringBuilder();
                sb.append("BroadcastReceiver.onReceive");
                sb.append(com.taobao.trtc.audio.a.a());
                sb.append(": a=");
                sb.append(intent.getAction());
                sb.append(", s=");
                sb.append(intExtra == 0 ? "unplugged" : "plugged");
                sb.append(", m=");
                sb.append(intExtra2 == 1 ? "mic" : "no mic");
                sb.append(", n=");
                sb.append(stringExtra);
                sb.append(", sb=");
                sb.append(isInitialStickyBroadcast());
                TrtcLog.d("TrtcAudioManager", sb.toString());
                if (intExtra == 1) {
                    z = true;
                }
                if (intExtra == 0) {
                    TrtcAudioManager.a(TrtcAudioManager.this, z);
                } else if (intExtra != 1) {
                    TrtcLog.a("TrtcAudioManager", "Invalid state");
                } else {
                    TrtcAudioManager.a(TrtcAudioManager.this, z);
                }
            }
        };
        try {
            if (this.f23057a.registerReceiver(this.m, intentFilter) == null) {
                return;
            }
            this.v = true;
            TrtcLog.d("TrtcAudioManager", "wired headset receiver reg");
        } catch (Throwable th) {
            TrtcLog.a("TrtcAudioManager", "exception when start wired headset broadcast: " + th.getMessage());
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.m;
        if (broadcastReceiver != null && this.v) {
            this.f23057a.unregisterReceiver(broadcastReceiver);
            this.v = false;
            TrtcLog.d("TrtcAudioManager", "wired headset receiver unreg");
        }
        this.m = null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.d.isBluetoothScoAvailableOffCall()) {
            TrtcLog.d("TrtcAudioManager", "Bluetooth recording is not supported by current system");
        } else {
            TrtcLog.d("TrtcAudioManager", "Bluetooth recording is supported by current system");
            this.r = new Handler(Looper.getMainLooper()) { // from class: com.taobao.trtc.audio.TrtcAudioManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    } else if (message.what != 0) {
                    } else {
                        try {
                            TrtcAudioManager.b(TrtcAudioManager.this).startBluetoothSco();
                            TrtcAudioManager.b(TrtcAudioManager.this).setBluetoothScoOn(true);
                        } catch (NullPointerException unused) {
                            TrtcLog.d("TrtcAudioManager", "startBluetoothSco() failed. no bluetooth device connected.");
                        }
                    }
                }
            };
            try {
                this.o = new ScoBroadcastReceiver();
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.media.SCO_AUDIO_STATE_CHANGED");
                intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                if (this.f23057a.registerReceiver(this.o, intentFilter) == null) {
                    return;
                }
                this.w = true;
                TrtcLog.d("TrtcAudioManager", "sco receiver reg");
            } catch (Throwable th) {
                TrtcLog.a("TrtcAudioManager", "exception when start sco broadcast: " + th.getMessage());
            }
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Handler handler = this.r;
        if (handler != null) {
            handler.removeMessages(0);
            this.r = null;
        }
        this.d.stopBluetoothSco();
        if (this.w) {
            this.f23057a.unregisterReceiver(this.o);
            this.w = false;
            TrtcLog.d("TrtcAudioManager", "sco receiver unreg");
        }
        this.o = null;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.d.requestAudioFocus(this.n, 0, 2) == 1) {
                TrtcLog.d("TrtcAudioManager", "prepare4Talk: Audio focus request granted for VOICE_CALL streams");
            } else {
                TrtcLog.a("TrtcAudioManager", "prepare4Talk: Audio focus request failed");
            }
            this.e = this.d.getMode();
            this.f = this.d.isSpeakerphoneOn();
            this.g = this.d.isMicrophoneMute();
            if (this.p) {
                this.q = true;
                if (this.r != null) {
                    TrtcLog.d("TrtcAudioManager", "signalVoipRuning, try to start bluetooth SCO by myself");
                    this.r.sendEmptyMessageDelayed(0, 0L);
                }
            }
            TrtcLog.d("TrtcAudioManager", "prepare4Talk true, saved audiomanager mode:" + this.e + ", speakeron:" + this.f + ", micmute:" + this.g);
        } else {
            if (this.p) {
                this.q = false;
                TrtcLog.d("TrtcAudioManager", "signalVoipRuning, stop bluetooth SCO");
                this.d.stopBluetoothSco();
            }
            c(this.f);
            d(this.g);
            this.d.setMode(this.e);
            this.d.abandonAudioFocus(this.n);
        }
    }

    public void b(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "useSpeaker, " + z);
        if (z) {
            z2 = !this.i.equals("speaker");
            this.i = "speaker";
        } else {
            z2 = !this.i.equals("ear");
            this.i = "ear";
        }
        if (!z2) {
            return;
        }
        e(l());
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.i = "auto";
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.i = "ear";
        }
    }

    private void j() {
        TrtcDefines.TrtcAudioRouteDevice trtcAudioRouteDevice;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (this.d.isBluetoothScoOn() && this.A) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_BLUETOOTH_HEADSET;
        } else if (this.d.isSpeakerphoneOn()) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_SPEAKER;
        } else if (this.d.isWiredHeadsetOn()) {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_WIRED_HEADSET;
        } else {
            trtcAudioRouteDevice = TrtcDefines.TrtcAudioRouteDevice.E_AUDIO_ROUTE_EARPIECE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("new routeDevice: ");
        sb.append(trtcAudioRouteDevice.name());
        sb.append(", cur routeDevice: ");
        sb.append(this.h.name());
        sb.append(", audio device changed: ");
        if (this.h.ordinal() != trtcAudioRouteDevice.ordinal()) {
            z = true;
        }
        sb.append(z);
        TrtcLog.a("TrtcAudioManager", sb.toString());
        if (this.h == trtcAudioRouteDevice) {
            return;
        }
        h.a("TrtcAudioManager", "new routeDevice: " + trtcAudioRouteDevice.name() + ", cur routeDevice: " + this.h.name());
        a aVar = this.t;
        if (aVar != null) {
            aVar.a(trtcAudioRouteDevice.ordinal());
        }
        this.h = trtcAudioRouteDevice;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "set speaker on:" + z);
        this.d.setSpeakerphoneOn(z);
        j();
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.d.isMicrophoneMute() == z) {
        } else {
            h.a("setMicrophoneMute: " + z);
            this.d.setMicrophoneMute(z);
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f23057a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.d.isWiredHeadsetOn();
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        h.a("TrtcAudioManager", "updateAudioDeviceState, hasWiredHeadset:" + z);
        this.l.clear();
        if (this.A) {
            this.l.add(AudioDevice.BLUETOOTH_HEADSET);
        } else if (z) {
            this.l.add(AudioDevice.WIRED_HEADSET);
        } else {
            this.l.add(AudioDevice.SPEAKER_PHONE);
            if (k()) {
                this.l.add(AudioDevice.EARPIECE);
            }
        }
        TrtcLog.d("TrtcAudioManager", "audioDevices: " + this.l);
        if (this.A) {
            a(AudioDevice.BLUETOOTH_HEADSET);
        } else if (z) {
            a(AudioDevice.WIRED_HEADSET);
        } else if (this.i.equals("auto")) {
            a(AudioDevice.SPEAKER_PHONE);
        } else if (this.i.equals("speaker")) {
            a(AudioDevice.SPEAKER_PHONE);
        } else if (!k()) {
        } else {
            a(AudioDevice.EARPIECE);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcAudioManager", "onAudioManagerChangedState: devices=" + this.l + ", selected=" + this.k);
        if (this.l.size() == 2) {
            if (this.l.contains(AudioDevice.EARPIECE) && this.l.contains(AudioDevice.SPEAKER_PHONE)) {
                z = true;
            }
            com.taobao.trtc.audio.a.a(z);
            b bVar = this.j;
            if (bVar != null) {
                bVar.a();
            }
        } else if (this.l.size() == 1) {
            b bVar2 = this.j;
            if (bVar2 != null) {
                bVar2.b();
            }
        } else {
            TrtcLog.a("TrtcAudioManager", "Invalid device list");
        }
        Runnable runnable = this.b;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    /* loaded from: classes9.dex */
    public class ScoBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-481964503);
        }

        private ScoBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothClass bluetoothClass;
            BluetoothClass bluetoothClass2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice != null && (bluetoothClass2 = bluetoothDevice.getBluetoothClass()) != null) {
                    int majorDeviceClass = bluetoothClass2.getMajorDeviceClass();
                    int deviceClass = bluetoothClass2.getDeviceClass();
                    TrtcLog.d("TrtcAudioManager", "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED, major class:" + majorDeviceClass + "," + deviceClass);
                }
                TrtcAudioManager.a(TrtcAudioManager.this, intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1));
                TrtcLog.d("TrtcAudioManager", "BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED: " + TrtcAudioManager.c(TrtcAudioManager.this));
                if (TrtcAudioManager.c(TrtcAudioManager.this) == 2) {
                    if (!TrtcAudioManager.d(TrtcAudioManager.this) || !TrtcAudioManager.e(TrtcAudioManager.this) || TrtcAudioManager.f(TrtcAudioManager.this) == null) {
                        return;
                    }
                    TrtcAudioManager.f(TrtcAudioManager.this).sendEmptyMessageDelayed(0, 0L);
                } else if (TrtcAudioManager.c(TrtcAudioManager.this) != 0 || !TrtcAudioManager.d(TrtcAudioManager.this)) {
                } else {
                    TrtcAudioManager.b(TrtcAudioManager.this).stopBluetoothSco();
                }
            } else if (!action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            } else {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice2 != null && (bluetoothClass = bluetoothDevice2.getBluetoothClass()) != null) {
                    int majorDeviceClass2 = bluetoothClass.getMajorDeviceClass();
                    int deviceClass2 = bluetoothClass.getDeviceClass();
                    TrtcLog.d("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, major class:" + majorDeviceClass2 + "," + deviceClass2);
                }
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                TrtcLog.d("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, state: " + intExtra + ", prev state: " + intExtra2);
                if (intExtra == 0 && TrtcAudioManager.g(TrtcAudioManager.this) != -1 && intExtra2 == 1) {
                    TrtcLog.d("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is disconnected");
                    TrtcAudioManager.b(TrtcAudioManager.this, false);
                    h.a("TrtcAudioManager", "bluetooth disconnected");
                    if (TrtcAudioManager.h(TrtcAudioManager.this) != null) {
                        TrtcAudioManager.h(TrtcAudioManager.this).b();
                    }
                    TrtcAudioManager trtcAudioManager = TrtcAudioManager.this;
                    TrtcAudioManager.a(trtcAudioManager, TrtcAudioManager.i(trtcAudioManager));
                    TrtcAudioManager.j(TrtcAudioManager.this);
                }
                TrtcAudioManager.b(TrtcAudioManager.this, intExtra);
                TrtcAudioManager.c(TrtcAudioManager.this, intExtra2);
                if (TrtcAudioManager.g(TrtcAudioManager.this) == 1 && TrtcAudioManager.k(TrtcAudioManager.this) == 2) {
                    TrtcLog.d("TrtcAudioManager", "ACTION_SCO_AUDIO_STATE_UPDATED, bluetooth SCO is connected");
                    TrtcAudioManager.b(TrtcAudioManager.this, true);
                    h.a("TrtcAudioManager", "bluetooth connected");
                    if (TrtcAudioManager.h(TrtcAudioManager.this) != null) {
                        TrtcAudioManager.h(TrtcAudioManager.this).a();
                    }
                    TrtcAudioManager trtcAudioManager2 = TrtcAudioManager.this;
                    TrtcAudioManager.a(trtcAudioManager2, TrtcAudioManager.i(trtcAudioManager2));
                    TrtcAudioManager.j(TrtcAudioManager.this);
                }
                if (TrtcAudioManager.g(TrtcAudioManager.this) != 0 || TrtcAudioManager.k(TrtcAudioManager.this) != 2) {
                    return;
                }
                TrtcAudioManager trtcAudioManager3 = TrtcAudioManager.this;
                TrtcAudioManager.a(trtcAudioManager3, TrtcAudioManager.i(trtcAudioManager3));
                TrtcAudioManager.j(TrtcAudioManager.this);
            }
        }
    }
}
