package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.taolive.room.utils.aw;
import java.util.List;

/* loaded from: classes7.dex */
public class lty extends ltp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1590819525);
    }

    public static /* synthetic */ Object ipc$super(lty ltyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lty(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.ltp
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee76f892", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        a(jSONObject2, awesomeGetContainerData, jSONObject);
        return jSONObject2;
    }

    private void a(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7675252", new Object[]{this, jSONObject, awesomeGetContainerData, jSONObject2});
            return;
        }
        jSONObject.put("hundredClickItemId", (Object) b());
        if (awesomeGetContainerData.getBase() == null) {
            return;
        }
        List<SectionModel> totalData = awesomeGetContainerData.getTotalData();
        String str3 = "";
        if (totalData.size() > 0) {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (int size = totalData.size() - 1; size >= 0 && size >= totalData.size() - 100; size--) {
                String a2 = a(totalData.get(size));
                if (!TextUtils.isEmpty(a2)) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(a2);
                    z = false;
                }
            }
            str = sb.toString();
            str2 = a(totalData);
            Integer b = b(jSONObject2);
            if (b != null) {
                while (TextUtils.isEmpty(str3)) {
                    int i2 = i + 1;
                    if (i >= 4 || b.intValue() <= 0 || b.intValue() >= totalData.size() - 1) {
                        break;
                    }
                    str3 = a(totalData.get(b.intValue()));
                    b = Integer.valueOf(b.intValue() - 1);
                    i = i2;
                }
            }
        } else {
            str = str3;
            str2 = str;
        }
        jSONObject.put("latestHundredItem", (Object) str);
        jSONObject.put("firstPagePVID", (Object) str2);
        jSONObject.put("currentExposureItemID", (Object) str3);
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? "" : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }

    private String a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        String str = null;
        if (list != null && !list.isEmpty()) {
            for (SectionModel sectionModel : list) {
                str = sectionModel.getJSONObject("args").getString(aw.PARAM_PVID);
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        return str;
    }

    private Integer b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5b7a1b8e", new Object[]{this, jSONObject}) : jSONObject.getInteger("index");
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        ICacheService iCacheService = (ICacheService) a().a(ICacheService.class);
        if (iCacheService == null) {
            ldf.d("RepeatCardBizParamsGenerator", "getHundredClickItemIds cacheService == null");
            return "";
        }
        List<String> a2 = iCacheService.getClickCache().a(100);
        if (a2 == null || a2.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(a2.get(0));
        int size = a2.size();
        for (int i = 1; i < size; i++) {
            sb.append(",");
            sb.append(a2.get(i));
        }
        return sb.toString();
    }
}
