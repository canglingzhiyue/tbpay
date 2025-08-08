package com.etao.feimagesearch.album;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<k> f6493a;
    private LinkedList<o> b;
    private k c;

    static {
        kge.a(-583387798);
    }

    public b(List<k> list, LinkedList<o> linkedList) {
        this.f6493a = list;
        this.b = linkedList;
    }

    public List<k> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f6493a;
    }

    public LinkedList<o> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("4ac103e5", new Object[]{this}) : this.b;
    }

    public k c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("edc31c1f", new Object[]{this});
        }
        if (this.c == null) {
            this.c = a("/" + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18952));
        }
        return this.c;
    }

    public k a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("da15257", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        for (k kVar : this.f6493a) {
            if (str.equals(kVar.b())) {
                return kVar;
            }
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f6493a.clear();
        this.b.clear();
    }
}
