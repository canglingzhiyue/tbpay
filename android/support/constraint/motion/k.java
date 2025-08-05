package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class k extends c {
    public static final int KEY_TYPE = 3;
    private String g;
    private int h = -1;
    private float i = Float.NaN;
    private float j = Float.NaN;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private int u = 0;
    private float v = Float.NaN;
    private float w = 0.0f;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f1087a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1087a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            f1087a.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            f1087a.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            f1087a.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            f1087a.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            f1087a.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            f1087a.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f1087a.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            f1087a.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            f1087a.append(R.styleable.KeyTimeCycle_framePosition, 12);
            f1087a.append(R.styleable.KeyTimeCycle_curveFit, 13);
            f1087a.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            f1087a.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            f1087a.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            f1087a.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            f1087a.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            f1087a.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            f1087a.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            f1087a.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void a(k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1087a.get(index)) {
                    case 1:
                        kVar.i = typedArray.getFloat(index, kVar.i);
                        break;
                    case 2:
                        kVar.j = typedArray.getDimension(index, kVar.j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1087a.get(index));
                        break;
                    case 4:
                        kVar.k = typedArray.getFloat(index, kVar.k);
                        break;
                    case 5:
                        kVar.l = typedArray.getFloat(index, kVar.l);
                        break;
                    case 6:
                        kVar.m = typedArray.getFloat(index, kVar.m);
                        break;
                    case 7:
                        kVar.o = typedArray.getFloat(index, kVar.o);
                        break;
                    case 8:
                        kVar.n = typedArray.getFloat(index, kVar.n);
                        break;
                    case 9:
                        kVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            kVar.c = typedArray.getResourceId(index, kVar.c);
                            if (kVar.c != -1) {
                                break;
                            }
                            kVar.d = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                kVar.c = typedArray.getResourceId(index, kVar.c);
                                break;
                            }
                            kVar.d = typedArray.getString(index);
                        }
                    case 12:
                        kVar.b = typedArray.getInt(index, kVar.b);
                        break;
                    case 13:
                        kVar.h = typedArray.getInteger(index, kVar.h);
                        break;
                    case 14:
                        kVar.p = typedArray.getFloat(index, kVar.p);
                        break;
                    case 15:
                        kVar.q = typedArray.getDimension(index, kVar.q);
                        break;
                    case 16:
                        kVar.r = typedArray.getDimension(index, kVar.r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            kVar.s = typedArray.getDimension(index, kVar.s);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        kVar.t = typedArray.getFloat(index, kVar.t);
                        break;
                    case 19:
                        kVar.u = typedArray.getInt(index, kVar.u);
                        break;
                    case 20:
                        kVar.v = typedArray.getFloat(index, kVar.v);
                        break;
                    case 21:
                        kVar.w = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, kVar.w) : typedArray.getFloat(index, kVar.w);
                        break;
                }
            }
        }
    }

    public k() {
        this.e = 3;
        this.f = new HashMap<>();
    }

    @Override // android.support.constraint.motion.c
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
    }

    @Override // android.support.constraint.motion.c
    public void a(HashMap<String, r> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // android.support.constraint.motion.c
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add(Constants.Name.ELEVATION);
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
        }
        if (this.f.size() > 0) {
            Iterator<String> it = this.f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // android.support.constraint.motion.c
    public void b(HashMap<String, Integer> hashMap) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put(Constants.Name.ELEVATION, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("progress", Integer.valueOf(this.h));
        }
        if (this.f.size() <= 0) {
            return;
        }
        Iterator<String> it = this.f.keySet().iterator();
        while (it.hasNext()) {
            hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (r1.equals("scaleY") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.util.HashMap<java.lang.String, android.support.constraint.motion.s> r11) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.k.c(java.util.HashMap):void");
    }
}
