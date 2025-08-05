package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes3.dex */
public class d1 extends b1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String d = "GroupActionStrategy";
    public int[] b = {0, 1};
    public int[] c = {5, 6};

    @Override // com.alibaba.security.realidentity.b1
    public List<Integer> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a12f204e", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        int i2 = this.b[random.nextInt(2)];
        int i3 = this.c[random.nextInt(2)];
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        int nextInt = random.nextInt(2);
        if (nextInt == 0) {
            Collections.sort(arrayList);
        } else if (nextInt == 1) {
            Collections.reverse(arrayList);
        }
        while (arrayList.size() > i && arrayList.size() > 0) {
            arrayList.remove(0);
        }
        return arrayList;
    }
}
