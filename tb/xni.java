package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.xnk;

/* loaded from: classes7.dex */
public class xni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f34400a;

    static {
        kge.a(-1700958361);
    }

    public xni(ljs ljsVar) {
        this.f34400a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    public Map<String, String> a(xnj xnjVar, int i, List<xnk.a> list, String str, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49f64eb0", new Object[]{this, xnjVar, new Integer(i), list, str, new Integer(i2), new Long(j)});
        }
        if (this.f34400a == null || xnjVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap(8);
        BaseSectionModel<?> findItemDataByPosition = this.f34400a.findItemDataByPosition(i);
        if (findItemDataByPosition == null) {
            return null;
        }
        a(hashMap, str);
        a(hashMap, i2);
        a(hashMap, xnjVar.b(), i);
        a(hashMap, findItemDataByPosition, list, j);
        b(hashMap, xnjVar.g());
        return hashMap;
    }

    private void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
        } else if (str == null) {
        } else {
            map.put("clickRefreshBeginCode", str);
        }
    }

    private void a(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a486", new Object[]{this, map, new Integer(i)});
        } else {
            map.put("currentIdx", String.valueOf(i));
        }
    }

    private void a(Map<String, String> map, int i, int i2) {
        int itemCount;
        int i3;
        JSONObject ext;
        String string;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2145f3d", new Object[]{this, map, new Integer(i), new Integer(i2)});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f34400a;
        if (iMainFeedsViewService == null || (itemCount = iMainFeedsViewService.getItemCount()) <= (i3 = i2 - 2) || itemCount <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (i3 = i2 - 2; i3 < itemCount; i3++) {
            BaseSectionModel<?> findItemDataByPosition = this.f34400a.findItemDataByPosition(i3);
            if (findItemDataByPosition != null && !findItemDataByPosition.getBooleanValue("isTracked") && (i4 = i4 + 1) > i && (ext = findItemDataByPosition.getExt()) != null && (string = ext.getString(xnk.a.X_EXPOSED_ID)) != null) {
                if (sb.length() == 0) {
                    sb.append(string);
                } else {
                    sb.append("_");
                    sb.append(string);
                }
            }
        }
        if (sb.length() <= 0) {
            return;
        }
        map.put("unExposedXExposedIds", sb.toString());
    }

    private void a(Map<String, String> map, BaseSectionModel<?> baseSectionModel, List<xnk.a> list, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a585ae", new Object[]{this, map, baseSectionModel, list, new Long(j)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            return;
        }
        String string = ext.getString(xnk.a.X_EXPOSED_ID);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(string)) {
            sb.append(string);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            jSONObject.put(JarvisConstant.KEY_JARVIS_TRIGGER, (Object) sb.toString());
        }
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                xnk.a aVar = list.get(i);
                if (aVar.b()) {
                    if (sb2.length() == 0) {
                        sb2.append(aVar.a());
                    } else {
                        sb2.append("_");
                        sb2.append(aVar.a());
                    }
                }
            }
            jSONObject.put("3min_clks", (Object) sb2.toString());
        }
        String a2 = a(xnn.a(j, "home.request.ClickAiRefresh.aiRefreshIpvItemId", "ClickAiRefreshBizParamCreator"));
        if (!TextUtils.isEmpty(a2)) {
            jSONObject.put("3min_ipvs", (Object) a2);
        }
        map.put("clickRefreshFeatures", jSONObject.toString());
    }

    private void b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39066b46", new Object[]{this, map, str});
        } else {
            map.put("clickRefreshTrigger", str);
        }
    }

    private String a(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.contains("tb_bc_all_only_item_clk_vstr")) {
            ldf.d("ClickAiRefreshBizParamCreator", "data is empty or have no ipv features");
            return null;
        }
        JSONArray jSONArray2 = JSONObject.parseObject(str).getJSONArray("data");
        if (jSONArray2 == null || jSONArray2.size() == 0 || (jSONArray = jSONArray2.getJSONArray(0)) == null || jSONArray.size() < 3) {
            return null;
        }
        String string = jSONArray.getString(2);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split("#");
        if (split.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            String[] split2 = str2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            if (split2.length >= 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                try {
                    xnk.a aVar = new xnk.a(split2[1], Long.parseLong(split2[0]));
                    if (aVar.b()) {
                        if (sb.length() == 0) {
                            sb.append(aVar.a());
                        } else {
                            sb.append(",");
                            sb.append(aVar.a());
                        }
                    }
                } catch (NumberFormatException unused) {
                    ldf.d("Error parsing itemId", new String[0]);
                    return null;
                }
            }
        }
        return sb.toString();
    }
}
