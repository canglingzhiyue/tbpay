package tb;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.a;
import com.taobao.taobaoavsdk.util.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class ipw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ipw b;
    private static AudioManager d;
    private static boolean e;
    private static TelephonyManager k;
    private static boolean l;
    private static PhoneStateListener o;
    private static int p;
    private Runnable f;
    private final Handler c = new Handler(Looper.getMainLooper());
    private AtomicInteger g = new AtomicInteger(0);
    private final Set<MonitorMediaPlayer> n = Collections.synchronizedSet(new HashSet());

    public static /* synthetic */ PhoneStateListener a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhoneStateListener) ipChange.ipc$dispatch("4dc62faf", new Object[0]) : o;
    }

    public static /* synthetic */ PhoneStateListener a(PhoneStateListener phoneStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneStateListener) ipChange.ipc$dispatch("4699fc4e", new Object[]{phoneStateListener});
        }
        o = phoneStateListener;
        return phoneStateListener;
    }

    public static /* synthetic */ Runnable a(ipw ipwVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a94e8ae", new Object[]{ipwVar, runnable});
        }
        ipwVar.f = runnable;
        return runnable;
    }

    public static /* synthetic */ Set a(ipw ipwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("ab2fbe97", new Object[]{ipwVar}) : ipwVar.n;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ TelephonyManager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TelephonyManager) ipChange.ipc$dispatch("f5d86430", new Object[0]) : k;
    }

    public static /* synthetic */ AudioManager c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AudioManager) ipChange.ipc$dispatch("3ab90219", new Object[0]) : d;
    }

    static {
        kge.a(-649558994);
        p = 1000;
        e = false;
        l = false;
    }

    private ipw(Context context) {
        if (d == null || k == null) {
            p = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_DELAY_RELEASE_TIME_MS, "1000"));
            d = (AudioManager) context.getApplicationContext().getSystemService("audio");
            k = (TelephonyManager) context.getSystemService("phone");
        }
    }

    public static synchronized ipw a(Context context) {
        synchronized (ipw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ipw) ipChange.ipc$dispatch("34c4b3f6", new Object[]{context});
            }
            if (b == null) {
                b = new ipw(context);
            }
            return b;
        }
    }

    public void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860c7cd1", new Object[]{this, onAudioFocusChangeListener, new Integer(i)});
            return;
        }
        this.g.incrementAndGet();
        Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
            this.f = null;
            AVSDKLog.e(c.MODULE_SDK_PAGE, "removeCallbacks AudioFocusReleaseRunnable");
        }
        if (e) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "acquireAudioFocus, but has acquired focusCount is " + this.g.get());
        } else if (d == null) {
        } else {
            if (!b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableAudioFocusChangeListener", "false"))) {
                d.requestAudioFocus(null, 3, i);
            } else {
                d.requestAudioFocus(onAudioFocusChangeListener, 3, i);
            }
            e = true;
            AVSDKLog.e(c.MODULE_SDK_PAGE, "acquireAudioFocus successed");
        }
    }

    public void a(final AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca848472", new Object[]{this, onAudioFocusChangeListener});
            return;
        }
        this.g.decrementAndGet();
        if (!e) {
            return;
        }
        if (this.f == null && this.g.get() == 0) {
            this.f = new Runnable() { // from class: tb.ipw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (!b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enableAudioFocusChangeListener", "false"))) {
                        ipw.c().abandonAudioFocus(null);
                    } else {
                        ipw.c().abandonAudioFocus(onAudioFocusChangeListener);
                    }
                    ipw.a(ipw.this, (Runnable) null);
                    ipw.a(false);
                }
            };
            this.c.postDelayed(this.f, p);
        }
        AVSDKLog.e(c.MODULE_SDK_PAGE, "releaseAudioFocus has postDelayed");
    }

    public void a(MonitorMediaPlayer monitorMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd0e17b", new Object[]{this, monitorMediaPlayer});
            return;
        }
        this.n.add(monitorMediaPlayer);
        AVSDKLog.e(c.MODULE_SDK_PAGE, "PhoneStatelistener add successed");
        if (l) {
            return;
        }
        a.a().execute(new Runnable() { // from class: tb.ipw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (ipw.a() == null) {
                        ipw.a(new PhoneStateListener() { // from class: tb.ipw.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                                if (str.hashCode() == -1198008378) {
                                    super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                                    return null;
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                            }

                            @Override // android.telephony.PhoneStateListener
                            public void onCallStateChanged(int i, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
                                    return;
                                }
                                super.onCallStateChanged(i, str);
                                synchronized (ipw.a(ipw.this)) {
                                    for (MonitorMediaPlayer monitorMediaPlayer2 : ipw.a(ipw.this)) {
                                        if (monitorMediaPlayer2 instanceof TaobaoMediaPlayer) {
                                            if (!TaobaoMediaPlayer.isLibLoaded()) {
                                                return;
                                            }
                                            if (i != 0) {
                                                if (i == 1 && ((TaobaoMediaPlayer) monitorMediaPlayer2).isPlaying()) {
                                                    ((TaobaoMediaPlayer) monitorMediaPlayer2).setAutoPause(true);
                                                    AVSDKLog.e(c.MODULE_SDK_PAGE, "yezo:pause in CALL_STATE_RINGING");
                                                    ((TaobaoMediaPlayer) monitorMediaPlayer2).pause();
                                                }
                                            } else if (((TaobaoMediaPlayer) monitorMediaPlayer2).getAutoPause()) {
                                                ((TaobaoMediaPlayer) monitorMediaPlayer2).setAutoPause(false);
                                                try {
                                                    ((TaobaoMediaPlayer) monitorMediaPlayer2).start();
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                    if (ipw.b() == null || ipw.a() == null) {
                        return;
                    }
                    ipw.b().listen(ipw.a(), 32);
                    AVSDKLog.e(c.MODULE_SDK_PAGE, "SystemServiceManager " + this + ", PhoneStatelistener Start");
                } catch (Throwable th) {
                    AVSDKLog.e("AVDSK", "TELEPHONY_SERVICE listen LISTEN_CALL_STATE error: " + th.getMessage());
                }
            }
        });
        l = true;
    }

    public void b(MonitorMediaPlayer monitorMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0b92fc", new Object[]{this, monitorMediaPlayer});
            return;
        }
        this.n.remove(monitorMediaPlayer);
        AVSDKLog.e(c.MODULE_SDK_PAGE, "ClearSystemTelephoneService has postDelayed");
    }
}
