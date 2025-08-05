package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class b1 implements e1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3365a = "b1";

    @Override // com.alibaba.security.realidentity.e1
    public List<ABDetectType> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
        }
        List<Integer> c = c(i);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (Integer num : c) {
            copyOnWriteArrayList.add(b(num.intValue()));
        }
        return copyOnWriteArrayList;
    }

    public ABDetectType b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABDetectType) ipChange.ipc$dispatch("fc24017d", new Object[]{this, new Integer(i)});
        }
        ABDetectType aBDetectType = ABDetectType.DONE;
        switch (i) {
            case 0:
                return ABDetectType.BLINK;
            case 1:
                return ABDetectType.MOUTH;
            case 2:
                return ABDetectType.POS_PITCH;
            case 3:
                return ABDetectType.POS_YAW_LEFT;
            case 4:
                return ABDetectType.POS_YAW_RIGHT;
            case 5:
                return ABDetectType.POS_YAW;
            case 6:
                return ABDetectType.POS_PITCH_UP;
            case 7:
                return ABDetectType.POS_PITCH_DOWN;
            default:
                return aBDetectType;
        }
    }

    public List<Integer> c(int i) {
        int nextInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a12f204e", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        boolean[] zArr = new boolean[5];
        for (int i2 = 0; i2 < 5; i2++) {
            do {
                nextInt = random.nextInt(5);
            } while (zArr[nextInt]);
            zArr[nextInt] = true;
            if (arrayList.size() == i) {
                break;
            }
            arrayList.add(Integer.valueOf(nextInt));
        }
        return arrayList;
    }
}
