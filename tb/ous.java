package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.fetcher.TBSRCacheData;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import com.taobao.taobao.scancode.gateway.util.i;
import com.taobao.weex.common.WXPerformance;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public class ous extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f32438a;
    private static final String[] b;
    private static volatile ous c;
    private static LruCache<String, c> g;
    private SQLiteDatabase d;
    private int e;
    private ReentrantLock f;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f32440a;
        public final String b;

        static {
            kge.a(808811355);
        }

        public a(String str, String str2) {
            this.f32440a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f32441a;
        public final Map<String, Integer> b;

        static {
            kge.a(887998555);
        }

        public b(String str, Map<String, Integer> map) {
            this.f32441a = str;
            this.b = map;
        }
    }

    /* loaded from: classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public MtopTaobaoWirelessShopRouteProcessResponseData f32442a;
        public long b;

        static {
            kge.a(1984826955);
        }

        public c(MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, long j) {
            this.f32442a = mtopTaobaoWirelessShopRouteProcessResponseData;
            this.b = j;
        }
    }

    public static /* synthetic */ Object ipc$super(ous ousVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ SQLiteDatabase a(ous ousVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SQLiteDatabase) ipChange.ipc$dispatch("6b7bd344", new Object[]{ousVar}) : ousVar.b();
    }

    public static /* synthetic */ String a(ous ousVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e0407cb", new Object[]{ousVar, str}) : ousVar.b(str);
    }

    public static /* synthetic */ void a(ous ousVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str4) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a83bb3", new Object[]{ousVar, sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4});
        } else {
            ousVar.a(sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4);
        }
    }

    public static /* synthetic */ void a(ous ousVar, SQLiteDatabase sQLiteDatabase, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fc53fa", new Object[]{ousVar, sQLiteDatabase, new Boolean(z), str});
        } else {
            ousVar.a(sQLiteDatabase, z, str);
        }
    }

    public static /* synthetic */ void b(ous ousVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727e6ec", new Object[]{ousVar});
        } else {
            ousVar.c();
        }
    }

    static {
        kge.a(1851471044);
        f32438a = new String[]{"currentClickTime", "list_type", "list_param", "epid", "clickid", ecd.K_EFFECT_AD_TYPE, "spm", "spm-url", bip.KEY_UMBRELLA_SPM_PRE, "item_id", "pre_item_id", ShopRenderActivity.SHOP_NAVI, i.SOURCE_TYPE_KEY};
        b = new String[]{"currentClickTime", "list_type", "list_param", "epid", "clickid", ecd.K_EFFECT_AD_TYPE, "spm", "spm-url", bip.KEY_UMBRELLA_SPM_PRE, "item_id", "pre_item_id", i.SOURCE_TYPE_KEY};
        g = new LruCache<>(100);
    }

    private ous(Context context) {
        super(context, "shop_router.db", (SQLiteDatabase.CursorFactory) null, 3);
        this.e = 0;
        this.f = new ReentrantLock();
    }

    public static ous a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ous) ipChange.ipc$dispatch("34c78079", new Object[]{context});
        }
        if (c == null) {
            synchronized (ous.class) {
                if (c == null) {
                    c = new ous(context);
                }
            }
        }
        return c;
    }

    private SQLiteDatabase b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("3a215e06", new Object[]{this});
        }
        this.f.lock();
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            this.d = getWritableDatabase();
        }
        this.f.unlock();
        return this.d;
    }

    private void c() {
        SQLiteDatabase sQLiteDatabase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f.lock();
        int i = this.e - 1;
        this.e = i;
        if (i == 0 && (sQLiteDatabase = this.d) != null && sQLiteDatabase.isOpen()) {
            this.d.close();
        }
        this.f.unlock();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        Log.e(ShopConstants.PARAM_SHORTCUT, "onDowngrade");
        sQLiteDatabase.execSQL("drop table shop_router_cache");
        sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        Log.e(ShopConstants.PARAM_SHORTCUT, "onUpgrade");
        sQLiteDatabase.execSQL("drop table shop_router_cache");
        sQLiteDatabase.execSQL("create table if not exists shop_router_cache (keyName text, keyValue text, ruleSetName text, targetUrl text, cacheType text, createdTime INTEGER, shopId text, sellerId text, isTMall text, renderStyle text, primary key (keyName,keyValue,cacheType))");
    }

    public boolean a(TBSRCacheData tBSRCacheData) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8f5edf", new Object[]{this, tBSRCacheData})).booleanValue();
        }
        a("DELETE FROM shop_router_cache WHERE cacheType = 'remoteCache'");
        ArrayList<b> arrayList = new ArrayList();
        arrayList.add(new b("host", tBSRCacheData.getHost()));
        arrayList.add(new b("promotion", tBSRCacheData.getPromotion()));
        arrayList.add(new b("shopId", tBSRCacheData.getShopId()));
        arrayList.add(new b("sellerId", tBSRCacheData.getSellerId()));
        arrayList.add(new b("sellerNick", tBSRCacheData.getUserNick()));
        for (b bVar : arrayList) {
            if (!a(bVar, tBSRCacheData.getResult())) {
                z = false;
            }
        }
        return z;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a((SQLiteDatabase) null, true, str);
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201e5dd", new Object[]{this, sQLiteDatabase, new Boolean(z), str});
            return;
        }
        ouu.a("execSQL-- sqlComman is " + str);
        if (sQLiteDatabase == null) {
            try {
                try {
                    sQLiteDatabase = b();
                } catch (Exception e) {
                    Log.e("ShopCacheDBHelper", "deleteOldCache failed: " + e);
                    ouu.a("execSQL-- catch an exception: " + e.toString());
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || !z) {
                        return;
                    }
                    c();
                    return;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && z) {
                    c();
                }
                throw th;
            }
        }
        sQLiteDatabase.execSQL(str);
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || !z) {
            return;
        }
        c();
    }

    public void a(final String str, final String str2, final MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb9b101", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData, new Long(j)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: tb.ous.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
                if (r0.isOpen() == false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
                tb.ous.b(r10.e);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
                return;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [android.database.sqlite.SQLiteDatabase] */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v6, types: [tb.ous] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 291
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.ous.AnonymousClass1.run():void");
            }
        };
        if (com.taobao.tao.shop.fetcher.adapter.b.a().r()) {
            AsyncTask.execute(runnable);
        } else {
            runnable.run();
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData, String str4) throws SQLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3636af0", new Object[]{this, sQLiteDatabase, str, str2, str3, mtopTaobaoWirelessShopRouteProcessResponseData, str4});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("keyName", str);
        contentValues.put("keyValue", str2);
        contentValues.put("ruleSetName", str3);
        contentValues.put("targetUrl", b(mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl()));
        String str5 = "";
        contentValues.put("shopId", mtopTaobaoWirelessShopRouteProcessResponseData.getShopId() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getShopId() : str5);
        contentValues.put("sellerId", mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getSellerId() : str5);
        contentValues.put("isTMall", mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall() != null ? mtopTaobaoWirelessShopRouteProcessResponseData.getIsTmall() : str5);
        if (mtopTaobaoWirelessShopRouteProcessResponseData.getRenderStyle() != null) {
            str5 = mtopTaobaoWirelessShopRouteProcessResponseData.getRenderStyle();
        }
        contentValues.put("renderStyle", str5);
        contentValues.put(WXPerformance.CACHE_TYPE, str4);
        contentValues.put("createdTime", Long.valueOf(System.currentTimeMillis()));
        sQLiteDatabase.insert("shop_router_cache", null, contentValues);
    }

    private boolean a(b bVar, List<MtopTaobaoWirelessShopRouteProcessResponseData> list) {
        String str;
        MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3127122", new Object[]{this, bVar, list})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        String str2 = bVar.f32441a;
        Map<String, Integer> map = bVar.b;
        if (map != null && map.size() > 0) {
            SQLiteDatabase sQLiteDatabase = null;
            if ("host".equals(str2)) {
                str = ShopConstants.V_SHOP_RULESET_PERSONAL;
            } else if ("promotion".equals(str2)) {
                str = ShopConstants.V_SHOP_RULESET_PROMOTION;
            } else {
                str = ("shopId".equals(str2) || "sellerId".equals(str2) || "sellerNick".equals(str2)) ? ShopConstants.V_SHOP_RULESET_SHOP : null;
            }
            try {
                try {
                    SQLiteDatabase b2 = b();
                    try {
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            String key = entry.getKey();
                            int intValue = entry.getValue().intValue();
                            if (intValue >= 0 && intValue < list.size() && (mtopTaobaoWirelessShopRouteProcessResponseData = list.get(intValue)) != null) {
                                a(b2, str2, key, str, mtopTaobaoWirelessShopRouteProcessResponseData, "remoteCache");
                            }
                        }
                        if (b2 != null && b2.isOpen()) {
                            c();
                        }
                    } catch (Exception e) {
                        e = e;
                        sQLiteDatabase = b2;
                        Log.e("ShopCacheDBHelper", "save cache via SQLite failed: " + e);
                        ouu.a("saveCacheFromMap-- catch an exception: " + e.toString());
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            c();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = b2;
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            c();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return true;
    }

    public void a(String str, String str2, MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b480a23", new Object[]{this, str, str2, mtopTaobaoWirelessShopRouteProcessResponseData});
        } else if (TextUtils.isEmpty(str) || !b(str2, mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl())) {
        } else {
            g.put(b(str), new c(mtopTaobaoWirelessShopRouteProcessResponseData, System.currentTimeMillis()));
        }
    }

    public MtopTaobaoWirelessShopRouteProcessResponseData a(String str, long j) {
        MtopTaobaoWirelessShopRouteProcessResponseData mtopTaobaoWirelessShopRouteProcessResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoWirelessShopRouteProcessResponseData) ipChange.ipc$dispatch("ceb859ab", new Object[]{this, str, new Long(j)});
        }
        c cVar = g.get(b(str));
        if (cVar == null || (mtopTaobaoWirelessShopRouteProcessResponseData = cVar.f32442a) == null) {
            return null;
        }
        if (mtopTaobaoWirelessShopRouteProcessResponseData.isMiniAppRenderStyle()) {
            j = com.taobao.tao.shop.fetcher.adapter.b.a().j();
        }
        if (cVar.b < System.currentTimeMillis() - ((j * 60) * 1000)) {
            return null;
        }
        String shopTargetUrl = mtopTaobaoWirelessShopRouteProcessResponseData.getShopTargetUrl();
        if (TextUtils.isEmpty(shopTargetUrl)) {
            return null;
        }
        mtopTaobaoWirelessShopRouteProcessResponseData.setShopTargetUrl(com.taobao.tao.shop.rule.util.c.a(str, b(shopTargetUrl), false, (String) null));
        return mtopTaobaoWirelessShopRouteProcessResponseData;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ous.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData a(java.lang.String r29, java.lang.String r30, boolean r31, long r32) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ous.a(java.lang.String, java.lang.String, boolean, long):com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData");
    }

    private List<a> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        char c2 = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1993207176) {
            if (hashCode != 810288251) {
                if (hashCode == 1719388589 && str2.equals(ShopConstants.V_SHOP_RULESET_PROMOTION)) {
                    c2 = 1;
                }
            } else if (str2.equals(ShopConstants.V_SHOP_RULESET_PERSONAL)) {
                c2 = 0;
            }
        } else if (str2.equals(ShopConstants.V_SHOP_RULESET_SHOP)) {
            c2 = 2;
        }
        if (c2 == 0) {
            arrayList.add(new a("host", ouy.a(str)));
        } else if (c2 == 1) {
            arrayList.add(new a("promotion", ouy.b(str)));
        } else if (c2 == 2) {
            arrayList.add(new a("shopId", ouy.c(str)));
            arrayList.add(new a("sellerId", ouy.d(str)));
            arrayList.add(new a("sellerNick", ouy.e(str)));
        }
        return arrayList;
    }

    private boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!ShopConstants.V_SHOP_RULESET_SHOP.equals(str) && !ShopConstants.V_SHOP_RULESET_PERSONAL.equals(str)) {
            return false;
        }
        return com.taobao.tao.shop.rule.util.c.b(str2);
    }

    private String b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        Map<String, String> a2 = com.taobao.tao.shop.rule.util.c.a(parse);
        if (a2 == null || a2.isEmpty()) {
            return str;
        }
        String[] strArr = f32438a;
        if (com.taobao.tao.shop.fetcher.adapter.b.a().m()) {
            strArr = b;
        }
        for (String str3 : strArr) {
            a2.remove(str3);
        }
        String scheme = parse.getScheme();
        if ("http".equals(scheme)) {
            scheme = "https";
        }
        String host = parse.getHost();
        String path = parse.getPath();
        String fragment = parse.getFragment();
        if (!a2.isEmpty()) {
            str2 = "";
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(TextUtils.isEmpty(str2) ? "" : "&");
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                str2 = sb.toString();
            }
        } else {
            str2 = "";
        }
        return new ouz().a(scheme).b(host).c(path).d(str2).e(fragment).toString();
    }
}
