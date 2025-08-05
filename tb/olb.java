package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.UploadTokenInfo;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.utils.d;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class olb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static String f32150a;
    private static String b;
    private static String c;
    private static Integer d;
    private static Integer e;
    private static Integer f;

    /* renamed from: lambda$H-Ct8q_1-JYj2z_AFlezCP7l16I */
    public static /* synthetic */ void m2471lambda$HCt8q_1JYj2z_AFlezCP7l16I(Long l) {
        a(l);
    }

    static {
        kge.a(1378137974);
        f32150a = "TLOG.StartUpRequestTask";
        b = "adapter.config";
        c = "logStartUp";
        d = 0;
        e = 10000;
        f = 10000;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            final Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (!a(f.a().j(), f.a().n()).booleanValue()) {
                f.a().h().a(oko.d, f32150a, "启动事件：不发送启动事件");
            } else {
                d.a().a(new Runnable() { // from class: tb.-$$Lambda$olb$H-Ct8q_1-JYj2z_AFlezCP7l16I
                    @Override // java.lang.Runnable
                    public final void run() {
                        olb.m2471lambda$HCt8q_1JYj2z_AFlezCP7l16I(valueOf);
                    }
                }, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e2) {
            Log.e(f32150a, "send startUpRequest error", e2);
            f.a().h().a(oko.c, f32150a, e2);
        }
    }

    public static /* synthetic */ void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{l});
            return;
        }
        try {
            f.a().h().a(oko.d, f32150a, "启动事件：发送启动事件");
            oll a2 = f.a().f().a();
            jhu jhuVar = new jhu();
            jhuVar.k = f.a().p();
            jhuVar.o = f.a().n();
            jhuVar.h = f.a().m();
            jhuVar.i = f.a().l();
            jhuVar.j = f.o();
            jhuVar.l = "RDWP_STARTUP";
            UploadTokenInfo uploadTokenInfo = new UploadTokenInfo();
            jhuVar.m = a2.f32157a;
            if (a2.f32157a.equals("oss") || a2.f32157a.equals("arup") || a2.f32157a.equals("ceph")) {
                uploadTokenInfo.put("ossBucketName", f.a().f20688a);
            }
            jhuVar.n = uploadTokenInfo;
            jhuVar.b = "android";
            jhuVar.c = Build.VERSION.RELEASE;
            jhuVar.f = Build.BRAND;
            jhuVar.f29565a = Build.MODEL;
            jhuVar.g = b();
            jhuVar.e = l;
            jhh a3 = jhuVar.a();
            if (a3 == null) {
                return;
            }
            okl.a(f.a().j(), a3, true);
        } catch (Exception e2) {
            Log.e(f32150a, "start up request build error", e2);
            f.a().h().a(oko.c, f32150a, e2);
        }
    }

    public static void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{num});
        } else if (num == null) {
        } else {
            f = num;
            okn h = f.a().h();
            String str = oko.d;
            String str2 = f32150a;
            h.a(str, str2, "启动事件：收到服务端采样配置,更新采样：" + num);
            a(f.a().n(), f.a().j(), b(num));
        }
    }

    private static Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{context, str});
        }
        String b2 = b(context);
        if (b2 == null) {
            f.a().h().a(oko.d, f32150a, "启动事件：文件内容不存在，执行随机采样");
            return a(str, context, c());
        }
        okn h = f.a().h();
        String str2 = oko.d;
        String str3 = f32150a;
        h.a(str2, str3, "启动事件：采样内容存在：" + b2);
        String[] split = b2.split(mly.UNESCAPED_SEPARATOR);
        if (split.length <= 1) {
            return false;
        }
        String str4 = split[0];
        try {
            Boolean valueOf = Boolean.valueOf(split[1]);
            if (str4.equals(str)) {
                return valueOf;
            }
            okn h2 = f.a().h();
            String str5 = oko.d;
            String str6 = f32150a;
            h2.a(str5, str6, "启动事件：版本号变更了，更新采样：" + b2);
            return a(str, context, c());
        } catch (Exception unused) {
            return false;
        }
    }

    private static synchronized Boolean a(String str, Context context, Boolean bool) {
        synchronized (olb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("695a5974", new Object[]{str, context, bool});
            }
            b(context, str + "^" + bool);
            return bool;
        }
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return "-";
        } catch (Exception e2) {
            okn h = f.a().h();
            String str = oko.f;
            String str2 = f32150a;
            h.b(str, str2, "启动事件：getLocalIpAddress 异常:" + e2.getMessage());
            return "-";
        }
    }

    private static Boolean b(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4d9185eb", new Object[]{num});
        }
        Integer d2 = d();
        if (num == null) {
            return c();
        }
        return !num.equals(0) && d2.intValue() > 0 && d2.intValue() <= num.intValue();
    }

    private static Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("efdd6667", new Object[0]);
        }
        int intValue = d().intValue();
        if (intValue > 0 && intValue <= f.intValue()) {
            return true;
        }
        return false;
    }

    private static Integer d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e4778d52", new Object[0]) : Integer.valueOf((new Random().nextInt(e.intValue()) % ((e.intValue() - d.intValue()) + 1)) + d.intValue());
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String str = context.getDir("tombstone", 0).getAbsolutePath() + File.separator + c;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        String a2 = a(context);
        g.a(a2 + File.separator + b, str);
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        String a2 = a(context);
        String c2 = g.c(a2 + File.separator + b);
        if (c2 != null && c2.length() > 0) {
            return c2;
        }
        return null;
    }
}
