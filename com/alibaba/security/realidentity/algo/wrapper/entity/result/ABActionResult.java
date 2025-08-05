package com.alibaba.security.realidentity.algo.wrapper.entity.result;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ABActionResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int actionType;
    public String ecResult = "";
    public List<ABImageResult> imageList = new ArrayList();

    public void addImageResult(ABImageResult aBImageResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acb67cf", new Object[]{this, aBImageResult});
        } else {
            this.imageList.add(aBImageResult);
        }
    }
}
