package com.taobao.message.expression;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.uikit.media.expression.Expression;
import com.taobao.message.uikit.media.expression.TaoExpressionProviderV2;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageExpressionService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1247543982);
    }

    public static SparseArray<Expression> getExpressionTable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("85ffd0f2", new Object[0]) : TaoExpressionProviderV2.getInstance().getExpressionTable();
    }

    public static boolean hasMsgSDKInit(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("666de638", new Object[]{str})).booleanValue() : BundleSplitUtil.INSTANCE.isMsgBundleReady();
    }
}
