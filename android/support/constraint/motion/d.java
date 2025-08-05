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
public class d extends c {
    public static final int KEY_TYPE = 1;
    private String g;
    private int h = -1;
    private boolean i = false;
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
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f1078a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1078a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            f1078a.append(R.styleable.KeyAttribute_android_elevation, 2);
            f1078a.append(R.styleable.KeyAttribute_android_rotation, 4);
            f1078a.append(R.styleable.KeyAttribute_android_rotationX, 5);
            f1078a.append(R.styleable.KeyAttribute_android_rotationY, 6);
            f1078a.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            f1078a.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            f1078a.append(R.styleable.KeyAttribute_android_scaleX, 7);
            f1078a.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            f1078a.append(R.styleable.KeyAttribute_transitionEasing, 9);
            f1078a.append(R.styleable.KeyAttribute_motionTarget, 10);
            f1078a.append(R.styleable.KeyAttribute_framePosition, 12);
            f1078a.append(R.styleable.KeyAttribute_curveFit, 13);
            f1078a.append(R.styleable.KeyAttribute_android_scaleY, 14);
            f1078a.append(R.styleable.KeyAttribute_android_translationX, 15);
            f1078a.append(R.styleable.KeyAttribute_android_translationY, 16);
            f1078a.append(R.styleable.KeyAttribute_android_translationZ, 17);
            f1078a.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void a(d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1078a.get(index)) {
                    case 1:
                        dVar.j = typedArray.getFloat(index, dVar.j);
                        break;
                    case 2:
                        dVar.k = typedArray.getDimension(index, dVar.k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1078a.get(index));
                        break;
                    case 4:
                        dVar.l = typedArray.getFloat(index, dVar.l);
                        break;
                    case 5:
                        dVar.m = typedArray.getFloat(index, dVar.m);
                        break;
                    case 6:
                        dVar.n = typedArray.getFloat(index, dVar.n);
                        break;
                    case 7:
                        dVar.r = typedArray.getFloat(index, dVar.r);
                        break;
                    case 8:
                        dVar.q = typedArray.getFloat(index, dVar.q);
                        break;
                    case 9:
                        dVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            dVar.c = typedArray.getResourceId(index, dVar.c);
                            if (dVar.c != -1) {
                                break;
                            }
                            dVar.d = typedArray.getString(index);
                            break;
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                dVar.c = typedArray.getResourceId(index, dVar.c);
                                break;
                            }
                            dVar.d = typedArray.getString(index);
                        }
                    case 12:
                        dVar.b = typedArray.getInt(index, dVar.b);
                        break;
                    case 13:
                        dVar.h = typedArray.getInteger(index, dVar.h);
                        break;
                    case 14:
                        dVar.s = typedArray.getFloat(index, dVar.s);
                        break;
                    case 15:
                        dVar.t = typedArray.getDimension(index, dVar.t);
                        break;
                    case 16:
                        dVar.u = typedArray.getDimension(index, dVar.u);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            dVar.v = typedArray.getDimension(index, dVar.v);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dVar.w = typedArray.getFloat(index, dVar.w);
                        break;
                    case 19:
                        dVar.o = typedArray.getDimension(index, dVar.o);
                        break;
                    case 20:
                        dVar.p = typedArray.getDimension(index, dVar.p);
                        break;
                }
            }
        }
    }

    public d() {
        this.e = 1;
        this.f = new HashMap<>();
    }

    @Override // android.support.constraint.motion.c
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r1.equals("transitionPathRotate") != false) goto L12;
     */
    @Override // android.support.constraint.motion.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.HashMap<java.lang.String, android.support.constraint.motion.r> r7) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.d.a(java.util.HashMap):void");
    }

    @Override // android.support.constraint.motion.c
    public void a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add(Constants.Name.ELEVATION);
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.w)) {
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
        if (!Float.isNaN(this.j)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put(Constants.Name.ELEVATION, Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.u)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.v)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.w)) {
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
}
