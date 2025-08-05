package com.alibaba.ut.abtest.internal.database;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f4190a;
    private final Object[] b;

    static {
        kge.a(244753571);
    }

    public f(String str, Object... objArr) {
        this.f4190a = str;
        this.b = objArr;
    }

    public void a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279f0c3", new Object[]{this, sb});
        } else {
            sb.append(this.f4190a);
        }
    }

    public void a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        Object[] objArr = this.b;
        if (objArr == null) {
            return;
        }
        Collections.addAll(list, objArr);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4190a;
    }

    public String[] b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this});
        }
        String[] strArr = null;
        Object[] objArr = this.b;
        if (objArr != null && objArr.length > 0) {
            strArr = new String[objArr.length];
            while (true) {
                Object[] objArr2 = this.b;
                if (i >= objArr2.length) {
                    break;
                }
                strArr[i] = objArr2[i].toString();
                i++;
            }
        }
        return strArr;
    }
}
