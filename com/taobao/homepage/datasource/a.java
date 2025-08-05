package com.taobao.homepage.datasource;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ktq;
import tb.oqc;

/* loaded from: classes7.dex */
public final class a implements OnDataSourceUpdatedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, b> c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, List<SectionModel>> f17235a = new HashMap();
    public Map<String, List<SectionModel>> b = new HashMap();

    static {
        kge.a(-2084105218);
        kge.a(-75040241);
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a8efb88d", new Object[]{this, str}) : ktq.a(this, str, this.c);
    }

    public List<SectionModel> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        List<SectionModel> list = this.f17235a.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        List<SectionModel> list2 = this.b.get(str);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public void a(String str, ChangeContainerProcess.ChangeContainerType changeContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edef2557", new Object[]{this, str, changeContainerType});
        } else if (changeContainerType == ChangeContainerProcess.ChangeContainerType.overseaHotRevision) {
            oqc.a().d();
        } else if (n.n().j() && changeContainerType == ChangeContainerProcess.ChangeContainerType.revision) {
        } else {
            oqc.a().h();
        }
    }
}
