package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class lwe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwz f30937a;

    static {
        kge.a(1485087139);
    }

    private String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)}) : z ? "baseRefresh" : "deltaRefresh";
    }

    public void a(lwz lwzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a5b429", new Object[]{this, lwzVar});
        } else {
            this.f30937a = lwzVar;
        }
    }

    public List<SectionModel> a(String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a2840129", new Object[]{this, str, awesomeGetContainerData, awesomeGetContainerData2}) : new lwg().a(this.f30937a, str, awesomeGetContainerData, awesomeGetContainerData2);
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e60294", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2});
        } else if (awesomeGetContainerData != null && awesomeGetContainerData2 != null) {
            if (awesomeGetContainerData2.getBase() == null || !awesomeGetContainerData2.getBase().isDataChange() || awesomeGetContainerData2.getPageNum() != 0) {
                z = false;
            }
            String a2 = a(z);
            List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
            List<SectionModel> deltaData2 = awesomeGetContainerData2.getDeltaData();
            ArrayList arrayList = new ArrayList();
            if (TextUtils.equals(a2, "deltaRefresh")) {
                arrayList.add("baseRefresh");
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(a2, "baseRefresh")) {
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(a2, "pageExit")) {
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(a2, "appExit")) {
                arrayList.add("never");
            } else {
                TextUtils.equals(a2, "never");
            }
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty() && deltaData != null) {
                for (SectionModel sectionModel : deltaData) {
                    if (arrayList.contains(sectionModel.getString("invalidType"))) {
                        arrayList2.add(sectionModel);
                    }
                }
            }
            if (deltaData2 != null) {
                for (int i = 0; i < deltaData2.size(); i++) {
                    SectionModel sectionModel2 = deltaData2.get(i);
                    if (Boolean.parseBoolean(sectionModel2.getString("keep"))) {
                        int a3 = a(sectionModel2, deltaData);
                        if (a3 >= 0) {
                            SectionModel sectionModel3 = deltaData.get(a3);
                            if (a(sectionModel3, arrayList2) < 0) {
                                arrayList2.add(sectionModel3);
                            }
                        }
                    } else {
                        int a4 = a(sectionModel2, arrayList2);
                        if (a4 >= 0) {
                            arrayList2.remove(a4);
                        }
                        arrayList2.add(sectionModel2);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                awesomeGetContainerData2.setDelta(null);
                return;
            }
            if (awesomeGetContainerData2.getDelta() == null) {
                awesomeGetContainerData2.setDelta(awesomeGetContainerData.getDelta().m1103clone());
            }
            awesomeGetContainerData2.getDelta().setSections(arrayList2);
        }
    }

    public int a(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a0b2569", new Object[]{this, sectionModel, list})).intValue();
        }
        if (sectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(sectionModel);
        return indexOf >= 0 ? indexOf : a(sectionModel.getString("sectionBizCode"), list);
    }

    public static int a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{str, list})).intValue() : lwg.a(str, list);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public AwesomeGetContainerInnerData a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("1530b4de", new Object[]{this, awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getDeltaData() == null) {
            return null;
        }
        AwesomeGetContainerInnerData m1103clone = awesomeGetContainerData.getDelta().m1103clone();
        for (SectionModel sectionModel : awesomeGetContainerData.getDeltaData()) {
            if (!TextUtils.equals(sectionModel.getString("invalidType"), "never")) {
                m1103clone.getSections().remove(sectionModel);
            }
        }
        return m1103clone;
    }
}
