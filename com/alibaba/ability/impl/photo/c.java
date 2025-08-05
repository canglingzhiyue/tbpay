package com.alibaba.ability.impl.photo;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.amg;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends com.alibaba.ability.impl.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f1947a;
    private Uri b;
    private int c;
    private Intent d;

    /* loaded from: classes2.dex */
    public interface a<T> {
        void a(T t);
    }

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f1948a;
        public final /* synthetic */ JSONArray b;

        public b(a aVar, JSONArray jSONArray) {
            this.f1948a = aVar;
            this.b = jSONArray;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f1948a.a(this.b);
            }
        }
    }

    /* renamed from: com.alibaba.ability.impl.photo.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0058c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f1949a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ a c;

        public RunnableC0058c(JSONArray jSONArray, Integer num, a aVar) {
            this.f1949a = jSONArray;
            this.b = num;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator<Object> it = this.f1949a.iterator();
            q.b(it, "data.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    next = null;
                }
                JSONObject jSONObject = (JSONObject) next;
                if (jSONObject != null) {
                    jSONObject.put((JSONObject) "thumbBase64", amg.a(jSONObject.getString("thumbPath"), this.b, new BitmapFactory.Options()));
                }
            }
            com.alibaba.ability.e.a(new Runnable() { // from class: com.alibaba.ability.impl.photo.c.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        RunnableC0058c.this.c.a(RunnableC0058c.this.f1949a);
                    }
                }
            }, 0L, 2, null);
        }
    }

    static {
        kge.a(-1135489312);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -857321247) {
            super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
            return null;
        } else if (hashCode != 2045969029) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
    }

    public void a(Intent intent, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55ada32", new Object[]{this, intent, num});
        }
    }

    public void a(ErrorResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
        } else {
            q.d(result, "result");
        }
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        }
    }

    public /* synthetic */ c(Uri uri, int i, Intent intent, int i2, o oVar) {
        this(uri, i, (i2 & 4) != 0 ? null : intent);
    }

    public static final /* synthetic */ void a(c cVar, JSONArray jSONArray, boolean z, Integer num, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7df35fa", new Object[]{cVar, jSONArray, new Boolean(z), num, aVar});
        } else {
            cVar.a(jSONArray, z, num, aVar);
        }
    }

    public c(Uri uri, int i, Intent intent) {
        this.b = uri;
        this.c = i;
        this.d = intent;
    }

    @Override // com.alibaba.ability.impl.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        q.d(activity, "activity");
        super.onActivityCreated(activity, bundle);
        if (this.b == null && this.d == null) {
            activity.finish();
            return;
        }
        this.f1947a = new WeakReference<>(activity);
        Intent intent = this.d;
        if (intent != null) {
            try {
                activity.startActivityForResult(intent, this.c);
                AppMonitor.Counter.commit("MegaImgAbility", "CaptureServerAbility", 1.0d);
            } catch (ActivityNotFoundException e2) {
                a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "Unsupported Device", (Map) null, 4, (o) null));
                AppMonitor.Counter.commit("MegaImgAbility", "CaptureServerNotFound", kotlin.a.a(e2), 1.0d);
                activity.finish();
            }
        } else if (Nav.from(activity).forResult(this.c).toUri(this.b)) {
        } else {
            a(new ErrorResult(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, "Unsupported Device", (Map) null, 4, (o) null));
            AppMonitor.Counter.commit("MegaImgAbility", "ImgService", 1.0d);
            activity.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // com.alibaba.ability.impl.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r6, int r7, android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.photo.c.a(int, int, android.content.Intent):void");
    }

    public final void a(Context ctx, JSONArray jSONArray, Map<String, ? extends Object> imgConfig, com.taobao.taopai2.export.b bVar, a<JSONArray> callBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5911be8c", new Object[]{this, ctx, jSONArray, imgConfig, bVar, callBack});
            return;
        }
        q.d(ctx, "ctx");
        q.d(imgConfig, "imgConfig");
        q.d(callBack, "callBack");
        Boolean a2 = com.alibaba.ability.e.a(imgConfig, com.alibaba.ability.impl.photo.b.NEED_UPLOAD, (Boolean) false);
        Boolean a3 = com.alibaba.ability.e.a(imgConfig, com.alibaba.ability.impl.photo.b.NEED_THUMB_BASE64, (Boolean) false);
        Integer a4 = com.alibaba.ability.e.a(imgConfig, com.alibaba.ability.impl.photo.b.IMG_MAX_SIZE, (Integer) null);
        q.a(a2);
        a(ctx, jSONArray, a2.booleanValue(), imgConfig, bVar, new d(a3, a4, callBack));
    }

    /* loaded from: classes2.dex */
    public static final class d implements a<JSONArray> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Boolean b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ a d;

        public d(Boolean bool, Integer num, a aVar) {
            this.b = bool;
            this.c = num;
            this.d = aVar;
        }

        /* loaded from: classes2.dex */
        public static final class a implements a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.ability.impl.photo.c.a
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                } else {
                    d.this.d.a(jSONArray);
                }
            }
        }

        @Override // com.alibaba.ability.impl.photo.c.a
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                return;
            }
            c cVar = c.this;
            Boolean bool = this.b;
            q.a(bool);
            c.a(cVar, jSONArray, bool.booleanValue(), this.c, new a());
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.HashMap] */
    private final void a(Context context, JSONArray jSONArray, boolean z, Map<String, ? extends Object> map, com.taobao.taopai2.export.b bVar, a<JSONArray> aVar) {
        c cVar = this;
        a<JSONArray> aVar2 = aVar;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc7f50", new Object[]{cVar, context, jSONArray, new Boolean(z), map, bVar, aVar2});
            return;
        }
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            z2 = false;
        }
        if (z2 || bVar == null) {
            aVar2.a(new JSONArray());
            return;
        }
        String str = "";
        String a2 = com.alibaba.ability.e.a(map, com.alibaba.ability.impl.photo.b.IMG_UPLOAD_BIZ_CODE, str);
        Integer a3 = com.alibaba.ability.e.a(map, com.alibaba.ability.impl.photo.b.MAX_V_SIZE, Integer.valueOf((int) com.alibaba.ability.impl.photo.b.MAX_VIDEO_SIZE));
        Iterator<Object> it = jSONArray.iterator();
        q.b(it, "data.iterator()");
        JSONArray jSONArray3 = new JSONArray();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof JSONObject)) {
                next = null;
            }
            JSONObject jSONObject = (JSONObject) next;
            if (jSONObject == null) {
                jSONArray.remove(jSONObject);
            } else if (!z) {
                jSONArray3.add(cVar.a(jSONObject));
            } else {
                Boolean isVideo = jSONObject.getBoolean("video");
                e eVar = new e(objectRef, jSONArray, jSONArray3, aVar, jSONObject);
                q.b(isVideo, "isVideo");
                if (isVideo.booleanValue()) {
                    String a4 = com.alibaba.ability.e.a(map, com.alibaba.ability.impl.photo.b.VIDEO_UPLOAD_BIZ_CODE, str);
                    String string = jSONObject.getString(SimpleProfile.KEY_DISPLAYNAME);
                    String string2 = jSONObject.getString("coverPath");
                    String string3 = jSONObject.getString("path");
                    q.a(a3);
                    bVar.a(context, string, string2, string3, a3.intValue(), a2, a4, "", eVar);
                    aVar2 = aVar2;
                    objectRef = objectRef;
                    jSONArray3 = jSONArray3;
                    it = it;
                    str = str;
                } else {
                    bVar.a(context, jSONObject.getString("path"), (int) com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE, a2, eVar);
                    objectRef = objectRef;
                    aVar2 = aVar2;
                    jSONArray3 = jSONArray3;
                }
                cVar = this;
            }
        }
        JSONArray jSONArray4 = jSONArray3;
        a<JSONArray> aVar3 = aVar2;
        if (z) {
            return;
        }
        aVar3.a(jSONArray4);
    }

    /* loaded from: classes2.dex */
    public static final class e implements com.taobao.taopai2.export.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ JSONArray d;
        public final /* synthetic */ a e;
        public final /* synthetic */ JSONObject f;

        public void onExportProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("817c24d2", new Object[]{this, str, new Integer(i)});
            }
        }

        public e(Ref.ObjectRef objectRef, JSONArray jSONArray, JSONArray jSONArray2, a aVar, JSONObject jSONObject) {
            this.b = objectRef;
            this.c = jSONArray;
            this.d = jSONArray2;
            this.e = aVar;
            this.f = jSONObject;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (((HashMap) this.b.element).size() != this.c.size()) {
            } else {
                Iterator<Object> it = this.c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    HashMap hashMap = (HashMap) this.b.element;
                    String str = null;
                    if (!(next instanceof JSONObject)) {
                        next = null;
                    }
                    JSONObject jSONObject = (JSONObject) next;
                    if (jSONObject != null) {
                        str = jSONObject.getString("path");
                    }
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(str);
                    if (jSONObject2 != null) {
                        this.d.add(jSONObject2);
                    }
                }
                this.e.a(this.d);
            }
        }

        public void onExportSucceed(String filePath, com.uploader.export.e eVar, com.taobao.taopai.business.request.share.b bVar) {
            String b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1868cb8a", new Object[]{this, filePath, eVar, bVar});
                return;
            }
            String str = null;
            if (bVar != null) {
                b = bVar.b;
            } else {
                b = eVar != null ? eVar.b() : null;
            }
            JSONObject jSONObject = this.f;
            if (bVar != null) {
                str = bVar.a;
            }
            jSONObject.put((JSONObject) "cdnFileId", str);
            this.f.put((JSONObject) "url", b);
            if (filePath == null) {
                filePath = this.f.getString("path");
            }
            q.b(filePath, "filePath");
            ((HashMap) this.b.element).put(filePath, c.this.a(this.f));
            a();
        }

        public void onExportFail(String str, int i, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6ca07d5", new Object[]{this, str, new Integer(i), str2, str3});
                return;
            }
            String filePath = str == null ? this.f.getString("path") : str;
            q.b(filePath, "filePath");
            ((HashMap) this.b.element).put(filePath, c.this.a(this.f));
            a();
            TLog.loge(amg.MODULE_NAME, "ImageAbility", "uploadError path = " + str + " , errorCode = " + i + " , errMsg = " + str2 + " , errDetail = " + str3);
        }

        public void onExportCancel(String filePath) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33f959e", new Object[]{this, filePath});
                return;
            }
            if (filePath == null) {
                filePath = this.f.getString("path");
            }
            q.b(filePath, "filePath");
            ((HashMap) this.b.element).put(filePath, c.this.a(this.f));
            a();
        }
    }

    private final void a(JSONArray jSONArray, boolean z, Integer num, a<JSONArray> aVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7f9068", new Object[]{this, jSONArray, new Boolean(z), num, aVar});
            return;
        }
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            aVar.a(jSONArray);
        } else if (!z) {
            com.alibaba.ability.e.a(new b(aVar, jSONArray), 0L, 2, null);
        } else {
            com.alibaba.ability.e.c((Runnable) new RunnableC0058c(jSONArray, num, aVar));
        }
    }

    public final JSONObject a(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("path")) == null) {
            return new JSONObject();
        }
        Integer integer = jSONObject.getInteger("size");
        Integer integer2 = jSONObject.getInteger("height");
        Integer integer3 = jSONObject.getInteger("width");
        String string2 = jSONObject.getString("url");
        String str = "video";
        boolean a2 = q.a((Object) jSONObject.getBoolean(str), (Object) true);
        if (!a2) {
            str = "image";
        }
        String string3 = a2 ? jSONObject.getString("coverPath") : string;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (integer2 == null || integer3 == null) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(string, options);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, string);
        jSONObject3.put((JSONObject) "size", (String) Integer.valueOf(integer != null ? integer.intValue() : amg.a(string)));
        jSONObject3.put((JSONObject) "height", (String) Integer.valueOf(integer2 != null ? integer2.intValue() : options.outHeight));
        jSONObject3.put((JSONObject) "width", (String) Integer.valueOf(integer3 != null ? integer3.intValue() : options.outWidth));
        jSONObject3.put((JSONObject) "mediaType", str);
        jSONObject3.put((JSONObject) "thumbPath", string3);
        jSONObject3.put((JSONObject) "cdnUrl", string2);
        jSONObject3.put((JSONObject) "thumbBase64", (String) null);
        jSONObject3.put((JSONObject) "cdnFileId", jSONObject.getString("cdnFileId"));
        return jSONObject2;
    }
}
