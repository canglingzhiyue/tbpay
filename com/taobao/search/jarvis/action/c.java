package com.taobao.search.jarvis.action;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.k;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.jxs;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class c extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f19062a;

    static {
        kge.a(487842751);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b rerankParams) {
        super("ReRank");
        q.c(rerankParams, "rerankParams");
        this.f19062a = rerankParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ea, code lost:
        r27 = r2;
        r28 = r4;
        r25 = r12;
        r0 = r13;
        r2 = r14;
        r4 = r15;
        r26 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0332  */
    @Override // com.taobao.android.searchbaseframe.util.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.jarvis.action.c.a():void");
    }

    private final BaseCellBean a(LinkedList<BaseCellBean> linkedList, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("16431fdd", new Object[]{this, linkedList, jxsVar});
        }
        while (!linkedList.isEmpty()) {
            BaseCellBean pollFirst = linkedList.pollFirst();
            if (!(!q.a((Object) pollFirst.cardType, (Object) "item"))) {
                if (!jxsVar.a(pollFirst.itemId)) {
                    return pollFirst;
                }
                k.d("[XSearchJarvis]", pollFirst.itemId + " 已曝光过，去重", new Object[0]);
            }
        }
        return null;
    }

    private final BaseCellBean a(LinkedList<BaseCellBean> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("70820468", new Object[]{this, linkedList});
        }
        while (!linkedList.isEmpty()) {
            BaseCellBean pollFirst = linkedList.pollFirst();
            if (!(!q.a((Object) pollFirst.cardType, (Object) "item"))) {
                return pollFirst;
            }
        }
        return null;
    }

    private final Map<String, String> a(jxs jxsVar) {
        ResultMainInfoBean mainInfo;
        ResultMainInfoBean mainInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("edda50c8", new Object[]{this, jxsVar});
        }
        HashMap hashMap = new HashMap();
        iru b = jxsVar.b();
        q.a((Object) b, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
        q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
        HashMap hashMap2 = hashMap;
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        String str = null;
        hashMap2.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
        BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult2 != null && (mainInfo = baseSearchResult2.getMainInfo()) != null) {
            str = mainInfo.abtest;
        }
        hashMap2.put("wlsort", str);
        hashMap2.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
        return hashMap2;
    }
}
