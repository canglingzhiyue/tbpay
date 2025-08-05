package com.taobao.metrickit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Collection<Integer> collection, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436c68eb", new Object[]{collection, iArr})).booleanValue();
        }
        boolean z = false;
        for (int i : iArr) {
            z |= collection.add(Integer.valueOf(i));
        }
        return z;
    }

    public static int[] a(Set<Integer> set) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("3271566d", new Object[]{set});
        }
        int[] iArr = new int[set.size()];
        for (Integer num : set) {
            if (num != null) {
                iArr[i] = num.intValue();
            }
            i++;
        }
        return iArr;
    }

    public static boolean a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27172051", new Object[]{iArr, new Integer(i)})).booleanValue();
        }
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a325b9c5", new Object[]{strArr, str})).booleanValue();
        }
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2 == null && str == null) {
                return true;
            }
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("bedbd660", new Object[]{iArr, iArr2});
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + iArr2.length);
        System.arraycopy(iArr2, 0, copyOf, iArr.length, iArr2.length);
        return copyOf;
    }
}
