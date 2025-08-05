package com.taobao.android.searchbaseframe.business.weex.multiplelist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class ScrollRangeEventItem implements Serializable {
    public int currentPosition;
    public List<String> params = new ArrayList();
    public List<Integer> pxParams = new ArrayList();
    public String type;

    static {
        kge.a(-1749416175);
        kge.a(1028243835);
    }
}
