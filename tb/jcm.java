package tb;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.e;
import com.taobao.android.behavix.utils.b;
import com.taobao.android.litecreator.util.al;

/* loaded from: classes4.dex */
public class jcm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29453a;
    private static final String b;
    private static final String[] c;
    private ContentObserver e;
    private Handler g;
    private long d = 0;
    private Context f = null;

    public static /* synthetic */ long a(jcm jcmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef1c43f8", new Object[]{jcmVar})).longValue() : jcmVar.d;
    }

    public static /* synthetic */ long a(jcm jcmVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f46cb334", new Object[]{jcmVar, new Long(j)})).longValue();
        }
        jcmVar.d = j;
        return j;
    }

    public static /* synthetic */ boolean a(jcm jcmVar, Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f41fa25f", new Object[]{jcmVar, context, strArr})).booleanValue() : jcmVar.a(context, strArr);
    }

    public static /* synthetic */ boolean a(jcm jcmVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db81f4d2", new Object[]{jcmVar, str})).booleanValue() : jcmVar.a(str);
    }

    public static /* synthetic */ Context b(jcm jcmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3405aa7d", new Object[]{jcmVar}) : jcmVar.f;
    }

    public static /* synthetic */ boolean b(jcm jcmVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d64a7ce3", new Object[]{jcmVar, new Long(j)})).booleanValue() : jcmVar.a(j);
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : b;
    }

    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : f29453a;
    }

    static {
        kge.a(-1618425954);
        f29453a = g().toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        b = f().toString() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
        c = new String[]{"screenshot", "screen_shot", "截屏", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e != null && this.f != null) {
        } else {
            this.f = d.b();
            a(this.f);
        }
    }

    private void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.e != null) {
        } else {
            this.g = new Handler(Looper.getMainLooper());
            this.e = new ContentObserver(this.g) { // from class: tb.jcm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.database.ContentObserver
                public void onChange(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z, final Uri uri) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - jcm.a(jcm.this) < 500) {
                        return;
                    }
                    jcm.a(jcm.this, currentTimeMillis);
                    if (Build.VERSION.SDK_INT < 16) {
                        return;
                    }
                    jcm jcmVar = jcm.this;
                    if (!jcm.a(jcmVar, jcm.b(jcmVar), jcm.d())) {
                        return;
                    }
                    dsc.a(new b() { // from class: tb.jcm.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.behavix.utils.b
                        public void a() {
                            Throwable th;
                            Cursor cursor;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            Cursor cursor2 = null;
                            try {
                                if (uri != null) {
                                    String uri2 = uri.toString();
                                    if (uri2.matches(jcm.h()) || uri2.matches(jcm.i())) {
                                        cursor = context.getContentResolver().query(uri, null, null, null, "date_added DESC");
                                        if (cursor != null) {
                                            try {
                                                if (cursor.moveToFirst()) {
                                                    String string = cursor.getString(cursor.getColumnIndex("_data"));
                                                    long j = cursor.getLong(cursor.getColumnIndex("date_added"));
                                                    if (jcm.a(jcm.this, string) && jcm.b(jcm.this, j)) {
                                                        UtUtils.a("BehaviX", 19997, "screenshot", e.a(), "", "bizArgKVS=" + e.b());
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                try {
                                                    dsb.a("screenShotError", null, null, th);
                                                    if (cursor == null) {
                                                        return;
                                                    }
                                                    return;
                                                } finally {
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                            }
                                        }
                                        cursor2 = cursor;
                                    }
                                }
                                if (cursor2 == null) {
                                    return;
                                }
                                cursor2.close();
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = null;
                            }
                        }
                    });
                }
            };
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a.a("enableListenScreenShot", true)) {
        } else {
            a();
            this.f.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.e);
            this.f.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!a.a("enableListenScreenShot", true)) {
        } else {
            a();
            this.f.getContentResolver().unregisterContentObserver(this.e);
        }
    }

    private boolean a(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579fc4c3", new Object[]{this, context, strArr})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && context != null && strArr != null) {
            for (String str : strArr) {
                if (ActivityCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && (str.toLowerCase().contains("tencent") || str.toLowerCase().contains("qq") || str.toLowerCase().contains(nyk.KEY_SHARE_CONFIG_WEIXIN) || str.toLowerCase().contains("wechat"))) {
            return false;
        }
        return b(str);
    }

    private boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis - j < 0) {
            j /= 1000;
        }
        return currentTimeMillis - j <= 5;
    }

    public static String[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a605c1fa", new Object[0]);
        }
        if (d.b().getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33) {
            return new String[]{al.READ_MEDIA_IMAGES};
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : d.b().getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29;
    }

    public static Uri f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("11553124", new Object[0]) : e() ? MediaStore.Images.Media.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL) : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static Uri g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("1dee26a5", new Object[0]) : e() ? MediaStore.Images.Media.getContentUri("internal") : MediaStore.Images.Media.INTERNAL_CONTENT_URI;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : c) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
