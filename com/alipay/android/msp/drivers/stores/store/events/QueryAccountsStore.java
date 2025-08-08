package com.alipay.android.msp.drivers.stores.store.events;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class QueryAccountsStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public QueryAccountsStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.c.getCurrentPresenter().mo545getIView() == null) {
            return null;
        }
        ListIterator<Object> listIterator = mspEvent.getActionParamsJson().getJSONArray("uids").listIterator();
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasNext()) {
            arrayList.add((String) listIterator.next());
        }
        String queryExistingAccounts = PhoneCashierMspEngine.getMspWallet().queryExistingAccounts(arrayList);
        return StringUtils.isEmpty(queryExistingAccounts) ? "{}" : queryExistingAccounts;
    }
}
