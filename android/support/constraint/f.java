package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class f {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a  reason: collision with root package name */
    int f1066a = -1;
    int b = -1;
    int c = -1;
    private SparseArray<a> d = new SparseArray<>();
    private SparseArray<c> e = new SparseArray<>();
    private e f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1067a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        boolean d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            this.d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f1067a = obtainStyledAttributes.getResourceId(index, this.f1067a);
                } else if (index == R.styleable.State_constraints) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        this.d = true;
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
        float f1068a;
        float b;
        float c;
        float d;
        int e;
        boolean f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1068a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            this.f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f1068a = obtainStyledAttributes.getDimension(index, this.f1068a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f, float f2) {
            if (Float.isNaN(this.f1068a) || f >= this.f1068a) {
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

    public f(Context context, XmlPullParser xmlPullParser) {
        a(context, xmlPullParser);
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.StateSet_defaultState) {
                this.f1066a = obtainStyledAttributes.getResourceId(index, this.f1066a);
            }
        }
        obtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
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
                            aVar = new a(context, xmlPullParser);
                            this.d.put(aVar.f1067a, aVar);
                        } else if (c != 3) {
                            String str = "unknown tag " + name;
                        } else {
                            b bVar = new b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public int a(int i, int i2, float f, float f2) {
        a aVar = this.d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (aVar.c == i) {
                return i;
            }
            Iterator<b> it = aVar.b.iterator();
            while (it.hasNext()) {
                if (i == it.next().e) {
                    return i;
                }
            }
            return aVar.c;
        }
        b bVar = null;
        Iterator<b> it2 = aVar.b.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.a(f, f2)) {
                if (i == next.e) {
                    return i;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.e : aVar.c;
    }

    public int a(int i, int i2, int i3) {
        return b(-1, i, i2, i3);
    }

    public int b(int i, int i2, float f, float f2) {
        b bVar;
        int a2;
        if (i == i2) {
            a valueAt = i2 == -1 ? this.d.valueAt(0) : this.d.get(this.b);
            if (valueAt == null) {
                return -1;
            }
            if ((this.c != -1 && valueAt.b.get(i).a(f, f2)) || i == (a2 = valueAt.a(f, f2))) {
                return i;
            }
            if (a2 == -1) {
                return valueAt.c;
            }
            bVar = valueAt.b.get(a2);
        } else {
            a aVar = this.d.get(i2);
            if (aVar == null) {
                return -1;
            }
            int a3 = aVar.a(f, f2);
            if (a3 == -1) {
                return aVar.c;
            }
            bVar = aVar.b.get(a3);
        }
        return bVar.e;
    }
}
