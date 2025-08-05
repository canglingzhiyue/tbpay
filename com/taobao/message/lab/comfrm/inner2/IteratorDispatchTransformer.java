package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class IteratorDispatchTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final MergeTransformer mMergeTransformer;
    private final Map<String, List<IteratorTransformer>> mPool;
    private final SplitTransformer mSplitTransformer;
    private final TransformerItem mTransformerItem;

    static {
        kge.a(-1760046096);
        kge.a(1437606424);
    }

    public IteratorDispatchTransformer(TransformerItem transformerItem, SplitTransformer splitTransformer, MergeTransformer mergeTransformer, Map<String, List<IteratorTransformer>> map) {
        this.mTransformerItem = transformerItem;
        this.mSplitTransformer = splitTransformer;
        this.mMergeTransformer = mergeTransformer;
        this.mPool = map;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        SplitTransformer splitTransformer = this.mSplitTransformer;
        if (splitTransformer == null || this.mMergeTransformer == null) {
            String str = "Not find|SplitTransformer|" + this.mSplitTransformer.getClass().getSimpleName() + "|MergeTransformer|" + this.mMergeTransformer.getClass().getSimpleName();
            if (ApplicationUtil.isDebug()) {
                throw new RuntimeException(str);
            }
            Logger.e("IteratorDispatchTransformer", str);
            return sharedState;
        }
        List<SplitPart> transform = splitTransformer.transform(action, sharedState, sharedState.getDiff(), null);
        ArrayList arrayList = new ArrayList();
        for (SplitPart splitPart : transform) {
            if (splitPart == null) {
                String str2 = "SplitTransformer return null|" + this.mSplitTransformer.getClass().toString();
                if (ApplicationUtil.isDebug()) {
                    throw new RuntimeException(str2);
                }
                Logger.e("IteratorDispatchTransformer", str2);
            } else {
                List<IteratorTransformer> list = this.mPool.get(splitPart.getType());
                if (list != null) {
                    ItemState itemState = new ItemState(splitPart.getIndex());
                    for (IteratorTransformer iteratorTransformer : list) {
                        if (TraceUtil.isEnableTrace()) {
                            TraceUtil.beginSection("textTransform", iteratorTransformer.getClass().getSimpleName());
                        }
                        itemState = iteratorTransformer.transform(action, sharedState, splitPart.getData(), itemState);
                        if (TraceUtil.isEnableTrace()) {
                            TraceUtil.endTrace();
                        }
                        TraceUtil.endTrace();
                        if (itemState == null) {
                            String str3 = "IteratorTransformer return null|" + iteratorTransformer.getClass().toString();
                            if (ApplicationUtil.isDebug()) {
                                throw new RuntimeException(str3);
                            }
                            Logger.e("IteratorDispatchTransformer", str3);
                        }
                    }
                    arrayList.add(itemState);
                } else {
                    continue;
                }
            }
        }
        return this.mMergeTransformer.transform(action, sharedState, arrayList);
    }
}
