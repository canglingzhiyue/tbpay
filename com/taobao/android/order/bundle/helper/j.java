package com.taobao.android.order.bundle.helper;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;
import java.util.HashMap;
import java.util.Map;
import tb.hyq;
import tb.jbg;
import tb.kge;
import tb.nyk;
import tb.oan;
import tb.rhy;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME_ORDER_DETAIL3 = "Page_OrderDetail_V3";

    /* renamed from: a  reason: collision with root package name */
    private static final String f14546a;
    private static final String b;
    private static final String[] c;
    private static volatile j g;
    private ContentObserver d;
    private HandlerThread e;
    private Handler f;
    private com.taobao.android.order.core.g h;
    private String i;
    private Map<String, rhy> j;
    private OrderConfigs k;

    public static /* synthetic */ String a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("695defab", new Object[]{jVar}) : jVar.i;
    }

    public static /* synthetic */ void a(j jVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebf1d50", new Object[]{jVar, map});
        } else {
            jVar.a(map);
        }
    }

    public static /* synthetic */ boolean a(j jVar, Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32858528", new Object[]{jVar, context, cursor})).booleanValue() : jVar.a(context, cursor);
    }

    public static /* synthetic */ boolean a(j jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2083902d", new Object[]{jVar, str, str2})).booleanValue() : jVar.a(str, str2);
    }

    public static /* synthetic */ Map b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("93758b8b", new Object[]{jVar}) : jVar.j;
    }

    public static /* synthetic */ com.taobao.android.order.core.g c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.order.core.g) ipChange.ipc$dispatch("33a48d7d", new Object[]{jVar}) : jVar.h;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f14546a;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : b;
    }

    public static /* synthetic */ String[] f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("3a68f47c", new Object[0]) : c;
    }

    static {
        kge.a(1225716444);
        f14546a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        b = MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        c = new String[]{"_display_name", "_data", "date_added"};
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("eb8e0e5b", new Object[0]);
        }
        if (g == null) {
            synchronized (j.class) {
                if (g == null) {
                    g = new j();
                }
            }
        }
        return g;
    }

    private j() {
        g();
    }

    private j g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("445b6015", new Object[]{this});
        }
        try {
            if (this.e == null) {
                this.e = jbg.a("order_screen_thread");
                this.e.start();
            }
            if (this.f == null) {
                this.f = new Handler(this.e.getLooper());
            }
            if (this.j == null) {
                this.j = new HashMap();
            }
            return g;
        } catch (Throwable unused) {
            hyq.a(null, "screenShot", "init", "1.0", "Out of memory", "", null);
            return null;
        }
    }

    public ContentObserver a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentObserver) ipChange.ipc$dispatch("3dfde0aa", new Object[]{this, context});
        }
        ContentObserver contentObserver = this.d;
        if (contentObserver != null) {
            return contentObserver;
        }
        this.d = new ContentObserver(this.f) { // from class: com.taobao.android.order.bundle.helper.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private long c = 0;

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0115, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
                r8.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
                return;
             */
            @Override // android.database.ContentObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onChange(boolean r8, android.net.Uri r9) {
                /*
                    Method dump skipped, instructions count: 328
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.helper.j.AnonymousClass1.onChange(boolean, android.net.Uri):void");
            }
        };
        return this.d;
    }

    private boolean a(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301e353b", new Object[]{this, context, cursor})).booleanValue();
        }
        try {
            long j = cursor.getLong(cursor.getColumnIndex("date_added"));
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis - j < 0) {
                j /= 1000;
            }
            return currentTimeMillis - j <= 30;
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorInfo", th.toString());
            hyq.a(context, "screenShot", "isInValidTimeInterval", "1.0", "", "", hashMap);
            return true;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.i;
    }

    public void a(String str, rhy rhyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf968bf", new Object[]{this, str, rhyVar});
        } else {
            this.j.put(str, rhyVar);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j.remove(str);
        }
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : (StringUtils.isEmpty(str) || (!str.toLowerCase().contains("tencent") && !str.toLowerCase().contains("qq") && !str.toLowerCase().contains(nyk.KEY_SHARE_CONFIG_WEIXIN) && !str.toLowerCase().contains("wechat"))) && str != null && str2 != null && (str2.toLowerCase().contains("screenshot") || str.toLowerCase().contains("screenshot") || str2.toLowerCase().contains("截屏") || str.toLowerCase().contains("截屏"));
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        OrderConfigs orderConfigs = this.k;
        if (orderConfigs == null) {
            return;
        }
        String n = orderConfigs.n();
        String o = this.k.o();
        if (StringUtils.isEmpty(n) || StringUtils.isEmpty(o)) {
            return;
        }
        map.put("searchKey", n);
        map.put(CoreConstants.IN_PARAM_ORDER_SEARCH_ID, o);
    }

    public void a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4366e18", new Object[]{this, orderConfigs});
        } else {
            this.k = orderConfigs;
        }
    }

    public void a(com.taobao.android.order.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f24e", new Object[]{this, gVar});
        } else {
            this.h = gVar;
        }
    }
}
