package com.taobao.android.weex_framework;

import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class MUSProps implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SparseArray<MUSValue> mIdProps = new SparseArray<>();
    private final Map<String, MUSValue> mStrProps = new HashMap();
    private final List<t> mRawProps = new LinkedList();

    static {
        kge.a(-1238890943);
        kge.a(1028243835);
    }

    public Map<String, MUSValue> getStringProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("50f7c8e5", new Object[]{this}) : this.mStrProps;
    }

    public List<t> getRawProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7fca8682", new Object[]{this}) : this.mRawProps;
    }

    public void put(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3ff30d", new Object[]{this, str, mUSValue});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.mRawProps.add(new t(str, mUSValue));
        }
    }

    public void put(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bca8da", new Object[]{this, new Integer(i), mUSValue});
        } else if (i < 0 || i >= a.ARRAY.length) {
        } else {
            this.mRawProps.add(new t(a.ARRAY[i], mUSValue));
        }
    }
}
