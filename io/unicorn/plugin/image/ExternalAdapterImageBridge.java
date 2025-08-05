package io.unicorn.plugin.image;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import io.unicorn.plugin.image.ExternalAdapterImageProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class ExternalAdapterImageBridge {
    private static Map<String, b> allTasks;

    /* loaded from: classes9.dex */
    private static class a implements ExternalAdapterImageProvider.Response {

        /* renamed from: a  reason: collision with root package name */
        final String f24853a;
        long b;

        static {
            kge.a(526421525);
            kge.a(330466925);
        }

        a(String str, long j) {
            this.f24853a = str;
            this.b = j;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.Response
        public void finish(ExternalAdapterImageProvider.Image image) {
            ExternalAdapterImageBridge.finish(this.f24853a, this.b, image);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final ExternalAdapterImageProvider.Request f24854a;
        final a b;

        static {
            kge.a(-2052212391);
        }

        b(ExternalAdapterImageProvider.Request request, a aVar) {
            this.f24854a = request;
            this.b = aVar;
        }
    }

    static {
        kge.a(-284785552);
        allTasks = new ConcurrentHashMap();
    }

    public static void DispatchAsyncThread(long j) {
        ExternalAdapterImageProvider b2 = io.unicorn.plugin.image.a.a().b();
        if (b2 != null) {
            b2.dispatchAsyncThread(j);
        }
    }

    private static native void asyncRequest(long j);

    public static void cancel(String str) {
        b remove = allTasks.remove(str);
        if (remove == null || remove.f24854a == null) {
            return;
        }
        remove.f24854a.cancel();
    }

    public static void dispatchAsyncRequest(long j) {
        asyncRequest(j);
    }

    public static void finish(String str, long j, ExternalAdapterImageProvider.Image image) {
        Bitmap bitmap;
        notifyExternalImageFinish(str, j, image, image != null ? image.getBitmaps() : null, image != null ? image.getBitmapCount() : 0, image != null ? image.getFrameCount() : 1, image != null ? image.getDuration() : mto.a.GEO_NOT_SUPPORT, image != null ? image.isSingleBitmapAnimated() : false, image != null ? image.isAnimatedEnd() : false, (image == null || Build.VERSION.SDK_INT < 17 || (bitmap = image.getBitmap()) == null) ? false : bitmap.isPremultiplied(), image != null ? image.getCacheType() : 0);
        allTasks.remove(str);
    }

    private static native void notifyExternalImageFinish(String str, long j, ExternalAdapterImageProvider.Image image, Bitmap[] bitmapArr, int i, int i2, double d, boolean z, boolean z2, boolean z3, int i3);

    public static boolean request(String str, String str2, int i, int i2, String str3, String str4) {
        ExternalAdapterImageProvider b2 = io.unicorn.plugin.image.a.a().b();
        if (b2 == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str3);
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (int i3 = 0; i3 < names.length(); i3++) {
                    String string = names.getString(i3);
                    hashMap.put(string, jSONObject.getString(string));
                }
            }
            JSONObject jSONObject2 = new JSONObject(str4);
            JSONArray names2 = jSONObject2.names();
            if (names2 != null) {
                for (int i4 = 0; i4 < names2.length(); i4++) {
                    String string2 = names2.getString(i4);
                    hashMap2.put(string2, jSONObject2.getString(string2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str5 = hashMap2.get("instance_id");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        a aVar = new a(str, Long.parseLong(str5));
        hashMap2.put("id", str);
        allTasks.put(str, new b(b2.request(str2, i, i2, hashMap, hashMap2, aVar), aVar));
        return true;
    }
}
