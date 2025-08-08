package com.taobao.homepage.pop.view.container.sub;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import com.taobao.homepage.pop.utils.c;
import tb.kyu;

/* loaded from: classes7.dex */
public class a implements com.taobao.homepage.pop.view.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kyu f17267a;

    public a(kyu kyuVar) {
        this.f17267a = kyuVar;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public IPopAnchorViewInfo a(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopAnchorViewInfo) ipChange.ipc$dispatch("a9b221bd", new Object[]{this, iPopData, new Integer(i)}) : a(a(new com.taobao.homepage.pop.viewmodel.b(iPopData)), i);
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public IPopAnchorViewInfo a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("96ce32eb", new Object[]{this, view, new Integer(i)});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        PopAnchorViewInfo popAnchorViewInfo = new PopAnchorViewInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight(), i, -1);
        c.b("PopAnchorManager ", "getAnchorViewInfo, " + popAnchorViewInfo);
        return popAnchorViewInfo;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public View a(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("96d6ddb0", new Object[]{this, bVar});
        }
        if (bVar == null || this.f17267a.e().c()) {
            return null;
        }
        int b = bVar.b();
        if (bVar.b() < 0 && (b = a(bVar.a())) < 0) {
            return null;
        }
        return a(b, bVar.a());
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public int a(IPopData iPopData, IPopAnchorViewInfo iPopAnchorViewInfo, View view) {
        int screenY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb93d27b", new Object[]{this, iPopData, iPopAnchorViewInfo, view})).intValue();
        }
        int i = -1;
        if (iPopData == null || iPopAnchorViewInfo == null) {
            c.a("PopAnchorManager ", "isValidAnchor error, pointView is null or popData is null");
            return -1;
        }
        if (view != null && view.getLayoutParams() != null) {
            i = view.getLayoutParams().height;
        }
        if (iPopData.getPopConfig().getPointY() == 0) {
            screenY = iPopAnchorViewInfo.getScreenY() - i;
        } else {
            screenY = iPopAnchorViewInfo.getScreenY() + iPopAnchorViewInfo.getHeight();
        }
        return screenY - a();
    }

    private int a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ae3ecb", new Object[]{this, iPopData})).intValue();
        }
        if (iPopData == null || iPopData.getPopConfig() == null) {
            c.a("PopAnchorManager ", "popConfig is null");
            return -1;
        }
        IPopPoint point = iPopData.getPopConfig().getPoint();
        if (point == null) {
            c.a("PopAnchorManager ", "popPoint is null");
            return -1;
        }
        kyu kyuVar = this.f17267a;
        if (kyuVar == null) {
            c.a("PopAnchorManager ", "HomePopEngine is null");
            return -1;
        }
        return kyuVar.d().a(point.getSectionBizCode());
    }

    private View a(int i, IPopData iPopData) {
        kyu kyuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8136d287", new Object[]{this, new Integer(i), iPopData});
        }
        IPopPoint point = iPopData.getPopConfig().getPoint();
        if (point == null || (kyuVar = this.f17267a) == null || i < 0) {
            c.a("PopAnchorManager ", "popConfig or service or pos is null");
            return null;
        }
        View b = kyuVar.d().b(i);
        if (b != null) {
            return StringUtils.isEmpty(point.getItemBizCode()) ? b : com.taobao.homepage.pop.utils.b.a(b, point.getItemBizCode());
        }
        c.a("PopAnchorManager ", "cardView is null");
        return null;
    }

    private int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        kyu kyuVar = this.f17267a;
        if (kyuVar != null) {
            return kyuVar.e().b();
        }
        return -1;
    }
}
