package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.e;
import com.airbnb.lottie.i;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.d;
import com.taobao.tao.log.TLog;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import io.unicorn.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002J$\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/taobao/android/megadesign/anim/lottie/delegate/MAImageDelegate;", "Lcom/airbnb/lottie/ImageAssetDelegate;", "context", "Landroid/content/Context;", "replacementImages", "Lcom/alibaba/fastjson/JSONArray;", com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, "Lcom/airbnb/lottie/LottieDrawable;", "(Landroid/content/Context;Lcom/alibaba/fastjson/JSONArray;Lcom/airbnb/lottie/LottieDrawable;)V", RPCDataItems.SWITCH_TAG_LOG, "", "getTAG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDrawable", "()Lcom/airbnb/lottie/LottieDrawable;", "setDrawable", "(Lcom/airbnb/lottie/LottieDrawable;)V", "getReplacementImages", "()Lcom/alibaba/fastjson/JSONArray;", "setReplacementImages", "(Lcom/alibaba/fastjson/JSONArray;)V", "fetchBitmap", "Landroid/graphics/Bitmap;", FlutterActivityLaunchConfigs.EXTRA_RENDER_TYPE_ASSET, "Lcom/airbnb/lottie/LottieImageAsset;", "getBitmapFormView", "view", "Landroid/view/View;", "getConfigById", "Lcom/alibaba/fastjson/JSONObject;", "data", "id", "resizeBitmapIfNeeded", IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, "width", "", "height", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class hst implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f28760a;
    private Context b;
    private JSONArray c;
    private LottieDrawable d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/phenix/intf/event/SuccPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a<T extends d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ i c;
        public final /* synthetic */ Ref.ObjectRef d;

        public a(Ref.ObjectRef objectRef, i iVar, Ref.ObjectRef objectRef2) {
            this.b = objectRef;
            this.c = iVar;
            this.d = objectRef2;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        /* JADX WARN: Type inference failed for: r7v5, types: [T, android.graphics.Bitmap] */
        public final boolean a(SuccPhenixEvent it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, it})).booleanValue();
            }
            try {
                Ref.ObjectRef objectRef = this.b;
                hst hstVar = hst.this;
                q.b(it, "it");
                BitmapDrawable drawable = it.getDrawable();
                q.b(drawable, "it.drawable");
                objectRef.element = hstVar.a(drawable.getBitmap(), this.c.a(), this.c.b());
            } catch (Throwable th) {
                String a2 = hst.this.a();
                String a3 = hst.this.a();
                TLog.loge(a2, a3, "resize image (" + ((JSONObject) this.d.element).getString("source") + ") failed. " + th);
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/taobao/phenix/intf/event/FailPhenixEvent;", "kotlin.jvm.PlatformType", "onHappen"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b<T extends d> implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.ObjectRef b;

        public b(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public final boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            String a2 = hst.this.a();
            String a3 = hst.this.a();
            TLog.loge(a2, a3, "load url (" + ((JSONObject) this.b.element).getString("source") + ") failed.");
            return false;
        }
    }

    public hst(Context context, JSONArray replacementImages, LottieDrawable lottieDrawable) {
        q.d(context, "context");
        q.d(replacementImages, "replacementImages");
        this.b = context;
        this.c = replacementImages;
        this.d = lottieDrawable;
        this.f28760a = "MAImageDelegate";
    }

    public final Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.b;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f28760a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, android.graphics.Bitmap] */
    @Override // com.airbnb.lottie.e
    public Bitmap fetchBitmap(i iVar) {
        Bitmap bitmap;
        Bitmap decodeStream;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8a969dc1", new Object[]{this, iVar});
        }
        if (iVar == null) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = a(this.c, iVar.c());
        if (((JSONObject) objectRef.element) == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            String filename = iVar.d();
            q.b(filename, "filename");
            if (n.b(filename, "data:", false, 2, (Object) null) && n.a((CharSequence) filename, com.taobao.search.musie.n.BASE_64, 0, false, 6, (Object) null) > 0) {
                try {
                    String substring = filename.substring(n.a((CharSequence) filename, ',', 0, false, 6, (Object) null) + 1);
                    q.b(substring, "(this as java.lang.String).substring(startIndex)");
                    byte[] decode = Base64.decode(substring, 0);
                    return BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                } catch (IllegalArgumentException e) {
                    String str = this.f28760a;
                    TLog.loge(str, str, "Unable to decode image. " + e);
                    return null;
                }
            }
            try {
                LottieDrawable lottieDrawable = this.d;
                String f = lottieDrawable != null ? lottieDrawable.f() : null;
                if (f == null || n.a((CharSequence) f)) {
                    z = true;
                }
                if (!(!z)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder".toString());
                }
                AssetManager assets = this.b.getAssets();
                LottieDrawable lottieDrawable2 = this.d;
                try {
                    return a(BitmapFactory.decodeStream(AssetsDelegate.proxy_open(assets, q.a(lottieDrawable2 != null ? lottieDrawable2.f() : null, (Object) filename)), null, options), iVar.a(), iVar.b());
                } catch (IllegalArgumentException e2) {
                    String str2 = this.f28760a;
                    TLog.loge(str2, str2, "Unable to decode image. " + e2);
                    return null;
                }
            } catch (IOException e3) {
                String str3 = this.f28760a;
                TLog.loge(str3, str3, "Unable to open asset. " + e3);
                return null;
            }
        }
        try {
            String string = ((JSONObject) objectRef.element).getString("type");
            if (string == null) {
                return null;
            }
            int hashCode = string.hashCode();
            if (hashCode != 3220) {
                if (hashCode == 116079) {
                    if (!string.equals("url")) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = (Bitmap) 0;
                    com.taobao.phenix.intf.b.h().a(((JSONObject) objectRef.element).getString("source")).succListener(new a(objectRef2, iVar, objectRef)).failListener(new b(objectRef)).fetch();
                    return (Bitmap) objectRef2.element;
                } else if (hashCode != 93121264 || !string.equals(FlutterActivityLaunchConfigs.EXTRA_RENDER_TYPE_ASSET)) {
                    return null;
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inScaled = true;
                    options2.inDensity = 160;
                    Bitmap bitmap2 = null;
                    try {
                        InputStream proxy_open = AssetsDelegate.proxy_open(this.b.getAssets(), ((JSONObject) objectRef.element).getString("source"));
                        q.b(proxy_open, "context.assets.open(result.getString(\"source\"))");
                        try {
                            decodeStream = BitmapFactory.decodeStream(proxy_open, null, options2);
                        } catch (IllegalArgumentException e4) {
                            TLog.loge(this.f28760a, this.f28760a, "Unable to decode image. " + e4);
                        }
                        bitmap = a(decodeStream, iVar.a(), iVar.b());
                    } catch (IOException e5) {
                        TLog.loge(this.f28760a, this.f28760a, "open asset (" + ((JSONObject) objectRef.element).getString("source") + ") failed. " + e5);
                        return null;
                    }
                }
            } else if (!string.equals("dx")) {
                return null;
            } else {
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = (Bitmap) 0;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                String string2 = ((JSONObject) objectRef.element).getString("source");
                q.b(string2, "result.getString(\"source\")");
                Charset charset = kotlin.text.d.UTF_8;
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = string2.getBytes(charset);
                q.b(bytes, "(this as java.lang.String).getBytes(charset)");
                jSONObject2.put((JSONObject) "name", new BigInteger(1, messageDigest.digest(bytes)).toString(16));
                jSONObject2.put((JSONObject) "version", (String) 1);
                jSONObject2.put((JSONObject) "url", ((JSONObject) objectRef.element).getString("source"));
                jSONObject.put((JSONObject) "template", (String) jSONObject2);
                jnl jnlVar = new jnl(this.b, new jnk(jSONObject), "megaDesign", null, null, null);
                jnlVar.a(new c(jnlVar, new DXRenderOptions.a().a(), objectRef3, iVar));
                bitmap = (Bitmap) objectRef3.element;
            }
            return bitmap;
        } catch (Throwable th) {
            String str4 = this.f28760a;
            TLog.loge(str4, str4, "fetchBitmap image (" + ((JSONObject) objectRef.element).toString() + ") error. " + th);
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/android/megadesign/anim/lottie/delegate/MAImageDelegate$fetchBitmap$3", "Lcom/taobao/android/uilike/dx/IDxViewWrapperCallback;", "onCreateView", "", "dxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "onError", "msg", "", "dxError", "Lcom/taobao/android/dinamicx/DXError;", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c implements jnn {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jnl b;
        public final /* synthetic */ DXRenderOptions c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ i e;

        public c(jnl jnlVar, DXRenderOptions dXRenderOptions, Ref.ObjectRef objectRef, i iVar) {
            this.b = jnlVar;
            this.c = dXRenderOptions;
            this.d = objectRef;
            this.e = iVar;
        }

        /* JADX WARN: Type inference failed for: r9v6, types: [T, android.graphics.Bitmap] */
        @Override // tb.jnn
        public void a(DXRootView dxRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc619e9", new Object[]{this, dxRootView});
                return;
            }
            q.d(dxRootView, "dxRootView");
            DXResult<DXRootView> a2 = this.b.a().a(hst.this.b(), dxRootView, dxRootView.getDxTemplateItem(), (JSONObject) null, -1, this.c);
            q.b(a2, "wrapper.getDxEngine().re…                    opts)");
            if (a2.f11780a == null || a2.b()) {
                return;
            }
            try {
                Ref.ObjectRef objectRef = this.d;
                hst hstVar = hst.this;
                DXRootView dXRootView = a2.f11780a;
                q.a(dXRootView);
                objectRef.element = hstVar.a(dXRootView, this.e);
            } catch (Throwable th) {
                String a3 = hst.this.a();
                String a4 = hst.this.a();
                TLog.loge(a3, a4, "Unable to decode view to bitmap. " + th);
            }
        }

        @Override // tb.jnn
        public void a(String msg, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c703f88f", new Object[]{this, msg, sVar});
                return;
            }
            q.d(msg, "msg");
            String a2 = hst.this.a();
            String a3 = hst.this.a();
            TLog.loge(a2, a3, "create dx view error. " + sVar);
        }
    }

    public Bitmap a(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3f40f684", new Object[]{this, bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public Bitmap a(View view, i asset) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4e6b1d27", new Object[]{this, view, asset});
        }
        q.d(view, "view");
        q.d(asset, "asset");
        view.measure(View.MeasureSpec.makeMeasureSpec(gbg.b(this.b), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gbg.c(this.b), Integer.MIN_VALUE));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return a(createBitmap, asset.a(), asset.b());
    }

    private final JSONObject a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72e64e7a", new Object[]{this, jSONArray, str});
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            JSONObject jSONObject = (JSONObject) (!(next instanceof JSONObject) ? null : next);
            if (jSONObject != null && jSONObject.containsKey(str)) {
                return (JSONObject) next;
            }
        }
        return null;
    }
}
