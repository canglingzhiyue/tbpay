package com.alipay.mobile.security.bio.service;

import android.content.Context;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class BioMetaInfo implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SAMPLE_MODE_ENROLL = 300;
    public static final int SAMPLE_MODE_FACE_LOGIN = 303;
    public static final int SAMPLE_MODE_FACE_SAMPLE = 302;
    public static final int SAMPLE_MODE_VERIFY = 301;
    public static final int TYPE_DOC = 110;
    public static final int TYPE_EYE = 101;
    public static final int TYPE_FACE = 100;
    public static final int TYPE_FACE_EYE = 201;
    public static final int TYPE_FACE_VOICE = 202;
    public static final int TYPE_HANDWRITING = 103;
    public static final int TYPE_IDCARD = 108;
    public static final int TYPE_IDFACE = 200;
    public static final int TYPE_IDPAPERS = 107;
    public static final int TYPE_PAPERS = 109;
    public static final int TYPE_VOICE = 102;
    @Deprecated
    public List<Long> productIDs = new CopyOnWriteArrayList();
    public List<BioServiceDescription> serviceDescriptions = new CopyOnWriteArrayList();
    public List<BioAppDescription> appDescriptions = new CopyOnWriteArrayList();

    public List<Long> getProductIDs(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("50ce47e5", new Object[]{this, context});
        }
        return null;
    }

    public String getRevision(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e8dad30", new Object[]{this, context});
        }
        return null;
    }

    public List<Integer> getRuntimeInfoIDs(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96d2fb3b", new Object[]{this, context, map});
        }
        return null;
    }

    public void addExtService(BioServiceDescription bioServiceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce2ef6", new Object[]{this, bioServiceDescription});
        } else {
            this.serviceDescriptions.add(bioServiceDescription);
        }
    }

    public List<BioServiceDescription> getExtServices() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ef84a7d7", new Object[]{this}) : this.serviceDescriptions;
    }

    public List<BioAppDescription> getApplications() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("91bc56a7", new Object[]{this}) : this.appDescriptions;
    }

    public void addApplication(BioAppDescription bioAppDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e344f7c", new Object[]{this, bioAppDescription});
        } else {
            this.appDescriptions.add(bioAppDescription);
        }
    }

    @Deprecated
    public List<Long> getProductIDs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f0575121", new Object[]{this}) : this.productIDs;
    }

    @Deprecated
    public void addProductID(Long... lArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93fb024", new Object[]{this, lArr});
        } else if (lArr == null || lArr.length <= 0) {
        } else {
            this.productIDs.addAll(Arrays.asList(lArr));
        }
    }
}
