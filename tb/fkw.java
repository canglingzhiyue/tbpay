package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.o;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.Constants;
import com.taobao.taolive.room.utils.aw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class fkw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HALF_SCREEN_GUIDE_COUNT = "halfScreenGuideCount";
    public static final String KEY_FORBID_302_NAV = "forbid302Nav";
    private static String P = null;
    private static String Q = null;
    private static final String[] R;
    public static final int T_FROM_SCAN = 1;
    public static final int T_FROM_SEARCH = 2;
    public static String V;
    public JSONObject B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public int H;
    public String I;
    public String J;
    public String K;
    public String L;
    public boolean M;
    private Activity N;
    public int T;
    public String U;

    /* renamed from: a  reason: collision with root package name */
    public String f28020a;
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
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean v;
    public boolean w;
    public String x;
    private fis O = new fis();
    public int n = 0;
    public Map<String, String> s = new HashMap();
    private Map<String, String> S = new HashMap();
    public long t = 0;
    public long u = 0;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public String W = "";

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        return null;
    }

    static {
        kge.a(-1407762361);
        P = "longitude";
        Q = "latitude";
        V = noa.KEY_CITY_CODE;
        R = new String[]{"ref_wp_pk", "ref_wp_m", "ref_wp_p", "collocation_id", "action_id", ChatInputConstant.PANEL_ID_ALBUM, "mmtag", "scm", aw.PARAM_PVID, "spm-cnt", "spm", "pre_item_id", "pre_seller_id", "weitao_user_id", "fromtorelation", "afcflow"};
    }

    public fkw a(Intent intent) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkw) ipChange.ipc$dispatch("c3514af", new Object[]{this, intent});
        }
        ctu.a("QueryParamsBuild");
        if (intent == null) {
            ctu.a();
            return this;
        }
        Uri data = intent.getData();
        this.c = fjo.a(intent, "title");
        this.d = fjo.a(intent, "reservePrice");
        this.e = fjo.a(intent, d.KEY_PIC_URL);
        this.t = intent.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        this.u = intent.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        this.f = fjo.a(intent, "ju_id");
        this.h = fjo.a(intent, "ad_word_show");
        this.i = fjo.a(intent, Constants.KEY_SEARCH_KEYWORD);
        this.n = b(fjo.a(intent, "from"));
        this.m = nyk.KEY_SHARE_CONFIG_WANGXIN.equals(fjo.a(intent, a.ATOM_caller));
        this.f28020a = fjy.b(intent);
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            if (dataString.contains(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) {
                this.o = d(dataString);
            }
            if (dataString.contains(iyx.PARAM_VIDEO_AUTO_PLAY)) {
                this.p = c(dataString);
            }
        }
        if (data == null) {
            ctu.a();
            return this;
        }
        this.g = data.getQueryParameter("clickid");
        if (TextUtils.isEmpty(this.g)) {
            this.g = fjo.a(intent, "clickid");
        }
        this.b = data.getQueryParameter("skuId");
        this.j = data.getQueryParameter("action");
        this.l = "true".equals(data.getQueryParameter("fav_status"));
        this.k = "true".equals(data.getQueryParameter(ecd.V_EFFECT_ACTION_SECKILL));
        this.q = data.getQueryParameter("fromtorelation");
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    if (!"referrer".equals(str)) {
                        this.s.put(str, String.valueOf(extras.get(str)));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        ctu.a("uriParam2KVS");
        if (!TextUtils.isEmpty(data.getQuery()) && (queryParameterNames = data.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                if (!"referrer".equals(str2)) {
                    this.s.put(str2, data.getQueryParameter(str2));
                }
            }
        }
        ctu.a();
        try {
            AliLoginInterface a2 = o.a();
            if (a2 != null) {
                String d = a2.d();
                if (!TextUtils.isEmpty(d)) {
                    this.s.put("nick", d);
                }
            }
        } catch (Exception e) {
            Activity activity = this.N;
            fjt.a(activity, "QueryParams", "put kv exception: " + e);
        }
        this.s.remove("title");
        this.s.remove(d.KEY_PIC_URL);
        this.s.remove("reservePrice");
        this.s.remove("p4p_url");
        this.s.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        Map<String, String> map = this.s;
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        String str3 = "";
        sb.append(str3);
        map.put("osVersion", sb.toString());
        this.s.put("soVersion", "2.0");
        this.s.put("appReqFrom", "detail");
        this.s.put("spm-cnt", "a2141.7631564");
        this.r = this.s.get(aw.PARAM_PVID);
        try {
            PositionInfo b = b.b(this.N);
            if (b != null) {
                this.s.put("countryCode", b.countryCode);
            }
            this.s.put("networkQuality", mtopsdk.xstate.a.a("nq"));
        } catch (Throwable unused2) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put(P, this.O.a(this.N).f27981a);
        hashMap.put(Q, this.O.a(this.N).b);
        String str4 = this.O.a(this.N).c;
        if (!TextUtils.isEmpty(str4) && !"0".equals(str4)) {
            hashMap.put(V, str4);
        }
        a(hashMap);
        this.x = data.getQueryParameter("rerankType");
        this.v = "true".equals(data.getQueryParameter("forceBackFinishInstance"));
        this.w = "true".equals(data.getQueryParameter("openPullToBack"));
        this.y = intent.getBooleanExtra("forceOpenPreloadMainPic", false);
        this.z = intent.getBooleanExtra("forceOpenPreloadWeex", false);
        this.A = intent.getBooleanExtra(KEY_FORBID_302_NAV, false);
        this.C = intent.getBooleanExtra("enableTppUpdate", false);
        this.D = data.getQueryParameter("guideExp");
        this.E = data.getQueryParameter("ndExp");
        this.F = data.getQueryParameter(fky.SP_KEY_ENTRY_EXP);
        this.G = "true".equals(data.getQueryParameter("disableHalfScreenGuide"));
        this.I = data.getQueryParameter("entryNDNid");
        this.H = a(data.getQueryParameter(HALF_SCREEN_GUIDE_COUNT));
        this.T = e(data.getQueryParameter("halfScreenTime"));
        this.J = data.getQueryParameter(kuh.ALI_TRACK_ID);
        if (fjk.a()) {
            this.K = data.getQueryParameter("autoTestInfo");
        }
        this.L = data.getQueryParameter("newType");
        this.M = "true".equals(data.getQueryParameter("enhanceHalfScreenGuide"));
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            this.U = extras2.getString("passParam");
        }
        if (data.getQueryParameter("newDetailChannel") != null) {
            str3 = data.getQueryParameter("newDetailChannel");
        }
        this.W = str3;
        b(intent);
        ctu.a();
        return this;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("all".equals(str)) {
            return Integer.MAX_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            fjt.a(fjt.TAG_HALF_SCREEN, "非全屏个数解析失败，halfScreenGuideCount = " + str);
            return -1;
        }
    }

    private int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            fjt.a(fjt.TAG_HALF_SCREEN, "非全屏次数解析失败，halfGuideTime = " + str);
            return -1;
        }
    }

    public static Map<String, String> a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4394c526", new Object[]{map, str, str2});
        }
        if (map == null) {
            return new HashMap();
        }
        map.remove("referrer");
        map.remove("title");
        map.remove(d.KEY_PIC_URL);
        map.remove("reservePrice");
        map.remove("p4p_url");
        return b(map, str, str2);
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("targetParams");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            ctu.a("parseTargetParams");
            this.B = JSONObject.parseObject(string);
            ctu.a();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_PARSE_ERROR, "itemid: " + this.f28020a + ", targetParams: " + string + ", stackTrace: " + stringWriter2, (Map<String, String>) null);
            e.printStackTrace();
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.s.putAll(map);
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : b(this.s, "trade_detail_request_params_black_list", "list_param,%22list_param,search_keyword,eurl,targetParams");
    }

    private static Map<String, String> b(Map<String, String> map, String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7c7525c5", new Object[]{map, str, str2});
        }
        HashMap hashMap = new HashMap(map);
        String config = OrangeConfig.getInstance().getConfig("android_detail", str, str2);
        if (!TextUtils.isEmpty(config)) {
            for (String str3 : config.split(",")) {
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.remove(str3);
                }
            }
        }
        return hashMap;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.s == null || map == null || map.isEmpty()) {
        } else {
            this.s.putAll(map);
        }
    }

    public Map<String, String> b() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        if (this.S.isEmpty()) {
            for (String str : R) {
                String str2 = this.s.get(str);
                if (str2 != null) {
                    this.S.put(str, str2);
                }
            }
            String str3 = this.s.get("track_params");
            if (!TextUtils.isEmpty(str3)) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSON.parseObject(str3);
                } catch (Exception unused) {
                }
                this.S.putAll(fju.a(jSONObject, new fjn<String>() { // from class: tb.fkw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // tb.fjn
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
        return new HashMap(this.S);
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if ("isFromScan".equals(str)) {
            return 1;
        }
        return "isFromWorkSearch".equals(str) ? 2 : 0;
    }

    private String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
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
}
