package com.taobao.android.layoutmanager.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.media.expression.Expression;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1082228453);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Expression("/:淘小宝得意", "淘小宝得意", 0, null, R.drawable.gg_2054));
        arrayList.add(new Expression("/:淘小宝开心", "淘小宝开心", 0, null, R.drawable.gg_2055));
        arrayList.add(new Expression("/:淘小宝流泪", "淘小宝流泪", 0, null, R.drawable.gg_2056));
        arrayList.add(new Expression("/:淘小宝心心眼", "淘小宝心心眼", 0, null, R.drawable.gg_2057));
        arrayList.add(new Expression("/:淘小宝左看看", "淘小宝左看看", 0, null, R.drawable.gg_2058));
        arrayList.add(new Expression("/:淘小宝mua", "淘小宝mua", 0, null, R.drawable.gg_2059));
        arrayList.add(new Expression("/:淘小宝星星眼", "淘小宝星星眼", 0, null, R.drawable.gg_2060));
        arrayList.add(new Expression("/:淘小宝哈哈", "淘小宝哈哈", 0, null, R.drawable.gg_2061));
        arrayList.add(new Expression("/:淘小宝wink", "淘小宝wink", 0, null, R.drawable.gg_2062));
        arrayList.add(new Expression("/:淘小宝惊呆", "淘小宝惊呆", 0, null, R.drawable.gg_2063));
        arrayList.add(new Expression("/:淘小宝闭眼", "淘小宝闭眼", 0, null, R.drawable.gg_2064));
        ExpressionTable.registerEmotionWithBiz("guang", arrayList);
    }
}
