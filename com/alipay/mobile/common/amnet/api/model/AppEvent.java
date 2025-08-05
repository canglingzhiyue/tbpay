package com.alipay.mobile.common.amnet.api.model;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class AppEvent implements Serializable {
    public Map<Byte, byte[]> extMap;
    public long id;
    public String major;
    public String minor;
    public int status;
}
