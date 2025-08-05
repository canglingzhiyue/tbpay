package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.support.constraint.motion.MotionLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.taobao.taobao.R;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.iee;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public class q {
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final String TAG = "MotionScene";
    public static final int UNSET = -1;
    float c;
    float d;
    private final MotionLayout e;
    private MotionEvent p;
    private MotionLayout.d s;
    private boolean t;

    /* renamed from: a  reason: collision with root package name */
    android.support.constraint.f f1092a = null;
    a b = null;
    private boolean f = false;
    private ArrayList<a> g = new ArrayList<>();
    private a h = null;
    private ArrayList<a> i = new ArrayList<>();
    private SparseArray<android.support.constraint.c> j = new SparseArray<>();
    private HashMap<String, Integer> k = new HashMap<>();
    private SparseIntArray l = new SparseIntArray();
    private boolean m = false;
    private int n = 400;
    private int o = 0;
    private boolean q = false;
    private boolean r = false;

    /* loaded from: classes2.dex */
    public static class a {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;

        /* renamed from: a  reason: collision with root package name */
        private int f1094a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private String f;
        private int g;
        private int h;
        private float i;
        private final q j;
        private ArrayList<h> k;
        private t l;
        private ArrayList<View$OnClickListenerC0005a> m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: android.support.constraint.motion.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class View$OnClickListenerC0005a implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;

            /* renamed from: a  reason: collision with root package name */
            int f1095a;
            int b;
            private final a c;

            public View$OnClickListenerC0005a(Context context, a aVar, XmlPullParser xmlPullParser) {
                this.f1095a = -1;
                this.b = 17;
                this.c = aVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f1095a = obtainStyledAttributes.getResourceId(index, this.f1095a);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.b = obtainStyledAttributes.getInt(index, this.b);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout) {
                int i = this.f1095a;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e(q.TAG, " (*)  could not find id " + this.f1095a);
            }

            public void a(MotionLayout motionLayout, int i, a aVar) {
                int i2 = this.f1095a;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    Log.e(q.TAG, "OnClick could not find id " + this.f1095a);
                    return;
                }
                int i3 = aVar.d;
                int i4 = aVar.c;
                if (i3 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                boolean z = true;
                boolean z2 = ((this.b & 1) != 0 && i == i3) | ((this.b & 1) != 0 && i == i3) | ((this.b & 256) != 0 && i == i3) | ((this.b & 16) != 0 && i == i4);
                if ((this.b & 4096) == 0 || i != i4) {
                    z = false;
                }
                if (!z2 && !z) {
                    return;
                }
                view.setOnClickListener(this);
            }

            boolean a(a aVar, MotionLayout motionLayout) {
                a aVar2 = this.c;
                if (aVar2 == aVar) {
                    return true;
                }
                int i = aVar2.c;
                int i2 = this.c.d;
                return i2 == -1 ? motionLayout.mCurrentState != i : motionLayout.mCurrentState == i2 || motionLayout.mCurrentState == i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.c.j.e;
                if (!motionLayout.isInteractionEnabled()) {
                    return;
                }
                if (this.c.d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.c.c);
                        return;
                    }
                    a aVar = new a(this.c.j, this.c);
                    aVar.d = currentState;
                    aVar.c = this.c.c;
                    motionLayout.setTransition(aVar);
                    motionLayout.transitionToEnd();
                    return;
                }
                a aVar2 = this.c.j.b;
                int i = this.b;
                boolean z = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                int i2 = this.b;
                boolean z2 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                if (z && z2) {
                    a aVar3 = this.c.j.b;
                    a aVar4 = this.c;
                    if (aVar3 != aVar4) {
                        motionLayout.setTransition(aVar4);
                    }
                    if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                if (!a(aVar2, motionLayout)) {
                    return;
                }
                if (z && (this.b & 1) != 0) {
                    motionLayout.setTransition(this.c);
                    motionLayout.transitionToEnd();
                } else if (z2 && (this.b & 16) != 0) {
                    motionLayout.setTransition(this.c);
                    motionLayout.transitionToStart();
                } else if (z && (this.b & 256) != 0) {
                    motionLayout.setTransition(this.c);
                    motionLayout.setProgress(1.0f);
                } else if (!z2 || (this.b & 4096) == 0) {
                } else {
                    motionLayout.setTransition(this.c);
                    motionLayout.setProgress(0.0f);
                }
            }
        }

        a(q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f1094a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.h = qVar.n;
            this.q = qVar.o;
            this.j = qVar;
            a(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        a(q qVar, a aVar) {
            this.f1094a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = qVar;
            if (aVar != null) {
                this.p = aVar.p;
                this.e = aVar.e;
                this.f = aVar.f;
                this.g = aVar.g;
                this.h = aVar.h;
                this.k = aVar.k;
                this.i = aVar.i;
                this.q = aVar.q;
            }
        }

        private void a(q qVar, Context context, TypedArray typedArray) {
            android.support.constraint.c cVar;
            SparseArray sparseArray;
            int i;
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.c = typedArray.getResourceId(index, this.c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.c))) {
                        cVar = new android.support.constraint.c();
                        cVar.a(context, this.c);
                        sparseArray = qVar.j;
                        i = this.c;
                        sparseArray.append(i, cVar);
                    }
                } else {
                    if (index == R.styleable.Transition_constraintSetStart) {
                        this.d = typedArray.getResourceId(index, this.d);
                        if ("layout".equals(context.getResources().getResourceTypeName(this.d))) {
                            cVar = new android.support.constraint.c();
                            cVar.a(context, this.d);
                            sparseArray = qVar.j;
                            i = this.d;
                            sparseArray.append(i, cVar);
                        }
                    } else if (index == R.styleable.Transition_motionInterpolator) {
                        TypedValue peekValue = typedArray.peekValue(index);
                        if (peekValue.type == 1) {
                            this.g = typedArray.getResourceId(index, -1);
                            if (this.g == -1) {
                            }
                            this.e = -2;
                        } else if (peekValue.type == 3) {
                            this.f = typedArray.getString(index);
                            if (this.f.indexOf("/") > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        } else {
                            this.e = typedArray.getInteger(index, this.e);
                        }
                    } else if (index == R.styleable.Transition_duration) {
                        this.h = typedArray.getInt(index, this.h);
                    } else if (index == R.styleable.Transition_staggered) {
                        this.i = typedArray.getFloat(index, this.i);
                    } else if (index == R.styleable.Transition_autoTransition) {
                        this.n = typedArray.getInteger(index, this.n);
                    } else if (index == R.styleable.Transition_android_id) {
                        this.f1094a = typedArray.getResourceId(index, this.f1094a);
                    } else if (index == R.styleable.Transition_transitionDisable) {
                        this.o = typedArray.getBoolean(index, this.o);
                    } else if (index == R.styleable.Transition_pathMotionArc) {
                        this.p = typedArray.getInteger(index, -1);
                    } else if (index == R.styleable.Transition_layoutDuringTransition) {
                        this.q = typedArray.getInteger(index, 0);
                    } else if (index == R.styleable.Transition_transitionFlags) {
                        this.r = typedArray.getInteger(index, 0);
                    }
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
        }

        private void a(q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            a(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.q;
        }

        public String a(Context context) {
            String resourceEntryName = this.d == -1 ? "null" : context.getResources().getResourceEntryName(this.d);
            if (this.c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.c);
        }

        public void a(int i) {
            this.h = i;
        }

        public void a(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new View$OnClickListenerC0005a(context, this, xmlPullParser));
        }

        public void a(boolean z) {
            this.o = !z;
        }

        public int b() {
            return this.n;
        }

        public boolean b(int i) {
            return (i & this.r) != 0;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.h;
        }

        public t f() {
            return this.l;
        }

        public boolean g() {
            return !this.o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Context context, MotionLayout motionLayout, int i) {
        this.e = motionLayout;
        a(context, i);
        this.j.put(R.id.motion_base, new android.support.constraint.c());
        this.k.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    private int a(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.m) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str != null && str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e(TAG, "error in parsing id");
            return i;
        }
        return i;
    }

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    if (this.m) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 793277014:
                            if (name.equals(TAG)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            a(context, xml);
                            continue;
                        case 1:
                            ArrayList<a> arrayList = this.g;
                            a aVar2 = new a(this, context, xml);
                            arrayList.add(aVar2);
                            if (this.b == null && !aVar2.b) {
                                this.b = aVar2;
                                if (this.b != null && this.b.l != null) {
                                    this.b.l.a(this.t);
                                }
                            }
                            if (aVar2.b) {
                                if (aVar2.c == -1) {
                                    this.h = aVar2;
                                } else {
                                    this.i.add(aVar2);
                                }
                                this.g.remove(aVar2);
                            }
                            aVar = aVar2;
                            continue;
                        case 2:
                            if (aVar == null) {
                                String str = " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + riy.BRACKET_END_STR;
                            }
                            aVar.l = new t(context, this.e, xml);
                            continue;
                        case 3:
                            aVar.a(context, xml);
                            continue;
                        case 4:
                            this.f1092a = new android.support.constraint.f(context, xml);
                            continue;
                        case 5:
                            b(context, xml);
                            continue;
                        case 6:
                            aVar.k.add(new h(context, xml));
                            continue;
                        default:
                            String str2 = "WARNING UNKNOWN ATTRIBUTE " + name;
                            continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.MotionScene_defaultDuration) {
                this.n = obtainStyledAttributes.getInt(index, this.n);
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.o = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        char c;
        android.support.constraint.c cVar = new android.support.constraint.c();
        cVar.a(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.m) {
                PrintStream printStream = System.out;
                printStream.println("id string = " + attributeValue);
            }
            int hashCode = attributeName.hashCode();
            if (hashCode != -1496482599) {
                if (hashCode == 3355 && attributeName.equals("id")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (attributeName.equals("deriveConstraintsFrom")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                i = a(context, attributeValue);
                this.k.put(a(attributeValue), Integer.valueOf(i));
            } else if (c == 1) {
                i2 = a(context, attributeValue);
            }
        }
        if (i != -1) {
            if (this.e.mDebugPath != 0) {
                cVar.b(true);
            }
            cVar.a(context, xmlPullParser);
            if (i2 != -1) {
                this.l.put(i, i2);
            }
            this.j.put(i, cVar);
        }
    }

    private int f(int i) {
        int a2;
        android.support.constraint.f fVar = this.f1092a;
        return (fVar == null || (a2 = fVar.a(i, -1, -1)) == -1) ? i : a2;
    }

    private boolean g(int i) {
        int i2 = this.l.get(i);
        int size = this.l.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.l.get(i2);
            size = i3;
        }
        return false;
    }

    private void h(int i) {
        int i2 = this.l.get(i);
        if (i2 > 0) {
            h(this.l.get(i));
            android.support.constraint.c cVar = this.j.get(i);
            android.support.constraint.c cVar2 = this.j.get(i2);
            if (cVar2 != null) {
                cVar.a(cVar2);
                this.l.put(i, -1);
                return;
            }
            Log.e(TAG, "ERROR! invalid deriveConstraintsFrom: @id/" + android.support.constraint.motion.a.a(this.e.getContext(), i2));
        }
    }

    private boolean n() {
        return this.s != null;
    }

    android.support.constraint.c a(int i, int i2, int i3) {
        android.support.constraint.c cVar;
        int a2;
        if (this.m) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.j.size());
        }
        android.support.constraint.f fVar = this.f1092a;
        if (fVar != null && (a2 = fVar.a(i, i2, i3)) != -1) {
            i = a2;
        }
        if (this.j.get(i) == null) {
            Log.e(TAG, "Warning could not find ConstraintSet id/" + android.support.constraint.motion.a.a(this.e.getContext(), i) + " In MotionScene");
            SparseArray<android.support.constraint.c> sparseArray = this.j;
            cVar = sparseArray.get(sparseArray.keyAt(0));
        } else {
            cVar = this.j.get(i);
        }
        return cVar;
    }

    public a a(int i, float f, float f2, MotionEvent motionEvent) {
        if (i != -1) {
            List<a> a2 = a(i);
            float f3 = 0.0f;
            a aVar = null;
            RectF rectF = new RectF();
            for (a aVar2 : a2) {
                if (!aVar2.o && aVar2.l != null) {
                    aVar2.l.a(this.t);
                    RectF a3 = aVar2.l.a(this.e, rectF);
                    if (a3 == null || motionEvent == null || a3.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF a4 = aVar2.l.a(this.e, rectF);
                        if (a4 == null || motionEvent == null || a4.contains(motionEvent.getX(), motionEvent.getY())) {
                            float f4 = aVar2.l.f(f, f2);
                            float f5 = aVar2.c == i ? -f4 : f4 * 1.1f;
                            if (f5 > f3) {
                                aVar = aVar2;
                                f3 = f5;
                            }
                        }
                    }
                }
            }
            return aVar;
        }
        return this.b;
    }

    public ArrayList<a> a() {
        return this.g;
    }

    public List<a> a(int i) {
        int f = f(i);
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d == f || next.c == f) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return;
        }
        this.b.l.e(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r7, int r8) {
        /*
            r6 = this;
            android.support.constraint.f r0 = r6.f1092a
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.a(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            android.support.constraint.f r2 = r6.f1092a
            int r2 = r2.a(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            java.util.ArrayList<android.support.constraint.motion.q$a> r3 = r6.g
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            android.support.constraint.motion.q$a r4 = (android.support.constraint.motion.q.a) r4
            int r5 = android.support.constraint.motion.q.a.a(r4)
            if (r5 != r2) goto L36
            int r5 = android.support.constraint.motion.q.a.b(r4)
            if (r5 == r0) goto L42
        L36:
            int r5 = android.support.constraint.motion.q.a.a(r4)
            if (r5 != r8) goto L1e
            int r5 = android.support.constraint.motion.q.a.b(r4)
            if (r5 != r7) goto L1e
        L42:
            r6.b = r4
            android.support.constraint.motion.q$a r7 = r6.b
            if (r7 == 0) goto L59
            android.support.constraint.motion.t r7 = android.support.constraint.motion.q.a.c(r7)
            if (r7 == 0) goto L59
            android.support.constraint.motion.q$a r7 = r6.b
            android.support.constraint.motion.t r7 = android.support.constraint.motion.q.a.c(r7)
            boolean r8 = r6.t
            r7.a(r8)
        L59:
            return
        L5a:
            android.support.constraint.motion.q$a r7 = r6.h
            java.util.ArrayList<android.support.constraint.motion.q$a> r3 = r6.i
            java.util.Iterator r3 = r3.iterator()
        L62:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            android.support.constraint.motion.q$a r4 = (android.support.constraint.motion.q.a) r4
            int r5 = android.support.constraint.motion.q.a.a(r4)
            if (r5 != r8) goto L62
            r7 = r4
            goto L62
        L76:
            android.support.constraint.motion.q$a r8 = new android.support.constraint.motion.q$a
            r8.<init>(r6, r7)
            android.support.constraint.motion.q.a.a(r8, r0)
            android.support.constraint.motion.q.a.b(r8, r2)
            if (r0 == r1) goto L88
            java.util.ArrayList<android.support.constraint.motion.q$a> r7 = r6.g
            r7.add(r8)
        L88:
            r6.b = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.q.a(int, int):void");
    }

    public void a(int i, android.support.constraint.c cVar) {
        this.j.put(i, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionLayout motionLayout) {
        for (int i = 0; i < this.j.size(); i++) {
            int keyAt = this.j.keyAt(i);
            if (g(keyAt)) {
                Log.e(TAG, "Cannot be derived from yourself");
                return;
            }
            h(keyAt);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.j.valueAt(i2).a(motionLayout);
        }
    }

    public void a(MotionLayout motionLayout, int i) {
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m.size() > 0) {
                Iterator it2 = next.m.iterator();
                while (it2.hasNext()) {
                    ((a.View$OnClickListenerC0005a) it2.next()).a(motionLayout);
                }
            }
        }
        Iterator<a> it3 = this.i.iterator();
        while (it3.hasNext()) {
            a next2 = it3.next();
            if (next2.m.size() > 0) {
                Iterator it4 = next2.m.iterator();
                while (it4.hasNext()) {
                    ((a.View$OnClickListenerC0005a) it4.next()).a(motionLayout);
                }
            }
        }
        Iterator<a> it5 = this.g.iterator();
        while (it5.hasNext()) {
            a next3 = it5.next();
            if (next3.m.size() > 0) {
                Iterator it6 = next3.m.iterator();
                while (it6.hasNext()) {
                    ((a.View$OnClickListenerC0005a) it6.next()).a(motionLayout, i, next3);
                }
            }
        }
        Iterator<a> it7 = this.i.iterator();
        while (it7.hasNext()) {
            a next4 = it7.next();
            if (next4.m.size() > 0) {
                Iterator it8 = next4.m.iterator();
                while (it8.hasNext()) {
                    ((a.View$OnClickListenerC0005a) it8.next()).a(motionLayout, i, next4);
                }
            }
        }
    }

    public void a(n nVar) {
        a aVar = this.b;
        if (aVar != null) {
            Iterator it = aVar.k.iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(nVar);
            }
            return;
        }
        a aVar2 = this.h;
        if (aVar2 == null) {
            return;
        }
        Iterator it2 = aVar2.k.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).a(nVar);
        }
    }

    public void a(a aVar) {
        this.b = aVar;
        a aVar2 = this.b;
        if (aVar2 == null || aVar2.l == null) {
            return;
        }
        this.b.l.a(this.t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.d dVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.s == null) {
            this.s = this.e.obtainVelocityTracker();
        }
        this.s.a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.c = motionEvent.getRawX();
                this.d = motionEvent.getRawY();
                this.p = motionEvent;
                this.q = false;
                if (this.b.l == null) {
                    return;
                }
                RectF b = this.b.l.b(this.e, rectF);
                if (b != null && !b.contains(this.p.getX(), this.p.getY())) {
                    this.p = null;
                    this.q = true;
                    return;
                }
                RectF a2 = this.b.l.a(this.e, rectF);
                if (a2 == null || a2.contains(this.p.getX(), this.p.getY())) {
                    this.r = false;
                } else {
                    this.r = true;
                }
                this.b.l.b(this.c, this.d);
                return;
            } else if (action == 2 && !this.q) {
                float rawY = motionEvent.getRawY() - this.d;
                float rawX = motionEvent.getRawX() - this.c;
                if ((rawX == mto.a.GEO_NOT_SUPPORT && rawY == mto.a.GEO_NOT_SUPPORT) || (motionEvent2 = this.p) == null) {
                    return;
                }
                a a3 = a(i, rawX, rawY, motionEvent2);
                if (a3 != null) {
                    motionLayout.setTransition(a3);
                    RectF a4 = this.b.l.a(this.e, rectF);
                    if (a4 != null && !a4.contains(this.p.getX(), this.p.getY())) {
                        z = true;
                    }
                    this.r = z;
                    this.b.l.a(this.c, this.d);
                }
            }
        }
        if (this.q) {
            return;
        }
        a aVar = this.b;
        if (aVar != null && aVar.l != null && !this.r) {
            this.b.l.a(motionEvent, this.s, i, this);
        }
        this.c = motionEvent.getRawX();
        this.d = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (dVar = this.s) == null) {
            return;
        }
        dVar.a();
        this.s = null;
        if (motionLayout.mCurrentState == -1) {
            return;
        }
        b(motionLayout, motionLayout.mCurrentState);
    }

    public void a(boolean z) {
        this.t = z;
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return;
        }
        this.b.l.a(this.t);
    }

    public int b(String str) {
        return this.k.get(str).intValue();
    }

    public a b(int i) {
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f1094a == i) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f, float f2) {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return;
        }
        this.b.l.d(f, f2);
    }

    public void b(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(MotionLayout motionLayout, int i) {
        if (!n() && !this.f) {
            Iterator<a> it = this.g.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.n != 0 && this.b != next) {
                    if (i == next.d && (next.n == 4 || next.n == 2)) {
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.setTransition(next);
                        if (next.n == 4) {
                            motionLayout.transitionToEnd();
                            motionLayout.setState(MotionLayout.TransitionState.SETUP);
                            motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        } else {
                            motionLayout.setProgress(1.0f);
                            motionLayout.evaluate(true);
                            motionLayout.setState(MotionLayout.TransitionState.SETUP);
                            motionLayout.setState(MotionLayout.TransitionState.MOVING);
                            motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                            motionLayout.onNewStateAttachHandlers();
                        }
                        return true;
                    } else if (i == next.c && (next.n == 3 || next.n == 1)) {
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.setTransition(next);
                        if (next.n == 3) {
                            motionLayout.transitionToStart();
                            motionLayout.setState(MotionLayout.TransitionState.SETUP);
                            motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        } else {
                            motionLayout.setProgress(0.0f);
                            motionLayout.evaluate(true);
                            motionLayout.setState(MotionLayout.TransitionState.SETUP);
                            motionLayout.setState(MotionLayout.TransitionState.MOVING);
                            motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                            motionLayout.onNewStateAttachHandlers();
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int[] b() {
        int[] iArr = new int[this.j.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.j.keyAt(i);
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c(float f, float f2) {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return 0.0f;
        }
        return this.b.l.c(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.support.constraint.c c(int i) {
        return a(i, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        a aVar = this.b;
        return (aVar == null || aVar.l == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.b;
        if (aVar == null) {
            return -1;
        }
        return aVar.d;
    }

    public void d(int i) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i);
        } else {
            this.n = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        a aVar = this.b;
        if (aVar == null) {
            return -1;
        }
        return aVar.c;
    }

    public String e(int i) {
        for (Map.Entry<String, Integer> entry : this.k.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Interpolator f() {
        switch (this.b.e) {
            case -2:
                return AnimationUtils.loadInterpolator(this.e.getContext(), this.b.g);
            case -1:
                final iee a2 = iee.a(this.b.f);
                return new Interpolator() { // from class: android.support.constraint.motion.q.1
                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f) {
                        return (float) a2.a(f);
                    }
                };
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new AnticipateInterpolator();
            case 5:
                return new BounceInterpolator();
            default:
                return null;
        }
    }

    public int g() {
        a aVar = this.b;
        return aVar != null ? aVar.h : this.n;
    }

    public int h() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.p;
        }
        return -1;
    }

    public float i() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.i;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return 0.0f;
        }
        return this.b.l.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return 0.0f;
        }
        return this.b.l.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return;
        }
        this.b.l.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        a aVar = this.b;
        if (aVar == null || aVar.l == null) {
            return false;
        }
        return this.b.l.d();
    }
}
