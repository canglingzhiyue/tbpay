package com.opos.process.bridge.provider;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    static {
        kge.a(1894602413);
    }

    public static Bundle a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", i);
        bundle.putString("resultMsg", str);
        return bundle;
    }

    public static Bundle a(String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(a.class.getClassLoader());
        bundle.putString("targetClass", str);
        if (iBridgeTargetIdentify != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(iBridgeTargetIdentify, 0);
            bundle.putByteArray("targetIdentify", obtain.marshall());
            obtain.recycle();
        }
        bundle.putInt("methodId", i);
        if (objArr != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < objArr.length; i3++) {
                if (objArr[i3] instanceof IBinder) {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(1);
                    String str2 = "args_i_binder" + i2;
                    arrayList.add(str2);
                    bundle.putBinder(str2, (IBinder) objArr[i3]);
                    i2++;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(0);
                    arrayList.add(objArr[i3]);
                }
            }
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeArray(arrayList.toArray());
            bundle.putByteArray("args", obtain2.marshall());
            obtain2.recycle();
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[LOOP:0: B:5:0x0006->B:67:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.Object... r7) {
        /*
            r0 = 1
            if (r7 == 0) goto L90
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L6:
            if (r3 >= r1) goto L90
            r4 = r7[r3]
            if (r4 != 0) goto Le
            goto L88
        Le:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r5 < r6) goto L20
            boolean r5 = r4 instanceof android.os.PersistableBundle
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.util.Size
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.util.SizeF
            if (r5 != 0) goto L88
        L20:
            boolean r5 = r4 instanceof java.lang.Integer
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.util.Map
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.os.Parcelable
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Short
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Long
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Float
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Double
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Boolean
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.CharSequence
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.util.List
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.util.SparseArray
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof boolean[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof byte[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.CharSequence[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.os.IBinder
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof android.os.Parcelable[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof int[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof long[]
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof java.lang.Byte
            if (r5 != 0) goto L88
            boolean r5 = r4 instanceof double[]
            if (r5 != 0) goto L88
            java.lang.Class r5 = r4.getClass()
            boolean r6 = r5.isArray()
            if (r6 == 0) goto L82
            java.lang.Class r5 = r5.getComponentType()
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r5 == r6) goto L88
        L82:
            boolean r4 = r4 instanceof java.io.Serializable
            if (r4 != 0) goto L88
            r4 = 0
            goto L89
        L88:
            r4 = 1
        L89:
            if (r4 != 0) goto L8c
            return r2
        L8c:
            int r3 = r3 + 1
            goto L6
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opos.process.bridge.provider.a.a(java.lang.Object[]):boolean");
    }
}
