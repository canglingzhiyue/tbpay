package com.etao.feimagesearch.history;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes3.dex */
public class HistoryResult implements Serializable, IMTOPDataObject {
    public Map<Long, AuctionItemVO> resultData;

    static {
        kge.a(-1446722265);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public HistoryResult deepClone() {
        HistoryResult historyResult = new HistoryResult();
        historyResult.resultData = new HashMap();
        Map<Long, AuctionItemVO> map = this.resultData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Long, AuctionItemVO> entry : this.resultData.entrySet()) {
                Long key = entry.getKey();
                AuctionItemVO value = entry.getValue();
                if (key != null && value != null) {
                    historyResult.resultData.put(key, value.deepClone());
                }
            }
        }
        return historyResult;
    }

    public void clear() {
        this.resultData.clear();
    }
}
