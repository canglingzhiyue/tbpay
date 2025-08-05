package tb;

import android.graphics.PointF;
import com.airbnb.lottie.model.a;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.security.realidentity.o;
import com.taobao.android.msoa.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class ajx implements akd<j> {
    public static final ajx INSTANCE = new ajx();

    /* renamed from: a  reason: collision with root package name */
    private static final JsonReader.a f25381a = JsonReader.a.a(c.TAG, "v", q.MSGTYPE_INTERVAL, o.b);

    private ajx() {
    }

    @Override // tb.akd
    /* renamed from: a */
    public j b(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
        }
        jsonReader.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.e()) {
            int a2 = jsonReader.a(f25381a);
            if (a2 == 0) {
                z = jsonReader.j();
            } else if (a2 == 1) {
                list = aji.a(jsonReader, f);
            } else if (a2 == 2) {
                list2 = aji.a(jsonReader, f);
            } else if (a2 != 3) {
                jsonReader.h();
                jsonReader.m();
            } else {
                list3 = aji.a(jsonReader, f);
            }
        }
        jsonReader.d();
        if (jsonReader.f() == JsonReader.Token.END_ARRAY) {
            jsonReader.b();
        }
        if (list == null || list2 == null || list3 == null) {
            akh.c("Shape data was missing information.");
            return new j(new PointF(), false, Collections.emptyList());
        } else if (list.isEmpty()) {
            return new j(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new a(akk.a(list.get(i2), list3.get(i2)), akk.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new a(akk.a(list.get(i3), list3.get(i3)), akk.a(pointF3, list2.get(0)), pointF3));
            }
            return new j(pointF, z, arrayList);
        }
    }
}
