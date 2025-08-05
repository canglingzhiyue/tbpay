package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(177280425);
    }

    public static String a(Object[] objArr, int i, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32034bbe", new Object[]{objArr, new Integer(i), clsArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "operationList is null or 0";
        }
        if (i <= 0) {
            int abs = Math.abs(i);
            if (objArr.length != abs) {
                return "operationList expected length is " + abs + ", but is " + objArr.length;
            }
        } else if (objArr.length < i) {
            return "operationList expected length is more then " + i + ", but is " + objArr.length;
        }
        if (clsArr != null && clsArr.length > 0) {
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                if (objArr[i2] != null && clsArr[i2] != null && !clsArr[i2].isInstance(objArr[i2])) {
                    return "operationList`s item type is wrong. Number " + i2 + " is " + objArr[i2].getClass() + ", but expected type is " + clsArr[i2];
                } else if (clsArr[i2] != null && objArr[i2] == null) {
                    return "operationList`s item type is wrong. Number " + i2 + " is null, but expected type is " + clsArr[i2];
                } else if (objArr[i2] != null && clsArr[i2] == null) {
                    return null;
                }
            }
        }
        return null;
    }
}
