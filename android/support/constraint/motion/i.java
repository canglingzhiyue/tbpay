package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.iee;

/* loaded from: classes2.dex */
public class i extends j {
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    String g = null;
    int h = f1077a;
    int i = 0;
    float j = Float.NaN;
    float k = Float.NaN;
    float l = Float.NaN;
    float m = Float.NaN;
    float n = Float.NaN;
    float o = Float.NaN;
    int p = 0;
    private float r = Float.NaN;
    private float s = Float.NaN;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f1086a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1086a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            f1086a.append(R.styleable.KeyPosition_framePosition, 2);
            f1086a.append(R.styleable.KeyPosition_transitionEasing, 3);
            f1086a.append(R.styleable.KeyPosition_curveFit, 4);
            f1086a.append(R.styleable.KeyPosition_drawPath, 5);
            f1086a.append(R.styleable.KeyPosition_percentX, 6);
            f1086a.append(R.styleable.KeyPosition_percentY, 7);
            f1086a.append(R.styleable.KeyPosition_keyPositionType, 9);
            f1086a.append(R.styleable.KeyPosition_sizePercent, 8);
            f1086a.append(R.styleable.KeyPosition_percentWidth, 11);
            f1086a.append(R.styleable.KeyPosition_percentHeight, 12);
            f1086a.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(i iVar, TypedArray typedArray) {
            float f;
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1086a.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            iVar.c = typedArray.getResourceId(index, iVar.c);
                            if (iVar.c != -1) {
                            }
                            iVar.d = typedArray.getString(index);
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.c = typedArray.getResourceId(index, iVar.c);
                                continue;
                            }
                            iVar.d = typedArray.getString(index);
                        }
                    case 2:
                        iVar.b = typedArray.getInt(index, iVar.b);
                        continue;
                    case 3:
                        iVar.g = typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : iee.c[typedArray.getInteger(index, 0)];
                        continue;
                    case 4:
                        iVar.q = typedArray.getInteger(index, iVar.q);
                        continue;
                    case 5:
                        iVar.i = typedArray.getInt(index, iVar.i);
                        continue;
                    case 6:
                        iVar.l = typedArray.getFloat(index, iVar.l);
                        continue;
                    case 7:
                        iVar.m = typedArray.getFloat(index, iVar.m);
                        continue;
                    case 8:
                        f = typedArray.getFloat(index, iVar.k);
                        iVar.j = f;
                        break;
                    case 9:
                        iVar.p = typedArray.getInt(index, iVar.p);
                        continue;
                    case 10:
                        iVar.h = typedArray.getInt(index, iVar.h);
                        continue;
                    case 11:
                        iVar.j = typedArray.getFloat(index, iVar.j);
                        continue;
                    case 12:
                        f = typedArray.getFloat(index, iVar.k);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1086a.get(index));
                        continue;
                }
                iVar.k = f;
            }
            if (iVar.b == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public i() {
        this.e = 2;
    }

    @Override // android.support.constraint.motion.c
    public void a(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
    }

    @Override // android.support.constraint.motion.c
    public void a(HashMap<String, r> hashMap) {
    }
}
