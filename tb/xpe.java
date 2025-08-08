package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.TemplateModel;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class xpe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<?>> f34454a = new HashMap();
    private final List<String> b = new ArrayList();

    static {
        kge.a(398193246);
    }

    public void a(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74a3dc9", new Object[]{this, str, iContainerDataModel});
        } else if (!j.a("enableCheckPresetDta", false)) {
        } else {
            IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
            if (base == null) {
                e.e("CacheDataValidatorUtil", str + " base == null");
                return;
            }
            List<?> sections = base.getSections();
            if (sections != null && !sections.isEmpty()) {
                this.f34454a.put(str, sections);
                return;
            }
            e.e("CacheDataValidatorUtil", str + " sections == null");
        }
    }

    public void a(String str, IContainerDataModel<?> iContainerDataModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdee5a", new Object[]{this, str, iContainerDataModel, new Integer(i)});
        } else if (!j.a("enableCheckPresetDta", false)) {
        } else {
            try {
                if (StringUtils.equals(str, ksk.NEW_FACE_PARENT.f30287a)) {
                    c(str, iContainerDataModel);
                } else {
                    b(str, iContainerDataModel);
                }
                if (this.b.size() > i) {
                    ksr.a(b.KEY_CACHE_DATA, "homepage", "1.0", (String) null, (Map<String, String>) null, str + "_cacheDataExpired", "differentUrl: " + this.b);
                    e.e("CacheDataValidatorUtil", str + " Preset data has expired.");
                }
                this.f34454a.remove(str);
                this.b.clear();
            } catch (Exception e) {
                e.e("CacheDataValidatorUtil", "出现异常： " + e);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!j.a("enableCheckPresetDta", false)) {
        } else {
            this.f34454a.clear();
            this.b.clear();
        }
    }

    private void b(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7989e8", new Object[]{this, str, iContainerDataModel});
            return;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            e.e("CacheDataValidatorUtil", str + ",Base model is null.");
            return;
        }
        List<?> sections = base.getSections();
        List<?> list = this.f34454a.get(str);
        if (sections == null || list == null) {
            e.e("CacheDataValidatorUtil", str + ",Either cold start data or cache data is null.");
            return;
        }
        int a2 = a(sections);
        if (a2 != a(list)) {
            ksr.a(b.KEY_CACHE_DATA, "homepage", "1.0", (String) null, (Map<String, String>) null, str + "_beforeSeparatorDataDiff", "分割线前的卡片数量不一样");
            return;
        }
        a(sections, list, a2);
    }

    private int a(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if ((obj instanceof SectionModel) && StringUtils.equals(((SectionModel) obj).getSectionBizCode(), "mainAndSubSeparator")) {
                return i;
            }
        }
        return -1;
    }

    private void c(String str, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a8d607", new Object[]{this, str, iContainerDataModel});
            return;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            e.e("CacheDataValidatorUtil", str + ",Base model is null.");
            return;
        }
        List<?> sections = base.getSections();
        List<?> list = this.f34454a.get(str);
        if (sections == null || list == null) {
            e.e("CacheDataValidatorUtil", str + ",Either cold start data or cache data is null.");
        } else if (list.size() != sections.size()) {
            ksr.a(b.KEY_CACHE_DATA, "homepage", "1.0", (String) null, (Map<String, String>) null, str + "_DataSizeDiff", "预置数据和线上不一致");
            e.e("CacheDataValidatorUtil", str + ",Preset data is error.");
        } else {
            a(sections, list, sections.size());
        }
    }

    private void a(List<?> list, List<?> list2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6d17f9", new Object[]{this, list, list2, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object a2 = a(i2, list);
            Object a3 = a(i2, list2);
            if ((a2 instanceof SectionModel) && (a3 instanceof SectionModel)) {
                SectionModel sectionModel = (SectionModel) a3;
                if (a(sectionModel, (SectionModel) a2)) {
                    a(sectionModel);
                }
            }
        }
    }

    private Object a(int i, List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("da207626", new Object[]{this, new Integer(i), list});
        }
        if (i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    private void a(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba04285", new Object[]{this, sectionModel});
            return;
        }
        TemplateModel mo1099getTemplate = sectionModel.mo1099getTemplate();
        if (mo1099getTemplate == null || mo1099getTemplate.getUrl() == null) {
            return;
        }
        e.e("CacheDataValidatorUtil", "当前数据不一致");
        this.b.add(mo1099getTemplate.getUrl());
    }

    private boolean a(SectionModel sectionModel, SectionModel sectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c4ea4c", new Object[]{this, sectionModel, sectionModel2})).booleanValue();
        }
        TemplateModel mo1099getTemplate = sectionModel.mo1099getTemplate();
        TemplateModel mo1099getTemplate2 = sectionModel2.mo1099getTemplate();
        if (mo1099getTemplate == null || mo1099getTemplate2 == null) {
            e.e("CacheDataValidatorUtil", "cacheTemplate == null || coldStartTemplate == null");
            return false;
        } else if (!StringUtils.equals(mo1099getTemplate.getName(), mo1099getTemplate2.getName())) {
            e.e("CacheDataValidatorUtil", "模版名不一样");
            return true;
        } else {
            String version = mo1099getTemplate.getVersion();
            String version2 = mo1099getTemplate2.getVersion();
            if (StringUtils.isEmpty(version) || StringUtils.isEmpty(version2)) {
                e.e("CacheDataValidatorUtil", "版本号为空");
                return false;
            }
            return a(version, version2);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            return Long.parseLong(str2) - Long.parseLong(str) >= ((long) j.a("needAlarmDiffTemplateSize", 20));
        } catch (Exception e) {
            e.e("CacheDataValidatorUtil", "解析模板版本号时出现异常：" + e);
            return false;
        }
    }
}
