package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.syu;

/* loaded from: classes5.dex */
public class g extends j<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, e> f10863a;
    public f b;
    public String c;
    public ArrayList<com.taobao.android.detail.ttdetail.communication.a> e;

    static {
        kge.a(-103657005);
    }

    public g(List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> list) {
        super(list);
        this.e = new ArrayList<>();
    }

    public void a(ArrayList<e> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.f10863a = new HashMap<>();
        Iterator<e> it = arrayList.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (!TextUtils.isEmpty(next.f10861a)) {
                this.f10863a.put(next.f10861a, next);
            }
        }
    }

    public void a(Context context, ArrayList<ActionModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9bb14a", new Object[]{this, context, arrayList});
            return;
        }
        Iterator<ActionModel> it = arrayList.iterator();
        while (it.hasNext()) {
            com.taobao.android.detail.ttdetail.communication.a a2 = syu.a(it.next(), null);
            if (a2 != null) {
                this.e.add(a2);
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        HashMap<String, e> hashMap = this.f10863a;
        return hashMap != null && !hashMap.isEmpty();
    }
}
