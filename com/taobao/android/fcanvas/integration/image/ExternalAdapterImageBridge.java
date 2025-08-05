package com.taobao.android.fcanvas.integration.image;

import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class ExternalAdapterImageBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, b> allTasks;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ExternalAdapterImageProvider.b f12334a;
        public final a b;

        static {
            kge.a(447825878);
        }

        public b(ExternalAdapterImageProvider.b bVar, a aVar) {
            this.f12334a = bVar;
            this.b = aVar;
        }
    }

    private static native void notifyExternalImageFinish(String str, ExternalAdapterImageProvider.Image image, Bitmap[] bitmapArr, int i, int i2, double d, boolean z, boolean z2);

    /* loaded from: classes5.dex */
    public static class a implements ExternalAdapterImageProvider.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f12333a;

        static {
            kge.a(1389270546);
            kge.a(599687978);
        }

        public a(String str) {
            this.f12333a = str;
        }

        @Override // com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider.c
        public void a(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0bb607", new Object[]{this, image});
            } else {
                ExternalAdapterImageBridge.finish(this.f12333a, image);
            }
        }
    }

    static {
        kge.a(905518035);
        allTasks = new ConcurrentHashMap();
    }

    public static boolean request(String str, String str2, int i, int i2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac568fa2", new Object[]{str, str2, new Integer(i), new Integer(i2), str3, str4})).booleanValue();
        }
        ExternalAdapterImageProvider externalAdapterImageProvider = FCanvasJNIBridge.getExternalAdapterImageProvider();
        if (externalAdapterImageProvider == null) {
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
        a aVar = new a(str);
        ExternalAdapterImageProvider.b request = externalAdapterImageProvider.request(str2, i, i2, hashMap, hashMap2, aVar);
        if (request != null) {
            allTasks.put(str, new b(request, aVar));
        }
        return true;
    }

    public static void cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5301f18b", new Object[]{str});
            return;
        }
        b remove = allTasks.remove(str);
        if (remove == null || remove.f12334a == null) {
            return;
        }
        remove.f12334a.a();
    }

    public static void finish(String str, ExternalAdapterImageProvider.Image image) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa88030b", new Object[]{str, image});
            return;
        }
        notifyExternalImageFinish(str, image, image != null ? image.getBitmaps() : null, image != null ? image.getBitmapCount() : 0, image != null ? image.getFrameCount() : 1, image != null ? image.getDuration() : mto.a.GEO_NOT_SUPPORT, image != null ? image.isSingleBitmapAnimated() : false, (image == null || Build.VERSION.SDK_INT < 17 || (bitmap = image.getBitmap()) == null) ? false : bitmap.isPremultiplied());
        allTasks.remove(str);
    }
}
