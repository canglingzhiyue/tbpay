package com.taobao.android.editionswitcher.boarding;

import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.constants.Location;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class h implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LocaleModel f12282a;
    public LocaleModel.LocaleData b;
    public LocaleModel.LocaleData c;
    public List<LocaleModel.LocaleData> d = new ArrayList();
    public Map<String, List<LocaleModel.LocaleData>> e = new HashMap();
    private c f;

    static {
        kge.a(1585715490);
        kge.a(980329935);
        f12282a = null;
    }

    public h(c cVar) {
        this.f = cVar;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (f12282a == null) {
            f12282a = LocaleModel.getDefault();
            AppMonitor.Alarm.commitSuccess("Page_LocalBoarding", "defaultData");
        }
        if (f12282a.promoteText != null) {
            this.f.setPromoteTx(f12282a.promoteText);
        }
        LocaleModel.SiteLangModel siteLangModel = f12282a.currentCountryInfo;
        LocaleModel.LocaleData localeData = new LocaleModel.LocaleData("en_US", "English");
        Iterator<LocaleModel.LangModel> it = siteLangModel.langs.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LocaleModel.LangModel next = it.next();
            if (next.defaultLang) {
                localeData.key = next.lang;
                localeData.value = next.langName;
                break;
            }
        }
        this.d = new ArrayList();
        this.e = new HashMap();
        for (LocaleModel.SiteLangModel siteLangModel2 : f12282a.countryInfo) {
            LocaleModel.LocaleData localeData2 = new LocaleModel.LocaleData(siteLangModel2.site, siteLangModel2.siteName.en_us);
            if (siteLangModel2.site.equalsIgnoreCase(siteLangModel.site)) {
                localeData2.selected = true;
            }
            this.d.add(localeData2);
            ArrayList arrayList = new ArrayList();
            for (LocaleModel.LangModel langModel : siteLangModel2.langs) {
                LocaleModel.LocaleData localeData3 = new LocaleModel.LocaleData(langModel.lang, langModel.langName, langModel.defaultLang);
                if (localeData.key.equalsIgnoreCase(localeData3.key)) {
                    localeData3.selected = true;
                }
                arrayList.add(localeData3);
            }
            this.e.put(siteLangModel2.site, arrayList);
        }
        this.b = new LocaleModel.LocaleData(siteLangModel.site, siteLangModel.siteName.en_us);
        this.c = localeData;
        TBS.Ext.commitEvent("Page_LocalBoarding", 2001, null, null, null, "selectedEdition=" + this.b.key + ",selectedLang=" + this.c.key + ",pageData=" + JSON.toJSONString(f12282a));
        this.f.refresh(this.b.value, this.c.value);
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.c.key.contains("en")) {
            com.alibaba.ability.localization.b.a(Language.ENGLISH, Location.cast2Enum(this.b.key));
        } else {
            com.alibaba.ability.localization.b.a(Language.SIMPLIFIED_CHINESE, Location.cast2Enum(this.b.key));
        }
        TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "submitClick", null, null, "selectedEdition=" + this.b.key + ",selectedLang=" + this.c.key);
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f.onSetDone();
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public void a(LocaleModel.LocaleData localeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1151f12e", new Object[]{this, localeData});
            return;
        }
        this.c = localeData;
        for (LocaleModel.LocaleData localeData2 : this.e.get(this.b.key)) {
            if (localeData2.key.equals(localeData.key)) {
                localeData2.selected = true;
            } else {
                localeData2.selected = false;
            }
        }
        this.f.refresh(this.b.value, this.c.value);
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public void b(LocaleModel.LocaleData localeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85dd82f", new Object[]{this, localeData});
            return;
        }
        this.b = localeData;
        for (LocaleModel.LocaleData localeData2 : this.d) {
            if (localeData.key.equals(localeData2.key)) {
                localeData2.selected = true;
            } else {
                localeData2.selected = false;
            }
        }
        for (LocaleModel.LocaleData localeData3 : this.e.get(this.b.key)) {
            if (localeData3.isDefault) {
                this.c = localeData3;
                localeData3.selected = true;
            } else {
                localeData3.selected = false;
            }
        }
        this.f.refresh(this.b.value, this.c.value);
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public LocaleModel.LocaleData b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocaleModel.LocaleData) ipChange.ipc$dispatch("51e14353", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public LocaleModel.LocaleData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocaleModel.LocaleData) ipChange.ipc$dispatch("d42bf832", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public List<LocaleModel.LocaleData> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.editionswitcher.boarding.e
    public List<LocaleModel.LocaleData> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.e.get(this.b.key);
    }
}
