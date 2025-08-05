package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class d {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a  reason: collision with root package name */
    c f1063a;
    private final ConstraintLayout d;
    int b = -1;
    int c = -1;
    private SparseArray<a> e = new SparseArray<>();
    private SparseArray<c> f = new SparseArray<>();
    private e g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1064a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        c d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f1064a = obtainStyledAttributes.getResourceId(index, this.f1064a);
                } else if (index == R.styleable.State_constraints) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        this.d = new c();
                        this.d.b(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f1065a;
        float b;
        float c;
        float d;
        int e;
        c f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1065a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f = new c();
                        this.f.b(context, this.e);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f1065a = obtainStyledAttributes.getDimension(index, this.f1065a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f, float f2) {
            if (Float.isNaN(this.f1065a) || f >= this.f1065a) {
                if (!Float.isNaN(this.b) && f2 < this.b) {
                    return false;
                }
                if (!Float.isNaN(this.c) && f > this.c) {
                    return false;
                }
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, ConstraintLayout constraintLayout, int i) {
        this.d = constraintLayout;
        a(context, i);
    }

    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            aVar = new a(context, xml);
                            this.e.put(aVar.f1064a, aVar);
                            continue;
                        } else if (c == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            String str = "unknown tag " + name;
                            continue;
                        } else {
                            a(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        c cVar = new c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                cVar.a(context, xmlPullParser);
                this.f.put(identifier, cVar);
                return;
            }
        }
    }

    public void a(int i, float f, float f2) {
        int a2;
        int i2 = this.b;
        if (i2 == i) {
            a valueAt = i == -1 ? this.e.valueAt(0) : this.e.get(i2);
            if ((this.c != -1 && valueAt.b.get(this.c).a(f, f2)) || this.c == (a2 = valueAt.a(f, f2))) {
                return;
            }
            c cVar = a2 == -1 ? this.f1063a : valueAt.b.get(a2).f;
            if (a2 != -1) {
                valueAt.b.get(a2);
            }
            if (cVar == null) {
                return;
            }
            this.c = a2;
            cVar.c(this.d);
            return;
        }
        this.b = i;
        a aVar = this.e.get(this.b);
        int a3 = aVar.a(f, f2);
        c cVar2 = a3 == -1 ? aVar.d : aVar.b.get(a3).f;
        if (a3 != -1) {
            aVar.b.get(a3);
        }
        if (cVar2 != null) {
            this.c = a3;
            cVar2.c(this.d);
            return;
        }
        String str = "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2;
    }

    public void a(e eVar) {
        this.g = eVar;
    }
}
