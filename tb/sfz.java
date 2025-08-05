package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a;
import java.util.List;

/* loaded from: classes7.dex */
public class sfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1325857390);
    }

    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (!sgc.a(iContainerDataModel)) {
            ldf.d("NewDetailOnLayPagePreLoader", "preLoadNewDetailOnLayPage 未开启 NewDetail 预加载");
        } else {
            PreLoadModel c = c(iContainerDataModel);
            if (c == null) {
                ldf.d("NewDetailOnLayPagePreLoader", "preLoadNewDetailOnLayPage preLoadModel is null");
            } else {
                sgd.b(c);
            }
        }
    }

    public void b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24715b2", new Object[]{this, iContainerDataModel});
        } else if (!sgc.a(iContainerDataModel)) {
            ldf.d("NewDetailOnLayPagePreLoader", "clearDataSource 未开启 NewDetail 预加载");
        } else {
            sgd.c(new PreLoadModel());
        }
    }

    private PreLoadModel c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("40b0b575", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage containerDataService is null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage baseData is null");
            return null;
        } else if (base.mo1280getPageParams() == null || base.mo1280getPageParams().getPageNum() == 0) {
            ldf.d("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage 分页数据不满足预请求条件");
            return null;
        } else {
            List<?> sections = base.getSections();
            if (ObjectUtils.a(sections)) {
                ldf.d("NewDetailOnLayPagePreLoader", "preparePreLoadModelOnLayPage sectionModels isEmpty");
                return null;
            }
            return a.a(sections, base.mo1280getPageParams().getPageNum(), "newDetail", "InfoFlow");
        }
    }
}
