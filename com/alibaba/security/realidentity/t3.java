package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public interface t3 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3524a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;

    HashMap<String, Object> a(int i) throws RpSecException;

    void a(HashMap<String, String> hashMap) throws RpSecException;
}
