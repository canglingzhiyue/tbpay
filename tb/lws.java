package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class lws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30953a = "sub_tab";
    private final int b = 0;
    private lwz c;

    static {
        kge.a(-848953333);
    }

    public lws(lwz lwzVar) {
        this.c = lwzVar;
    }

    public void a(AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab53f9d", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData.getContainers() != null && !awesomeGetData.getContainers().isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry<String, AwesomeGetContainerData> entry : awesomeGetData.getContainers().entrySet()) {
                a(entry.getKey(), entry.getValue(), hashMap, arrayList);
            }
            awesomeGetData.getContainers().putAll(hashMap);
            for (String str : arrayList) {
                awesomeGetData.getContainers().remove(str);
            }
        }
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, Map<String, AwesomeGetContainerData> map, List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca6b4ee", new Object[]{this, str, awesomeGetContainerData, map, list});
        } else if (awesomeGetContainerData == null || awesomeGetContainerData.getBase() == null || awesomeGetContainerData.getBase().getSections() == null) {
            lxl.c("TabProtocolProcess", "containerTabProcess containerData.base == null");
        } else {
            boolean z2 = awesomeGetContainerData.getBase() != null && awesomeGetContainerData.getBase().isDataChange();
            boolean z3 = awesomeGetContainerData.getDelta() != null && awesomeGetContainerData.getDelta().isDataChange();
            AwesomeGetContainerData a2 = this.c.b().a(str);
            if (!z2) {
                if (!z3) {
                    return;
                }
                lxl.c("TabProtocolProcess", "差量不虚拟化处理 isDeltaRefresh isContainsTab" + a2.isContainsTab());
                return;
            }
            int pageNum = awesomeGetContainerData.getPageNum();
            if (pageNum == 0) {
                lxl.c("TabProtocolProcess", "containerTabProcess containerData.base == null");
                a2.setContainsTab(false);
                long uptimeMillis = SystemClock.uptimeMillis();
                a(str, awesomeGetContainerData, map);
                lxl.c("TabProtocolProcess", "baseDataProcess use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
            } else if (a2.isContainsTab()) {
                lxl.c("TabProtocolProcess", "非第 0 页，前面已经存在tab，不虚拟化处理");
            } else {
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("非第 0 页，不存在tab， pageNum : ");
                sb.append(pageNum);
                sb.append(", 是否虚拟化处理：");
                if (pageNum > 0) {
                    z = false;
                }
                sb.append(z);
                strArr[0] = sb.toString();
                lxl.c("TabProtocolProcess", strArr);
                if (pageNum > 0) {
                    return;
                }
                a(str, awesomeGetContainerData, map);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, Map<String, AwesomeGetContainerData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b79c1fd", new Object[]{this, str, awesomeGetContainerData, map});
            return;
        }
        List<SectionModel> sections = awesomeGetContainerData.getBase().getSections();
        long uptimeMillis = SystemClock.uptimeMillis();
        int a2 = a(sections);
        lxl.c("TabProtocolProcess", "findTabCard use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        if (a2 == -1) {
            return;
        }
        String a3 = a(str, sections.get(a2));
        long uptimeMillis2 = SystemClock.uptimeMillis();
        AwesomeGetContainerData m1102clone = awesomeGetContainerData.m1102clone();
        awesomeGetContainerData.getBase().mo1280getPageParams().setIsLastPage("y");
        lxl.c("TabProtocolProcess", "containerData.clone() use time : " + (SystemClock.uptimeMillis() - uptimeMillis2));
        List<SectionModel> subList = sections.subList(0, a2 + 1);
        awesomeGetContainerData.getBase().setSections(subList);
        ?? base = m1102clone.getBase();
        base.getSections().remove(subList);
        base.setRemindSection(null);
        base.setFloatLayerSection(null);
        map.put(a3, m1102clone);
        this.c.b().a(str).setContainsTab(true);
    }

    private int a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a(list.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    private String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{this, str, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            lxl.c("TabProtocolProcess", "服务端数据异常，非常严重 item = null ！！！");
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(0));
            if (jSONObject3 == null) {
                lxl.c("TabProtocolProcess", "服务端数据异常，非常严重 item0 = null ！！！");
            } else {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("content");
                if (jSONObject4 == null) {
                    lxl.c("TabProtocolProcess", "服务端数据异常，非常严重 content = null ！！！");
                } else {
                    String string = jSONObject4.getString(e.KEY_TAB_ID);
                    if (!StringUtils.isEmpty(string)) {
                        return string;
                    }
                    lxl.c("TabProtocolProcess", "服务端数据异常，非常严重 tabId = null ！！！");
                }
            }
        }
        return a(str);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return str + "_001";
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : StringUtils.equals(jSONObject.getString("sectionBizCode"), "sub_tab");
    }
}
