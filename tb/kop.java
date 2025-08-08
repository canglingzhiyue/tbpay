package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.flowcustoms.afc.utils.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class kop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(870167882);
    }

    public static /* synthetic */ void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            f(context);
        }
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        c.a("linkx", "AfcTkManager === registerTkFlag === 开始注册广告相关逻辑");
        if (!b(context)) {
            c.a("linkx", "AfcTkManager === registerTkFlag === 广告SDK不存在，不发起相关逻辑");
        } else if (StringUtils.equals("false", b.a().a("isAlimamaRequestAvailable", "true"))) {
            c.a("linkx", "AfcTkManager === registerTkFlag === 开关关闭，不发起广告SDK的相关逻辑");
        } else if (kog.a().f == null) {
            c.a("linkx", "AfcTkManager === registerTkFlag === 当前未注册，不发起广告SDK的相关逻辑");
        } else {
            if (StringUtils.equals(mpa.COLD, kog.a().c(mpa.COLD))) {
                c.a("linkx", "AfcTkManager === registerTkFlag === APP冷启动，发起广告SDK的相关逻辑");
                f(context);
            }
            kog.a().f.onEvent(new kof() { // from class: tb.kop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kof
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // tb.kof
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (!StringUtils.equals(mpa.HOT, kog.a().c(mpa.COLD))) {
                    } else {
                        c.a("linkx", "AfcTkManager === registerTkFlag === 热启动切到前台，发起广告SDK的相关逻辑");
                        kop.e(context);
                    }
                }
            });
        }
    }

    private static void f(final Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        try {
            Map<String, String> c = c(context);
            if (c != null && c.size() != 0) {
                if (StringUtils.equals("0", c.get("enable_cross_e"))) {
                    return;
                }
                if (!StringUtils.isEmpty(c.get("flux_disperse_config"))) {
                    i = Integer.parseInt(c.get("flux_disperse_config"));
                }
                c.a("linkx", "AfcTkManager === dealTkLogic === 打散请求时间：" + i);
                if (i <= 0) {
                    d(context);
                    return;
                }
                int a2 = a(i);
                c.a("linkx", "AfcTkManager === dealTkLogic === 随机打散时间：" + a2);
                d.b.a(new Runnable() { // from class: tb.kop.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kop.d(context);
                        }
                    }
                }, (long) (a2 * 1000));
                return;
            }
            c.a("linkx", "AfcTkManager === dealTkLogic === 获取的数据为空不处理");
        } catch (Exception e) {
            c.b("linkx", "AfcTkManager === dealTkLogic 异常：" + e);
        }
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0) {
            return new Random().nextInt(i);
        }
        return 0;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : g(context) != null;
    }

    private static Class<?> g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f8c386c7", new Object[]{context});
        }
        try {
            return Class.forName("com.taobao.alimama.AlimamaAdvertising", true, context.getClassLoader());
        } catch (Exception e) {
            c.b("linkx", "AfcTkManager === isAdSdkExist === 异常：" + e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    public static Map<String, String> c(Context context) {
        Map hashMap = new HashMap();
        try {
            Class<?> g = g(context);
            if (g == null) {
                return hashMap;
            }
            Map map = (Map) g.getMethod("getCrossTaokeEConfig", new Class[0]).invoke(g.getMethod("instance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            try {
                c.a("linkx", "AfcTkManager === isNeedTkRequest === 获取到的数据:" + map);
                return map;
            } catch (Exception e) {
                hashMap = map;
                e = e;
                c.b("linkx", "AfcTkManager === isNeedTkRequest === 异常：" + e);
                return hashMap;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void d(Context context) {
        try {
            Class<?> g = g(context);
            if (g == null) {
                return;
            }
            g.getMethod("syncCrossTaokeE", new Class[0]).invoke(g.getMethod("instance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            c.a("linkx", "AfcTkManager === sendTkRequest === 发起请求");
        } catch (Exception e) {
            c.b("linkx", "AfcTkManager === sendTkRequest，发起请求异常：" + e);
        }
    }
}
