package com.alipay.mobile.verifyidentity.module.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class DataHelperManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile DataHelperManager f5938a;
    private BroadcastReceiver b;
    private ConcurrentHashMap<String, DataHelper> c = new ConcurrentHashMap<>();

    public static /* synthetic */ ConcurrentHashMap access$000(DataHelperManager dataHelperManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("78929332", new Object[]{dataHelperManager}) : dataHelperManager.c;
    }

    public static /* synthetic */ BroadcastReceiver access$100(DataHelperManager dataHelperManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("f3b02e4a", new Object[]{dataHelperManager}) : dataHelperManager.b;
    }

    private DataHelperManager() {
    }

    public static DataHelperManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelperManager) ipChange.ipc$dispatch("564b2acd", new Object[0]);
        }
        if (f5938a == null) {
            synchronized (DataHelperManager.class) {
                if (f5938a == null) {
                    f5938a = new DataHelperManager();
                }
            }
        }
        return f5938a;
    }

    public void putDataHelper(String str, DataHelper dataHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe1abd0", new Object[]{this, str, dataHelper});
            return;
        }
        if (this.c == null) {
            this.c = new ConcurrentHashMap<>();
        }
        this.c.put(str, dataHelper);
        final LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext());
        this.b = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.utils.DataHelperManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                VerifyLogCat.i("DataHelperManager", "receive pwd exit");
                if (DataHelperManager.access$000(DataHelperManager.this) != null) {
                    DataHelperManager.access$000(DataHelperManager.this).clear();
                }
                localBroadcastManager.unregisterReceiver(DataHelperManager.access$100(DataHelperManager.this));
            }
        };
        localBroadcastManager.registerReceiver(this.b, new IntentFilter("NEW_PWD_EXIT"));
    }

    public DataHelper getHelper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelper) ipChange.ipc$dispatch("d0b6a8d9", new Object[]{this, str});
        }
        if (this.c == null) {
            this.c = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public void removeHelper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fe1263", new Object[]{this, str});
        } else if (this.c == null || TextUtils.isEmpty(str)) {
        } else {
            this.c.remove(str);
        }
    }
}
