package android.support.constraint.motion;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class l extends c {
    public static final int KEY_TYPE = 5;
    private Method v;
    private Method w;
    private Method x;
    private float y;
    private int j = -1;
    private String k = null;
    private int l = f1077a;
    private String m = null;
    private String n = null;
    private int o = f1077a;
    private int p = f1077a;
    private View q = null;
    float g = 0.1f;
    private boolean r = true;
    private boolean s = true;
    private boolean t = true;
    private float u = Float.NaN;
    private boolean z = false;
    RectF h = new RectF();
    RectF i = new RectF();

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f1088a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1088a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            f1088a.append(R.styleable.KeyTrigger_onCross, 4);
            f1088a.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            f1088a.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            f1088a.append(R.styleable.KeyTrigger_motionTarget, 7);
            f1088a.append(R.styleable.KeyTrigger_triggerId, 6);
            f1088a.append(R.styleable.KeyTrigger_triggerSlack, 5);
            f1088a.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f1088a.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f1088a.append(R.styleable.KeyTrigger_triggerReceiver, 11);
        }

        public static void a(l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1088a.get(index)) {
                    case 1:
                        lVar.m = typedArray.getString(index);
                        continue;
                    case 2:
                        lVar.n = typedArray.getString(index);
                        continue;
                    case 4:
                        lVar.k = typedArray.getString(index);
                        continue;
                    case 5:
                        lVar.g = typedArray.getFloat(index, lVar.g);
                        continue;
                    case 6:
                        lVar.o = typedArray.getResourceId(index, lVar.o);
                        continue;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            lVar.c = typedArray.getResourceId(index, lVar.c);
                            if (lVar.c != -1) {
                                continue;
                            }
                            lVar.d = typedArray.getString(index);
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                lVar.c = typedArray.getResourceId(index, lVar.c);
                            }
                            lVar.d = typedArray.getString(index);
                        }
                    case 8:
                        lVar.b = typedArray.getInteger(index, lVar.b);
                        lVar.u = (lVar.b + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        lVar.p = typedArray.getResourceId(index, lVar.p);
                        continue;
                    case 10:
                        lVar.z = typedArray.getBoolean(index, lVar.z);
                        continue;
                    case 11:
                        lVar.l = typedArray.getResourceId(index, lVar.l);
                        break;
                }
                Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1088a.get(index));
            }
        }
    }

    public l() {
        this.e = 5;
        this.f = new HashMap<>();
    }

    private void a(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(float r11, android.view.View r12) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.motion.l.a(float, android.view.View):void");
    }

    @Override // android.support.constraint.motion.c
    public void a(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
    }

    @Override // android.support.constraint.motion.c
    public void a(HashMap<String, r> hashMap) {
    }

    @Override // android.support.constraint.motion.c
    public void a(HashSet<String> hashSet) {
    }
}
