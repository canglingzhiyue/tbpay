package tb;

import android.graphics.Rect;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import com.airbnb.lottie.g;
import com.airbnb.lottie.i;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVStartParams;
import com.network.diagnosis.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ajm {
    private static final JsonReader.a b = JsonReader.a.a("w", "h", c.IP, fne.KEY_OP, "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: a  reason: collision with root package name */
    static JsonReader.a f25375a = JsonReader.a.a("id", "layers", "w", "h", "p", RVStartParams.KEY_URL_SHORT);
    private static final JsonReader.a c = JsonReader.a.a("list");
    private static final JsonReader.a d = JsonReader.a.a("cm", "tm", "dr");

    public static g a(JsonReader jsonReader) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float a2 = akl.a();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat = new SparseArrayCompat<>();
        g gVar = new g();
        jsonReader.c();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.e()) {
            switch (jsonReader2.a(b)) {
                case 0:
                    i = jsonReader.l();
                    continue;
                    jsonReader2 = jsonReader;
                case 1:
                    i2 = jsonReader.l();
                    continue;
                    jsonReader2 = jsonReader;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) jsonReader.k();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.k()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.k();
                    break;
                case 5:
                    String[] split = jsonReader.i().split("\\.");
                    if (!akl.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    a(jsonReader2, gVar, arrayList2, longSparseArray);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    a(jsonReader2, gVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    a(jsonReader2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    a(jsonReader2, gVar, sparseArrayCompat);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    a(jsonReader2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.h();
                    jsonReader.m();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        gVar.a(new Rect(0, 0, (int) (i * a2), (int) (i2 * a2)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return gVar;
    }

    private static void a(JsonReader jsonReader, g gVar, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat) throws IOException {
        jsonReader.a();
        while (jsonReader.e()) {
            com.airbnb.lottie.model.c a2 = ajc.a(jsonReader, gVar);
            sparseArrayCompat.put(a2.hashCode(), a2);
        }
        jsonReader.b();
    }

    private static void a(JsonReader jsonReader, g gVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.a();
        int i = 0;
        while (jsonReader.e()) {
            Layer a2 = ajl.a(jsonReader, gVar);
            if (a2.k() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(a2);
            longSparseArray.put(a2.e(), a2);
            if (i > 4) {
                akh.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.b();
    }

    private static void a(JsonReader jsonReader, g gVar, Map<String, List<Layer>> map, Map<String, i> map2) throws IOException {
        jsonReader.a();
        while (jsonReader.e()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.e()) {
                int a2 = jsonReader.a(f25375a);
                if (a2 == 0) {
                    str = jsonReader.i();
                } else if (a2 == 1) {
                    jsonReader.a();
                    while (jsonReader.e()) {
                        Layer a3 = ajl.a(jsonReader, gVar);
                        longSparseArray.put(a3.e(), a3);
                        arrayList.add(a3);
                    }
                    jsonReader.b();
                } else if (a2 == 2) {
                    i = jsonReader.l();
                } else if (a2 == 3) {
                    i2 = jsonReader.l();
                } else if (a2 == 4) {
                    str2 = jsonReader.i();
                } else if (a2 != 5) {
                    jsonReader.h();
                    jsonReader.m();
                } else {
                    str3 = jsonReader.i();
                }
            }
            jsonReader.d();
            if (str2 != null) {
                i iVar = new i(i, i2, str, str2, str3);
                map2.put(iVar.c(), iVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.b();
    }

    private static void a(JsonReader jsonReader, List<com.airbnb.lottie.model.g> list) throws IOException {
        jsonReader.a();
        while (jsonReader.e()) {
            String str = null;
            jsonReader.c();
            float f = 0.0f;
            float f2 = 0.0f;
            while (jsonReader.e()) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = jsonReader.i();
                } else if (a2 == 1) {
                    f = (float) jsonReader.k();
                } else if (a2 != 2) {
                    jsonReader.h();
                    jsonReader.m();
                } else {
                    f2 = (float) jsonReader.k();
                }
            }
            jsonReader.d();
            list.add(new com.airbnb.lottie.model.g(str, f, f2));
        }
        jsonReader.b();
    }

    private static void a(JsonReader jsonReader, Map<String, b> map) throws IOException {
        jsonReader.c();
        while (jsonReader.e()) {
            if (jsonReader.a(c) != 0) {
                jsonReader.h();
                jsonReader.m();
            } else {
                jsonReader.a();
                while (jsonReader.e()) {
                    b a2 = ajd.a(jsonReader);
                    map.put(a2.b(), a2);
                }
                jsonReader.b();
            }
        }
        jsonReader.d();
    }
}
