package tb;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.g;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class ajl {

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25373a = JsonReader.a.a("nm", "ind", "refId", "ty", c.MSG_SOURCE_PARENT, "sw", "sh", "sc", "ks", PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", com.network.diagnosis.c.IP, fne.KEY_OP, "tm", "cl", "hd");
    private static final JsonReader.a b = JsonReader.a.a(Repeat.D, "a");
    private static final JsonReader.a c = JsonReader.a.a("ty", "nm");

    /* renamed from: tb.ajl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25374a = new int[Layer.MatteType.values().length];

        static {
            try {
                f25374a[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25374a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer a(g gVar) {
        Rect d = gVar.d();
        return new Layer(Collections.emptyList(), gVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new aik(), 0, 0, 0, 0.0f, 0.0f, d.width(), d.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer a(JsonReader jsonReader, g gVar) throws IOException {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        StringBuilder sb;
        String str2;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        String str3 = null;
        String str4 = null;
        a aVar = null;
        aiz aizVar = null;
        aik aikVar = null;
        aii aiiVar = null;
        aij aijVar = null;
        aia aiaVar = null;
        long j = 0;
        long j2 = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        boolean z = false;
        Layer.LayerType layerType = null;
        String str5 = "UNSET";
        while (jsonReader.e()) {
            switch (jsonReader.a(f25373a)) {
                case 0:
                    str5 = jsonReader.i();
                    break;
                case 1:
                    j = jsonReader.l();
                    break;
                case 2:
                    str4 = jsonReader.i();
                    break;
                case 3:
                    int l = jsonReader.l();
                    if (l >= Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = Layer.LayerType.UNKNOWN;
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[l];
                        break;
                    }
                case 4:
                    j2 = jsonReader.l();
                    break;
                case 5:
                    i = (int) (jsonReader.l() * akl.a());
                    break;
                case 6:
                    i2 = (int) (jsonReader.l() * akl.a());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.i());
                    break;
                case 8:
                    aikVar = ais.a(jsonReader, gVar);
                    break;
                case 9:
                    int l2 = jsonReader.l();
                    if (l2 >= Layer.MatteType.values().length) {
                        sb = new StringBuilder();
                        sb.append("Unsupported matte type: ");
                        sb.append(l2);
                        gVar.a(sb.toString());
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[l2];
                        int i6 = AnonymousClass1.f25374a[matteType2.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                str2 = "Unsupported matte type: Luma Inverted";
                            }
                            gVar.a(1);
                            break;
                        } else {
                            str2 = "Unsupported matte type: Luma";
                        }
                        gVar.a(str2);
                        gVar.a(1);
                    }
                case 10:
                    jsonReader.a();
                    while (jsonReader.e()) {
                        arrayList3.add(ajn.a(jsonReader, gVar));
                    }
                    gVar.a(arrayList3.size());
                    jsonReader.b();
                    break;
                case 11:
                    jsonReader.a();
                    while (jsonReader.e()) {
                        com.airbnb.lottie.model.content.c a2 = aix.a(jsonReader, gVar);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    jsonReader.b();
                    break;
                case 12:
                    jsonReader.c();
                    while (jsonReader.e()) {
                        int a3 = jsonReader.a(b);
                        if (a3 == 0) {
                            aiiVar = ait.f(jsonReader, gVar);
                        } else if (a3 != 1) {
                            jsonReader.h();
                            jsonReader.m();
                        } else {
                            jsonReader.a();
                            if (jsonReader.e()) {
                                aijVar = air.a(jsonReader, gVar);
                            }
                            while (jsonReader.e()) {
                                jsonReader.m();
                            }
                            jsonReader.b();
                        }
                    }
                    jsonReader.d();
                    break;
                case 13:
                    jsonReader.a();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.e()) {
                        jsonReader.c();
                        while (jsonReader.e()) {
                            int a4 = jsonReader.a(c);
                            if (a4 == 0) {
                                int l3 = jsonReader.l();
                                if (l3 == 29) {
                                    aVar = aiu.a(jsonReader, gVar);
                                } else if (l3 == 25) {
                                    aizVar = new aja().a(jsonReader, gVar);
                                }
                            } else if (a4 != 1) {
                                jsonReader.h();
                                jsonReader.m();
                            } else {
                                arrayList5.add(jsonReader.i());
                            }
                        }
                        jsonReader.d();
                    }
                    jsonReader.b();
                    sb = new StringBuilder();
                    sb.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sb.append(arrayList5);
                    gVar.a(sb.toString());
                    break;
                case 14:
                    f3 = (float) jsonReader.k();
                    break;
                case 15:
                    f4 = (float) jsonReader.k();
                    break;
                case 16:
                    i4 = (int) (jsonReader.l() * akl.a());
                    break;
                case 17:
                    i5 = (int) (jsonReader.l() * akl.a());
                    break;
                case 18:
                    f = (float) jsonReader.k();
                    break;
                case 19:
                    f2 = (float) jsonReader.k();
                    break;
                case 20:
                    aiaVar = ait.a(jsonReader, gVar, false);
                    break;
                case 21:
                    str3 = jsonReader.i();
                    break;
                case 22:
                    z = jsonReader.j();
                    break;
                default:
                    jsonReader.h();
                    jsonReader.m();
                    break;
            }
        }
        jsonReader.d();
        ArrayList arrayList6 = new ArrayList();
        if (f > 0.0f) {
            arrayList = arrayList3;
            str = str3;
            arrayList2 = arrayList6;
            arrayList2.add(new akm(gVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f)));
        } else {
            arrayList = arrayList3;
            str = str3;
            arrayList2 = arrayList6;
        }
        if (f2 <= 0.0f) {
            f2 = gVar.g();
        }
        float f5 = f;
        ArrayList arrayList7 = arrayList2;
        arrayList7.add(new akm(gVar, valueOf, valueOf, null, f5, Float.valueOf(f2)));
        arrayList7.add(new akm(gVar, valueOf2, valueOf2, null, f2, Float.valueOf(Float.MAX_VALUE)));
        if (str5.endsWith(".ai") || "ai".equals(str)) {
            gVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, gVar, str5, j, layerType, j2, str4, arrayList, aikVar, i, i2, i3, f3, f4, i4, i5, aiiVar, aijVar, arrayList7, matteType2, aiaVar, z, aVar, aizVar);
    }
}
