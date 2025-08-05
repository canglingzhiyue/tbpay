package tb;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.model.d;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.cqt;

/* loaded from: classes3.dex */
public final class cqw extends igj<FrameLayout, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f26457a;
    private cqt b;
    private boolean c;
    private final a d;
    private cqt.a e;

    static {
        kge.a(771961164);
    }

    public static /* synthetic */ Object ipc$super(cqw cqwVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode == 93762283) {
            super.d();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public static final /* synthetic */ FrameLayout a(cqw cqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e6ea8f0a", new Object[]{cqwVar});
        }
        FrameLayout frameLayout = cqwVar.f26457a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ void b(cqw cqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27732f0", new Object[]{cqwVar});
        } else {
            cqwVar.eR_();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.igj
    public /* synthetic */ FrameLayout k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    public final cqt.a ey_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqt.a) ipChange.ipc$dispatch("f229a31", new Object[]{this}) : this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqw(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, cqt.a aVar) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.e = aVar;
        this.d = new a();
    }

    /* loaded from: classes3.dex */
    public static final class a implements cqt.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.cqt.a
        public void a(boolean z, View containerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fff475e6", new Object[]{this, new Boolean(z), containerView});
                return;
            }
            q.c(containerView, "containerView");
            cqw.a(cqw.this).addView(containerView, 0);
            cqt.a ey_ = cqw.this.ey_();
            if (ey_ == null) {
                return;
            }
            ey_.a(z, containerView);
        }

        @Override // tb.cqt.a
        public void a(boolean z, Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb11d495", new Object[]{this, new Boolean(z), num, str});
                return;
            }
            cqt.a ey_ = cqw.this.ey_();
            if (ey_ != null) {
                ey_.a(z, num, str);
            }
            if (z) {
                return;
            }
            cqw.b(cqw.this);
        }

        @Override // tb.cqt.a
        public void b(boolean z, Integer num, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0534356", new Object[]{this, new Boolean(z), num, str});
                return;
            }
            cqt.a ey_ = cqw.this.ey_();
            if (ey_ == null) {
                return;
            }
            ey_.b(z, num, str);
        }

        @Override // tb.cqt.a
        public void s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a137a", new Object[]{this});
                return;
            }
            cqt.a ey_ = cqw.this.ey_();
            if (ey_ == null) {
                return;
            }
            ey_.s();
        }

        @Override // tb.cqt.a
        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            cqt.a ey_ = cqw.this.ey_();
            if (ey_ == null) {
                return 0;
            }
            return ey_.b(i);
        }
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        this.f26457a = new FrameLayout(g());
        FrameLayout frameLayout = this.f26457a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        return frameLayout;
    }

    @Override // tb.hon
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.b();
    }

    @Override // tb.hon
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.c();
    }

    @Override // tb.hon
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.d();
    }

    public final void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.a(num);
    }

    public final void eu_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcc9eb6", new Object[]{this});
        } else {
            c(b.a());
        }
    }

    public final boolean ev_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad817759", new Object[]{this})).booleanValue() : this.c;
    }

    public final boolean ew_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af364ff8", new Object[]{this})).booleanValue();
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return false;
        }
        return cqtVar.a();
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        FrameLayout O = O();
        if (O == null) {
            return;
        }
        O.setTranslationY(f);
    }

    public final void ex_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0eb2893", new Object[]{this});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.e();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.f();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.b(z);
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.a(jSONArray);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.a(jSONObject);
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.b(jSONObject);
    }

    public final void a(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.a(str, str2, map);
    }

    public final void a(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(com.taobao.android.weex_framework.util.a.ATOM_EXT_window, str, map);
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return false;
        }
        return cqtVar.g();
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.c(z);
    }

    private final void c(boolean z) {
        cqu cquVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.newresult.perf.a.K();
        eS_();
        if (z) {
            cquVar = new cqv(this.d);
        } else {
            cquVar = new cqu(this.d);
        }
        this.b = cquVar;
        cqt cqtVar = this.b;
        if (cqtVar == null) {
            return;
        }
        cqtVar.a(g(), eQ_());
    }

    private final Map<String, String> eQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("474d950f", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("innative", "1");
        linkedHashMap.put("biz_type", "pai");
        linkedHashMap.put("pltv", "1");
        linkedHashMap.put("nativeReq", "true");
        linkedHashMap.put("subSearchType", "imageText_v2");
        String p = m().p();
        if (!TextUtils.isEmpty(p)) {
            linkedHashMap.put("shopId", p);
        }
        String q = m().q();
        if (!TextUtils.isEmpty(q)) {
            linkedHashMap.put("sellerId", q);
        }
        String f = m().f("cat");
        if (f == null) {
            f = "";
        }
        linkedHashMap.put("cat", f);
        linkedHashMap.put(d.KEY_PHOTO_FROM, m().a().getArg());
        linkedHashMap.put("pssource", m().r());
        linkedHashMap.put("ttid", com.c());
        linkedHashMap.put("utd_id", com.a(g()));
        linkedHashMap.put("rainbow", cof.a());
        linkedHashMap.put("triggerElder", String.valueOf(m().U()));
        linkedHashMap.putAll(m().d());
        if (m().b() != null && !m().u()) {
            Activity g = g();
            Uri b = m().b();
            String a2 = a(g, b != null ? b.toString() : null);
            if (!TextUtils.isEmpty(a2)) {
                linkedHashMap.put("meta_info", a2);
            }
        }
        return linkedHashMap;
    }

    private final void eR_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701300f9", new Object[]{this});
            return;
        }
        this.c = true;
        cqt.a aVar = this.e;
        if (aVar != null) {
            aVar.s();
        }
        c(true);
    }

    private final void eS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c7d998", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f26457a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        frameLayout.removeAllViews();
        cqt cqtVar = this.b;
        if (cqtVar != null) {
            cqtVar.d();
        }
        this.b = null;
    }

    private final String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = Uri.parse(str);
        String str2 = null;
        q.a((Object) uri, "uri");
        if (uri.getScheme() == null) {
            if (str == null) {
                q.a();
            }
        } else if (TextUtils.equals(uri.getScheme(), "file")) {
            str = uri.getPath();
        } else if (TextUtils.equals(uri.getScheme(), "content")) {
            try {
                Cursor query = MediaStore.Images.Media.query(context.getContentResolver(), uri, new String[]{"_data"}, null, null, null);
                if (query != null && query.moveToFirst() && query.getCount() != 0) {
                    str = query.getString(0);
                    query.close();
                }
                str = "";
                query.close();
            } catch (Exception unused) {
                str = "";
            }
        } else {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (str == null) {
                q.a();
            }
            jSONObject.put("path", str);
            ExifInterface exifInterface = new ExifInterface(str);
            String attribute = exifInterface.getAttribute(android.support.media.ExifInterface.TAG_MAKE);
            if (!TextUtils.isEmpty(attribute)) {
                jSONObject.put("manufacturer", attribute);
            }
            String attribute2 = exifInterface.getAttribute(android.support.media.ExifInterface.TAG_MODEL);
            if (!TextUtils.isEmpty(attribute2)) {
                jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, attribute2);
            }
            String attribute3 = exifInterface.getAttribute(android.support.media.ExifInterface.TAG_IMAGE_WIDTH);
            if (!TextUtils.isEmpty(attribute3)) {
                jSONObject.put("width", attribute3);
            }
            String attribute4 = exifInterface.getAttribute(android.support.media.ExifInterface.TAG_IMAGE_LENGTH);
            if (!TextUtils.isEmpty(attribute4)) {
                jSONObject.put("height", attribute4);
            }
            if (exifInterface.getLatLong(new float[2])) {
                jSONObject.put("GPS", "true");
            } else {
                jSONObject.put("GPS", "false");
            }
            String jSONObject2 = jSONObject.toString();
            q.a((Object) jSONObject2, "meta.toString()");
            return URLEncoder.encode(jSONObject2, "UTF-8");
        } catch (Throwable unused2) {
            return "";
        }
    }
}
