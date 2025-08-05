package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class sps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public JSONObject I;
    public String J;
    public String K;
    public Map<String, String> L;
    public Map<String, String> M;
    private Map<String, String> N;
    private spr O;
    private Map<String, String> P;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f33820a = new HashMap<>();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    static {
        kge.a(-689837512);
    }

    public sps(Uri uri) {
        this.b = uri.getQueryParameter("type");
        this.c = uri.getQueryParameter("source");
        this.d = uri.getQueryParameter("id");
        this.e = uri.getQueryParameter("spm");
        this.f = uri.getQueryParameter("business_spm");
        this.g = uri.getQueryParameter("topicId");
        this.h = uri.getQueryParameter("videoUrl");
        this.i = uri.getQueryParameter(a.KEY_DETAIL_PARAMETERS);
        this.j = uri.getQueryParameter("bizParameters");
        this.k = uri.getQueryParameter("interactiveId");
        this.l = uri.getQueryParameter("hideAccountInfo");
        this.m = uri.getQueryParameter("contentId");
        this.n = uri.getQueryParameter("sourceId");
        this.o = uri.getQueryParameter("accountId");
        this.p = uri.getQueryParameter("ab");
        this.q = uri.getQueryParameter("coverImage");
        this.r = uri.getQueryParameter("tppParameters");
        this.s = uri.getQueryParameter("height");
        this.t = uri.getQueryParameter("width");
        this.v = uri.getQueryParameter("extParams");
        this.w = uri.getQueryParameter("sourcePageName");
        this.x = uri.getQueryParameter("shareScene");
        this.y = uri.getQueryParameter("miniAppId");
        this.z = uri.getQueryParameter("hasSharedInstance");
        this.A = uri.getQueryParameter("trackInfo");
        this.B = uri.getQueryParameter("umpChannel");
        this.C = uri.getQueryParameter("commentId");
        this.D = uri.getQueryParameter("scm");
        this.K = uri.getQueryParameter("utExtParams");
        this.E = uri.getQueryParameter("clickid");
        this.u = uri.getQueryParameter("sceneId");
        this.F = uri.getQueryParameter("LocalWidth");
        this.G = uri.getQueryParameter("LocalHeight");
        this.H = uri.getQueryParameter("tbvs_ddns");
        for (String str : uri.getQueryParameterNames()) {
            this.f33820a.put(str, uri.getQueryParameter(str));
        }
        String queryParameter = uri.getQueryParameter(aw.PARAM_UT_PARAMS);
        this.J = queryParameter;
        if (TextUtils.isEmpty(queryParameter)) {
            this.I = null;
        } else {
            this.I = JSON.parseObject(queryParameter);
        }
        if (!juo.d()) {
            this.L = (Map) obz.a(uri.getQueryParameter("globalUtParams"), new TypeReference<Map<String, String>>() { // from class: tb.sps.1
            });
            this.M = (Map) obz.a(uri.getQueryParameter("pageUtParams"), new TypeReference<Map<String, String>>() { // from class: tb.sps.2
            });
        } else {
            this.L = null;
            this.M = null;
        }
        this.O = new spr();
    }

    public spr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spr) ipChange.ipc$dispatch("f0a9e09", new Object[]{this}) : this.O;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.N;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.N = map;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void b(Map map) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null) {
            HashMap<String, String> b = oec.b(map);
            for (Map.Entry<String, String> entry : b.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -1827029976:
                        if (key.equals("accountId")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1799558163:
                        if (key.equals("shareScene")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1793914700:
                        if (key.equals("pageUtParams")) {
                            c = '$';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1636653155:
                        if (key.equals("interactiveId")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1539012526:
                        if (key.equals("LocalHeight")) {
                            c = ' ';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1495016486:
                        if (key.equals("commentId")) {
                            c = JSONLexer.EOI;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225813241:
                        if (key.equals("extParams")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1221029593:
                        if (key.equals("height")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1139259734:
                        if (key.equals("topicId")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1005509317:
                        if (key.equals("LocalWidth")) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case -931418869:
                        if (key.equals("umpChannel")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case -896505829:
                        if (key.equals("source")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -751680229:
                        if (key.equals(a.KEY_DETAIL_PARAMETERS)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -672412495:
                        if (key.equals("business_spm")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -504237323:
                        if (key.equals("sourcePageName")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case -407108748:
                        if (key.equals("contentId")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -332486872:
                        if (key.equals("utExtParams")) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case -261828135:
                        if (key.equals("hideAccountInfo")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -168864312:
                        if (key.equals("globalUtParams")) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case -108833458:
                        if (key.equals(aw.PARAM_UT_PARAMS)) {
                            c = '\"';
                            break;
                        }
                        c = 65535;
                        break;
                    case -47440035:
                        if (key.equals("bizParameters")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3105:
                        if (key.equals("ab")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3355:
                        if (key.equals("id")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113693:
                        if (key.equals("scm")) {
                            c = 27;
                            break;
                        }
                        c = 65535;
                        break;
                    case 114096:
                        if (key.equals("spm")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3575610:
                        if (key.equals("type")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113126854:
                        if (key.equals("width")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 519818329:
                        if (key.equals("tbvs_ddns")) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 659496574:
                        if (key.equals("tppParameters")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 729492633:
                        if (key.equals("trackInfo")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 778144005:
                        if (key.equals("miniAppId")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 860524707:
                        if (key.equals("clickid")) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1151378164:
                        if (key.equals("videoUrl")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1232281572:
                        if (key.equals("coverImage")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1674066260:
                        if (key.equals("hasSharedInstance")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1746327190:
                        if (key.equals("sourceId")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1914646215:
                        if (key.equals("sceneId")) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.b = value;
                        break;
                    case 1:
                        this.c = value;
                        break;
                    case 2:
                        this.d = value;
                        break;
                    case 3:
                        this.e = value;
                        break;
                    case 4:
                        this.f = value;
                        break;
                    case 5:
                        this.g = value;
                        break;
                    case 6:
                        this.h = value;
                        break;
                    case 7:
                        this.i = value;
                        break;
                    case '\b':
                        this.j = value;
                        break;
                    case '\t':
                        this.k = value;
                        break;
                    case '\n':
                        this.l = value;
                        break;
                    case 11:
                        this.m = value;
                        break;
                    case '\f':
                        this.n = value;
                        break;
                    case '\r':
                        this.o = value;
                        break;
                    case 14:
                        this.p = value;
                        break;
                    case 15:
                        this.q = value;
                        break;
                    case 16:
                        this.r = value;
                        break;
                    case 17:
                        this.s = value;
                        break;
                    case 18:
                        this.t = value;
                        break;
                    case 19:
                        this.v = value;
                        break;
                    case 20:
                        this.w = value;
                        break;
                    case 21:
                        this.x = value;
                        break;
                    case 22:
                        this.y = value;
                        break;
                    case 23:
                        this.z = value;
                        break;
                    case 24:
                        this.A = value;
                        break;
                    case 25:
                        this.B = value;
                        break;
                    case 26:
                        this.C = value;
                        break;
                    case 27:
                        this.D = value;
                        break;
                    case 28:
                        this.K = value;
                        break;
                    case 29:
                        this.E = value;
                        break;
                    case 30:
                        this.u = value;
                        break;
                    case 31:
                        this.F = value;
                        break;
                    case ' ':
                        this.G = value;
                        break;
                    case '!':
                        this.H = value;
                        break;
                    case '\"':
                        if (value != null) {
                            this.J = value;
                            if (!TextUtils.isEmpty(value)) {
                                this.I = JSON.parseObject(value);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case '#':
                        this.L = (Map) obz.a(value, new TypeReference<Map<String, String>>() { // from class: tb.sps.3
                        });
                        break;
                    case '$':
                        this.M = (Map) obz.a(value, new TypeReference<Map<String, String>>() { // from class: tb.sps.4
                        });
                        break;
                }
            }
            this.f33820a.putAll(b);
        }
    }

    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.P = map;
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.P;
    }
}
