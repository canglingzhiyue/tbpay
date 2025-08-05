package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.search.common.util.k;
import com.taobao.tao.flexbox.layoutmanager.component.DrawerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.filter.Utils;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class oec {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG = "guangguang";

    /* renamed from: a  reason: collision with root package name */
    private static int f31969a;
    private static int[] b;
    private static Boolean c;
    private static Handler d;
    private static String e;

    /* loaded from: classes8.dex */
    public interface a<T> {
        void a(Class<T> cls);
    }

    static {
        kge.a(-1396249365);
        f31969a = 0;
        b = new int[]{R.id.layout_manager_viewpager_id, R.id.layout_manager_viewpager_id0, R.id.layout_manager_viewpager_id1, R.id.layout_manager_viewpager_id2, R.id.layout_manager_viewpager_id3, R.id.layout_manager_viewpager_id4, R.id.layout_manager_viewpager_id5};
        c = null;
    }

    public static String a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        byte[] b2 = b(str, context);
        if (b2 == null) {
            return "";
        }
        try {
            return new String(b2, 0, b2.length, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            ogg.a("failed to loadFileContent path: " + str + " " + e2.getMessage());
            return "";
        }
    }

    public static byte[] a(InputStream inputStream) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        byte[] bArr = null;
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
            } catch (IOException e2) {
                ogg.b("loadInputStream: " + e2.getMessage());
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    sb.append("loadInputStream: ");
                    sb.append(e.getMessage());
                    ogg.b(sb.toString());
                    return bArr;
                }
            }
            try {
                inputStream.close();
            } catch (IOException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("loadInputStream: ");
                sb.append(e.getMessage());
                ogg.b(sb.toString());
                return bArr;
            }
            return bArr;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                ogg.b("loadInputStream: " + e5.getMessage());
            }
            throw th;
        }
    }

    public static byte[] b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("25a119c8", new Object[]{str, context});
        }
        try {
            return a(AssetsDelegate.proxy_open(context.getAssets(), str));
        } catch (IOException e2) {
            ogg.b("loadFileContent: " + e2.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d42e25", new Object[]{context, str, file})).booleanValue();
        }
        InputStream d2 = d(str, context);
        if (d2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = d2.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        d2.close();
                        return true;
                    }
                }
            } catch (FileNotFoundException e2) {
                ogg.b("moveAssetToFile， path" + str + " " + e2.getMessage());
            } catch (IOException e3) {
                ogg.b("moveAssetToFile， path" + str + " " + e3.getMessage());
            }
        }
        return false;
    }

    public static boolean c(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a7d3f98", new Object[]{str, context})).booleanValue();
        }
        try {
            return AssetsDelegate.proxy_open(context.getAssets(), str) != null;
        } catch (IOException e2) {
            ogg.b("loadFileContent: " + e2.getMessage());
            return false;
        }
    }

    public static InputStream d(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("e9e0e4f6", new Object[]{str, context});
        }
        try {
            return AssetsDelegate.proxy_open(context.getAssets(), str);
        } catch (IOException e2) {
            ogg.b("loadFileContent: " + e2.getMessage());
            return null;
        }
    }

    public static void a(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbe2fe9", new Object[]{file, str});
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                FileWriter fileWriter2 = new FileWriter(file, false);
                try {
                    fileWriter2.write(str);
                    fileWriter2.flush();
                    try {
                        fileWriter2.close();
                    } catch (IOException e2) {
                        ogg.b("writeStringToFile" + e2.getMessage());
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileWriter = fileWriter2;
                    ogg.b(e.getMessage());
                    if (fileWriter == null) {
                        return;
                    }
                    try {
                        fileWriter.close();
                    } catch (IOException e4) {
                        ogg.b("writeStringToFile" + e4.getMessage());
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e5) {
                            ogg.b("writeStringToFile" + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    public static String a(Context context, String str, boolean z) {
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d00b83f6", new Object[]{context, str, new Boolean(z)});
        }
        if (c(str.substring(2), context)) {
            return a(str.substring(2));
        }
        if (z && (c2 = ohd.c(context, str)) != 0) {
            return a(c2);
        }
        return null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT < 21;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : Build.VERSION.SDK_INT < 16;
    }

    private static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        String str = Build.CPU_ABI;
        if (str == null || str.length() == 0 || str.equals("Unknown")) {
            str = "armeabi";
        }
        return str.toLowerCase();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (c == null) {
            String i = i();
            if (TextUtils.equals(i, "x86") || TextUtils.equals(i, "x86_64")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        return "res://" + i;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "asset://" + str;
    }

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str}) : obj != null ? obj.toString() : str;
    }

    public static String[] a(Object obj, String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("4b29776a", new Object[]{obj, strArr}) : obj instanceof String ? new String[]{(String) obj} : obj instanceof String[] ? (String[]) obj : strArr;
    }

    public static int a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7da932", new Object[]{obj, new Integer(i)})).intValue();
        }
        try {
            return a(obj);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int a(Object obj) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new IllegalArgumentException("" + obj + " is invalid Integer");
    }

    public static long a(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7dacf4", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static float b(Object obj, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a7f380e", new Object[]{obj, new Integer(i)})).floatValue() : a(obj, i);
    }

    public static float a(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7d9dec", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static double a(Object obj, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7d9668", new Object[]{obj, new Double(d2)})).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (Exception unused) {
            }
        }
        return d2;
    }

    public static Map a(Object obj, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e910a536", new Object[]{obj, map});
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof String) {
            try {
                return JSONObject.parseObject((String) obj);
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7de914", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Float.parseFloat((String) obj) > 0.0f;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).floatValue() > 0.0f;
        } else if (obj instanceof List) {
            return ((List) obj).size() > 0;
        } else if (obj instanceof Map) {
            return ((Map) obj).size() > 0;
        }
        return z;
    }

    public static JSONArray a(Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe95d152", new Object[]{obj, jSONArray});
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            try {
                return JSONArray.parseArray((String) obj);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    public static List a(Object obj, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("22094a72", new Object[]{obj, list});
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj instanceof String) {
            try {
                return JSONArray.parseArray((String) obj);
            } catch (Exception unused) {
            }
        }
        return list;
    }

    public static String b(Object obj) {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            valueOf = (String) obj;
        } else {
            valueOf = String.valueOf(obj);
        }
        if (!TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
            return valueOf;
        }
        return null;
    }

    public static Rect a(Object obj, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("498ae75e", new Object[]{obj, rect});
        }
        if (obj instanceof String) {
            try {
                String[] split = ((String) obj).split(",");
                return new Rect(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            } catch (Exception unused) {
            }
        }
        return rect;
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (!"null".equalsIgnoreCase(valueOf)) {
            return valueOf;
        }
        return null;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : Looper.getMainLooper() == Looper.myLooper();
    }

    public static Map a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bc57ffd", new Object[]{map, map2});
        }
        if (map2 == null) {
            return map;
        }
        if (map == null) {
            return map2;
        }
        map.putAll(map2);
        return map;
    }

    public static void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70603e2", new Object[]{str, str2, aVar});
            return;
        }
        Class<?> cls = null;
        try {
            try {
                cls = Class.forName(str2, true, oec.class.getClassLoader());
            } catch (ClassNotFoundException e2) {
                ogg.b("loadClass not found:" + e2.getMessage());
            }
            if (aVar == null) {
                return;
            }
            aVar.a(cls);
        } catch (Exception e3) {
            ogg.b(e3.getMessage());
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        if (d == null) {
            d = new Handler(Looper.getMainLooper());
        }
        d.post(runnable);
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
            return;
        }
        if (d == null) {
            d = new Handler(Looper.getMainLooper());
        }
        d.postDelayed(runnable, j);
    }

    public static void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{runnable, new Boolean(z)});
        } else if (z && f()) {
            runnable.run();
        } else {
            if (d == null) {
                d = new Handler(Looper.getMainLooper());
            }
            d.post(runnable);
        }
    }

    public static String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{str});
        }
        String[] strArr = new String[2];
        String[] a2 = a(str, (char) riy.CONDITION_IF_MIDDLE);
        if (a2.length > 1) {
            strArr[0] = a2[0];
            strArr[1] = a2[1];
        } else {
            strArr[0] = null;
            strArr[1] = str;
        }
        return strArr;
    }

    public static String[] a(String str, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("75bcfd9a", new Object[]{str, new Character(c2)});
        }
        List<String> b2 = b(str, c2);
        return (String[]) b2.toArray(new String[b2.size()]);
    }

    public static List<String> b(String str, char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b037eb9d", new Object[]{str, new Character(c2)});
        }
        ArrayList arrayList = new ArrayList(5);
        boolean z = true;
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c2) {
                if (i2 == 0) {
                    arrayList.add("");
                }
                if (!z) {
                    arrayList.add(str.substring(i, i2));
                    z = true;
                }
            } else {
                if (z) {
                    i = i2;
                }
                if (i2 == str.length() - 1) {
                    arrayList.add(str.substring(i, i2 + 1));
                }
                z = false;
            }
        }
        return arrayList;
    }

    public static boolean a(Context context, WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1725575", new Object[]{context, windowInsets})).booleanValue() : gfe.a(context, windowInsets);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str2 == null) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i = 0; i < length; i++) {
            if (Integer.parseInt(split2[i]) < Integer.parseInt(split[i])) {
                return true;
            }
            if (Integer.parseInt(split2[i]) > Integer.parseInt(split[i])) {
                return false;
            }
        }
        return split.length >= split2.length;
    }

    public static String a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (e == null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                str = "";
            }
            e = str;
        }
        return e;
    }

    public static Map d(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7dcf57fc", new Object[]{obj}) : JSONObject.parseObject(JSON.toJSONString(obj));
    }

    public static Map a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        return hashMap;
    }

    public static int a(List list, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeae7c72", new Object[]{list, obj, new Boolean(z)})).intValue();
        }
        if (list == null) {
            return -1;
        }
        if (z) {
            for (Object obj2 : list) {
                if (obj == obj2) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ArrayList arrayList = new ArrayList(1);
        int i2 = 0;
        for (Object obj3 : list) {
            if (obj == null) {
                if (obj3 == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else if (obj.equals(obj3)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        int size = arrayList.size();
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return ((Integer) arrayList.get(0)).intValue();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (list.get(intValue) == obj) {
                return intValue;
            }
        }
        return ((Integer) arrayList.get(0)).intValue();
    }

    public static Object b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e0f3903", new Object[]{obj, str});
        }
        List<String> b2 = b(str, '.');
        int size = b2.size();
        Object obj2 = obj;
        for (int i = 0; i < size && obj2 != null; i++) {
            String str2 = b2.get(i);
            if (str2.contains(riy.ARRAY_START_STR)) {
                List<String> b3 = b(str2, '[');
                if (obj2 instanceof Map) {
                    List list = (List) ((Map) obj2).get(str2.substring(0, str2.indexOf(91)));
                    Object obj3 = obj2;
                    for (int i2 = 1; i2 < b3.size(); i2++) {
                        int parseInt = Integer.parseInt(b3.get(i2).substring(0, b3.get(i2).length() - 1));
                        if (list == null || list.isEmpty() || parseInt >= list.size()) {
                            return null;
                        }
                        obj3 = list.get(parseInt);
                    }
                    obj2 = obj3;
                }
                obj2 = null;
            } else {
                if (obj2 instanceof Map) {
                    obj2 = ((Map) obj2).get(str2);
                }
                obj2 = null;
            }
        }
        return obj2;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : context instanceof Activity;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        try {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        } catch (Exception e2) {
            ogg.b(e2.getMessage());
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            View currentFocus = ((Activity) context).getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            } else {
                inputMethodManager.hideSoftInputFromWindow(((Activity) context).getWindow().getDecorView().getWindowToken(), 2);
            }
        } catch (Exception e2) {
            ogg.b(e2.getMessage());
        }
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        int[] iArr = b;
        int i = f31969a;
        int i2 = iArr[i];
        int i3 = i + 1;
        f31969a = i3;
        f31969a = i3 % iArr.length;
        return i2;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : str.replaceAll("^((?i)https:)?//", k.HTTP_PREFIX);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int e2 = e(str);
        if (e2 != -1) {
            return str.substring(0, e2);
        }
        return str.indexOf("#") > 0 ? str.substring(0, str.indexOf("#")) : str;
    }

    public static String b(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (indexOf = str.indexOf("?")) != -1 && indexOf < str.length() - 1) {
            for (String str3 : str.substring(indexOf + 1).split("&")) {
                String[] split = str3.split("=");
                if (split.length == 2 && str2.equals(split[0])) {
                    return split[1];
                }
            }
        }
        return null;
    }

    public static int e(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
        }
        int length = str.length();
        while (true) {
            indexOf = str.indexOf("?", i);
            if (indexOf == -1) {
                return -1;
            }
            int i2 = indexOf + 1;
            if (i2 >= length || str.charAt(i2) != '?') {
                break;
            }
            i = indexOf + 2;
        }
        return indexOf;
    }

    public static Map f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2185406c", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dc76df", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String obj = value != null ? value.toString() : null;
            if (obj != null) {
                hashMap.put(entry.getKey().toString(), obj);
            }
        }
        return hashMap;
    }

    public static boolean a(List list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a6e977d", new Object[]{list, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (list.size() <= 1 || i < 0 || i2 < 0 || i == i2 || list.size() <= i || list.size() <= i2) {
            return false;
        }
        list.add(i2, list.remove(i));
        return true;
    }

    public static boolean a(ab.h hVar) {
        String str;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("971f5baf", new Object[]{hVar})).booleanValue() : (hVar == null || (str = hVar.b) == null || (!str.contains("guangguang") && !h.a(str))) ? false : true;
    }

    public static boolean a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691da4b3", new Object[]{abVar})).booleanValue();
        }
        if (abVar != null && abVar.A() != null) {
            return a(abVar.A().c());
        }
        return false;
    }

    public static Rect b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("cd2576d2", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d05012c", new Object[]{view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return view.getLocalVisibleRect(new Rect());
    }

    public static Rect g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dc189b01", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new Rect();
        }
        String[] split = str.split(",");
        if (split == null || split.length != 4) {
            return new Rect();
        }
        return new Rect(a((Object) split[0], 0), a((Object) split[1], 0), a((Object) split[2], 0), a((Object) split[3], 0));
    }

    public static HashMap a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("46f1a182", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null) {
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static Uri b(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("7c4bf3c9", new Object[]{uri, str, str2});
        }
        if (uri == null) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            ogg.a("addUriParameter failed, already has key :" + str + "  value:" + queryParameter);
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter(str, str2);
        Uri build = buildUpon.build();
        ogg.a("addUriParameter success, key :" + str + "  value:" + str2);
        return build;
    }

    public static Uri a(Uri uri, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("61dafaaa", new Object[]{uri, str, str2});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str3 : queryParameterNames) {
            clearQuery.appendQueryParameter(str3, str3.equals(str) ? str2 : uri.getQueryParameter(str3));
        }
        return clearQuery.build();
    }

    public static Uri a(Uri uri, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b31278fd", new Object[]{uri, map});
        }
        if (oeb.cD()) {
            return b(uri, map);
        }
        if (map == null || map.isEmpty()) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                hashMap.put(key.toString(), Uri.decode(value.toString()));
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return clearQuery.build();
    }

    public static Uri b(Uri uri, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("404d2a7e", new Object[]{uri, map});
        }
        ogg.a("mergeUriEncodedParameter ");
        if (uri == null || map == null || map.isEmpty()) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(Uri.encode(str), Uri.encode(uri.getQueryParameter(str)));
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                hashMap.put(key.toString(), value.toString());
            }
        }
        String str2 = "";
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (!Utils.isEmpty(key2) && !Utils.isEmpty(value2)) {
                if (Utils.isNotEmpty(str2)) {
                    str2 = str2 + "&";
                }
                str2 = str2 + key2.toString() + "=" + value2.toString();
            }
        }
        return uri.buildUpon().encodedQuery(str2).build();
    }

    public static Uri a(Uri uri, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("f7bd9e07", new Object[]{uri, list});
        }
        if (ogv.a(list)) {
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : queryParameterNames) {
            if (!list.contains(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return clearQuery.build();
    }

    public static Uri a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e52e6d20", new Object[]{uri, str});
        }
        if (TextUtils.isEmpty(str) || uri == null) {
            return uri;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (!TextUtils.isEmpty(encodedQuery)) {
            str = str + "?" + encodedQuery;
        }
        return Uri.parse(str);
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{str})).booleanValue() : i(str);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{str})).booleanValue() : TextUtils.isEmpty(str) || "''".equals(str);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{str}) : str != null ? str.replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replace("&apos;", "'").replace("&quot;", "\"").replace("&nbsp;", " ").replace("<br/>", "\n") : str;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("711ebb64", new Object[]{str}) : str != null ? str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;") : str;
    }

    public static void a(aa aaVar, boolean z, String str, String str2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f906bc", new Object[]{aaVar, new Boolean(z), str, str2, drawable});
        } else if (z) {
            if (TextUtils.isEmpty(a(aaVar.e("onloadsuccess"), (String) null))) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("finalUrl", str2);
            if (drawable != null) {
                hashMap.put("width", Integer.valueOf(drawable.getIntrinsicWidth()));
                hashMap.put("height", Integer.valueOf(drawable.getIntrinsicHeight()));
            }
            aaVar.k().b(0, aaVar, "onloadsuccess", null, hashMap, null);
        } else if (TextUtils.isEmpty(a(aaVar.e("onloadfail"), (String) null))) {
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url", str);
            hashMap2.put("finalUrl", str2);
            aaVar.k().b(0, aaVar, "onloadfail", null, hashMap2, null);
        }
    }

    public static Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{map});
        }
        if (map != null) {
            map.remove(null);
            Set<Map.Entry> entrySet = map.entrySet();
            if (entrySet != null) {
                for (Map.Entry entry : entrySet) {
                    if (entry.getValue() instanceof Map) {
                        c((Map) entry.getValue());
                    }
                }
            }
        }
        return map;
    }

    public static boolean a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691d3054", new Object[]{aaVar})).booleanValue();
        }
        while (aaVar != null) {
            aa J = aaVar.J();
            if (J == null) {
                break;
            } else if ((J.x() instanceof ViewPager) && J.b(((ViewPager) J.x()).getCurrentItem()) != aaVar) {
                return false;
            } else {
                aaVar = J;
            }
        }
        return true;
    }

    public static boolean d(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8906900b", new Object[]{view})).booleanValue();
        }
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                int currentItem = viewPager.getCurrentItem();
                PagerAdapter adapter = viewPager.getAdapter();
                FrameLayout a2 = adapter instanceof TabBarControllerComponent.a ? ((TabBarControllerComponent.a) adapter).a((ViewGroup) parent, currentItem) : null;
                if (adapter instanceof DrawerComponent.a) {
                    a2 = ((DrawerComponent.a) adapter).a((ViewGroup) parent, currentItem);
                } else {
                    try {
                        Object instantiateItem = adapter.instantiateItem((ViewGroup) parent, currentItem);
                        if (instantiateItem instanceof View) {
                            view2 = (View) instantiateItem;
                        } else if (instantiateItem instanceof Fragment) {
                            view2 = ((Fragment) instantiateItem).getView();
                        }
                        a2 = view2;
                    } catch (Exception e2) {
                        ogg.b("TabbarController isPrimaryItemAppear:" + e2.getMessage());
                    }
                }
                if (a2 != view) {
                    return false;
                }
            }
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    public static Activity g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c491a4ce", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return g(((ContextWrapper) context).getBaseContext());
    }

    public static boolean a(List list, aa.c<Object> cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a2f426", new Object[]{list, cVar})).booleanValue();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.a(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : !k();
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        return TextUtils.equals(acg.a().getString(acg.a().getResources().getIdentifier("ttid", "string", "com.taobao.taobao")), "212200");
    }

    public static String d(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && runningTasks.get(0) != null && runningTasks.get(0).topActivity != null) {
                    return runningTasks.get(0).topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean h(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && runningTasks.get(0) != null && runningTasks.get(0).topActivity != null) {
                    return TextUtils.equals(runningTasks.get(0).topActivity.getPackageName(), context.getPackageName());
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
