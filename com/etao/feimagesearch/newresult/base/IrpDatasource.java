package com.etao.feimagesearch.newresult.base;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.util.PicParamUtils;
import com.etao.feimagesearch.util.an;
import com.taobao.taolive.room.utils.aw;
import com.taobao.wangxin.utils.WXConstantsOut;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.cof;
import tb.com;
import tb.kge;
import tb.rvm;

/* loaded from: classes3.dex */
public final class IrpDatasource {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int TYPE_COMPATIBLE_SEARCH = 2;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_NO_PIC_SEARCH = 1;
    public static final int TYPE_PIC_SEARCH = 0;
    private volatile Uri c;
    private volatile int d;
    private Bitmap i;
    private Integer[] j;
    private boolean k;
    private List<RectF> l;
    private LinkedList<a.b> m;
    private c n;
    private String o;
    private Boolean p;
    private Rect q;
    private int r;
    public d s;
    private Boolean t;
    private Integer u;
    private Map<String, String> w;
    private Boolean x;

    /* renamed from: a  reason: collision with root package name */
    private long f6812a = -1;
    private volatile PhotoFrom b = PhotoFrom.Values.UNKNOWN;
    private volatile Map<String, String> e = new LinkedHashMap();
    private volatile Map<String, String> g = new LinkedHashMap();
    private volatile Map<String, String> h = new LinkedHashMap();
    private List<b.a> v = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ImgSearchType {
    }

    static {
        kge.a(-1808717841);
        Companion = new a(null);
    }

    public static final /* synthetic */ Map a(IrpDatasource irpDatasource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5ecbc3f", new Object[]{irpDatasource}) : irpDatasource.g;
    }

    public static final /* synthetic */ void a(IrpDatasource irpDatasource, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628a33cf", new Object[]{irpDatasource, rect});
        } else {
            irpDatasource.q = rect;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(557790327);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final IrpDatasource a(Map<String, String> intentParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("ab0c14bf", new Object[]{this, intentParams});
            }
            q.c(intentParams, "intentParams");
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.a(intentParams);
            PhotoFrom parseValue = PhotoFrom.Values.parseValue(intentParams.get(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM));
            q.a((Object) parseValue, "PhotoFrom.Values.parseVa…ntentParams[\"photofrom\"])");
            irpDatasource.a(parseValue);
            String str = intentParams.get("memoryCacheKey");
            if (TextUtils.isEmpty(str)) {
                str = intentParams.get(com.etao.feimagesearch.model.d.KEY_PIC_URL);
            }
            if (!TextUtils.isEmpty(str)) {
                irpDatasource.a(Uri.parse(str));
            }
            String str2 = intentParams.get("imgRect");
            String str3 = str2;
            if (!TextUtils.isEmpty(str3)) {
                if (str2 == null) {
                    q.a();
                }
                List b = n.b((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
                if (b.size() == 4) {
                    Rect rect = new Rect((int) com.taobao.android.searchbaseframe.util.g.a((String) b.get(0), 0.0f), (int) com.taobao.android.searchbaseframe.util.g.a((String) b.get(1), 0.0f), (int) com.taobao.android.searchbaseframe.util.g.a((String) b.get(2), 0.0f), (int) com.taobao.android.searchbaseframe.util.g.a((String) b.get(3), 0.0f));
                    int b2 = com.b(com.b());
                    if (rect.right > b2) {
                        rect.right = b2;
                    }
                    int e = com.e(com.b());
                    if (rect.bottom > e) {
                        rect.bottom = e;
                    }
                    IrpDatasource.a(irpDatasource, rect);
                }
            }
            irpDatasource.a(com.taobao.android.searchbaseframe.util.g.a(intentParams.get("sessionId"), SystemClock.elapsedRealtime()));
            PhotoFrom parseValue2 = PhotoFrom.Values.parseValue(intentParams.get(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM));
            q.a((Object) parseValue2, "PhotoFrom.Values.parseValue(photoFromStr)");
            irpDatasource.a(parseValue2);
            if (irpDatasource.m() && irpDatasource.d().containsKey("barcode")) {
                irpDatasource.d().put("barCode", irpDatasource.d().remove("barcode"));
            }
            irpDatasource.D();
            return irpDatasource;
        }

        @JvmStatic
        public final IrpDatasource a(Bitmap sourceBitmap, String str, IrpParamModel irpParamModel, Map<String, String> extraParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("c8b81fd6", new Object[]{this, sourceBitmap, str, irpParamModel, extraParams});
            }
            q.c(sourceBitmap, "sourceBitmap");
            q.c(irpParamModel, "irpParamModel");
            q.c(extraParams, "extraParams");
            Map<String, String> extraParams2 = irpParamModel.getExtraParams();
            q.a((Object) extraParams2, "irpParamModel.extraParams");
            extraParams.putAll(extraParams2);
            PhotoFrom photoFrom = irpParamModel.getPhotoFrom();
            q.a((Object) photoFrom, "irpParamModel.photoFrom");
            return a(sourceBitmap, str, photoFrom, irpParamModel.getShopId(), irpParamModel.getSellerId(), irpParamModel.getPssource(), (String) null, extraParams, (Map<String, String>) null);
        }

        @JvmStatic
        public final IrpDatasource a(Bitmap sourceBitmap, String str, String str2, com.etao.feimagesearch.model.b cameraPageModel, Map<String, String> extraParams, Map<String, String> map, PhotoFrom photoFrom) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("e0ef0de6", new Object[]{this, sourceBitmap, str, str2, cameraPageModel, extraParams, map, photoFrom});
            }
            q.c(sourceBitmap, "sourceBitmap");
            q.c(cameraPageModel, "cameraPageModel");
            q.c(extraParams, "extraParams");
            Map<String, String> extraParams2 = cameraPageModel.getExtraParams();
            q.a((Object) extraParams2, "cameraPageModel.extraParams");
            extraParams.putAll(extraParams2);
            return a(sourceBitmap, str, photoFrom == null ? PhotoFrom.Values.TAKE : photoFrom, cameraPageModel.getShopId(), cameraPageModel.getSellerId(), cameraPageModel.getPssource(), str2, extraParams, map);
        }

        @JvmStatic
        public final IrpDatasource a(Bitmap sourceBitmap, PhotoFrom photoFrom, com.etao.feimagesearch.model.b cameraPageModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("c90e0f72", new Object[]{this, sourceBitmap, photoFrom, cameraPageModel});
            }
            q.c(sourceBitmap, "sourceBitmap");
            q.c(photoFrom, "photoFrom");
            q.c(cameraPageModel, "cameraPageModel");
            return a(sourceBitmap, (String) null, photoFrom, cameraPageModel.getShopId(), cameraPageModel.getSellerId(), cameraPageModel.getPssource(), (String) null, cameraPageModel.getExtraParams(), (Map<String, String>) null);
        }

        @JvmStatic
        public final IrpDatasource a(Bitmap sourceBitmap, List<RectF> list, PhotoFrom photoFrom, com.etao.feimagesearch.model.b cameraPageModel, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("85f88e83", new Object[]{this, sourceBitmap, list, photoFrom, cameraPageModel, map, map2});
            }
            q.c(sourceBitmap, "sourceBitmap");
            q.c(photoFrom, "photoFrom");
            q.c(cameraPageModel, "cameraPageModel");
            LinkedHashMap linkedHashMap = map == null ? new LinkedHashMap() : map;
            Map<String, String> extraParams = cameraPageModel.getExtraParams();
            q.a((Object) extraParams, "cameraPageModel.extraParams");
            linkedHashMap.putAll(extraParams);
            IrpDatasource a2 = a(sourceBitmap, list, photoFrom, cameraPageModel.getShopId(), cameraPageModel.getSellerId(), cameraPageModel.getPssource(), (String) null, linkedHashMap, map2);
            IrpDatasource.a(a2).put(ClientModelType.KEY_CLIENT_MODEL_TYPE, linkedHashMap.get(ClientModelType.KEY_CLIENT_MODEL_TYPE));
            return a2;
        }

        @JvmStatic
        public final IrpDatasource a(Uri imgUri, Bitmap bitmap, int i, PhotoFrom photoFrom, com.etao.feimagesearch.model.b cameraPageModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("fedb5f60", new Object[]{this, imgUri, bitmap, new Integer(i), photoFrom, cameraPageModel});
            }
            q.c(imgUri, "imgUri");
            q.c(photoFrom, "photoFrom");
            q.c(cameraPageModel, "cameraPageModel");
            return a(imgUri, bitmap, i, photoFrom, cameraPageModel.getShopId(), cameraPageModel.getSellerId(), cameraPageModel.getPssource(), cameraPageModel.getExtraParams());
        }

        private final IrpDatasource a(Bitmap bitmap, List<RectF> list, PhotoFrom photoFrom, String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("b6511109", new Object[]{this, bitmap, list, photoFrom, str, str2, str3, str4, map, map2});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.a(bitmap);
            irpDatasource.a(list);
            irpDatasource.a(photoFrom);
            irpDatasource.b(str);
            irpDatasource.c(str2);
            irpDatasource.d(str3);
            if (map != null) {
                irpDatasource.d().putAll(map);
            }
            if (TextUtils.isEmpty(str4)) {
                irpDatasource.d().put(PicParamUtils.Companion.a(), PicParamUtils.CameraMode.unknown.name());
            } else {
                irpDatasource.d().put(PicParamUtils.Companion.a(), str4);
            }
            if (map2 != null && !map2.isEmpty()) {
                z = false;
            }
            if (!z) {
                IrpDatasource.a(irpDatasource).putAll(map2);
            }
            irpDatasource.D();
            return irpDatasource;
        }

        private final IrpDatasource a(Bitmap bitmap, String str, PhotoFrom photoFrom, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("21e5ca22", new Object[]{this, bitmap, str, photoFrom, str2, str3, str4, str5, map, map2});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.a(bitmap);
            if (!TextUtils.isEmpty(str)) {
                irpDatasource.a(Uri.parse(str));
            }
            irpDatasource.a(photoFrom);
            irpDatasource.b(str2);
            irpDatasource.c(str3);
            irpDatasource.d(str4);
            if (map != null) {
                irpDatasource.d().putAll(map);
            }
            if (TextUtils.isEmpty(str5)) {
                irpDatasource.d().put(PicParamUtils.Companion.a(), PicParamUtils.CameraMode.unknown.name());
            } else {
                irpDatasource.d().put(PicParamUtils.Companion.a(), str5);
            }
            if (map2 != null && !map2.isEmpty()) {
                z = false;
            }
            if (!z) {
                IrpDatasource.a(irpDatasource).putAll(map2);
            }
            irpDatasource.D();
            return irpDatasource;
        }

        private final IrpDatasource a(Uri uri, Bitmap bitmap, int i, PhotoFrom photoFrom, String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IrpDatasource) ipChange.ipc$dispatch("6e77eced", new Object[]{this, uri, bitmap, new Integer(i), photoFrom, str, str2, str3, map});
            }
            IrpDatasource irpDatasource = new IrpDatasource();
            irpDatasource.a(bitmap);
            irpDatasource.a(uri);
            irpDatasource.a(photoFrom);
            irpDatasource.a(i);
            irpDatasource.d().put("orientation", String.valueOf(i));
            irpDatasource.b(str);
            irpDatasource.c(str2);
            irpDatasource.d(str3);
            if (map != null) {
                irpDatasource.d().putAll(map);
            }
            irpDatasource.D();
            return irpDatasource;
        }
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f6812a = j;
        }
    }

    public final PhotoFrom a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoFrom) ipChange.ipc$dispatch("ea51a316", new Object[]{this}) : this.b;
    }

    public final void a(PhotoFrom value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0785ad0", new Object[]{this, value});
            return;
        }
        q.c(value, "value");
        this.e.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, value.getValue());
        this.b = value;
    }

    public final void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else {
            this.c = uri;
        }
    }

    public final Uri b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("def15b20", new Object[]{this}) : this.c;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        q.c(map, "<set-?>");
        this.e = map;
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.e;
    }

    public final void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else {
            this.i = bitmap;
        }
    }

    public final Bitmap e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("61b3954a", new Object[]{this}) : this.i;
    }

    public final void a(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e57122a", new Object[]{this, numArr});
        } else {
            this.j = numArr;
        }
    }

    public final Integer[] g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer[]) ipChange.ipc$dispatch("c5b429aa", new Object[]{this}) : this.j;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.k;
    }

    public final void a(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.l = list;
        }
    }

    public final List<RectF> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.l;
    }

    public final LinkedList<a.b> M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("23ed325a", new Object[]{this}) : this.m;
    }

    public final void a(LinkedList<a.b> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6098cdc0", new Object[]{this, linkedList});
        } else {
            this.m = linkedList;
        }
    }

    public final int N() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("460adc8", new Object[]{this})).intValue();
        }
        LinkedList<a.b> linkedList = this.m;
        if (linkedList == null) {
            return 0;
        }
        Iterator<a.b> it = linkedList.iterator();
        while (it.hasNext()) {
            if (q.a((Object) it.next().f6858a, (Object) com.etao.feimagesearch.e.REGION_SEARCH)) {
                i++;
            }
        }
        return i;
    }

    public final List<b.a> O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1914f631", new Object[]{this}) : this.v;
    }

    public final b.a a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("66897f0d", new Object[]{this, rectF});
        }
        if (rectF == null || this.v.isEmpty()) {
            return null;
        }
        for (b.a aVar : this.v) {
            RectF rectF2 = aVar.d;
            if (rectF2 != null && q.a(rectF2, rectF)) {
                return aVar;
            }
        }
        return null;
    }

    public final void b(List<b.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        this.v.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (b.a aVar : list) {
            if (aVar != null && aVar.f6598a != null && aVar.b != null) {
                this.v.add(aVar);
            }
        }
    }

    public final Integer J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5b6dfcb8", new Object[]{this}) : this.u;
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.u = num;
        }
    }

    public final Map<String, String> T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2e6db1d0", new Object[]{this}) : this.w;
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.w = map;
        }
    }

    public final c i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("194a127b", new Object[]{this}) : this.n;
    }

    public final void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9f10b3", new Object[]{this, cVar});
            return;
        }
        this.n = cVar;
        if (cVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.h())) {
            this.e.put("pltSession", cVar.h());
        }
        if (this.c == null) {
            this.c = Uri.parse(cVar.n());
        }
        if (com.etao.feimagesearch.config.b.cK() || !(!cVar.p().isEmpty())) {
            return;
        }
        int a2 = rvm.a(com.taobao.android.weex_framework.util.i.a(357.0f));
        for (String str : cVar.p()) {
            an.a(str, a2, a2, 1.0f);
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.o;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public final Bitmap l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("82e2d4d1", new Object[]{this}) : this.i;
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : this.b == PhotoFrom.Values.FLOAT_BAR;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.b == PhotoFrom.Values.PRODUCT_CODE;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.b == PhotoFrom.Values.TAKE || this.b == PhotoFrom.Values.HISTORY || this.b == PhotoFrom.Values.ALBUM || this.b == PhotoFrom.Values.ALBUM_SYS || this.b == PhotoFrom.Values.AUTO_DETECT || this.b == PhotoFrom.Values.OUTER_ALBUM_LOCAL || this.b == PhotoFrom.Values.PRODUCT_CODE;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b == PhotoFrom.Values.ALBUM || this.b == PhotoFrom.Values.ALBUM_SYS || this.b == PhotoFrom.Values.OUTER_ALBUM_LOCAL || this.b == PhotoFrom.Values.OUTER_ALBUM_RESULT;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.b == PhotoFrom.Values.HISTORY || this.b == PhotoFrom.Values.SSK_HISTORY;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        String str = this.e.get("shopId");
        if (TextUtils.isEmpty(str)) {
            str = this.e.get(WXConstantsOut.SHOPID);
        }
        return str == null ? "" : str;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e.put("shopId", str);
        }
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        String str = this.e.get("sellerId");
        if (TextUtils.isEmpty(str)) {
            str = this.e.get("sellerid");
        }
        return str == null ? "" : str;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e.put("sellerId", str);
        }
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.e.get("pssource");
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e.put("pssource", str);
        }
    }

    public final float s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136a", new Object[]{this})).floatValue() : com.taobao.android.searchbaseframe.util.g.a(this.e.get(com.etao.feimagesearch.model.d.KEY_RATIO), -1.0f);
    }

    public final float t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aeb", new Object[]{this})).floatValue() : com.taobao.android.searchbaseframe.util.g.a(this.e.get(com.etao.feimagesearch.model.d.KEY_DISTANCE), -1.0f);
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        if (this.c == null || TextUtils.isEmpty(String.valueOf(this.c))) {
            return false;
        }
        try {
            Uri uri = this.c;
            if (uri == null) {
                q.a();
            }
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            if (!q.a((Object) "http", (Object) scheme)) {
                if (!q.a((Object) "https", (Object) scheme)) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final String v() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        if (this.c == null) {
            return "";
        }
        Uri uri = this.c;
        if (uri == null) {
            q.a();
        }
        String scheme = uri.getScheme();
        return (TextUtils.isEmpty(scheme) || (q.a((Object) "content", (Object) scheme) ^ true) || (a2 = com.etao.feimagesearch.util.i.a(com.b(), this.c)) == null) ? "" : a2;
    }

    public final String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this});
        }
        Bitmap l = l();
        if (l == null) {
            return "";
        }
        return "0," + l.getWidth() + ",0," + l.getHeight();
    }

    public final RectF x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("9a9f2188", new Object[]{this});
        }
        String str = this.e.get("assignFirstBoxRegion");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        List b = n.b((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
        if (b.size() == 4) {
            return new RectF(com.taobao.android.searchbaseframe.util.g.a((String) b.get(0), 0.0f), com.taobao.android.searchbaseframe.util.g.a((String) b.get(2), 0.0f), com.taobao.android.searchbaseframe.util.g.a((String) b.get(1), 0.0f), com.taobao.android.searchbaseframe.util.g.a((String) b.get(3), 0.0f));
        }
        return null;
    }

    public final boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[]{this})).booleanValue();
        }
        String r = r();
        return q.a((Object) r, (Object) "zszxs") || q.a((Object) r, (Object) "zszxs_feedback") || q.a((Object) r, (Object) "zszxs_more");
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        List<RectF> list = this.l;
        return list != null && list.size() > 0;
    }

    public final boolean z() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.p;
        if (bool != null) {
            if (bool == null) {
                q.a();
            }
            return bool.booleanValue();
        }
        if (com.etao.feimagesearch.config.b.ci()) {
            z = Boolean.valueOf(q.a((Object) this.e.get("showPopup"), (Object) "true"));
        } else {
            z = false;
        }
        this.p = z;
        Boolean bool2 = this.p;
        if (bool2 == null) {
            q.a();
        }
        return bool2.booleanValue();
    }

    public final Rect A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("c5166791", new Object[]{this}) : this.q;
    }

    public final Map<String, String> B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b872d23e", new Object[]{this}) : this.h;
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.h.put(str, str2);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.h.remove(str);
        }
    }

    public final Map<String, String> C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("861d33ff", new Object[]{this}) : this.g;
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.g.put(str, str2);
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        K();
        L();
    }

    public final int Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48af44b", new Object[]{this})).intValue() : this.r;
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.r == -1;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.r == 1;
    }

    public final boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : this.r == 2;
    }

    public final int[] G() {
        Bitmap l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("7bc32156", new Object[]{this});
        }
        int[] iArr = new int[2];
        Integer[] numArr = this.j;
        if (numArr != null) {
            if (numArr == null) {
                q.a();
            }
            if (numArr.length >= 2) {
                Integer[] numArr2 = this.j;
                if (numArr2 == null) {
                    q.a();
                }
                iArr[0] = numArr2[0].intValue();
                Integer[] numArr3 = this.j;
                if (numArr3 == null) {
                    q.a();
                }
                iArr[1] = numArr3[1].intValue();
            }
        }
        if ((iArr[0] == 0 || iArr[1] == 0) && (l = l()) != null) {
            iArr[0] = l.getWidth();
            iArr[1] = l.getHeight();
        }
        return iArr;
    }

    private final void K() {
        boolean z;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (!m()) {
            String r = r();
            if (this.c != null) {
                String[] bG = com.etao.feimagesearch.config.b.bG();
                int length = bG.length;
                while (i < length) {
                    if (q.a((Object) r, (Object) bG[i])) {
                        this.r = 2;
                        return;
                    }
                    i++;
                }
                return;
            }
            for (String str : com.etao.feimagesearch.config.b.bt()) {
                if (q.a((Object) r(), (Object) str)) {
                    this.r = 1;
                    return;
                }
            }
            String[] bg = com.etao.feimagesearch.config.b.bg();
            int length2 = bg.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z = false;
                    break;
                }
                String str2 = bg[i2];
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.e.get(str2))) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                this.r = 0;
                return;
            }
            int i3 = -1;
            if (!com.etao.feimagesearch.config.b.bi()) {
                this.r = -1;
                return;
            }
            String[] noPicValidKeys = com.etao.feimagesearch.config.b.bf();
            q.a((Object) noPicValidKeys, "noPicValidKeys");
            if (noPicValidKeys.length == 0) {
                if (com.etao.feimagesearch.config.b.bh()) {
                    i3 = 1;
                }
                this.r = i3;
                return;
            }
            int length3 = noPicValidKeys.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length3) {
                    break;
                }
                String str3 = noPicValidKeys[i4];
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(this.e.get(str3))) {
                    i = 1;
                    break;
                }
                i4++;
            }
            if (i != 0 || com.etao.feimagesearch.config.b.bh()) {
                i3 = 1;
            }
            this.r = i3;
        }
    }

    public final d H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2a90fff9", new Object[]{this});
        }
        d dVar = this.s;
        if (dVar == null) {
            q.b("irpUIConfig");
        }
        return dVar;
    }

    private final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else {
            this.s = d.Companion.a(this);
        }
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.t;
        if (bool == null) {
            if (m()) {
                bool = true;
            } else {
                bool = Boolean.valueOf(com.etao.feimagesearch.config.b.m(r()));
            }
            this.t = bool;
        }
        return bool.booleanValue();
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.x;
        if (bool == null) {
            bool = Boolean.valueOf(com.etao.feimagesearch.config.b.L());
        }
        this.x = bool;
        return bool.booleanValue();
    }

    public final Map<String, String> V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c9c27552", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c cVar = this.n;
        String str = null;
        linkedHashMap.put("tfs", cVar != null ? cVar.f() : null);
        c cVar2 = this.n;
        linkedHashMap.put("oss", cVar2 != null ? cVar2.s() : null);
        c cVar3 = this.n;
        linkedHashMap.put("bboxes_str", cVar3 != null ? cVar3.t() : null);
        c cVar4 = this.n;
        linkedHashMap.put("region", cVar4 != null ? cVar4.u() : null);
        c cVar5 = this.n;
        linkedHashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, cVar5 != null ? cVar5.v() : null);
        c cVar6 = this.n;
        linkedHashMap.put("appid", cVar6 != null ? cVar6.w() : null);
        c cVar7 = this.n;
        if (cVar7 != null) {
            str = cVar7.x();
        }
        linkedHashMap.put("reach_time", str);
        linkedHashMap.put("rainbow", cof.a());
        linkedHashMap.put("extra_info", f(com.etao.feimagesearch.mnn.b.EXTRA_INFO_KEY));
        linkedHashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, this.b.getValue());
        linkedHashMap.put("pssource", r());
        linkedHashMap.put("clientmnnType", f(ClientModelType.KEY_CLIENT_MODEL_TYPE));
        linkedHashMap.put("bbox_change_raw", f("regionChanged"));
        linkedHashMap.put("deviceLevel", com.etao.feimagesearch.config.c.a());
        return linkedHashMap;
    }
}
