package com.taobao.mediaplay.model;

import mtopsdk.common.util.StringUtils;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String saltForSign = "cloudvideo_signature";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18046a;
    private String b;
    private long c;
    private float d;
    private Map<String, b> e;
    private Map<String, a> f;
    private Map<String, String> g;
    private Map<String, Integer> h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;
    private List<String> o;
    private String p;
    private boolean q;
    private String r;
    private String s = "";
    private Map<String, String> t;
    private Map<String, String> u;

    static {
        kge.a(1847112720);
    }

    public c(JSONObject jSONObject) {
        Object opt;
        Object opt2;
        float f = 1.0f;
        this.d = 1.0f;
        this.i = false;
        this.q = false;
        this.r = "";
        this.f18046a = jSONObject;
        JSONObject jSONObject2 = this.f18046a;
        if (jSONObject2 != null) {
            Object opt3 = jSONObject2.opt("coverUrl");
            this.b = opt3 == null ? null : String.valueOf(opt3);
            Object opt4 = this.f18046a.opt("id");
            this.p = opt4 == null ? null : String.valueOf(opt4);
            Object opt5 = this.f18046a.opt("duration");
            this.c = (opt5 == null || !StringUtils.isDigitsOnly(opt5.toString())) ? 0L : Long.parseLong(opt5.toString());
            Object opt6 = this.f18046a.opt("passThroughData");
            this.n = opt6 == null ? "" : String.valueOf(opt6);
            Object opt7 = this.f18046a.opt("resources");
            if (opt7 != null && (opt7 instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) opt7;
                if (jSONArray.length() > 0) {
                    this.e = new HashMap();
                    this.h = new HashMap();
                    this.g = new HashMap();
                    this.t = new HashMap();
                    this.u = new HashMap();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        b bVar = new b(jSONArray.optJSONObject(i));
                        if (!StringUtils.isEmpty(bVar.b()) && !StringUtils.isEmpty(bVar.a())) {
                            this.e.put(bVar.b(), bVar);
                            this.h.put(bVar.b(), Integer.valueOf(bVar.e()));
                            Object opt8 = jSONArray.optJSONObject(i).opt("passThroughData");
                            this.g.put(bVar.b(), opt8 == null ? "" : String.valueOf(opt8));
                        }
                        if (!StringUtils.isEmpty(bVar.c()) && !StringUtils.isEmpty(bVar.a())) {
                            this.t.put(bVar.c(), bVar.a());
                            this.u.put(bVar.c(), bVar.b());
                        }
                        Object opt9 = jSONArray.optJSONObject(i).opt("encodeUniqueCode");
                        if (opt9 != null) {
                            String valueOf = String.valueOf(opt9);
                            if (!StringUtils.isEmpty(valueOf)) {
                                this.s += valueOf;
                            }
                        }
                    }
                }
            }
            Object opt10 = this.f18046a.opt(com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_CONFIGURATION);
            if (opt10 != null && (opt10 instanceof JSONObject)) {
                JSONObject jSONObject3 = (JSONObject) opt10;
                Object opt11 = jSONObject3.opt("playerBufferSetting");
                if (opt11 != null && (opt11 instanceof JSONObject)) {
                    JSONObject jSONObject4 = (JSONObject) opt11;
                    Object opt12 = jSONObject4.opt("avdataBufferedMaxBytes");
                    this.j = (opt12 == null || !StringUtils.isDigitsOnly(opt12.toString())) ? 0 : Integer.parseInt(opt12.toString());
                    Object opt13 = jSONObject4.opt("avdataBufferedMaxTime");
                    this.k = (opt13 == null || !StringUtils.isDigitsOnly(opt13.toString())) ? 0 : Integer.parseInt(opt13.toString());
                    Object opt14 = jSONObject4.opt("currentLevel");
                    this.l = (opt14 == null || !StringUtils.isDigitsOnly(opt14.toString())) ? 0 : Integer.parseInt(opt14.toString());
                    Object opt15 = jSONObject4.opt("maxLevel");
                    this.m = (opt15 == null || !StringUtils.isDigitsOnly(opt15.toString())) ? 0 : Integer.parseInt(opt15.toString());
                }
                try {
                    Object opt16 = jSONObject3.opt(com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_ENABLEVODABR);
                    if (opt16 != null) {
                        this.i = com.taobao.taobaoavsdk.util.b.a(opt16.toString());
                    }
                } catch (Exception unused) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "DWVideoInfoData construct: get enableVodAbr from configurationObj failed!");
                }
            }
            Object opt17 = this.f18046a.opt("caches");
            if (opt17 != null && (opt17 instanceof JSONArray)) {
                JSONArray jSONArray2 = (JSONArray) opt17;
                if (jSONArray2.length() > 0) {
                    this.f = new HashMap();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        a aVar = new a(jSONArray2.optJSONObject(i2));
                        if (!StringUtils.isEmpty(aVar.b()) && !StringUtils.isEmpty(aVar.a())) {
                            this.f.put(aVar.b(), aVar);
                        }
                    }
                }
            }
            Object opt18 = this.f18046a.opt("definitionPriority");
            if (opt18 != null && (opt18 instanceof JSONArray)) {
                JSONArray jSONArray3 = (JSONArray) opt18;
                if (jSONArray3.length() > 0) {
                    this.o = new ArrayList();
                    int length3 = jSONArray3.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        Object opt19 = jSONArray3.opt(i3);
                        String valueOf2 = opt19 == null ? null : String.valueOf(opt19);
                        if (!StringUtils.isEmpty(valueOf2)) {
                            this.o.add(valueOf2);
                        }
                    }
                }
            }
            Object opt20 = this.f18046a.opt("playOptions");
            if (opt20 != null && (opt20 instanceof JSONObject) && (opt2 = ((JSONObject) opt20).opt("audioGainCoef")) != null) {
                this.d = opt2 != null ? Float.parseFloat(String.valueOf(opt2)) : f;
            }
            this.q = this.f18046a.optBoolean("videoMute");
            Object opt21 = this.f18046a.opt("bizFieldValue");
            if (opt21 == null || !(opt21 instanceof JSONObject) || (opt = ((JSONObject) opt21).opt(AlipayAuthConstant.SIGN_DATA)) == null) {
                return;
            }
            this.r = String.valueOf(opt);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "get the mSignData=" + this.r);
        }
    }

    public Map<String, b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.e;
    }

    public Map<String, a> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.f;
    }

    public Map<String, Integer> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.h;
    }

    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.t;
    }

    public Map<String, String> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ad1062ec", new Object[]{this}) : this.u;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.i;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.l;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.m;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.j << 10;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.k;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.n;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Map<String, String> map = this.g;
        if (map == null) {
            return "";
        }
        String str2 = map.get(str);
        return StringUtils.isEmpty(str2) ? "" : str2;
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.o;
    }

    public float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.d;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.p;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.q;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3286165a", new Object[]{jSONObject})).booleanValue();
        }
        if (!com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "checkVideoInfoTtl", "true"))) {
            return true;
        }
        if (jSONObject == null) {
            return false;
        }
        Object opt = jSONObject.opt(RemoteMessageConst.TTL);
        Object opt2 = jSONObject.opt("respTimeInMs");
        return opt == null || opt2 == null || com.taobao.taobaoavsdk.util.b.c(opt2.toString()) + (com.taobao.taobaoavsdk.util.b.c(opt.toString()) * 1000) > System.currentTimeMillis();
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            return new BigInteger(1, messageDigest.digest((str + str2).getBytes("utf-8"))).toString(16);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "getMD5 failed at DWVideoInfoData with originData=" + str + ",salt=" + str2);
            throw new RuntimeException();
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        String a2 = a(this.s, saltForSign);
        return a2 != null && a2.equals(this.r);
    }
}
