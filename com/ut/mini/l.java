package com.ut.mini;

import android.app.Activity;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import tb.apr;
import tb.aqc;
import tb.bip;
import tb.kge;
import tb.rqb;
import tb.rqd;
import tb.rqf;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static l i;
    private static ArrayList<a> v;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, c> f24125a = new HashMap();
    private Queue<String> b = new LinkedList();
    private boolean h = false;
    private Map<String, String> j = new HashMap();
    private Map<String, b> k = new HashMap();
    private String l = null;
    private Map<String, String> m = new HashMap();
    private Map<String, String> n = new HashMap();
    private boolean o = false;
    private Map<String, String> p = null;
    private Map<String, String> q = null;
    private String r = null;
    private Queue<b> s = new LinkedList();
    private Map<String, String> t = new HashMap();
    private Queue<String> u = new LinkedList();
    private String c = null;
    private String d = null;
    private String e = null;
    private String f = null;
    private String g = null;
    private Map<String, d> w = new HashMap();
    private Set<String> x = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void onPageAppear(Object obj);

        void onPageDisAppear(Object obj);
    }

    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f24128a = 0;

        static {
            kge.a(1993560869);
        }
    }

    static {
        kge.a(421571613);
        i = new l();
        v = new ArrayList<>();
    }

    public static l getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("1c45d2ed", new Object[0]) : i;
    }

    public synchronized void turnOffAutoPageTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21c1f82", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (this.h) {
        } else {
            pageAppear(activity);
        }
    }

    public synchronized void a(Object obj, UTPageStatus uTPageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779472fd", new Object[]{this, obj, uTPageStatus});
        } else if (obj == null) {
        } else {
            apr.b("UTPageHitHelper", "setPageStatusCode pageObject", obj, "pageStatus", uTPageStatus);
            if (uTPageStatus == UTPageStatus.UT_PV_WITH_ROUTER_INDEX) {
                String l = l(obj);
                if (aqc.f(l)) {
                    this.x.add(l);
                }
                return;
            }
            n(obj).setPageStatus(uTPageStatus);
        }
    }

    public synchronized void a(Object obj, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7da93f", new Object[]{this, obj, new Integer(i2)});
        } else if (obj == null) {
        } else {
            apr.b("UTPageHitHelper", "setPageStatusCode pageObject", obj, "pageStatusCode", Integer.valueOf(i2));
            n(obj).setPageStatusCode(i2);
        }
    }

    public synchronized void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            apr.b("UTPageHitHelper", com.alibaba.triver.triver_shop.newShop.ext.m.SKIP_PAGE, obj);
            n(obj).setToSkipPage();
        }
    }

    public synchronized void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            apr.b("UTPageHitHelper", "skipBack", obj);
            c orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
            if (orNewUTPageStateObject != null) {
                orNewUTPageStateObject.f24127a = true;
            }
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        apr.b("UTPageHitHelper", "skipNextPageBack");
        this.o = true;
    }

    public synchronized void a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else if (obj == null) {
        } else {
            apr.b("UTPageHitHelper", "skipBackForever pageObject", obj, "skipBack", Boolean.valueOf(z));
            c orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
            if (orNewUTPageStateObject != null) {
                orNewUTPageStateObject.b = z;
            }
        }
    }

    @Deprecated
    public synchronized void pageAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52025aa7", new Object[]{this, obj});
        } else {
            a(obj, null, false, 0);
        }
    }

    public synchronized void a(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ab6186", new Object[]{this, obj, str, new Boolean(z)});
        } else {
            a(obj, str, z, 0);
        }
    }

    public synchronized void a(Object obj, String str, boolean z, int i2) {
        c c2;
        c c3;
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c1423d", new Object[]{this, obj, str, new Boolean(z), new Integer(i2)});
            return;
        }
        apr.b("UTPageHitHelper", "pageAppear pageObject", obj, "pageName", str, "isNotSkipFlag", Boolean.valueOf(z), "routerIndex", Integer.valueOf(i2));
        if (!UTAnalytics.getInstance().isInit()) {
            apr.e("UTPageHitHelper", com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_APPEAR, "Please initialize UT_Analytics first");
        } else if (obj == null) {
            apr.e(com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_APPEAR, "The page object should not be null");
        } else {
            boolean g = g(obj);
            apr.b("UTPageHitHelper", "pageAppear isPageWithRouter", Boolean.valueOf(g));
            if (g && i2 <= 0) {
                apr.c("UTPageHitHelper", "skip old pageAppear api in UT_PV_WITH_ROUTER_INDEX ~~~");
                return;
            }
            int i3 = !g ? 0 : i2;
            if (m(obj).equals(this.l)) {
                apr.c("UTPageHitHelper", "pageAppear repeat", this.l);
                return;
            }
            if (this.l != null) {
                apr.e("lost 2001", "Last page requires leave(" + this.l + ").");
            }
            b(obj, i3);
            String m = m(obj);
            b n = n(obj);
            if (!z && n.isSkipPage()) {
                apr.d("skip page[pageAppear]", "page name:" + obj.getClass().getSimpleName());
                return;
            }
            o.a();
            com.ut.mini.module.trackerlistener.b.getInstance().pageAppear(UTAnalytics.getInstance().getDefaultTracker(), obj, str, z);
            a(0, obj);
            rqf rqfVar = rqf.getInstance();
            rqfVar.addAction("pageAppear:" + obj.getClass().getSimpleName());
            if (!g && (b2 = q.a().b()) != null) {
                q.a().b(b2);
                Uri parse = Uri.parse(b2);
                String queryParameter = parse.getQueryParameter("spm");
                String queryParameter2 = parse.getQueryParameter("scm");
                if (aqc.f(queryParameter)) {
                    this.j.put("spm", queryParameter);
                }
                if (aqc.f(queryParameter2)) {
                    this.j.put("scm", queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("spmcnt");
                if (aqc.f(queryParameter3)) {
                    this.j.put("spm-cnt", queryParameter3);
                }
                q.a().a(null);
            }
            String j = j(obj);
            if (!g && rqd.bJTrackExtend) {
                try {
                    String pageName = rqb.getPageName(obj.getClass().getSimpleName());
                    if (!StringUtils.isEmpty(pageName)) {
                        if (pageName.toLowerCase().endsWith("activity")) {
                            pageName = pageName.substring(0, pageName.length() - 8);
                        }
                        apr.d("JTrack", "PageName", pageName);
                        j = pageName;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!aqc.e(str)) {
                j = str;
            }
            if (!aqc.e(n.getPageName())) {
                j = n.getPageName();
            }
            this.r = j;
            n.setPageName(j);
            n.setPageAppearTimestamp(System.currentTimeMillis());
            n.setPageStayTimstamp(SystemClock.elapsedRealtime());
            n.setRefPage(q.a().d());
            n.setPageAppearCalled();
            if (this.m != null) {
                this.p = this.m;
                n.setNextPageProperties(this.m);
                Map<String, String> pageProperties = n.getPageProperties();
                if (pageProperties == null) {
                    n.setPageProperties(this.m);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(pageProperties);
                    hashMap.putAll(this.m);
                    n.setPageProperties(hashMap);
                }
            }
            this.m = null;
            if (this.n != null) {
                this.q = this.n;
                n.setNextPageTmpProperties(this.n);
                Map<String, String> pageTmpProperties = n.getPageTmpProperties();
                if (pageTmpProperties == null) {
                    n.setPageTmpProperties(this.n);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(pageTmpProperties);
                    hashMap2.putAll(this.n);
                    n.setPageTmpProperties(hashMap2);
                }
            }
            this.n = null;
            this.l = m;
            if (this.o && (c3 = c(obj, i3)) != null) {
                c3.f24127a = true;
                this.o = false;
            }
            b(n);
            a(m, n);
            if (z && n.isSkipPage() && !g && (c2 = c(obj, i3)) != null) {
                c2.mIsFrame = true;
            }
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (this.h) {
        } else {
            pageDisAppear(activity, UTAnalytics.getInstance().getDefaultTracker());
        }
    }

    @Deprecated
    public synchronized void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            pageDisAppear(obj, UTAnalytics.getInstance().getDefaultTracker());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:23|(4:26|(1:28)|29|(5:33|(1:35)|36|37|38))|39|(2:41|(10:43|(1:49)|50|(1:52)(1:72)|53|(1:55)(1:71)|(1:57)(1:70)|(1:69)(1:61)|62|(1:65)))|73|(1:303)|77|(1:79)|80|(3:83|84|(27:86|(4:88|89|90|91)(1:299)|92|(1:94)|(23:96|(1:98)|99|(1:103)|105|(1:107)|108|(6:111|(1:113)|114|(1:118)|119|(15:121|122|(26:210|211|212|213|214|(8:216|217|218|219|220|221|(1:283)(1:225)|(1:227))(1:289)|229|230|231|232|233|234|236|237|(3:239|240|241)(1:271)|243|244|(3:246|247|248)(1:265)|249|(1:251)|252|(1:254)|255|(1:257)|259|260)(1:124)|125|(2:(4:128|(2:133|134)|188|134)(5:189|(4:191|(1:207)|197|(1:206))(1:208)|202|(1:204)|205)|135)(1:209)|136|137|(1:139)|141|(1:145)|146|(4:148|(1:152)|164|(3:166|(1:168)|169)(2:183|184))(1:185)|(2:154|(5:156|(1:158)(1:163)|159|(1:161)|162))|164|(0)(0)))|296|122|(0)(0)|125|(0)(0)|136|137|(0)|141|(2:143|145)|146|(0)(0)|(0)|164|(0)(0))|297|99|(2:101|103)|105|(0)|108|(6:111|(0)|114|(2:116|118)|119|(0))|296|122|(0)(0)|125|(0)(0)|136|137|(0)|141|(0)|146|(0)(0)|(0)|164|(0)(0)))|302|105|(0)|108|(0)|296|122|(0)(0)|125|(0)(0)|136|137|(0)|141|(0)|146|(0)(0)|(0)|164|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04cd, code lost:
        tb.apr.b("", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0249 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04c6 A[Catch: Exception -> 0x04cc, all -> 0x062c, TRY_LEAVE, TryCatch #1 {Exception -> 0x04cc, blocks: (B:232:0x04b4, B:234:0x04c6), top: B:294:0x04b4, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e2 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0502 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0515 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0598 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05c8 A[Catch: all -> 0x062c, TryCatch #5 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0020, B:11:0x0038, B:15:0x004c, B:17:0x0050, B:20:0x005e, B:22:0x0074, B:25:0x00a4, B:27:0x00aa, B:28:0x00c1, B:30:0x00c7, B:32:0x00cd, B:34:0x00df, B:35:0x00e1, B:38:0x00e9, B:40:0x00fd, B:42:0x0102, B:44:0x0108, B:46:0x0111, B:48:0x0117, B:49:0x0138, B:51:0x013e, B:53:0x0145, B:55:0x014e, B:58:0x0157, B:61:0x0160, B:68:0x0171, B:71:0x0179, B:64:0x0168, B:72:0x017c, B:74:0x0186, B:77:0x018e, B:79:0x0192, B:80:0x0197, B:106:0x0243, B:108:0x0249, B:109:0x0250, B:112:0x0256, B:115:0x0264, B:117:0x026a, B:119:0x0270, B:120:0x0277, B:124:0x0286, B:198:0x03bb, B:201:0x03c3, B:203:0x03c7, B:206:0x03cc, B:208:0x03ed, B:229:0x0444, B:232:0x04b4, B:234:0x04c6, B:238:0x04dc, B:240:0x04e2, B:242:0x04ee, B:243:0x04fa, B:245:0x0502, B:247:0x050a, B:252:0x0515, B:254:0x051f, B:256:0x0528, B:258:0x052f, B:261:0x0536, B:262:0x0550, B:264:0x0598, B:266:0x05a5, B:267:0x05ac, B:272:0x05fa, B:281:0x0617, B:273:0x05fe, B:275:0x0604, B:276:0x0608, B:278:0x060e, B:279:0x0612, B:268:0x05c8, B:269:0x05cf, B:237:0x04cd, B:207:0x03e1, B:209:0x03f0, B:211:0x0403, B:213:0x0412, B:215:0x0416, B:218:0x041f, B:220:0x0423, B:225:0x043b, B:227:0x043f, B:223:0x0429, B:217:0x041a, B:224:0x0435, B:195:0x03a1, B:270:0x05d0, B:284:0x061c), top: B:302:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void pageDisAppear(java.lang.Object r34, com.ut.mini.UTTracker r35) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.l.pageDisAppear(java.lang.Object, com.ut.mini.UTTracker):void");
    }

    private void a(c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c28b21", new Object[]{this, cVar, map});
        } else if (cVar == null || map == null) {
        } else {
            String str = map.get("force-spm-cnt");
            if (!StringUtils.isEmpty(str)) {
                cVar.mSpmCnt = str;
            }
            String str2 = map.get("force-spm-url");
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            cVar.mSpmUrl = str2;
        }
    }

    public synchronized void b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bde0f", new Object[]{this, obj, str});
            return;
        }
        apr.b("UTPageHitHelper", "updatePageName pageObject", obj, "pageName", str);
        if (obj != null && !aqc.e(str)) {
            n(obj).setPageName(str);
            this.r = str;
        }
    }

    public synchronized void a(Object obj, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c06d383", new Object[]{this, obj, uri});
        } else if (obj == null) {
        } else {
            if (apr.a()) {
                if (uri == null) {
                    apr.b("UTPageHitHelper", "updatePageUrl pageObject", obj, "uri is null");
                } else {
                    apr.b("UTPageHitHelper", "updatePageUrl pageObject", obj, "host", uri.getHost(), "query", uri.getQuery());
                }
            }
            n(obj).setPageUrl(uri);
            if (uri != null) {
                try {
                    queryParameter = uri.getQueryParameter("spmcnt");
                } catch (Throwable unused) {
                }
                if (aqc.f(queryParameter)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("spm-cnt", queryParameter);
                    a(obj, hashMap);
                }
            }
            m.a(obj);
        }
    }

    public synchronized void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        if (obj != null && map != null && map.size() != 0) {
            apr.b("UTPageHitHelper", "updatePageProperties pageObject", obj, "pageProperties", map);
            HashMap hashMap = new HashMap(map);
            b n = n(obj);
            Map<String, String> pageProperties = n.getPageProperties();
            if (pageProperties == null) {
                n.setPageProperties(hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(pageProperties);
                hashMap2.putAll(hashMap);
                n.setPageProperties(hashMap2);
            }
            m.a(obj);
            return;
        }
        apr.e("UTPageHitHelper", "failed to update project properties");
    }

    @Deprecated
    public synchronized void updatePageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
            return;
        }
        if (map != null) {
            apr.e("UTPageHitHelper", "UTPageHitHelper.updatePageProperties is deprecated.Please use UTAnalytics.getInstance().getDefaultTracker().updatePageProperties with PageObject parameter.");
            apr.b("UTPageHitHelper", "updatePageProperties pageProperties", map);
            this.j.putAll(map);
        }
    }

    public synchronized void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        if (obj != null && !aqc.e(str)) {
            apr.b("UTPageHitHelper", "updatePageUtparam pageObject", obj, "pageUtparam", str);
            Map<String, String> pageProperties = getPageProperties(obj);
            String str2 = "";
            if (pageProperties != null) {
                str2 = pageProperties.get("utparam-cnt");
            }
            String a2 = a(str, str2);
            if (!StringUtils.isEmpty(a2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("utparam-cnt", a2);
                a(obj, hashMap);
            }
            m.a(obj);
        }
    }

    public synchronized void b(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71381560", new Object[]{this, obj, map});
            return;
        }
        if (obj != null && map != null && map.size() != 0) {
            apr.b("UTPageHitHelper", "updatePageTmpProperties pageObject", obj, "properties", map);
            HashMap hashMap = new HashMap(map);
            b n = n(obj);
            Map<String, String> pageTmpProperties = n.getPageTmpProperties();
            if (pageTmpProperties == null) {
                n.setPageTmpProperties(hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(pageTmpProperties);
            hashMap2.putAll(hashMap);
            n.setPageTmpProperties(hashMap2);
            return;
        }
        apr.e("UTPageHitHelper", "failed to update project tmp properties");
    }

    public synchronized void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        if (map != null) {
            apr.b("UTPageHitHelper", "updateNextPageProperties pageProperties", map);
            if (this.m == null) {
                this.m = new HashMap(map);
                return;
            }
            this.m.putAll(map);
        }
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            apr.b("UTPageHitHelper", "updateNextPageUtparamCnt pageUtparamCnt", str);
            String str2 = "";
            if (this.m != null) {
                str2 = this.m.get("utparam-cnt");
            } else {
                this.m = new HashMap();
            }
            String a2 = a(str, str2);
            if (!StringUtils.isEmpty(a2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("utparam-cnt", a2);
                this.m.putAll(hashMap);
            }
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            apr.b("UTPageHitHelper", "updateNextPageUtparam pageUtparam", str);
            String str2 = "";
            if (this.m != null) {
                str2 = this.m.get(ag.KEY_UTPARAM_URL);
            } else {
                this.m = new HashMap();
            }
            String a2 = a(str, str2);
            if (!StringUtils.isEmpty(a2)) {
                HashMap hashMap = new HashMap();
                hashMap.put(ag.KEY_UTPARAM_URL, a2);
                this.m.putAll(hashMap);
            }
        }
    }

    public synchronized void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        if (map != null) {
            apr.b("UTPageHitHelper", "updateNextPageTmpProperties nextPageTmpProperties", map);
            if (this.n == null) {
                this.n = new HashMap(map);
                return;
            }
            this.n.putAll(map);
        }
    }

    public String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this}) : this.r;
    }

    public synchronized Map<String, String> getPageProperties(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            if (this.j != null) {
                hashMap.putAll(this.j);
            }
            Map<String, String> pageProperties = n(obj).getPageProperties();
            if (pageProperties != null) {
                hashMap.putAll(pageProperties);
            }
            return hashMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae A[Catch: all -> 0x012a, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0009, B:10:0x001d, B:13:0x0023, B:15:0x002d, B:18:0x003b, B:20:0x0045, B:23:0x0054, B:25:0x0061, B:26:0x0068, B:28:0x0076, B:30:0x007c, B:38:0x00a4, B:40:0x00ae, B:42:0x00b2, B:45:0x00b7, B:47:0x00c1, B:68:0x0110, B:46:0x00be, B:48:0x00c4, B:50:0x00ce, B:52:0x00dd, B:54:0x00e1, B:57:0x00e9, B:59:0x00ed, B:64:0x00ff, B:66:0x0103, B:67:0x0106, B:62:0x00f3, B:56:0x00e5, B:63:0x00fa, B:71:0x011c), top: B:85:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: all -> 0x012a, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0009, B:10:0x001d, B:13:0x0023, B:15:0x002d, B:18:0x003b, B:20:0x0045, B:23:0x0054, B:25:0x0061, B:26:0x0068, B:28:0x0076, B:30:0x007c, B:38:0x00a4, B:40:0x00ae, B:42:0x00b2, B:45:0x00b7, B:47:0x00c1, B:68:0x0110, B:46:0x00be, B:48:0x00c4, B:50:0x00ce, B:52:0x00dd, B:54:0x00e1, B:57:0x00e9, B:59:0x00ed, B:64:0x00ff, B:66:0x0103, B:67:0x0106, B:62:0x00f3, B:56:0x00e5, B:63:0x00fa, B:71:0x011c), top: B:85:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map<java.lang.String, java.lang.String> c(android.app.Activity r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.l.c(android.app.Activity):java.util.Map");
    }

    public synchronized String d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1861f643", new Object[]{this, activity});
        }
        Map<String, String> c2 = c(activity);
        if (c2 == null) {
            return "";
        }
        String str = c2.get("spm-url");
        return aqc.e(str) ? "" : str;
    }

    public synchronized String e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4e5fa2", new Object[]{this, activity});
        }
        Map<String, String> c2 = c(activity);
        if (c2 == null) {
            return "";
        }
        String str = c2.get(bip.KEY_UMBRELLA_SPM_PRE);
        return aqc.e(str) ? "" : str;
    }

    public synchronized String f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e3ac901", new Object[]{this, activity});
        }
        Map<String, String> c2 = c(activity);
        if (c2 == null) {
            return "";
        }
        String str = c2.get("scm-pre");
        return aqc.e(str) ? "" : str;
    }

    public static synchronized void addPageChangerListener(a aVar) {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ce12001", new Object[]{aVar});
            } else if (aVar == null) {
            } else {
                if (!v.contains(aVar)) {
                    v.add(aVar);
                }
            }
        }
    }

    public static synchronized void a(int i2, Object obj) {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d36ff2b7", new Object[]{new Integer(i2), obj});
                return;
            }
            int size = v.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = v.get(i3);
                if (aVar != null) {
                    if (i2 == 0) {
                        aVar.onPageAppear(obj);
                    } else {
                        aVar.onPageDisAppear(obj);
                    }
                }
            }
        }
    }

    public void setLastCacheKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee99286", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setLastCacheKeySpmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454ffb45", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setLastCacheKeyScmUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c322178", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void setLastCacheKeyUtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f0938a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setLastCacheKeyUtParamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e10f81", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public String getLastCacheKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3bd0dff0", new Object[]{this}) : this.c;
    }

    public String getLastCacheKeySpmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ae30a51", new Object[]{this}) : this.d;
    }

    public String getLastCacheKeyScmUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62d9d1be", new Object[]{this}) : this.e;
    }

    public String getLastCacheKeyUtParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("410921d4", new Object[]{this}) : this.f;
    }

    public String getLastCacheKeyUtParamCnt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1245895", new Object[]{this}) : this.g;
    }

    private void b(Object obj, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7f381e", new Object[]{this, obj, new Integer(i2)});
        } else if (i2 <= 0) {
        } else {
            String l = l(obj);
            if (this.w.containsKey(l)) {
                d dVar = this.w.get(l);
                if (dVar == null) {
                    return;
                }
                int i3 = dVar.f24128a;
                dVar.f24128a = i2;
                String d2 = d(obj, i2);
                c orNewUTPageStateObject = getOrNewUTPageStateObject(obj);
                boolean z = orNewUTPageStateObject.mIsSwitchBackground;
                a(orNewUTPageStateObject);
                if (i2 < i3) {
                    orNewUTPageStateObject.mIsBack = true;
                    return;
                } else if (i2 != i3) {
                    return;
                } else {
                    if (z) {
                        orNewUTPageStateObject.mIsSwitchBackground = true;
                        return;
                    } else if (d2.equalsIgnoreCase(this.c)) {
                        orNewUTPageStateObject.mIsFrame = true;
                        return;
                    } else {
                        orNewUTPageStateObject.mIsBack = true;
                        return;
                    }
                }
            }
            d dVar2 = new d();
            dVar2.f24128a = i2;
            this.w.put(l, dVar2);
        }
    }

    private void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d18be4", new Object[]{this, cVar});
            return;
        }
        cVar.mIsBack = false;
        cVar.mIsFrame = false;
        cVar.mIsSwitchBackground = false;
        cVar.f24127a = false;
        cVar.b = false;
        cVar.mIsH5Page = false;
    }

    private boolean g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634ea9ce", new Object[]{this, obj})).booleanValue();
        }
        String l = l(obj);
        if (!aqc.f(l)) {
            return false;
        }
        return this.x.contains(l);
    }

    private int h(Object obj) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad8042fe", new Object[]{this, obj})).intValue();
        }
        String l = l(obj);
        if (this.w.containsKey(l) && (dVar = this.w.get(l)) != null) {
            return dVar.f24128a;
        }
        return 0;
    }

    private synchronized void k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c150ece", new Object[]{this, obj});
            return;
        }
        String l = l(obj);
        if (this.w.containsKey(l)) {
            if (this.w.get(l) == null) {
                return;
            }
            String str = l + "###";
            Iterator<Map.Entry<String, c>> it = this.f24125a.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (key != null && key.startsWith(str)) {
                    it.remove();
                }
            }
            this.w.remove(l);
        }
        this.x.remove(l);
    }

    private String l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48a48c71", new Object[]{this, obj});
        }
        if (!(obj instanceof Activity)) {
            return "";
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }

    /* loaded from: classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mSpmCnt = null;
        public String mSpmUrl = null;
        public String mSpmPre = null;
        public boolean mIsBack = false;
        public boolean mIsFrame = false;
        public boolean mIsSwitchBackground = false;
        public String mUtparamCnt = null;
        public String mUtparamUrl = null;
        public String mUtparamPre = null;
        public String mScmUrl = null;
        public String mScmPre = null;

        /* renamed from: a  reason: collision with root package name */
        public boolean f24127a = false;
        public boolean b = false;
        public boolean mIsH5Page = false;

        static {
            kge.a(-1813442629);
        }

        public Map<String, String> getPageStatMap(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2eebfa1f", new Object[]{this, new Boolean(z)});
            }
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(this.mSpmCnt)) {
                hashMap.put("spm-cnt", this.mSpmCnt);
            }
            if (!StringUtils.isEmpty(this.mSpmUrl)) {
                hashMap.put("spm-url", this.mSpmUrl);
            }
            if (!StringUtils.isEmpty(this.mSpmPre)) {
                hashMap.put(bip.KEY_UMBRELLA_SPM_PRE, this.mSpmPre);
            }
            if (!StringUtils.isEmpty(this.mScmPre)) {
                hashMap.put("scm-pre", this.mScmPre);
            }
            if (this.mIsSwitchBackground) {
                hashMap.put("isbf", "1");
            } else if (this.mIsFrame && z) {
                hashMap.put("isfm", "1");
            } else if (this.mIsBack) {
                hashMap.put("ut_isbk", "1");
            }
            if (!StringUtils.isEmpty(this.mUtparamCnt)) {
                hashMap.put("utparam-cnt", this.mUtparamCnt);
            }
            if (!StringUtils.isEmpty(this.mUtparamUrl)) {
                hashMap.put(ag.KEY_UTPARAM_URL, this.mUtparamUrl);
            }
            if (!StringUtils.isEmpty(this.mUtparamPre)) {
                hashMap.put("utparam-pre", this.mUtparamPre);
            }
            return hashMap;
        }
    }

    private c b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ca0c6cff", new Object[]{this, cVar});
        }
        if (cVar == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.mSpmCnt = cVar.mSpmCnt;
        cVar2.mSpmUrl = cVar.mSpmUrl;
        cVar2.mSpmPre = cVar.mSpmPre;
        cVar2.mIsBack = cVar.mIsBack;
        cVar2.mIsFrame = cVar.mIsFrame;
        cVar2.mIsSwitchBackground = cVar.mIsSwitchBackground;
        cVar2.mUtparamCnt = cVar.mUtparamCnt;
        cVar2.mUtparamUrl = cVar.mUtparamUrl;
        cVar2.mUtparamPre = cVar.mUtparamPre;
        cVar2.mScmUrl = cVar.mScmUrl;
        cVar2.mScmPre = cVar.mScmPre;
        cVar2.f24127a = cVar.f24127a;
        cVar2.b = cVar.b;
        return cVar2;
    }

    public synchronized c getOrNewUTPageStateObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b00f033a", new Object[]{this, obj});
        } else if (!(obj instanceof Activity)) {
            return null;
        } else {
            String m = m(obj);
            if (!this.b.contains(m)) {
                this.b.add(m);
            }
            if (this.f24125a.containsKey(m)) {
                return this.f24125a.get(m);
            }
            c cVar = new c();
            this.f24125a.put(m, cVar);
            return cVar;
        }
    }

    private synchronized c c(Object obj, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3329b979", new Object[]{this, obj, new Integer(i2)});
        } else if (!(obj instanceof Activity)) {
            return null;
        } else {
            String d2 = d(obj, i2);
            if (!this.b.contains(d2)) {
                this.b.add(d2);
            }
            if (this.f24125a.containsKey(d2)) {
                return this.f24125a.get(d2);
            }
            c cVar = new c();
            this.f24125a.put(d2, cVar);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f24126a = new HashMap();
        private long b = 0;
        private long c = 0;
        private Uri d = null;
        private String e = null;
        private String f = null;
        private UTPageStatus g = null;
        private boolean h = false;
        private boolean i = false;
        private boolean j = false;
        private String k = null;
        private int l = 0;
        private Map<String, String> m = null;
        private Map<String, String> n = new HashMap();
        private Map<String, String> o = null;

        static {
            kge.a(1396855556);
        }

        public void setPageProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b020637a", new Object[]{this, map});
            } else {
                this.f24126a = map;
            }
        }

        public Map<String, String> getPageProperties() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a7f3a94", new Object[]{this}) : this.f24126a;
        }

        public void setNextPageProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d27b3c7", new Object[]{this, map});
            } else {
                this.m = map;
            }
        }

        public Map<String, String> getNextPageProperties() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5e7392a7", new Object[]{this}) : this.m;
        }

        public void setPageTmpProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9badac65", new Object[]{this, map});
            } else {
                this.n = map;
            }
        }

        public Map<String, String> getPageTmpProperties() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f1494de1", new Object[]{this}) : this.n;
        }

        public void setNextPageTmpProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c75cf8", new Object[]{this, map});
            } else {
                this.o = map;
            }
        }

        public Map<String, String> getNextPageTmpProperties() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d0de98ee", new Object[]{this}) : this.o;
        }

        public void setCacheKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c476ef50", new Object[]{this, str});
            } else {
                this.k = str;
            }
        }

        public String getCacheKey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this}) : this.k;
        }

        public void resetPropertiesWithoutSkipFlagAndH5Flag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2601866", new Object[]{this});
                return;
            }
            this.f24126a = new HashMap();
            this.n = new HashMap();
            this.b = 0L;
            this.c = 0L;
            this.d = null;
            this.e = null;
            this.f = null;
            UTPageStatus uTPageStatus = this.g;
            if (uTPageStatus == null || uTPageStatus != UTPageStatus.UT_H5_IN_WebView) {
                this.g = null;
            }
            this.h = false;
            this.j = false;
            this.l = 0;
            this.m = null;
            this.o = null;
        }

        public boolean isH5Called() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b959e47f", new Object[]{this})).booleanValue() : this.j;
        }

        public void setH5Called() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7df67fb3", new Object[]{this});
            } else {
                this.j = true;
            }
        }

        public void setToSkipPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b1f1952", new Object[]{this});
            } else {
                this.i = true;
            }
        }

        public boolean isSkipPage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca155483", new Object[]{this})).booleanValue() : this.i;
        }

        public void setPageAppearCalled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("251ed2a", new Object[]{this});
            } else {
                this.h = true;
            }
        }

        public boolean isPageAppearCalled() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb8809f6", new Object[]{this})).booleanValue() : this.h;
        }

        public void setPageStatus(UTPageStatus uTPageStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("676435a3", new Object[]{this, uTPageStatus});
            } else {
                this.g = uTPageStatus;
            }
        }

        public UTPageStatus getPageStatus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UTPageStatus) ipChange.ipc$dispatch("99feab1", new Object[]{this}) : this.g;
        }

        public long getPageAppearTimestamp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e155bb7", new Object[]{this})).longValue() : this.b;
        }

        public void setPageAppearTimestamp(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4635c6d", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public long getPageStayTimstamp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a2d1b44", new Object[]{this})).longValue() : this.c;
        }

        public void setPageStayTimstamp(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8977e8", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public Uri getPageUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d05f8ee8", new Object[]{this}) : this.d;
        }

        public void setPageUrl(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f69e8c2", new Object[]{this, uri});
            } else {
                this.d = uri;
            }
        }

        public void setPageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public String getPageName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.e;
        }

        public void setRefPage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb619191", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public String getRefPage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("523494ed", new Object[]{this}) : this.f;
        }

        public void setPageStatusCode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e53f6c", new Object[]{this, new Integer(i)});
            } else {
                this.l = i;
            }
        }

        public int getPageStatusCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9960005e", new Object[]{this})).intValue() : this.l;
        }
    }

    private String m(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9fc27d50", new Object[]{this, obj}) : d(obj, h(obj));
    }

    private String d(Object obj, int i2) {
        String simpleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a86a9244", new Object[]{this, obj, new Integer(i2)});
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        StringBuilder sb = new StringBuilder(64);
        sb.append(simpleName);
        sb.append(hashCode);
        if (i2 > 0) {
            sb.append("###");
            sb.append(i2);
        }
        String sb2 = sb.toString();
        apr.b("UTPageHitHelper", "PageCacheKey", sb2);
        return sb2;
    }

    private synchronized b n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("530124ee", new Object[]{this, obj});
        }
        String m = m(obj);
        if (this.k.containsKey(m)) {
            return this.k.get(m);
        }
        b bVar = new b();
        this.k.put(m, bVar);
        bVar.setCacheKey(m);
        return bVar;
    }

    private synchronized void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecd84fb", new Object[]{this, str, bVar});
        } else {
            this.k.put(str, bVar);
        }
    }

    private synchronized void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b56d224", new Object[]{this, bVar});
        } else {
            this.k.remove(bVar.getCacheKey());
        }
    }

    private synchronized void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b1dc4c", new Object[]{this, obj});
        } else {
            this.k.remove(m(obj));
        }
    }

    public synchronized String getPageUrl(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a16f8af3", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            b n = n(obj);
            if (n == null || n.getPageUrl() == null) {
                return null;
            }
            return n.getPageUrl().toString();
        }
    }

    public synchronized void pageDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19526863", new Object[]{this, activity});
            return;
        }
        k(activity);
        String m = m(activity);
        this.f24125a.remove(m);
        this.b.remove(m);
        c();
    }

    public synchronized void pageSwitchBackground() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf12438", new Object[]{this});
            return;
        }
        if (this.f24125a.containsKey(this.c) && (cVar = this.f24125a.get(this.c)) != null) {
            cVar.mIsSwitchBackground = true;
        }
    }

    public synchronized void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            return;
        }
        if (obj != null) {
            b n = n(obj);
            if (n.getPageStatus() != null) {
                n.setH5Called();
            }
        }
    }

    public synchronized boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue();
        } else if (obj == null || !c(n(obj))) {
            apr.b("UTPageHitHelper", "isH52001:false pageObject", obj);
            return false;
        } else {
            apr.b("UTPageHitHelper", "isH52001:true pageObject", obj);
            return true;
        }
    }

    public static Map<String, String> encodeUtParam(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c19aa9b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("utparam-cnt");
            if (!StringUtils.isEmpty(str)) {
                map.put("utparam-cnt", URLEncoder.encode(str));
            }
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
        try {
            String str2 = map.get(ag.KEY_UTPARAM_URL);
            if (!StringUtils.isEmpty(str2)) {
                map.put(ag.KEY_UTPARAM_URL, URLEncoder.encode(str2));
            }
        } catch (Throwable th2) {
            apr.b(null, th2, new Object[0]);
        }
        try {
            String str3 = map.get("utparam-pre");
            if (!StringUtils.isEmpty(str3)) {
                map.put("utparam-pre", URLEncoder.encode(str3));
            }
        } catch (Throwable th3) {
            apr.b(null, th3, new Object[0]);
        }
        try {
            String str4 = map.get("ut_seq");
            if (!StringUtils.isEmpty(str4)) {
                map.put("ut_seq", URLEncoder.encode(str4));
            }
        } catch (Throwable th4) {
            apr.b(null, th4, new Object[0]);
        }
        return map;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        try {
            Map<String, Object> map = null;
            Map<String, Object> d2 = !StringUtils.isEmpty(str) ? d(str) : null;
            if (!StringUtils.isEmpty(str2)) {
                map = d(str2);
            }
            if (!c(d2) && !c(map)) {
                map.putAll(d2);
                d(map);
                return JSON.toJSONString(map);
            } else if (!c(d2) && c(map)) {
                d(d2);
                return JSON.toJSONString(d2);
            } else if (!c(d2) || c(map)) {
                return "";
            } else {
                d(map);
                return JSON.toJSONString(map);
            }
        } catch (Exception e) {
            apr.b("", e);
            return "";
        }
    }

    public synchronized Map<String, String> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42d7dd79", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            return n(obj).getNextPageProperties();
        }
    }

    public synchronized Map<String, String> b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("567fb0fa", new Object[]{this, obj});
        } else if (obj == null) {
            return null;
        } else {
            return n(obj).getNextPageTmpProperties();
        }
    }

    private synchronized void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d11785", new Object[]{this, bVar});
            return;
        }
        bVar.resetPropertiesWithoutSkipFlagAndH5Flag();
        if (!this.s.contains(bVar)) {
            this.s.add(bVar);
        }
        if (this.s.size() > 200) {
            for (int i2 = 0; i2 < 100; i2++) {
                b poll = this.s.poll();
                if (poll != null) {
                    this.k.remove(poll.getCacheKey());
                }
            }
        }
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!this.u.contains(str)) {
            this.u.add(str);
        }
        if (this.u.size() > 100) {
            for (int i2 = 0; i2 < 50; i2++) {
                String poll = this.u.poll();
                if (poll != null) {
                    this.t.remove(poll);
                }
            }
        }
    }

    private boolean c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue() : map == null || map.size() <= 0;
    }

    private void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        try {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                if (value == null) {
                    it.remove();
                } else if ((value instanceof String) && StringUtils.isEmpty((String) value)) {
                    it.remove();
                }
            }
        } catch (Exception e) {
            apr.b("", e);
        }
    }

    private Map<String, Object> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{this, str});
        }
        try {
            return (Map) JSON.parseObject(str, Map.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21dc8cc7", new Object[]{this, bVar})).booleanValue() : (bVar == null || bVar.getPageStatus() == null || UTPageStatus.UT_H5_IN_WebView != bVar.getPageStatus()) ? false : true;
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.b.size() > 100) {
            for (int i2 = 0; i2 < 50; i2++) {
                String poll = this.b.poll();
                if (poll != null) {
                    this.f24125a.remove(poll);
                }
            }
        }
    }

    private void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
        } else if (map == null || map.size() <= 0) {
        } else {
            map.remove("spm-cnt");
            map.remove("spm-url");
            map.remove(bip.KEY_UMBRELLA_SPM_PRE);
            map.remove("utparam-cnt");
            map.remove(ag.KEY_UTPARAM_URL);
            map.remove("utparam-pre");
            map.remove("scm-pre");
        }
    }

    private void a(c cVar, Map<String, String> map, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e4c249", new Object[]{this, cVar, map, str, str2, str3, str4});
            return;
        }
        String str5 = map.get("spm-cnt");
        if (!StringUtils.isEmpty(str5)) {
            cVar.mSpmCnt = str5;
        } else {
            cVar.mSpmCnt = map.get("spm_cnt");
        }
        cVar.mSpmUrl = a(map, str);
        if (!StringUtils.isEmpty(this.c)) {
            cVar.mSpmPre = this.d;
        } else {
            cVar.mSpmPre = "";
        }
        if (!StringUtils.isEmpty(str3)) {
            cVar.mScmUrl = str3;
        } else {
            cVar.mScmUrl = map.get("scm");
        }
        if (!StringUtils.isEmpty(this.c)) {
            cVar.mScmPre = this.e;
        } else {
            cVar.mScmPre = "";
        }
        String a2 = a(map.get("utparam-cnt"), str4);
        if (!StringUtils.isEmpty(a2)) {
            cVar.mUtparamCnt = a2;
        } else {
            cVar.mUtparamCnt = "";
        }
        cVar.mUtparamUrl = a(str2, a(map.get(ag.KEY_UTPARAM_URL), !StringUtils.isEmpty(this.c) ? this.g : ""));
        if (!StringUtils.isEmpty(this.c)) {
            cVar.mUtparamPre = this.f;
        } else {
            cVar.mUtparamPre = "";
        }
    }

    private String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{this, map, str});
        }
        if (map == null) {
            return str;
        }
        String str2 = map.get("spm-url");
        if (!StringUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = map.get("spm_url");
        if (!StringUtils.isEmpty(str3)) {
            return str3;
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String str4 = map.get("spm");
        return !StringUtils.isEmpty(str4) ? str4 : "";
    }

    private String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e66ffe2", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("spm");
        if (aqc.e(queryParameter)) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri.toString(), "UTF-8"));
                queryParameter = uri.getQueryParameter("spm");
            } catch (Exception e) {
                apr.a("", e, new Object[0]);
            }
        }
        if (!aqc.e(queryParameter)) {
            return queryParameter;
        }
        String queryParameter2 = uri.getQueryParameter("spm_url");
        if (!aqc.e(queryParameter2)) {
            return queryParameter2;
        }
        try {
            return Uri.parse(URLDecoder.decode(uri.toString(), "UTF-8")).getQueryParameter("spm_url");
        } catch (Exception e2) {
            apr.a("", e2, new Object[0]);
            return queryParameter2;
        }
    }

    private static String a(Uri uri) {
        List<String> queryParameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null || (queryParameters = uri.getQueryParameters("ttid")) == null) {
            return null;
        }
        for (String str : queryParameters) {
            if (!str.contains("@") && !str.contains("%40")) {
                return str;
            }
        }
        return null;
    }

    private static String j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a68aab3", new Object[]{obj});
        }
        String simpleName = obj.getClass().getSimpleName();
        return simpleName.toLowerCase().endsWith("activity") ? simpleName.substring(0, simpleName.length() - 8) : simpleName;
    }

    private static boolean c(Object obj, String str) {
        String j;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f0c0914", new Object[]{obj, str})).booleanValue() : (obj instanceof Activity) && (j = j(obj)) != null && j.equalsIgnoreCase(str);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = new HashMap();
        this.l = null;
        this.r = null;
        this.p = null;
        this.q = null;
        q.a().b(null);
    }
}
