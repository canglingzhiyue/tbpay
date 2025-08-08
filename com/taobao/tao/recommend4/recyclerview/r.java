package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.ItemModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.util.ArrayList;
import java.util.List;
import tb.flp;
import tb.kge;
import tb.ldf;
import tb.sgd;

/* loaded from: classes8.dex */
public class r extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f21010a;

    static {
        kge.a(71858224);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 806944192) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != 2142696127) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public r(String str) {
        this.f21010a = str;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        a(recyclerView, this.f21010a);
    }

    public static void a(RecyclerView recyclerView, String str) {
        h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b95e0", new Object[]{recyclerView, str});
        } else if (recyclerView == null || (hVar = (h) recyclerView.getAdapter()) == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a(recyclerView, hVar, arrayList, arrayList2);
            PreLoadModel a2 = com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a.a(arrayList, -1, "newDetail", str);
            if (a2 != null) {
                a2.setBizName("new_detail");
                sgd.a(a2);
            }
            PreLoadModel a3 = com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a.a(arrayList2, -1, com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a.TARGET_TYPE_LITE_DETAIL, str);
            if (a3 == null) {
                return;
            }
            a3.setBizName(flp.PRELOAD_REQUESTER_BIZ_NAME_LITE);
            sgd.a(a3);
        }
    }

    private static void a(RecyclerView recyclerView, h hVar, List<BaseSectionModel<?>> list, List<BaseSectionModel<?>> list2) {
        SectionModel sectionModel;
        ItemModel mo1097getItem;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb11873", new Object[]{recyclerView, hVar, list, list2});
            return;
        }
        int[] a2 = com.taobao.tao.recommend3.util.d.a(recyclerView);
        if (a2 == null) {
            ldf.d("RecommendViewPreloadListener", "range invalid");
            return;
        }
        int i = a2[1];
        for (int i2 = a2[0]; i2 < i; i2++) {
            JSONObject a3 = hVar.a(i2);
            if ((a3 instanceof SectionModel) && (mo1097getItem = (sectionModel = (SectionModel) a3).mo1097getItem()) != null && (jSONObject = mo1097getItem.getJSONObject("0")) != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
                String string = jSONObject2.getString(DinamicxNativeConfig.TARGETTYPE);
                if (StringUtils.equals(string, "newDetail")) {
                    list.add(sectionModel);
                } else if (StringUtils.equals(string, com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a.TARGET_TYPE_LITE_DETAIL)) {
                    list2.add(sectionModel);
                }
            }
        }
    }
}
