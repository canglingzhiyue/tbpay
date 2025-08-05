package com.taobao.message.uikit.provider;

import android.util.SparseArray;
import com.taobao.message.uikit.media.expression.Expression;
import java.util.List;

/* loaded from: classes7.dex */
public interface ExpressionProvider2 extends ExpressionProvider {
    SparseArray<Expression> getExpressionTableByBiz(String[] strArr);

    void registerEmotionWithBiz(String str, List<Expression> list);
}
