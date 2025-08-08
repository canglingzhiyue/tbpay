package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.WindowInsets;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes7.dex */
public class kil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEFAULT_LOAD_ON_FLING = true;

    /* renamed from: a  reason: collision with root package name */
    private static String f30099a = "https://wwc.alicdn.com/avatar/getAvatar.do?userId=";
    private static Boolean b;

    public static void a(TUrlImageView tUrlImageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3106b", new Object[]{tUrlImageView, str, new Integer(i)});
        } else {
            a(tUrlImageView, str, true, i);
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : l.f(context) || l.e(context);
    }

    public static void a(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6601598", new Object[]{tUrlImageView, str});
        } else {
            a(tUrlImageView, str, (a<FailPhenixEvent>) null);
        }
    }

    public static void a(TUrlImageView tUrlImageView, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec72a47", new Object[]{tUrlImageView, str, new Boolean(z), new Integer(i)});
            return;
        }
        Drawable background = tUrlImageView.getBackground();
        if (background == null) {
            tUrlImageView.setBackgroundResource(i);
        }
        if (background == null) {
            tUrlImageView.setErrorImageResId(i);
        }
        tUrlImageView.setPlaceHoldImageResId(i);
        tUrlImageView.enableLoadOnFling(z);
        tUrlImageView.setImageUrl(str);
    }

    public static void a(TUrlImageView tUrlImageView, String str, a<FailPhenixEvent> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732100c7", new Object[]{tUrlImageView, str, aVar});
            return;
        }
        a(tUrlImageView, str, 0);
        tUrlImageView.failListener(aVar);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Globals.getApplication().getResources().getDisplayMetrics().heightPixels;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        try {
            Resources resources = Globals.getApplication().getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue() : (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_random)) {
            return -7829368;
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() > 7) {
            str = '#' + str.substring(7) + str.substring(1, 7);
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static String a(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j < 10000) {
            return String.valueOf(j);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = (int) (j / 10000);
        int i3 = (int) ((j % 10000) / 1000);
        if (((int) ((j % 1000) / 100)) >= 5) {
            i = i3 + 1;
            if (i > 9) {
                i2++;
                i = 0;
            }
        } else {
            i = i3;
        }
        stringBuffer.append(i2);
        if (i > 0) {
            stringBuffer.append(".");
            stringBuffer.append(i);
        }
        stringBuffer.append(com.taobao.android.litecreator.localization.a.a(R.string.rate_ten_thousand));
        return stringBuffer.toString();
    }

    private static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        String str = Build.CPU_ABI;
        if (str == null || str.length() == 0 || str.equals("Unknown")) {
            str = "armeabi";
        }
        return str.toLowerCase();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(StringUtils.equals(e(), "x86"));
        }
        return b.booleanValue();
    }

    public static Set<String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e82c2f8e", new Object[]{uri});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (uri == null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("title", (Object) str);
        }
        jSONObject.put("titleColor", (Object) "#ffffff");
        jSONObject.put("contentTextSize", (Object) AgooConstants.ACK_FLAG_NULL);
        jSONObject.put("text", (Object) str2);
        jSONObject.put("textColor", (Object) "#ffffff");
        return jSONObject;
    }

    public static JSONObject a(String str, String str2, Integer num, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d61c62f", new Object[]{str, str2, num, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("title", (Object) str);
            jSONObject.put("titleColor", (Object) str4);
        }
        jSONObject.put("contentTextSize", (Object) str3);
        jSONObject.put("text", (Object) str2);
        jSONObject.put("textStyle", (Object) num);
        jSONObject.put("textColor", (Object) str4);
        return jSONObject;
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray == null) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                JSONObject jSONObject2 = new JSONObject();
                boolean equals = "label".equals(jSONObject.getString("type"));
                if (!jSONObject.containsKey("newline") || !jSONObject.getBoolean("newline").booleanValue()) {
                    if (equals) {
                        jSONObject2.put("title", (Object) jSONObject.getString("text"));
                    } else {
                        jSONObject2.put("text", (Object) jSONObject.getString("text"));
                    }
                } else if (equals) {
                    jSONObject2.put("title", (Object) (jSONObject.getString("text") + "\n"));
                } else {
                    jSONObject2.put("text", (Object) (jSONObject.getString("text") + "\n"));
                }
                String string = jSONObject.getString("font");
                int i2 = 13;
                if (!StringUtils.isEmpty(string) && StringUtils.isDigitsOnly(string)) {
                    try {
                        i2 = Integer.valueOf(string).intValue() / 2;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                jSONObject2.put("contentTextSize", (Object) Integer.valueOf(i2));
                jSONObject2.put("textColor", (Object) (!StringUtils.isEmpty(jSONObject.getString("color")) ? jSONObject.getString("color") : "#ffffff"));
                jSONArray2.add(jSONObject2);
            }
        }
        return jSONArray2;
    }

    public static RoundRectShape a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundRectShape) ipChange.ipc$dispatch("8931467a", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        float[] fArr = new float[8];
        if (i > 0) {
            float f = i;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (i2 > 0) {
            float f2 = i2;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (i3 > 0) {
            float f3 = i3;
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (i4 > 0) {
            float f4 = i4;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        return new RoundRectShape(fArr, null, null);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e4009c44", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        if (bitmap == null) {
            return null;
        }
        float f = i;
        float f2 = i2;
        Matrix matrix = new Matrix();
        matrix.setScale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF();
        if (i3 >= 0) {
            float f3 = i3;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, (i / 2) + i3, (i2 / 2) + i3), f3, f3, paint);
        }
        if (i4 >= 0) {
            float f4 = i4;
            canvas.drawRoundRect(new RectF((i / 2) - i4, 0.0f, f, (i2 / 2) + i4), f4, f4, paint);
        }
        if (i6 >= 0) {
            float f5 = i6;
            canvas.drawRoundRect(new RectF(0.0f, (i2 / 2) - i6, (i / 2) + i6, f2), f5, f5, paint);
        }
        if (i5 >= 0) {
            float f6 = i5;
            canvas.drawRoundRect(new RectF((i / 2) - i5, (i2 / 2) - i5, f, f2), f6, f6, paint);
        }
        canvas.drawRect(rectF, paint);
        return createBitmap;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            if (a(keySet)) {
                return;
            }
            for (String str : keySet) {
                jSONObject2.put(str, jSONObject.get(str));
            }
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1725575", new Object[]{context, windowInsets})).booleanValue() : gfe.a(context, windowInsets);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : gfe.a(context);
    }

    public static int b(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17065e65", new Object[]{context, windowInsets})).intValue() : gfe.c(context, windowInsets);
    }

    public static String a(Context context, String str) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        InputStream inputStream2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            inputStream = AssetsDelegate.proxy_open(context.getAssets(), str);
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } catch (IOException e) {
                            inputStream2 = inputStream;
                            e = e;
                            bufferedReader = bufferedReader2;
                            try {
                                e.printStackTrace();
                                a(bufferedReader);
                                a(inputStreamReader);
                                a(inputStream2);
                                return sb.toString();
                            } catch (Throwable th) {
                                th = th;
                                inputStream = inputStream2;
                                a(bufferedReader);
                                a(inputStreamReader);
                                a(inputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            a(bufferedReader);
                            a(inputStreamReader);
                            a(inputStream);
                            throw th;
                        }
                    }
                    a(bufferedReader2);
                    a(inputStreamReader);
                    a(inputStream);
                } catch (IOException e2) {
                    inputStream2 = inputStream;
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e3) {
                inputStream2 = inputStream;
                e = e3;
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStreamReader = null;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            inputStreamReader = null;
        }
        return sb.toString();
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return l.d(context);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : l.b(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : d(context) || c(context) || h.a().f(context);
    }
}
