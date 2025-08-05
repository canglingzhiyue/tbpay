package com.taobao.android.mnncv;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPythonObjectToJavaCallback;

/* loaded from: classes6.dex */
public class ImageConvertor implements AliNNPythonObjectToJavaCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.alinnpython.AliNNPythonObjectToJavaCallback
    public Object pythonToJava(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a455f02e", new Object[]{this, new Long(j)});
        }
        return null;
    }
}
