package com.taobao.android.ultron.datamodel.imp;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BigInteger FEATURE_CONTAINER_CACHE;
    public static final BigInteger FEATURE_SIMPLE_POPUP;
    public static final BigInteger FEATURE_TAG_ID;

    static {
        kge.a(901980112);
        FEATURE_TAG_ID = new BigInteger("1");
        FEATURE_CONTAINER_CACHE = new BigInteger("2");
        FEATURE_SIMPLE_POPUP = new BigInteger("4");
    }

    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c55ec69a", new Object[]{bigInteger, bigInteger2})).booleanValue();
        }
        if (bigInteger != null && bigInteger2 != null) {
            return bigInteger2.equals(bigInteger.and(bigInteger2));
        }
        return false;
    }

    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BigInteger) ipChange.ipc$dispatch("4d6c1116", new Object[]{bigInteger, bigInteger2}) : (bigInteger == null || bigInteger2 == null || !a(bigInteger, bigInteger2)) ? bigInteger : bigInteger.xor(bigInteger2);
    }
}
