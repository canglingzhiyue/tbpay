package com.etao.feimagesearch.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.bean.ImageRule;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.android.searchbaseframe.util.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.com;
import tb.cot;
import tb.cov;
import tb.cuh;
import tb.kge;

/* loaded from: classes3.dex */
public class IrpParamModel extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_NO_PIC_SEARCH = 1;
    public static final int TYPE_PIC_SEARCH = 0;
    public static Class sActivityClass;
    public static String sActivityUrl;

    /* renamed from: a  reason: collision with root package name */
    private Uri f6804a;
    private int b;
    private boolean c;
    private String d;
    private String e;
    private boolean f;
    private PhotoFrom g;
    private int h;
    private String i;
    private IrpPageConfig j;
    private final Map<String, String> k;
    private final Map<String, String> l;
    private final Map<String, String> m;
    private long n;
    private double o;
    private double p;
    private int q;
    private Boolean r;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ImgSearchType {
    }

    static {
        kge.a(-477514802);
    }

    public IrpParamModel(e eVar) {
        super(eVar);
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
    }

    public IrpParamModel(c cVar) {
        super(cVar);
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
        addExtraParams(cVar.getExtraParams());
    }

    public IrpParamModel(b bVar) {
        super(bVar);
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
        addExtraParams(bVar.getExtraParams());
    }

    public IrpParamModel(a aVar) {
        super(aVar);
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
        addExtraParams(aVar.getExtraParams());
    }

    public IrpParamModel(String str) {
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
        setPssource(str);
    }

    private IrpParamModel() {
        this.b = 0;
        this.c = false;
        this.g = PhotoFrom.Values.UNKNOWN;
        this.h = 0;
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.o = -1.0d;
        this.p = -1.0d;
        this.q = 0;
        this.r = null;
    }

    public long getIrpPageStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1505bca", new Object[]{this})).longValue() : this.n;
    }

    public void setIrpPageStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce4822", new Object[]{this, new Long(j)});
        } else {
            this.n = j;
        }
    }

    public void setRatio(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9783716e", new Object[]{this, new Double(d)});
        } else {
            this.o = d;
        }
    }

    public void setDistance(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf23480", new Object[]{this, new Double(d)});
        } else {
            this.p = d;
        }
    }

    public double getRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("13ea484a", new Object[]{this})).doubleValue() : this.o;
    }

    public double getDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f8a060", new Object[]{this})).doubleValue() : this.p;
    }

    public boolean isTkExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a07589", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.k;
        return map != null && StringUtils.equals(map.get("tkExtension"), "true");
    }

    public void setFromOuterApp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b543b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public static int getQuality(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39b6a0eb", new Object[]{context})).intValue();
        }
        if (context == null) {
            return ImageRule.QUALITY_OTHER;
        }
        return getImageRule(context).quality;
    }

    public static int getMaxSize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b5025", new Object[]{context})).intValue();
        }
        if (context != null) {
            return getImageRule(context.getApplicationContext()).maxSize;
        }
        return 640;
    }

    public static String getItemidFromUrl(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e75548ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("://a.m.taobao.com/i");
        if (lastIndexOf > 0 && lastIndexOf <= 8) {
            int lastIndexOf2 = str.lastIndexOf(".htm?");
            if (lastIndexOf2 > 19) {
                str2 = str.substring(19 + lastIndexOf, lastIndexOf2);
            }
            str2 = "";
        } else {
            if (str.startsWith(com.etao.feimagesearch.e.DETAIL_URL_PRE_1) || str.startsWith(com.etao.feimagesearch.e.DETAIL_URL_PRE_1s)) {
                str2 = cuh.a(str).get("id");
            }
            str2 = "";
        }
        return StringUtils.isEmpty(str2) ? "" : str2;
    }

    public static ImageRule getImageRule(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageRule) ipChange.ipc$dispatch("a358deef", new Object[]{context});
        }
        ImageRule imageRule = new ImageRule();
        if (context == null) {
            return imageRule;
        }
        if (com.e()) {
            return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_WIFI);
        }
        int b = o.b();
        if (b == 1) {
            return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_WIFI);
        }
        if (b == 2) {
            return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_2G);
        }
        if (b == 3) {
            return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_3G);
        }
        if (b == 4) {
            return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_4G);
        }
        return com.etao.feimagesearch.config.b.b(ImageRule.NET_TYPE_OTHER);
    }

    @Override // com.etao.feimagesearch.model.e
    public Intent a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("fdb8dbab", new Object[]{this}) : new Intent(com.b(), sActivityClass);
    }

    @Override // com.etao.feimagesearch.model.e
    public Uri b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("def15b20", new Object[]{this}) : Uri.parse(sActivityUrl);
    }

    @Override // com.etao.feimagesearch.model.e
    public void a(Uri.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8a4a8", new Object[]{this, builder});
            return;
        }
        if (getPicUrl() != null) {
            builder.appendQueryParameter(d.KEY_PIC_URL, getPicUrl().toString());
        }
        builder.appendQueryParameter(d.KEY_PHOTO_FROM, getPhotoFrom().getValue());
        builder.appendQueryParameter("preload", String.valueOf(getPreloadKey()));
        IrpPageConfig irpPageConfig = this.j;
        if (irpPageConfig != null) {
            builder.appendQueryParameter(d.KEY_IRP_PAGE_CONFIG, irpPageConfig.toJsonString());
        }
        builder.appendQueryParameter("orientation", Integer.toString(this.b));
        builder.appendQueryParameter(d.KEY_IRP_INTELLI, String.valueOf(isIntelliDetect()));
        builder.appendQueryParameter(d.KEY_RATIO, String.valueOf(this.o));
        builder.appendQueryParameter(d.KEY_DISTANCE, String.valueOf(this.p));
        String intelliHint = getIntelliHint();
        if (!StringUtils.isEmpty(intelliHint)) {
            builder.appendQueryParameter(d.KEY_IRP_INTELLI_HINT, intelliHint);
        }
        Map<String, String> map = this.k;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        if (!StringUtils.isEmpty(getSellerId())) {
            builder.appendQueryParameter("sellerId", getSellerId());
        }
        if (!StringUtils.isEmpty(getShopId())) {
            builder.appendQueryParameter("shopId", getShopId());
        }
        Map<String, String> map2 = this.l;
        if (map2 != null && !map2.isEmpty()) {
            builder.appendQueryParameter(d.KEY_IRP_JS_EXTRA, JSON.toJSONString(this.l));
        }
        builder.appendQueryParameter("source", String.valueOf(this.h));
        builder.appendQueryParameter(d.KEY_FROM_OUTER_APP, String.valueOf(this.f));
        builder.appendQueryParameter("sessionId", String.valueOf(getSessionId()));
    }

    public static IrpParamModel parseFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpParamModel) ipChange.ipc$dispatch("6dc0269a", new Object[]{intent});
        }
        IrpParamModel irpParamModel = new IrpParamModel();
        if (intent == null || a(intent, irpParamModel) || b(intent, irpParamModel)) {
            return irpParamModel;
        }
        c(intent, irpParamModel);
        return irpParamModel;
    }

    private static boolean a(Intent intent, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6540524a", new Object[]{intent, irpParamModel})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
        if (!(parcelable instanceof Uri)) {
            return false;
        }
        String obj = parcelable.toString();
        irpParamModel.setPssource(d.PSSOURCE_SYSTEM_ALBUM);
        irpParamModel.setPicUrl(Uri.parse(obj));
        irpParamModel.setPhotoFrom(PhotoFrom.Values.SYSTEM_ALBUM);
        return true;
    }

    private static boolean b(Intent intent, IrpParamModel irpParamModel) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c4c394b", new Object[]{intent, irpParamModel})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (bundle = extras.getBundle(d.EXTRA_KEY_BUNDLE_PARAM)) == null) {
            return false;
        }
        String string = bundle.getString(d.EXTRA_KEY_PIC_URI);
        irpParamModel.setPssource(bundle.getString("pssource"));
        irpParamModel.setPicUrl(Uri.parse(string));
        String string2 = bundle.getString("source");
        if (!StringUtils.isEmpty(string2)) {
            irpParamModel.setPhotoSource(Integer.parseInt(string2));
        } else {
            irpParamModel.setPhotoSource(0);
        }
        String string3 = bundle.getString(d.KEY_PHOTO_FROM);
        if (!StringUtils.isEmpty(string3)) {
            irpParamModel.setPhotoFrom(PhotoFrom.Values.parseValue(string3));
        } else {
            irpParamModel.setPhotoFrom(PhotoFrom.Values.PREVIEW);
        }
        return true;
    }

    private static void c(Intent intent, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3582048", new Object[]{intent, irpParamModel});
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        irpParamModel.a(data);
        for (String str : data.getQueryParameterNames()) {
            if (!d.isLocalKey(str)) {
                irpParamModel.addExtraParam(str, data.getQueryParameter(str));
            }
        }
        String queryParameter = data.getQueryParameter("region");
        if (!StringUtils.isEmpty(queryParameter)) {
            irpParamModel.setRegion(queryParameter);
        }
        String queryParameter2 = data.getQueryParameter("shopId");
        if (!StringUtils.isEmpty(queryParameter2)) {
            irpParamModel.setShopId(queryParameter2);
        }
        String queryParameter3 = data.getQueryParameter("sellerId");
        if (StringUtils.isEmpty(queryParameter3)) {
            queryParameter3 = data.getQueryParameter("seller_id");
        }
        if (StringUtils.isEmpty(queryParameter3)) {
            queryParameter3 = data.getQueryParameter("sellerid");
        }
        irpParamModel.setSellerId(queryParameter3);
        String queryParameter4 = data.getQueryParameter(d.KEY_PIC_URL);
        if (!StringUtils.isEmpty(queryParameter4)) {
            irpParamModel.setPicUrl(Uri.parse(queryParameter4));
        }
        irpParamModel.setOrientation(cov.a(data.getQueryParameter("orientation"), 0));
        irpParamModel.setPhotoFrom(PhotoFrom.Values.parseValue(data.getQueryParameter(d.KEY_PHOTO_FROM)));
        String queryParameter5 = data.getQueryParameter(d.KEY_IRP_PAGE_CONFIG);
        if (!StringUtils.isEmpty(queryParameter5)) {
            irpParamModel.setPageConfig(IrpPageConfig.createFromJson(queryParameter5));
        }
        irpParamModel.setIntelliDetect(data.getBooleanQueryParameter(d.KEY_IRP_INTELLI, false));
        irpParamModel.setIntelliHint(data.getQueryParameter(d.KEY_IRP_INTELLI_HINT));
        String queryParameter6 = data.getQueryParameter("preload");
        if (queryParameter6 != null) {
            try {
                irpParamModel.setPreloadKey(Long.parseLong(queryParameter6));
            } catch (Exception unused) {
            }
        }
        String queryParameter7 = data.getQueryParameter(d.KEY_IRP_JS_EXTRA);
        if (!StringUtils.isEmpty(queryParameter7)) {
            try {
                for (Map.Entry<String, Object> entry : JSONObject.parseObject(queryParameter7).entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        irpParamModel.addJsExtraParam(entry.getKey(), (String) value);
                    }
                }
            } catch (Exception e) {
                cot.a("IrpParamModel", "js extra param parse error", e);
            }
        }
        irpParamModel.setFromOuterApp(data.getBooleanQueryParameter(d.KEY_FROM_OUTER_APP, false));
        irpParamModel.setRatio(a(data.getQueryParameter(d.KEY_RATIO)));
        irpParamModel.setDistance(a(data.getQueryParameter(d.KEY_DISTANCE)));
    }

    private static double a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c20", new Object[]{str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    public RectF getRegionRectF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("e93e32e8", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.e)) {
            return null;
        }
        String[] split = this.e.split(",");
        return new RectF(Float.valueOf(split[0]).floatValue(), Float.valueOf(split[2]).floatValue(), Float.valueOf(split[1]).floatValue(), Float.valueOf(split[3]).floatValue());
    }

    public String getRegion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c01b4f", new Object[]{this}) : this.e;
    }

    public void setRegion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ed3c07", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public Uri getPicUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("c19c2eb9", new Object[]{this}) : this.f6804a;
    }

    public void setResolvedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c539566", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String getResolvedUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a78a878", new Object[]{this});
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        Uri uri = this.f6804a;
        return uri == null ? "" : uri.toString();
    }

    public void setPicUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2efeb79", new Object[]{this, uri});
        } else {
            this.f6804a = uri;
        }
    }

    public boolean isLocalPathImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6bf26e0", new Object[]{this})).booleanValue();
        }
        Uri uri = this.f6804a;
        if (uri != null && !StringUtils.isEmpty(uri.toString())) {
            try {
                String scheme = this.f6804a.getScheme();
                if (!"http".equals(scheme) && !"https".equals(scheme)) {
                    if (!"content".equals(scheme)) {
                        if (!"file".equals(scheme)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean isRemotePic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d679ce5", new Object[]{this})).booleanValue();
        }
        Uri uri = this.f6804a;
        if (uri == null || StringUtils.isEmpty(uri.toString())) {
            return false;
        }
        try {
            String scheme = this.f6804a.getScheme();
            if (!"http".equals(scheme)) {
                if (!"https".equals(scheme)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public boolean isIntelliDetect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c4252d7", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean isFromOuterApp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d690745", new Object[]{this})).booleanValue() : this.f;
    }

    public String getIntelliHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90fc04b5", new Object[]{this}) : this.d;
    }

    public void setIntelliDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e20b99", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void setIntelliHint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63bc0c9", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue() : this.b;
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public PhotoFrom getPhotoFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoFrom) ipChange.ipc$dispatch("22177411", new Object[]{this}) : this.g;
    }

    public boolean isProductCoe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6c9595f", new Object[]{this})).booleanValue() : this.g == PhotoFrom.Values.PRODUCT_CODE;
    }

    public void setPhotoSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e1e311", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getPhotoSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a172bcb1", new Object[]{this})).intValue() : this.h;
    }

    public void setPhotoFrom(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff88ba9", new Object[]{this, photoFrom});
        } else {
            this.g = photoFrom;
        }
    }

    public IrpPageConfig getPageConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IrpPageConfig) ipChange.ipc$dispatch("49ee4694", new Object[]{this}) : this.j;
    }

    public void setPageConfig(IrpPageConfig irpPageConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9689226", new Object[]{this, irpPageConfig});
        } else {
            this.j = irpPageConfig;
        }
    }

    public void addExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4e9f9", new Object[]{this, str, str2});
        } else {
            this.k.put(str, str2);
        }
    }

    public void addTkExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819aec90", new Object[]{this, str, str2});
        } else {
            this.m.put(str, str2);
        }
    }

    public Map<String, String> getTkExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3f64f145", new Object[]{this}) : this.m;
    }

    public void addExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe0e7a9", new Object[]{this, map});
        } else {
            this.k.putAll(map);
        }
    }

    public void clearExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e61e530", new Object[]{this});
        } else {
            this.k.clear();
        }
    }

    public Map<String, String> getExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this}) : this.k;
    }

    public String getExtraParamValue(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4cf5e991", new Object[]{this, str}) : (StringUtils.isEmpty(str) || (map = this.k) == null || map.isEmpty()) ? "" : this.k.get(str);
    }

    public void addJsExtraParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37dd2e2", new Object[]{this, str, str2});
        } else {
            this.l.put(str, str2);
        }
    }

    public void addJsExtraParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ae9f12", new Object[]{this, map});
        } else {
            this.l.putAll(map);
        }
    }

    public void clearJsExtraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4983e7", new Object[]{this});
        } else {
            this.l.clear();
        }
    }

    public Map<String, String> getJsExtraParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("73b27bb3", new Object[]{this}) : this.l;
    }

    public String getExtraParam(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7443107c", new Object[]{this, str});
        }
        String str2 = null;
        Map<String, String> map2 = this.k;
        if (map2 != null) {
            str2 = map2.get(str);
        }
        return (str2 == null && (map = this.l) != null) ? map.get(str) : str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IrpParamModel{mPicUrl='" + this.f6804a.toString() + "', mOrientation=" + this.b + ", mIntelliDetect=" + this.c + ", mIntelliHint='" + this.d + "', mPhotoFrom=" + this.g + ", mPageConfig=" + this.j + ", mExtraParams=" + this.k + ", mJsExtraParams=" + this.l + '}';
    }

    public boolean isInvalidSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d294c780", new Object[]{this})).booleanValue() : this.q == -1;
    }

    public boolean isNoPicSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bde3492", new Object[]{this})).booleanValue() : this.q == 1;
    }

    public void checkIsFromOuterTraffic() {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c01c7c5", new Object[]{this});
            return;
        }
        for (String str : com.etao.feimagesearch.config.b.bt()) {
            if (getPssource().equals(str)) {
                this.q = 1;
                return;
            }
        }
        if (isProductCoe()) {
            return;
        }
        if (this.f6804a != null) {
            this.q = 0;
            return;
        }
        String[] bg = com.etao.feimagesearch.config.b.bg();
        int length = bg.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = bg[i];
            if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(this.k.get(str2))) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.q = 0;
            return;
        }
        int i2 = -1;
        if (!com.etao.feimagesearch.config.b.bi()) {
            this.q = -1;
            return;
        }
        String[] bf = com.etao.feimagesearch.config.b.bf();
        if (bf.length <= 0) {
            if (com.etao.feimagesearch.config.b.bh()) {
                i2 = 1;
            }
            this.q = i2;
            return;
        }
        int length2 = bf.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            String str3 = bf[i3];
            if (!StringUtils.isEmpty(str3) && !StringUtils.isEmpty(this.k.get(str3))) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2 || com.etao.feimagesearch.config.b.bh()) {
            i2 = 1;
        }
        this.q = i2;
    }

    public boolean isIrpLoadingOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84ea27", new Object[]{this})).booleanValue();
        }
        if (this.r == null) {
            this.r = Boolean.valueOf(com.etao.feimagesearch.config.b.m(getPssource()));
        }
        return this.r.booleanValue();
    }
}
