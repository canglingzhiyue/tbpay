package com.taobao.homepage.pop.viewmodel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.d;
import com.taobao.homepage.pop.utils.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kyu;

/* loaded from: classes.dex */
public class PopDataViewModel implements Serializable, IMTOPDataObject {
    private static final String TAG = "PopDataViewModel ";
    private Map<String, IPopData> businessId2Section = new ConcurrentHashMap(16);
    private Map<String, IPopData> oldRemovedData = new ConcurrentHashMap(16);

    public Map<String, IPopData> getAllPopData() {
        return this.businessId2Section;
    }

    public IPopData getPopDataByBusinessId(String str) {
        return this.businessId2Section.get(str);
    }

    public int getPopSize() {
        return this.businessId2Section.size();
    }

    public boolean updateViewModel(kyu kyuVar, List<JSONObject> list, boolean z, String str) {
        this.oldRemovedData = this.businessId2Section;
        this.businessId2Section = new ConcurrentHashMap(16);
        boolean insertListToMapWithRequestType = insertListToMapWithRequestType(kyuVar, list, str, z);
        processKeepData(z, str);
        return insertListToMapWithRequestType || !this.oldRemovedData.isEmpty();
    }

    public boolean insertCustomPopData(kyu kyuVar, IPopData iPopData) {
        if (iPopData == null || !iPopData.valid()) {
            return false;
        }
        this.businessId2Section.put(iPopData.getBusinessID(), iPopData);
        return true;
    }

    private boolean insertListToMapWithRequestType(kyu kyuVar, List<JSONObject> list, String str, boolean z) {
        if (list == null || list.isEmpty()) {
            c.a(TAG, "no pop Data from server, requestType=" + str);
            return false;
        }
        boolean z2 = false;
        for (JSONObject jSONObject : list) {
            IPopData<PopSectionModel> a2 = e.a(jSONObject);
            if (a2 != null && (z || a2.isDeltaRefreshWhiteList(str))) {
                boolean processForceUpdateData = processForceUpdateData(a2);
                boolean z3 = true;
                if (processForceUpdateData) {
                    IPopData iPopData = this.businessId2Section.get(a2.getBusinessID());
                    if (iPopData == null || !iPopData.isAllowShow()) {
                        z3 = false;
                    }
                } else {
                    boolean processNewData = processNewData(kyuVar, a2);
                    if (!StringUtils.equals("coldStart", str) && str != null) {
                        z3 = false;
                    }
                    if (z3 && !a2.isAllowShow()) {
                        a2.resetShowCount();
                        c.b(TAG, "reset popData, businessId=" + a2.getBusinessID());
                    }
                    z3 = processNewData;
                }
                c.b(TAG, "updatePopData, businessId=" + a2.getBusinessID() + ", userOld=" + processForceUpdateData + ", isUpdate=" + z3);
                z2 = z3;
            }
        }
        return z2;
    }

    private void processKeepData(boolean z, String str) {
        if (z || this.oldRemovedData.isEmpty()) {
            return;
        }
        Iterator<IPopData> it = this.oldRemovedData.values().iterator();
        while (it.hasNext()) {
            IPopData next = it.next();
            if (!next.isDeltaRefreshWhiteList(str)) {
                it.remove();
                this.businessId2Section.put(next.getBusinessID(), next);
                c.a(TAG, "keep old pop, businessId=" + next.getBusinessID());
            }
        }
    }

    private boolean processNewData(kyu kyuVar, IPopData iPopData) {
        BasePopSectionModel mo1070fetchPopSection;
        d.a("MtopResponseHasPopData", iPopData);
        if (iPopData.valid() && (mo1070fetchPopSection = iPopData.mo1070fetchPopSection()) != null) {
            String businessID = iPopData.getBusinessID();
            mo1070fetchPopSection.getExt().put("businessId", (Object) businessID);
            d.a("MtopPopDataValid", iPopData);
            this.businessId2Section.put(businessID, iPopData);
            return true;
        }
        return false;
    }

    private boolean processForceUpdateData(IPopData iPopData) {
        String businessID = iPopData.getBusinessID();
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null || !popConfig.isForceUpdate()) {
            IPopData remove = this.oldRemovedData.remove(businessID);
            if (remove == null) {
                return true;
            }
            this.businessId2Section.put(businessID, remove);
            return true;
        }
        return false;
    }

    public void destroy() {
        this.businessId2Section.clear();
    }
}
