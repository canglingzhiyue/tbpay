package com.taobao.android.fluid.framework.data.datamodel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.web.IWebViewListener;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taolive.uikit.mtop.HpBannerFrontData;
import com.taobao.trtc.api.TrtcConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.hdx;
import tb.kge;
import tb.obu;
import tb.ocb;
import tb.oec;
import tb.ogv;
import tb.sjv;
import tb.slk;
import tb.slm;
import tb.son;
import tb.spo;
import tb.spz;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MediaSetData";
    public static final int TYPE_ALBUM = 1;
    public static final int TYPE_CACHE_VIDEO = 100;
    public static final int TYPE_EXT = 4;
    public static final int TYPE_LIVEVIDEO = 2;
    public static final int TYPE_PICTURE_ALBUM = 3;
    public static final int TYPE_SHORTVIDEO = 0;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WEB = 5;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<c> f12529a = new LinkedList<>();
    public int b;
    private final int c;
    private final MediaContentDetailData d;
    private boolean e;

    static {
        kge.a(1466223444);
    }

    public static /* synthetic */ int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : b(str);
    }

    public a(MediaContentDetailData mediaContentDetailData, JSONObject jSONObject) {
        c cVar = new c(0, null);
        c.a(cVar, mediaContentDetailData);
        cVar.d = jSONObject;
        this.f12529a.add(cVar);
        this.c = 0;
        this.d = mediaContentDetailData;
    }

    public static int a(MediaContentDetailData mediaContentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3db4bae", new Object[]{mediaContentDetailData})).intValue();
        }
        if (mediaContentDetailData != null) {
            return b(mediaContentDetailData.type);
        }
        return -1;
    }

    private static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        String upperCase = str.toUpperCase();
        if (StringUtils.equals(upperCase, "VIDEO")) {
            return 0;
        }
        if (StringUtils.equals(upperCase, "COLLECTION")) {
            return 1;
        }
        if (StringUtils.equals(upperCase, "LIVE")) {
            return 2;
        }
        if (StringUtils.equals(upperCase, "PICTURE_ALBUM")) {
            return 3;
        }
        if (StringUtils.equals(upperCase, "EXT")) {
            return 4;
        }
        return (!com.taobao.android.fluid.framework.card.cards.web.c.a() || !StringUtils.equals(upperCase, "GGGAME")) ? -1 : 5;
    }

    public static List<PicElement> b(MediaContentDetailData mediaContentDetailData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3c986ccb", new Object[]{mediaContentDetailData});
        }
        MediaContentDetailData.Content content = mediaContentDetailData.content;
        if (content == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) slm.a(content.elements);
        if (ogv.a(jSONObject)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONObject.size(); i++) {
            if (HpBannerFrontData.TYPE_PIC.equalsIgnoreCase((String) jSONObject.get("type"))) {
                arrayList.add((PicElement) JSON.toJavaObject(jSONObject, PicElement.class));
            }
        }
        return arrayList;
    }

    public static int a(a aVar) {
        c a2;
        MediaContentDetailData i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e800257", new Object[]{aVar})).intValue();
        }
        if (aVar != null && (a2 = aVar.a()) != null && (i = a2.i()) != null) {
            return i.index;
        }
        return -1;
    }

    public static a a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("29549355", new Object[]{list});
        }
        if (!ogv.a(list)) {
            return list.get(0);
        }
        return null;
    }

    public static slk.a a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slk.a) ipChange.ipc$dispatch("5b898b1d", new Object[]{str, str2, str3, str4, str5});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) "VIDEO");
        jSONObject.put("url", (Object) str);
        jSONObject.put("height", (Object) str2);
        jSONObject.put("width", (Object) str3);
        arrayList2.add(jSONObject);
        content.elements = arrayList2;
        mediaContentDetailData.type = "VIDEO";
        mediaContentDetailData.content = content;
        mediaContentDetailData.publishStatus = hdx.PAGE_PUBLISH;
        jSONArray.add(new JSONObject());
        arrayList.add(mediaContentDetailData);
        return new slk.a(null, arrayList, jSONArray, null, null);
    }

    public static slk.a a(List<JSONObject> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (slk.a) ipChange.ipc$dispatch("9f7b54ea", new Object[]{list, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        MediaContentDetailData mediaContentDetailData = new MediaContentDetailData();
        MediaContentDetailData.Content content = new MediaContentDetailData.Content();
        content.elements = new ArrayList();
        content.elements.addAll(list);
        content.music = str2;
        mediaContentDetailData.type = "PICTURE_ALBUM";
        mediaContentDetailData.content = content;
        mediaContentDetailData.publishStatus = hdx.PAGE_PUBLISH;
        jSONArray.add(new JSONObject());
        arrayList.add(mediaContentDetailData);
        return new slk.a(null, arrayList, jSONArray, null, null);
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("afe4c9c5", new Object[]{this}) : this.f12529a.get(this.c);
    }

    public c a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2da3acb8", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.f12529a.size()) {
            return this.f12529a.get(i);
        }
        return null;
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        c a2 = a(i);
        if (a2 != null) {
            return b(a2.G());
        }
        return -1;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a().i().publishStatus;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12531a;
        public final JSONObject b;
        public String c;
        public JSONObject d;
        private final MediaContentDetailData e;
        private final MediaContentDetailData f;
        private final Map g;
        private MediaContentDetailData h;
        private String i;
        private int j;
        private int k;

        static {
            kge.a(-731164699);
        }

        public static /* synthetic */ MediaContentDetailData a(c cVar, MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData) ipChange.ipc$dispatch("7781f711", new Object[]{cVar, mediaContentDetailData});
            }
            cVar.h = mediaContentDetailData;
            return mediaContentDetailData;
        }

        public static /* synthetic */ MediaContentDetailData b(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MediaContentDetailData) ipChange.ipc$dispatch("e1722845", new Object[]{cVar}) : cVar.h;
        }

        public static /* synthetic */ MediaContentDetailData c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MediaContentDetailData) ipChange.ipc$dispatch("ec472fc6", new Object[]{cVar}) : cVar.f;
        }

        public static /* synthetic */ boolean d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf6a3c66", new Object[]{cVar})).booleanValue() : cVar.L();
        }

        private c(int i, MediaContentDetailData mediaContentDetailData) {
            this.b = new JSONObject();
            this.f = null;
            this.g = new HashMap();
            this.d = null;
            this.h = null;
            this.j = -1;
            this.k = -1;
            this.f12531a = i;
            this.e = mediaContentDetailData;
            this.g.put("isCache", false);
            this.g.put(com.taobao.android.fluid.framework.data.remote.c.KEY_ISAUTOSLIDE, false);
        }

        public static String a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("797c4cfb", new Object[]{cVar}) : (cVar == null || !cVar.s()) ? "" : "1";
        }

        private static VideoElement b(MediaContentDetailData mediaContentDetailData) {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("77b492fc", new Object[]{mediaContentDetailData});
            }
            VideoElement videoElement = null;
            if (!"VIDEO".equalsIgnoreCase(mediaContentDetailData.type) || (content = mediaContentDetailData.content) == null) {
                return null;
            }
            if (content.elements != null && !content.elements.isEmpty()) {
                if (son.d() && content.videoElement != null) {
                    spz.c(a.TAG, "videoElement不为null,return,id:" + content.videoElement.videoId);
                    return content.videoElement;
                }
                JSONObject jSONObject = content.elements.get(0);
                if (!ogv.a(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    spz.c(a.TAG, "videoElement构建:" + jSONObject.toJSONString());
                    try {
                        videoElement = (VideoElement) JSON.toJavaObject(jSONObject, VideoElement.class);
                    } catch (Throwable th) {
                        spz.c(a.TAG, "getVideoElement error:" + th);
                    }
                    content.videoElement = videoElement;
                }
            }
            return videoElement;
        }

        private static String c(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6b91c603", new Object[]{mediaContentDetailData});
            }
            VideoElement b = b(mediaContentDetailData);
            if (b != null) {
                return b.videoId;
            }
            return null;
        }

        private static int d(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d955f271", new Object[]{mediaContentDetailData})).intValue();
            }
            VideoElement b = b(mediaContentDetailData);
            if (b != null) {
                return b.width;
            }
            return 0;
        }

        private static int e(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e07ed4b2", new Object[]{mediaContentDetailData})).intValue();
            }
            VideoElement b = b(mediaContentDetailData);
            if (b != null) {
                return b.height;
            }
            return 0;
        }

        public MediaContentDetailData.Account a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Account) ipChange.ipc$dispatch("ca8e73b8", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.account : mediaContentDetailData.account;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            try {
                this.h.interaction.share.count++;
                this.h.interaction.share.countFmt = ocb.a(this.h.interaction.share.count);
            } catch (Exception unused) {
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.account == null ? "" : this.h.account.id;
            }
            MediaContentDetailData mediaContentDetailData2 = this.e;
            if (mediaContentDetailData2 != null) {
                return mediaContentDetailData2.account == null ? "" : this.e.account.id;
            }
            MediaContentDetailData mediaContentDetailData3 = this.f;
            return (mediaContentDetailData3 == null || mediaContentDetailData3.account == null) ? "" : this.f.account.id;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.account == null ? "" : this.h.account.idStr;
            }
            MediaContentDetailData mediaContentDetailData2 = this.e;
            if (mediaContentDetailData2 != null) {
                return mediaContentDetailData2.account == null ? "" : this.e.account.idStr;
            }
            MediaContentDetailData mediaContentDetailData3 = this.f;
            return (mediaContentDetailData3 == null || mediaContentDetailData3.account == null) ? "" : this.f.account.idStr;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.account == null ? "" : this.h.account.keyName;
            }
            MediaContentDetailData mediaContentDetailData2 = this.e;
            if (mediaContentDetailData2 != null) {
                return mediaContentDetailData2.account == null ? "" : this.e.account.keyName;
            }
            MediaContentDetailData mediaContentDetailData3 = this.f;
            return (mediaContentDetailData3 == null || mediaContentDetailData3.account == null) ? "" : this.f.account.keyName;
        }

        public MediaContentDetailData.Content f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Content) ipChange.ipc$dispatch("84466007", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.content : mediaContentDetailData.content;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.id : mediaContentDetailData.id;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.content == null ? "" : this.f.content.coverUrl : mediaContentDetailData.content == null ? "" : this.h.content.coverUrl;
        }

        public MediaContentDetailData i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData) ipChange.ipc$dispatch("f8c06af9", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f : mediaContentDetailData;
        }

        public Map a(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2c5bc44f", new Object[]{this, fluidContext});
            }
            if (son.j()) {
                return b(fluidContext);
            }
            return c(fluidContext);
        }

        public int x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
            }
            try {
                JSONObject jSONObject = this.h.content.elements.get(0);
                if (!ogv.a(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    return slm.a((String) jSONObject.get("duration"), 0);
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
            }
            try {
                return oec.a((Object) this.h.interaction.follow.link, false);
            } catch (Exception unused) {
                return false;
            }
        }

        public Map k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData == null) {
                return null;
            }
            return mediaContentDetailData.contentPassParams;
        }

        public int l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData == null) {
                mediaContentDetailData = this.f;
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            int a2 = content == null ? 0 : ocb.a(content.status);
            if (this.h.publishStatus == null) {
                return a2;
            }
            return 0;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            String str = "";
            if (mediaContentDetailData == null) {
                return str;
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content != null) {
                str = content.errorText;
            }
            spz.c(a.TAG, "NewContentErrorStatus 异常内容，下发文案/icon content.errorText=" + str);
            return str;
        }

        public String n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            String str = "";
            if (mediaContentDetailData == null) {
                return str;
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content != null) {
                str = content.errorUrl;
            }
            spz.c(a.TAG, "NewContentErrorStatus 异常内容，下发文案/icon content.errorUrl=" + str);
            return str;
        }

        public Map o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.g;
        }

        public MediaContentDetailData.PlayletInfo p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.PlayletInfo) ipChange.ipc$dispatch("88dd4901", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                return mediaContentDetailData.playletInfo;
            }
            MediaContentDetailData mediaContentDetailData2 = this.e;
            if (mediaContentDetailData2 != null) {
                return mediaContentDetailData2.playletInfo;
            }
            MediaContentDetailData mediaContentDetailData3 = this.f;
            if (mediaContentDetailData3 == null) {
                return null;
            }
            return mediaContentDetailData3.playletInfo;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
            }
            if (this.k == -1) {
                MediaContentDetailData mediaContentDetailData = this.h;
                if (mediaContentDetailData == null) {
                    mediaContentDetailData = this.f;
                }
                this.k = e(mediaContentDetailData);
            }
            return this.k;
        }

        public MediaContentDetailData.Interaction r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Interaction) ipChange.ipc$dispatch("f9cf2482", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.interaction : mediaContentDetailData.interaction;
        }

        public boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
            }
            try {
                MediaContentDetailData i = i();
                if (i != null && !ogv.a(i.contentAdParams) && !ogv.a(i.utPairs)) {
                    if (StringUtils.equals(String.valueOf(i.utPairs.get("is_ad")), "1")) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                spz.a(a.TAG, "", th);
                return false;
            }
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : a.a(G()) == 1;
        }

        public boolean u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
            }
            if (!N()) {
                return oec.a(this.g.get("isCache"), false);
            }
            return true;
        }

        public boolean N() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData != null && mediaContentDetailData.isLocalPreCacheVideo;
        }

        public boolean v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData.PlayletInfo p = p();
            return p == null || p.free || !p.locked;
        }

        public boolean w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
            }
            if (!sjv.a()) {
                return l() == 0;
            }
            MediaContentDetailData.Content f = f();
            return f == null || f.isValid;
        }

        private boolean L() {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return (mediaContentDetailData == null || (content = mediaContentDetailData.content) == null || !content.isSecondPageUpBar) ? false : true;
        }

        public boolean y() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : a.a(G()) == 3;
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : a.a(G()) == 0;
        }

        public void a(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            try {
                this.h.interaction.collect.link = Boolean.toString(z);
                if (i != -1) {
                    this.h.interaction.collect.count = i;
                }
                if (str == null) {
                    return;
                }
                this.h.interaction.collect.countFmt = str;
            } catch (Exception unused) {
            }
        }

        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            if (i != -1) {
                try {
                    this.h.interaction.comment.count = i;
                } catch (Exception unused) {
                    return;
                }
            }
            if (str == null) {
                return;
            }
            this.h.interaction.comment.countFmt = str;
        }

        public void b(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10140c22", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            if (i != -1) {
                try {
                    this.h.interaction.like.count = i;
                } catch (Exception unused) {
                    return;
                }
            }
            this.h.interaction.like.link = Boolean.toString(z);
            if (str == null) {
                return;
            }
            this.h.interaction.like.countFmt = str;
        }

        public void c(boolean z, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94445923", new Object[]{this, new Boolean(z), new Integer(i), str});
                return;
            }
            try {
                this.h.interaction.follow.link = Boolean.toString(z);
                if (i != -1) {
                    this.h.interaction.follow.count = i;
                }
                if (str == null) {
                    return;
                }
                this.h.interaction.follow.countFmt = str;
            } catch (Exception unused) {
            }
        }

        public void a(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3db4bbb", new Object[]{this, mediaContentDetailData});
            } else {
                this.h = mediaContentDetailData;
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.g.put(com.taobao.android.fluid.framework.data.remote.c.KEY_ISAUTOSLIDE, Boolean.valueOf(z));
            }
        }

        public void A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            } else {
                this.g.put("isCache", true);
            }
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
                return;
            }
            try {
                this.h.account.preLiveVO.subscribed = Boolean.toString(z);
            } catch (Exception unused) {
            }
        }

        public String B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null && mediaContentDetailData.config != null) {
                return oec.a((Object) this.h.config.slidePageUrl, (String) null);
            }
            return null;
        }

        public String C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec4b0696", new Object[]{this});
            }
            MediaContentDetailData.Content f = f();
            if (f != null) {
                return f.title;
            }
            return null;
        }

        public b D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cb4c97c9", new Object[]{this});
            }
            if (a.a(G()) != 2) {
                return null;
            }
            return new b(this);
        }

        public d E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("dc0264c8", new Object[]{this});
            }
            if (a.a(G()) != 0) {
                return null;
            }
            return new d(this);
        }

        public e F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("ecb831a8", new Object[]{this});
            }
            if (a.a(G()) != 5) {
                return null;
            }
            return new e(this);
        }

        public String G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            return mediaContentDetailData == null ? this.f.type : mediaContentDetailData.type;
        }

        public String H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ce7abb1", new Object[]{this});
            }
            int a2 = a.a(i());
            return a2 != 0 ? a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "unknown" : IWebViewListener.BIZ_SCENE : TrtcConstants.TRTC_PARAMS_EXTENSION : "picture_album" : "live" : "picture" : "video";
        }

        public String I() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("136d6650", new Object[]{this});
            }
            if (StringUtils.isEmpty(this.i)) {
                MediaContentDetailData mediaContentDetailData = this.h;
                if (mediaContentDetailData == null) {
                    mediaContentDetailData = this.f;
                }
                this.i = c(mediaContentDetailData);
            }
            return this.i;
        }

        public String J() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99f320ef", new Object[]{this});
            }
            try {
                JSONObject jSONObject = this.h.content.elements.get(0);
                if (!ogv.a(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    return (String) jSONObject.get("url");
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        public int K() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4366745", new Object[]{this})).intValue();
            }
            if (this.j == -1) {
                MediaContentDetailData mediaContentDetailData = this.h;
                if (mediaContentDetailData == null) {
                    mediaContentDetailData = this.f;
                }
                this.j = d(mediaContentDetailData);
            }
            return this.j;
        }

        private Map b(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1feb4890", new Object[]{this, fluidContext});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                JSONObject jSONObject = (JSONObject) JSON.toJSON(mediaContentDetailData);
                jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_raw, (Object) this.d);
                jSONObject.put("cardMap", (Object) this.b);
                spo globalState = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getGlobalState();
                if (globalState != null) {
                    jSONObject.put("pageMap", (Object) globalState.f33816a);
                }
                jSONObject.put("processMap", (Object) obu.processMap);
                jSONObject.put("extraMap", (Object) o());
                return jSONObject;
            }
            return new HashMap();
        }

        private Map c(FluidContext fluidContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("137accd1", new Object[]{this, fluidContext});
            }
            MediaContentDetailData mediaContentDetailData = this.h;
            if (mediaContentDetailData != null) {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(mediaContentDetailData));
                parseObject.put(com.taobao.android.weex_framework.util.a.ATOM_raw, (Object) JSON.parseObject(JSON.toJSONString(this.d)));
                parseObject.put("cardMap", (Object) JSON.parseObject(JSON.toJSONString(this.b)));
                spo globalState = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getGlobalState();
                if (globalState != null) {
                    parseObject.put("pageMap", (Object) globalState.f33816a);
                }
                parseObject.put("processMap", (Object) obu.processMap);
                parseObject.put("extraMap", (Object) o());
                return parseObject;
            }
            return new HashMap();
        }

        public MediaContentDetailData.TopTitle M() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.TopTitle) ipChange.ipc$dispatch("454cb2ba", new Object[]{this});
            }
            MediaContentDetailData i = i();
            if (i != null) {
                return i.topTitle;
            }
            return null;
        }
    }

    /* renamed from: com.taobao.android.fluid.framework.data.datamodel.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0493a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c f12530a;

        static {
            kge.a(1201622412);
        }

        private C0493a(c cVar) {
            this.f12530a = cVar;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : c.b(this.f12530a) == null ? c.c(this.f12530a).id : c.b(this.f12530a).id;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : c.b(this.f12530a) == null ? c.c(this.f12530a).content == null ? "" : c.c(this.f12530a).content.coverUrl : c.b(this.f12530a).content == null ? "" : c.b(this.f12530a).content.coverUrl;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f12530a.G();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends C0493a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-956306483);
        }

        public b(c cVar) {
            super(cVar);
        }

        private static LiveElement a(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveElement) ipChange.ipc$dispatch("657a1268", new Object[]{mediaContentDetailData});
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content == null) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) slm.a(content.elements);
            if (ogv.a(jSONObject) || !"LIVE".equalsIgnoreCase((String) jSONObject.get("type"))) {
                return null;
            }
            return (LiveElement) JSON.toJavaObject(jSONObject, LiveElement.class);
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
            }
            LiveElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 == null) {
                return false;
            }
            return oec.a((Object) a2.landscape, false);
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
            }
            LiveElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.liveDetailUrl;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            LiveElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.liveId;
        }

        public Map<String, String> h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this});
            }
            LiveElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? new HashMap() : a2.urls;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends C0493a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1864987781);
        }

        public e(c cVar) {
            super(cVar);
        }

        private static MediaContentDetailData.Material a(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaContentDetailData.Material) ipChange.ipc$dispatch("1b8441bd", new Object[]{mediaContentDetailData});
            }
            MediaContentDetailData.Content content = mediaContentDetailData.content;
            if (content != null) {
                return content.material;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            if (r10.equals("cover") != false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String a(java.lang.String r10) {
            /*
                r9 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.framework.data.datamodel.a.e.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L18
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r2] = r9
                r1[r3] = r10
                java.lang.String r10 = "9f352ae"
                java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
                java.lang.String r10 = (java.lang.String) r10
                return r10
            L18:
                com.taobao.android.fluid.framework.data.datamodel.a$c r0 = r9.f12530a
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData r0 = com.taobao.android.fluid.framework.data.datamodel.a.c.b(r0)
                if (r0 != 0) goto L27
                com.taobao.android.fluid.framework.data.datamodel.a$c r0 = r9.f12530a
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData r0 = com.taobao.android.fluid.framework.data.datamodel.a.c.c(r0)
                goto L2d
            L27:
                com.taobao.android.fluid.framework.data.datamodel.a$c r0 = r9.f12530a
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData r0 = com.taobao.android.fluid.framework.data.datamodel.a.c.b(r0)
            L2d:
                com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData$Material r0 = a(r0)
                java.lang.String r1 = ""
                if (r0 != 0) goto L36
                return r1
            L36:
                r5 = -1
                int r6 = r10.hashCode()
                r7 = 3355(0xd1b, float:4.701E-42)
                r8 = 3
                if (r6 == r7) goto L6e
                r7 = 116079(0x1c56f, float:1.62661E-40)
                if (r6 == r7) goto L63
                r7 = 94852023(0x5a753b7, float:1.5735357E-35)
                if (r6 == r7) goto L5a
                r2 = 408162963(0x18541293, float:2.7409735E-24)
                if (r6 == r2) goto L50
                goto L78
            L50:
                java.lang.String r2 = "loadingUrl"
                boolean r10 = r10.equals(r2)
                if (r10 == 0) goto L78
                r2 = 3
                goto L79
            L5a:
                java.lang.String r6 = "cover"
                boolean r10 = r10.equals(r6)
                if (r10 == 0) goto L78
                goto L79
            L63:
                java.lang.String r2 = "url"
                boolean r10 = r10.equals(r2)
                if (r10 == 0) goto L78
                r2 = 2
                goto L79
            L6e:
                java.lang.String r2 = "id"
                boolean r10 = r10.equals(r2)
                if (r10 == 0) goto L78
                r2 = 1
                goto L79
            L78:
                r2 = -1
            L79:
                if (r2 == 0) goto L8b
                if (r2 == r3) goto L88
                if (r2 == r4) goto L85
                if (r2 == r8) goto L82
                goto L8d
            L82:
                java.lang.String r1 = r0.loadingUrl
                goto L8d
            L85:
                java.lang.String r1 = r0.url
                goto L8d
            L88:
                java.lang.String r1 = r0.id
                goto L8d
            L8b:
                java.lang.String r1 = r0.cover
            L8d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.data.datamodel.a.e.a(java.lang.String):java.lang.String");
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
            }
            MediaContentDetailData.Material a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends C0493a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;

        static {
            kge.a(801411584);
        }

        private d(c cVar) {
            super(cVar);
        }

        public boolean o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
            }
            if (this.f12530a != null) {
                return c.d(this.f12530a);
            }
            return false;
        }

        private static VideoElement a(MediaContentDetailData mediaContentDetailData) {
            MediaContentDetailData.Content content;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("7cfb95d", new Object[]{mediaContentDetailData});
            }
            VideoElement videoElement = null;
            if (!"VIDEO".equalsIgnoreCase(mediaContentDetailData.type) || (content = mediaContentDetailData.content) == null) {
                return null;
            }
            if (content.elements != null && !content.elements.isEmpty()) {
                if (son.d() && content.videoElement != null) {
                    return content.videoElement;
                }
                JSONObject jSONObject = content.elements.get(0);
                if (!ogv.a(jSONObject) && "VIDEO".equalsIgnoreCase((String) jSONObject.get("type"))) {
                    spz.c(a.TAG, "videoElement构建2:" + jSONObject.toJSONString());
                    try {
                        videoElement = (VideoElement) JSON.toJavaObject(jSONObject, VideoElement.class);
                    } catch (Throwable th) {
                        spz.c(a.TAG, "getVideoElement2 error:" + th);
                    }
                    content.videoElement = videoElement;
                }
            }
            return videoElement;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 != null) {
                return a2.duration;
            }
            return 0;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.firstFrameUrl;
        }

        public VideoElement h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoElement) ipChange.ipc$dispatch("a72c1da9", new Object[]{this});
            }
            return a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 != null) {
                return a2.resourceStr;
            }
            return null;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 == null) {
                return;
            }
            a2.resourceStr = str;
        }

        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 != null) {
                return a2.height;
            }
            return 0;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 != null && a2.url != null && !a2.url.startsWith("https") && !a2.url.startsWith("http")) {
                if (a2.url.startsWith("/storage")) {
                    return true;
                }
                spz.c(a.TAG, "解析失败url中的内容为" + a2.url);
            }
            return false;
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public String l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.videoId;
        }

        public final String p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.videoType;
        }

        public final String q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.videoSource;
        }

        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            return a2 == null ? "" : a2.url;
        }

        public int n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
            }
            VideoElement a2 = a(c.b(this.f12530a) == null ? c.c(this.f12530a) : c.b(this.f12530a));
            if (a2 != null) {
                return a2.width;
            }
            return 0;
        }
    }
}
