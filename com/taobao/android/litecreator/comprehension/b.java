package com.taobao.android.litecreator.comprehension;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.mtop.ComprehensionMTopRequest;
import com.taobao.android.litecreator.comprehension.mtop.RecognizeVideoMusicMTopRequest;
import com.taobao.android.litecreator.util.ab;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.av;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ios;
import tb.kge;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_API_NAME = "mtop.taobao.media.guang.publish.comprehension";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_VIDEO = "video";

    /* renamed from: a */
    private static final Map<String, b> f13323a;
    public static HashMap<String, String> m;
    public static HashMap<String, String> n;
    private String b;
    private com.taobao.android.litecreator.comprehension.a c;
    private g f;
    private JSONArray k;
    private boolean o;
    private Map<String, ContentComprehensionResult> d = new HashMap();
    private a e = new a();
    private boolean g = true;
    private boolean h = true;
    private d<ContentComprehensionResult> i = null;
    private boolean j = false;
    private ArrayList<d<ContentComprehensionResult>> l = new ArrayList<>();

    public static /* synthetic */ ContentComprehensionResult a(b bVar, String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentComprehensionResult) ipChange.ipc$dispatch("97f7e42d", new Object[]{bVar, str, mtopResponse}) : bVar.a(str, mtopResponse);
    }

    public static /* synthetic */ com.taobao.android.litecreator.comprehension.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.litecreator.comprehension.a) ipChange.ipc$dispatch("6f8870f", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ d a(b bVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("3df68332", new Object[]{bVar, dVar});
        }
        bVar.i = dVar;
        return dVar;
    }

    public static /* synthetic */ void a(b bVar, ContentComprehensionResult contentComprehensionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681a67a6", new Object[]{bVar, contentComprehensionResult});
        } else {
            bVar.a(contentComprehensionResult);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7184f71a", new Object[]{bVar, str, jSONArray, jSONObject});
        } else {
            bVar.b(str, jSONArray, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee4c2b4", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.h = z;
        return z;
    }

    public static /* synthetic */ d b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bf8547cb", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ boolean b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9004153", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.g = z;
        return z;
    }

    public static /* synthetic */ a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bbaf728f", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ g d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("309ec8e6", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ ArrayList e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("e35a4a82", new Object[]{bVar}) : bVar.l;
    }

    static {
        kge.a(-1308871790);
        f13323a = new HashMap();
        HashMap<String, String> hashMap = new HashMap<>();
        m = hashMap;
        hashMap.put("music", "recommendMusics");
        m.put("topic", "recommendTopics");
        m.put("label", "recommendLabels");
        m.put("videoEditSticker", "recommendVideoEditStickers");
        m.put("picEditSticker", "recommendPicEditStickers");
        m.put("recognizeVideoMusic", "recommendVideoMusicRecognize");
        m.put("rateTitle", "recommendRateTitles");
        HashMap<String, String> hashMap2 = new HashMap<>();
        n = hashMap2;
        hashMap2.put("rateTitle", "mtop.taobao.rate.publish.comprehension");
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8f19a9e0", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            str = "single_session";
        }
        if (!f13323a.containsKey(str)) {
            f13323a.put(str, new b(str));
        }
        return f13323a.get(str);
    }

    private b(String str) {
        k(str);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : ios.a(this.b).a("comprehension_enable", false) || g();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.o;
    }

    private void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
            return;
        }
        u.b("LCCOM.Tool", "initialize.");
        this.b = str;
        this.e.f13330a = str;
        this.c = new com.taobao.android.litecreator.comprehension.a(str, this);
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aeca7f", new Object[]{this, gVar});
        } else {
            this.f = gVar;
        }
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c7fa0a7f", new Object[]{this, str});
        }
        this.c.a(str);
        this.j = true;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.f13314a.clear();
        this.j = true;
    }

    public b a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8797d5d9", new Object[]{this, list});
        }
        a(list, (c) null);
        return this;
    }

    public b a(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bee091de", new Object[]{this, list, cVar}) : a(list, true, cVar);
    }

    public b a(List<String> list, boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("89e12e5c", new Object[]{this, list, new Boolean(z), cVar});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerImages. imagePath:" + ab.a(list));
        a aVar = this.e;
        aVar.c = "";
        aVar.d = "";
        this.c.a(list, z, cVar);
        this.j = true;
        return this;
    }

    public b b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2405d238", new Object[]{this, list});
        }
        this.c.f13314a.clear();
        this.c.f13314a = list;
        this.j = true;
        u.b("LCCOM.Tool", "offerRemoteUrls. remoteUrls:" + list);
        return this;
    }

    public b c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("da6b1e", new Object[]{this, str});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerContent. content:" + str);
        this.c.b(str);
        this.j = true;
        return this;
    }

    public b l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bdd0b5", new Object[]{this, str});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerContent. title:" + str);
        this.c.c(str);
        this.j = true;
        return this;
    }

    public b m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("399e3154", new Object[]{this, str});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerContent. goodsTitle:" + str);
        this.c.g = str;
        this.j = true;
        return this;
    }

    public b a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f9e98d76", new Object[]{this, new Long(j)});
        }
        if (a() && j > 0) {
            u.b("LCCOM.Tool", "offerContent. goodsCate:" + j);
            this.c.q = j;
            this.j = true;
        }
        return this;
    }

    public b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("83fe757", new Object[]{this, new Integer(i)});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerContent. score:" + i);
        this.c.r = i;
        this.j = true;
        return this;
    }

    public b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("17137bca", new Object[]{this, jSONObject});
        }
        if (!a()) {
            return this;
        }
        this.c.a(jSONObject);
        this.j = true;
        return this;
    }

    public b c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c073ce97", new Object[]{this, list});
        }
        if (!a()) {
            return this;
        }
        u.b("LCCOM.Tool", "offerItems. itemIds:" + ab.a(list));
        this.c.a(list);
        this.j = true;
        return this;
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
        } else {
            a(str, (JSONArray) null, (JSONObject) null);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            a(str, (JSONArray) null, jSONObject);
        }
    }

    public void a(final String str, final JSONArray jSONArray, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a11f0d6", new Object[]{this, str, jSONArray, jSONObject});
        } else if (!a() && !StringUtils.equals("rateTitle", str)) {
        } else {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
                jSONArray.add(str);
            }
            if (!this.j && a(jSONArray, this.k)) {
                return;
            }
            this.j = false;
            u.b("LCCOM.Tool", "submit.");
            e(str);
            this.k = jSONArray;
            if (StringUtils.equals(str, "recognizeVideoMusic")) {
                this.h = true;
                this.c.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.this.f(str);
                        }
                    }
                });
                return;
            }
            this.g = true;
            this.c.a(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, str, jSONArray, jSONObject);
                    }
                }
            });
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a(str, true);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            a(str, false);
        }
    }

    private void a(String str, boolean z) {
        ContentComprehensionResult contentComprehensionResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (!this.d.containsKey(str) || (contentComprehensionResult = this.d.get(str)) == null) {
        } else {
            contentComprehensionResult.clear();
            if (!z) {
                return;
            }
            this.g = true;
        }
    }

    public void f(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            au.b(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = b.this;
                    bVar.a(str, b.a(bVar).a());
                }
            });
        }
    }

    public void a(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), new RecognizeVideoMusicMTopRequest(ios.a(this.b).c(), this.b, str2)).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.comprehension.ContentComprehensionTool$4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.a(b.this, false);
                    u.d("LCCOM.Tool", "submit.checkMusicCopy.onSystemError. response:" + mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    b.a(b.this, false);
                    ContentComprehensionResult a2 = b.a(b.this, str, mtopResponse);
                    if (b.b(b.this) != null) {
                        b.b(b.this).a(a2);
                        b.a(b.this, (d) null);
                    }
                    u.b("LCCOM.Tool", "submit.checkMusicCopy.onSuccess. response:" + a2.bizData);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    b.a(b.this, false);
                    u.d("LCCOM.Tool", "submit.checkMusicCopy.onError. response:" + mtopResponse);
                }
            }).mo1305reqMethod(MethodEnum.POST).startRequest();
        }
    }

    private ContentComprehensionResult a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("5bea0df1", new Object[]{this, str, mtopResponse});
        }
        ContentComprehensionResult contentComprehensionResult = new ContentComprehensionResult();
        contentComprehensionResult.timeStamp = System.currentTimeMillis();
        contentComprehensionResult.bizData = mtopResponse.getDataJsonObject();
        this.d.put(str, contentComprehensionResult);
        return contentComprehensionResult;
    }

    private void b(final String str, final JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6d07b5", new Object[]{this, str, jSONArray, jSONObject});
            return;
        }
        this.e.h = this.c.d();
        final JSONObject a2 = this.c.a(jSONArray, jSONObject);
        final ios.a a3 = ios.a(this.b);
        a2.put("ugcScene", (Object) a3.c());
        a2.put("contentType", (Object) (StringUtils.equals("image", this.e.b) ? "article" : "video"));
        av.a(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a2.put("publishParams", (Object) JSON.toJSON(a3.a()).toString());
                }
            }
        });
        boolean z = this.c.c() || (StringUtils.equals(str, "music") || StringUtils.equals(str, "videoEditSticker") || StringUtils.equals(str, "picEditSticker"));
        u.b("LCCOM.Tool", "submit.afterDataReady.Start. data is valid:" + z + ", data:" + a2.toJSONString());
        if (!z) {
            this.g = false;
            a((ContentComprehensionResult) null);
            return;
        }
        ComprehensionMTopRequest comprehensionMTopRequest = new ComprehensionMTopRequest();
        String str2 = n.get(str);
        if (StringUtils.isEmpty(str2)) {
            str2 = DEFAULT_API_NAME;
        }
        comprehensionMTopRequest.setAPI_NAME(str2);
        comprehensionMTopRequest.setParams(a2.toJSONString());
        final long currentTimeMillis = System.currentTimeMillis();
        MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), comprehensionMTopRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.comprehension.ContentComprehensionTool$6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                u.d("LCCOM.Tool", "submit.afterDataReady.onSystemError. response:" + mtopResponse);
                b.b(b.this, false);
                b.a(b.this, (ContentComprehensionResult) null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ContentComprehensionResult a4 = b.a(b.this, str, mtopResponse);
                u.b("LCCOM.Tool", "submit.afterDataReady.onSuccess. response:" + a4.bizData);
                b.c(b.this).f = System.currentTimeMillis() - currentTimeMillis;
                b.c(b.this).j = jSONArray;
                b.b(b.this, false);
                b.a(b.this, a4);
                if (b.d(b.this) == null) {
                    return;
                }
                b.d(b.this).a("Complete", b.c(b.this).a(), false);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                u.d("LCCOM.Tool", "submit.afterDataReady.onError. response:" + mtopResponse);
                b.b(b.this, false);
                b.a(b.this, (ContentComprehensionResult) null);
            }
        }).mo1305reqMethod(MethodEnum.POST).startRequest();
    }

    private void a(final ContentComprehensionResult contentComprehensionResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27851c62", new Object[]{this, contentComprehensionResult});
        } else {
            au.c(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.ContentComprehensionTool$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = b.e(b.this).iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (dVar != null) {
                            dVar.a(contentComprehensionResult);
                        }
                        it.remove();
                    }
                }
            });
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.e.b = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.e.i = str;
        }
    }

    public ArrayList<d<ContentComprehensionResult>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.l;
    }

    public void a(String str, final d<ContentComprehensionResult> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea0d12c", new Object[]{this, str, dVar});
        } else if (dVar == null) {
        } else {
            if (StringUtils.equals(str, "recognizeVideoMusic")) {
                b(str, dVar);
                return;
            }
            if (this.f != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", this.e.b);
                hashMap.put("session_id", this.e.f13330a);
                hashMap.put("state", String.valueOf(this.g ? 1 : 0));
                this.f.a("QueryResult", hashMap, false);
            }
            if (this.g) {
                u.b("LCCOM.Tool", "query async.bizType=" + str);
                this.l.add(dVar);
                return;
            }
            final ContentComprehensionResult j = j(str);
            u.b("LCCOM.Tool", "query sync.bizType=" + str + ",result=" + j.toString());
            au.c(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dVar.a(j);
                    }
                }
            });
        }
    }

    public void b(String str, final d<ContentComprehensionResult> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cc846d", new Object[]{this, str, dVar});
        } else if (dVar == null) {
        } else {
            if (this.h) {
                u.b("LCCOM.Tool", "query async.bizType=" + str);
                this.i = dVar;
                return;
            }
            final ContentComprehensionResult j = j(str);
            u.b("LCCOM.Tool", "query sync.bizType=" + str + ",result=" + j.toString());
            au.c(new Runnable() { // from class: com.taobao.android.litecreator.comprehension.b.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dVar.a(j);
                    }
                }
            });
        }
    }

    public ContentComprehensionResult i(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentComprehensionResult) ipChange.ipc$dispatch("7b9eddb4", new Object[]{this, str}) : j(str);
    }

    public ContentComprehensionResult j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentComprehensionResult) ipChange.ipc$dispatch("a3e51df5", new Object[]{this, str});
        }
        if (this.d.containsKey(str)) {
            ContentComprehensionResult contentComprehensionResult = this.d.get(str);
            return contentComprehensionResult != null ? contentComprehensionResult : new ContentComprehensionResult();
        }
        return new ContentComprehensionResult();
    }

    public a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("372fcdea", new Object[]{this}) : this.e;
    }

    private boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0623ebc", new Object[]{this, jSONArray, jSONArray2})).booleanValue();
        }
        if (jSONArray == jSONArray2) {
            return true;
        }
        return jSONArray != null && jSONArray2 != null && jSONArray.contains(jSONArray2) && jSONArray2.contains(jSONArray);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f13330a;
        public String b = "image";
        public String c = "";
        public String d = "";
        public long e = 0;
        public long f = 0;
        public int g = 0;
        public int h = 0;
        public String i = "";
        public JSONArray j;

        static {
            kge.a(2119536860);
        }

        public synchronized void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            this.c += "|" + j;
        }

        public synchronized void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
                return;
            }
            this.d += "|" + j;
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", this.b);
            hashMap.put("session_id", this.f13330a);
            hashMap.put("compress_cost", this.c);
            hashMap.put("upload_cost", this.d);
            hashMap.put("pre_processing_cost", String.valueOf(this.e));
            hashMap.put("comprehension_cost", String.valueOf(this.f));
            hashMap.put("total_frame_count", String.valueOf(this.g));
            hashMap.put("total_uploaded_frame_count", String.valueOf(this.h));
            hashMap.put("source", this.i);
            JSONArray jSONArray = this.j;
            hashMap.put("biz_type", jSONArray != null ? jSONArray.toJSONString() : "");
            return hashMap;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        for (Map.Entry<String, b> entry : f13323a.entrySet()) {
            if (entry != null) {
                b value = entry.getValue();
                value.c().clear();
                value.d.clear();
                value.c.b();
            }
        }
        f13323a.clear();
        h.INSTANCE.b().clear();
        h.INSTANCE.a().clear();
        u.d("LCCOM.Tool", "clearAll: ContentComprehensionTool " + f13323a.size());
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        for (Map.Entry<String, b> entry : f13323a.entrySet()) {
            if (entry != null) {
                b value = entry.getValue();
                value.c().clear();
                value.c.b();
            }
        }
        u.d("LCCOM.Tool", "clearData: ContentComprehensionTool " + f13323a.size());
    }
}
