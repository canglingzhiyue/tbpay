package com.taobao.mytaobao.ultron.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f18531a = Collections.synchronizedList(new ArrayList());

    static {
        kge.a(218694216);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f18531a.add(str);
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f18531a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f18531a.clear();
        }
    }
}
