package com.alipay.android.msp.framework.statisticsv2.vector;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class VectorArrayData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Vector f4867a;
    private final ArrayList<IModel> b = new ArrayList<>();

    public VectorArrayData(Vector vector, int i) {
        this.f4867a = vector;
    }

    public synchronized int add(IModel iModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b030b0e1", new Object[]{this, iModel})).intValue();
        } else if (iModel == null) {
            return -1;
        } else {
            this.b.add(iModel);
            return this.b.indexOf(iModel);
        }
    }

    public IModel get(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IModel) ipChange.ipc$dispatch("fdba1cd6", new Object[]{this, new Integer(i)}) : this.b.get(i);
    }

    public synchronized String format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9662a762", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Grammar.CONTAINER_START[0]);
        sb.append(a());
        Iterator<IModel> it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(a(it.next().toMap()));
            sb.append(Grammar.CONTAINER_ARRAY_SEPARATOR[0]);
        }
        if (!this.b.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        } else if (TextUtils.isEmpty(a())) {
            sb.append(Grammar.ATTR_DEFAULT_VALUE);
        }
        sb.append(Grammar.CONTAINER_END[0]);
        return sb.toString();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4867a == Vector.Biz ? "@@biz@@" : "";
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        StringBuilder sb = new StringBuilder();
        String[] attrs = this.f4867a.getAttrs();
        for (String str : attrs) {
            String filter = Grammar.filter(map.get(str));
            if (TextUtils.isEmpty(filter)) {
                filter = Grammar.ATTR_DEFAULT_VALUE;
            }
            sb.append(filter);
            sb.append(Grammar.FIELD_SEPARATOR[0]);
        }
        if (attrs.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean isEmpty(VectorArrayData vectorArrayData) {
        ArrayList<IModel> arrayList;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bad875a6", new Object[]{vectorArrayData})).booleanValue() : vectorArrayData == null || (arrayList = vectorArrayData.b) == null || arrayList.size() == 0;
    }
}
