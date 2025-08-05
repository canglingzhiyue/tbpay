package com.taobao.analysis.v3;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.mzq;

/* loaded from: classes.dex */
public class StageList extends CopyOnWriteArrayList<q> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.util.concurrent.CopyOnWriteArrayList
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<q> it = iterator();
            while (it.hasNext()) {
                q next = it.next();
                if (next.b > 0) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(next.a());
                    sb.append("=");
                    sb.append(next.b);
                    sb.append(":");
                    sb.append(next.c);
                    sb.append(":");
                    sb.append(!TextUtils.isEmpty(next.e) ? mzq.a(next.e) : "");
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
