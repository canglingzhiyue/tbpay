package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.util.List;

/* loaded from: classes.dex */
public class liq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30665a = -1;
    private BaseSectionModel<?> b;

    static {
        kge.a(-1110315161);
    }

    public void a(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
            return;
        }
        String b = b(iContainerDataModel);
        if (StringUtils.isEmpty(b)) {
            this.f30665a = -1;
        } else {
            this.f30665a = a(this.f30665a, b, iContainerDataModel);
        }
        this.b = a(this.f30665a, iContainerDataModel);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f30665a;
    }

    public BaseSectionModel<?> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("19513855", new Object[]{this}) : this.b;
    }

    private BaseSectionModel<?> a(int i, IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        List<BaseSectionModel<?>> totalData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("5fcdbe1e", new Object[]{this, new Integer(i), iContainerDataModel});
        }
        if (i < 0 || iContainerDataModel == null || (totalData = iContainerDataModel.getTotalData()) == null || i >= totalData.size()) {
            return null;
        }
        return totalData.get(i);
    }

    private String b(IContainerDataModel<?> iContainerDataModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ceb92e", new Object[]{this, iContainerDataModel});
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base != null && (ext = base.getExt()) != null) {
            return ext.getString("stickySectionBizCode");
        }
        return null;
    }

    private int a(int i, String str, IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afdcbf69", new Object[]{this, new Integer(i), str, iContainerDataModel})).intValue() : (c(iContainerDataModel) || i == -1) ? a(str, iContainerDataModel.getTotalData()) : i;
    }

    private boolean c(IContainerDataModel<?> iContainerDataModel) {
        IPageDataModel mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e03a7b95", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        return base == null || (mo1280getPageParams = base.mo1280getPageParams()) == null || mo1280getPageParams.getPageNum() == 0;
    }

    private int a(String str, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{this, str, list})).intValue();
        }
        if (StringUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(list.get(i).getSectionBizCode(), str)) {
                return i;
            }
        }
        return -1;
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!StringUtils.equals(str, str2)) {
            if (!StringUtils.equals(str + "_delta", str2)) {
                if (!StringUtils.equals(str, str2 + "_delta")) {
                    return false;
                }
            }
        }
        return true;
    }
}
