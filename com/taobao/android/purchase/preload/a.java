package com.taobao.android.purchase.preload;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.phenix.cache.memory.f;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Drawable> f14762a;
    private static final Set<String> b;
    private static final Set<String> c;
    private static HashMap<String, Integer> d;
    private static long e;
    private static boolean f;

    public static /* synthetic */ void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            b(j);
        }
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : f14762a;
    }

    public static /* synthetic */ Set e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[0]) : b;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : e;
    }

    static {
        kge.a(1847780626);
        f14762a = new ConcurrentHashMap();
        b = new CopyOnWriteArraySet();
        c = new CopyOnWriteArraySet();
        f = false;
        d();
    }

    public static Drawable a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("c99d6048", new Object[]{str}) : f14762a.get(b(str));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !f14762a.isEmpty();
    }

    public static void a(final int i, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7afdac8d", new Object[]{new Integer(i), context});
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.preload.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    arc.a().a("触发购物车小图prealod", arc.a.a().a("AURA/performance").b());
                    if (a.c().size() >= a.e().size()) {
                        return;
                    }
                    a.a(a.e(), i, context);
                }
            });
        }
    }

    public static void a(Set<String> set, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2738bc", new Object[]{set, new Integer(i), context});
            return;
        }
        for (String str : set) {
            if (str != null) {
                a(str, i, context);
            }
        }
    }

    public static void a(String str, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8603d7", new Object[]{str, new Integer(i), context});
            return;
        }
        final String b2 = b(str);
        if (f14762a.containsKey(b2)) {
            return;
        }
        if (d.containsKey(str)) {
            f14762a.put(b2, ContextCompat.getDrawable(context, d.get(str).intValue()));
            return;
        }
        if (!f) {
            e = System.currentTimeMillis();
            f = true;
        }
        PhenixCreator failListener = com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.purchase.preload.a.3
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
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null && !succPhenixEvent.isIntermediate()) {
                    if (drawable instanceof f) {
                        ((f) drawable).a();
                    }
                    a.c().put(b2, drawable);
                    if (a.c().size() == a.e().size()) {
                        a.a(a.f());
                    }
                }
                return false;
            }
        }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.purchase.preload.a.2
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
                ard a2 = arc.a();
                a2.a("【下单小图】图片预加载失败:" + failPhenixEvent.getUrl(), arc.a.a().a("AURA/performance").b());
                return false;
            }
        });
        if (i > 0) {
            failListener.limitSize(null, i, i);
        }
        failListener.fetch();
    }

    private static void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j)});
            return;
        }
        long j2 = 0;
        for (Map.Entry<String, Drawable> entry : f14762a.entrySet()) {
            Drawable value = entry.getValue();
            if (value instanceof BitmapDrawable) {
                j2 += ((BitmapDrawable) value).getBitmap().getByteCount();
            }
        }
        ard a2 = arc.a();
        a2.a("【下单小图】preload成功。耗费内存" + (j2 / 1024.0d) + "KB。耗时：" + (System.currentTimeMillis() - j) + "mspreload图片成功率" + f14762a.size() + "-" + b.size() + " = " + ((f14762a.size() / b.size()) * 100) + riy.MOD, arc.a.a().a("AURA/performance").b());
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f14762a.clear();
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            arc.a().b("【下单小图】url格式错误 （TBBuyImagePreLoader#extractNameFromUrl）");
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        d = hashMap;
        hashMap.put("https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png", Integer.valueOf(R.drawable.location));
        d.put("https://img.alicdn.com/imgextra/i1/O1CN01VFY5Jb1tbPNzE4lwK_!!6000000005920-2-tps-32-32.png", Integer.valueOf(R.drawable.plus_sign));
        d.put("https://img.alicdn.com/imgextra/i1/O1CN01MTaKxl1DC1ZQfVKxt_!!6000000000179-2-tps-32-5.png", Integer.valueOf(R.drawable.minus_sign));
        d.put("https://gw.alicdn.com/imgextra/i3/O1CN016eG6gK1NRHAxMEpf4_!!6000000001566-2-tps-48-48.png", Integer.valueOf(R.drawable.right_arrow));
        Collections.addAll(b, "https://img.alicdn.com/imgextra/i4/O1CN01DhxFsl1Ug74Neipic_!!6000000002546-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01VFY5Jb1tbPNzE4lwK_!!6000000005920-2-tps-32-32.png", "https://img.alicdn.com/imgextra/i1/O1CN01MTaKxl1DC1ZQfVKxt_!!6000000000179-2-tps-32-5.png", "https://gw.alicdn.com/imgextra/i3/O1CN016eG6gK1NRHAxMEpf4_!!6000000001566-2-tps-48-48.png", "//img.alicdn.com/imgextra/i3/O1CN01VVKCEj1JLzy7JwdqC_!!6000000001013-2-tps-88-88.png", "//gw.alicdn.com/tfs/TB1CzD7SXXXXXXJaXXXXXXXXXXX-32-32.png", "//img.alicdn.com/tps/i2/TB1wopUHVXXXXXyXpXXAAT2HVXX-63-63.png", "https://img.alicdn.com/imgextra/i4/O1CN017rfbTj1hByBjCGYmw_!!6000000004240-2-tps-60-48.png", "https://img.alicdn.com/imgextra/i2/O1CN01tjnqoR1Jb79T2if5y_!!6000000001046-2-tps-48-48.png", "https://img.alicdn.com/imgextra/i2/O1CN01iuN6Bp1OCRp2vn6bD_!!6000000001669-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01SM1aqA278SzDahErR_!!6000000007752-2-tps-66-66.png", "//img.alicdn.com/imgextra/i2/O1CN01GU2o4m1VzBAjv2zYV_!!6000000002723-2-tps-66-66.png", "//img.alicdn.com/imgextra/i4/O1CN01U4WSFq1cwcGj2zGOS_!!6000000003665-2-tps-66-66.png", "https://img.alicdn.com/imgextra/i1/O1CN01QKhsKS23TkxhwpL7L_!!6000000007257-2-tps-32-32.png", "https://img.alicdn.com/imgextra/i1/O1CN01EuZ7xH1DaIamKYT04_!!6000000000232-2-tps-66-66.png");
        String string = AliBuyPerfSwitcher.getString("thumbnailPreloadBlacklistList", "https://gw.alicdn.com/imgextra/i4/O1CN01xiK5xl1RJGfUvuGsJ_!!6000000002090-2-tps-76-36.png,//img.alicdn.com/imgextra/i2/O1CN016XDyFB1scUjGwta3x_!!6000000005787-2-tps-28-28.png,https://img.alicdn.com/imgextra/i2/O1CN01Hmr2Ci26MNUuPMsFy_!!6000000007647-2-tps-360-72.png,https://img.alicdn.com/imgextra/i2/O1CN011M9pg41KJzseITw00_!!6000000001144-2-tps-104-72.png,https://img.alicdn.com/imgextra/i2/O1CN014TcqC329wVaSq99sF_!!6000000008132-2-tps-32-36.png,https://img.alicdn.com/imgextra/i3/O1CN01sc2SfN1rZSd24UOE6_!!6000000005645-2-tps-75-77.png,https://img.alicdn.com/imgextra/i4/O1CN01tpw7ik1UOiAdmPi2G_!!6000000002508-2-tps-78-81.png,https://img.alicdn.com/imgextra/i3/O1CN01gwu5kE1KNf6mnFpUB_!!6000000001152-2-tps-75-75.png");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        String[] split = string.split(",");
        ard a2 = arc.a();
        a2.a("小图url黑名单添加完成: " + string, arc.a.a().a("AURA/performance").b());
        Collections.addAll(c, split);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : c.contains(str) || str.contains("sns_logo");
    }
}
