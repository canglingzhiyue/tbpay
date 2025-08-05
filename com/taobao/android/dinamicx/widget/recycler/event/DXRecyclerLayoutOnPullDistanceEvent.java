package com.taobao.android.dinamicx.widget.recycler.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerLayoutOnPullDistanceEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID = 3971096853043757787L;
    private int distance;

    static {
        kge.a(-1372019081);
    }

    public DXRecyclerLayoutOnPullDistanceEvent(int i) {
        super(DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID);
        this.distance = i;
        HashMap hashMap = new HashMap();
        hashMap.put("distance", f.a(i));
        setArgs(hashMap);
    }

    public int getDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f8a065", new Object[]{this})).intValue() : this.distance;
    }
}
