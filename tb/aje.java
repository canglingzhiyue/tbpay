package tb;

import android.graphics.Color;
import com.airbnb.lottie.model.content.d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tb.mto;

/* loaded from: classes2.dex */
public class aje implements akd<d> {

    /* renamed from: a  reason: collision with root package name */
    private int f25366a;

    public aje(int i) {
        this.f25366a = i;
    }

    private int a(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr[i2];
            double d4 = dArr[i];
            if (dArr[i] >= d) {
                d2 = akk.a(dArr2[i2], dArr2[i], akk.b((d - d3) / (d4 - d3), (double) mto.a.GEO_NOT_SUPPORT, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    private void a(d dVar, List<Float> list) {
        int i = this.f25366a << 2;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < dVar.c(); i3++) {
            int i4 = dVar.b()[i3];
            dVar.b()[i3] = Color.argb(a(dVar.a()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    @Override // tb.akd
    /* renamed from: a */
    public d b(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.f() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.a();
        }
        while (jsonReader.e()) {
            arrayList.add(Float.valueOf((float) jsonReader.k()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f25366a = 2;
        }
        if (z) {
            jsonReader.b();
        }
        if (this.f25366a == -1) {
            this.f25366a = arrayList.size() / 4;
        }
        int i = this.f25366a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < (this.f25366a << 2); i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        d dVar = new d(fArr, iArr);
        a(dVar, arrayList);
        return dVar;
    }
}
