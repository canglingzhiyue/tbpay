package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.List;
import tb.kge;
import tb.kyu;
import tb.lku;

/* loaded from: classes7.dex */
public class b extends lku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17501a;
    private IContainerDataService b;
    private IMainFeedsViewService c;

    static {
        kge.a(110268089);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 1333862564) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
    }

    public b(kyu kyuVar, IContainerDataService iContainerDataService, IMainFeedsViewService iMainFeedsViewService) {
        this.f17501a = kyuVar;
        this.b = iContainerDataService;
        this.c = iMainFeedsViewService;
    }

    @Override // tb.lku
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.homepage.pop.utils.c.a("PopDataObserver ", "onItemRangeChanged, posStart=" + i + ", itemCount=" + i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            String b = b(i4);
            if (!StringUtils.isEmpty(b)) {
                this.f17501a.c().a(i4, a(i4), b);
            }
        }
    }

    @Override // tb.lku
    public void a(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8120a4", new Object[]{this, new Integer(i), new Integer(i2), obj});
            return;
        }
        com.taobao.homepage.pop.utils.c.a("PopDataObserver ", "onItemRangeChangedPayload, posStart=" + i + ", itemCount=" + i2);
        super.a(i, i2, obj);
    }

    @Override // tb.lku
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.homepage.pop.utils.c.a("PopDataObserver ", "onChanged");
        super.a();
    }

    private View a(int i) {
        IMainFeedsViewService iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && (iMainFeedsViewService = this.c) != null) {
            return iMainFeedsViewService.findItemViewByPosition(i);
        }
        return null;
    }

    private String b(int i) {
        List totalData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || (totalData = this.b.getContainerData().getTotalData()) == null || totalData.isEmpty() || i >= totalData.size()) {
            return null;
        }
        return ((BaseSectionModel) totalData.get(i)).getSectionBizCode();
    }
}
