package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BioRecordService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract int getSequenceID();

    public abstract String getUniqueID();

    public abstract void setExtProperty(Map<String, String> map);

    public abstract void setUniqueID(String str);

    public abstract void write(MetaRecord metaRecord);
}
