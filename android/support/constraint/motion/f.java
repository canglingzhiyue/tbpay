package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.ConstraintAttribute;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class f extends c {
    public static final int KEY_TYPE = 4;
    private String g = null;
    private int h = 0;
    private int i = -1;
    private float j = Float.NaN;
    private float k = 0.0f;
    private float l = Float.NaN;
    private int m = -1;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;
    private float x = Float.NaN;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f1080a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1080a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f1080a.append(R.styleable.KeyCycle_framePosition, 2);
            f1080a.append(R.styleable.KeyCycle_transitionEasing, 3);
            f1080a.append(R.styleable.KeyCycle_curveFit, 4);
            f1080a.append(R.styleable.KeyCycle_waveShape, 5);
            f1080a.append(R.styleable.KeyCycle_wavePeriod, 6);
            f1080a.append(R.styleable.KeyCycle_waveOffset, 7);
            f1080a.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f1080a.append(R.styleable.KeyCycle_android_alpha, 9);
            f1080a.append(R.styleable.KeyCycle_android_elevation, 10);
            f1080a.append(R.styleable.KeyCycle_android_rotation, 11);
            f1080a.append(R.styleable.KeyCycle_android_rotationX, 12);
            f1080a.append(R.styleable.KeyCycle_android_rotationY, 13);
            f1080a.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f1080a.append(R.styleable.KeyCycle_android_scaleX, 15);
            f1080a.append(R.styleable.KeyCycle_android_scaleY, 16);
            f1080a.append(R.styleable.KeyCycle_android_translationX, 17);
            f1080a.append(R.styleable.KeyCycle_android_translationY, 18);
            f1080a.append(R.styleable.KeyCycle_android_translationZ, 19);
            f1080a.append(R.styleable.KeyCycle_motionProgress, 20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1080a.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            fVar.c = typedArray.getResourceId(index, fVar.c);
                            if (fVar.c != -1) {
                                break;
                            }
                            fVar.d = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.c = typedArray.getResourceId(index, fVar.c);
                                break;
                            }
                            fVar.d = typedArray.getString(index);
                        }
                    case 2:
                        fVar.b = typedArray.getInt(index, fVar.b);
                        break;
                    case 3:
                        fVar.g = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.h = typedArray.getInteger(index, fVar.h);
                        break;
                    case 5:
                        fVar.i = typedArray.getInt(index, fVar.i);
                        break;
                    case 6:
                        fVar.j = typedArray.getFloat(index, fVar.j);
                        break;
                    case 7:
                        fVar.k = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, fVar.k) : typedArray.getFloat(index, fVar.k);
                        break;
                    case 8:
                        fVar.m = typedArray.getInt(index, fVar.m);
                        break;
                    case 9:
                        fVar.n = typedArray.getFloat(index, fVar.n);
                        break;
                    case 10:
                        fVar.o = typedArray.getDimension(index, fVar.o);
                        break;
                    case 11:
                        fVar.p = typedArray.getFloat(index, fVar.p);
                        break;
                    case 12:
                        fVar.r = typedArray.getFloat(index, fVar.r);
                        break;
                    case 13:
                        fVar.s = typedArray.getFloat(index, fVar.s);
                        break;
                    case 14:
                        fVar.q = typedArray.getFloat(index, fVar.q);
                        break;
                    case 15:
                        fVar.t = typedArray.getFloat(index, fVar.t);
                        break;
                    case 16:
                        fVar.u = typedArray.getFloat(index, fVar.u);
                        break;
                    case 17:
                        fVar.v = typedArray.getDimension(index, fVar.v);
                        break;
                    case 18:
                        fVar.w = typedArray.getDimension(index, fVar.w);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT >= 21) {
                            fVar.x = typedArray.getDimension(index, fVar.x);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        fVar.l = typedArray.getFloat(index, fVar.l);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1080a.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.e = 4;
        this.f = new HashMap<>();
    }

    @Override // android.support.constraint.motion.c
    public void a(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }

    @Override // android.support.constraint.motion.c
    public void a(HashMap<String, r> hashMap) {
        int i;
        float f;
        android.support.constraint.motion.a.a("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            r rVar = hashMap.get(str);
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals(Constants.Name.ELEVATION)) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = this.b;
                    f = this.n;
                    break;
                case 1:
                    i = this.b;
                    f = this.o;
                    break;
                case 2:
                    i = this.b;
                    f = this.p;
                    break;
                case 3:
                    i = this.b;
                    f = this.r;
                    break;
                case 4:
                    i = this.b;
                    f = this.s;
                    break;
                case 5:
                    i = this.b;
                    f = this.q;
                    break;
                case 6:
                    i = this.b;
                    f = this.t;
                    break;
                case 7:
                    i = this.b;
                    f = this.u;
                    break;
                case '\b':
                    i = this.b;
                    f = this.v;
                    break;
                case '\t':
                    i = this.b;
                    f = this.w;
                    break;
                case '\n':
                    i = this.b;
                    f = this.x;
                    break;
                case 11:
                    i = this.b;
                    f = this.k;
                    break;
                case '\f':
                    i = this.b;
                    f = this.l;
                    break;
                default:
                    String str2 = "WARNING KeyCycle UNKNOWN  " + str;
                    continue;
            }
            rVar.a(i, f);
        }
    }

    @Override // android.support.constraint.motion.c
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add(Constants.Name.ELEVATION);
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationZ");
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public float b(String str) {
        char c;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals(Constants.Name.ELEVATION)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 11;
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
                return this.n;
            case 1:
                return this.o;
            case 2:
                return this.p;
            case 3:
                return this.r;
            case 4:
                return this.s;
            case 5:
                return this.q;
            case 6:
                return this.t;
            case 7:
                return this.u;
            case '\b':
                return this.v;
            case '\t':
                return this.w;
            case '\n':
                return this.x;
            case 11:
                return this.k;
            case '\f':
                return this.l;
            default:
                String str2 = "WARNING! KeyCycle UNKNOWN  " + str;
                return Float.NaN;
        }
    }

    public void c(HashMap<String, g> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str.startsWith(NameSpaceDO.TYPE_CUSTOM)) {
                ConstraintAttribute constraintAttribute = this.f.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.a() == ConstraintAttribute.AttributeType.FLOAT_TYPE) {
                    hashMap.get(str).a(this.b, this.i, this.m, this.j, this.k, constraintAttribute.c(), constraintAttribute);
                }
            } else {
                float b = b(str);
                if (!Float.isNaN(b)) {
                    hashMap.get(str).a(this.b, this.i, this.m, this.j, this.k, b);
                }
            }
        }
    }
}
