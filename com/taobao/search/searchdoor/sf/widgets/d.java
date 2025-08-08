package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.u;
import com.taobao.search.searchdoor.sf.widgets.searchbar.I18nSearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.PopupSearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SubscribeSearchBarWidget;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.nqd;
import tb.nqf;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f19368a;
    private static final c b;

    static {
        kge.a(119299949);
        f19368a = new c() { // from class: com.taobao.search.searchdoor.sf.widgets.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.searchdoor.sf.widgets.c
            public nqd a(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nqd) ipChange.ipc$dispatch("952d7a86", new Object[]{this, activity, iumVar, searchDoorContext, viewGroup, iurVar}) : new nqd(activity, iumVar, searchDoorContext, viewGroup, iurVar);
            }

            @Override // com.taobao.search.searchdoor.sf.widgets.c
            public SearchBarWidget b(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SearchBarWidget) ipChange.ipc$dispatch("97e06a5b", new Object[]{this, activity, iumVar, searchDoorContext, viewGroup, iurVar});
                }
                String a2 = searchDoorContext.a("g_mainChannel");
                if (StringUtils.isEmpty(a2)) {
                    a2 = searchDoorContext.a("mainChannel");
                }
                if (!com.alibaba.ability.localization.b.b()) {
                    return new I18nSearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
                }
                if (StringUtils.equals(a2, "dingyue") && u.r()) {
                    return new SubscribeSearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
                }
                if (searchDoorContext.t()) {
                    return new PopupSearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
                }
                return new SearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
            }
        };
        b = new c() { // from class: com.taobao.search.searchdoor.sf.widgets.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.searchdoor.sf.widgets.c
            public nqd a(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nqd) ipChange.ipc$dispatch("952d7a86", new Object[]{this, activity, iumVar, searchDoorContext, viewGroup, iurVar}) : new nqf(activity, iumVar, searchDoorContext, viewGroup, iurVar);
            }

            @Override // com.taobao.search.searchdoor.sf.widgets.c
            public SearchBarWidget b(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SearchBarWidget) ipChange.ipc$dispatch("97e06a5b", new Object[]{this, activity, iumVar, searchDoorContext, viewGroup, iurVar});
                }
                if (!com.alibaba.ability.localization.b.b()) {
                    return new I18nSearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
                }
                if (searchDoorContext.t()) {
                    return new PopupSearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
                }
                return new SearchBarWidget(activity, iumVar, searchDoorContext, viewGroup, iurVar);
            }
        };
    }

    public static c a(SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ca0aba9c", new Object[]{searchDoorContext}) : StringUtils.isEmpty(searchDoorContext.f()) ? f19368a : b;
    }
}
