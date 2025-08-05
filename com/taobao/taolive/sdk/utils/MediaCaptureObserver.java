package com.taobao.taolive.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class MediaCaptureObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAPTURE_THRESHOLD_TIME = 10000;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f21958a;
    private static final String[] b;
    private final Context c;
    private final String d;
    private ContentObserver e;
    private ContentObserver f;
    private ContentObserver g;
    private ContentObserver h;
    private ContentResolver i;
    private a j;
    private final Map<String, CapatureData> k = new HashMap();
    private Handler l = new Handler(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public interface a {
        void a(List<CapatureData> list);
    }

    public static /* synthetic */ a a(MediaCaptureObserver mediaCaptureObserver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2a20e06f", new Object[]{mediaCaptureObserver}) : mediaCaptureObserver.j;
    }

    public static /* synthetic */ void a(MediaCaptureObserver mediaCaptureObserver, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5712cd", new Object[]{mediaCaptureObserver, uri});
        } else {
            mediaCaptureObserver.a(uri);
        }
    }

    static {
        kge.a(1416934399);
        f21958a = new String[]{"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "screenrecorder", "screen record"};
        b = new String[]{"_data", "date_modified", "duration"};
    }

    public MediaCaptureObserver(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c4df5d", new Object[]{this, aVar});
            return;
        }
        q.b("MediaCaptureObserver", "注册截屏/录屏监听");
        this.j = aVar;
        this.i = this.c.getContentResolver();
        this.e = new b(MediaStore.Images.Media.INTERNAL_CONTENT_URI, null);
        this.f = new b(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
        this.i.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.e);
        this.i.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f);
        this.g = new b(MediaStore.Video.Media.INTERNAL_CONTENT_URI, null);
        this.h = new b(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null);
        this.i.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, this.g);
        this.i.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.h);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        q.b("MediaCaptureObserver", "注销截屏/录屏监听");
        this.i.unregisterContentObserver(this.e);
        this.i.unregisterContentObserver(this.f);
        this.i.unregisterContentObserver(this.g);
        this.i.unregisterContentObserver(this.h);
        this.i = null;
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        Cursor cursor = null;
        try {
            try {
                Cursor query = Build.VERSION.SDK_INT >= 26 ? this.i.query(uri, b, b(), null) : this.i.query(uri, b, null, null, "date_modified desc limit 1");
                if (query == null) {
                    if (query == null || query.isClosed()) {
                        return;
                    }
                    query.close();
                } else if (!query.moveToFirst()) {
                    if (query == null || query.isClosed()) {
                        return;
                    }
                    query.close();
                } else {
                    int columnIndex = query.getColumnIndex("_data");
                    int columnIndex2 = query.getColumnIndex("date_modified");
                    int columnIndex3 = query.getColumnIndex("duration");
                    String string = query.getString(columnIndex);
                    long j = query.getLong(columnIndex2) * 1000;
                    long j2 = query.getLong(columnIndex3) * 1000;
                    if (a(string)) {
                        long c = c();
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = currentTimeMillis - j;
                        q.b("MediaCaptureObserver", "捕捉到截屏/录屏：：" + string + ", 本地添加时间：" + j + ", 本地当前时间：" + currentTimeMillis + ", duration：" + j2 + ", 远程服务端时间：" + c + ", 本地时间差：" + j3);
                        if (j3 < 10000) {
                            if (j2 > 0) {
                                CapatureData capatureData = new CapatureData();
                                capatureData.type = "screenRecord";
                                capatureData.endNTP = String.valueOf(c);
                                capatureData.startNTP = String.valueOf(c - j2);
                                capatureData.liveId = this.d;
                                a(string, capatureData);
                            } else {
                                CapatureData capatureData2 = new CapatureData();
                                capatureData2.type = "screenShot";
                                capatureData2.endNTP = String.valueOf(c);
                                capatureData2.startNTP = String.valueOf(c);
                                capatureData2.liveId = this.d;
                                a(string, capatureData2);
                            }
                        }
                    }
                    if (query == null || query.isClosed()) {
                        return;
                    }
                    query.close();
                }
            } catch (Exception e) {
                q.c("MediaCaptureObserver", "查询媒体库发生错误：" + e);
                if (0 == 0 || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    private Bundle b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("1bd5186d", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_modified"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        return bundle;
    }

    private void a(String str, CapatureData capatureData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b170eef", new Object[]{this, str, capatureData});
        } else if (!this.k.containsKey(str)) {
            this.k.put(str, capatureData);
            if (this.j == null) {
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, CapatureData> entry : this.k.entrySet()) {
                arrayList.add(entry.getValue());
            }
            this.l.post(new Runnable() { // from class: com.taobao.taolive.sdk.utils.MediaCaptureObserver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MediaCaptureObserver.a(MediaCaptureObserver.this).a(arrayList);
                    }
                }
            });
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : f21958a) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        if (pmd.a().w() != null) {
            return pmd.a().w().a();
        }
        return 0L;
    }

    /* loaded from: classes8.dex */
    public class b extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Uri b;

        static {
            kge.a(-1830538864);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1222901218) {
                super.onChange(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(Uri uri, Handler handler) {
            super(handler);
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                return;
            }
            super.onChange(z);
            ac.a("MediaCaptureObserver", "onChange");
            MediaCaptureObserver.a(MediaCaptureObserver.this, this.b);
            ac.a();
        }
    }

    /* loaded from: classes8.dex */
    public class CapatureData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String endNTP;
        public String endPTS;
        public String liveId;
        public String startNTP;
        public String startPTS;
        public String type;

        static {
            kge.a(-1509030222);
            kge.a(1028243835);
        }

        public CapatureData() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CapatureData{type='" + this.type + "', startNTP='" + this.startNTP + "', endNTP='" + this.endNTP + "', liveId='" + this.liveId + "'}";
        }
    }
}
