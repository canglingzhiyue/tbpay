package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.p;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.tao.favorite.FavoriteConstants;
import com.taobao.tao.util.Constants;
import com.taobao.taolive.room.utils.aw;
import com.ut.device.UTDevice;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class ebx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] A;
    public static final String NAV_ACTIVITY_START_TIME = "NAV_START_ACTIVITY_TIME";
    public static final String NAV_ACTIVITY_START_UPTIME = "NAV_START_ACTIVITY_UPTIME";
    public static final String NAV_TO_URL_START_TIME = "NAV_TO_URL_START_TIME";
    public static final String NAV_TO_URL_START_UPTIME = "NAV_TO_URL_START_UPTIME";
    public static final int T_FROM_SCAN = 1;
    public static final int T_FROM_SEARCH = 2;
    public String D;
    public String E;
    public int F;

    /* renamed from: a  reason: collision with root package name */
    public String f27180a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String z;
    public long G = 0;
    public float o = 0.8f;
    public int p = 0;
    private Map<String, String> B = new HashMap();
    private Map<String, String> C = new HashMap();
    public long v = 0;
    public long w = 0;
    public long x = 0;
    public long y = 0;

    static {
        kge.a(-699588433);
        A = new String[]{"ref_wp_pk", "ref_wp_m", "ref_wp_p", "collocation_id", "action_id", ChatInputConstant.PANEL_ID_ALBUM, "mmtag", "scm", aw.PARAM_PVID, "spm-cnt", "spm", "pre_item_id", "pre_seller_id", "weitao_user_id", "fromtorelation", "afcflow", "bc_fl_src", "crm_s_src", "action", "list_param", "list_type", "object_id", "object_type", ecd.K_EFFECT_BDID, "carrier_id"};
    }

    public ebx() {
        emu.a("com.taobao.android.detail.core.detail.model.QueryParams");
    }

    public ebx a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ebx) ipChange.ipc$dispatch("2d49371", new Object[]{this, activity}) : a(activity, (dyz) null);
    }

    public ebx a(Activity activity, dyz dyzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ebx) ipChange.ipc$dispatch("697d0946", new Object[]{this, activity, dyzVar}) : a(activity, activity.getIntent(), dyzVar);
    }

    public ebx a(Context context, Intent intent, dyz dyzVar) {
        Set<String> queryParameterNames;
        Bundle bundle;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebx) ipChange.ipc$dispatch("71a57083", new Object[]{this, context, intent, dyzVar});
        }
        Uri data = intent.getData();
        this.c = ecp.a(intent, "title");
        this.d = ecp.a(intent, "reservePrice");
        this.e = ecp.a(intent, d.KEY_PIC_URL);
        this.v = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        this.x = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        this.w = intent.getLongExtra("NAV_TO_URL_START_UPTIME", 0L);
        this.y = intent.getLongExtra("NAV_START_ACTIVITY_UPTIME", 0L);
        this.f = ecp.a(intent, "ju_id");
        this.h = ecp.a(intent, "ad_word_show");
        this.i = ecp.a(intent, Constants.KEY_SEARCH_KEYWORD);
        this.p = c(ecp.a(intent, "from"));
        this.m = nyk.KEY_SHARE_CONFIG_WANGXIN.equals(ecp.a(intent, a.ATOM_caller));
        String str2 = "transImgUrl";
        this.D = ecp.a(intent, str2);
        this.E = ecp.a(intent, "transImgRatio");
        this.F = ecp.a(intent, "transImgType", 1);
        this.f27180a = a(intent);
        String dataString = intent.getDataString();
        if (StringUtils.isEmpty(this.f27180a)) {
            ecg.a(context, true, dataString);
        }
        if (!StringUtils.isEmpty(dataString)) {
            if (dataString.contains(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) {
                this.s = g(dataString);
            }
            if (dataString.contains(iyx.PARAM_VIDEO_AUTO_PLAY)) {
                this.t = f(dataString);
            }
        }
        if (data == null) {
            return this;
        }
        this.z = data.getQueryParameter("forceMainInterface");
        this.g = data.getQueryParameter("clickid");
        if (StringUtils.isEmpty(this.g)) {
            this.g = ecp.a(intent, "clickid");
        }
        this.b = data.getQueryParameter("skuId");
        this.j = data.getQueryParameter("action");
        this.l = "true".equals(data.getQueryParameter("fav_status"));
        this.k = "true".equals(data.getQueryParameter(ecd.V_EFFECT_ACTION_SECKILL));
        this.n = "true".equals(data.getQueryParameter("99tm"));
        try {
            this.o = Float.parseFloat(data.getQueryParameter("pageHeight"));
        } catch (Throwable unused) {
        }
        this.u = data.getQueryParameter("fromtorelation");
        this.q = eih.b(data.getQueryParameter("from"));
        if (!StringUtils.isEmpty(this.D)) {
            i.c("QueryParams", "fromSource:" + this.q + " transImgUrl:" + this.D + " transImgRatio:" + this.E + " transImgType:" + this.F);
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str3 : extras.keySet()) {
                    if ("referrer".equals(str3) || str2.equals(str3) || "transImgRatio".equals(str3) || "transImgType".equals(str3)) {
                        bundle = extras;
                        str = str2;
                    } else {
                        str = str2;
                        bundle = extras;
                        this.B.put(str3, String.valueOf(extras.get(str3)));
                    }
                    str2 = str;
                    extras = bundle;
                }
            }
        } catch (Throwable th) {
            i.a("QueryParams", "bundle.keySet error.", th);
            ecg.b(context, th);
        }
        if (!StringUtils.isEmpty(data.getQuery()) && (queryParameterNames = data.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str4 : queryParameterNames) {
                if (!"referrer".equals(str4)) {
                    this.B.put(str4, data.getQueryParameter(str4));
                }
            }
        }
        try {
            this.B.put("utdid", UTDevice.getUtdid(context));
            String d = epo.g().d();
            if (!StringUtils.isEmpty(d)) {
                this.B.put("nick", d);
            }
        } catch (Exception e) {
            i.a("QueryParams", "put kv exception: ", e);
        }
        this.B.remove("title");
        this.B.remove(d.KEY_PIC_URL);
        this.B.remove("reservePrice");
        this.B.remove("p4p_url");
        Map<String, String> map = this.B;
        map.put(MainRequestParams.CPU_CORE, ecl.b(context) + "");
        this.B.put(MainRequestParams.CPU_MAX_HZ, ecl.a(context));
        this.r = PreferenceManager.getDefaultSharedPreferences(epo.a()).getString("appGuide", "");
        this.B.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        Map<String, String> map2 = this.B;
        map2.put("osVersion", Build.VERSION.SDK_INT + "");
        this.B.put("soVersion", "2.0");
        this.B.put("appReqFrom", "detail");
        this.B.put("spm-cnt", "a2141.7631564");
        this.B.put("openFrom", "pagedetail");
        if (jqm.a()) {
            this.B.put("debugClient", "true");
        }
        try {
            if (epv.e && !jqm.a()) {
                String jSONString = JSON.toJSONString(a(ParseResponseHelper.a(context, "detail")));
                this.B.put("clientCachedTemplateKeys", jSONString);
                i.c("QueryParams", "clientCachedTemplateKeys:" + jSONString);
            }
        } catch (Throwable th2) {
            i.a("QueryParams", "QueryParams#clientCachedTemplateKeys", th2);
        }
        if (!this.B.containsKey(com.taobao.android.detail.wrapper.nav.a.DETAIL_NAV_PREFETCH) && dyzVar != null && dyzVar.d() && b(intent)) {
            try {
                a(intent, this.f27180a);
            } catch (Throwable th3) {
                i.a("QueryParams", "QueryParams#appendItemIdParam", th3);
            }
        }
        return this;
    }

    public static List<ParseResponseHelper.TemplateInfo> a(List<ParseResponseHelper.TemplateInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (ParseResponseHelper.TemplateInfo templateInfo : list) {
            if (templateInfo != null && templateInfo.id != null && templateInfo.version != null) {
                try {
                    Long.parseLong(templateInfo.id);
                    Long.parseLong(templateInfo.version);
                    arrayList.add(templateInfo);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return arrayList;
    }

    private boolean b(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            return StringUtils.isEmpty(data.getQueryParameter("id"));
        }
        return false;
    }

    private void a(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289186af", new Object[]{this, intent, str});
        } else if (intent == null || StringUtils.isEmpty(intent.getDataString()) || StringUtils.isEmpty(str)) {
        } else {
            Uri.Builder buildUpon = Uri.parse(intent.getDataString()).buildUpon();
            buildUpon.appendQueryParameter("id", str);
            intent.setData(buildUpon.build());
            i.c("QueryParams", "after appendItemIdParam, queryParams.kvs: " + this.B);
        }
    }

    public String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{this, intent});
        }
        String a2 = ecp.a(intent, "id");
        if (!StringUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = ecp.a(intent, "item_id");
        return StringUtils.isEmpty(a3) ? c(intent) : a3;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.B.putAll(map);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            Map<String, String> e = cVar.e();
            if (e != null) {
                this.C.putAll(e);
            }
            this.C.put("item_id", epw.a(cVar.b() ? cVar.j() : cVar.i()));
            this.C.put("shop_id", epw.a(cVar.o()));
            this.C.put("seller_id", epw.a(cVar.h()));
            if (StringUtils.isEmpty(this.r)) {
                return;
            }
            this.C.put("appGuide", this.r);
        }
    }

    public Map<String, String> b() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.B);
        String a2 = epj.h().a("android_detail", "trade_detail_request_params_black_list", "list_param,%22list_param,search_keyword,eurl");
        if (!StringUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                if (!StringUtils.isEmpty(str)) {
                    hashMap.remove(str);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Map<String, String> c() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (this.C.isEmpty()) {
            for (String str : A) {
                String str2 = this.B.get(str);
                if (str2 != null) {
                    this.C.put(str, str2);
                }
            }
            String str3 = this.B.get("track_params");
            if (!StringUtils.isEmpty(str3)) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSON.parseObject(str3);
                } catch (Exception unused) {
                }
                this.C.putAll(epw.a(jSONObject, new epy<String>() { // from class: tb.ebx.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // tb.epy
                    public /* synthetic */ String b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                    }
                }));
            }
        }
        return new HashMap(this.C);
    }

    private int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        if ("isFromScan".equals(str)) {
            return 1;
        }
        return "isFromWorkSearch".equals(str) ? 2 : 0;
    }

    private String c(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249b0259", new Object[]{this, intent});
        }
        String str2 = "";
        String str3 = null;
        if (StringUtils.isEmpty(str2)) {
            try {
                str = ecp.a(intent, FavoriteConstants.DetailConstants_DETAIL_URL);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                str2 = a(str);
            }
        }
        if (StringUtils.isEmpty(str2)) {
            try {
                str3 = intent.getDataString();
            } catch (Exception unused2) {
            }
            if (str3 != null) {
                str2 = a(str3);
            }
        }
        if (StringUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            if (StringUtils.equals(ecp.a(intent, com.taobao.android.detail.wrapper.nav.a.DETAIL_NAV_PREFETCH), "true")) {
                this.B.put("item_id", str2);
            } else {
                intent.putExtra("item_id", str2);
            }
        } catch (Exception e) {
            i.a("QueryParams", "intent.putExtra error.", e);
        }
        return str2;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String d = d(str);
        return d != null ? d : e(str);
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        return matcher2.group(1);
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        for (String str2 : new String[]{"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"}) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str}) : p.a(str, iyx.PARAM_VIDEO_AUTO_PLAY);
    }

    private String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : new String[]{"[?|&]liveId=(\\d+)"}) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Map<String, String> map = this.B;
        if (map == null) {
            return;
        }
        this.f27180a = str;
        map.put("item_id", str);
        i.c("QueryParams", "QueryParams#updateItemId, queryParams.kvs: " + this.B);
        if (!StringUtils.isEmpty(str)) {
            return;
        }
        ecg.a((Context) null, false, a(new Throwable()));
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f27180a) || StringUtils.equals(this.f27180a, "0");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Map<String, String> map = this.B;
        if (map == null) {
            return;
        }
        String str = map.get("insideDetail");
        if (!StringUtils.isEmpty(str) && "true".equals(str)) {
            return;
        }
        this.B.put("insideDetail", "true");
        ecg.k(null, StringUtils.isEmpty(this.f27180a) ? "" : this.f27180a);
    }
}
