package android.taobao.windvane.config;

import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ado;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT_NEW_SECURITY_ALLOW = "NewSecurityAllow";
    public static final String MONITOR_POINT_NEW_SECURITY_BLOCK = "NewSecurityBlock";

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1572a;
    private static final String[] b;
    private static volatile t c;
    private static boolean l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private volatile a d;
    private boolean j;
    private final Map<String, Map<String, String>> e = new HashMap();
    private final Map<String, JSONArray> f = new HashMap();
    private d g = null;
    private c h = null;
    private boolean i = false;
    private boolean k = false;

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f1574a = null;
        public String[] b = null;
        public String[] c = null;
        public int d = -1;

        static {
            kge.a(-418860981);
        }

        public b() {
        }
    }

    static {
        kge.a(-882590701);
        f1572a = new int[]{-1, 80, 443};
        b = new String[]{"http", "https", "taobao"};
        c = null;
        l = false;
        m = -1;
        n = 1;
        o = 2;
        p = 4;
        q = 8;
    }

    private t() {
        this.j = false;
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            this.j = true;
        } catch (Exception e) {
            this.j = false;
            android.taobao.windvane.util.m.e("URLMATCHER", "");
            e.printStackTrace();
        }
    }

    public static t a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("f8254852", new Object[0]);
        }
        if (c == null) {
            synchronized (t.class) {
                if (c == null) {
                    t tVar = new t();
                    tVar.a("{\"//beian.miit.gov.cn/*\": \"2\",\"//*.www.aliwork.com/*\":\"2\",\"//*.taobao.com/*\":\"1\",\"//*.tmall.com/*\":\"1\",\"//*.juhuasuan.com/*\":\"1\",\"//*.xiami.com/*\":\"1\",\"//*.amap.com/*\":\"1\",\"//*.taobaocdn.com/*\":\"1\",\"//*.alipay.com/*\":\"1\",\"//*.etao.com/*\":\"1\",\"//*.alibaba.com/*\":\"1\",\"//*.aliyun.com/*\":\"1\",\"//*.alimama.com/*\":\"1\",\"//*.weibo.com/*\":\"1\",\"//*.tanx.com/*\":\"1\",\"//*.laiwang.com/*\":\"1\",\"//*.alicdn.com/*\":\"1\",\"//*.mmstat.com/*\":\"1\",\"//*.yunos.com/*\":\"1\",\"//*.alibaba-inc.com/*\":\"1\",\"//*.alitrip.com/*\":\"1\",\"//*.aliloan.com/*\":\"1\",\"//*.kanbox.com/*\":\"1\",\"//*.wirlesshare.com/*\":\"1\",\"//*.dingtalk.com/*\":\"1\",\"//*.alimei.com/*\":\"1\",\"//*.cnzz.com/*\":\"1\",\"//*.kuaidadi.com/*\":\"1\",\"//*.autonavi.com/*\":\"1\",\"//*.m.yintai.com/*\":\"1\",\"//*.polyinno.com/*\":\"1\",\"//*.spdyidea.com/*\":\"1\",\"//*.h5util.com/*\":\"1\",\"//*.h5tool.com/*\":\"1\",\"//*.5945i.com/*\":\"1\",\"//*.miaostreet.com/*\":\"1\",\"//*.1688.com/*\":\"1\",\"//*.cainiao-inc.com/*\":\"1\",\"//*.cainiao.com/*\":\"1\",\"//*.taohua.com/*\":\"1\",\"//*.m.jiaoyimao.com/*\":\"1\",\"//*.m.dfkhgj.com/*\":\"1\",\"//*.m.edcdfg.com/*\":\"1\",\"//*.liangxinyao.com/*\":\"1\",\"//*.taopiaopiao.com/*\":\"1\",\"//*.fliggy.com/*\":\"1\",\"//*.feizhu.com/*\":\"1\",\"//*.mashangfangxin.com/*\":\"1\",\"//*.youku.com/*\":\"1\",\"//*.im.alisoft.com/*\":\"1\",\"//*.100x100w.com/*\":\"1\",\"//*.koubei.com/*\":\"1\",\"//*.alibabausercontent.com/*\":\"1\",\"//*.hemaos.com/*\":\"1\",\"//*.alihive.com/*\":\"1\",\"//*.jishi.rantu.com/*\":\"1\",\"//*.cdn.rantu.com/*\":\"1\",\"//*.ishuqi.com/*\":\"1\",\"//*.jishi.aligames.com/*\":\"1\",\"//*.aligames.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.mp.dfkhgj.com/*\":\"1\",\"//*.mp.iuynfg.com/*\":\"1\",\"//*.mp.edcdfg.com/*\":\"1\",\"//*.mp.asczwa.com/*\":\"1\",\"//*.duanqu.com/*\":\"1\",\"//*.y.xevddy.com/*\":\"1\",\"//*.l.xevddy.com/*\":\"1\",\"//*.portalpro.hemaos.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.shejijia.com/*\":\"1\",\"//*.preview-lyj.aliyuncs.com/*\":\"1\",\"//*.kaola.com/*\":\"1\",\"//*.alimebot.com/*\":\"1\",\"//*.freshhema.com/*\":\"1\",\"//*.h5.tangping.com/*\":\"1\",\"//*.page.cainiao.com/*\":\"1\",\"//*.xunxi.com/*\":\"1\",\"//*.pages.goofish.com/*\":\"1\",\"//*.h5-global.alimebot.com/*\":\"1\",\"//*.tb.cn/*\":\"1\",\"//*.tbcdn.cn/*\":\"1\",\"//*.weibo.cn/*\":\"1\",\"//*.mashort.cn/*\":\"1\",\"//*.mybank.cn/*\":\"1\",\"//*.uc.cn/*\":\"1\",\"//*.feizhu.cn/*\":\"1\",\"//*.alihealth.cn/*\":\"1\",\"//*.alios.cn/*\":\"1\",\"//*.xixi.fullspeed.cn/*\":\"1\",\"//*.image.9game.cn/*\":\"1\",\"//*.pass.alios.cn/*\":\"1\",\"//*.m.damai.cn/*\":\"1\",\"//*.p.damai.cn/*\":\"1\",\"//*.damai.cn/*\":\"1\",\"//*.taopiaopiao.cn/*\":\"1\",\"//*.m.piao.cn/*\":\"1\",\"//*.s.piao.cn/*\":\"1\",\"//*.market.wapa.piao.cn/*\":\"1\",\"//*.hemashare.cn/*\":\"1\",\"//*.fastidea.me/*\":\"1\",\"//*.fastidea.cc/*\":\"1\",\"//*.juzone.me/*\":\"1\",\"//*.juzone.cc/*\":\"1\",\"//*.r.daily.elenet.me/*\":\"1\",\"//*.ppe-r.elenet.me/*\":\"1\",\"//*.ppe-r.ele.me/*\":\"1\",\"//*.r.elenet.me/*\":\"1\",\"//*.r.ele.me/*\":\"1\",\"//*.lwurl.to/*\":\"1\",\"//*.taobao.net/*\":\"1\",\"//*.alipay.net/*\":\"1\",\"//*.cnzz.net/*\":\"1\",\"//*.fliggy.net/*\":\"1\",\"//*.feizhu.net/*\":\"1\",\"//*.tmall.net/*\":\"1\",\"//*.tdd.la/*\":\"1\",\"//*.yao.95095.com/*\":\"1\",\"//*.tmall.hk/*\":\"1\",\"//*.alipay.hk/*\":\"1\",\"//*.fliggy.hk/*\":\"1\",\"//*.ahd.so/*\":\"1\",\"//*.atb.so/*\":\"1\",\"//*.mshare.cc/*\":\"1\",\"//*.juhs.me/*\":\"1\",\"//*.xianyu.mobi/*\":\"1\",\"//*.ynuf.aliapp.org/*\":\"1\",\"//*.doctoryou.ai/*\":\"1\",\"//*.h5.ele.me/*\":\"1\",\"//*.tb.ele.me/*\":\"1\",\"//*.lemon.ele.me/*\":\"1\",\"//*.lemon.faas.ele.me/*\":\"1\",\"//*.marketing-feast.faas.ele.me/*\":\"1\",\"//*.gw.alipayobjects.com/as/g/memberAsset/zfb-tbcard/*\":\"1\",\"//*.t-series-act.faas.ele.me/*\":\"1\",\"//*.2018-bill.faas.ele.me/*\":\"1\",\"//*.wegame-web-daily.uc.test/*\":\"1\",\"//*.tb.pub/*\":\"1\",\"//*.jsplayground.taobao.org/*\":\"1\",\"//*.www.yuque.com/tbzb/help/*\":\"1\",\"//*.zmcreditprod.zmxy.com.cn/contractb2c/index.htm/*\":\"1\",\"//*.ppe-h5.ele.me/*\":\"1\",\"//*.survey.taobao.tw/*\":\"1\",\"//*.fc.ele.me/*\":\"1\",\"//*.lazada.com.my/*\":\"1\",\"//*.ppt-tb.ele.me/*\":\"1\",\"//*.pre-tb.ele.me/*\":\"1\",\"//*.taobao.tw/*\":\"1\",\"//*.taobao.hk/*\":\"1\",\"//*.taobao.global/*\":\"1\",\"//*.orderrefund-next.ele.me/*\":\"1\",\"//*.ppe-orderrefund-next.ele.me/*\":\"1\",\"//*.s.click.ele.me/*\":\"1\",\"//*.web.ele.me/*\":\"1\",\"//*.pre-web.ele.me/*\":\"1\",\"//*.ppe-fc.ele.me/*\":\"1\",\"//*.5317wan.com/*\":\"2\",\"//*.guahao.com/*\":\"2\",\"//*.wap.wandafilm.com/*\":\"2\",\"//*.wrating.com/*\":\"2\",\"//*.alipayobjects.com/*\":\"2\",\"//*.hft.evergrande.com/*\":\"2\",\"//*.app.evergrande.com/*\":\"2\",\"//*.jmt.wxcsgd.com/*\":\"2\",\"//*.mpay.cx580.com/*\":\"2\",\"//*.mt.locojoy.com/*\":\"2\",\"//*.cpa1.locojoy.com/*\":\"2\",\"//*.miiee.com/*\":\"2\",\"//*.imaijia.com/*\":\"2\",\"//*.h5.edaijia.cn/*\":\"2\",\"//*.beta.library.sh.cn/*\":\"2\",\"//*.web.chelaile.net.cn/*\":\"2\",\"//*.app3.shmzj.gov.cn/*\":\"2\",\"//*.bsfw.qingdao.gov.cn/*\":\"2\",\"//*.www.hzpolice.gov.cn/*\":\"2\",\"//*.www.sxgajj.gov.cn/*\":\"2\",\"//*.service.zjzwfw.gov.cn/*\":\"2\",\"//*.people.com.cn/*\":\"2\",\"//*.hbjg.premier-tech.cn/*\":\"2\",\"//*.aliplay.net/*\":\"2\",\"//*.ali.hk515.net/*\":\"2\",\"//*.tmall.pp.cc/*\":\"2\",\"//*.portal-h5.hemayx.cn/*\":\"1\"}", "{\"1\":{\"api\":\"Group_All\",\"open\":\"allow\"},\"2\":{\"api\":\"Group_None\",\"open\":\"allow\"},\"3\":{\"api\":\"Group_None\",\"open\":\"forbidden\"},\"4\":{\"api\":\"Group_All\",\"open\":\"allowAll\"}}", "{\"Group_All\":[\"*\"],\"Group_None\":[]}", false);
                    c = tVar;
                }
            }
        }
        return c;
    }

    public void a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "urlMatcherConfig: 输入参数为空!");
        } else {
            if (z) {
                this.i = true;
            } else if (this.i) {
                return;
            }
            a(str);
            b(str2);
            c(str3);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "setUrlPatterns: 输入配置为空");
        } else if ("AllowAllUrl".equals(str)) {
            this.k = true;
            android.taobao.windvane.util.m.e("URLMATCHER", "AllowAllUrl");
        } else {
            this.k = false;
            try {
                a aVar = new a("", new HashMap());
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                android.taobao.windvane.util.m.e("URLMATCHER", "urlPatterns:" + str);
                if (jSONObject.length() <= 0) {
                    android.taobao.windvane.util.m.e("URLMATCHER", "配置错误4:json错误");
                    if (this.j) {
                        AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, jSONObject.toString(), "配置错误4:UrlPattern json错误", str);
                    }
                }
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next, "");
                    if (StringUtils.isEmpty(optString)) {
                        android.taobao.windvane.util.m.e("URLMATCHER", "setUrlPatterns: 未能正确获取URL:" + next + "的权限组，请检查配置");
                    } else if (!a(aVar, l(next), optString)) {
                        android.taobao.windvane.util.m.e("URLMATCHER", "setUrlPatterns: URL insert error! url is:" + next);
                    }
                }
                this.d = aVar;
            } catch (Exception e) {
                android.taobao.windvane.util.m.e("URLMATCHER", "setUrlPatterns: catch a exception! " + android.taobao.windvane.util.a.a(e));
                if (this.j) {
                    AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(e), "配置错误1:UrlPattern错误", e.toString());
                }
                if (l) {
                    return;
                }
                l = true;
                a("{\"//beian.miit.gov.cn/*\": \"2\",\"//*.www.aliwork.com/*\":\"2\",\"//*.taobao.com/*\":\"1\",\"//*.tmall.com/*\":\"1\",\"//*.juhuasuan.com/*\":\"1\",\"//*.xiami.com/*\":\"1\",\"//*.amap.com/*\":\"1\",\"//*.taobaocdn.com/*\":\"1\",\"//*.alipay.com/*\":\"1\",\"//*.etao.com/*\":\"1\",\"//*.alibaba.com/*\":\"1\",\"//*.aliyun.com/*\":\"1\",\"//*.alimama.com/*\":\"1\",\"//*.weibo.com/*\":\"1\",\"//*.tanx.com/*\":\"1\",\"//*.laiwang.com/*\":\"1\",\"//*.alicdn.com/*\":\"1\",\"//*.mmstat.com/*\":\"1\",\"//*.yunos.com/*\":\"1\",\"//*.alibaba-inc.com/*\":\"1\",\"//*.alitrip.com/*\":\"1\",\"//*.aliloan.com/*\":\"1\",\"//*.kanbox.com/*\":\"1\",\"//*.wirlesshare.com/*\":\"1\",\"//*.dingtalk.com/*\":\"1\",\"//*.alimei.com/*\":\"1\",\"//*.cnzz.com/*\":\"1\",\"//*.kuaidadi.com/*\":\"1\",\"//*.autonavi.com/*\":\"1\",\"//*.m.yintai.com/*\":\"1\",\"//*.polyinno.com/*\":\"1\",\"//*.spdyidea.com/*\":\"1\",\"//*.h5util.com/*\":\"1\",\"//*.h5tool.com/*\":\"1\",\"//*.5945i.com/*\":\"1\",\"//*.miaostreet.com/*\":\"1\",\"//*.1688.com/*\":\"1\",\"//*.cainiao-inc.com/*\":\"1\",\"//*.cainiao.com/*\":\"1\",\"//*.taohua.com/*\":\"1\",\"//*.m.jiaoyimao.com/*\":\"1\",\"//*.m.dfkhgj.com/*\":\"1\",\"//*.m.edcdfg.com/*\":\"1\",\"//*.liangxinyao.com/*\":\"1\",\"//*.taopiaopiao.com/*\":\"1\",\"//*.fliggy.com/*\":\"1\",\"//*.feizhu.com/*\":\"1\",\"//*.mashangfangxin.com/*\":\"1\",\"//*.youku.com/*\":\"1\",\"//*.im.alisoft.com/*\":\"1\",\"//*.100x100w.com/*\":\"1\",\"//*.koubei.com/*\":\"1\",\"//*.alibabausercontent.com/*\":\"1\",\"//*.hemaos.com/*\":\"1\",\"//*.alihive.com/*\":\"1\",\"//*.jishi.rantu.com/*\":\"1\",\"//*.cdn.rantu.com/*\":\"1\",\"//*.ishuqi.com/*\":\"1\",\"//*.jishi.aligames.com/*\":\"1\",\"//*.aligames.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.mp.dfkhgj.com/*\":\"1\",\"//*.mp.iuynfg.com/*\":\"1\",\"//*.mp.edcdfg.com/*\":\"1\",\"//*.mp.asczwa.com/*\":\"1\",\"//*.duanqu.com/*\":\"1\",\"//*.y.xevddy.com/*\":\"1\",\"//*.l.xevddy.com/*\":\"1\",\"//*.portalpro.hemaos.com/*\":\"1\",\"//*.h5.shyhhema.com/*\":\"1\",\"//*.shejijia.com/*\":\"1\",\"//*.preview-lyj.aliyuncs.com/*\":\"1\",\"//*.kaola.com/*\":\"1\",\"//*.alimebot.com/*\":\"1\",\"//*.freshhema.com/*\":\"1\",\"//*.h5.tangping.com/*\":\"1\",\"//*.page.cainiao.com/*\":\"1\",\"//*.xunxi.com/*\":\"1\",\"//*.pages.goofish.com/*\":\"1\",\"//*.h5-global.alimebot.com/*\":\"1\",\"//*.tb.cn/*\":\"1\",\"//*.tbcdn.cn/*\":\"1\",\"//*.weibo.cn/*\":\"1\",\"//*.mashort.cn/*\":\"1\",\"//*.mybank.cn/*\":\"1\",\"//*.uc.cn/*\":\"1\",\"//*.feizhu.cn/*\":\"1\",\"//*.alihealth.cn/*\":\"1\",\"//*.alios.cn/*\":\"1\",\"//*.xixi.fullspeed.cn/*\":\"1\",\"//*.image.9game.cn/*\":\"1\",\"//*.pass.alios.cn/*\":\"1\",\"//*.m.damai.cn/*\":\"1\",\"//*.p.damai.cn/*\":\"1\",\"//*.damai.cn/*\":\"1\",\"//*.taopiaopiao.cn/*\":\"1\",\"//*.m.piao.cn/*\":\"1\",\"//*.s.piao.cn/*\":\"1\",\"//*.market.wapa.piao.cn/*\":\"1\",\"//*.hemashare.cn/*\":\"1\",\"//*.fastidea.me/*\":\"1\",\"//*.fastidea.cc/*\":\"1\",\"//*.juzone.me/*\":\"1\",\"//*.juzone.cc/*\":\"1\",\"//*.r.daily.elenet.me/*\":\"1\",\"//*.ppe-r.elenet.me/*\":\"1\",\"//*.ppe-r.ele.me/*\":\"1\",\"//*.r.elenet.me/*\":\"1\",\"//*.r.ele.me/*\":\"1\",\"//*.lwurl.to/*\":\"1\",\"//*.taobao.net/*\":\"1\",\"//*.alipay.net/*\":\"1\",\"//*.cnzz.net/*\":\"1\",\"//*.fliggy.net/*\":\"1\",\"//*.feizhu.net/*\":\"1\",\"//*.tmall.net/*\":\"1\",\"//*.tdd.la/*\":\"1\",\"//*.yao.95095.com/*\":\"1\",\"//*.tmall.hk/*\":\"1\",\"//*.alipay.hk/*\":\"1\",\"//*.fliggy.hk/*\":\"1\",\"//*.ahd.so/*\":\"1\",\"//*.atb.so/*\":\"1\",\"//*.mshare.cc/*\":\"1\",\"//*.juhs.me/*\":\"1\",\"//*.xianyu.mobi/*\":\"1\",\"//*.ynuf.aliapp.org/*\":\"1\",\"//*.doctoryou.ai/*\":\"1\",\"//*.h5.ele.me/*\":\"1\",\"//*.tb.ele.me/*\":\"1\",\"//*.lemon.ele.me/*\":\"1\",\"//*.lemon.faas.ele.me/*\":\"1\",\"//*.marketing-feast.faas.ele.me/*\":\"1\",\"//*.gw.alipayobjects.com/as/g/memberAsset/zfb-tbcard/*\":\"1\",\"//*.t-series-act.faas.ele.me/*\":\"1\",\"//*.2018-bill.faas.ele.me/*\":\"1\",\"//*.wegame-web-daily.uc.test/*\":\"1\",\"//*.tb.pub/*\":\"1\",\"//*.jsplayground.taobao.org/*\":\"1\",\"//*.www.yuque.com/tbzb/help/*\":\"1\",\"//*.zmcreditprod.zmxy.com.cn/contractb2c/index.htm/*\":\"1\",\"//*.ppe-h5.ele.me/*\":\"1\",\"//*.survey.taobao.tw/*\":\"1\",\"//*.fc.ele.me/*\":\"1\",\"//*.lazada.com.my/*\":\"1\",\"//*.ppt-tb.ele.me/*\":\"1\",\"//*.pre-tb.ele.me/*\":\"1\",\"//*.taobao.tw/*\":\"1\",\"//*.taobao.hk/*\":\"1\",\"//*.taobao.global/*\":\"1\",\"//*.orderrefund-next.ele.me/*\":\"1\",\"//*.ppe-orderrefund-next.ele.me/*\":\"1\",\"//*.s.click.ele.me/*\":\"1\",\"//*.web.ele.me/*\":\"1\",\"//*.pre-web.ele.me/*\":\"1\",\"//*.ppe-fc.ele.me/*\":\"1\",\"//*.5317wan.com/*\":\"2\",\"//*.guahao.com/*\":\"2\",\"//*.wap.wandafilm.com/*\":\"2\",\"//*.wrating.com/*\":\"2\",\"//*.alipayobjects.com/*\":\"2\",\"//*.hft.evergrande.com/*\":\"2\",\"//*.app.evergrande.com/*\":\"2\",\"//*.jmt.wxcsgd.com/*\":\"2\",\"//*.mpay.cx580.com/*\":\"2\",\"//*.mt.locojoy.com/*\":\"2\",\"//*.cpa1.locojoy.com/*\":\"2\",\"//*.miiee.com/*\":\"2\",\"//*.imaijia.com/*\":\"2\",\"//*.h5.edaijia.cn/*\":\"2\",\"//*.beta.library.sh.cn/*\":\"2\",\"//*.web.chelaile.net.cn/*\":\"2\",\"//*.app3.shmzj.gov.cn/*\":\"2\",\"//*.bsfw.qingdao.gov.cn/*\":\"2\",\"//*.www.hzpolice.gov.cn/*\":\"2\",\"//*.www.sxgajj.gov.cn/*\":\"2\",\"//*.service.zjzwfw.gov.cn/*\":\"2\",\"//*.people.com.cn/*\":\"2\",\"//*.hbjg.premier-tech.cn/*\":\"2\",\"//*.aliplay.net/*\":\"2\",\"//*.ali.hk515.net/*\":\"2\",\"//*.tmall.pp.cc/*\":\"2\",\"//*.portal-h5.hemayx.cn/*\":\"1\"}");
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "setUrlRulesMap: 输入参数为空!");
        } else {
            try {
                synchronized (this.e) {
                    this.e.clear();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next, "");
                        if (StringUtils.isEmpty(optString)) {
                            android.taobao.windvane.util.m.e("URLMATCHER", "setUrlRulesMap: 未能正确获取权限组:" + next + "的权限,请检查配置");
                        } else {
                            JSONObject jSONObject2 = new JSONObject(optString);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String optString2 = jSONObject2.optString(next2);
                                if (StringUtils.isEmpty(optString2)) {
                                    android.taobao.windvane.util.m.e("URLMATCHER", "setUrlRulesMap: 未能正确获取权限:" + next2 + "的值,请检查配置");
                                } else {
                                    hashMap.put(next2, optString2);
                                }
                            }
                            this.e.put(next, hashMap);
                        }
                    }
                }
            } catch (Exception e) {
                android.taobao.windvane.util.m.e("URLMATCHER", "setUrlRulesMap: 配置发生异常!" + e);
                e.printStackTrace();
                if (!this.j) {
                    return;
                }
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(e), "配置错误2:UrlRules错误", e.toString());
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "setApiGroup: 输入参数为空");
        } else {
            try {
                synchronized (this.f) {
                    this.f.clear();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray == null) {
                            android.taobao.windvane.util.m.e("URLMATCHER", "setApiGroup: 未能正确获取api组:" + next + ",请检查配置");
                        } else if (optJSONArray.length() == 0) {
                            android.taobao.windvane.util.m.c("URLMATCHER", "apiGroup 权限组无权限内容:" + next);
                        } else {
                            this.f.put(next, optJSONArray);
                        }
                    }
                }
            } catch (Exception e) {
                android.taobao.windvane.util.m.e("URLMATCHER", "setApiGroupMap: 发生异常! " + e);
                e.printStackTrace();
                if (!this.j) {
                    return;
                }
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(e), "配置错误3:ApiGroup异常", e.toString());
            }
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW.equalsIgnoreCase(a(str, "open"))) {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "1", "允许打开");
            }
            return true;
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "1", "非三方阿里名单拦截");
        }
        return false;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        if (android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW.equalsIgnoreCase(a(str, "open"))) {
            String a2 = a(str, "api");
            if (StringUtils.equals(a2, "Group_All")) {
                if (this.j) {
                    AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, AgooConstants.REPORT_MESSAGE_NULL, "ali域名允许打开");
                }
                return true;
            }
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, AgooConstants.REPORT_ENCRYPT_FAIL, "非三方阿里名单拦截");
            }
            return c(str, a2);
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, AgooConstants.REPORT_DUPLICATE_FAIL, "非三方阿里名单拦截");
        }
        return c(str, "Group_None");
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        String a2 = a(str, "open");
        if (android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW.equalsIgnoreCase(a2)) {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, AgooConstants.REPORT_NOT_ENCRYPT, "三方或阿里名单允许：" + a2);
            }
            return true;
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "25", "非三方名单拦截");
        }
        return a(str, true);
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        String a2 = a(str, "open");
        if (android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW.equalsIgnoreCase(a2) || "allowAll".equalsIgnoreCase(a2) || "forbidden".equalsIgnoreCase(a2)) {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "2", "三方或阿里名单允许：" + a2);
            }
            return false;
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "2", "非三方名单拦截");
        }
        return !a(str, true);
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        j.a();
        if (!j.commonConfig.bi) {
            return false;
        }
        if (p.d(str)) {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, str, "11", "错误地拒绝了");
            }
            android.taobao.windvane.util.m.e("URLMATCHER", "错误地拒绝了" + str);
            return true;
        } else if (!z || !p.b(str)) {
            return false;
        } else {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, str, AgooConstants.ACK_FLAG_NULL, "ali错误地拒绝了");
            }
            android.taobao.windvane.util.m.e("URLMATCHER", "ali错误地拒绝了" + str);
            return true;
        }
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue();
        }
        if (!"forbidden".equalsIgnoreCase(a(str, "open"))) {
            return false;
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "3", "黑名单拦截");
        }
        return true;
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{this, str})).booleanValue();
        }
        if (!"allowAll".equalsIgnoreCase(a(str, "open"))) {
            return false;
        }
        if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "4", "allowAll名单允许");
        }
        return true;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (this.k) {
            if ("open".equals(str2)) {
                return android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW;
            }
            if ("api".equals(str2)) {
                return "Group_All";
            }
        }
        d dVar = this.g;
        if (dVar != null) {
            return dVar.a(str, str2);
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: 输入参数为空!");
            return null;
        } else if (this.d == null || this.d.f1573a.isEmpty()) {
            android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: URL配置不应为空!");
            return null;
        } else {
            synchronized (this.e) {
                if (this.e != null && !this.e.isEmpty()) {
                    if (StringUtils.equals(str2, "open") && (str.startsWith("javascript:") || str.startsWith("about:") || str.startsWith("tel:") || str.startsWith(WVUCWebViewClient.SCHEME_SMS) || str.startsWith("mailto:"))) {
                        return android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW;
                    }
                    try {
                        String j = j(str);
                        if (StringUtils.isEmpty(j)) {
                            android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: 该url未在配置内，禁止访问! " + str);
                            return null;
                        }
                        synchronized (this.e) {
                            Map<String, String> map = this.e.get(j);
                            if (map != null && !map.isEmpty()) {
                                String str3 = map.get(str2);
                                if (!StringUtils.isEmpty(str3)) {
                                    return str3;
                                }
                                android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: 未在权限组:" + j + " 中找到权限:" + str2 + "的配置");
                                return null;
                            }
                            android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: 未能找到权限组:" + j + " 的配置,请检查配置!");
                            return null;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        if (StringUtils.equals(str2, "open")) {
                            android.taobao.windvane.util.m.e("URLMATCHER", "获取open权限时，出现匹配错误，已允许该URL打开，url:" + str);
                            if (!this.j) {
                                return android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW;
                            }
                            AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(th) + " |||| " + str, "4", "获取open权限时，出现匹配错误，已允许该URL打开");
                            return android.taobao.windvane.runtimepermission.a.PERMISSION_ALLOW;
                        }
                        android.taobao.windvane.util.m.e("URLMATCHER", "获取" + str2 + "权限时出现错误，url:" + str);
                        if (this.j) {
                            AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(th) + " |||| " + str, "5", " 获取" + str2 + "权限时，出现匹配错误");
                        }
                        return null;
                    }
                }
                android.taobao.windvane.util.m.e("URLMATCHER", "getUrlPermissionInfo: urlRules配置不应为空!");
                return null;
            }
        }
    }

    public boolean a(String str, String str2, String str3) {
        JSONArray jSONArray;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (j.commonConfig.cs && "WVMega".equals(str2)) {
            return true;
        }
        c cVar = this.h;
        if (cVar != null) {
            return cVar.a(str, str2, str3);
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "checkApiPermission: 输入参数为空!");
            return false;
        }
        synchronized (this.f) {
            if (this.f != null && !this.f.isEmpty()) {
                String a2 = a(str, "api");
                if (StringUtils.isEmpty(a2)) {
                    android.taobao.windvane.util.m.e("URLMATCHER", "checkApiPermission: 未能正确获取api权限组:" + str);
                    return false;
                } else if (c(str, a2)) {
                    return true;
                } else {
                    synchronized (this.f) {
                        jSONArray = this.f.get(a2);
                    }
                    if (jSONArray != null && jSONArray.length() != 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                string = jSONArray.getString(i);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            if ("*".equals(string)) {
                                return true;
                            }
                            int indexOf = string.indexOf(46);
                            if (indexOf > 0 && string.substring(0, indexOf).equals(str2)) {
                                int i2 = indexOf + 1;
                                if ("*".equals(string.substring(i2)) || str3.equals(string.substring(i2))) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            android.taobao.windvane.util.m.e("URLMATCHER", "checkApiPermission: apiGroup配置不应为空!");
            return false;
        }
    }

    private boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        j.a();
        if (!j.commonConfig.bj) {
            return false;
        }
        if (StringUtils.equals(str2, "Group_None")) {
            if (p.b(str)) {
                if (this.j) {
                    AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, str, "12", "api错误地拒绝了");
                }
                android.taobao.windvane.util.m.e("URLMATCHER", "api错误地拒绝了" + str);
                return true;
            }
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "4", "非阿里名单拦截");
            }
            android.taobao.windvane.util.m.e("URLMATCHER", "非阿里名单拦截 " + str);
        } else if (StringUtils.equals(str2, "Group_All")) {
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", MONITOR_POINT_NEW_SECURITY_ALLOW, str, "3", "允许访问jsbridge");
            }
        } else if (this.j) {
            AppMonitor.Alarm.commitFail("WindVane", "NewSecurityBlock", str, "5", "非阿里名单拦截 apiGroup=" + str2);
        }
        return false;
    }

    private boolean a(a aVar, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6e46e3", new Object[]{this, aVar, bVar, str})).booleanValue();
        }
        if (bVar == null || bVar.b == null || bVar.b.length == 0) {
            android.taobao.windvane.util.m.e("URLMATCHER", "insertToTrieTree: 插入节点有误，请检查配置！");
            return false;
        }
        a aVar2 = aVar;
        for (String str2 : bVar.b) {
            String lowerCase = str2.toLowerCase();
            if (aVar2.f1573a.containsKey(lowerCase)) {
                aVar2 = aVar2.f1573a.get(lowerCase);
            } else {
                a aVar3 = new a(lowerCase, new HashMap());
                aVar2.f1573a.put(lowerCase, aVar3);
                aVar2 = aVar3;
            }
        }
        for (String str3 : bVar.c) {
            String lowerCase2 = str3.toLowerCase();
            if (aVar2.f1573a.containsKey(lowerCase2)) {
                aVar2 = aVar2.f1573a.get(lowerCase2);
            } else {
                a aVar4 = new a(lowerCase2, new HashMap());
                aVar2.f1573a.put(lowerCase2, aVar4);
                aVar2 = aVar4;
            }
        }
        aVar2.a(str);
        aVar2.b(bVar.f1574a);
        aVar2.a(bVar.d);
        return true;
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{this, str});
        }
        String str2 = null;
        if (StringUtils.isEmpty(str)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "searchUrlForGroup: 输入的URL不应为空！");
            return null;
        } else if (this.d == null || this.d.f1573a == null || this.d.f1573a.isEmpty()) {
            android.taobao.windvane.util.m.e("URLMATCHER", "searchUrlForGroup: URL配置不应为空！");
            return null;
        } else {
            b l2 = l(str);
            if (l2 == null) {
                android.taobao.windvane.util.m.e("URLMATCHER", "searchUrlForGroup: URL解析失败，URL配置错误，请检查是否输入为js！");
                return null;
            }
            a aVar = this.d;
            ArrayList<String> arrayList = new ArrayList<>();
            HashMap hashMap = new HashMap();
            a(l2, false, aVar, arrayList, 0, hashMap);
            int i = -1;
            for (Map.Entry<ArrayList<String>, String> entry : hashMap.entrySet()) {
                int a2 = a(entry.getKey());
                if (a2 > i) {
                    str2 = entry.getValue();
                    i = a2;
                }
            }
            return str2;
        }
    }

    private int a(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{this, arrayList})).intValue();
        }
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2).equals("*") || arrayList.get(i2).equals(riy.PLUS)) {
                i--;
            } else {
                if (arrayList.get(i2).equals("/")) {
                    z = true;
                }
                i = z ? i + 10 : i + 1000;
            }
        }
        return i;
    }

    private void a(b bVar, boolean z, a aVar, ArrayList<String> arrayList, int i, Map<ArrayList<String>, String> map) {
        String str;
        int i2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        boolean z4;
        int i3;
        int i4;
        boolean z5 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e2cf1f", new Object[]{this, bVar, new Boolean(z5), aVar, arrayList, new Integer(i), map});
        } else if (bVar == null || aVar == null) {
        } else {
            if (a.a(aVar) != null && z5) {
                if (i == bVar.c.length) {
                    if (a.b(aVar) != null && a(bVar, aVar)) {
                        map.put(new ArrayList<>(arrayList), a.b(aVar));
                    }
                    if (aVar.f1573a == null || !aVar.f1573a.containsKey("*") || a.b(aVar.f1573a.get("*")) == null || !a(bVar, aVar.f1573a.get("*"))) {
                        return;
                    }
                    arrayList.add("*");
                    map.put(new ArrayList<>(arrayList), a.b(aVar.f1573a.get("*")));
                    arrayList.remove("*");
                    return;
                } else if (StringUtils.equals(a.a(aVar), "/") && a.b(aVar) != null && a(bVar, aVar)) {
                    map.put(new ArrayList<>(arrayList), a.b(aVar));
                }
            }
            String lowerCase = (z5 ? bVar.c[i] : bVar.b[i]).toLowerCase();
            if (aVar.f1573a.containsKey(lowerCase)) {
                int i5 = i + 1;
                arrayList.add(lowerCase);
                if (z5 || i5 != bVar.b.length) {
                    z4 = z5;
                    i3 = i5;
                } else {
                    z4 = true;
                    i3 = 0;
                }
                str = lowerCase;
                a(bVar, z4, aVar.f1573a.get(lowerCase), arrayList, i3, map);
                int i6 = i3 - 1;
                if (i6 < 0) {
                    i4 = bVar.b.length - 1;
                    z4 = false;
                } else {
                    i4 = i6;
                }
                arrayList.remove(str);
                boolean z6 = z4;
                i2 = i4;
                z5 = z6;
            } else {
                str = lowerCase;
                i2 = i;
            }
            if (aVar.f1573a.containsKey(riy.PLUS)) {
                if (!z5) {
                    z3 = true;
                    length2 = 0;
                } else {
                    z3 = z5;
                    length2 = bVar.c.length;
                }
                arrayList.add(riy.PLUS);
                a(bVar, z3, aVar.f1573a.get(riy.PLUS), arrayList, length2, map);
                arrayList.remove(riy.PLUS);
                if (length2 == 0) {
                    z3 = false;
                }
                z2 = z3;
            } else {
                z2 = z5;
            }
            if (!aVar.f1573a.containsKey("*")) {
                return;
            }
            if (z2 && i2 == 0 && StringUtils.equals(str, "/")) {
                arrayList.add("*");
                a(bVar, z2, aVar.f1573a.get("*"), arrayList, i2, map);
                arrayList.remove("*");
                return;
            }
            if (!z2) {
                z2 = true;
                length = 0;
            } else {
                length = bVar.c.length;
            }
            arrayList.add("*");
            a(bVar, z2, aVar.f1573a.get("*"), arrayList, length, map);
            arrayList.remove("*");
        }
    }

    public boolean a(b bVar, a aVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d10e24d9", new Object[]{this, bVar, aVar})).booleanValue();
        }
        if (bVar == null || aVar == null) {
            return false;
        }
        if (StringUtils.equals(aVar.a(), b[0])) {
            String[] strArr = b;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                } else if (StringUtils.equals(strArr[i], bVar.f1574a)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z2) {
                return false;
            }
        } else if (!StringUtils.equals(bVar.f1574a, aVar.a())) {
            return false;
        }
        if (aVar.b().size() == 0) {
            int[] iArr = f1572a;
            int length2 = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z = false;
                    break;
                } else if (iArr[i2] == bVar.d) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                return false;
            }
        } else if (bVar.d < 0) {
            if ("http".equals(bVar.f1574a)) {
                return aVar.b().contains(80);
            }
            if ("https".equals(bVar.f1574a)) {
                return aVar.b().contains(443);
            }
        } else if (!aVar.b().contains(Integer.valueOf(bVar.d))) {
            return false;
        }
        return true;
    }

    private b l(String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3d486bdf", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            android.taobao.windvane.util.m.e("URLMATCHER", "dropUrl: 输入的URL为空!!");
            return null;
        }
        b bVar = new b();
        if (str.length() > 2 && str.substring(0, 2).equals(ado.URL_SEPARATOR)) {
            str = new StringBuffer(b[0] + ":" + str).toString();
        }
        try {
            uri = Uri.parse(str);
        } catch (Throwable th) {
            android.taobao.windvane.util.m.e("URLMATCHER", "parseUrl: 解析URL出现错误" + th);
            th.printStackTrace();
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, android.taobao.windvane.util.a.a(th) + " |||| " + str, "6", "解析URL出现错误");
            }
            uri = null;
        }
        bVar.f1574a = uri.getScheme();
        if (StringUtils.isEmpty(uri.getHost()) || uri.getPath() == null) {
            android.taobao.windvane.util.m.e("URLMATCHER", "parseUrl: 输入的URL不符合规范");
            if (this.j) {
                AppMonitor.Alarm.commitFail("WindVane", android.taobao.windvane.monitor.a.MONITOR_MATCH_URL_FAILED, str, "7", "解析URL出现错误");
            }
            return null;
        }
        bVar.b = a(uri.getHost().split("\\."));
        bVar.c = uri.getPath().split("/");
        if (bVar.c.length > 0 && StringUtils.equals("", bVar.c[0])) {
            bVar.c[0] = "/";
        }
        if (bVar.c.length == 0) {
            bVar.c = new String[]{"/"};
        }
        bVar.d = uri.getPort();
        return bVar;
    }

    /* loaded from: classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, a> f1573a;
        private String c;
        private List<Integer> f = new ArrayList();
        private String d = null;
        private String e = null;

        static {
            kge.a(1070574363);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7aba491", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3498bbb0", new Object[]{aVar}) : aVar.d;
        }

        public a(String str, Map<String, a> map) {
            this.c = str;
            this.f1573a = map;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i < 0) {
            } else {
                this.f.add(Integer.valueOf(i));
            }
        }

        public List<Integer> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f;
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            this.f1573a.clear();
        }
    }

    public static String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            android.taobao.windvane.util.m.e("URLMATCHER", "reverseStrArray:输入参数为空");
            return null;
        }
        for (int length = strArr.length - 1; i < length; length--) {
            String str = strArr[i];
            strArr[i] = strArr[length];
            strArr[length] = str;
            i++;
        }
        return strArr;
    }

    public static int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99648af", new Object[]{str})).intValue();
        }
        int i = n;
        if (a().h(str)) {
            return m;
        }
        if (a().e(str)) {
            return q;
        }
        return a().f(str) ? o : i;
    }
}
