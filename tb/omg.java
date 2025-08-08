package tb;

import android.app.Application;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.message.kit.util.Env;
import com.taobao.tao.messagekit.base.h;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.c;
import com.taobao.tao.powermsg.PowerMsgReceiver;
import com.taobao.tao.powermsg.common.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class omg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f32175a;
    public static long b;
    public static String c;
    public static Application d;
    public static Map<Integer, String> e;
    public static int f;
    public static int g;
    public static a h;
    private static int i;
    private static boolean j;
    private static int k;
    private static String l;
    private static boolean m;
    private static b n;

    /* loaded from: classes8.dex */
    public interface a {
        String a();

        String b();

        String c();

        Boolean d();
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    static {
        kge.a(1694164290);
        i = 0;
        j = false;
        k = -1;
        b = Long.MIN_VALUE;
        e = new HashMap();
        f = -1;
        g = 1;
        h = new a() { // from class: tb.omg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.omg.a
            public String a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "";
            }

            @Override // tb.omg.a
            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "";
            }

            @Override // tb.omg.a
            public String c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
                }
                return null;
            }

            @Override // tb.omg.a
            public Boolean d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Boolean) ipChange.ipc$dispatch("3a0effa8", new Object[]{this});
                }
                return null;
            }
        };
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        MsgLog.c("MsgEnvironment", "setInitSuccess");
        m = true;
        if (n == null) {
            return;
        }
        n = null;
    }

    public static void a(Application application, String str, String str2, int i2, Map<Integer, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68d2ad7", new Object[]{application, str, str2, new Integer(i2), map, aVar});
            return;
        }
        d = application;
        f32175a = str;
        c = str2;
        f = i2;
        e = map;
        iqv.a().a(application);
        if (aVar != null) {
            h = aVar;
        }
        try {
            if (Env.getApplication() == null) {
                Env.setGlobalAppContext(application);
            }
        } catch (Throwable th) {
            MsgLog.c("MsgEnvironment", "setGlobalAppContext e=" + th.getMessage());
        }
        h();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : m;
    }

    public static boolean c() {
        Boolean d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            d2 = (Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0]);
        } else {
            a aVar = h;
            if (aVar == null || aVar.d() == null) {
                if (k != 0) {
                    try {
                        j = (d.getApplicationInfo().flags & 2) != 0;
                        k = 0;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return j;
            }
            d2 = h.d();
        }
        return d2.booleanValue();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (!StringUtils.isEmpty(l)) {
            return "5.0.0";
        }
        try {
            String str = d.getPackageManager().getPackageInfo(d.getPackageName(), 0).versionName;
            l = str;
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "5.0.0";
        }
    }

    public static String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        try {
            return c.a(f32175a + c + System.currentTimeMillis() + (new Random().nextInt(TaobaoMediaPlayer.FFP_PROP_FLOAT_AUDIO_GAIN_VALUE) + 10000));
        } catch (Exception e2) {
            e2.printStackTrace();
            return (EncryptUtils.IV_PARAMETER_SPEC + System.currentTimeMillis()).substring(str.length() - 16);
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        String a2 = h.a();
        return a2 == null ? "" : a2;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        String b2 = h.b();
        return b2 == null ? "" : b2;
    }

    private static synchronized void h() {
        synchronized (omg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            } else if (StringUtils.isEmpty(f32175a) || StringUtils.isEmpty(c) || d == null || e == null) {
                throw new Error("deviceID | appKey | application | serviceMap not bind");
            } else {
                MsgLog.c("MsgEnvironment", "init ing");
                int i2 = i;
                i = i2 + 1;
                if (i2 > 0) {
                    MsgLog.c("MsgEnvironment", "has inited inited=" + i);
                    return;
                }
                d();
                c();
                b = h.a(f32175a);
                Intent intent = new Intent("com.taobao.tao.messagkit.receive");
                intent.putExtra("key", "init");
                new PowerMsgReceiver().a(d, intent);
                g.a();
            }
        }
    }
}
