package com.alibaba.android.umf.workflow;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.android.umf.node.model.IUMFNodeModel;
import java.util.List;
import tb.bpx;

/* loaded from: classes2.dex */
public interface IUMFWorkflow<INPUT extends UMFBaseIO, OUTPUT extends UMFBaseIO> {
    void execute(List<IUMFNodeModel> list, INPUT input, b bVar, bpx<OUTPUT> bpxVar);
}
