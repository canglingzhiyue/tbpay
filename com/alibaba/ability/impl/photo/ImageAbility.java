package com.alibaba.ability.impl.photo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.impl.TransParentActivity;
import com.alibaba.ability.impl.photo.c;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.pissarro.remote.TaopaiLoadConfig;
import com.taobao.browser.jsbridge.ui.CameraActivity;
import com.taobao.taobao.scancode.gateway.util.i;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.aln;
import tb.als;
import tb.bfy;
import tb.hsy;
import tb.ios;
import tb.kge;

/* loaded from: classes2.dex */
public final class ImageAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taopai2.export.b f1937a = new com.taobao.taopai2.export.b();

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f1940a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ aln c;

        public c(List list, Context context, aln alnVar) {
            this.f1940a = list;
            this.b = context;
            this.c = alnVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            Bitmap b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final JSONArray jSONArray = new JSONArray(this.f1940a.size());
            int size = this.f1940a.size();
            for (int i = 0; i < size; i++) {
                Object obj = this.f1940a.get(i);
                String valueOf = String.valueOf(i);
                if (obj == null) {
                    jSONObject = new JSONObject(ai.a(j.a(valueOf, "空字符串")));
                } else if (!(obj instanceof String)) {
                    jSONObject = new JSONObject(ai.a(j.a(valueOf, "非字符串")));
                } else {
                    String str = (String) obj;
                    if (URLUtil.isHttpsUrl(str)) {
                        b = com.alibaba.ability.impl.photo.d.INSTANCE.a(str);
                    } else if (URLUtil.isDataUrl(str)) {
                        b = com.alibaba.ability.impl.photo.d.INSTANCE.b(str);
                    } else {
                        jSONObject = new JSONObject(ai.a(j.a(valueOf, "非法数据")));
                    }
                    if (b == null) {
                        jSONObject = new JSONObject(ai.a(j.a(valueOf, "图片下载失败")));
                    } else if (!com.alibaba.ability.impl.photo.d.INSTANCE.a(this.b, b)) {
                        jSONObject = new JSONObject(ai.a(j.a(valueOf, "图片保存失败")));
                    }
                }
                jSONArray.add(jSONObject);
            }
            com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.impl.photo.ImageAbility.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.this.c.a(new FinishResult(new JSONObject(ai.a(j.a("failSrcs", jSONArray))), "onFinish"));
                    }
                }
            }, 0L, 2, null);
        }
    }

    static {
        kge.a(-25182891);
    }

    public static /* synthetic */ Object ipc$super(ImageAbility imageAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final com.taobao.taopai2.export.b getExporter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taopai2.export.b) ipChange.ipc$dispatch("314c3d42", new Object[]{this}) : this.f1937a;
    }

    public final void setExporter(com.taobao.taopai2.export.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def2000a", new Object[]{this, bVar});
            return;
        }
        q.d(bVar, "<set-?>");
        this.f1937a = bVar;
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f1937a.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.String] */
    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        Context f = context.f().f();
        if (f == null) {
            return a$a.Companion.b("NoAppCtx");
        }
        switch (api.hashCode()) {
            case -2072491622:
                if (api.equals(com.alibaba.ability.impl.photo.b.API_FROM_LIB)) {
                    String a2 = com.alibaba.ability.e.a(params, com.alibaba.ability.impl.photo.b.IMG_UPLOAD_BIZ_LINE, "");
                    Integer a3 = com.alibaba.ability.e.a(params, com.alibaba.ability.impl.photo.b.MAX_V_SIZE, Integer.valueOf((int) com.alibaba.ability.impl.photo.b.MAX_VIDEO_SIZE));
                    if (Build.VERSION.SDK_INT < 33 && ActivityCompat.checkSelfPermission(f, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        return new ErrorResult("NO_PERMISSION", "NoPermission", (Map) null, 4, (o) null);
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = com.alibaba.ability.e.a(params, "type", "photo|video");
                    if (q.a((Object) "all", (Object) ((String) objectRef.element))) {
                        objectRef.element = "photo|video";
                    }
                    Integer a4 = com.alibaba.ability.e.a(params, "maxSelection", (Integer) 9);
                    TransParentActivity.a aVar = TransParentActivity.Companion;
                    Intent intent = new Intent(f, TransParentActivity.class);
                    String str = (String) objectRef.element;
                    q.a((Object) str);
                    String valueOf = String.valueOf(a4);
                    q.a(a3);
                    Intent a5 = aVar.a(intent, new e(callback, f, params, objectRef, a4, a2, a3, a(str, valueOf, a2, a3.intValue()), 1002));
                    if (!com.taobao.android.pissarro.remote.b.a()) {
                        com.taobao.android.pissarro.remote.b.a(f, new TaopaiLoadConfig.a().a(a2).a(a5).a(), true);
                    } else {
                        f.startActivity(a5);
                    }
                    return new FinishResult(null, null, 3, null);
                }
                return a$a.Companion.a("api not found");
            case -2001325226:
                if (api.equals(com.alibaba.ability.impl.photo.b.API_FROM_CAMERA)) {
                    String a6 = com.alibaba.ability.e.a(params, com.alibaba.ability.impl.photo.b.IMG_UPLOAD_BIZ_LINE, "");
                    if (ActivityCompat.checkSelfPermission(f, com.taobao.speech.util.e.CAMERA) != 0) {
                        return new ErrorResult("NO_PERMISSION", "NoPermission", (Map) null, 4, (o) null);
                    }
                    String a7 = com.alibaba.ability.e.a(params, "captureType", "back");
                    Intent a8 = TransParentActivity.Companion.a(new Intent(f, TransParentActivity.class), new d(callback, f, params, a7, a6, a(q.a((Object) "back", (Object) a7), a6), 1001));
                    if (!com.taobao.android.pissarro.remote.b.a()) {
                        com.taobao.android.pissarro.remote.b.a(f, new TaopaiLoadConfig.a().a(a6).a(a8).a(), true);
                    } else {
                        f.startActivity(a8);
                    }
                    a(f, params);
                    return new FinishResult(null, null, 3, null);
                }
                return a$a.Companion.a("api not found");
            case -1541263203:
                if (api.equals(com.alibaba.ability.impl.photo.b.API_CAPTURE)) {
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    booleanRef.element = Boolean.parseBoolean(com.alibaba.ability.e.a(params, com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM, ""));
                    if (Build.VERSION.SDK_INT >= 21) {
                        Intent intent2 = new Intent(f, TransParentActivity.class);
                        Object systemService = f.getSystemService("media_projection");
                        if (systemService == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                        }
                        Intent createScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
                        q.b(createScreenCaptureIntent, "mediaProjectManager.createScreenCaptureIntent()");
                        TransParentActivity.Companion.a(intent2, f, new b(callback, f, booleanRef, createScreenCaptureIntent, null, 1003, createScreenCaptureIntent));
                    } else {
                        callback.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "Unsupported Device", (Map) null, 4, (o) null));
                    }
                    return new FinishResult(null, null, 3, null);
                }
                return a$a.Companion.a("api not found");
            case -491916169:
                if (api.equals(com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM)) {
                    List<Object> b2 = com.alibaba.ability.e.b(params, "sources");
                    List<Object> list = b2;
                    if (list != null && !list.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        callback.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "sources empty", (Map) null, 4, (o) null));
                        return null;
                    }
                    bfy.a(com.alibaba.ability.impl.photo.b.a(), new c(b2, f, callback), 0L, null, 6, null);
                    return null;
                }
                return a$a.Companion.a("api not found");
            default:
                return a$a.Companion.a("api not found");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends com.alibaba.ability.impl.photo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ aln b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(aln alnVar, Context context, Map map, String str, String str2, Uri uri, int i) {
            super(uri, i, null, 4, null);
            this.b = alnVar;
            this.c = context;
            this.d = map;
            this.e = str;
            this.f = str2;
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            } else if (jSONArray == null) {
                this.b.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "user canceled", (Map) null, 4, (o) null));
            } else {
                a(this.c, jSONArray, this.d, ImageAbility.this.getExporter(), new a());
            }
        }

        /* loaded from: classes2.dex */
        public static final class a implements c.a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.ability.impl.photo.c.a
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                } else if (jSONArray == null) {
                    d.this.b.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_TAKE_PHOTO_ERROR, "take photo failed,data empty", (Map) null, 4, (o) null));
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "mediaFiles", (String) jSONArray);
                    d.this.b.a(new FinishResult(jSONObject, "onSuccess"));
                }
            }
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            this.b.a(result);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends com.alibaba.ability.impl.photo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ aln b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Integer f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Integer h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(aln alnVar, Context context, Map map, Ref.ObjectRef objectRef, Integer num, String str, Integer num2, Uri uri, int i) {
            super(uri, i, null, 4, null);
            this.b = alnVar;
            this.c = context;
            this.d = map;
            this.e = objectRef;
            this.f = num;
            this.g = str;
            this.h = num2;
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            } else if (jSONArray == null) {
                this.b.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "user canceled", (Map) null, 4, (o) null));
            } else {
                a(this.c, jSONArray, this.d, ImageAbility.this.getExporter(), new a());
            }
        }

        /* loaded from: classes2.dex */
        public static final class a implements c.a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.ability.impl.photo.c.a
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                } else if (jSONArray == null) {
                    e.this.b.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_SELECT_ERROR, "choose from album failed,data empty", (Map) null, 4, (o) null));
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "mediaFiles", (String) jSONArray);
                    e.this.b.a(new FinishResult(jSONObject, "onSuccess"));
                }
            }
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            this.b.a(result);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends com.alibaba.ability.impl.photo.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ aln f1939a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Ref.BooleanRef c;
        public final /* synthetic */ Intent d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(aln alnVar, Context context, Ref.BooleanRef booleanRef, Intent intent, Uri uri, int i, Intent intent2) {
            super(uri, i, intent2);
            this.f1939a = alnVar;
            this.b = context;
            this.c = booleanRef;
            this.d = intent;
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(Intent intent, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d55ada32", new Object[]{this, intent, num});
            } else if (intent == null) {
                this.f1939a.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "screen capture failed", (Map) null, 4, (o) null));
            } else {
                Intent intent2 = new Intent(this.b, CaptureService.class);
                if (num != null && num.intValue() == -1) {
                    intent2.putExtra("data", intent);
                    intent2.putExtra(com.alibaba.ability.impl.photo.b.API_SAVE_TO_ALBUM, this.c.element);
                    if (Build.VERSION.SDK_INT >= 26) {
                        CaptureService.Companion.a(intent2, this.b, this.f1939a);
                        return;
                    } else {
                        CaptureService.Companion.b(intent2, this.b, this.f1939a);
                        return;
                    }
                }
                this.f1939a.a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "user canceled", (Map) null, 4, (o) null));
            }
        }

        @Override // com.alibaba.ability.impl.photo.c
        public void a(ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            this.f1939a.a(result);
        }
    }

    private final void a(Context context, Map<String, ? extends Object> map) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        String a2 = com.alibaba.ability.e.a(map, "maskImg", "");
        Integer a3 = com.alibaba.ability.e.a(map, CameraActivity.MASK_WIDTH, (Integer) (-1));
        q.a(a3);
        int intValue = a3.intValue();
        Integer a4 = com.alibaba.ability.e.a(map, CameraActivity.MASK_HEIGHT, (Integer) (-1));
        q.a(a4);
        int intValue2 = a4.intValue();
        String str = a2;
        boolean z2 = (str == null || str.length() == 0) | (intValue == -1);
        if (intValue2 != -1) {
            z = false;
        }
        if (z2 || z) {
            return;
        }
        DisplayMetrics a5 = hsy.a(context);
        int i2 = a5.widthPixels;
        int i3 = a5.heightPixels;
        float f = i3 / i2;
        if (intValue == intValue2) {
            i = i2;
        } else {
            if (intValue > intValue2) {
                int i4 = intValue ^ intValue2;
                intValue2 ^= i4;
                intValue = i4 ^ intValue2;
            }
            float f2 = intValue2;
            float f3 = intValue;
            if (f2 / f3 < f) {
                i = (int) ((intValue2 * i2) / f3);
            } else {
                i2 = (int) ((intValue * i3) / f2);
                i = i3;
            }
        }
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i);
        layoutParams.gravity = 17;
        try {
            com.taobao.phenix.intf.b.h().a(a2).into(imageView);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            Application application = (Application) applicationContext;
            application.registerActivityLifecycleCallbacks(new a(application, imageView, layoutParams));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    /* loaded from: classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f1938a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ FrameLayout.LayoutParams c;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.d(activity, "activity");
            q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        public a(Application application, ImageView imageView, FrameLayout.LayoutParams layoutParams) {
            this.f1938a = application;
            this.b = imageView;
            this.c = layoutParams;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            q.d(activity, "activity");
            Intent intent = activity.getIntent();
            if (!q.a((Object) ((intent == null || (data = intent.getData()) == null) ? null : data.getPath()), (Object) "/taopai/socialrecord_refactor.html")) {
                return;
            }
            Window window = activity.getWindow();
            q.b(window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            ((FrameLayout) decorView).addView(this.b, this.c);
            this.f1938a.unregisterActivityLifecycleCallbacks(this);
        }
    }

    private final Uri a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f33cdab4", new Object[]{this, str, str2, str3, new Integer(i)});
        }
        Uri build = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/image_gallery.html").appendQueryParameter("scene", "selectGallery").appendQueryParameter(ios.KEY_BIZ_LINE, str3).appendQueryParameter("biz_scene", "mega_ability").appendQueryParameter("use_message_ui", "1").appendQueryParameter(ios.KEY_MEDIA_TYPE, str).appendQueryParameter("photo_max", str2).appendQueryParameter("max_import_video_size", String.valueOf(i)).build();
        q.b(build, "Uri.Builder()\n          …g())\n            .build()");
        return build;
    }

    private final Uri a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("52fc176d", new Object[]{this, new Boolean(z), str});
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/socialrecord.html").appendQueryParameter(ios.KEY_BIZ_LINE, str).appendQueryParameter("biz_scene", "mega_ability").appendQueryParameter(ios.KEY_MEDIA_TYPE, i.SOURCE_TYPE_PHOTO).appendQueryParameter("use_message_ui", "1");
        if (z) {
            appendQueryParameter.appendQueryParameter("back_camera", "1");
        }
        Uri build = appendQueryParameter.build();
        q.b(build, "builder.build()");
        return build;
    }
}
